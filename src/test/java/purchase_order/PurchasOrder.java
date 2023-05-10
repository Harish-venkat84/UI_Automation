package purchase_order;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import properties.Configuration_Reader;
import properties.Properties_Writer;

public class PurchasOrder {

	static String payloadFile = System.getProperty("user.dir") + "/JSON_File/payload.json";
	static String responseFile = System.getProperty("user.dir") + "/JSON_File/ResponsePayload.json";

	static Response response;
	static JSONObject json;

	static ObjectMapper mapper = new ObjectMapper();

	public static JSONObject jsonReader(String filePath) throws StreamReadException, DatabindException, IOException {

		@SuppressWarnings("unchecked")
		Map<String, Object> readValue = mapper.readValue(Paths.get(filePath).toFile(), Map.class);

		json = new JSONObject(readValue);

		return json;

	}

	public static void jsonPayloadWriter(Object object, String filePath) throws IOException {

		mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), object);
	}

	public static void jsonResponseBodyWriter(Response response, String filePath) throws IOException {

		FileWriter file = new FileWriter(filePath);
		file.write(response.getBody().asString());
		file.close();

	}

	@Test
	@SuppressWarnings("unchecked")
	public static void payload() throws StreamReadException, DatabindException, IOException, ConfigurationException {

		DateFormat dateformat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SS");
		Calendar date = Calendar.getInstance();
		date.add(Calendar.DATE, -1);

		Calendar month = Calendar.getInstance();
		month.add(Calendar.MONTH, 1);

		JSONObject jsonReader = jsonReader(payloadFile);
		jsonReader.put("supplierId", Configuration_Reader.getCR().getFRM().getSupplierId());
		jsonReader.put("poDate", dateformat.format(date.getTime()));
		jsonReader.put("expDate", dateformat.format(month.getTime()));

		RestAssured.baseURI = Configuration_Reader.getCR().getFRM().getBaseUrl();
		RequestSpecification httprequest = RestAssured.given().auth().basic("admin", "Rwos@2017");
		httprequest.header("Content-Type", "application/json");
		httprequest.body(jsonReader.toJSONString());
		response = httprequest
				.post("/purchase/orders?cmd=create&branchCode=" + Configuration_Reader.getCR().getFRM().getDC()
						+ "&type=long&ncOrderRef=" + Properties_Writer.getProperties_Writer().changingOrderRefNumber());

		Properties_Writer.getProperties_Writer()
				.setPurchesOrderID(response.jsonPath().getString("[0].returnData.orderTxnId"));

		jsonPayloadWriter(jsonReader, payloadFile);

		jsonResponseBodyWriter(response, responseFile);
	}

}

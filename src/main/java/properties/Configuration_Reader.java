package properties;

import java.io.IOException;

public class Configuration_Reader {


	private Configuration_Reader() {
	}

	public FileReaderManager getFRM() throws IOException {

		FileReaderManager frm = new FileReaderManager();
		return frm;
	}

	public static Configuration_Reader getCR() {

		Configuration_Reader cf = new Configuration_Reader();
		return cf;
	}

}

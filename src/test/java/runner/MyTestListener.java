package runner;

import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.HookTestStep;
import io.cucumber.plugin.event.HookType;
import io.cucumber.plugin.event.PickleStepTestStep;
import io.cucumber.plugin.event.Result;
import io.cucumber.plugin.event.Status;
import io.cucumber.plugin.event.TestCase;
import io.cucumber.plugin.event.TestCaseFinished;
import io.cucumber.plugin.event.TestStep;

public class MyTestListener implements ConcurrentEventListener{

	@Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestCaseFinished.class, this::handleTestCaseFinished);
    }

    @SuppressWarnings({ "deprecation", "unused" })
	private void handleTestCaseFinished(TestCaseFinished event) {
        TestCase testCase = event.getTestCase();
        Result result = event.getResult();
        Status status = result.getStatus();
        Throwable error = result.getError();
        String scenarioName = testCase.getName();

        TestStep testStep = testCase.getTestSteps().get(0);
        if (testStep instanceof PickleStepTestStep) {
            PickleStepTestStep pickleStepTestStep  = (PickleStepTestStep) testStep;
            String text = pickleStepTestStep.getStep().getText();
            
            System.out.println("new add ==>" +text);
        }

        if (testStep instanceof HookTestStep) {
            HookTestStep hookTestStep = (HookTestStep) testStep;
            HookType hookType = hookTestStep.getHookType();
        }
        
        String message = error.getMessage();

        String id = "" + testCase.getUri() + testCase.getLine();
        System.out.println("Testcase " + scenarioName + " - " + status.name() +"-"+message);
    }
	
}

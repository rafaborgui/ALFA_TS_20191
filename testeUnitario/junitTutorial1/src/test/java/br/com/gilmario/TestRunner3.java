package br.com.gilmario;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


/**
 * Created by gilmario on 16/02/17.
 */
public class TestRunner3 {

    public static void main(String[] args){
        Result result = JUnitCore.runClasses(TestJunit3.class);

        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}

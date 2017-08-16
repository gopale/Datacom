package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.mule.tck.junit4.rule.DynamicPort;
import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;


public class HelloMavenTest extends FunctionalTestCase {
	
	@Rule
	public DynamicPort dynamicPort = new DynamicPort("http.port");

    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
    	System.out.print("\n\n=======>Dynamic port used in JUnit Test case#1: " + dynamicPort.getNumber() + "\n\n");
        runFlowAndExpect("mavenFlow", "Hello Maven");
    }
    
    @Override
    protected String[] getConfigFiles() {
        String[] files = {"mavensetup.xml", "global.xml"};
        
        return files;
    	//return "mavensetup.xml";
    }

}

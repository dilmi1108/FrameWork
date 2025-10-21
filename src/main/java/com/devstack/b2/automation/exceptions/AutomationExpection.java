package com.devstack.b2.automation.exceptions;

public class AutomationExpection extends RuntimeException
{
	public AutomationExpection(String message)
	{
		super(message);
	}
    public AutomationExpection(String message, Throwable cause){
        super(message,cause);
    }
}

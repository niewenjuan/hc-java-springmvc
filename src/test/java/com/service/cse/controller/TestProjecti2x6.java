package com.service.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjecti2x6 {

        Projecti2x6Delegate projecti2x6Delegate = new Projecti2x6Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projecti2x6Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject7w44 {

        Project7w44Delegate project7w44Delegate = new Project7w44Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project7w44Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
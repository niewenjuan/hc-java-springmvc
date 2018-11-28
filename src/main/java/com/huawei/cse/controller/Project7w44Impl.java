package com.huawei.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-11-28T08:11:58.774Z")

@RestSchema(schemaId = "project7w44")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Project7w44Impl {

    @Autowired
    private Project7w44Delegate userProject7w44Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProject7w44Delegate.helloworld(name);
    }

}

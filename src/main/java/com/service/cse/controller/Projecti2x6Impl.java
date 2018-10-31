package com.service.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;  #导入#
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-10-11T03:11:20.813Z")

@RestSchema(schemaId = "projecti2x6")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Projecti2x6Impl {

    @Autowired
    private Projecti2x6Delegate userProjecti2x6Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjecti2x6Delegate.helloworld(name);
    }

}

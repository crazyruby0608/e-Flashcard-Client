/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ws.rs.GET;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.Path;

/**
 *
 * @author Welcome
 */
@Path("api1")
public class api1 {
    @GET
    @Path("test1")
    public String alo123(){
        System.out.println("123123");
        return "asdasd";
    }
}

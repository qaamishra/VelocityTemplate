package com.qa.amishra.helloworld;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;

public class VelocityHelloWorld {

    public static void main(String[] args) {

        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.init();

        Template t = velocityEngine.getTemplate(".\\src\\main\\resources\\helloworld.vm");

        VelocityContext context = new VelocityContext();
        context.put("name", "World");//$name is the key which is present in the "helloworld.vm" file
        context.put("signature", "The Velocity Team");//$signature is the key which is present in the "helloworld.vm" file

        StringWriter writer = new StringWriter();
        t.merge(context, writer);

        System.out.println(writer.toString());

    }

}

package com.qa.amishra.directives;

import com.qa.amishra.commonengine.VelocityCommon;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;

import java.io.StringWriter;

public class Directives {

    public static void main(String[] args) {

        VelocityCommon velocityCommon = new VelocityCommon();

        //Get Template and Context
        Template template = velocityCommon.getVelocityTemplate(".\\src\\main\\resources\\Directives.vm");
        VelocityContext context = velocityCommon.getContext();

        context.put("value", 8);

        //Merge data
        StringWriter writer = new StringWriter();
        template.merge(context, writer);

        //Print data
        System.out.println(writer.toString());
    }
}
package com.qa.amishra.javaobjects;

import com.qa.amishra.commonengine.VelocityCommon;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;

import java.io.StringWriter;

public class JavaObjectTest {

    public String profession = "QA";

    public String getProfession() {
        return profession;
    }

    public String getTheName() {
        return "Ashutosh Mishra";
    }

    public static void main(String[] args) {

        VelocityCommon velocityCommon = new VelocityCommon();

        //Get Template and Context
        Template template = velocityCommon.getVelocityTemplate(".\\src\\main\\resources\\JavaObject.vm");
        VelocityContext context = velocityCommon.getContext();

        context.put("JavaObjectTest", new JavaObjectTest());

        //Merge data
        StringWriter writer = new StringWriter();
        template.merge(context, writer);

        //Print data
        System.out.println(writer.toString());
    }

}

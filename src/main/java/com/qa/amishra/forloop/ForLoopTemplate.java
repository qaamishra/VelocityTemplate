package com.qa.amishra.forloop;

import com.qa.amishra.commonengine.VelocityCommon;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ForLoopTemplate {

    public static void main(String[] args) {

        VelocityCommon velocityCommon=new VelocityCommon();

       //Get Template and Context
        Template template=velocityCommon.getVelocityTemplate(".\\src\\main\\resources\\ForLoop.vm");
        VelocityContext context = velocityCommon.getContext();

        //Create data
        ArrayList<Map> arrayList=createData();

        //In velocity template Fruit Name ==> $fruit.name ||   Price ==> $fruit.price //name and price are the key in the for loop

        //Add Data
        addData(context,arrayList);

        //Merge data
        StringWriter writer = new StringWriter();
        template.merge(context, writer);

        //Print data
        System.out.println(writer.toString());
    }


    private static ArrayList<Map> createData() {
        //Data creation
        ArrayList<Map> arrayList = new ArrayList();
        Map<String, String> nameAndPrice = new HashMap<String, String>();

        //Fruit#1
        nameAndPrice.put("name", "Mangoes");
        nameAndPrice.put("price", "100");
        arrayList.add(nameAndPrice);
        //Fruit#2
        nameAndPrice = new HashMap<String, String>();
        nameAndPrice.put("name", "Apple");
        nameAndPrice.put("price", "120");
        arrayList.add(nameAndPrice);
        //Fruit#3
        nameAndPrice = new HashMap<String, String>();
        nameAndPrice.put("name", "Banana");
        nameAndPrice.put("price", "40");
        arrayList.add(nameAndPrice);

        return arrayList;

    }
    private static void addData(VelocityContext context,ArrayList arrayList) {
        context.put("CustomerName", "Ashutosh Mishra");
        context.put("fruitList", arrayList);
        context.put("email", "Velocityfruitshop@yopmail.com");
    }

}

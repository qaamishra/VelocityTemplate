package com.qa.amishra.commonengine;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class VelocityCommon {

    /**
     * Engine
     * @return VelocityEngine
     */
    public VelocityEngine getVelocityEngine(){

        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.init();

        return velocityEngine;

    }

    /**
     * Template
     * @param VmPath : Provide the path of the VM file
     * @return Template
     */
    public Template getVelocityTemplate(String VmPath){


        return getVelocityEngine().getTemplate(VmPath);


    }

    /**
     * VelocityContext
     * @return VelocityContext
     */
    public VelocityContext getContext(){

        return new VelocityContext();
    }
}

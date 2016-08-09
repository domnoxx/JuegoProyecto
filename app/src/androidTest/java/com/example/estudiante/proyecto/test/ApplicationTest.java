package com.example.estudiante.proyecto.test;

import android.app.Application;
import android.content.Context;
import android.location.LocationManager;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.annotation.SmallTest;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    @SmallTest
    public void text_probar_que_1_es_igual_1(){
        int x=1;
        assertEquals(1,x);

    }
    @SmallTest
    public void test_revisar_wifi(){
        Context ctx=this.getContext();
        LocationManager locationManager= (LocationManager) ctx.getSystemService(Context.LOCATION_SERVICE);

    }
}
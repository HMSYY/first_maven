package com.industry;

import com.industry.handle.MyAspect;

public class MyHandler {

    public String doFirst() throws Throwable {
        MyAspect aspect = new MyAspect();
        String myres = (String) aspect.myAround(null);
        return myres;
    }
}

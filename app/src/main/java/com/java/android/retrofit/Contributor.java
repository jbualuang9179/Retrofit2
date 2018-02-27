package com.java.android.retrofit;

/**
 * Created by cf300539 on 27/02/2018.
 */

//--- model class ---//
public class Contributor {

    private String login;
    private String html_url;

    private int contributions;

    public String toString(){
        return login + "(" + contributions + ")";
    }
}

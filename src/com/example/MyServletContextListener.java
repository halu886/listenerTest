package com.example;

import javax.servlet.*;

/**
 * MyServletContextListener
 */
public class MyServletContextListener {

    public void contextInitialized(ServletContextEvent event){
        ServletContext sc = event.getServletContext();
        String dogBreed = sc.getInitParameter("breed");
        Dog d = new Dog(dogBreed);
        sc.setAttribute("dog",d);
    }
    

    public void contextsDestroyed(ServletContextEvent event){

    }
}
package ch10;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class Loginimpl
 *
 */
//@WebListener
public class Loginimpli implements HttpSessionListener {
	String uid=null, uname=null;
	static int total_user = 0;
    public Loginimpli() {
    	System.out.println("Loginimpl 생성자");
    }

    public void sessionCreated(HttpSessionEvent se)  { 
    	++total_user;
    	System.out.println("세션 생성: " + total_user);
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
    	--total_user;
    	System.out.println("세션 소멸: " + total_user);
    }
	
}

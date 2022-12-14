package ch10;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class LoginListener
 *
 */
@WebListener
public class LoginListener implements HttpSessionAttributeListener {
	static int total_user = 0;
	
    public LoginListener() {
        // TODO Auto-generated constructor stub
    }

    public void attributeAdded(HttpSessionBindingEvent se)  { 
    	total_user++;
    	if (total_user % 2 ==0)
    	System.out.println("세션 등록: " + Math.ceil(total_user/ 2.));
    }

    public void attributeRemoved(HttpSessionBindingEvent se)  { 
    	total_user--;
    	System.out.println("세션 삭제: " + Math.floor(total_user/ 2.));

    }

    public void attributeReplaced(HttpSessionBindingEvent se)  { 
    	System.out.println("attributeReplaced()");
    }
	
}

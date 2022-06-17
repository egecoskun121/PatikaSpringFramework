package com.epitaph121.patikaspringframework.aop.intercepter;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Intercepter
public class InterceptorJob {

    @AroundInvoke public Object logged(InvocationContext context){
        System.out.println("First state:"+context.getMethod().getName());


        // is User logged in?
        boolean isLogin=true;

        // If not intercepted,continue
        Object isContinue=null;

        if(isLogin){
            // First login
            System.out.println("!!! First Login!!");
            return null;
        }else{
            try{
                isContinue=context.proceed(); // Continue to Intercept
                System.out.println("Last state"+isContinue);
            }catch(Exception e){
                e.printStackTrace();

            }
            return isContinue;
        }

    }
}

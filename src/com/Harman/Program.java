package com.Harman;

import java.util.Scanner;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
    String word();
}

public class Program {
    @MyAnnotation(word="Enter Details:")
    @Deprecated
    public void sayHello(){
        System.out.println("hello Welcome to annotation");
    }

}

class Annotation{
    public static void main(String args[])throws Exception{
        Program obj=new Program();
        Method m=obj.getClass().getMethod("sayHello");
        MyAnnotation manno=m.getAnnotation(MyAnnotation.class);
        Scanner sc=new Scanner(System.in);
        obj.sayHello();
        System.out.println(manno.word());
        System.out.println("Enter Name :");
        String name=sc.nextLine();
        System.out.println("Address :");
        String address=sc.nextLine();
        System.out.println("Email :");
        String email=sc.nextLine();
        System.out.println("Age :");
        int age=sc.nextInt();
        System.out.println("Phone :");
        long phone=sc.nextLong();
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
        System.out.println("Address : "+address);
        System.out.println("Email : "+email);
        System.out.println("Phone : "+phone);

    }
}

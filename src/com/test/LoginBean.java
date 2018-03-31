package com.test;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Data(name = "UserType",id = 1)
class User {
    String username;
    String password;

    public User(String username,String password){
        this.username = username;
        this.password = password;
    }
    public String getInfo(){
        String Info = username+" "+password;
        return Info;
    }
}

@Data(name = "StuType",id = 2)
class Student{
    String name;
    int age;
    String stuNum;

    public Student(String nam,int age,String stuNum){
        this.name = name;
        this.age = age;
        this.stuNum = stuNum;
    }
    public String getInfo(){
        String Info = name+" "+age+" "+stuNum;
        return Info;
    }
}

class RequestUtil{
    public static <T>T getObject(HttpServletRequest request,Class<T> clazz) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object obj = null;
        Class clazzClass = Class.forName(String.valueOf(clazz));//获取Class对象
        if(clazz.getName().equals("User")){
            obj = clazzClass.getConstructor().newInstance(request.getParameter("user"), request.getParameter("pass"));
            Method m = clazzClass.getDeclaredMethod("getInfo");
            System.out.println(m.invoke(obj));
        }else if (clazz.getName().equals("Student")){
            obj = clazzClass.getConstructor().newInstance(request.getParameter("name"),request.getParameter("age"),request.getParameter("stuNum"));
            Method m = clazzClass.getDeclaredMethod("getInfo");
            System.out.println(m.invoke(obj));
        }

//        for(Field f : fieldArray){
//            System.out.println(f);
//            f.set(obj,);
//        }

//        Method[] methodArrary = clazzClass.getDeclaredMethods();
//        for (Method m : methodArrary){
//        }
//
        return (T) obj;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        HttpServletRequest request = null;
        User user = RequestUtil.getObject(request,User.class);
        Student student = RequestUtil.getObject(request,Student.class);
    }
}




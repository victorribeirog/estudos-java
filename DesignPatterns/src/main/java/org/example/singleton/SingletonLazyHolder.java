package org.example.singleton;

public class SingletonLazyHolder {

       private static class Holder{
           private static SingletonLazyHolder instance = new SingletonLazyHolder();
       }


       private SingletonLazyHolder() {
           super();
       }

       public static synchronized SingletonLazyHolder getInstance() {
           return Holder.instance;
       }
}
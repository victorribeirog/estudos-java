package org.example.singleton;

public class SingletonLazy {

       private static SingletonLazy instance;

       private SingletonLazy() {
           super();
       }

       public static synchronized SingletonLazy getInstance() {
           if (instance == null) {
               instance = new SingletonLazy();
           }
           return instance;
       }
}
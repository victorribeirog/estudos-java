package org.example.singleton;

public class SingletonEager {

       private static SingletonEager instance = new SingletonEager();

       private SingletonEager() {
           super();
       }

       public static synchronized SingletonEager getInstance() {
           return instance;
       }
}
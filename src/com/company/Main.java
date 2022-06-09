package com.company;
import java.util.Scanner;
    public class Main {

        //static String s1 = "welcome", s2 = "welcome", s3 = "welcome";//Tanımlanan 3 variable için Heap'de sadece 1 adet obje oluşturulur.

        static String str = "code";
        static String[] arrays = {"yunus", "kahraman", "code", "bahar", "mehmet"};

        public static String check(String[] arrays) {
            for (String value : arrays) {
                if (value.equals(str)) {
                    return "Tanımlı value'yu iceren String deger: " + value;}
            }
            return "Tanımlı value'yu iceren String deger bulunamamaktadir..";
        }

        public static void main(String[] args) {

        Scanner scanObj = new Scanner(System.in);
        String[] inputs = new String[5];

        for (int i = 0; i < arrays.length; i++) {
            System.out.println((i+1)+"."+"String degerini giriniz: ");

            String values = scanObj.nextLine();
            inputs[i] = values;
        }
        scanObj.close();
        System.out.println(check(inputs));
        }
    }

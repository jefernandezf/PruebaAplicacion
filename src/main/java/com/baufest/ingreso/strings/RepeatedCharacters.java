package com.baufest.ingreso.strings;

public class RepeatedCharacters {

    public static void main(String[] args) {

        String palabra1 = "aabbcc";
        String palabra2 = "aaaaaa";

       boolean respuesta =   isValid(palabra1,palabra2);
       System.out.println(respuesta);

    }

    public static boolean isValid(String p1, String p2){
        if(p1.length()==p2.length()){
            for(int i=0;i<p1.length();i++)
                if(p1.charAt(i)!=p2.charAt(i))
                    return false;
            return true;
        }

        return false;
    }
}

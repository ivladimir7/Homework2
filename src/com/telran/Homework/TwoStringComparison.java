package com.telran.Homework;

public class TwoStringComparison {
    public static void main(String[] args) {
        String s1, s2;
        s1 =  "ABCD";
        s2 =  "DABC";
        //строка преобразовывается в символы
        char[] chArr1 = s1.toCharArray();
        char[] chArr2 = s2.toCharArray();
        //сортировка
        for(int i = chArr1.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( chArr1[j] > chArr1[j+1] ){
                    char tmp = chArr1[j];
                    chArr1[j] = chArr1[j+1];
                    chArr1[j+1] = tmp;
                }
            }
        }
        for(int i = chArr2.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( chArr2[j] > chArr2[j+1] ){
                    char tmp = chArr2[j];
                    chArr2[j] = chArr2[j+1];
                    chArr2[j+1] = tmp;
                }
            }
            //возвращаем отсортированный массив в строку
            String valueOfchar1 = String.valueOf(chArr1);
            String valueOfchar2 = String.valueOf(chArr2);
            valueOfchar1 = valueOfchar1.replaceAll(" +", " ");
            valueOfchar2 = valueOfchar2.replaceAll(" +", " ");
            //сравниваем строки и выводим на печать: true/false
            System.out.println(valueOfchar1.equalsIgnoreCase(valueOfchar2));
        }
    }
}


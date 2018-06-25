package com.company;

public class Main {
    static  int multiplyTab(int tab[]){
       return multiplyTab1(tab,tab.length-1);
    }
    static  int  multiplyTab1(int tab[],int n){
        if(n>0) {
           return  tab[n] * multiplyTab1(tab,n - 1);
        }else
            return  tab[n]     ;
    }
    public static void main(String[] args) {
	// write your code here
      int sol=  multiplyTab(new int []{1,2,3,4});

          System.out.print( sol);

    }
}

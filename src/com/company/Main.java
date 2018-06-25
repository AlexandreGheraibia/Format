package com.company;

public class Main {
    static  int multiplyTab(int tab[]){
       return multiplyTab1(tab,tab.length-1);
    }
	
	 public static int min(int[] tab,int n) {
	   
	   if(n<tab.length) {
		   int min= min(tab,n+1);
		 
		  if(tab[n]< min) {
			  min=tab[n];
		  }
		  return min>tab[n]?tab[n]:min;
	   }
	   return tab[0];
	  
	  
   }
	
   public static  int max(int []tab) {
	   return tab[max(tab,0,0)];
   }
   public static int max(int[] tab,int n,int j) {
	   if(n<tab.length) {
		   j=max(tab,n+1,j);
		  if(tab[j]< tab[n]) {
			  return n;
		  }
		 
	   }
	   return j;
	  
	  
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

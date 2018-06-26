package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Liste {
    //liste des l'éléments sans doublons mais qui ne garantit pas l'ordre de retour
    //la Map une table de hachage qui associe une clé unique et une valeur
    public static int min(ArrayList<Integer>integerList ){
        if(integerList.size()!=0){
            int min=integerList.get(0);
            for(Integer elem:integerList){
                if(min>elem){
                    min=elem;
                }
            }
            return min;
        }
        return Integer.MAX_VALUE;

    }
    public static int max(ArrayList<Integer>integerList ){
        if(integerList.size()!=0){
            int max=integerList.get(0);
            for(Integer elem:integerList){
                if(max<elem){
                    max=elem;
                }
            }
            return max;
        }
        return Integer.MIN_VALUE;

    }
    public static int sum(ArrayList<Integer>integerList ){
        if(integerList.size()!=0){
            int sum=0;
            for(Integer elem:integerList){
                    sum+=elem;

            }
            return sum;
        }
        return Integer.MIN_VALUE;

    }
    public static double average(ArrayList<Integer>integerList ){
        return integerList.size()==0? Integer.MIN_VALUE:(double)sum(integerList)/integerList.size();
    }
    public static ArrayList<Integer> reverse(ArrayList<Integer>integerList,int n ){
        //si tableau a une taille pair 4, taille/2 vaut 2 et doit etre cette valeur
        //si le tableau a une taille impair,5 taille/2 vaut 3 et doit valoir 3
        //on voit que 4+1=5 et vaut la même valeur pour la division par 2 donc c'est neutre pour 4 d'ajouter 1
        //et pour 5 ça nous arrange.
        
        System.out.println((integerList.size()+1)/2);
        if(n<(integerList.size()+1)/2){
            int tmp=integerList.get(integerList.size()-1-n);

            integerList.set(integerList.size()-1-n,integerList.get(n));
            integerList.set(n,tmp);
            return reverse(integerList,n+1);
        }
        else
           return integerList;
    }


    public static void main(String[] args) {
        // write your code here

      //transformation of a tab to an arrayList
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(2,4,7,8));
        ArrayList<Integer>list2=new ArrayList<Integer>();
        list2.add(new Integer(3));
       for(int elem:integerList){
           System.out.print(elem+" ");
       }
        System.out.println();
        System.out.println(integerList);
        for(int i=0;i<integerList.size();i++){
            System.out.print(integerList.get(i)+" ");
        }
        System.out.println();
        System.out.println(min(integerList));
        System.out.println(max(integerList));
        System.out.println(average(integerList));

        System.out.println(reverse(integerList,0));
    }
}

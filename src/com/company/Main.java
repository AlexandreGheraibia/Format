package com.company;

public class Main {

    /*param:a table tab of integer
     * out: an integer
     * multiply recursively the tab elements value on the n firsts elements
     * and return the result
     * */
    static  int multiplyTab(int tab[]){
        return multiplyTab(tab,tab.length-1);
    }

    /*param:a table tab of integer and integer n
     * out: an integer
     * multiply recursively the tab elements value on the n firsts elements
     * and return the result
     */
    static  int  multiplyTab(int tab[],int n){
        if(n>0) {
            return  tab[n] * multiplyTab(tab,n - 1);
        }else
            return  tab[n];
    }

    /*param:a table tab of integer
     * out: a Double
     * return the tab average value or -1 if the tab is void
     */
    public static double averageTab(int []tab){

        return  tab.length==0?-1:(double)tabSum(tab,0)/tab.length;
    }

    /*param:a table tab of integer of the n first elements
     * out: a Double
     * return the tab sum value or -1 if the tab is void
     * */
    public static int tabSum(int []tab,int n){
        if(n<tab.length){
            return tab[n]+ tabSum(tab,n+1);
        }
        else if(n!=0){
            return 0;
        }
        return -1;

    }

    /*param:a table tab of integer and
     * out: an integer
     * looking for the tab minimal value
     * and return the minimum
     * */
    public static int min(int tab[]) {
        return min(tab,0);
    }

    /*param:a table tab of integer and  n an integer
     * out: an integer
     * looking for looking for the  tab minimal value on the n firsts elements
     * return the minimum
     * */
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

    /*param:a table tab of integer
     * out: an integer
     * looking for the tab minimal value
     * and return the maximum
     * */
    public static  int max(int []tab) {
        return tab[max(tab,0,0)];
    }

    /*param:a table tab of integer and n,j integers
     * out: an integer
     * looking for the index of tab maximal value on the n firsts elements
     * and return the maximum
     * */
    public static int max(int[] tab,int n,int j) {
        if(n<tab.length) {
            j=max(tab,n+1,j);
            if(tab[j]< tab[n]) {
                return n;
            }

        }
        return j;
    }


    public static void main(String[] args) {
        // write your code here
        int sol=  multiplyTab(new int []{1,2,3,4});
        System.out.println("tab multiplication :"+sol);
        System.out.print("mean : "+averageTab(new int []{}));
    }

}

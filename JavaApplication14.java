/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;



/**
 *
 * @author Student
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        int a[]={5,6,7,8,9,5,4};
      
       Naresh:for(int i=0;i<a.length;i++)
       {
           for(int j=i+1;j<a.length;j++)
           {
               if(a[i]==a[j])
               {
    System.out.println("Repeated element in an array is"+" "+a[i]);
                   break Naresh;
}
           }
       }
       
}}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs;

/**
 *
 * @author ojiva
 */
public class CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejercicio01("holla");
    }
    
    public static void ejercicio01(String allUnique){
        //String allUnique = "Holaa";
        String[] allUniqueSplitted = allUnique.split("");
        
        for (int i = 0; i < allUniqueSplitted.length;i++){
            int c=0;
            System.out.println(allUniqueSplitted[i]);
            for(int j = 0; j < allUniqueSplitted.length;j++){
                System.out.println("j --> " + allUniqueSplitted[j]);
                if(allUniqueSplitted[i].equals(allUniqueSplitted[j])){
                    c++;
                }
            }
            System.out.println("c -->" + c);
            if(c>1){
                System.out.println("no unique chars");
                break;
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplostatic;

/**
 *
 * @author mpastorperez
 */
public class ExemploStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Persoa per1=new Persoa("aa",23);
      //per1.incrementarPersoas();//obsoleto
      per1.visualizar();
     Persoa per2=new Persoa("bb",30);  
     //Persoa.incrementarPersoas();
     per2.visualizar();
        System.out.println("Persoas = "+Persoa.getNumPersoas());
     
    }
    
}

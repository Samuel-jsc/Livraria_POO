/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package samuel.com.livraria_poo;

/**
 *
 * @author Samuel
 */
public class Livraria_POO {
    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa [3];
        Livro[] l = new Livro [3];
        
        p[0] = new Pessoa ("Samuel", 29, "M");
        p[1]= new Pessoa ("Noah ", 4, "M");
        p[2] = new Pessoa ("Jessica", 27 , "F");
        
        l[0] = new Livro ("Aprendendo java", "Jose da Silva", 300, p[0]);
        l[1] = new Livro ("POO para iniciantes", "Pedro Paulo", 500,p[1]);        
        l[2] = new Livro ("Java avançado","Maria Candido",350,p[0]);
        
        l[0].abrir();
        l[0].folhear(100);
        System.out.println(l[0].detalhes());
    }
    
}

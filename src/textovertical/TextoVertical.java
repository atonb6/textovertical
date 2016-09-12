
package textovertical;
    import java.util.Scanner;
public class TextoVertical {

    public static void main(String[] args) {
        String txt; int lar; int x;char letra; 
            
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese una frase cualquiera ->");
            
            txt = leer.nextLine();
            lar = txt.length();
        
            for(x=0;x<lar;++x){   
                letra = txt.charAt(x);    
                System.out.println(letra);
            }
    }
    
}

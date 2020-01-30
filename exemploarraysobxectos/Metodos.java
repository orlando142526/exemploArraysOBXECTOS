
package exemploarraysobxectos;
import java.util.Arrays;

public class Metodos {
    //xogador[] xogadores = new xogador[elementos()];
    public static int elementos(){
        System.out.println("numero de elementos");
        return PedirDatos.pedirInt();
        
    }
    public xogador[] crearArray(xogador[]xogadores){
        String nom;
        int dor;
        for(int i=0; i<xogadores.length; i++){
        nom=PedirDatos.pedirString("nome: ");
        dor=PedirDatos.pedirInt("dorsal: ");
        xogadores[i]= new xogador(nom,dor); 
        
      //  xogadores[i]=new xogador(PedirDatos.pedirString());
            
            
            
            
        }
     return xogadores;       
    }
    public void amosaArray(xogador[]lista){
        for(xogador elemento:lista)
            System.out.println(elemento);
   }
    
    public void ordenarDorsal(xogador[]lista) {
        Arrays.sort(lista);
    }
    public void ordenarNombre(xogador[]lista){
        Arrays.sort(lista);
    }
}
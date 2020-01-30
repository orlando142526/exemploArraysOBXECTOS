
package exemploarraysobxectos;


public class Exemploarraysobxectos {

  
     
    public static void main(String[] args) {
        xogador[] futbol = new xogador[Metodos.elementos()];
        Metodos obx = new Metodos();
        futbol = obx.crearArray(futbol);
        obx.amosaArray(futbol);
        /*obx.ordenarDorsal(futbol);
        obx.amosaArray(futbol);*/
        obx.ordenarNombre(futbol);
        obx.amosaArray(futbol);
    }
    
}
package cicloforeach;

public class CicloForEach {
    
    //Usando arrays

    public static void main(String[] args) {
        String[] nombres = {"Alejandro","Matias","Fernando","Alberto","Luis","Gerardo","Antonio","Roberto","Flor","Jessica"};
        
        for (int i = 0; i < nombres.length; i++) { //Para saber el numero de valores que tenemos en los corchetes agregamos un .length despues del nombre del arreglo
            System.out.println(nombres[i]);
        }
        //For mejorado o For Each
        for(String i:nombres){ //for( [Tipo_de_variable] [nombre_variable] : nombre_del_array) {instruccion} 
            System.out.println("Nombres: "+i);
        }
        
    }
    
}

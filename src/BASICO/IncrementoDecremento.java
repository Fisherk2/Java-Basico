package incrementodecremento;

public class IncrementoDecremento {

    public static void main(String[] args) {
        int x = 9;
        x++; // x += 1 (Operador de incremento)
        x--; // x-= 1 (Operador de decremento)
        int y = 5,z,Q;
        Q = ++y;//El incremento esta como prefijo, por lo tanto, si imprimira la suma de y
        z = y++;//El incremento (++) esta como subfijo, por lo tanto, imprimira el valor de y, no su suma
        
        System.out.println(x);
        System.out.println(z);
        System.out.println(Q);
    }
    
}

package ejemplosingleton;

public class EjemploSingleton {

    public static void main(String[] args) {
        mensaje ms = mensaje.getMensaje();
        mensaje ms_2 = mensaje.getMensaje();
        
        ms.setTexto("Hola a todos");
        System.out.println(ms_2.getTexto());
    }
    
    
}

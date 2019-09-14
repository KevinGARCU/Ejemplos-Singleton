/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosingleton;

/**
 *
 * @author Kevin Garcia
 */
class mensaje {
    private static mensaje mens;
    private String texto;

    public static mensaje getMensaje() {
        if (mens == null) {
            mens = new mensaje();
        }
        return mens;
    }
    
    public void imprimirTexto(){
        System.out.println("El mensaje es: " + texto);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
}

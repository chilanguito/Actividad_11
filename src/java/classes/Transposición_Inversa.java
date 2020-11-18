/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author diegonarvaez
 */
public class Transposición_Inversa {

    public String criptografia(String texto) {

        String respuesta = "";
        String texto2 = texto.replaceAll(" ", "");

        if (validate_letter(texto2)) {
            String sCadenaInvertida = "";
            for (int x = texto2.length() - 1; x >= 0; x--) {
                sCadenaInvertida = sCadenaInvertida + texto2.charAt(x);
            }

            respuesta = sCadenaInvertida;

        } else {
            respuesta = "Formato incorrecto";
        }
        return respuesta;
    }

    public boolean validate_letter(String c) {
        boolean res = false;

        c = c.toUpperCase();

        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z') {
                res = true;
            } else {
                res = false;
                break;
            }
        }

        return res;
    }

}

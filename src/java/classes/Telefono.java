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
public class Telefono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Telefono tel = new Telefono();

        System.out.println(tel.validateTelephone("5-*10*10*90*00"));

    }

    public String validateTelephone(String numero) {
        String response = "";
        if (numero.length() == 14 && validateFormate(numero)) {
            response = "Formato Válido: ".concat(numero);
            return response;
        } else {
            response = "Formato inválido: ".concat(numero);
            return response;
        }
    }

    public boolean validateFormate(String num) {
        try {
            if (num.contains("*")) {
                return division(num, "\\*");
            } else if (num.contains("-")) {
                return division(num, "-");
            }
            return false;

        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean division(String num, String separate) {
        try {
            String[] lista = num.split(separate);
            System.out.println(lista.length);
            if (lista.length == 5) {
                for (String s : lista) {
                    if (s.length() == 2) {
                        for (int i = 0; i < s.length(); i++) {
                            Integer.parseInt(String.valueOf(s.charAt(i)));
                        }
                    } else {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }

}

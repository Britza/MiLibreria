package Libreria;

/**
 * Contiene metodos utiles para usar en los proyectos
 */
public class MisMetodos {
    /**
     * Metodo que monta un saludo
     * @param mensaje saludo que quiero mostrar
     * @return cadena con el mensaje concatenado con otro String
     */
    public static String saludo(String mensaje){

        return "Saludo MODIFICACION: " + mensaje;
    }
    public static String adios(String mensaje){
        return "adios: " + mensaje;
    }
}

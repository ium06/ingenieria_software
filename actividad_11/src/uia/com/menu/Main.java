package uia.com.menu;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception
    {
        System.out.println("Hola, iniciando prueba de concepto de menu, buena suerte");

        String[] opcionesMenuMain ={"Crear solicitud de compra", "Modificar solicitud de compra", "Borrar solicitu de compra"};
        String[] opcionesMenuCrearSolicitud={"Regresar a menu principal", "Revisar peticion de compra", "Generar solicitud de compra",
        "Validar solicitud de compra","Enviar solicitu de compra"};
        String[] opcionesMenuRevisarPeticiondeCompra={"Regresar", "Modificar peticion de compra"};
        NodoMenu menuPrincipal = new NodoMenu("Principal", "Introduzca la opción deseada ?:",  opcionesMenuMain, "", "", 0);
        menuPrincipal.setMenu("Crear solicitu de compra", "MOdificar solicitud de compra", "Introduzca la opción deseada ?:",  opcionesMenuCrearSolicitud, "", "", 0);
        menuPrincipal.getNodoMenu("Contactos")
                    .getNodoMenu("Nuevo")
                    .setMenu("Nuevo", "Nuevo", "Introduzca la opción deseada ?:",  opcionesMenuCrearSolicitud, "", "", 1);

        /*
        String[] opcionesMenuNuevoContactoNombre ={"Salir", "Introduzca el nombre del contacto ?"};
        menuPrincipal.getNodoMenu("Contactos")
                .getNodoMenu("Nuevo")
                .getNodoMenu("Nombre")
                .setMenu("Nombre", "Nombre", "Introduzca el nombre del contacto ?:",  opcionesMenuNuevoContactoNombre, "", "", 1);
         */
        menuPrincipal.pregunta();

    }
}

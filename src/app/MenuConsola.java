package app;

import java.time.LocalDate;
import java.util.Scanner;

import BLO.services.GastoService;
import BLO.services.UsuarioService;
import DAL.converters.GastoConverter;
import DAL.daos.impls.GastoDAOImpl;
import DAL.dtos.GastoDTO;
import DAL.dtos.UsuarioDTO;
import DAL.dtos.UsuarioRegistroDTO;

public class MenuConsola {
    private static Scanner scanner = new Scanner(System.in);
    private static UsuarioService usuarioService = new UsuarioService();
    private static GastoService gastoService = new GastoService(new GastoDAOImpl(), new GastoConverter());
    //private static ReporteService reporteService = new ReporteService();
    private static UsuarioDTO usuarioActual = null;

    public static void main(String[] args) {
        while (true) {
            mostrarMenuPrincipal();
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer de entrada

            switch (opcion) {
                case 1:
                    iniciarSesion();
                    break;
                case 2:
                    registrarUsuario();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("\n*** Menú Principal ***");
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Registrar usuario");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void registrarUsuario() {
        System.out.println("\n*** Registrar Usuario ***");

        // Obtener la fecha actual de registro
        LocalDate fechaRegistro = LocalDate.now();

        // Pedir datos para el DTO de registro
        System.out.print("Nombre(s): ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido Paterno: ");
        String apPaterno = scanner.nextLine();
        System.out.print("Apellido Materno: ");
        String apMaterno = scanner.nextLine();
        System.out.print("Edad: ");
        Byte edad = scanner.nextByte();
        
        int profesion = 0;
        while (profesion < 1 || profesion > 10) {
        System.out.print("Seleccione un número de Profesión: \n1.Maestro\n2.Ingeniero\n3.Licenciado\n4.Empresario\n5.Obrero\n6.Estudiante\n7.Médico\n8.Abogado\n9.Artista\n10.Técnico");
        profesion = scanner.nextInt();       
        if (profesion < 1 || profesion > 10) {
            System.out.println("Número inválido. Por favor, seleccione un número entre 1 y 10.");
        }
        scanner.next();
    }
        int tipoIngreso = 0;
        while (tipoIngreso != 1 && tipoIngreso != 2) {
            System.out.print("Tipo de ingreso (1: Estable, 2: Dinámico): ");
            tipoIngreso = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer
            if (tipoIngreso != 1 && tipoIngreso != 2) {
                System.out.println("Opción inválida. Debe ingresar 1 para Estable o 2 para Dinámico.");
            }
        }

        System.out.print("Monto de ingreso: ");
        double montoIngreso = scanner.nextDouble();
        scanner.nextLine();  // Limpiar buffer

        System.out.print("Correo: ");
        String correo = scanner.nextLine();

    // Solicitar y confirmar la contraseña
        String contraseña, confirmacionContraseña;
        while (true) {
        System.out.print("Contraseña: ");
        contraseña = scanner.nextLine();
        System.out.print("Confirmar Contraseña: ");
        confirmacionContraseña = scanner.nextLine();

            if (contraseña.equals(confirmacionContraseña)) {
             break;  // Contraseñas coinciden, se sale del bucle
            } else {
                System.out.println("Las contraseñas no coinciden. Intente nuevamente.");
            }
}

        // Crear el DTO de registro y guardar en la base de datos
        UsuarioRegistroDTO usuarioRegistroDTO = new UsuarioRegistroDTO(nombre,apPaterno,apMaterno,edad, correo,contraseña,fechaRegistro,tipoIngreso,profesion,montoIngreso);
        usuarioService.registrarUsuario(usuarioRegistroDTO);

        System.out.println("Usuario registrado correctamente. Por favor inicie sesión.");
    }


    private static void iniciarSesion() {
        System.out.println("\n*** Iniciar Sesión ***");
        System.out.print("Correo: ");
        String correo = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        // Verificar usuario en la base de datos
        int idUsuario = usuarioService.autenticarUsuario(correo, contrasena); 

        if (idUsuario != 0) {
            usuarioActual = usuarioService.getUsuarioPorId(idUsuario);
            System.out.println("¡Bienvenido, " + usuarioActual.getNombre() + "!");
            mostrarMenuSesion();
        } else {
            System.out.println("Credenciales incorrectas.");
        }
    }

    private static void mostrarMenuSesion() {
        while (true) {
            System.out.println("\n*** Menú de Usuario ***");
            System.out.println("1. Gestionar gastos");
            System.out.println("2. Editar perfil");
            System.out.println("3. Ver reporte");
            System.out.println("4. Cerrar sesión");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer

            switch (opcion) {
                case 1:
                    gestionarGastos();
                    break;
                case 2:
                    editarPerfil();
                    break;
                case 3:
                    verReporte();
                    break;
                case 4:
                    cerrarSesion();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void gestionarGastos() {
        System.out.println("\n*** Gestionar Gastos ***");
        System.out.println("1. Ver historial de gastos");
        System.out.println("2. Agregar gasto");
        System.out.println("3. Editar gasto");
        System.out.println("4. Eliminar gasto");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();  // Limpiar buffer

        switch (opcion) {
            case 1:
               //MANDAR A LLAMAR EL DAO DE USUARIOGASTOS
                break;
            case 2:
                agregarGasto();
                break;
            case 3:
                //EDITAR GASTO
                break;
            case 4:
                //ELIMINAR GASTO
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }


    private static void agregarGasto() {
    System.out.println("\n*** Agregar Gasto ***");
    System.out.print("Descripción del gasto: ");
    String descripcion = scanner.nextLine();
    System.out.print("Monto: ");
    double monto = scanner.nextDouble();
    scanner.nextLine(); // Limpiar buffer
    System.out.print("Método de pago (Efectivo/Tarjeta): ");
    String metodoPago = scanner.nextLine();

    int tipoGasto = 0;
    while (tipoGasto != 1 && tipoGasto != 2) {
        System.out.print("Tipo de gasto (1: Hormiga, 2: Base): ");
        tipoGasto = scanner.nextInt();
        if (tipoGasto != 1 && tipoGasto != 2) {
            System.out.println("Opción inválida. Debe ingresar 1 para Hormiga o 2 para Base.");
        }
    }

    System.out.println("Seleccione una categoría: ");
    System.out.println("1. Comida\n2. Salud\n3. Servicios\n4. Transporte\n5. Entretenimiento\n6. Streaming\n7. Higiene\n8. Ropa\n9. Otros");
    int categoria = scanner.nextInt();
    scanner.nextLine(); // Limpiar buffer

    System.out.println("Seleccione un lugar: ");
    System.out.println("1. Centro\n2. Norte\n3. Sur");
    int lugar = scanner.nextInt();
    scanner.nextLine(); // Limpiar buffer
    LocalDate fecha = LocalDate.now();


    // Crear el DTO y enviar al servicio
    GastoDTO gastoDTO = new GastoDTO( 
    monto,    
    descripcion,
        tipoGasto,
        categoria,
        lugar, 
        usuarioActual.getId_usuario(),
        fecha // Fecha automática
    );


    if (gastoService.registrarGasto(gastoDTO,usuarioActual.getId_usuario())){
        System.out.println("Gasto registrado exitosamente.");
    }
    else {
        System.out.println("No se pudo agregar el gasto.");
    }
}

    private static void editarPerfil() {
        System.out.println("\n*** Editar Perfil ***");
        System.out.println("1. Agregar profesión");
        System.out.println("2. Eliminar profesión");
        System.out.println("3. Editar profesión");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();  // Limpiar buffer

        switch (opcion) {
            case 1:
                //AGREGAR PROFESION LLAMAR AL DAO QUE LO HACE 
                break;
            case 2:
                //ELIMINAR PROFESION
                break;
            case 3:
                //EDITAR ESTE LO PODEMOS QUITAR YO PIENSO
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void verReporte() {//HAY QUE MANDAR A LLAMAR AL PROCEDIMIENTO ALMACENADO QUE HACE LOS REPORTES. 
       /**  System.out.println("\n*** Ver Reporte ***");
        ReporteDTO reporte = reporteService.generarReporteMensual(usuarioActual.getId());
        if (reporte != null) {
            System.out.println("Total Gastos: " + reporte.getTotalGastos());
            System.out.println("Total Hormiga: " + reporte.getTotalHormiga());
            System.out.println("Total Base: " + reporte.getTotalBase());
            System.out.println("Porcentaje Hormiga: " + reporte.getPorcentajeHormiga() + "%");
        } else {
            System.out.println("No existe un reporte para este mes.");
        }*/
    }

    private static void cerrarSesion() {
        System.out.println("\nCerrando sesión...");
        usuarioActual = null;
        System.out.println("Sesión cerrada correctamente.");
    }
}


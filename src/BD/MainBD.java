/*
 * NOMBRE: Fisher
 * FECHA: 3/12/22
 * PROYECTO: CONEXION BASE DE DATOS
 */
package BD;
//Se deben importar java.sql y/o javax.sql

import java.sql.*;
//Los drivers jdbc se importan de forma manual al PROYECTO

/**
 * Clase que prueba la conectividad de base de datos, JDBC: Java Data Base
 * Connectivity.
 *
 * @author Fisherk2
 */
public class MainBD {

    public static void main(String[] baseDatos) {
        new MainBD().conexionMS();
//        new MainBD().consulta();
//        new MainBD().consultaPreparada();
//        new MainBD().proc();

//PENDIENTE TRANSACT
    }

    /**
     * Metodo que establece la conexion de la base de datos MS SQL SERVER
     */
    private void conexionMS() {
        //Driver - jdbc
        //Protocolo - mysql (MySQL), sqlserver(MS SQL), oracle (ORACLE), etc... 
        //Detalles de la conexion del driver - Este varia dependiendo del fabricante.
        String usuario = "FisherCoches"; //Es el Login del usuario
        String contraseña = "123456"; //La contraseña
        String ip = "localhost"; //IP del servidor de la base de datos
        String puerto = "1433"; //Debes habillitarlo con SQL Server Configuration Manager, si no, habilitarlo con el firewall del windows
        String bd = "coches"; //Nombre de la base de datos
        //Url de la conexion a la base de datos SQLServer 
        String url = "jdbc:sqlserver://" + ip + ":" + puerto + ";" + "databaseName=" + bd + ";integratedSecurity=false; trustServerCertificate=true";

        String consulta = "SELECT * FROM Automovil"; //Consulta SELECT

        try {
            //1.- Creamos el objeto CONNECTION, el cual necesitamos obtener pasando la URL, usuario y contraseña.
            Connection miConexion = DriverManager.getConnection(url, usuario, contraseña);
            //2.- Creamos el objeto STATEMENT
            Statement miStatement = miConexion.createStatement();
            //3.- Ejecutar una consulta, que nos dvolvera un objeto de tipo resultado.
            ResultSet miResultSet = miStatement.executeQuery(consulta); //Consulta SELECT
            //4.- Leer la tabla virtual
            while (miResultSet.next()) { //Mientras haya un registro mas, seguira en bucle
                String marca = miResultSet.getString("marca");//Le pasamos el nombre de la columna
                float precio = miResultSet.getFloat("precioBase"); //Forma mas directa de sacar valores de una columna
                String matricula = miResultSet.getString("matricula");//Le pasamos el nombre de la columna
                System.out.println("Marca: " + marca + " - Precio: $" + precio + " - Matricula: " + matricula);
            }

        } catch (Exception e) {
            System.err.println("ERROR, NO SE PUDO CONECTAR A LA BASE DE DATOS");
            e.printStackTrace(); //Imprimir la pila donde ocurrio el error
        }
    }

    /**
     * Metodo que inserta, actualiza y borra registros de una base de datos (SQL
     * Server)
     */
    private void consulta() {
        String usuario = "FisherCoches";
        String contraseña = "123456";
        String ip = "localhost";
        String puerto = "1433";
        String bd = "coches";
        String url = "jdbc:sqlserver://" + ip + ":" + puerto + ";" + "databaseName=" + bd + ";integratedSecurity=false; trustServerCertificate=true";
        //INSERT
        String insertQuery = "INSERT INTO Automovil(marca, cilindros, puertas, precioBase,matricula)\n"
                + "VALUES \n"
                + "('Lamborghini', 12, 2, 5100000,'SJEYRH3')"; //INSERT
        //ACTUALIZAR
        String updateQuery = "UPDATE Automovil SET cilindros = 8 WHERE marca='Lamborghini'";
        //BORRAR
        String deleteQuery = "DELETE Automovil WHERE marca='Lamborghini'";

        try {
            //1.- Creamos el objeto CONNECTION, el cual necesitamos obtener pasando la URL, usuario y contraseña.
            Connection miConexion = DriverManager.getConnection(url, usuario, contraseña);
            //2.- Creamos el objeto STATEMENT
            Statement miStatement = miConexion.createStatement();
            //3.- Ejecutar una consulta
            miStatement.executeUpdate(deleteQuery); //Este metodo hace INSERT, UPDATE y DELETE
            System.out.println("Se ha modificado los datos");

        } catch (Exception e) {
            System.err.println("ERROR, NO SE PUDO CONECTAR A LA BASE DE DATOS");
            e.printStackTrace(); //Imprimir la pila donde ocurrio el error
        }
    }

    /**
     * Metodo que ejecuta consultas preparadas, permite pasar parametros a las
     * sentencias SQL, previenen de ataques de inyeccion SQL y tienen un mejor
     * rendimiento porque son sentencias precompiladas y reutilizables.
     */
    private void consultaPreparada() {
        String usuario = "FisherCoches";
        String contraseña = "123456";
        String ip = "localhost";
        String puerto = "1433";
        String bd = "coches";
        String url = "jdbc:sqlserver://" + ip + ":" + puerto + ";" + "databaseName=" + bd + ";integratedSecurity=false; trustServerCertificate=true";

        //SELECT PREPARADO (Signos de interrogacion son los parametros)
        String selectPreparado = "SELECT * FROM Automovil WHERE marca = ? OR cilindros < ?";
        try {
            //1.- Creamos el objeto CONNECTION, el cual necesitamos obtener pasando la URL, usuario y contraseña.
            Connection miConexion = DriverManager.getConnection(url, usuario, contraseña);
            //2.- Creamos el objeto PreparedStatement
            PreparedStatement sentenciaSelect = miConexion.prepareStatement(selectPreparado);
            //3.- Establecer parametros de consulta
            sentenciaSelect.setString(1, "Lamborghini");//Es el primer parametro '?'
            sentenciaSelect.setInt(2, 8); //Es el segundo parametro '?'
            //4.- Ejecutar la consulta
            ResultSet miResultSet = sentenciaSelect.executeQuery();
            while (miResultSet.next()) {
                String marca = miResultSet.getString(2); //Es la segunda columna
                int cilindro = miResultSet.getInt(3); //Es la tercer columna
                String matricula = miResultSet.getString(7); //Es la septima columna
                System.out.println("Marca: " + marca + " - Cilindros: " + cilindro + " - Matricula: " + matricula);
            }
            //5.- Liberar la memoria
            miResultSet.close();
        } catch (SQLException e) {
            System.err.println("ERROR, NO SE PUDO CONECTAR A LA BASE DE DATOS");
            e.printStackTrace(); //Imprimir la pila donde ocurrio el error
        }
    }

    private void proc() {
        String usuario = "FisherCoches";
        String contraseña = "123456";
        String ip = "localhost";
        String puerto = "1433";
        String bd = "coches";
        String url = "jdbc:sqlserver://" + ip + ":" + puerto + ";" + "databaseName=" + bd + ";integratedSecurity=false; trustServerCertificate=true";
        //PROCEDIMIENTO ALMACENADO  CON CONSULTA PREPARADA
        String procedure = "{call agregarAuto(?,?,?,?,?)}";
        try {
            //1.- Creamos el objeto CONNECTION, el cual necesitamos obtener pasando la URL, usuario y contraseña.
            Connection miConexion = DriverManager.getConnection(url, usuario, contraseña);
            //2.- Creamos el objeto CALLABLESTATEMENT
            CallableStatement miStatement = miConexion.prepareCall(procedure);
            //3.- Llenamos los parametros de la consulta preparada
            miStatement.setString(1, "Lamborghini");//Primer parametro '?' - Marca
            miStatement.setInt(2, 12);//Segundo parametro '?' - Cilindros
            miStatement.setInt(3, 2);//Tercer parametro '?' - Puertas
            miStatement.setFloat(4, 5100000);//Cuarto parametro '?' - Precio Base
            miStatement.setString(5, "SJEYRH3");//Cuarto parametro '?' - Matricula

            //4.- Ejecutar la consulta
            miStatement.execute();
            System.out.println("Procedimiento almacenado ejecutado");

        } catch (SQLException e) {
            System.err.println("ERROR, NO SE PUDO CONECTAR A LA BASE DE DATOS");
            e.printStackTrace(); //Imprimir la pila donde ocurrio el error
        }
    }
}

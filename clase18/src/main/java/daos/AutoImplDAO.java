package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import clase18.clase18.Conexion;
import entitiesVO.Auto;

public class AutoImplDAO implements IAutoDAO {

	public void insertar(Auto auto) {
		try {
			// paso 1 conectarme con db
			Connection conexion = Conexion.conectar();
			// paso 2 armar el query
			String query = "INSERT INTO auto(marca,precio,anio,km) " + "values('" + auto.getMarca() + "',"
					+ auto.getPrecio() + "," + auto.getAnio() + "," + auto.isKm() + ")";

			// paso 3 preparar un estado
			Statement stmt = conexion.createStatement();
			// paso 4 ejecutar mi query
			stmt.execute(query);
			System.out.println("Datos del nuevo auto guardado correctamente");
			// extras cerrar las conexiones, los estados
			stmt.close();
			conexion.close();

		} catch (Exception e) {
			System.out.println("Erroressss al insertar");
			e.printStackTrace();
		}

	}

	public void insertarPraparado(Auto auto) {
		// creo la variablE
		Connection conexion = null;
		try {
			// conectarme con db
			conexion = Conexion.conectar();
			// iniciar transacción
			conexion.setAutoCommit(false);
			// armar el query
			String query = "INSERT INTO auto(marca,precio,anio,km) values(?,?,?,?)";
			// preparar un estado
			PreparedStatement stmt = conexion.prepareStatement(query);
			// setear, pasar las variables incognitas
			stmt.setString(1, auto.getMarca());
			stmt.setDouble(2, auto.getPrecio());
			stmt.setInt(3, auto.getAnio());
			stmt.setBoolean(4, auto.isKm());
			// ejecutar mi query
			stmt.execute();
			System.out.println("Datos preparados del nuevo auto guardado correctamente");
			// confirmo mi transacción
			conexion.commit();
			
			// extras cerrar las conexiones, los estados
			stmt.close();
			conexion.close();

		} catch (Exception e) {
			System.out.println("Erroressss al insertar");
			e.printStackTrace();
			try {
				System.out.println("revierto la transacción por algún error");
				conexion.rollback();
			} catch (SQLException e2) {
				System.out.println("Error al revertir " + e2.getMessage());
			}

		}

	}
	public void borrar(int id) {
		try {
			// Conectarme con db
			Connection conexion = Conexion.conectar();
			// armar el query
			String query = "DELETE FROM auto WHERE id = " + id;
			// preparar un estado
			PreparedStatement stmt = conexion.prepareStatement(query);
			// ejecutar mi query
			stmt.execute();
			System.out.println("Auto eliminado correctamente");
			// extras cerrar las conexiones, los estados
			stmt.close();
			conexion.close();

		} catch (Exception e) {
			System.out.println("Erroressss al intentar borrar");
			e.printStackTrace();
		}

	}

	public void listar() {
		try {
			// Conectarme con db
			Connection conexion = Conexion.conectar();
			// armar el query
			String query = "SELECT *FROM auto";
			// preparar un estado
			PreparedStatement stmt = conexion.prepareStatement(query);
			// ejecutar mi query
			ResultSet resultado = stmt.executeQuery();
			while (resultado.next()) {
				System.out.println(
						"Marca: " + resultado.getString("marca") + ", precio: " + resultado.getDouble("precio")
								+ ", año: " + resultado.getInt("anio") + ", km: " + resultado.getBoolean("km"));
			}
			// extras cerrar las conexiones, los estados
			stmt.close();
			conexion.close();

		} catch (Exception e) {
			System.out.println("Erroressss al intentar buscar información");
			e.printStackTrace();
		}

	}

	public void mostrarPorId(int id) {
		try {
			// Conectarme con db
			Connection conexion = Conexion.conectar();
			// me voy a armar una banderita (flag)
			boolean flag = false;
			// armar el query
			String query = "SELECT *FROM auto WHERE id = ?";
			// preparar un estado
			PreparedStatement stmt = conexion.prepareStatement(query);
			// paso el dato
			stmt.setInt(1, id);
			// ejecutar mi query
			ResultSet resultado = stmt.executeQuery();
			while (resultado.next()) {
				flag = true;
				System.out.println("Encontrado, Marca: " + resultado.getString("marca"));
			}
			if (!flag)
				System.out.println("no existe el registro");
			// extras cerrar las conexiones, los estados
			stmt.close();
			conexion.close();

		} catch (Exception e) {
			System.out.println("Erroressss no puedo buscar");
			e.printStackTrace();
		}

	}
	public void editar(Auto auto) {
		// TODO Auto-generated method stub

	}




}

package daos;

import java.sql.Connection;
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

	public void borrar(int id) {
		// TODO Auto-generated method stub

	}

	public void listar() {
		// TODO Auto-generated method stub

	}

	public void editar(Auto auto) {
		// TODO Auto-generated method stub

	}

	public void mostrarPorId(int id) {
		// TODO Auto-generated method stub

	}

}

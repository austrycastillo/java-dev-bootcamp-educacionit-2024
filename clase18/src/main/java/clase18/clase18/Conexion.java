package clase18.clase18;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	static Connection con = null;

	public static Connection conectar() {

		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/autos", "root", "");
			System.out.println("me conecto a la db perfecto");
		} catch (Exception e) {
			System.out.println("No puedo conectar");
			e.printStackTrace();
			System.out.println(e.getCause());
			System.out.println(e.getMessage());

		}
		return con;
	}
}

package clase18.clase18;

import daos.AutoImplDAO;
import entitiesVO.Auto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		// Conexion.conectar();
		// crear un objeto auto para probar el insert
		Auto auto = new Auto("Ford", 200.2, 1982, false);
		// crear un objeto para implementar las operaciones CRUD
		AutoImplDAO ai = new AutoImplDAO();
		// invoco el método y le paso el objeto para guardar en la db
		ai.insertar(auto);
    }
}

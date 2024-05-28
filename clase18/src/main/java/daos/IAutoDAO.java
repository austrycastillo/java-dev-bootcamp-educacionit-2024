package daos;

import entitiesVO.Auto;

public interface IAutoDAO {
//CRUD
	void insertar(Auto auto);

	void borrar(int id);

	void listar();

	void editar(Auto auto);

	void mostrarPorId(int id);
}

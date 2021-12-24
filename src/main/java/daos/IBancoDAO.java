package daos;

import entities.Cliente;

public interface IBancoDAO {

	public boolean cartaoBloqueado(Cliente cliente);
}

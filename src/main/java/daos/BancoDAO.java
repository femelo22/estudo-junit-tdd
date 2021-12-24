package daos;

import entities.Cliente;

public class BancoDAO implements IBancoDAO{

	public boolean cartaoBloqueado(Cliente cliente) {
		return false;
	}

}

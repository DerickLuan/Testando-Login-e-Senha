package br.edu.ifms.LoginChain;

import br.edu.ifms.Usuario.Usuario;

public interface Validador {

	public boolean validar (Usuario usuario);
	public void setProximo(Validador proximo);
}

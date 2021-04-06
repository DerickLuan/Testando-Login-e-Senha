package br.edu.ifms.LoginChain;

import br.edu.ifms.Usuario.Usuario;

public class LoginAlfaNumerico implements Validador {

	private Validador proximo;
	
	@Override
	public boolean validar(Usuario usuario) {
		if(usuario.login.matches("[0-9a-zA-Z]*") == true) {
			if(this.proximo == null) {
				return true;
			}
			else {
				return proximo.validar(usuario);
			}
		}
		else {
			System.out.println("O login deve conter apenas latras e numeros");
			return false;
		}
	}

	@Override
	public void setProximo(Validador proximo) {
		this.proximo = proximo;
	}

}

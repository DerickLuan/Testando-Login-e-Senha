package br.edu.ifms.LoginChain;

import br.edu.ifms.Usuario.Usuario;

public class SenhaAlfaNumerica implements Validador {

	private Validador proximo;
	
	@Override
	public boolean validar(Usuario usuario) {
		if(usuario.senha.matches("[0-9a-zA-Z]*") == true) {
			if(this.proximo == null) {
				return true;
			}
			else {
				return proximo.validar(usuario);
			}
		}
		else {
			System.out.println("O senha deve conter apenas latras e numeros");
			return false;
		}
	}

	@Override
	public void setProximo(Validador proximo) {
		this.proximo = proximo;
	}

}

package br.edu.ifms.LoginChain;

import br.edu.ifms.Usuario.Usuario;

public class LoginOitoChar implements Validador{
	
	private Validador proximo;	
	
	/*
	 * Verifica se o login do usuario tem 8 caracteres!
	 */

	@Override
	public boolean validar(Usuario usuario) {
		if(usuario.login.length() >= 8 ) {
			if(this.proximo == null) {
				return true;
			}
			else {
				return this.proximo.validar(usuario);
			}
		}
		else {
			System.out.println("O login deve ter pelo menos 8 caracteres");
			return false;
		}
		
	}

	public Validador getProximo() {
		return proximo;
	}

	public void setProximo(Validador proximo) {
		this.proximo = proximo;
	}
	
	
}

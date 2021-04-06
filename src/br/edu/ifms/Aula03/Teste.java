package br.edu.ifms.Aula03;

import br.edu.ifms.LoginChain.LoginAlfaNumerico;
import br.edu.ifms.LoginChain.LoginConterNumero;
import br.edu.ifms.LoginChain.LoginPrimeiraLetra;
import br.edu.ifms.LoginChain.LoginSeisChar;
import br.edu.ifms.LoginChain.SenhaCaractereEspecial;
import br.edu.ifms.LoginChain.SenhaConterNumero;
import br.edu.ifms.LoginChain.SenhaMaiusculaMinuscula;
import br.edu.ifms.LoginChain.SenhaOitoChar;
import br.edu.ifms.Usuario.Usuario;

public class Teste {

	public static void main(String Args[]) {
		Usuario u0 = new Usuario();
		u0.nome = "derick silva";
		u0.login = "derick2silva1";
		u0.senha = "Senha123@";
		
		LoginSeisChar val0 = new LoginSeisChar();
		SenhaOitoChar val1 = new SenhaOitoChar();
		LoginAlfaNumerico val2 = new LoginAlfaNumerico();
		//SenhaAlfaNumerica val3 = new SenhaAlfaNumerica();
		LoginPrimeiraLetra val4 = new LoginPrimeiraLetra();
		LoginConterNumero val5 = new LoginConterNumero();
		SenhaMaiusculaMinuscula val6 = new SenhaMaiusculaMinuscula();
		SenhaConterNumero val7 = new SenhaConterNumero();
		SenhaCaractereEspecial val8 = new SenhaCaractereEspecial();
		
		val0.setProximo(val1);
		val1.setProximo(val2);
		val2.setProximo(val4);
		//val3.setProximo(val4);
		val4.setProximo(val5);
		val5.setProximo(val6);
		val6.setProximo(val7);
		val7.setProximo(val8);
		
		if(val0.validar(u0) == true) {
			System.out.println("Login e Senha validados");
		}
		else {
			System.out.println("Algo deu errado");
		}
	}
}

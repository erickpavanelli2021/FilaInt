package model;

public class Fila {
	
	No inicio;
	No fim;
	
	public Fila () {
		inicio = null;
		fim = null;
	}
	
	public boolean isEmpty() {
		if (inicio == null && fim == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void insert (int valor) {
		No elemento = new No();
		elemento.dado = valor;
		
		//verificar se é o primeiro elemento
		if (inicio == null) {
			inicio = elemento;
			fim = elemento;
			elemento.proximo = null;
		}else {
			//verificar se é o segundo elemento
			if (inicio == fim && inicio != null) {
				fim = elemento;
				inicio.proximo = fim;
				fim.proximo = null;
			} else {
				fim.proximo = elemento;
				elemento.proximo = null;
				fim = elemento;
			}
		}
		
	}

}

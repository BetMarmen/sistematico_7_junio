package num_fraccionarios;

public class Racional {
private int numerador,denominador;

public Racional(int numerador, int denominador) {
	super();
	this.numerador = numerador;
	this.denominador = denominador;
}

public int getNumerador() {
	return numerador;
}

public void setNumerador(int numerador) {
	this.numerador = numerador;
}

public int getDenominador() {
	return denominador;
}

public void setDenominador(int denominador) {
	this.denominador = denominador;
}

}

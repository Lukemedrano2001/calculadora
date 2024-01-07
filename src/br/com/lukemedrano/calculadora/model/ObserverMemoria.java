package br.com.lukemedrano.calculadora.model;

@FunctionalInterface
public interface ObserverMemoria {
	public void valorAlterado(String novoValor);
}
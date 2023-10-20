package edu.joaolucas.gof.singleton;

import edu.joaolucas.gof.facade.Facade;
import edu.joaolucas.gof.strategy.Comportamento;
import edu.joaolucas.gof.strategy.ComportamentoAgressivo;
import edu.joaolucas.gof.strategy.ComportamentoDefensivo;
import edu.joaolucas.gof.strategy.ComportamentoNormal;
import edu.joaolucas.gof.strategy.Robo;

public class Teste {

	public static void main(String[] args) {

		// Singleton

		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);

		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);

		// Strategy

		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setStrategy(agressivo);

		robo.mover();
		robo.mover();

		// Facade

		Facade facade = new Facade();
		facade.migrarCliente("Joao", "06727185");

	}

}

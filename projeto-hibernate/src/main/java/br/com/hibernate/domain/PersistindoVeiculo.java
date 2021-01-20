package br.com.hibernate.domain;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PersistindoVeiculo {
	
	public static void main(String[] args) {	
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Veiculo veiculo = new Veiculo();
		veiculo.setFabricante("Honda");
		veiculo.setModelo("Civic");
		veiculo.setAnoFabricacao(2012);
		veiculo.setAnoModelo(2013);
		veiculo.setValor(new BigDecimal(713000));
		
		manager.persist(veiculo);
		
		tx.commit();
		manager.close();
		JpaUtil.close();
		
	}

}

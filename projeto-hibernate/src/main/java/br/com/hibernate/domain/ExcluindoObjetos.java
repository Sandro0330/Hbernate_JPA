package br.com.hibernate.domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

//REMOVENDO OBJETOS

public class ExcluindoObjetos {

	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Veiculo veiculo = manager.find(Veiculo.class, 1L);
		
		manager.remove(veiculo);
		
		tx.commit();
		manager.close();
		JpaUtil.close();
		
	}
}

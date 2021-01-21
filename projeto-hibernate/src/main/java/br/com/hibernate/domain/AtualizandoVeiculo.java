package br.com.hibernate.domain;

import java.math.BigDecimal;
//ATUALIZANDO OS OBJETOS

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class AtualizandoVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Veiculo veiculo = manager.find(Veiculo.class, 1L);
		
		System.out.println("Valor atual: " + veiculo.getValor());
		veiculo.setValor(veiculo.getValor().add(new BigDecimal(500)));
		System.out.println("Novo valor: " + veiculo.getValor());
		
		tx.commit();
		manager.close();
		JpaUtil.close();
	}
}

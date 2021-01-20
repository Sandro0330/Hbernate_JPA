package br.com.hibernate.domain;

import javax.persistence.EntityManager;

public class BuscandoVeiculo1 {

	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		Veiculo veiculo = manager.find(Veiculo.class, 1L);
		System.out.println("Ve�culo de c�digo " + veiculo.getCodigo() + " � um " + veiculo.getModelo());
		manager.close();
		JpaUtil.close();
	}

}

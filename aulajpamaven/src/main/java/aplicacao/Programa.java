package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//EXEMPLO 01 - INSERINDO NO BANCO DE DADOS
//		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
//		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquin@gmail.com");
//		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
//		
//		em.getTransaction().begin();

//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);

//		em.getTransaction().commit();
		
		//EXEMPLO 02 - Buscando objeto pelo ID
//		Pessoa p = em.find(Pessoa.class, 2);
		
		//EXEMPLO 02 - Apagando objeto
		em.getTransaction().begin();
		Pessoa p = em.find(Pessoa.class, 2);
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pronto");
		em.close();
		emf.close();


		
	}

}

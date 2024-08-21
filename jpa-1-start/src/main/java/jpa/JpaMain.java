package jpa;

import jakarta.persistence.*;

public class JpaMain {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			Member member = new Member();
			member.setId(4L);
			member.setName("ynkim");

			/* insert */
			//em.persist(member);
			
			/* select */
			Member select = em.find(Member.class, 4L);
			
			/* updata*/
			select.setName("chkname");
		
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
		}
		emf.close();
	}
}

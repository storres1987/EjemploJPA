package open4job.jpa;

import javax.persistence.EntityManager;


public class Principal 
{
    public static void main( String[] args )
    {
      	 AlumnoNota alumno_nota = new AlumnoNota();
    	 alumno_nota.setEvaluacion('3');
    	 alumno_nota.setNota(9);
    	 alumno_nota.setObservacion("Prueba de JPA"); 
 
    		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
    		em.getTransaction().begin();
    		em.persist(alumno_nota);
    		em.getTransaction().commit();
    		em.close();
    		PersistenceManager.INSTANCE.close();
    	 }
    }
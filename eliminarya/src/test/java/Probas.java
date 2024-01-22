import org.example.HibernateManager;
import org.example.entities.Alumno;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;

public class Probas {

    @Test
    public void test(){
        System.out.println("Hello World!");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }


    @Test
    public void insertAlumnno() {
        Alumno alumno = new Alumno("Pepe", "Calo", 20, "Calle de la piruleta");
        Alumno alumno2 = new Alumno("Manolo", "Morán", 18, "San Clemente");
        Session session = HibernateManager.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(alumno);
        session.persist(alumno2);
        session.getTransaction().commit();
        System.out.println(alumno);
    }
}

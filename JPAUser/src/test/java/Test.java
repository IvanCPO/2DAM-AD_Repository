import jakarta.persistence.EntityManager;
import org.a22ivancp.JPAUtil;
import org.a22ivancp.Usuario;

public class Test {
    @org.junit.jupiter.api.Test
    void test() {
        Usuario usuario = new Usuario("Ivan", "Cabaleiro", "mamasiempregana@love.org", "ivanGUAPO");
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
    }
}

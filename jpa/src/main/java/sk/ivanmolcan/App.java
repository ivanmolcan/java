package sk.ivanmolcan;

import sk.ivanmolcan.model.Message;
import sk.ivanmolcan.model.Osoba;
import sk.ivanmolcan.model.enums.Pohlavie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("sk.ivanmolcan.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        entityManager.getTransaction().begin();
//        entityManager.persist(new Message("prva sprava"));
//        entityManager.persist(new Message("Druha sprava"));
//        entityManager.getTransaction().commit();

//        entityManager.getTransaction().begin();
//        List<Message> result = entityManager.createQuery("from Message", Message.class).getResultList();
//        for(Message msg: result){
//            System.out.println("Sprava " + msg.getMessage() + "id " + msg.getId());
//        }
//
//        entityManager.getTransaction().commit();
//        entityManager.close();
        entityManager.getTransaction().begin();
        entityManager.persist(new Osoba(Pohlavie.MUZ));
        entityManager.persist(new Osoba(Pohlavie.ZENA));
        entityManager.persist(new Osoba(Pohlavie.MUZ));
        entityManager.getTransaction().commit();

        entityManager.getTransaction().begin();
        List<Osoba> result = entityManager.createQuery("from Osoba", Osoba.class).getResultList();
        for(Osoba osoba : result){
            System.out.println("Osoba id: " + osoba.getId() +
                    ", Pohlavie: " + osoba.getPohlavie() +
                    ", Pohlavie kod: " + osoba.getPohlavie().getKod());
        }
        entityManager.getTransaction().commit();
        entityManager.close();

    }


}



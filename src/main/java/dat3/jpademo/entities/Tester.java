/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dat3.jpademo.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author mathi
 */
public class Tester {
    public static void main(String[] args) {
        EntityManagerFactory _emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = _emf.createEntityManager();
        Person p1 = new Person("Navn 1", 1997);
        Person p2 = new Person("Navn 2", 2010);
        Address a1 = new Address("StutPark 5", 3400, "hillerød");
        Address a2 = new Address("GutNak 5", 1000, "KBH");
        p1.setAdress(a1);
        p2.setAdress(a2);
        

em.getTransaction().begin();
em.persist(p1);
em.persist(p2);
em.getTransaction().commit();

        System.out.println("p1:" + p1.getP_id() + p1.toString());
        System.out.println("p2:" + p2.getP_id() +p2.toString());
        System.out.println("p1 > "+p1.getAdress().getCity());
        System.out.println("to-v = "+ a1.getPerson().getName());
    }
    
}

package com.learn.work.hibernate;
import java.math.BigInteger;

import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * @author imssbora
 */
public class MainApp {
  public static void main(String[] args) {
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    EntityManager entityManager1 = JPAUtil.getEntityManagerFactory().createEntityManager();
    entityManager.getTransaction().begin();

    String sql = "insert into workday(id,daycode,dayname) values(8,8,'B')";

    Query query = entityManager.createNativeQuery(sql);
    query.executeUpdate();
    
    BigInteger result = (BigInteger) entityManager.createNativeQuery("select count(1) from workday").getSingleResult();
    System.out.println(result);

    entityManager.getTransaction().commit();
    entityManager.close();

    JPAUtil.shutdown();
  }
}
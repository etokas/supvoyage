package com.supinfo.suptrip.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.supinfo.suptrip.dao.UsersDao;
import com.supinfo.suptrip.models.Trip;
import com.supinfo.suptrip.models.Users;

public class JpaUsersDao implements UsersDao {
	EntityManagerFactory emf;
	public  JpaUsersDao(EntityManagerFactory emf) {
		this.emf=emf;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addUser(Users user) {
		// TODO Auto-generated method stub
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();;
		try {
			em.persist(user);
			em.getTransaction().commit();
			
			
		} finally  {
			if(em.getTransaction().isActive()){
				em.getTransaction().rollback();
			}
		
			// TODO: handle exception
		}
		em.close();
		
	}

	@Override
	public void removeUser(Users user) {
		// TODO Auto-generated method stub
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		try {
			em.remove(em.merge(user));
			em.getTransaction().commit();
			
		} finally {
			// TODO: handle finally clause
			if(em.getTransaction().isActive()){
				em.getTransaction().rollback();
			}
		}
		em.close();
	}

	@Override
	public void updateUser(Users user) {
		// TODO Auto-generated method stub
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		try {
			em.merge(user);
			em.getTransaction().commit();
		} finally {
			// TODO: handle finally clause
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
				
			}
		}
		em.close();
		
	}
	@Override
	public Users getUserById(Long id) {
		// TODO Auto-generated method stub
		EntityManager em=emf.createEntityManager();
		try {
			return (Users)em.find(Users.class, id);
			
		}catch(NoResultException e){
			return null;	
		}
		finally {
			// TODO: handle finally clause
			em.close();
		}
	}

	@Override
	public void addTripInBag(Users user, Trip trip) {
		// TODO Auto-generated method stub
		user.getTrip().add(trip);
		
		
	}

	@Override
	public void removeTripInbag(Users user, Trip trip) {
		// TODO Auto-generated method stub
		user.getTrip().remove(trip);
		
	}
	
	@Override
	public Users findByCampusBooster(String idBooster){
		
		EntityManager em = emf.createEntityManager();
		try {
			Query query = em.createQuery("SELECT i FROM Users AS i WHERE idbooster = :idbooster");
			
			query.setParameter("idbooster", idBooster);
			return  (Users) query.getSingleResult();
			
		} catch (NoResultException e) {
			
		}
		return null;
	}
	
	@Override
	public boolean login(String idbooster, String password){
		EntityManager em = emf.createEntityManager();
		
		try {
			Query q = em.createQuery("SELECT u FROM Users AS u WHERE idbooster = :idbooster AND password = :password ");
			q.setParameter("idbooster", idbooster);
			q.setParameter("password", password);
			
			System.out.println("Okkkkk");
			return true;
			
		} catch (NoResultException e) {
			e.getMessage();
		}	
		return false;
	}
}

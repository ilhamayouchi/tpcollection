package ma.projet.impl;


import ma.projet.bean.User;
import ma.projet.dao.IDao;
import java.util.ArrayList;
import java.util.List;



public class UtilisateurImpl implements IDao<User> {
	
private List<User> users;
	
	public UtilisateurImpl() {
		users = new ArrayList<User>();
	}

	@Override
	public boolean create(User o) {
		// TODO Auto-generated method stub
		return users.add(o);
	}

	@Override
	public boolean delete(User o) {
		// TODO Auto-generated method stub
		return users.remove(o);
	}

	@Override
	public boolean update(User o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getById(int id) {
		for(User u : users) {
			if(u.getId() == id)
				return u;
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

	

}

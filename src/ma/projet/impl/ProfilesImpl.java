package ma.projet.impl;

import java.util.ArrayList;
import java.util.List;

import ma.projet.bean.Profile;
import ma.projet.dao.IDao;

public class ProfilesImpl implements IDao<Profile> {
	
private List<Profile> profile;
	
	public  ProfilesImpl() {
		profile = new ArrayList<Profile>();
	}

	@Override
	public boolean create(Profile o) {
		// TODO Auto-generated method stub
		return profile.add(o);
	}

	@Override
	public boolean delete(Profile o) {
		// TODO Auto-generated method stub
		return profile.remove(o);
	}

	@Override
	public boolean update(Profile o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Profile getById(int id) {
		for(Profile p : profile) {
			if(p.getId() == id)
				return p;
		}
		return null;
	}

	@Override
	public List<Profile> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	

	

}

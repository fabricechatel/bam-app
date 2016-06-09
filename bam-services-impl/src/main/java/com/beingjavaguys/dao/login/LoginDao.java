package com.beingjavaguys.dao.login;

import com.beingjavaguys.models.login.Users;



public interface LoginDao {
	Users findByUserName(String username);
}

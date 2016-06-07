package com.bam.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bam.entity.Role;

@Component("roleDao")
public class RoleDaoImpl extends GenericDaoImpl<Role, Integer> implements RoleDao {

	Logger log = Logger.getLogger(getClass());

}

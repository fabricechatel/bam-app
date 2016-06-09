package com.bam.managedBean;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
    




import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
    




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bam.business.Facade;
import com.bam.entity.Client;


@Component("freshSafeCrudBean")  
//@ManagedBean
//@SessionScoped
@Scope("request")
public class FreshSafeCrudBean implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@Autowired
	Facade facade;
	
    private List<Client> list;
    private Client item = new Client();
    private Client beforeEditItem = null;
    private boolean edit;
    
    @ManagedProperty(value="#{commonUtils}")
    private CommonUtils util;
    public void setUtil(CommonUtils util) {
        this.util = util;
    }
    
    @PostConstruct
    public void init() {
        list = new ArrayList<Client>(facade.getClientBusiness().findAll());
        //System.out.println("Init!!!!!!"+list.get(0).getPrenom());
    }
    
    public void add() {
        // DAO save the add
        item.setIdClient(list.isEmpty() ? 1 : list.get(list.size() - 1).getIdClient() + 1);
        list.add(item);
        item = new Client();
    
        util.redirectWithGet();
    }
    
	public List<Client> getClients() {
		return list;
	}
	
    public void resetAdd() {
        item = new Client();
    
        util.redirectWithGet();
    }
    
    public void edit(Client item) {
        beforeEditItem = (Client) item.clone();
        this.item = item;
        edit = true;
    
        util.redirectWithGet();
    }
    
    public void cancelEdit() {
        this.item.restore(beforeEditItem);
        this.item = new Client();
        edit = false;
    
        util.redirectWithGet();
    }
    
    public void saveEdit() {
        // DAO save the edit
        this.item = new Client();
        edit = false;
    
        util.redirectWithGet();
    }
    
    public void delete(Client item) throws IOException {
        // DAO save the delete
        list.remove(item);
    
        util.redirectWithGet();
    }
    
    public List<Client> getList() {
    	return this.list;
    }
    
    public Client getItem() {
        return this.item;
    }
    
    public boolean isEdit() {
        return this.edit;
    }
    
    
}


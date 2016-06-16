package com.bam.managedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import com.bam.entity.Categorie;
 
@ManagedBean(name="treeBasicView")
@ViewScoped
public class BasicView implements Serializable {
     
    private TreeNode root;
    
    private TreeNode categories;
    private Categorie racine;
    
    private List<Categorie> catList = new ArrayList<Categorie>();
    
    byte xByte[];
    HashMap<TreeNode, TreeNode> catMap = new HashMap<TreeNode, TreeNode>();

    
    @PostConstruct
    public void init() {
    	
    	racine = new Categorie(1, "Racine", (byte)1);
    	
    	catList.add(racine);
    	catList.add(new Categorie(2, 1, "Node 0.0", (byte)1));
    	catList.add(new Categorie(3, 1, "Node 0.1", (byte)1));
    	catList.add(new Categorie(4, 3, "Node 0.1.0", (byte)1));
    	catList.add(new Categorie(5, 3, "Node 0.1.1", (byte)1));
    	catList.add(new Categorie(6, 2, "Node 0.0.0", (byte)1));
    	
    	categories = new DefaultTreeNode(racine, null);
    	for (Categorie c: catList){
    		//catMap.put(c., value)
    		
    	}
    	
    	
    	
    	
    	
    	
    	
        root = new DefaultTreeNode("Root", null);
        TreeNode node0 = new DefaultTreeNode("Node 0", root);
        TreeNode node1 = new DefaultTreeNode("Node 1", root);
         
        TreeNode node00 = new DefaultTreeNode("Node 0.0", node0);
        TreeNode node01 = new DefaultTreeNode("Node 0.1", node0);
         
        TreeNode node10 = new DefaultTreeNode("Node 1.0", node1);
         
        node1.getChildren().add(new DefaultTreeNode("Node 1.1"));
        node00.getChildren().add(new DefaultTreeNode("Node 0.0.0"));
        node00.getChildren().add(new DefaultTreeNode("Node 0.0.1"));
        node01.getChildren().add(new DefaultTreeNode("Node 0.1.0"));
        node10.getChildren().add(new DefaultTreeNode("Node 1.0.0"));
        root.getChildren().add(new DefaultTreeNode("Node 2"));
    }
 
    public TreeNode getRoot() {
        return root;
    }
}
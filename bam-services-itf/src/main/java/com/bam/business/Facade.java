package com.bam.business;


public interface Facade {

	public ClientBusiness getClientBusiness();
	public ArticleBusiness getArticleBusiness();
	public FicheBusiness getFicheBusiness();
	public CategorieBusiness categorieBusiness();
	public CaracteristiqueBusiness caracteristiqueBusiness();
}

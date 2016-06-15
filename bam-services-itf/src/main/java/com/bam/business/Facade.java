package com.bam.business;


public interface Facade {
	public ClientBusiness getClientBusiness();
	public UtilisateurBusiness getUtilisateurBusiness();
	public ArticleBusiness getArticleBusiness();
	public FicheBusiness getFicheBusiness();
	public PanierBusiness getPanierBusiness();
	public CategorieBusiness categorieBusiness();
	public CaracteristiqueBusiness caracteristiqueBusiness();
}

use bamdb;
alter table CLIENT add constraint FK_ASSOCIATION_17 foreign key (ID_UTILISATEUR)
      references UTILISATEUR (ID_UTILISATEUR) on delete restrict on update restrict;

alter table COMMANDE add constraint FK_PASSER foreign key (ID_CLIENT)
      references CLIENT (ID_CLIENT) on delete restrict on update restrict;

alter table COMMENTAIRE add constraint FK_CONCERNE foreign key (ID_ARTICLE) 
      references ARTICLE (ID_ARTICLE) on delete restrict on update restrict;

alter table COMMENTAIRE add constraint FK_FAIT foreign key (ID_CLIENT)
      references CLIENT (ID_CLIENT) on delete restrict on update restrict;

alter table FICHE add constraint FK_POSSEDE foreign key (ID_ARTICLE)
      references ARTICLE (ID_ARTICLE) on delete restrict on update restrict;

alter table LIENS_CATEGORIE_ARTICLE add constraint FK_LIENS_CATEGORIE_ARTICLE foreign key (ID_ARTICLE)
      references ARTICLE (ID_ARTICLE) on delete restrict on update restrict;

alter table LIENS_CATEGORIE_ARTICLE add constraint FK_LIENS_CATEGORIE_ARTICLE2 foreign key (ID_CATEGORIE)
      references CATEGORIE (ID_CATEGORIE) on delete restrict on update restrict;

alter table LIENS_CLIENT_ADRESSE add constraint FK_POSSEDER foreign key (ID_CLIENT)
      references CLIENT (ID_CLIENT) on delete restrict on update restrict;

alter table LIENS_CLIENT_ADRESSE add constraint FK_POSSEDER2 foreign key (ID_ADRESSE)
      references ADRESSE (ID_ADRESSE) on delete restrict on update restrict;

alter table LIENS_COMMANDE_ADRESSE add constraint FK_LIENS_COMMANDE_ADRESSE foreign key (ID_COMMANDE)
      references COMMANDE (ID_COMMANDE) on delete restrict on update restrict;

alter table LIENS_COMMANDE_ADRESSE add constraint FK_LIENS_COMMANDE_ADRESSE2 foreign key (ID_ADRESSE)
      references ADRESSE (ID_ADRESSE) on delete restrict on update restrict;

alter table LIENS_PANIER_ARTICLE add constraint FK_CONTIENT foreign key (IDPANIER)
      references PANIER (IDPANIER) on delete restrict on update restrict;

alter table LIENS_PANIER_ARTICLE add constraint FK_CONTIENT2 foreign key (ID_ARTICLE)
      references ARTICLE (ID_ARTICLE) on delete restrict on update restrict;

alter table LIENS_PROMOTIONS_ARTICLES add constraint FK_LIENS_PROMOTION_ARTICLE foreign key (ID_ARTICLE)
      references ARTICLE (ID_ARTICLE) on delete restrict on update restrict;

alter table LIENS_PROMOTIONS_ARTICLES add constraint FK_LIENS_PROMOTION_ARTICLE2 foreign key (ID_PROMOTION)
      references PROMOTION (ID_PROMOTION) on delete restrict on update restrict;

alter table LIENS_SPECS_ARTICLE add constraint FK_LIENS_CARACTERISTIQUE_ARTIC foreign key (ID_CARACTERISTIQUE)
      references CARACTERISTIQUE (ID_CARACTERISTIQUE) on delete restrict on update restrict;

alter table LIENS_SPECS_ARTICLE add constraint FK_LIENS_CARACTERISTIQUE_ARTI2 foreign key (ID_ARTICLE)
      references ARTICLE (ID_ARTICLE) on delete restrict on update restrict;

alter table LIENS_SPECS_CATEGORIE add constraint FK_LIENS_SPECS_CATEGORIE foreign key (ID_CARACTERISTIQUE)
      references CARACTERISTIQUE (ID_CARACTERISTIQUE) on delete restrict on update restrict;

alter table LIENS_SPECS_CATEGORIE add constraint FK_LIENS_SPECS_CATEGORIE2 foreign key (ID_CATEGORIE)
      references CATEGORIE (ID_CATEGORIE) on delete restrict on update restrict;

alter table LIENS_UTILISATEUR_ROLE add constraint FK_IDENTIFIER2 foreign key (ID_UTILISATEUR)
      references UTILISATEUR (ID_UTILISATEUR) on delete restrict on update restrict;

alter table LIGNE_COMMANDE add constraint FK_LIGNE_COMMANDE foreign key (ID_COMMANDE)
      references COMMANDE (ID_COMMANDE) on delete restrict on update restrict;

alter table LIGNE_COMMANDE add constraint FK_LIGNE_COMMANDE2 foreign key (ID_ARTICLE)
      references ARTICLE (ID_ARTICLE) on delete restrict on update restrict;

alter table LISTE_DE_SOUHAITS add constraint FK_LISTE_DE_SOUHAITS foreign key (ID_ARTICLE)
      references ARTICLE (ID_ARTICLE) on delete restrict on update restrict;

alter table LISTE_DE_SOUHAITS add constraint FK_LISTE_DE_SOUHAITS2 foreign key (ID_CLIENT)
      references CLIENT (ID_CLIENT) on delete restrict on update restrict;

alter table MESSAGE add constraint FK_ENVOIE foreign key (ID_SENDER)
      references UTILISATEUR (ID_UTILISATEUR) on delete restrict on update restrict;

alter table MESSAGE add constraint FK_RECOIT foreign key (ID_RECEIVER)
      references UTILISATEUR (ID_UTILISATEUR) on delete restrict on update restrict;

alter table PANIER add constraint FK_APPARTIENT foreign key (ID_CLIENT)
      references CLIENT (ID_CLIENT) on delete restrict on update restrict;

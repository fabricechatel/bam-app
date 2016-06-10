use bamdb;

alter table APPARTENIR add constraint FK_APPARTENIR foreign key (ID_ARTICLE)
      references ARTICLE (ID_ARTICLE) on delete restrict on update restrict;

alter table APPARTENIR add constraint FK_APPARTENIR2 foreign key (ID_CATEGORIE)
      references CATEGORIE (ID_CATEGORIE) on delete restrict on update restrict;

alter table APPLIQUER add constraint FK_APPLIQUER foreign key (ID_ARTICLE)
      references ARTICLE (ID_ARTICLE) on delete restrict on update restrict;

alter table APPLIQUER add constraint FK_APPLIQUER2 foreign key (ID_PROMOTION)
      references PROMOTION (ID_PROMOTION) on delete restrict on update restrict;

alter table ASSOCIATION_17 add constraint FK_ASSOCIATION_21 foreign key (ID_ARTICLE)
      references ARTICLE (ID_ARTICLE) on delete restrict on update restrict;

alter table ASSOCIATION_17 add constraint FK_ASSOCIATION_22 foreign key (ID_CLIENT)
      references CLIENT (ID_CLIENT) on delete restrict on update restrict;

alter table ASSOCIATION_18 add constraint FK_ASSOCIATION_18 foreign key (ID_COMMANDE)
      references COMMANDE (ID_COMMANDE) on delete restrict on update restrict;

alter table ASSOCIATION_18 add constraint FK_ASSOCIATION_20 foreign key (ID_ARTICLE)
      references ARTICLE (ID_ARTICLE) on delete restrict on update restrict;

alter table CLIENT add constraint FK_APPARTIENT2 foreign key (ID_PANIER)
      references PANIER (ID_PANIER) on delete restrict on update restrict;

alter table CLIENT add constraint FK_ASSOCIATION_17 foreign key (ID_UTILISATEUR)
      references UTILISATEUR (ID_UTILISATEUR) on delete restrict on update restrict;

alter table COMMANDE add constraint FK_PASSER foreign key (ID_CLIENT)
      references CLIENT (ID_CLIENT) on delete restrict on update restrict;

alter table COMMENTAIRE add constraint FK_CONCERNE foreign key (ID_ARTICLE)
      references ARTICLE (ID_ARTICLE) on delete restrict on update restrict;

alter table COMMENTAIRE add constraint FK_FAIT foreign key (ID_CLIENT)
      references CLIENT (ID_CLIENT) on delete restrict on update restrict;

alter table CONTIENT add constraint FK_CONTIENT foreign key (ID_PANIER)
      references PANIER (ID_PANIER) on delete restrict on update restrict;

alter table CONTIENT add constraint FK_CONTIENT2 foreign key (ID_ARTICLE)
      references ARTICLE (ID_ARTICLE) on delete restrict on update restrict;

alter table DEPENDRE add constraint FK_DEPENDRE foreign key (ID_CARACTERISTIQUE)
      references CARACTERISTIQUE (ID_CARACTERISTIQUE) on delete restrict on update restrict;

alter table DEPENDRE add constraint FK_DEPENDRE2 foreign key (ID_CATEGORIE)
      references CATEGORIE (ID_CATEGORIE) on delete restrict on update restrict;

alter table FICHE add constraint FK_POSSEDE foreign key (ID_ARTICLE)
      references ARTICLE (ID_ARTICLE) on delete restrict on update restrict;

alter table MESSAGE add constraint FK_ASSOCIATION_19 foreign key (ID_RECIEVER)
      references UTILISATEUR (ID_UTILISATEUR) on delete restrict on update restrict;

alter table MESSAGE add constraint FK_ENVOIE foreign key (ID_SENDER)
      references UTILISATEUR (ID_UTILISATEUR) on delete restrict on update restrict;

alter table PANIER add constraint FK_APPARTIENT foreign key (ID_CLIENT)
      references CLIENT (ID_CLIENT) on delete restrict on update restrict;

alter table POSSEDER add constraint FK_POSSEDER foreign key (ID_CLIENT)
      references CLIENT (ID_CLIENT) on delete restrict on update restrict;

alter table POSSEDER add constraint FK_POSSEDER2 foreign key (ID_ADRESSE)
      references ADRESSE (ID_ADRESSE) on delete restrict on update restrict;

alter table REGROUPER add constraint FK_REGROUPER foreign key (ID_CARACTERISTIQUE)
      references CARACTERISTIQUE (ID_CARACTERISTIQUE) on delete restrict on update restrict;

alter table REGROUPER add constraint FK_REGROUPER2 foreign key (ID_ARTICLE)
      references ARTICLE (ID_ARTICLE) on delete restrict on update restrict;

alter table UTILISATEUR add constraint FK_ASSOCIATION_16 foreign key (ID_CLIENT)
      references CLIENT (ID_CLIENT) on delete restrict on update restrict;

alter table UTILISATEUR add constraint FK_IDENTIFIER foreign key (ID_ROLE)
      references ROLE (ID_ROLE) on delete restrict on update restrict;
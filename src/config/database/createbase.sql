/*==============================================================*/
/* Nom de SGBD :  MySQL 5.0                                     */
/* Date de création :  09/06/2016 10:48:44                      */
/*==============================================================*/
create schema if not exists bamdb;

use bamdb;

drop table if exists ADRESSE;

drop table if exists APPARTENIR;

drop table if exists APPLIQUER;

drop table if exists ARTICLE;

drop table if exists ASSOCIATION_17;

drop table if exists ASSOCIATION_18;

drop table if exists CARACTERISTIQUE;

drop table if exists CATEGORIE;

drop table if exists CLIENT;

drop table if exists COMMANDE;

drop table if exists COMMENTAIRE;

drop table if exists CONTIENT;

drop table if exists DEPENDRE;

drop table if exists FICHE;

drop table if exists MESSAGE;

drop table if exists PANIER;

drop table if exists POSSEDER;

drop table if exists PROMOTION;

drop table if exists REGROUPER;

drop table if exists ROLE;

drop table if exists UTILISATEUR;

/*==============================================================*/
/* Table : ADRESSE                                              */
/*==============================================================*/
create table ADRESSE
(
   ID_ADRESSE           int not null,
   NUMERO               varchar(16) not null,
   VOIE                 varchar(128) not null,
   CODE_POSTAL          varchar(16) not null,
   VILLE                varchar(64) not null,
   primary key (ID_ADRESSE)
);

/*==============================================================*/
/* Table : APPARTENIR                                           */
/*==============================================================*/
create table APPARTENIR
(
   ID_ARTICLE           int not null,
   ID_CATEGORIE         int not null,
   primary key (ID_ARTICLE, ID_CATEGORIE)
);

/*==============================================================*/
/* Table : APPLIQUER                                            */
/*==============================================================*/
create table APPLIQUER
(
   ID_ARTICLE           int not null,
   ID_PROMOTION         int not null,
   primary key (ID_ARTICLE, ID_PROMOTION)
);

/*==============================================================*/
/* Table : ARTICLE                                              */
/*==============================================================*/
create table ARTICLE
(
   ID_ARTICLE           int not null,
   REF_ARTICLE          varchar(64) not null,
   PRIX_ARTICLE         decimal not null,
   QUANTITE_ARTICLE     int not null,
   IS_SALABLE           bool not null,
   primary key (ID_ARTICLE)
);

/*==============================================================*/
/* Table : ASSOCIATION_17                                       */
/*==============================================================*/
create table ASSOCIATION_17
(
   ID_ARTICLE           int not null,
   ID_CLIENT            int not null,
   primary key (ID_ARTICLE, ID_CLIENT)
);

/*==============================================================*/
/* Table : ASSOCIATION_18                                       */
/*==============================================================*/
create table ASSOCIATION_18
(
   ID_COMMANDE          int not null,
   ID_ARTICLE           int not null,
   QUANTITE_ARTICLE     int,
   PRIX_ARTICLE         decimal,
   STATUT               varchar(16),
   primary key (ID_COMMANDE, ID_ARTICLE)
);

/*==============================================================*/
/* Table : CARACTERISTIQUE                                      */
/*==============================================================*/
create table CARACTERISTIQUE
(
   ID_CARACTERISTIQUE   int not null,
   LIBELLE_CARACTERISTIQUE varchar(128) not null,
   primary key (ID_CARACTERISTIQUE)
);

/*==============================================================*/
/* Table : CATEGORIE                                            */
/*==============================================================*/
create table CATEGORIE
(
   ID_CATEGORIE         int not null,
   IDPARENT             int not null,
   LIBELLE_CATEGORIE    varchar(128) not null,
   primary key (ID_CATEGORIE)
);

/*==============================================================*/
/* Table : CLIENT                                               */
/*==============================================================*/
create table CLIENT
(
   ID_CLIENT            int not null,
   ID_PANIER            int,
   ID_UTILISATEUR       int not null,
   EMAIL                varchar(128) not null,
   NOM                  varchar(64) not null,
   PRENOM               varchar(64) not null,
   CIVILITE             varchar(8) not null,
   STATUT_CLIENT        bool not null,
   primary key (ID_CLIENT)
);

/*==============================================================*/
/* Table : COMMANDE                                             */
/*==============================================================*/
create table COMMANDE
(
   ID_COMMANDE          int not null,
   ID_CLIENT            int not null,
   NUMEROCOMMANDE       varchar(64) not null,
   MONTANT_TOTAL        decimal not null,
   DATE_PAIEMENT        datetime not null,
   IS_CANCELLED         bool not null,
   primary key (ID_COMMANDE)
);

/*==============================================================*/
/* Table : COMMENTAIRE                                          */
/*==============================================================*/
create table COMMENTAIRE
(
   ID_COMMENTAIRE       int not null,
   ID_ARTICLE           int not null,
   ID_CLIENT            int not null,
   NOTE                 decimal not null,
   DATE_COMMENTAIRE     datetime not null,
   IS_APPROVED          bool not null,
   primary key (ID_COMMENTAIRE)
);

/*==============================================================*/
/* Table : CONTIENT                                             */
/*==============================================================*/
create table CONTIENT
(
   ID_PANIER            int not null,
   ID_ARTICLE           int not null,
   QUANTITE_ARTICLE     int,
   primary key (ID_PANIER, ID_ARTICLE)
);

/*==============================================================*/
/* Table : DEPENDRE                                             */
/*==============================================================*/
create table DEPENDRE
(
   ID_CARACTERISTIQUE   int not null,
   ID_CATEGORIE         int not null,
   primary key (ID_CARACTERISTIQUE, ID_CATEGORIE)
);

/*==============================================================*/
/* Table : FICHE                                                */
/*==============================================================*/
create table FICHE
(
   ID_FICHE             int not null,
   ID_ARTICLE           int not null,
   DESCRIPTION          varchar(1024) not null,
   REFFICHE             varchar(32),
   IMAGE                varchar(256),
   IS_PUBLISHED         bool,
   primary key (ID_FICHE)
);

/*==============================================================*/
/* Table : MESSAGE                                              */
/*==============================================================*/
create table MESSAGE
(
   ID_MESSAGE           int not null,
   ID_SENDER            int not null,
   ID_RECIEVER          int not null,
   INTITULE             varchar(64) not null,
   CORPS_MESSAGE        varchar(1024) not null,
   DATE_MESSAGE         date not null,
   STATUT_MESSAGE       bool not null,
   primary key (ID_MESSAGE)
);

/*==============================================================*/
/* Table : PANIER                                               */
/*==============================================================*/
create table PANIER
(
   ID_PANIER            int not null,
   ID_CLIENT            int,
   REF_INTERNAUTE       varchar(64) not null,
   IS_ACTIVE_PANIER     bool not null,
   primary key (ID_PANIER)
);

/*==============================================================*/
/* Table : POSSEDER                                             */
/*==============================================================*/
create table POSSEDER
(
   ID_CLIENT            int not null,
   ID_ADRESSE           int not null,
   IS_POSTAL            bool,
   IS_DELIVERY          bool,
   primary key (ID_CLIENT, ID_ADRESSE)
);

/*==============================================================*/
/* Table : PROMOTION                                            */
/*==============================================================*/
create table PROMOTION
(
   ID_PROMOTION         int not null,
   POURCENTAGE          int not null,
   IS_ACTIVE            bool not null,
   primary key (ID_PROMOTION)
);

/*==============================================================*/
/* Table : REGROUPER                                            */
/*==============================================================*/
create table REGROUPER
(
   ID_CARACTERISTIQUE   int not null,
   ID_ARTICLE           int not null,
   primary key (ID_CARACTERISTIQUE, ID_ARTICLE)
);

/*==============================================================*/
/* Table : ROLE                                                 */
/*==============================================================*/
create table ROLE
(
   ID_ROLE              int not null,
   NOM                  varchar(64) not null,
   primary key (ID_ROLE)
);

/*==============================================================*/
/* Table : UTILISATEUR                                          */
/*==============================================================*/
create table UTILISATEUR
(
   ID_UTILISATEUR       int not null,
   ID_CLIENT            int,
   ID_ROLE              int not null,
   LOGIN                varchar(64) not null,
   MDP                  varchar(64) not null,
   primary key (ID_UTILISATEUR)
);


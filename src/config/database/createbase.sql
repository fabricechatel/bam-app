/*==============================================================*/
/* Nom de SGBD :  MySQL 5.0                                     */
/* Date de cr�ation :  10/06/2016 16:32:57                      */
/*==============================================================*/

create schema if not exists bamdb;

use bamdb;

drop table if exists ADRESSE;

drop table if exists ARTICLE;

drop table if exists CARACTERISTIQUE;

drop table if exists CATEGORIE;

drop table if exists CLIENT;

drop table if exists COMMANDE;

drop table if exists COMMENTAIRE;

drop table if exists FICHE;

drop table if exists LIENS_CATEGORIE_ARTICLE;

drop table if exists LIENS_CLIENT_ADRESSE;

drop table if exists LIENS_COMMANDE_ADRESSE;

drop table if exists LIENS_PANIER_ARTICLE;

drop table if exists LIENS_PROMOTIONS_ARTICLES;

drop table if exists LIENS_SPECS_ARTICLE;

drop table if exists LIENS_SPECS_CATEGORIE;

drop table if exists LIGNE_COMMANDE;

drop table if exists LISTE_DE_SOUHAITS;

drop table if exists MESSAGE;

drop table if exists PANIER;

drop table if exists PROMOTION;

drop table if exists ROLE;

drop table if exists UTILISATEUR;

drop table if exists UTILISATEUR_ROLES;

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
/* Table : ARTICLE                                              */
/*==============================================================*/
create table ARTICLE
(
   ID_ARTICLE           int not null,
   LIBELLE              varchar(128),
   REFARTICLE           varchar(64) not null,
   PRIX                 decimal not null,
   QUANTITESTOCK        int not null,
   VISIBLE              bool,
   primary key (ID_ARTICLE)
);

/*==============================================================*/
/* Table : CARACTERISTIQUE                                      */
/*==============================================================*/
create table CARACTERISTIQUE
(
   ID_CARACTERISTIQUE   int not null,
   ATTRIBUT             varchar(128),
   VALEUR               varchar(128) not null,
   primary key (ID_CARACTERISTIQUE)
);

/*==============================================================*/
/* Table : CATEGORIE                                            */
/*==============================================================*/
create table CATEGORIE
(
   ID_CATEGORIE         int not null,
   IDPARENT             int not null,
   LIBELLE_CATEGORIE    varchar(128),
   ACTIVE               bool,
   primary key (ID_CATEGORIE)
);

/*==============================================================*/
/* Table : CLIENT                                               */
/*==============================================================*/
create table CLIENT
(
   ID_CLIENT            int not null,
   ID_UTILISATEUR       int not null,
   EMAIL                varchar(128) not null,
   NOM                  varchar(64) not null,
   PRENOM               varchar(64) not null,
   CIVILITE             varchar(8) not null,
   ACTIF                bool,
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
   NOTE                 decimal,
   DATE                 datetime,
   VISIBLE              bool,
   primary key (ID_COMMENTAIRE)
);

/*==============================================================*/
/* Table : FICHE                                                */
/*==============================================================*/
create table FICHE
(
   ID_FICHE             int not null,
   ID_ARTICLE           int not null,
   NOM                  varchar(64),
   REFFICHE             varchar(32),
   DESCRIPTION          varchar(1024) not null,
   IMAGE                varchar(256),
   IS_PUBLISHED         bool,
   primary key (ID_FICHE)
);

/*==============================================================*/
/* Table : LIENS_CATEGORIE_ARTICLE                              */
/*==============================================================*/
create table LIENS_CATEGORIE_ARTICLE
(
   ID_ARTICLE           int not null,
   ID_CATEGORIE         int not null,
   primary key (ID_ARTICLE, ID_CATEGORIE)
);

/*==============================================================*/
/* Table : LIENS_CLIENT_ADRESSE                                 */
/*==============================================================*/
create table LIENS_CLIENT_ADRESSE
(
   ID_CLIENT            int not null,
   ID_ADRESSE           int not null,
   primary key (ID_CLIENT, ID_ADRESSE)
);

/*==============================================================*/
/* Table : LIENS_COMMANDE_ADRESSE                               */
/*==============================================================*/
create table LIENS_COMMANDE_ADRESSE
(
   ID_COMMANDE          int not null,
   ID_ADRESSE           int not null,
   ISFACTURATION        bool,
   primary key (ID_COMMANDE, ID_ADRESSE)
);

/*==============================================================*/
/* Table : LIENS_PANIER_ARTICLE                                 */
/*==============================================================*/
create table LIENS_PANIER_ARTICLE
(
   IDPANIER             int not null,
   ID_ARTICLE           int not null,
   QUANTITEPANIER       int,
   primary key (IDPANIER, ID_ARTICLE)
);

/*==============================================================*/
/* Table : LIENS_PROMOTIONS_ARTICLES                            */
/*==============================================================*/
create table LIENS_PROMOTIONS_ARTICLES
(
   ID_ARTICLE           int not null,
   ID_PROMOTION         int not null,
   primary key (ID_ARTICLE, ID_PROMOTION)
);

/*==============================================================*/
/* Table : LIENS_SPECS_ARTICLE                                  */
/*==============================================================*/
create table LIENS_SPECS_ARTICLE
(
   ID_CARACTERISTIQUE   int not null,
   ID_ARTICLE           int not null,
   primary key (ID_CARACTERISTIQUE, ID_ARTICLE)
);

/*==============================================================*/
/* Table : LIENS_SPECS_CATEGORIE                                */
/*==============================================================*/
create table LIENS_SPECS_CATEGORIE
(
   ID_CARACTERISTIQUE   int not null,
   ID_CATEGORIE         int not null,
   primary key (ID_CARACTERISTIQUE, ID_CATEGORIE)
);

/*==============================================================*/
/* Table : LIGNE_COMMANDE                                       */
/*==============================================================*/
create table LIGNE_COMMANDE
(
   ID_COMMANDE          int not null,
   ID_ARTICLE           int not null,
   QUANTITECOMMANDE     int,
   PRIX                 decimal,
   STATUT               varchar(16),
   primary key (ID_COMMANDE, ID_ARTICLE)
);

/*==============================================================*/
/* Table : LISTE_DE_SOUHAITS                                    */
/*==============================================================*/
create table LISTE_DE_SOUHAITS
(
   ID_ARTICLE           int not null,
   ID_CLIENT            int not null,
   primary key (ID_ARTICLE, ID_CLIENT)
);

/*==============================================================*/
/* Table : MESSAGE                                              */
/*==============================================================*/
create table MESSAGE
(
   ID_MESSAGE           int not null,
   ID_SENDER            int not null,
   ID_RECEIVER          int not null,
   INTITULE             varchar(64) not null,
   CORPS_MESSAGE        varchar(1024) not null,
   DATE_MESSAGE         datetime not null,
   LU                   bool,
   primary key (ID_MESSAGE)
);

/*==============================================================*/
/* Table : PANIER                                               */
/*==============================================================*/
create table PANIER
(
   IDPANIER             int not null,
   ID_CLIENT            int,
   REFINTERNAUTE        varchar(64) not null,
   primary key (IDPANIER)
);

/*==============================================================*/
/* Table : PROMOTION                                            */
/*==============================================================*/
create table PROMOTION
(
   ID_PROMOTION         int not null,
   NOM                  varchar(64),
   POURCENTAGE          int not null,
   ACTIVE               bool,
   primary key (ID_PROMOTION)
);

/*==============================================================*/
/* Table : ROLE                                                 */
/*==============================================================*/
create table ROLE
(
   NOMROLE              varchar(64) not null,
   ENABLED              bool not null,
   primary key (NOMROLE)
);

/*==============================================================*/
/* Table : UTILISATEUR                                          */
/*==============================================================*/
create table UTILISATEUR
(
   ID_UTILISATEUR       int not null,
   LOGIN                varchar(64) not null,
   MDP                  varchar(64) not null,
   ACTIF                bool,
   primary key (ID_UTILISATEUR)
);

/*==============================================================*/
/* Table : UTILISATEUR_ROLES                                    */
/*==============================================================*/
create table UTILISATEUR_ROLES
(
   IDUTILISATEURROLE    int not null,
   NOMROLE              varchar(64) not null,
   ID_UTILISATEUR       int not null,
   ENABLED              bool not null,
   primary key (IDUTILISATEURROLE)
);

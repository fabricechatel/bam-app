﻿use bamdb;

ALTER TABLE ADRESSE MODIFY ID_ADRESSE INT(11) AUTO_INCREMENT;
ALTER TABLE ARTICLE MODIFY ID_ARTICLE INT(11) AUTO_INCREMENT;
ALTER TABLE CARACTERISTIQUE MODIFY ID_CARACTERISTIQUE INT(11) AUTO_INCREMENT;
ALTER TABLE CATEGORIE MODIFY ID_CATEGORIE INT(11) AUTO_INCREMENT;
ALTER TABLE CLIENT MODIFY ID_CLIENT INT(11) AUTO_INCREMENT;
ALTER TABLE COMMANDE MODIFY ID_COMMANDE INT(11) AUTO_INCREMENT;
ALTER TABLE COMMENTAIRE MODIFY ID_COMMENTAIRE INT(11) AUTO_INCREMENT;
ALTER TABLE FICHE MODIFY ID_FICHE INT(11) AUTO_INCREMENT;
ALTER TABLE MESSAGE MODIFY ID_MESSAGE INT(11) AUTO_INCREMENT;
ALTER TABLE PANIER MODIFY IDPANIER INT(11) AUTO_INCREMENT;
ALTER TABLE PROMOTION MODIFY ID_PROMOTION INT(11) AUTO_INCREMENT;
ALTER TABLE UTILISATEUR MODIFY ID_UTILISATEUR INT(11) AUTO_INCREMENT;
ALTER TABLE UTILISATEUR_ROLES MODIFY IDUTILISATEURROLE INT(11) AUTO_INCREMENT;
-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  sam. 16 fév. 2019 à 13:33
-- Version du serveur :  10.1.34-MariaDB
-- Version de PHP :  7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `bdproxibanque`
--

-- --------------------------------------------------------

--
-- Structure de la table `agence`
--

CREATE TABLE `agence` (
  `idage` int(11) NOT NULL,
  `datecreaage` date NOT NULL,
  `libelle` varchar(50) NOT NULL,
  `idcon` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `cartebancaire`
--

CREATE TABLE `cartebancaire` (
  `idcar` int(11) NOT NULL,
  `libcar` varchar(25) NOT NULL,
  `idcli` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `idcli` int(11) NOT NULL,
  `nomcli` varchar(25) NOT NULL,
  `precli` varchar(25) NOT NULL,
  `emailcli` varchar(30) NOT NULL,
  `telcli` int(11) NOT NULL,
  `adrcli` varchar(20) NOT NULL,
  `codposcli` varchar(20) NOT NULL,
  `proccli` varchar(20) NOT NULL,
  `vilcli` varchar(20) NOT NULL,
  `idcon` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `comptebancaire`
--

CREATE TABLE `comptebancaire` (
  `idcb` int(11) NOT NULL,
  `numcb` varchar(255) NOT NULL,
  `datouvcb` date NOT NULL,
  `solcb` float NOT NULL,
  `idcar` int(11) NOT NULL,
  `idcli` int(11) NOT NULL,
  `type` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `comptebancaire`
--

INSERT INTO `comptebancaire` (`idcb`, `numcb`, `datouvcb`, `solcb`, `idcar`, `idcli`, `type`) VALUES
(1, '15T2778-proxi', '2019-02-01', 550000, 1, 4, 'visa electron'),
(2, '18Z2258-proxi', '2019-02-05', 100000, 5, 7, 'visa premier');

-- --------------------------------------------------------

--
-- Structure de la table `role`
--

CREATE TABLE `role` (
  `idrole` int(11) NOT NULL,
  `libele` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `role`
--

INSERT INTO `role` (`idrole`, `libele`) VALUES
(1, 'admin'),
(2, 'conseiller'),
(4, 'auditeur');

-- --------------------------------------------------------

--
-- Structure de la table `transaction`
--

CREATE TABLE `transaction` (
  `id` int(11) NOT NULL,
  `numCompte` varchar(255) NOT NULL,
  `montant` float NOT NULL,
  `nature` varchar(255) NOT NULL,
  `date` varchar(30) NOT NULL,
  `heure` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `useraccount`
--

CREATE TABLE `useraccount` (
  `iduse` int(11) NOT NULL,
  `login` varchar(15) NOT NULL,
  `mdp` varchar(20) NOT NULL,
  `role` varchar(255) NOT NULL,
  `nomuser` varchar(255) NOT NULL,
  `prenomuser` varchar(255) NOT NULL,
  `emailuser` varchar(255) NOT NULL,
  `teluser` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `useraccount`
--

INSERT INTO `useraccount` (`iduse`, `login`, `mdp`, `role`, `nomuser`, `prenomuser`, `emailuser`, `teluser`) VALUES
(1, 'brandy', 'bkmelong', 'admin', 'kuete', 'brandol', 'brandol@yahoo.fr', '691469475'),
(2, 'tikita', 'tkmagali', 'conseiller', 'tiki', 'magali', 'tikimagali@yahoo.fr', '698745321'),
(3, 'danny', 'danielpewo', 'conseiller', 'Fouomene', 'Daniel', 'danielfouomene@yahoo.fr', '69874521'),
(4, 'fabrice', 'fbodiong', 'conseiller', 'Bodiong', 'Fabrice', 'fabricebodiong@yahoo.fr', '698745210'),
(5, 'nikeva', 'kklaction', 'conseiller', 'Lactio', 'Kevin', 'kevinkemtalactio@yahoo.fr', '696031631'),
(6, 'ali', 'abdelazizali', 'conseiller', 'Ali', 'Abdel-aziz', 'ali62@gmail.com', '675489851');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `agence`
--
ALTER TABLE `agence`
  ADD PRIMARY KEY (`idage`);

--
-- Index pour la table `cartebancaire`
--
ALTER TABLE `cartebancaire`
  ADD PRIMARY KEY (`idcar`);

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`idcli`);

--
-- Index pour la table `comptebancaire`
--
ALTER TABLE `comptebancaire`
  ADD PRIMARY KEY (`idcb`);

--
-- Index pour la table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`idrole`);

--
-- Index pour la table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `useraccount`
--
ALTER TABLE `useraccount`
  ADD PRIMARY KEY (`iduse`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `agence`
--
ALTER TABLE `agence`
  MODIFY `idage` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `cartebancaire`
--
ALTER TABLE `cartebancaire`
  MODIFY `idcar` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `idcli` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `comptebancaire`
--
ALTER TABLE `comptebancaire`
  MODIFY `idcb` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `role`
--
ALTER TABLE `role`
  MODIFY `idrole` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `transaction`
--
ALTER TABLE `transaction`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `useraccount`
--
ALTER TABLE `useraccount`
  MODIFY `iduse` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

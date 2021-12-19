CREATE TABLE IF NOT EXISTS `client` (
  `id` INT AUTO_INCREMENT PRIMARY KEY,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
);

-- --------------------------------------------------------

--
-- Structure de la table `family`
--
CREATE TABLE IF NOT EXISTS `family` (
  `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `name` varchar(45)  NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `order` (
  `id` INT AUTO_INCREMENT PRIMARY KEY,
  `date_order` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `id_client`INT NOT NULL,
  PRIMARY KEY (`id`));

-- ---------------------------
CREATE TABLE IF NOT EXISTS `order_product` (
  `id_product` INT NOT NULL,
  `id_order` INT NOT NULL
) ;

-- --------------------------------------------------------

--
-- Structure de la table `product`
--

CREATE TABLE IF NOT EXISTS `product` (
  `id` INT AUTO_INCREMENT PRIMARY KEY,
  `name` varchar(250) NOT NULL,
  `id_family` INT NOT NULL,
  `qty` INT NOT NULL,
  PRIMARY KEY (`id`)
) ;

-- --------------------------------------------------------

--
-- Structure de la table `provider`
--

CREATE TABLE IF NOT EXISTS `provider` (
  `id` INT AUTO_INCREMENT PRIMARY KEY,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` INT AUTO_INCREMENT PRIMARY KEY,
  `email` varchar(45)  NOT NULL,
  `password` varchar(250)  NOT NULL,
  `role` varchar(45)  DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;


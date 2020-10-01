DROP DATABASE IF EXISTS heroDB;
CREATE DATABASE heroDB;
USE heroDB;
CREATE TABLE hero(
    heroId INT PRIMARY KEY AUTO_INCREMENT,
    heroDescription VARCHAR(255) NOT NULL,
    superPower VARCHAR(30) NOT NULL
);
CREATE TABLE locations(
    locationId INT PRIMARY KEY AUTO_INCREMENT,
    locationDescription VARCHAR(30) NOT NULL,
    addressInformation VARCHAR(255) NOT NULL,
    lattitude decimal(10,8) NOT NULL, 
    longitude decimal(11,8) NOT NULL
);
CREATE TABLE sightings(
    sightingsId INT PRIMARY KEY AUTO_INCREMENT,
    heroId INT NOT NULL,
    FOREIGN KEY fk_hero_heroId(heroId)
    REFERENCES hero(heroId),
    locationId INT NOT NULL, 
	FOREIGN KEY fk_locations_locationId(locationId)
    REFERENCES locations(locationId),
    date date NOT NULL
);
CREATE TABLE organization(
    organizationId INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL,
    organizationDescription VARCHAR(30) NOT NULL,
    street VARCHAR(30) NOT NULL,
    city VARCHAR(20) NOT NULL, 
    state CHAR(2) NOT NULL, 
    zip CHAR(5) NOT NULL, 
    contactInfo CHAR(12) NOT NULL, 
    MemberType VARCHAR(10) NOT NULL
    ); 
    CREATE TABLE heroLocation( 
    heroId INT PRIMARY KEY NOT NULL, 
	FOREIGN KEY fk_hero_heroId(heroId)
    REFERENCES hero(heroId),
    locationId INT  NOT NULL, 
    FOREIGN KEY fk_locations_locationId(locationId)
    REFERENCES locations(locationId)
    ); 
	CREATE TABLE organizationMembers( 
    organizationId INT PRIMARY KEY NOT NULL, 
	FOREIGN KEY fk_organization_organizationId(organizationId)
    REFERENCES organization(organizationId),
    heroId INT  NOT NULL, 
   FOREIGN KEY fk_hero_heroId(heroId)
    REFERENCES hero(heroId)
    ); 
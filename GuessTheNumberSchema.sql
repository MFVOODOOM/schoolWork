DROP DATABASE IF EXISTS guessTheNumberDB;
CREATE DATABASE guessTheNumberDB;

USE guessTheNumberDB;

CREATE TABLE gametb(
gameID INT auto_increment,
answer char(4) NOT NULL,
gameStatus BOOLEAN DEFAULT false,
primary key(gameID)
);

CREATE TABLE roundtb(
roundID INT auto_increment,
gameID INT,
guess char(4) NOT NULL,
timeOfGuess DATETIME NOT NULL,
resultOfGuess char(7),
primary key(roundID),
foreign key fk_Roundtb_GameID(gameID)
	references gametb(gameID)
);
SELECT * FROM roundtb;
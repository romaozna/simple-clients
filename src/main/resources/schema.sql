DROP TABLE IF EXISTS CLIENTS CASCADE;
DROP TABLE IF EXISTS CONTACTS CASCADE;

CREATE TABLE IF NOT EXISTS CLIENTS (
    ID      INTEGER AUTO_INCREMENT PRIMARY KEY,
    NAME    VARCHAR(25) NOT NULL
);

CREATE TABLE IF NOT EXISTS CONTACTS (
    CONTACT_ID          INTEGER AUTO_INCREMENT PRIMARY KEY,
    CONTACT     VARCHAR(60) UNIQUE NOT NULL,
    TYPE        INTEGER NOT NULL,
    CLIENT_ID   INTEGER,
    FOREIGN KEY (CLIENT_ID) REFERENCES CLIENTS (ID) ON DELETE CASCADE
);



package com.nineinchmales.longcircuit.database;

/**
 * Created by bmaxwell2 on 2/18/16.
 */
public class LongCircuitSQLQueries {

    public static final String CREATE_USERS_TABLE = "CREATE TABLE users"
            + "("
            + "id INT NOT NULL AUTO_INCREMENT,"
            + "name VARCHAR(30),"
            + "password_hash CHAR(64),"
            + "password_salt CHAR(16),"
            + "last_level_unlocked_id INT,"
            + "PRIMARY KEY(id)"
            + ")";

    public static final String CREATE_LEVELS_TABLE = "CREATE TABLE users"
            + "("
            + "id INT NOT NULL AUTO_INCREMENT,"
            + "level_layout TEXT,"
            + "minimum_score INT,"
            + "PRIMARY KEY(id)"
            + ")";

    public static final String CREATE_LEVEL_COMPLETIONS_TABLE = "CREATE TABLE users"
            + "("
            + "id INT NOT NULL AUTO_INCREMENT,"
            + "user_id INT NOT NULL,"
            + "level_id INT NOT NULL,"
            + "PRIMARY KEY(id)"
            + ")";



}

package ru.teti.springcourse.dao;

public class DbConstants {
    public static final String URL = "jdbc:postgresql://localhost:5432/first_db";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "Strong1+7";
    public static final String DELETE_QUERY = "DELETE FROM Person WHERE id=?";
    public static final String UPDATE_QUERY = "UPDATE Person SET name=?, age=?, email=? WHERE id=?";
    public static final String INSERT_QUERY = "INSERT INTO Person VALUES(1, ?, ?, ?)";
    public static final String SELECT_ALL_QUERY = "SELECT * FROM Person";
    public static final String SELECT_BY_ID_QUERY = "SELECT * FROM Person WHERE id=?";
}

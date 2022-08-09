package com.ldangeles;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserDAO {
    final private Connection connection;

    public UserDAO(Connection connection){
        this.connection = connection;
    }

    public List<Video> getAllUserVideos(int owner_id) throws SQLException{
        String sql = "SELECT * FROM videos WHERE owner_id = ?";

        try(PreparedStatement statement = connection.prepareStatement(sql)){
            List<Video> videos = new LinkedList<>();
            statement.setInt(1, owner_id);

            ResultSet rs = statement.executeQuery(sql);


            while(rs.next()){
                String title = rs.getString("title");
                String description = rs.getString("description");
                int duration = rs.getInt("duration");

                Video video = new Video(title, description, duration, owner_id);
                videos.add(video);
            }
            return videos;
        }
    }

    public boolean userSearch(String username) throws SQLException{
        String sql = "SELECT * FROM users WHERE username = ?";
        boolean queryState;

        try(PreparedStatement statement = connection.prepareStatement(sql)){
            ResultSet query;
            statement.setString(1, username);
            query = statement.executeQuery();
            queryState=query.next();
        }

        return queryState;
    }

    public boolean emailSearch(String email) throws SQLException{
        String sql = "SELECT * FROM users WHERE email = ?";
        boolean queryState;

        try(PreparedStatement statement = connection.prepareStatement(sql)){
            ResultSet query;
            statement.setString(1, email);
            query = statement.executeQuery();
            queryState=query.next();
        }

        return queryState;
    }

    public void SignUp(User user) throws SQLException{
        String sql = "INSERT INTO users (username, email, password) values (?, ?, ?)";

        try(PreparedStatement statement = this.connection.prepareStatement(sql)){
            statement.setString(1, user.getUsername());
            statement.setString(2,user.getEmail());
            statement.setString(3,user.getPassword());

            statement.executeUpdate();
        }
    }

    public User LogIn(String email_username, String password) throws SQLException, IllegalAccessException{
        String sql = "SELECT * FROM users WHERE (username = ? OR email = ?) AND password = ?";

        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, email_username);
            statement.setString(2, email_username);
            statement.setString(3, password);

            ResultSet query = statement.executeQuery();

            if (query.next()){
                int id = query.getInt("id");
                String username = query.getString("username");
                String email = query.getString("email");
                return new User(id, username, email, password);
            } else {
                throw new IllegalAccessException();
            }
        }
    }


}

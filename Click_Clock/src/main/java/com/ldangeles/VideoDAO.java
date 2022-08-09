package com.ldangeles;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class VideoDAO {
    final private Connection connection;

    public VideoDAO(Connection connection){
        this.connection = connection;
    }

    public List<Video> getAllUserVideos(int owner_id) throws SQLException{
        String sql = "SELECT * FROM videos WHERE owner_id = ?";

        try(PreparedStatement statement = connection.prepareStatement(sql)){
            List<Video> videos = new LinkedList<>();
            ResultSet rs = statement.executeQuery(sql);
            statement.setInt(1, owner_id);

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

    public boolean searchVideo(int owner_id, String title) throws SQLException{
        String sql = "SELECT * FROM videos WHERE title = ? AND owner_id = ?";
        boolean queryState;

        try(PreparedStatement statement = connection.prepareStatement(sql)){
            ResultSet query;
            statement.setString(1, title);
            statement.setInt(2, owner_id);
            query = statement.executeQuery();
            queryState=query.next();
        }

        return queryState;
    }

    public void publishVideo(Video video) throws SQLException{
        String sql = "INSERT INTO videos (owner_id, title, description, duration) values (?, ?, ?, ?)";

        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, video.getOwner_id());
            statement.setString(2,video.getTitle());
            statement.setString(3,video.getDescription());
            statement.setInt(4,video.getDuration());

            statement.executeUpdate();
        }
    }
}


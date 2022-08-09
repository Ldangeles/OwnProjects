package com.ldangeles;

import java.sql.Connection;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class UserService {

    private User actualUser;
    final private UserDAO userDAO;
    final private VideoDAO videoDAO;

    UserService() throws SQLException {
        Connection connection = DataConnector.connect();
        userDAO = new UserDAO(connection);
        videoDAO = new VideoDAO(connection);}

    public void SignUp(String username, String email, String password) throws IllegalArgumentException, SQLException{

        if (this.userDAO.userSearch(username)) {
            throw new IllegalArgumentException();
        }

        if (this.userDAO.emailSearch(email)) {
            throw new IllegalArgumentException();
        }

        User newUser = new User(username, email, password);

        this.userDAO.SignUp(newUser);
    }

    public void LogIn(String email_username, String password) throws IllegalArgumentException, IllegalAccessException, SQLException{

        if (this.userDAO.userSearch(email_username)) {
            this.actualUser = this.userDAO.LogIn(email_username, password);
        } else if (this.userDAO.emailSearch(email_username)) {
            this.actualUser = this.userDAO.LogIn(email_username, password);
        } else {
            throw new IllegalArgumentException();
        }

    }

    public void postVideo(String title, String description, int duration) throws IllegalArgumentException, SQLException{

        if (this.videoDAO.searchVideo(this.actualUser.getID(), title)) {
            throw new IllegalArgumentException();
        }

        Video newVideo = new Video(title, description, duration, actualUser.getID());
        this.videoDAO.publishVideo(newVideo);
    }

}

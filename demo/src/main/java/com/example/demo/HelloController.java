package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HelloController {

    public Label welcomeText;
    public TextField idField;
    public TextField nameField;
    public TextField addressField;
    public TextField telField;
    private Connection connection;

    public HelloController() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/keels?useSSL=false&allowPublicKeyRetrieval=true";
            String username = "root";
            String password = "Vimu@2164";
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addRecord(ActionEvent actionEvent) {
        try {
            String query = "INSERT INTO customer (id, name, address, tel) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, Integer.parseInt(idField.getText()));
            preparedStatement.setString(2, nameField.getText());
            preparedStatement.setString(3, addressField.getText());
            preparedStatement.setString(4, telField.getText());
            preparedStatement.executeUpdate();

            System.out.println("successfully added");

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
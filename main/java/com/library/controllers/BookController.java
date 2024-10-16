package com.library.controllers;

import com.library.models.Book;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BookController {
    @FXML private TableView<Book> bookTable;
    @FXML private TextField searchField;

    private ObservableList<Book> books = FXCollections.observableArrayList();

    @FXML
    private void handleAddBook() {
        // Implémentation de l'ajout de livre
    }

    @FXML
    private void handleDeleteBook() {
        // Implémentation de la suppression de livre
    }

    @FXML
    private void handleSearch() {
        String searchTerm = searchField.getText().toLowerCase();
        // Implémentation de la recherche
    }

    @FXML
    private void handleSort() {
        // Implémentation du tri
    }
}

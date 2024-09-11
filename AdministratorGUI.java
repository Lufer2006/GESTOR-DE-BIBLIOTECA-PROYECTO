import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AdministratorGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear la interfaz de usuario
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));

        // Título de la pantalla
        Label title = new Label("Administrador de Biblioteca");
        title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        root.getChildren().add(title);

        // Formulario para agregar un libro
        Label bookTitleLabel = new Label("Título del libro:");
        root.getChildren().add(bookTitleLabel);

        TextField bookTitleField = new TextField();
        bookTitleField.setPromptText("Ingrese el título del libro");
        root.getChildren().add(bookTitleField);

        Label bookAuthorLabel = new Label("Autor del libro:");
        root.getChildren().add(bookAuthorLabel);

        TextField bookAuthorField = new TextField();
        bookAuthorField.setPromptText("Ingrese el autor del libro");
        root.getChildren().add(bookAuthorField);

        Button addButton = new Button("Agregar libro");
        addButton.setOnAction(e -> {
            // Lógica para agregar un libro
        });
        root.getChildren().add(addButton);

        // Botones para eliminar y modificar libros
        Button deleteButton = new Button("Eliminar libro");
        deleteButton.setOnAction(e -> {
            // Lógica para eliminar un libro
        });
        root.getChildren().add(deleteButton);

        Button modifyButton = new Button("Modificar libro");
        modifyButton.setOnAction(e -> {
            // Lógica para modificar un libro
        });
        root.getChildren().add(modifyButton);

        // Botón para salir
        Button exitButton = new Button("Salir");
        exitButton.setOnAction(e -> {
            primaryStage.close();
        });
        root.getChildren().add(exitButton);

        Scene scene = new Scene(root, 400, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

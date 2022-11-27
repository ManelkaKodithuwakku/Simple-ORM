package lk.ijse.dep9.orm;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class InitializedDBTest {

    @BeforeAll
    static void beforeAll() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }

    @Test
    void initialize() throws SQLException {
        assertDoesNotThrow(()-> InitializedDB.initialize("localhost","3306","dep9_orm","root","Kasuni@1234","lk.ijse.dep9.orm.entity","lk.ijse.dep9.orm.entity2"));
//        assertDoesNotThrow(()->{
//            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dep9_orm", "root", "Kasuni@1234")) {
//                connection.createStatement().execute("SELECT id,name,address FROM Customer");
//                connection.createStatement().execute("SELECT code,description,qty,unitPrice FROM Item");
//            }
//
//        });
    }
}
package com.library.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseManagerTest {

    @BeforeEach
    public void setUp() {
        DatabaseManager.initializeDatabase();
    }

    @Test
    public void testDatabaseConnection() {
        try (Connection conn = DatabaseManager.getConnection()) {
            assertNotNull(conn);
            assertFalse(conn.isClosed());
        } catch (SQLException e) {
            fail("Should not throw an exception");
        }
    }
}

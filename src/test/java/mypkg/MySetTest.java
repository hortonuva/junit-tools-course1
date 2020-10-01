package mypkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySetTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void add() {
        assertTrue(true);
    }

    @Test
    void addList() {
        assertTrue(false);  // this test will fail!
        //assertTrue(true);
    }

    @Test
    void contains() {
        //assertTrue(false);
        assertTrue(true);  // this test will fail!
    }
}
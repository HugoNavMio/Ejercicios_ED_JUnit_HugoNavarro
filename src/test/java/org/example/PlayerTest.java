package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private Player player;

    @BeforeAll
    static void iniciarSuite() {
        System.out.println("¡Comienzan los tests!");
    }

    @BeforeEach
    void setup() {
        final String nombre = "Antonio";
        final int vida = 50;
        final int ataque = 25;
        player = new Player(nombre, vida, ataque);
    }

    @Test
    void curarSumaVida() {
        player.curar(10);
        assertEquals(60, player.getVida());
    }

    @Test
    void curarNoSuperaMaximo() {
        player.curar(100);
        assertEquals(100, player.getVida());
    }

    @Test
    void curarAUnMuertoNoFunciona() {
        player.recibirDanyo(50);
        player.curar(25);
        assertEquals(0, player.getVida());
    }

    @AfterEach
    void tearDown() {
        player = null;
    }

    @AfterAll
    static void finalizarSuite() {
        System.out.println("¡Finalizan los tests!");
    }
}
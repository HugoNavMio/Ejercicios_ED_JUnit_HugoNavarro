package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void curarSumaVida() {
        Player player = new Player("Marcheli", 50, 25);
        player.curar(10);
        assertEquals(60, player.getVida());
    }
    @Test
    void curarNoSuperaMaximo() {
        Player player2 = new Player("Yandel", 95, 25);
        player2.curar(10);
        assertEquals(100, player2.getVida());
    }
    @Test
    void curarAUnMuertoNoFunciona() {
        Player player3 = new Player("Terrio", 50, 30);
        player3.recibirDanyo(50);
        player3.curar(25);
        assertEquals(0, player3.getVida());
    }
}
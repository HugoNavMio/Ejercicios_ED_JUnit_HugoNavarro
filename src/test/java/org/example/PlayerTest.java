package org.example;

import org.example.Config.Config;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private Player player;

    @BeforeAll
    static void iniciarSuite() {
        System.out.println("¡Comienzan los tests!");
    }

    @Test
    void constructorInicializaInstanciaCorrectamente() {
        assertEquals(Config.PLAYER_NOMBRE, player.getNombre());
        assertEquals(Config.PLAYER_VIDA, player.getVida());
        assertEquals(Config.PLAYER_ATAQUE, player.getAtaque());
    }

    @Test
    void constructorNoPermiteVidaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            player = new Player("Antonio", -50, 25);
        });
    }

    @Test
    void constructorNoPermiteSuperarVidaMaxima() {
        assertThrows(IllegalArgumentException.class, () -> {
            player = new Player("Antonio", 200, 25);
        });
    }

    @Test
    void constructorNoPermiteAtaqueNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            player = new Player("Antonio", 50, -25);
        });
    }

    @Test
    void constructorNoPermiteSuperarAtaqueMaximo() {
        assertThrows(IllegalArgumentException.class, () -> {
            player = new Player("Antonio", 50, 200);
        });
    }

    @Test
    void recibirDanyoNoPermiteVidaNegativa() {
        player.recibirDanyo(player.getVida() + 10);
        assertEquals(0, player.getVida());
    }

    @Test
    void recibirDanyoReduceVida() {
        int danyo = 10;
        player.recibirDanyo(10);
        assertEquals(Config.PLAYER_VIDA - danyo, player.getVida());
    }

    @Test
    void recibirDanyoNoPermiteCantidadNegativa() {
        int danyo = -10;
        assertThrows(IllegalArgumentException.class, () -> player.recibirDanyo(danyo));
    }

    @Test
    void recibirDanyoNoSuperaMaximo() {
        int danyo = 1000;
        assertThrows(IllegalArgumentException.class, () -> player.recibirDanyo(danyo));
    }

    @BeforeEach
    void setup() {
        player = new Player(Config.PLAYER_NOMBRE, Config.PLAYER_VIDA, Config.PLAYER_ATAQUE);
    }

    @AfterEach
    void tearDown() {
        player = null;
    }

    @Test
    void curarSumaVida() {
        player.curar(10);
        assertEquals(60, player.getVida());
    }

    @Test
    void curarNoSuperaMaximo() {
        player.curar(player.getVida());
        assertEquals(100, player.getVida());
    }

    @Test
    void curarAUnMuertoNoFunciona() {
        player.recibirDanyo(50);
        player.curar(25);
        assertEquals(0, player.getVida());
    }

    @AfterAll
    static void finalizarSuite() {
        System.out.println("¡Finalizan los tests!");
    }
}
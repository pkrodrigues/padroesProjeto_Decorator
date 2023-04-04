import org.designpattern.structural.classes.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoomTest {
    @Test
    void deveRetornarValorQuarto(){
        Room room = new BasicRoom(80.0f);
        assertEquals(80.0f, room.getPrice());
    }

    @Test
    void deveRetornarValorQuartoComSuite(){
        Room room = new Suite(new BasicRoom(80.0f));
        assertEquals(130.0f, room.getPrice());
    }

    @Test
    void deveRetornarValorQuartoComArCondicionado(){
        Room room = new ArCondicionado(new BasicRoom(80.0f));
        assertEquals(120.0f, room.getPrice());
    }

    @Test
    void deveRetornarValorQuartoComTV(){
        Room room = new TV(new BasicRoom(80.0f));
        assertEquals(100.0f, room.getPrice());
    }
    @Test
    void deveRetornarValorQuartoComSuiteMaisArCondicionado(){
        Room room = new ArCondicionado(new Suite(new BasicRoom(80.0f)));
        assertEquals(170.0f, room.getPrice());
    }
    @Test
    void deveRetornarValorQuartoComSuiteMaisTV(){
        Room room = new TV(new Suite(new BasicRoom(80.0f)));
        assertEquals(150.0f, room.getPrice());
    }

    @Test
    void deveRetornarValorQuartoComSuiteMaisArCondicionadoMaisTV(){
        Room room = new TV (new ArCondicionado(new Suite(new BasicRoom(80.0f))));
        assertEquals(190.0f, room.getPrice());
    }

    @Test
    void deveRetornarDescricaoQuarto() {
        Room room = new BasicRoom();
        assertEquals("Básico", room.getDescricao());
    }
    @Test
    void deveRetornarDescricaoQuartoComSuite() {
        Room room = new Suite(new BasicRoom());
        assertEquals("Básico com Suíte", room.getDescricao());
    }

    @Test
    void deveRetornarDescricaoQuartoComArcondicionado() {
        Room room = new ArCondicionado(new BasicRoom());
        assertEquals("Básico com Ar Condicionado", room.getDescricao());
    }

    @Test
    void deveRetornarDescricaoQuartoComTV() {
        Room room = new TV(new BasicRoom());
        assertEquals("Básico com TV", room.getDescricao());
    }

    @Test
    void deveRetornarDescricaoQuartoComArcondicionadoComTV() {
        Room room = new TV(new ArCondicionado(new BasicRoom()));
        assertEquals("Básico com Ar Condicionado com TV", room.getDescricao());
    }

    @Test
    void deveRetornarDescricaoQuartoComArcondicionadoComSuite() {
        Room room = new Suite(new ArCondicionado(new BasicRoom()));
        assertEquals("Básico com Ar Condicionado com Suíte", room.getDescricao());
    }

    @Test
    void deveRetornarDescricaoQuartoComArcondicionadoComSuiteComTV() {
        Room room = new TV (new Suite(new ArCondicionado(new BasicRoom())));
        assertEquals("Básico com Ar Condicionado com Suíte com TV", room.getDescricao());
    }
}

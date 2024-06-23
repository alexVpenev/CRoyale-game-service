package CRoyale.game_service;

import CRoyale.game_service.service.GameService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class GameServiceApplicationTests {

    @Autowired
    private GameService gameService;

    @Test
    void testNotAdd() {
//        when(exampleService.getOne()).thenReturn(2);

        int result = gameService.add(12,1);
        assertNotEquals(2, result);
    }

}

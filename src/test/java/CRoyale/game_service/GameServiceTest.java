package CRoyale.game_service;

import CRoyale.game_service.service.ExampleService;
import CRoyale.game_service.service.GameService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Example;

import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GameServiceTest {
//    @InjectMocks
    @Autowired
    private GameService gameService;

//    @Mock
//    private ExampleService exampleService;

    @Test
    void testAdd() {
//        when(exampleService.getOne()).thenReturn(2);

        int result = gameService.add(1,1);
        assertEquals(2, result);
    }
}

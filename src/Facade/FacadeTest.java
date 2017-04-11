package Facade;

import org.junit.Test;

/**
 * Created by leonardo on 11/04/17.
 */
public class FacadeTest {

    @Test
    public void test(){
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(
                new Amplifier(),
                new Tuner(),
                new DvdPlayer(),
                new CdPlayer(),
                new Projector(),
                new TheaterLights(),
                new Screen(),
                new PopcornPopper());

        homeTheaterFacade.watchMovie("The Godfather");
    }
}

/*
1- GameController adında bir interface oluşturun.
 */
interface GameController {
    void open();
    void shutdown();
    boolean isOpen();
    void addController();
    void playGame();
}

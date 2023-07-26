public class Main {
    public static void main(String[] args) {

        // Xbox kullanımı
        Xbox xbox = new Xbox();
        xbox.addController();
        xbox.open();
        xbox.playGame();
        xbox.shutdown();

        // Playstation kullanımı
        Playstation playstation = new Playstation();
        playstation.addController();
        playstation.open();
        playstation.playGame();
        playstation.shutdown();

        // Kontrolcuyu bilgisayara bağlama
        GameController controller = new XboxController(); // PlaystationController() 'da olabilir, bilgisayar hangi konsolun kontrolcüsüne bağlanacaksa.
        Computer computer = new Computer(controller);
        computer.addController();
        computer.open();
        computer.playGame();
        computer.shutdown();
    }
}

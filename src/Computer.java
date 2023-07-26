/*
3- Xbox, Playstation ve Computer adında 3 sınıf oluşturun.
 */
class Computer {
    private GameController controller;

    public Computer(GameController controller) {
        this.controller = controller;
    }

    /*
     Bu sınıflarda addController metodu olsun
     */
    public void addController() {
        System.out.println("Kontrolcü bilgisayara eklendi.");
    }

    /*
    Bu sınıfların open ve shutdown metotları olsun.
     */
    public void open() {
        controller.open();
    }

    /*
    Bu sınıfların open ve shutdown metotları olsun.
     */
    public void shutdown() {
        controller.shutdown();
    }

    /*
    Bu sınıflarda playGame metodu olsun ve tüm classlar için konsola “oyun başladı” yazsın. Eğer cihaz kapalıysa zaten kapalıdır exception u fırlatın.
     */
    public void playGame() {
        if (!controller.isOpen()) {
            throw new RuntimeException("Kontrolcü açık değil.");
        }

        System.out.println("Oyun başladı.");
    }
}
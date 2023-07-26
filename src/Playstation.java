/*
3- Xbox, Playstation ve Computer adında 3 sınıf oluşturun.
 */
class Playstation {
    private GameController controller;

    public Playstation() {
        controller = new PlaystationController();
    }

    /*
 Bu sınıflarda addController metodu olsun
 */
    public void addController() {
        System.out.println("Playstation kontrolcüsü eklendi.");
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
            throw new RuntimeException("Playstation kontrolcüsü açık değil.");
        }

        System.out.println("Oyun başladı.");
    }
}

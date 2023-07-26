/*
3- Xbox, Playstation ve Computer adında 3 sınıf oluşturun.
 */
class Xbox {
    private GameController controller;

    public Xbox() {
        controller = new XboxController();
    }

    /*
 Bu sınıflarda addController metodu olsun
 */
    public void addController() {
        System.out.println("Xbox kontrolcüsü eklendi.");
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
            throw new RuntimeException("Xbox kontrolcüsü açık değil.");
        }

        System.out.println("Oyun başladı.");
    }
}
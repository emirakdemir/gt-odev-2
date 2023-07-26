/*
2- GameController interface'ini Xbox ve Playstation için implemente eden iki adet class yazın.
 */
class PlaystationController implements GameController {
    private boolean isOpen;

    /*
    Bu sınıfların open ve shutdown metotları olsun. Eğer açıksa ve open metodu çalıştırılıyorsa
zaten açık gibi bir exception fırlatın. Ya da kapalıysa, cihaz kapalıdır mesajını fırlatın.
     */
    @Override
    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Playstation kontrolcüsü açıldı.");
        } else {
            throw new RuntimeException("Playstation kontrolcüsü zaten açık.");
        }
    }

    /*
Bu sınıfların open ve shutdown metotları olsun. Eğer açıksa ve open metodu çalıştırılıyorsa
zaten açık gibi bir exception fırlatın. Ya da kapalıysa, cihaz kapalıdır mesajını fırlatın.
 */
    @Override
    public void shutdown() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Playstation kontrolcüsü kapatıldı. \n");
        } else {
            throw new RuntimeException("Playstation kontrolcüsü zaten kapalı.");
        }
    }

    @Override
    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public void addController() {
        System.out.println("Playstation kontrolcüsü eklendi.");
    }

    @Override
    public void playGame() {
        if (!isOpen) {
            throw new RuntimeException("Playstation kontrolcüsü açık değil.");
        }

        System.out.println("Oyun başladı.");
    }
}
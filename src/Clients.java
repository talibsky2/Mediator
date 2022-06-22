public class Clients implements Info{
    InfoMethod infoMethod;

    public Clients(InfoMethod infoMethod) {
        this.infoMethod = infoMethod;
    }

    @Override
    public void sendInfo(double versionNumber) {
        System.out.println("Request");
    }

    @Override
    public void getInfo(double versionNumber) {
        System.out.println("A new version available: " + versionNumber + "." + " Please update it");
    }
}

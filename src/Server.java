public class Server implements Info{
    InfoMethod infoMethod;

    public Server(InfoMethod infoMethod) {
        this.infoMethod = infoMethod;
    }

    @Override
    public void sendInfo(double versionNumber) {
        infoMethod.sendInfo(versionNumber, this);
    }

    @Override
    public void getInfo(double versionNumber) {
        System.out.println("A new version : " + versionNumber + "." + "ready to upload");
    }
}

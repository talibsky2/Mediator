import java.util.ArrayList;
import java.util.List;

public class Informer implements InfoMethod{
    Info server;
    List<Info> clients = new ArrayList<>();

    public void setServer(Info server) {
        this.server = server;
    }
    public void addClient (Info c){
        clients.add(c);
    }

    @Override
    public void sendInfo(double versionNumber, Info user) {
        server.getInfo(versionNumber);

        for (Info c : clients){
            c.getInfo(versionNumber);
        }

    }
}

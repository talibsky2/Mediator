public class Test {
    public static void main(String[] args) {
        Informer informer = new Informer();

        Info server = new Server(informer);
        Info client = new Clients(informer);
        Info client1 = new Clients(informer);
        Info client2 = new Clients(informer);

        informer.setServer(server);
        informer.addClient(client);
        informer.addClient(client1);
        informer.addClient(client2);

        client.sendInfo(2.25);
        server.sendInfo(2.25);

    }
}
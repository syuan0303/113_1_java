import java.net.http.WedSocket;
import java.util.ArrayList;

public class ClientQueue {
    private ArrayList<Client> clients = new ArrayList<>();
    private ClientListener listener = new ClientListener()  {
        @Override
        public void clientAdded(ClientEvent event) {
            System.out.println("Client added: " + event.getName());
        }

        @Override
        public void clientPayed(ClientEvent event) {
        System.out.println("Client payed: " + event.getName());
        }

        @Override
        public void clientRemoved(ClientEvent event) {
            System.out.println("Client remved: " + event.getName());
        }
    };

    public  ArrayLis<Client>getClients(){
        return clients;
    }


   // public void addClientListener(ClientListener listener) {
    //    listeners.add(listener);
   // }
    
    public void enqueue(Client client) {
        clients.add(client);
            ClientEvent event = new ClientEvent(client) ;
            listener.clientAdded(event);
        }

    
    public void remove(Client client) {
        clients.remove(client);
        var event = new ClientEvent(client);
      for(var i =0;i<listeners.size();i++){
        var listener =(ClientListener) listeners.get(i);
        listener.clientRemoved(event);
    }
}
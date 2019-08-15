package cfx;

import cfx.salutation.SalutImpl;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String args[]) throws InterruptedException {
        SalutImpl implementor = new SalutImpl();
        String address = "http://localhost:8085/salutation";
        Endpoint.publish(address, implementor);
        Thread.sleep(60 * 1000);
        System.exit(0);
    }
}

package za.co.marlonmagonjo;

/**
     S - Single Responsibility Principle -
            A class should have one and only one reason to change

     O - Open Closed Principle -
            Objects or entities should be open for extension but closed for modification

     L - Liskov Substitution Principle
            Objects of super class shall be replaced with objects of subclasses - new code or features must not break existing fuctionality

     I - Interface Segregation Principle
            A client should never be forced to implement an interface that it does not use

     D - Dependency Inversion Principle
            High level modules should not directly depend on low level modules, instead they should depend on abstractions.

 */

// Application Layer - High Level Module
class MyMessenger {
    ProtocolHandler protocolHandler;

    public MyMessenger(String protocol){
        protocolHandler = ProtocolHandlerFactory.getProtocol(protocol);
    }

    public void send(String client, String message){
        protocolHandler.sendMessage("Message to " + client + " - " + message);
    }
}

interface ProtocolHandler {
    void sendMessage(String message);
}

// Transport Layer - Low Level Module
class TCPProtocolHandler implements ProtocolHandler{
    public void sendMessage(String message){
        System.out.println("Sending message from TCPProtocolHandler - " + message);
    }
}

class UDPProtocolHandler implements ProtocolHandler{
    public void sendMessage(String message){
        System.out.println("Sending message from UDPProtocolHandler - " + message);
    }
}

class ProtocolHandlerFactory {

    public static ProtocolHandler getProtocol(String protocol) {
        if("TCP".equalsIgnoreCase(protocol)){
            return new TCPProtocolHandler();
        }
        if("UDP".equalsIgnoreCase(protocol)){
            return new UDPProtocolHandler();
        }
        return null;
    }
}
public class DependencyInversionPrinciple {
    public static void main(String[] args) {
    MyMessenger myMessenger = new MyMessenger("UDP");
    myMessenger.send("Client1", "Communication initiated");
    }
}

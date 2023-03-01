package za.co.marlonmagonjo;

class Service1{
    public void s1(){
        System.out.println("Service1");
    }
}

class Service2{
    public void s2(){
        System.out.println("Service2");
    }
}

class Service3{
    public void s3(){
        System.out.println("Service3");
    }
}

class ServiceFacade{
    Service1 service1 = new Service1();
    Service2 service2 = new Service2();
    Service3 service3 = new Service3();

    public void unifiedFacadeService(){
        service1.s1();
        service2.s2();
        service3.s3();
    }
}
public class FacadeDesignPattern {

    public static void main(String[] args) {
        // client - without Facade Design Pattern
        Service1 service1 = new Service1();
        service1.s1();
        Service2 service2 = new Service2();
        service2.s2();
        Service3 service3 = new Service3();
        service3.s3();
        System.out.println("========================");

        // client - with Facade Design Pattern
        ServiceFacade serviceFacade = new ServiceFacade();
        serviceFacade.service3.s3();
        serviceFacade.service1.s1();
        serviceFacade.service2.s2();
        System.out.println("*************************");

        // client - calling all services at once with Facade Design Pattern
        serviceFacade.unifiedFacadeService();
    }
}

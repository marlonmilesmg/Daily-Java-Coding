package za.co.marlonmagonjo.packages.demo.service;

import java.util.UUID;

// Visibility only within package
class AccountInternalService {
    public String generateAccountID(){
        return UUID.randomUUID().toString();
    }
}

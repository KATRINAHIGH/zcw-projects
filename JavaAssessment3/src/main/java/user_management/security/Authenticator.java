package user_management.security;

import user_management.User;

public class Authenticator {

    public static boolean authenticate(User user, String passwordToCheck) {

        return false;
    }
}



//    Authenticator should have one static method authenticate. This method will take arguments User user and
//        String passwordToCheck then return a boolean. If the password matches the user's password, then return true,
//        else return false.
package user_management.security;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import java.util.Base64;


public class Password {
    //http://fm4dd.com/security/secure_password_hashing_java.htm
    //http://www.baeldung.com/sha-256-hashing-java
    private final static int workload = 12;
    private final static String weakSalt = "I_AM_NOT_SECURE";
    private String hash;

    public Password(String password) {
        this.hash = hashPassword(password);
    }

    public static String hashPassword(String password_plaintext) {
        // salt = generateSalt(workload)
        // hash = hasher.hash(password, salt)
        // return hash

        byte[] hashBytes = (weakSalt + password_plaintext).getBytes();
        HashFunction sha256 = Hashing.sha256();

        for (int i = 0; i < workload; i++) {
            hashBytes = sha256.hashBytes(hashBytes).asBytes();
        }

        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(hashBytes);
    }

    public boolean matches(String password_plaintext) {
        // Note: normally a match method would include a check to see if the hash is valid but for this exam we will
        //       assume that all the passwords we will check are valid. All of the password hashes in the users.json
        //       file are valid so there should be no worry about this as long as you don't overwrite them manually.

        // hashToCheckAgainst = this.hash
        // hasher.check(password, hashToCheckAgainst)
        // return true if check is true
        // return false if check is false
        return this.hash.equals(hashPassword(password_plaintext));
    }

    public String getHash() {

        return this.hash;
    }
}





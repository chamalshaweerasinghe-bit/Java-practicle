class AuthenticationMethod {
    public void authenticate() {
        System.out.println("Authenticating user...");
    }
}

class PasswordAuthentication extends AuthenticationMethod {
    @Override
    public void authenticate() {
        System.out.println("User authenticated using Password Authentication.");
    }
}

class FingerprintAuthentication extends AuthenticationMethod {
    @Override
    public void authenticate() {
        System.out.println("User authenticated using Fingerprint Authentication.");
    }
}

class FaceRecognitionAuthentication extends AuthenticationMethod {
    @Override
    public void authenticate() {
        System.out.println("User authenticated using Face Recognition Authentication.");
    }
}

public class Main10 {
    public static void main(String[] args) {

        AuthenticationMethod[] methods = {
            new PasswordAuthentication(),
            new FingerprintAuthentication(),
            new FaceRecognitionAuthentication()
        };

        System.out.println("Cyber Security Authentication System");

        for (AuthenticationMethod method : methods) {
            method.authenticate(); 
        }
    }
}
package ch11.sec06;

public class InsufficientException extends RuntimeException {
    public InsufficientException() {
        super("Insufficient balance exception");
    };

    public InsufficientException(String msg) {
        super(msg);
    }
}

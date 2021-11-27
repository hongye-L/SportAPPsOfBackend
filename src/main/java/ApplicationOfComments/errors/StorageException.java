package ApplicationOfComments.errors;

/**
 * The type Storage exception.
 * @author 竑也
 */
public class StorageException extends RuntimeException{

    /**
     * Instantiates a new Storage exception.
     *
     * @param message the message
     */
    public StorageException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Storage exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}

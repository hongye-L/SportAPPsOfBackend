package ApplicationOfComments.errors;

/**
 * The type Storage file not found exception.
 */
public class StorageFileNotFoundException extends StorageException{
    /**
     * Instantiates a new Storage file not found exception.
     *
     * @param message the message
     */
    public StorageFileNotFoundException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Storage file not found exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

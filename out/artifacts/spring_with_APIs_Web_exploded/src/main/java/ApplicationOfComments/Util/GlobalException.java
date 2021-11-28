package ApplicationOfComments.Util;

/**
 * The type Global exception.
 */
public class GlobalException extends Exception{
    private static final long serialVersionUID = -238091758285157331L;

    private String code;
    private String message;

    /**
     * Instantiates a new Global exception.
     */
    public GlobalException() {
        super();
    }

    /**
     * Instantiates a new Global exception.
     *
     * @param message the message
     */
    public GlobalException(String message) {
        super(message);
        this.message = message;
    }

    /**
     * Instantiates a new Global exception.
     *
     * @param code    the code
     * @param message the message
     */
    public GlobalException(String code, String message) {
        super(code + ": " + message);
        this.code = code;
        this.message = message;
    }

    /**
     * Instantiates a new Global exception.
     *
     * @param message   the message
     * @param throwable the throwable
     */
    public GlobalException(String message, Throwable throwable) {
        super(message, throwable);
        this.message = message;
    }

    /**
     * Instantiates a new Global exception.
     *
     * @param throwable the throwable
     */
    public GlobalException(Throwable throwable) {
        super(throwable);
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return code + ": " + message;
    }
}

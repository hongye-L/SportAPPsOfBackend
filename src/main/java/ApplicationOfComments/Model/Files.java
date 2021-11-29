package ApplicationOfComments.Model;

/**
 * The type Files.
 * @author 竑也
 */
public class Files {
    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;

    /**
     * Instantiates a new Files.
     */
    public Files() {
    }

    /**
     * Instantiates a new Files.
     *
     * @param fileName        the file name
     * @param fileDownloadUri the file download uri
     * @param fileType        the file type
     * @param size            the size
     */
    public Files (String fileName, String fileDownloadUri, String fileType, long size) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }

    /**
     * Gets file name.
     *
     * @return the file name
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets file name.
     *
     * @param fileName the file name
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Gets file download uri.
     *
     * @return the file download uri
     */
    public String getFileDownloadUri() {
        return fileDownloadUri;
    }

    /**
     * Sets file download uri.
     *
     * @param fileDownloadUri the file download uri
     */
    public void setFileDownloadUri(String fileDownloadUri) {
        this.fileDownloadUri = fileDownloadUri;
    }

    /**
     * Gets file type.
     *
     * @return the file type
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets file type.
     *
     * @param fileType the file type
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public long getSize() {
        return size;
    }

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(long size) {
        this.size = size;
    }
}

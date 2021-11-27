package ApplicationOfComments.Util;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The type File property.
 */
@ConfigurationProperties(prefix = "file")
public class FileProperty {
    private String filePath;

    /**
     * Gets file path.
     *
     * @return the file path
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets file path.
     *
     * @param filePath the file path
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}

package ApplicationOfComments.Service;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.Resource;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * The interface Storage service.
 */
public interface StorageService {
    /**
     * Init.
     */
    void init();

    /**
     * Store.
     *
     * @param file the file
     */
    void store(MultipartFile file);

    /**
     * Load all stream.
     *
     * @return the stream
     */
    Stream<Path> loadAll();

    /**
     * Load path.
     *
     * @param filename the filename
     * @return the path
     */
    Path load(String filename);

    /**
     * Load as resource resource.
     *
     * @param filename the filename
     * @return the resource
     */
    Resource loadAsResource(String filename);

    /**
     * Delete all.
     */
    void deleteAll();
}

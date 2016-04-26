package org.wso2.carbon.uuf.fileio;

import org.wso2.carbon.uuf.core.create.FileReference;
import org.wso2.carbon.uuf.core.create.LayoutReference;

import java.nio.file.Path;

public class ArtifactLayoutReference implements LayoutReference {
    private final Path path;
    private final ArtifactComponentReference componentReference;

    public ArtifactLayoutReference(Path path, ArtifactComponentReference componentReference) {
        this.path = path;
        this.componentReference = componentReference;
    }

    @Override
    public String getName() {
        return path.getFileName().toString();
    }

    @Override
    public FileReference getRenderingFile() {
        return new ArtifactFileReference(path, componentReference);
    }
}
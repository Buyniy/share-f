package ru.share.file.service;

import org.springframework.core.io.FileSystemResource;
import ru.share.file.entity.AppDocument;
import ru.share.file.entity.AppPhoto;
import ru.share.file.entity.BinaryContent;

public interface FileService {
    AppDocument getDocument(String id);

    AppPhoto getPhoto(String id);

    FileSystemResource getFileSystemResource(BinaryContent binaryContent);
}

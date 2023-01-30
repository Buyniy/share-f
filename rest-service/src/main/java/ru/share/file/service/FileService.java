package ru.share.file.service;

import ru.share.file.entity.AppDocument;
import ru.share.file.entity.AppPhoto;

public interface FileService {
    AppDocument getDocument(String id);

    AppPhoto getPhoto(String id);
}

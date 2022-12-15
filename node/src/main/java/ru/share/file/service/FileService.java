package ru.share.file.service;

import org.telegram.telegrambots.meta.api.objects.Message;
import ru.share.file.entity.AppDocument;
import ru.share.file.entity.AppPhoto;

public interface FileService {
    AppDocument processDoc(Message externalMessage);
    AppPhoto processPhoto(Message externalMessage);
}

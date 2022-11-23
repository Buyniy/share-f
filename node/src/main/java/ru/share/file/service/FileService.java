package ru.share.file.service;

import org.telegram.telegrambots.meta.api.objects.Message;
import ru.share.file.entity.AppDocument;

public interface FileService {
    AppDocument processDoc(Message externalMessage);
}

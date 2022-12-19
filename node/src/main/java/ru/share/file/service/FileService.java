package ru.share.file.service;

import org.telegram.telegrambots.meta.api.objects.Message;
import ru.share.file.entity.AppDocument;
import ru.share.file.entity.AppPhoto;
import ru.share.file.service.enums.LinkType;

public interface FileService {
    AppDocument processDoc(Message externalMessage);
    AppPhoto processPhoto(Message externalMessage);
    String generateLink(Long docId, LinkType linkType);
}

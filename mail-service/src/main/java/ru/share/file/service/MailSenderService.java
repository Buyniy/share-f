package ru.share.file.service;

import ru.share.file.dto.MailParams;

public interface MailSenderService {
    void send(MailParams mailParams);
}

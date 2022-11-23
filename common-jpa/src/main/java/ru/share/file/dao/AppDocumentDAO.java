package ru.share.file.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.share.file.entity.AppDocument;

public interface AppDocumentDAO extends JpaRepository<AppDocument, Long> {
}

package ru.share.file.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.share.file.entity.BinaryContent;

public interface BinaryContentDAO extends JpaRepository<BinaryContent, Long> {
}

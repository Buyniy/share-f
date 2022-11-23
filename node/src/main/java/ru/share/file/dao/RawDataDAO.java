package ru.share.file.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.share.file.entity.RawData;

public interface RawDataDAO extends JpaRepository<RawData, Long> {
}

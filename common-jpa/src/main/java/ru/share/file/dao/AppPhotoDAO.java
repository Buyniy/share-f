package ru.share.file.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.share.file.entity.AppPhoto;

public interface AppPhotoDAO extends JpaRepository<AppPhoto, Long> {
}

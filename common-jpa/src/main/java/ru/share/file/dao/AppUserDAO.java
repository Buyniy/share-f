package ru.share.file.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.share.file.entity.AppUser;

public interface AppUserDAO extends JpaRepository<AppUser, Long> {
    AppUser findAppUserByTelegramUserId(Long id);
}

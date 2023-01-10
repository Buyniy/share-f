package ru.share.file.service;

import ru.share.file.entity.AppUser;

public interface AppUserService {
    String registerUser(AppUser appUser);

    String setEmail(AppUser appUser, String email);
}

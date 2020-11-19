package org.wz.service;

import org.springframework.stereotype.Service;
import org.wz.entity.User;

@Service
public interface UserService {
    User getUser(String id);
}

package org.wz.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.wz.entity.User;

@Mapper
@Repository
public interface UserDao {
    User getUserById(String id);
}

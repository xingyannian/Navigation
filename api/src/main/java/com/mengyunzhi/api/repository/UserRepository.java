package com.mengyunzhi.api.repository;

import com.mengyunzhi.api.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by XINGYANNIAN on 2018/8/22.
 */
public interface UserRepository extends CrudRepository<User,Long> {
}

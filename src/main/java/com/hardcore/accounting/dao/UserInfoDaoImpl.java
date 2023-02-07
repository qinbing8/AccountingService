package com.hardcore.accounting.dao;

import com.hardcore.accounting.model.persistence.UserInfo;

import org.springframework.stereotype.Repository;

@Repository
public class UserInfoDaoImpl implements UserInfoDao {
    @Override
    public UserInfo getUserInfoById(Long id) {
        return null;
    }

    @Override
    public void createNewUser(Long id, String name) {

    }
}

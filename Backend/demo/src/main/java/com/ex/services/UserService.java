package com.ex.services;

import com.ex.Dao.Userdao;
import com.ex.Objects.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jeremy on 9/8/2017.
 */
@Component
public class UserService implements Service<User> {

    @Autowired
    Userdao dao;

    @Override
    public User findOne(User user) {
        return dao.findOne(user.getuserId());
    }

    @Override
    public User insert(User user) {
        return dao.save(user);
    }

    @Override
    public User delete(User user) {
         dao.delete(user);
         return user;
    }

    @Override
    public User update(User user) {
        return dao.save(user);
    }

    public User findById(Integer id){
         return dao.findOne(id);
    }

    public User loginUser(String username, String password){
        User u = dao.findByUserName(username);
        if(u == null){
            return null;
        }else{
            if(password.equals(u.getPassWord())){
                return u;
            }
            else{
                return null;
            }
        }
    }

    public boolean usernameInUse(String username){
        User u = dao.findByUserName(username);
        if(u==null) {
            return false;
        }else{
            return true;
        }
    }

    public List<User> findAll(){
       return dao.findAll();
    }
}



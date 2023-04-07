package com.company.service.impl;

import com.company.dto.UserDTO;
import com.company.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl extends AbstractMapService<UserDTO,String> implements UserService {
    @Override
    public UserDTO save(UserDTO user) {
        return super.save(user.getUserName(),user);
    }

    @Override
    public UserDTO findById(String userName) {
        return super.findByID(userName);
    }

    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String userName) {
        super.deleteByID(userName);
    }

    @Override
    public void update(UserDTO user) {
        super.update(user.getUserName(), user);
    }

    @Override
    public List<UserDTO> findManagers() {
        return findAll().stream().filter(user->user.getRole().getId()==2).collect(Collectors.toList());
    }
}

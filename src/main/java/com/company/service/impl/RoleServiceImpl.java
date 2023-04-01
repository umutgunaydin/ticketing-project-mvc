package com.company.service.impl;

import com.company.dto.RoleDTO;
import com.company.service.RoleService;

import java.util.List;

public class RoleServiceImpl extends AbstractMapService<RoleDTO,Long> implements RoleService {
    @Override
    public RoleDTO save(RoleDTO role) {
        return super.save(role.getId(),role);
    }

    @Override
    public RoleDTO findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);
    }
}

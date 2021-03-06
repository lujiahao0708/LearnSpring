package com.hellodev.service.impl;

/**
 * @author lujiahao
 * @date 2019-07-21 13:05
 */

import com.hellodev.dao.DeptDao;
import com.hellodev.entities.Dept;
import com.hellodev.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }
}

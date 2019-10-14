package com.lujiahao.shirofirst.chapter6.dao;


import com.lujiahao.shirofirst.chapter6.entity.Permission;

/**
 * @author lujiahao
 * @date 2019-06-26 17:00
 */
public interface PermissionDao {

    Permission createPermission(Permission permission);

    void deletePermission(Long permissionId);
}

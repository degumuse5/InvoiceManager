package io.invoicemanager.invoicemanager.service;

import io.invoicemanager.invoicemanager.domain.Role;

import java.util.Collection;


public interface RoleService {
    Role getRoleByUserId(Long id);
    Collection<Role> getRoles();
}

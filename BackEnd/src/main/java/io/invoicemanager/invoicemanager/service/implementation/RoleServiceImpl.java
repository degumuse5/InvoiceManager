package io.invoicemanager.invoicemanager.service.implementation;

import io.invoicemanager.invoicemanager.domain.Role;
import io.invoicemanager.invoicemanager.repository.RoleRepository;
import io.invoicemanager.invoicemanager.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository<Role> roleRoleRepository;

    @Override
    public Role getRoleByUserId(Long id) {
        return roleRoleRepository.getRoleByUserId(id);
    }

    @Override
    public Collection<Role> getRoles() {
        return roleRoleRepository.list();
    }
}

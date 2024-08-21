package io.invoicemanager.invoicemanager.utils;

import io.invoicemanager.invoicemanager.domain.UserPrincipal;
import io.invoicemanager.invoicemanager.dto.UserDTO;
import org.springframework.security.core.Authentication;


public class UserUtils {
    public static UserDTO getAuthenticatedUser(Authentication authentication) {
        return ((UserDTO) authentication.getPrincipal());
    }

    public static UserDTO getLoggedInUser(Authentication authentication) {
        return ((UserPrincipal) authentication.getPrincipal()).getUser();
    }
}

package io.invoicemanager.invoicemanager.service;

import io.invoicemanager.invoicemanager.enumeration.VerificationType;



public interface EmailService {
    void sendVerificationEmail(String firstName, String email, String verificationUrl, VerificationType verificationType);
}

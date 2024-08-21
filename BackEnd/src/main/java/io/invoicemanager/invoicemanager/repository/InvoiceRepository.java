package io.invoicemanager.invoicemanager.repository;

import io.invoicemanager.invoicemanager.domain.Invoice;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface InvoiceRepository extends PagingAndSortingRepository<Invoice, Long>, ListCrudRepository<Invoice, Long> {}

package com.uploader.project.repository;

import com.uploader.project.model.ContactInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactInformationRepository extends JpaRepository<ContactInformation, String> {
}

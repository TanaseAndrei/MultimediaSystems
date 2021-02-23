package com.uploader.project.service.implementations;

import com.uploader.project.dto.ContactUsDto;
import com.uploader.project.model.ContactInformation;
import com.uploader.project.repository.ContactInformationRepository;
import com.uploader.project.service.ContactUsService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ContactUsServiceImpl implements ContactUsService {

    private final ContactInformationRepository contactInformationRepository;

    private final ModelMapper modelMapper;

    @Override
    public void saveInformations(ContactUsDto contactUsDto) {
        ContactInformation contactInformation = modelMapper.map(contactUsDto, ContactInformation.class);
        contactInformationRepository.save(contactInformation);
    }
}

package com.uploader.project.service.implementations;

import com.uploader.project.model.Image;
import com.uploader.project.repository.ImageRepository;
import com.uploader.project.service.ImageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@AllArgsConstructor
public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;

    @Override
    public void saveImage(MultipartFile multipartFile) {

    }

    @Override
    public List<Image> getImages() {
        return null;
    }
}

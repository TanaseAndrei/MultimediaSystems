package com.uploader.project.service.implementations;

import com.uploader.project.model.Image;
import com.uploader.project.repository.ImageRepository;
import com.uploader.project.service.ImageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Service
@AllArgsConstructor
public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;

    @Override
    public void saveImage(MultipartFile multipartFile) throws IOException {
        Image image = new Image();
        image.setData(multipartFile.getBytes());
        image.setName(multipartFile.getName());
        image.setType(multipartFile.getContentType());
        imageRepository.save(image);
    }

    @Override
    public List<String> getImages() {
        List<Image> images = imageRepository.findAll();
        List<String> converted = new ArrayList<>();
        for(Image image : images) {
            converted.add(Base64.getMimeEncoder().encodeToString(image.getData()));
        }

        return converted;
    }
}

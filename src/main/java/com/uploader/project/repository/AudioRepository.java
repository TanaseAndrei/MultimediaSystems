package com.uploader.project.repository;

import com.uploader.project.model.Audio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AudioRepository extends JpaRepository<Audio, String> {
}

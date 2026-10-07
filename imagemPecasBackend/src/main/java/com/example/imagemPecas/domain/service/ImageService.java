package com.example.imagemPecas.domain.service;

import com.example.imagemPecas.domain.entity.Image;
import com.example.imagemPecas.domain.enums.ImageExtension;

import java.util.Optional;
import java.util.List;

public interface ImageService {
    Image save (Image image);

    Optional<Image> getById(String id);

    List<Image> search(ImageExtension extension, String query);
}

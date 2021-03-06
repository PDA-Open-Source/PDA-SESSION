package com.socion.session.service;

import com.socion.session.dto.ResponseDTO;
import org.springframework.web.multipart.MultipartFile;

public interface UploadService {

    public ResponseDTO uploadContentToS3(MultipartFile file);

    public ResponseDTO deleteContent(String fileName);
}

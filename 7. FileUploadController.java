package com.codealpha.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/upload")
public class FileUploadController {

    private static final List<String> ALLOWED_TYPES =
            Arrays.asList("png", "jpg", "pdf");

    @PostMapping
    public ResponseEntity<String> uploadFile(
            @RequestParam("file") MultipartFile file)
            throws IOException {

        String filename = file.getOriginalFilename();

        String extension =
                filename.substring(filename.lastIndexOf('.') + 1);

        if (!ALLOWED_TYPES.contains(extension)) {

            return ResponseEntity
                    .badRequest()
                    .body("Invalid File Type");
        }

        file.transferTo(new File("uploads/" + filename));

        return ResponseEntity.ok("File Uploaded Successfully");
    }
}

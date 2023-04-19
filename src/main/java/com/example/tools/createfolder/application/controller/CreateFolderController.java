package com.example.tools.createfolder.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.tools.createfolder.application.service.CreateFolderService;

@RestController
public class CreateFolderController {
	@Autowired
	public CreateFolderService createFolderService;

	@GetMapping("/createFolder")
	public Boolean createFolder(@RequestParam(value = "path", defaultValue = "C:\\Users\\redma\\work") String path,
			@RequestParam(value = "fileNumber", defaultValue = "1~100") String fileNumber) {
		return createFolderService.createFolder(path, fileNumber);
	}
}
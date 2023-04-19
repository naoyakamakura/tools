package com.example.tools.createfolder.application.service;

import org.springframework.stereotype.Service;

import com.example.tools.createfolder.domain.CreateFolder;

@Service
public class CreateFolderService {

	public boolean createFolder(String path, String fileNumber) {
		CreateFolder createFolder = new CreateFolder(path, fileNumber);
		boolean result = createFolder.createFolder();

		return result;
	}

}

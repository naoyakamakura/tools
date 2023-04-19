package com.example.tools.createfolder.application.domain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.lang3.StringUtils;

import lombok.Data;

@Data
public class CreateFolder {
	public final String path;
	public final String fileNumber;

	public CreateFolder(String path, String fileNumber) {
		this.validate(path, fileNumber);
		this.path = path;
		this.fileNumber = fileNumber;
	}

	private void validate(String path, String fileNumber) {
		StringBuilder eroorMsgBuilder = new StringBuilder();
		//必須チェック
		this.validateRequired(path, fileNumber);
	}

	private void validateRequired(String path, String fileNumber) {
		//必須チェック
		StringBuilder eroorMsg = new StringBuilder();
		if (StringUtils.isBlank(path)) {
			eroorMsg.append("パスを指定してください" + StringUtils.LF);
		}
		if (StringUtils.isBlank(fileNumber)) {
			eroorMsg.append("ファイル名を指定してください" + StringUtils.LF);
		}

		if (StringUtils.isNotBlank(eroorMsg)) {
			throw new IllegalArgumentException(StringUtils.remove(eroorMsg.toString(), StringUtils.LF));
		}
	}

	public boolean createFolder() {
		Path targetPath = Paths.get(this.path + "//test//aaa");

		try {
			Files.createDirectory(targetPath);
			return true;
		} catch (IOException e) {
			System.out.println(e);
			return false;
		}

	}
}

package com.example.tools.test;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Greeting {
	private final long id;
	private final String content;
}
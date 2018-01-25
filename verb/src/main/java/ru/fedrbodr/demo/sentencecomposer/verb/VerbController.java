package ru.fedrbodr.demo.sentencecomposer.verb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerbController {
	@Value("${words}")
	String initWords;

	@GetMapping("/")
	public @ResponseBody String getWord() {
		String[] wordArray = initWords.split(",");
		int i = (int) Math.round(Math.random() * (wordArray.length - 1));
		return wordArray[i];
	}
}

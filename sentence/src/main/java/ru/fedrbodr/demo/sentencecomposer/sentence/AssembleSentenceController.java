package ru.fedrbodr.demo.sentencecomposer.sentence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssembleSentenceController {
	@Autowired
	private DiscoveryClient discoveryClient;
}

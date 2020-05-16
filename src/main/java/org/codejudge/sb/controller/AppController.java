package org.codejudge.sb.controller;

import org.codejudge.sb.model.AddParameter;
import org.codejudge.sb.model.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class AppController {

	@ApiOperation("This is the hello world api")
	@PostMapping("/add")
	public ResponseEntity<Response> hello(@RequestBody AddParameter request) {

		Response result = new Response();
		result.setSum(request.getNumber1() + request.getNumber2());
		return ResponseEntity.ok(result);
	}

}

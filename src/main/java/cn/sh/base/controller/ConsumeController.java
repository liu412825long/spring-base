package cn.sh.base.controller;

import cn.sh.base.service.ConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConsumeController {
	@Autowired
	private ConsumeService consumeService;

}

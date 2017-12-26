package com.goodyhlee.photoal.photoal.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Nomad
 * Date: 2017. 12. 26.
 * Time: PM 4:54
 * Copyright Coupang. All rights reserved.
 */

@Controller
public class PhotoUploadController {

    @GetMapping("/photoUpload")
    public String photoUpload() {

        return "PhotoUpload";
    }

}

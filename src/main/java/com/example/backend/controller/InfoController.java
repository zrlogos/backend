package com.example.backend.controller;


import com.example.backend.entity.Info;
import com.example.backend.mapper.InfoMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/getInfo")
public class InfoController {
    @Resource
    InfoMapper infoMapper;

    @GetMapping
    public List<Info> getInfo() {
        return infoMapper.findALL();
    }
    @GetMapping("/findBySname")
    @CrossOrigin(origins = "http://localhost:5102")
    public List<Info> findBySname(@RequestParam("sname") String sname) {
        return infoMapper.findBySname(sname);
    }

}

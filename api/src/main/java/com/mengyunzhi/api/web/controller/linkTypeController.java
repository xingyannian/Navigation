package com.mengyunzhi.api.web.controller;

import com.mengyunzhi.api.entity.LinkType;
import com.mengyunzhi.api.service.LinkTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by XINGYANNIAN on 2018/8/23.
 */
@Controller
@RequestMapping("/admin/linkType")
public class linkTypeController {
    @Autowired
    private LinkTypeService linkTypeService;
    @GetMapping("")
    public String linkTypeList(Model model){
        List<LinkType> linkTypeList = linkTypeService.findCommentLinkType();
        model.addAttribute("data",linkTypeList);
        return "admin/linkType";
    }
}

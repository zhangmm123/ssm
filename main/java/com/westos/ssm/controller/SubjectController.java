package com.westos.ssm.controller;

import com.westos.ssm.bean.Subject;
import com.westos.ssm.service.SubjectServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2018/8/29.
 */
@Controller
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectServiceInterface subjectServiceInterface;

    /**
     * 显示所有的新闻类别
     * @return
     */
    @RequestMapping("/listsubject")
    @ResponseBody
    public List<Subject> listAllSubject(){
        return subjectServiceInterface.listAllSubject();
    }

    @RequestMapping(value = "/addsubject",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Subject saveSubject(@RequestBody Subject subject){
        return subjectServiceInterface.saveSubject(subject);
    }

    @RequestMapping(value = "/updatesubject",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Subject updateSubject(@RequestBody Subject subject){
        return subjectServiceInterface.updateSubject(subject);
    }

    @RequestMapping(value = "/removesubject",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Subject removeSubject(@RequestBody Subject subject){
        return subjectServiceInterface.removeSubject(subject);
    }


}

package com.westos.ssm.service;

import com.westos.ssm.bean.Subject;

import java.util.List;

/**
 * Created by Administrator on 2018/8/29.
 */
public interface SubjectServiceInterface {
    List<Subject> listAllSubject();
    Subject saveSubject(Subject subject);
    Subject updateSubject(Subject subject);
    Subject removeSubject(Subject subject);
}

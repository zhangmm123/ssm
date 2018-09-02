package com.westos.ssm.dao;

import com.westos.ssm.bean.Subject;

import java.util.List;

/**
 * Created by Administrator on 2018/8/29.
 */
public interface SubjectDao {
    List<Subject> listAllSubject();
    Integer saveSubject(Subject subject);
    Integer updateSubject(Subject subject);
    Integer removeSubject(Subject subject);
}

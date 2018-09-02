package com.westos.ssm.service;

import com.westos.ssm.bean.Subject;
import com.westos.ssm.dao.SubjectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/8/29.
 */
@Service
public class SubjectServiceImpl implements SubjectServiceInterface {

    @Autowired
    private SubjectDao subjectDao;

    @Override
    public List<Subject> listAllSubject() {
        return subjectDao.listAllSubject();
    }

    @Override
    public Subject saveSubject(Subject subject) {
        subjectDao.saveSubject(subject);
        return subject;
    }

    @Override
    public Subject updateSubject(Subject subject) {
        subjectDao.updateSubject(subject);
        return subject;
    }

    @Override
    public Subject removeSubject(Subject subject) {
        subjectDao.removeSubject(subject);
        return subject;
    }
}

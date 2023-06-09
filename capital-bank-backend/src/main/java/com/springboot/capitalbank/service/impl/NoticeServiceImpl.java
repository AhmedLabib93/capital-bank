package com.springboot.capitalbank.service.impl;

import com.springboot.capitalbank.model.Notice;
import com.springboot.capitalbank.repository.NoticeRepository;
import com.springboot.capitalbank.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeRepository noticeRepository;

    @Override
    public List<Notice> getNotices() {
        List<Notice> notices = noticeRepository.findAllActiveNotices();
        return notices;
    }
}

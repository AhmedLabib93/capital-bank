package com.springboot.capitalbank.repository;

import com.springboot.capitalbank.model.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NoticeRepository  extends JpaRepository<Notice, Integer> {

    @Query(value = "from Notice n where CURDATE() BETWEEN noticBegDt AND noticEndDt")
    List<Notice> findAllActiveNotices();
}

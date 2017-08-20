package com.szl.springboot.entity;

import java.math.BigDecimal;

public class TStudentScore {
    private Long id;

    private Long studentId;

    private Long timetableId;

    private BigDecimal score;

    private String memo;
    /**
     * 成绩表和课程表是一对一的关系
     * 故此pojo有一个课程表的pojo对象
     */
    private TTimetable tTimetable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getTimetableId() {
        return timetableId;
    }

    public void setTimetableId(Long timetableId) {
        this.timetableId = timetableId;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

	public TTimetable gettTimetable() {
		return tTimetable;
	}

	public void settTimetable(TTimetable tTimetable) {
		this.tTimetable = tTimetable;
	}
}
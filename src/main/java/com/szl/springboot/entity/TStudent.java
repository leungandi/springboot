package com.szl.springboot.entity;

import java.util.List;

public class TStudent {
    private Long id;

    private String name;

    private String email;

    private Byte sex;

    private String memo;
    
    /**
     * 学生表和学生信息表是一对一的关系
     * 故此pojo有一个学生信息的pojo对象
     */
    private TStudentIfno tsStudentIfno;
    
    /**
     * 学生表和成绩表是一对多的关系,也就是一个学生有多门学科的成绩
     * 故此pojo有一个成绩表的List对象
     */
    private List<TStudentScore> tStudentScore;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

	public TStudentIfno getTsStudentIfno() {
		return tsStudentIfno;
	}

	public void setTsStudentIfno(TStudentIfno tsStudentIfno) {
		this.tsStudentIfno = tsStudentIfno;
	}

	public List<TStudentScore> gettStudentScore() {
		return tStudentScore;
	}

	public void settStudentScore(List<TStudentScore> tStudentScore) {
		this.tStudentScore = tStudentScore;
	}
}
package com.project.model;

public class SubjectVO {

	private String 과정;
	private String 전공명;
	private String 과목유헝;
	private String 수강년도;
	private String 학기;
	private String 과목명;
	private String 취득학점;
	private String 성적;
	private String 재수강여부;

	public SubjectVO(String 과정, String 전공명, String 과목유헝, String 수강년도, String 학기, String 과목명, String 취득학점, String 성적,
			String 재수강여부) {
		super();
		this.과정 = 과정;
		this.전공명 = 전공명;
		this.과목유헝 = 과목유헝;
		this.수강년도 = 수강년도;
		this.학기 = 학기;
		this.과목명 = 과목명;
		this.취득학점 = 취득학점;
		this.성적 = 성적;
		this.재수강여부 = 재수강여부;
	}

	public String get과정() {
		return 과정;
	}

	public void set과정(String 과정) {
		this.과정 = 과정;
	}

	public String get전공명() {
		return 전공명;
	}

	public void set전공명(String 전공명) {
		this.전공명 = 전공명;
	}

	public String get과목유헝() {
		return 과목유헝;
	}

	public void set과목유헝(String 과목유헝) {
		this.과목유헝 = 과목유헝;
	}

	public String get수강년도() {
		return 수강년도;
	}

	public void set수강년도(String 수강년도) {
		this.수강년도 = 수강년도;
	}

	public String get학기() {
		return 학기;
	}

	public void set학기(String 학기) {
		this.학기 = 학기;
	}

	public String get과목명() {
		return 과목명;
	}

	public void set과목명(String 과목명) {
		this.과목명 = 과목명;
	}

	public String get취득학점() {
		return 취득학점;
	}

	public void set취득학점(String 취득학점) {
		this.취득학점 = 취득학점;
	}

	public String get성적() {
		return 성적;
	}

	public void set성적(String 성적) {
		this.성적 = 성적;
	}

	public String get재수강여부() {
		return 재수강여부;
	}

	public void set재수강여부(String 재수강여부) {
		this.재수강여부 = 재수강여부;
	}

	@Override
	public String toString() {
		return "SubjectVO [과정=" + 과정 + ", 전공명=" + 전공명 + ", 과목유헝=" + 과목유헝 + ", 수강년도=" + 수강년도 + ", 학기=" + 학기 + ", 과목명="
				+ 과목명 + ", 취득학점=" + 취득학점 + ", 성적=" + 성적 + ", 재수강여부=" + 재수강여부 + "]";
	}

}

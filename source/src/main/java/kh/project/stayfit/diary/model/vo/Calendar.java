package kh.project.stayfit.diary.model.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Calendar {
	private String title;
	private String start;
	private String end;
	private String backgroundColor;
	private String borderColor;
	private String textColor;
	private String emotImg;
}

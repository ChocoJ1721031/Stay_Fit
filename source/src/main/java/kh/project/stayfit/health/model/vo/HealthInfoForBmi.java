package kh.project.stayfit.health.model.vo;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Component
public class HealthInfoForBmi {
	private String gender; // 성별 
	private String age; // 연령
	private int stature; // 키
	private int weight; // 체중
	private String bmi_index; // 당신의 BMI 지수
}

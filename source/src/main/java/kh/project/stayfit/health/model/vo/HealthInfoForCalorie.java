package kh.project.stayfit.health.model.vo;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Component
public class HealthInfoForCalorie {
	private String bmr; // ���ʴ�緮
	private String activityMetabolicRate; // Ȱ����緮
	private String digestionEnergy; // ��ȭ�� ���� ������
	private String age; // ����
	private String sex; // ����
	private String stature; // Ű
	private String weight; // ������
	private String goal_weight; // ��ǥ ü��
}

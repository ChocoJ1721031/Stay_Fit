package kh.project.stayfit.admin.model.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import oracle.sql.TIMESTAMP;

@ToString
@Getter
@Setter
public class AdminBoardReply {//��뿩�� ����ڱ� ���� 
	//�Ű��۸��������
//	"MID"	NUMBER		NOT NULL,
//	"RID"	NUMBER		NOT NULL,
//	"REPID"	NUMBER		NOT NULL,
//	"RCREATE"	TIMESTAMP	DEFAULT CURRENT_TIMESTAMP	NOT NULL
	private int mid;
	private int rid;
	private int repid;
	private TIMESTAMP rcreate; //String?? oracle.sql?? java.sql??

}

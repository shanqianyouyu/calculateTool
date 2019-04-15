package qmx.Entity.boltCal;

/**
 * 
 * @author 孙超
 *
 */

/*	所有的值
 *	Nbv		抗剪承载力
 *  nv		剪切面数目
 *  d		螺栓杆直径
 *  fbv		螺栓抗剪强度设计值
 *  Nbc		承压承载力
 *  tmin	连接接头一侧承压构件总厚度的较小值
 *  fbc		螺栓孔壁承压强度设计值
 *  Nbmin	单栓抗剪承载力
 *  n		需螺栓数
 *  
 *  并列：
 *  	a	主板（西格马）
 *  	净界面强度:
 *  		An1
 *  			f		钢材强度设计值
 *  			d0		螺栓孔直径
 *  			n1		1-1	截面上的螺栓数
 *  			b		主板宽度
 *  			t		主板厚度
 *  		An2
 *  			f		钢材强度设计值
 *  			d0		螺栓孔直径
 *  			n2		2-2	截面上的螺栓数
 *  			b1		拼接板宽度
 *  			t		拼接板板厚度
 *  	
 * 	错列：
 * 		a	主板（西格马）
 * 		An1 1-1		截面
 * 		An2	1'-1'	截面
 * 		f	钢材强度设计值
 * 		d0	螺栓孔直径
 * 		m	危险截面上的螺栓数
 * 		b	主板强度
 * 		t	主板厚度
 * 
 * 	拼接板强度验算
 * 		a	（西格马）
 * 		An1		2-2		截面
 * 		An2		2'-2' 	截面
 * 		f		钢材强度设计值
 * 		d0		螺栓孔直径
 * 		m		危险截面上的螺栓数
 * 		b1		拼接板宽度
 * 		t1		拼接板厚度
 */

/*
 * 底层输入
 * nv		剪切面数目
 * d		螺栓杆直径
 * fbv		螺栓抗剪强度设计值
 * tmin		连接接头一侧承压构件总厚度的较小值
 * fbc		螺栓孔壁承压强度设计值
 * 
 * 
 * 计算值
 * 
 */

public class Common {
	//底层输入
	private int  nv;
	private double d;
	private double fbv;
	private double tmin;
	private double fbc;
	
	//计算值
	private double Nbv;
	private double Nbc;
	private double Nbmin;
}

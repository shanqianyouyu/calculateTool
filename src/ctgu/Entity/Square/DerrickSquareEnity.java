package ctgu.Entity.Square;

import java.lang.reflect.Field;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import lombok.Data;

/**
 * 
 * @author 陈煜昆
 *
 */
@Data
public class DerrickSquareEnity {
/*	所有参数
	 * 输入参数
		 *	G		货物重量
		 *  p		货物被拉偏角度
		 *  k		控制绳对地夹角
	
	 * 输出参数
		 *  FT		滑轮组的拉力
		 *  FK		控制绳的张力
	
	* 输入参数
		 *	N		绳索数
		 *  MZ		摩阻系数

	 * 输出参数
		 *  FQ		牵引绳张力

	 * 输出参数
		 *  DO      顶滑轮的倾角
		 *  FH      顶滑轮的载荷
	
	* 输入参数
		 *	Q		货物被拉偏角度

	 * 输出参数   
		 *  GO      滑轮组加绳索重量
		 
	* 输入参数
		 *	JF      计算风压
		 *  JGB		间隔比
		 *  L       抱杆总长
		 *  L0               非变截面段总长
		 *  S       标准节截面外皮长
		 *  J       杆间截面边长
		 *  Z       主材单肢计算长度

	 * 输出参数
		 *  JYV     结构迎风面充实率
		 *  DZ      挡风折减系数
		 *  ZF		总风力系数
		 *  TS		构件垂直于风向的实体迎风面积
		 *  FL      风力
		 *  QH      风荷载
		 *  M		当风载作用于危险截面时弯矩
	* 中间变量	
		 *  LL1               无名
		 *  LL2               无名
		 *  LL3		无名
		 *  LL4		无名
	* 输入参数
		 * GZ       抱杆自重

	 * 输出参数
		 *  FB      外拉线张力
		 *  GN      杆身轴压力
	
	* 输入参数
		 * TD		承托绳对地夹角

	 * 输出参数
		 *  FC      承托绳最大张力
	
	* 输入参数
		 * IX1		惯性矩
		 * Z0		重心距
		 * AS       主材截面积
		 * L1                  计算长度

	 * 输出参数
		 *  IX      截面惯性矩
		 *  IR		回转半径
		 *  W		抗弯模量
		 *  YX		长细比
		 *  Y0X     换算长细比是否小于120
	
	* 输入参数
		 * w1		由换算长细比查表得b类截面轴心受压构件的稳定系数
		 * GA		杆身截面积
	
	* 输出参数
		 *  AY      安全系数
	
	* 输入参数
		 * DZ1		单肢计算长度
		 * JL		截面外皮长
		 * HR		截面最大回转半径
		 * XO		斜缀条与柱轴线夹角		
	
	* 输出参数
		 *  DCB     单肢长细比
	
	* 输入参数
		 * LJJ		 两槽钢净距
	
	* 输出参数
		 *  ND     单肢轴压力
		 *  DW	        单肢稳定系数
		 *  DWA	        单肢稳定安全系数		
	
	* 输入参数
		 * C		总风力系数
		 * P		计算风压
		 * FS		设计强度
		 * FQ1		屈服强度
	
	* 输出参数
		 *  LX     计算长度
		 *  V1             风载引起的斜缀条剪力
		 *  V2	        纵向弯曲引起的横向剪力
		 *  XCB	        斜缀条长细比
		 *  XAX	        查表斜缀条稳定系数
		 *  WA	        稳定安全系数
	
		 
	
*/
	
	public Double G;
	public Double p;
	public Double K;
	
	public Double FT;
	public Double FK;
	
	public Double N;
	public Double MZ;
	
	public Double FQ;
	public Double DO;
	public Double FH;
	
	public Double Q;
	public Double GO;
	
	public Double JF;
	public Double JGB;
	public Double L;
	public Double L0;
	public Double S;
	public Double J;
	public Double Z;
	 
	public Double JYV;
	public Double DZ;
	public Double ZF;
	public Double TS;
	public Double FL;
	public Double QH;
	public Double M;
	
	public Double DO1;
	public Double GZ;
	public Double FB;
	public Double GN;
	public Double TD;
	public Double FC; 
	 
	public Double IX1;
	public Double Z0;
	public Double AS;
	public Double L1;
	
	public Double LL1;
	public Double LL2;
	public Double LL3;
	public Double LL4;
	
	public Double IX;
	public Double IR;
	public Double W;
	public Double YX;
	public Double Y0X;
	 
	 public Double w1;
	 public Double GA;
	 
	 public Double AY;
	 
	 public Double DZ1;
	 
	 public Double JL;
	 public Double HR;
	 public Double XO;
	
	public Double DCB;
	 
	public Double LJJ; 
	
	
	public Double ND;
	public Double DW;
	public Double DWA;
	
	
	public Double C; 
	public Double P;
	public Double FS;
	public Double FQ1;
	
	public Double LX; 
	public Double V1;
	public Double V2;
	public Double XCB;
	public Double XAX;
	public Double WA;
	public Double B;
	public Double btn1=1.0;
	public Double O1;
	public String getEntityName() {
		return "正方形格构抱杆计算";
	}
}

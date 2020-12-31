package ctgu.Entity.Square;

import java.lang.reflect.Field;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import ctgu.awt.util.Tool;
import lombok.Data;

/**
 * 
 * @author 陈煜昆
 *
 */
@Data
public class DerrickSquareSteelEnity {
	/*
	 * 所有参数 输入参数 G 货物重量 p 货物被拉偏角度 k 控制绳对地夹角
	 * 
	 * 输出参数 FT 滑轮组的拉力 FK 控制绳的张力
	 * 
	 * 输入参数 N 绳索数 MZ 摩阻系数 固定的
	 * 
	 * 输出参数 FQ 牵引绳张力
	 * 
	 * 输出参数 DO 顶滑轮的倾角 FH 顶滑轮的载荷
	 * 
	 * 输入参数 Q 货物被拉偏角度
	 * 
	 * 输出参数 GO 滑轮组加绳索重量
	 * 
	 * 输入参数 JF 计算风压 JGB 间隔比 L 抱杆总长 L0 非变截面段总长 S 标准截截面外皮长 J 杆间截面边长 Z 主材单肢计算长度
	 * 
	 * 输出参数 JYV 结构迎风面充实率 DZ 挡风折减系数 ZF 总风力系数 TS 构件垂直于风向的实体迎风面积 FL 风力 QH 风荷载 M
	 * 当风载作用于危险截面时弯矩 中间变量 LL1 无名 LL2 无名 LL3 无名 LL4 无名 输入参数 GZ 抱杆自重
	 * 
	 * 输出参数 FB 外拉线张力 GN 杆身轴压力
	 * 
	 * 输入参数 TD 承托绳对地夹角
	 * 
	 * 输出参数 FC 承托绳最大张力
	 * 
	 * 输入参数 IX1 惯性矩 Z0 重心距 AS 主材截面积 L1 计算长度
	 * 
	 * 输出参数 IX 截面惯性矩 IR 回转半径 W 抗弯模量 YX 长细比 Y0X 换算长细比是否小于120
	 * 
	 * 输入参数 w1 由换算长细比查表得b类截面轴心受压构件的稳定系数 CQ 材质的屈服强度 GA 杆身截面积
	 * 
	 * 输出参数 AY 安全系数
	 * 
	 * 输入参数 DZ1 单肢计算长度 JL 截面外皮长 HR 截面最大回转半径 XO 斜缀条与柱轴线夹角
	 * 
	 * 输出参数 DCB 单肢长细比
	 * 
	 * 输入参数 LJJ 两槽钢净距
	 * 
	 * 输出参数 ND 单肢轴压力 DW 单肢稳定系数 DWA 单肢稳定安全系数
	 * 
	 * 输入参数 C 总风力系数 P 计算风压 FS 设计强度 FQ1 屈服强度
	 * 
	 * 输出参数 LX 计算长度 V1 风载引起的斜缀条剪力 V2 纵向弯曲引起的横向剪力 XCB 斜缀条长细比 XAX 查表斜缀条稳定系数 WA 稳定安全系数
	 * 
	 * 
	 * 
	 */

	public Double MZ;

	public Double DO;

	public Double W;
	public Double M;// 弯矩
	public Double FB;
	public Double FC;
	public Double G1;
	public Double A;// 截面积
	public Double FT;
	public Double FK;
	public Double N;
	public Double F;
	public Double FH;

	public Double K;
	public Double Q;// q
	public Double b;
	public Double p;
	public Double dt;// 读书t
	public Double n;
	public Double G;
	public Double L;

	public Double D;
	public Double t;
	public Double u1;

	public Double I;
	public Double R;

	public Double qs;
	public Double fy;

	public Double res1;
	public Double res2;
	public Double res3;
	public Double res4;

	public Double btn1 = 1.0;
	public Double btn2 = 1.0;
	public Double btn3 = 2.0;
	public Double btn4 = 2.0;

	public String getEntityName() {
		return "钢管抱杆计算";
	}

	public void cal() {
		FT = Math.cos(Math.toRadians(K)) / Math.cos(Math.toRadians(p + K)) * G;
		FK = Math.sin(p) / Math.cos(Math.toRadians(p + K)) * G;

		F = FT / (n * Math.pow(0.95, n));

		Double G0 = 10 + 64.4 / 100 * (60 + 60 * n / Math.cos(Math.toRadians(K)));
		FH = Math.sqrt(Math.pow(FT * Math.sin(Math.toRadians(p)) - F * Math.sin(Math.toRadians(Q)), 2)
				+ F * Math.cos(Math.toRadians(Q)) + FT * Math.cos(Math.toRadians(p)) + G0);

		Double vis = Math.asin((FT * Math.sin(Math.toRadians(p)) - F * Math.sin(Math.toRadians(Q))) / FH);

		Double PW = 1.10 * 90 * L * D / 1000 / 1000;
		Double q = PW / 10;
		M = q * L * L / 8;
		Double L1 = L * Math.sin(vis + Math.toRadians(Q));
		Double L2 = 0.5 * L;
		Double L3 = L * Math.sin(Math.toRadians(90 - t - q));
		Double L4 = 0.5 * L * Math.sin(Math.toRadians(Q));
//		FB = (L1 * FH + PW * L2 + G0 * L4) / L3;// 注意这里的G0是什么
//		FB = (L1 * FH + PW * L2 + G0 * L4) / L3;// 注意这里的G0是什么
//		N = Math.sqrt(Math.pow(FB * Math.cos(b) - FH * Math.sin(vis), 2)
//				+ Math.pow(FB * Math.sin(b) + FH * Math.cos(vis), 2));
//		FC = N * Math.sin(Q + dt) / Math.sin(2 * dt);

		if (btn1 == 1.0) {
			qs = 235.0 * Math.pow(10, 6);
			fy = 235.0;
		}

		else {
			qs = 345.0 * Math.pow(10, 6);
			fy = 345.0;
		}

		if (btn2 == 1.0)
			calOne();
		else if (btn2 == 2.0)
			calTwo();
		else
			calThree();

		FB = (L1 * FH + PW * L2 + G1 * L4) / L3;
		N = Math.sqrt(Math.pow(FB * Math.cos(b) - FH * Math.sin(vis), 2)
				+ Math.pow(FB * Math.sin(Math.toRadians(b)) + FH * Math.cos(vis), 2));
		FC = N * Math.sin(Math.toRadians(Q + dt)) / Math.sin(Math.toRadians(2 * dt));

		res1 = D / t;
		res2 = 100 * Math.sqrt(235 / fy);
		res3 = (u1 * L) / R;
		res4 = qs / (N / (A * res3) + M / W);
		if (res3 >= 120 && res3 <= 150)
			btn3 = 1.0;
		else
			btn3 = 2.0;
		if (res4 > 2.5)
			btn4 = 1.0;
		else
			btn4 = 2.0;

		FK = Tool.forMat(FK);
		FH = Tool.forMat(FH);
		F = Tool.forMat(F);
		FT = Tool.forMat(FT);
		FB = Tool.forMat(FB);
		FC = Tool.forMat(FC);
		G1 = Tool.forMat(G1);
		N = Tool.forMat(N);

		A = Tool.forMat(A);
		I = Tool.forMat(I);
		R = Tool.forMat(R);
		W = Tool.forMat(W);

		res1 = Tool.forMat(res1);
		res2 = Tool.forMat(res2);
		res3 = Tool.forMat(res3);
		res4 = Tool.forMat(res4);

	}

	// 钢管
	private void calOne() {
		Double A2 = Math.PI / 4 * (D * D / 100 - Math.pow((D - 2 * t), 2) / 100);
		G1 = A2 * L / 10000 * 7.85;

		Double e = D / 2;
		A = Math.PI / 4 * (D * D - Math.pow(D - 2 * t, 2));
		I = Math.PI / 64 * (Math.pow(D, 4) - Math.pow(D - 2 * t, 4));
		W = I / e;
		R = Math.sqrt(I / A);

	}

	// 六方管
	private void calTwo() {
		A = 3.646 * (Math.pow(D / 2.0, 2) - Math.pow((D - 2 * t) / 2.0, 2));
		G1 = A * L / 10000 * 7.85;
		Double r1, r2;
		r1 = D / 2;
		r2 = (D - 2 * t) / 2;
		I = 0.5413 * (Math.pow(D / (2 * Math.cos(Math.toRadians(30))), 4)
				- Math.pow((D - 2 * t) / (2 * Math.cos(Math.toRadians(30))), 4));
		W = 0.625 * (Math.pow(D / 2 * Math.cos(Math.toRadians(30)), 3)
				- Math.pow((D - 2 * t) / (2 * Math.cos(Math.toRadians(30))), 3));
		R = Math.sqrt(I / A);
	}

	// 八方管
	private void calThree() {
		Double visA = 4.0 * (Math.sqrt(Math.pow(D / (2 * Math.cos(Math.toRadians(22.5))), 2) - D * D / 4) * D - Math
				.sqrt(Math.pow((D - 2 * t) / (2 * Math.cos(Math.toRadians(22.5))), 2) - Math.pow((D - 2 * t) / 2, 2))
				* (D - 2 * t));
		G1 = visA * L / 10000 * 7.85;
		A = visA;
		I = 0.8752 * (Math.pow(D / 2, 4) - Math.pow((D - 2 * t) / 2, 4));
		W = 0.876 * (Math.pow(D / 2, 3) - Math.pow((D - 2 * t) / 2, 3));
		R = Math.sqrt(I / A);
	}

}

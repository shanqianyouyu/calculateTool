package ctgu.Entity.boltCal;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import ctgu.awt.util.Tool;
import lombok.Data;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * 
 * @Package: ctgu.Entity.boltCal
 * @author: 拉布拉多
 */
@Data
public class HighStrength {

	/*
	 * 普通螺栓受剪力
	 */
	// 输入

	// 受剪面数
	public Integer nv;
	// 螺栓杆直径
	public Double d;
	// 在不同受力方向中一个受力方向承压构件总厚度的较小值
	public Double t;
	// 螺栓的抗剪设计值
	public Double fbv;
	// 螺栓承压强度设计值
	public Double fbc;

	// 输出
	// 普通螺栓受剪承载力设计值
	public Double o1;
	// 普通螺栓承压承载力设计值：
	public Double o2;

	public void part1() {

		DecimalFormat df = new DecimalFormat("#.##");
		// 2是显示的小数点后的显示的最多位,显示的最后位是舍入的
		o1 = nv * Math.PI * d * d * fbv / 4;
		o2 = d * t * fbc;
		// 保留两位小数
		o1 = Tool.forMat(o1);
		o2 = Tool.forMat(o2);
	}

	/*
	 * 普通螺栓收杆轴方向拉力
	 */
	// 输入
	// 螺纹处的有效直径
	public Double de;
	// 抗拉强度设计值
	public Double ftb;

	// 输出
	// 承载力设计值
	public Double o3;

	public void part2() {
		o3 = Tool.forMat(Math.PI * de * de * ftb / 4);
	}

	/*
	 * 普通螺栓同时承受剪力和杆轴方向拉力
	 */
	// 输入
	// 承受剪力
	public Double Cnv;
	// 承受拉力
	public Double Nt;
	// 承剪继承力设计值
	public Double Nvb;
	// 承拉继承力设计值
	public Double Ntb;
	// 承压继承力设计值
	public Double Nbc;

	// 输出
	// 同时承受剪力和杆轴方向拉力
	public Double o4;

	public void part3() {
		o4 = Tool.forMat(Math.sqrt(Math.pow(Cnv / Nvb, 2) + Math.pow(Nt / Ntb, 2)));
	}

	/*
	 * 高强度螺栓承压型连接
	 */
	// 输入
	// 螺栓杆直径
	public Double Hd;
	// 受剪面数
	public Double Hnv;
	// 螺栓抗剪设计值
	public Double Fbv;
	// 螺栓承压设计值
	public Double Fbc;

	// 输出
	// 受剪承载力
	public Double o5;
	// 受压承载力
	public Double o6;
	// 受剪承载力设计值
	public Double o7;

	public void part4() {
		o5 = Tool.forMat(Hnv * Math.PI * Hd * Hd * Fbv / 4);
		o6 = Tool.forMat(Hd * Fbc);
		o7 = o5 < o6 ? o5 : o6;
	}

	/*
	 * 高强度螺栓摩擦型连接
	 */
	// 输入
	// 摩擦面数
	public Double nf;
	// 摩擦面的抗滑移系数
	public Double y;
	// 预拉力
	public Double nvb;
	// 输出
	// 承载力
	public Double o8;

	public void part5() {
		o8 = Tool.forMat(0.9 * nf * y * nvb);
	}

}

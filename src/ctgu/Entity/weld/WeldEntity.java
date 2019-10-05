package ctgu.Entity.weld;

import lombok.Data;

@Data
public class WeldEntity {
/*	所有参数
	 * 输入参数
	     *直角角焊缝强度计算参数
		 *	TWT		较厚焊件厚度
		 *  SDV		角焊缝的强度设计值
		 *  TOT		较薄焊件的厚度
		 *  MFS		最大焊脚尺寸
		 *  ETO		直角角焊缝的有效厚度
		 *  CLW	        焊缝的计算长度
		 *  AF	        轴心力
		 *  SLF	        正面角焊缝的强度增大系数
			 	
		  
		 * 角焊缝连接的计算参数
		 * 	SOF	正面角焊缝的焊脚尺寸
		 * 	FFW	肢背角焊缝的焊脚尺寸
		 * 	TFW	肢尖角焊缝的焊脚尺寸
		 * 	LOF	角钢端部的正面角焊缝的长度
		 
		 *  角焊缝连接的计算参数1
		 * 	SOE		连接一侧正面角焊缝计算长度的总和
		 * 	AWA		焊缝与轴心力之间的夹角
		 * 	LB		肢宽
		 *  e		角钢的形心矩
		 *  K1		角钢肢背的内力分配系数
		 *  K2		角钢肢尖的内力分配系数
		 *  N		角焊缝受到的轴心拉力
		 *  SFOF	角焊缝受到的剪力
		 *  M1		角焊缝的承受弯矩
		 *  M2		全部焊缝的承受弯矩
		 *  LW		全部焊缝有效截面面对中和轴的惯性矩
		 *  SAL		腹板焊缝有效截面之和
		 *  R1		圆心至焊缝有效截面中线的距离
		 *  IP		焊缝有效截面的惯性矩
		  
		  *  角焊缝连接的计算参数2
		 * 	H1		角焊缝的相关力矩
		 * 	FV		平行于焊缝的力
		 * 	Me		角焊缝的扭矩
		 *  AS		角焊缝的面积
		 
		  *  角焊缝连接的计算参数3
		 * 	T1		对接接头中为连接件的较小厚度
		 * 	WW		焊缝的截面模量
		 * 	SW		焊缝的截面面积矩
		 *  IW		焊缝的截面惯性矩


	*输出结果

		/*
		 * 计算结果
		 * PWL		垂直于焊缝长度方向的应力
		 * PTWL		平行于焊缝长度方向的应力
		 * SSW		侧面角焊缝的强度(三面围焊)
		 * IFB		正面角焊缝所承担的内力
		 * N1	         角钢肢背承受的轴力
		 * N2		肢尖承受的轴力
		 * L1               角钢肢背计算长度
		 * L2               角钢肢尖计算长度
		 * NC 		角钢端部产生的轴心力
		 * FM		弯矩M产生的应力
		 * AFM		A点垂直于焊缝方向的应力
		 * AFM1		剪力Ny在A点处产生平行于焊缝长度方向的应力
		 * FFC		焊缝的强度计算式
		 * FOBS		最大弯曲应力发生在翼缘焊缝的最外纤维处的应力
		 * FTBS		腹板焊缝承受两种应力的共同作用的弯曲应力
		 * FTCS		腹板焊缝承受两种应力的共同作用的剪应力
		 * FSCS		有效截面的任一点上所受切线方向的剪应力
		 * FT		在扭矩T作用下，A点（或点）的应力
		 * FAT		A点引起的应力
		 * FLT		垂直于焊缝长度方向的应力
		 * FLTC		A点的应力满足的强度条件
		 * FNC		轴心力作用的对接焊缝应力
		 * FNBS		轴心力作用的对接焊缝的正应力
		 * FNCS		轴心力作用的对接焊缝的剪应力
		 
		 */
	
	
		public Double TWT;
		public Double SDV;
		public Double TOT;
		public Double MFs;
		public Double MFs1;
		public Double ETo;
		public Double CLw;
		public Double Af;
		public Double SLf;
		
		
		public Double SOF;
		public Double FFW;
		public Double TFw;
		public Double LOf;
		
		public Double SOE;
		public Double AWA;
		public Double LB;
		public Double e1;
		public Double K1;
		public Double K2;
		public Double N;
		public Double SFOf;
		public Double m1;
		public Double m2;
		public Double LW;
		public Double SAL;
		public Double R1;
		public Double IP;
		
		public Double H1;
		public Double FV;
		public Double Me;
		public Double AS;
		
		public Double T1;
		public Double WW;
		public Double SW;
		public Double IW;
		
		public Double PWL;
		public Double PTWL;
		public Double SSW;
		public Double IFB;
		public Double N1;
		public Double N2;
		public Double L1;
		public Double L2;
		public Double NC;
		public Double FM;
		public Double AFM;
		public Double AFM1;
		public Double FFC;
		public Double FOBS;
		public Double FTBS;
		public Double FTCS;
		public Double FSCS;
		public Double FT;
		public Double FAT;
		public Double FLT;
		public Double FLTC;
		public Double FNC;
		public Double FNBS;
		public Double FNCS;
		
		public String getEntityName() {
			return "焊缝计算";
		}
		
}

package ctgu.Entity.weld;

import lombok.Data;

@Data
public class WeldSectionEntity {
/*	所有参数
	 * 输入参数
	     *截面信息
		 *	X1		焊烽长度
		 *  X2		焊缝长度
		 *  Y		焊缝长度
		 *  HE		直角角焊缝的有效厚度
		  
		 * 焊缝受力
		 * 	V1  	 剪力
		 *  T1                 扭矩
		
		 *  材质对应
		 * 	Wffw	角焊缝强度设计值

		
		 *  其他参数
		 * 	AF		角焊缝有效截面面积
		 *  IFX		对x轴惯性矩
		 *  IFY		对y轴惯性矩
		 *  JF		极惯性矩

	*输出结果

		/*
		 * 计算结果
		 * FV		剪力作用应力
		 * TF		扭矩作用最大应力分力1
		 * OF		扭矩作用最大应力分力2
		 * F1		最大应力处的焊缝强度
		 */
	
	
		public Double X1;
		public Double X2;
		public Double Y;
		public Double HE;
		
		
		public Double V1;
		public Double T1;
		
		public Double Wffw;
		
		//增大系数
		public Double B1;
		
		public Double AF;
		public Double IFX;
		public Double IFY;
		public Double JF;

		public Double FV;
		public Double TF;
		public Double OF;
		public Double F1;
		
		public Double SE;
		
		
		public String getEntityName() {
			return "工字型和h型焊缝计算";
		}
		
}

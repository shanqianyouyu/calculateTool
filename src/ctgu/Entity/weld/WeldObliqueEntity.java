package ctgu.Entity.weld;

import lombok.Data;

@Data
public class WeldObliqueEntity {
/*	所有参数
	 * 输入参数
	     *截面信息
		 *	HF		焊脚尺寸
		 *  HE		直角角焊缝的有效厚度
		 *  LW		焊缝的计算长度
		 *  O1		轴力与水平方向夹角
		  
		 * 焊缝受力
		 * 	FZ	轴力
		
		 *  材质对应
		 * 	Wffw		角焊缝强度设计值
		
		 *  其他参数
		 * 	BF	 不考虑正面角焊缝的强度设计值的增大
		  

	*输出结果

		/*
		 * 计算结果
		 * OT		轴力作用下应力
		 * OM		弯矩作用下应力
		 * OMAX		正应力
		 * JF1		分力1
		 * ZF1		分力2
		 * F3	           角焊缝强度计算值
		 
		 
		 
		 */
	
	
		public Double HF;
		public Double HE;
		public Double LW;
		public Double O1;
		
		public Double FZ;
		
		public Double Wffw;
		
		//其他参数
		public Double B1 = 1.0;	
		
		public Double OT;
		public Double OM;
		public Double OMAX;
		public Double JF1;
		public Double ZF1;
		public Double F3;
		
		public Double SE;
		
		public String getEntityName() {
			return "斜焊缝计算";
		}
		
}

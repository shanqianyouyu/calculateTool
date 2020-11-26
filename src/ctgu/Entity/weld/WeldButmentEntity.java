package ctgu.Entity.weld;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import lombok.Data;

@Data
public class WeldButmentEntity {
/*	所有参数
	 * 输入参数
	     *截面信息
		 *	LW		焊缝的计算长度
		 *  PA		斜焊缝与水平角度
		 *  FZ		轴力
		 *  H1		焊缝的高度
		  
		 * 焊缝受力
		 * 	FZ	轴力
		
		 *  材质对应
		 * 	FTW		对接焊缝抗拉
		 *  FVW		对接焊缝抗剪
		
		 *  其他参数
		 * 	BF1		正面角焊缝的强度增大系数
		 *  BF2		直接承受动力荷载结构中的角焊缝
		  
		 *  计算结果
		 * 	ZF		正应力
		 * 	JZ		剪应力

		 //正对接焊缝
		 *  截面信息
		 * 	FH		腹板高
		 * 	YH		翼板宽
		 * 	FW		腹板厚
		 *  YW		翼板厚
		  
		 *  焊缝受力
		 * 	M1		弯矩
		 * 	N1		轴力
		 *  V1		剪力  

		 *  材质对应
		 * 	FFW		角焊缝强度设计值
		 * 	FTW		对接焊缝抗拉
		 *  FVW		对接焊缝抗剪
		  
		 *  截面属性
		 * 	SA		焊缝面积
		 * 	IW		焊缝的截面惯性矩
		 * 	WX		 焊缝的截面模量
		 *  SW		焊缝的截面对中性轴的面积距离
		 *  S1		翼板对梁中和轴的面积静矩

	*输出结果

		/*
		 * 计算结果
		 * O1		腹板端部正应力
		 * T1		腹板端部剪应力
		 * JF1		剪应力
		 * ZF1		正应力
		 * OS	           折算应力
		 * SE       验算结果
		 
		 
		 */
	
	
		public Double LW;
		public Double PA;
		public Double H1;
		public Double FZ;
		
		public Double FTW;
		public Double FVW;
		
		//其他参数
		public Double B1;
		
		
		public Double ZF;
		public Double JZ;
	
		public Double FH;
		public Double YH;
		public Double FW;
		public Double YW;
		
		
		public Double M1;
		public Double N1;
		public Double V1;
		
		
		public Double FFW1;
		public Double FTW1;
		public Double FVW1;
		
		public Double SA;
		public Double IX;
		public Double WX;
		public Double SW;
		public Double SX;
		
		public Double O1;
		public Double T1;
		public Double JF1;
		public Double ZF1;
		public Double OS;
		
		public Double SE1;
		public Double SE2;
		
		
		public String getEntityName() {
			return "对接焊缝计算";
		}
	
		
}

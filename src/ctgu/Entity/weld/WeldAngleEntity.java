package ctgu.Entity.weld;

import lombok.Data;

@Data
public class WeldAngleEntity {
	
		//轴力，剪力，弯矩
		public Double WM;
		public Double WN;
		public Double WV;
		
		//角焊缝强度设计值
		public Double Wffw;
		
		//增大系数
		public Double B1;
		
		//截面模量，惯性矩，角焊缝有效截面面积
		public Double Waf;
		public Double WIW;
		public Double WWFX;
		
		//应力计算结果
		public Double WON;
		public Double WOM;
		public Double WOMAX;
		public Double WTMAX;
		public Double QJ;
		
		public Double SE;
		
		public String getEntityName() {
			return "常用直角焊缝计算";
		}
		
}

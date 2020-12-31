package ctgu.awt.service;

import ctgu.Entity.anchorcal.DrillItem;
import ctgu.Entity.SquareDerrickManCal;
import ctgu.Entity.Square.DerrickSquareEnity;
import ctgu.Entity.Square.DerrickSquareSteelEnity;
import ctgu.Entity.boltCal.HighStrength;
import ctgu.Entity.tool.Tool;
import ctgu.Entity.weld.WeldAngleEntity;
import ctgu.Entity.weld.WeldButmentEntity;
import ctgu.Entity.weld.WeldObliqueEntity;
import ctgu.Entity.weld.WeldSectionEntity;
import ctgu.awt.entity.Config;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.frame.homepage.calFrame.TestJFrame;
import ctgu.awt.frame.homepage.calFrame.across.AcrossFrame;
import ctgu.awt.frame.homepage.calFrame.anchor.AnglePileAnchor;
import ctgu.awt.frame.homepage.calFrame.anchor.DrillAnchor;
import ctgu.awt.frame.homepage.calFrame.anchor.PileAnchor;
import ctgu.awt.frame.homepage.calFrame.anchor.SteelAnchor;
import ctgu.awt.frame.homepage.calFrame.bol.BolFrame;
import ctgu.awt.frame.homepage.calFrame.derrickCal.DerrickSquare;
import ctgu.awt.frame.homepage.calFrame.derrickCal.DerrickSquareMan;
import ctgu.awt.frame.homepage.calFrame.derrickCal.DerrickSquareSteel;
import ctgu.awt.frame.homepage.calFrame.tool.ToolFrame;
import ctgu.awt.frame.homepage.calFrame.weld.WeldFrameAngle;
import ctgu.awt.frame.homepage.calFrame.weld.WeldFrameOblique;
import ctgu.awt.frame.homepage.calFrame.weld.WeldFrameSection;
import ctgu.awt.frame.homepage.calFrame.weld.WeldFrameaButment;
import ctgu.awt.frame.homepage.component.MainScrollPane;
import ctgu.awt.frame.homepage.item.Default;
import ctgu.awt.frame.homepage.item.acrossCal.Across;
import ctgu.awt.frame.homepage.item.bolCal.Bol;
import ctgu.awt.frame.homepage.item.derrickCal.Square;
import ctgu.awt.util.Util;

/**
 * 
 * @author 拉布拉多
 *
 */
public class FrameFactory {
	private static boolean flat = true;

	/**
	 * 
	 * @param name   TopMenu中定义
	 * @param object 每个窗口对应的数据对象
	 */
	public static void createFrame(String name, Object object) {
		// 获取当前选项卡的数量
		int tabSizeOld = Config.fatherTabbedPane.getTabCount();
		// 获取主页总项目数
		int sizeOld = Config.calJpanel.size();

		// 生成递增且唯一id
		Util util = Config.id;
		Integer id = util.addId();

		// 生成的窗口
		FatherFrame frame = null;
		// 生成的条目
		Default jPanel = null;

		if (name.equals("测试生成新窗口")) {
			// 创建测试窗口
			frame = new TestJFrame();
			// 生成唯一窗口id
			frame.setId(id);
			jPanel = new Default();
			jPanel.setId(id);
			jPanel.setName(name);
		}  else if (name.equals("正方形格构抱杆计算")) {
			if (object != null) {
				frame = new DerrickSquare((DerrickSquareEnity) object);
			} else {
				frame = new DerrickSquare(new DerrickSquareEnity());
			}
			frame.setId(id);
			jPanel = new Square();
			jPanel.setId(id);
			jPanel.setName(name);
		} else if (name.equals("钢管抱杆计算")) {
			if (object != null) {
				frame = new DerrickSquareSteel((DerrickSquareSteelEnity) object);
			} else {
				frame = new DerrickSquareSteel(new DerrickSquareSteelEnity());
			}
			frame.setId(id);
			jPanel = new Square();
			jPanel.setId(id);
			jPanel.setName(name);
		} else if (name.equals("人字抱杆计算")) {
			if (object != null) {
				frame = new DerrickSquareMan((SquareDerrickManCal) object);
			} else {
				frame = new DerrickSquareMan(new SquareDerrickManCal());
			}
			frame.setId(id);
			jPanel = new Square();
			jPanel.setId(id);
			jPanel.setName(name);
		}else if (name.equals("螺栓计算")) {
			/**
			 * 逆向
			 * 
			 */
			if (object != null) {
				frame = new BolFrame((HighStrength) object);
			} else {
				frame = new BolFrame(new HighStrength());
			}
			frame.setVisible(true);
			frame.setId(id);
			jPanel = new Bol();
			jPanel.setId(id);
			jPanel.setName(name);

		} else if (name.equals("跨越架计算")) {
			if (object != null) {
				frame = new AcrossFrame((ctgu.Entity.Across.Across) object);
			} else {
				frame = new AcrossFrame(new ctgu.Entity.Across.Across());
			}
			frame.setVisible(true);
			frame.setId(id);
			jPanel = new Across();
			jPanel.setId(id);
			jPanel.setName(name);
		} else if (name.equals("常用直角焊缝计算")) {
			if (object != null) {
				frame = new WeldFrameAngle((WeldAngleEntity) object);
			} else {
				frame = new WeldFrameAngle(new WeldAngleEntity());
			}
			frame.setVisible(true);
			frame.setId(id);
			jPanel = new ctgu.awt.frame.homepage.item.weld.WeldAngle();
			jPanel.setId(id);
			jPanel.setName(name);
		} else if (name.equals("工字形焊缝计算")) {
			if (object != null) {
				frame = new WeldFrameSection((WeldSectionEntity) object);
			} else {
				frame = new WeldFrameSection(new WeldSectionEntity());
			}
			frame.setVisible(true);
			frame.setId(id);
			jPanel = new ctgu.awt.frame.homepage.item.weld.WeldSection();
			jPanel.setId(id);
			jPanel.setName(name);
		} else if (name.equals("斜焊缝计算")) {
			if (object != null) {
				frame = new WeldFrameOblique((WeldObliqueEntity) object);
			} else {
				frame = new WeldFrameOblique(new WeldObliqueEntity());
			}
			frame.setVisible(true);
			frame.setId(id);
			jPanel = new ctgu.awt.frame.homepage.item.weld.WeldOblique();
			jPanel.setId(id);
			jPanel.setName(name);
		} else if (name.equals("对接焊缝计算")) {
			if (object != null) {
				frame = new WeldFrameaButment((WeldButmentEntity) object);
			} else {
				frame = new WeldFrameaButment(new WeldButmentEntity());
			}
			frame.setVisible(true);
			frame.setId(id);
			jPanel = new ctgu.awt.frame.homepage.item.weld.WeldButment();
			jPanel.setId(id);
			jPanel.setName(name);
			/*
			 * 圆木地锚计算 钢板地锚计算 枕木单柱式立式地锚计算
			 */
		}else if (name.equals("钢板地锚计算")) {
			if (null != object) {
				frame = new SteelAnchor((ctgu.Entity.anchorcal.SteelAnchor) object);
			} else {
				frame = new SteelAnchor(new ctgu.Entity.anchorcal.SteelAnchor());
			}
			frame.setVisible(true);
			frame.setId(id);
			jPanel = new ctgu.awt.frame.homepage.item.anchor.SteelAnchor();
			jPanel.setId(id);
			jPanel.setName(name);
		} else if (name.equals("角桩锚计算")) {
			if (null != object) {
				frame = new AnglePileAnchor((ctgu.Entity.anchorcal.AnglePileAnchor) object);
			} else {
				frame = new AnglePileAnchor(new ctgu.Entity.anchorcal.AnglePileAnchor());
			}
			frame.setVisible(true);
			frame.setId(id);
			jPanel = new ctgu.awt.frame.homepage.item.anchor.AnglePileAnchor();
			jPanel.setId(id);
			jPanel.setName(name);
		} else if (name.equals("地钻计算")) {
			if (null != object) {
				frame = new DrillAnchor((DrillItem) object);
			} else {
				frame = new DrillAnchor(new DrillItem());
			}
			frame.setVisible(true);
			frame.setId(id);
			jPanel = new ctgu.awt.frame.homepage.item.anchor.DrillAnchor();
			jPanel.setId(id);
			jPanel.setName(name);
		} else if (name.equals("桩锚计算")) {
			if (null != object) {
				frame = new PileAnchor((ctgu.Entity.anchorcal.PileAnchor) object);
			} else {
				frame = new PileAnchor(new ctgu.Entity.anchorcal.PileAnchor());
			}
			frame.setVisible(true);
			frame.setId(id);
			jPanel = new ctgu.awt.frame.homepage.item.anchor.PileAnchor();
			jPanel.setId(id);
			jPanel.setName(name);
		} else if (name.equals("工器具计算")) {
			if (null != object) {
				frame = new ToolFrame((Tool) object);
			} else {
				frame = new ToolFrame(new Tool());
			}
			frame.setVisible(true);
			frame.setId(id);
			jPanel = new ctgu.awt.frame.homepage.item.tool.Tool();
			jPanel.setId(id);
			jPanel.setName(name);
		}

		// 将窗口记录到后台
		Config.addFrame(frame.getId(), frame);
		Config.addPanel(jPanel.getId(), jPanel);
		/*
		 * 如果达到边界则增加面板的页数
		 * 
		 * 达到边界就提醒不要继续增加了
		 */

		if (flat == false) {
			Config.fatherTabbedPane.addTab(String.valueOf(tabSizeOld + 1), new MainScrollPane(1));
			flat = true;
		}

		if ((sizeOld + 1) % 8 == 0) {
			flat = false;
		}
	}
}

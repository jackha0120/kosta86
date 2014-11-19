package exam;

public class OrderSystem {
	private MenuInter menu;

	public String printMenu(OrderVO vo) {
		return vo.getName() + "´ÔÀÌ <br/>" + menu.order(vo);

	}

	public void setMenu(MenuInter menu) {
		this.menu = menu;
	}

}

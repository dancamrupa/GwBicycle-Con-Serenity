package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class GwUserInterface {

	public static final Target BTN1_BUSCADOR_GW	 = Target.the("").locatedBy("//a[@href = '/search']");
	public static final Target TXT_BUSCADOR_GW = Target.the("El campo donde se realiza la busque del producto").locatedBy("//input[@name = 'q']");
	public static final Target BTN2_BUSCADOR_GW	 = Target.the("").locatedBy("//button[@class = 'text-link site-header__search-btn site-header__search-btn--submit']");
	public static final Target BTN3_PRODUCTO_GW = Target.the("").locatedBy("//div[contains(text(),'{0}')]//ancestor::a");
	public static final Target LBL_PRODUCTO_GW = Target.the("").locatedBy("//h1[contains(text(),'{0}')]");

	public static final Target BTN4_ACCESORIOS_GW = Target.the("").locatedBy(" //div[@class = 'header-item header-item--navigation text-center']//a[@href = '/collections/bicicletas-1']//ancestor::a");
	public static final Target BTN_PRODUCTO_ALEATORIO_GW = Target.the("").locatedBy("//div[@class = 'grid-product__content']");
	public static final Target LBL_NOMBRE_PRODUCTO_ALEATORIO_GW = Target.the("").locatedBy("//div[@class = 'grid-product__content']//div//div[@class = 'grid-product__title grid-product__title--heading']");
}

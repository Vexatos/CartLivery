package mods.cartlivery.integration.waila;

import net.minecraft.entity.item.EntityMinecart;
import mcp.mobius.waila.api.IWailaRegistrar;


public class CartLiveryWailaModule {
	
	public static void register(IWailaRegistrar registrar) {
		registrar.registerBodyProvider(new CartLiveryProvider(), EntityMinecart.class);
		registrar.addConfig("CartLivery", "cartlivery.showPattern");
		registrar.addConfig("CartLivery", "cartlivery.showResPack");
		registrar.addConfig("CartLivery", "cartlivery.showColors");
	}
	
}

public class FabricaSillas extends FabricaMuebles {

	@Override
	public Mueble crearMueble() {

		return new Silla();
	}

}
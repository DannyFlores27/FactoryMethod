public class FabricaMesas extends FabricaMuebles {

	@Override
	public Mueble crearMueble() {

		return new Mesa();
	}

}
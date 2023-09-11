public class Main {
  public static void main(String[] args) {
    FabricaMuebles fabrica;
		fabrica = new FabricaMesas();
		Mueble mesa = fabrica.crearMueble();
		mesa.mostrarPrecio();
		fabrica = new FabricaSillas();
		Mueble silla = fabrica.crearMueble();
		silla.mostrarPrecio();
  }
}
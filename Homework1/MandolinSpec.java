import Enums.Builder;
import Enums.Style;
import Enums.Type;
import Enums.Wood;

public class MandolinSpec extends InstrumentSpec {
	private Style style;

	public MandolinSpec(Builder builder, String model, Type type, Style style, Wood backWood, Wood topWood) {
		super(builder, model, type, topWood, topWood); // done write the super function
		this.style = style; // done assign the style value
	}

	public Style getStyle() {
		return style;
	}

	@Override
	public boolean matches(InstrumentSpec otherSpec) {
		// TODO override the superclass matches()
		if (!super.matches(otherSpec))
			return false;
		if (!(otherSpec instanceof MandolinSpec)) // done check out if otherSpec from MandolinSpec
			// done you can use "instanceof" keyword
			return false; // done complete return

		if (style != ((MandolinSpec) otherSpec).getStyle()) // done control the style
			return false; // done complete return

		return true;
	}
}

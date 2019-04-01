package pr0304Barracks.core.factories;

import java.lang.reflect.Constructor;

import jdk.jshell.spi.ExecutionControl;
import pr0304Barracks.contracts.Unit;
import pr0304Barracks.contracts.UnitFactory;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"pr0304Barracks.models.units.";

	@Override
	public Unit createUnit(String unitType) {
		Unit unitInstance = null;
		
		try {
			Class<?> unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
			Constructor<?> unitConstructor = unitClass.getDeclaredConstructor();
			unitInstance = (Unit) unitConstructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return unitInstance;
	}
}
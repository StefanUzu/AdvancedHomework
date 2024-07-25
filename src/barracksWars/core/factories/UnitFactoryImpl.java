package barracksWars.core.factories;

import barracksWars.interfaces.Unit;
import barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

<<<<<<< HEAD
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

=======
>>>>>>> origin/master
public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException {
<<<<<<< HEAD
		// TODO: implement for problem 3 -> Judge 100/100 :)
		try {
			Class unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
			Constructor<Unit> unitConstructor = unitClass.getDeclaredConstructor();
			return unitConstructor.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
=======
		// TODO: implement for problem 3
		throw new ExecutionControl.NotImplementedException("message");
>>>>>>> origin/master
	}
}

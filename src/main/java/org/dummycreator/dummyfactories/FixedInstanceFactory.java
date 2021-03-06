package org.dummycreator.dummyfactories;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.dummycreator.ClassBindings;
import org.dummycreator.ClassUsageInfo;

/**
 * @author Benny Bottema <b.bottema@projectnibble.org> (further developed project)
 */
public class FixedInstanceFactory<T> extends DummyFactory<T> {

	private final T instance;

	public FixedInstanceFactory(final T instance) {
		this.instance = instance;
	}

	@Override
	public boolean isValidForType(final Class<? super T> clazz) {
		if (clazz.isAssignableFrom(instance.getClass())) {
			return true;
		} else {
			throw new IllegalArgumentException("The object has to have a subclass of clazz");
		}
	}

	/**
	 * @return The instance that was passed into {@link #FixedInstanceFactory(Object)}.
	 * @param knownInstances Not used.
	 * @param classBindings Not used.
	 * @param exceptions Not used.
	 */
	@Override
	public T createDummy(final Type[] genericMetaData, final Map<String, ClassUsageInfo<?>> knownInstances,
			final ClassBindings classBindings, final List<Exception> exceptions) {
		return instance;
	}
}
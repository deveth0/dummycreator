package org.dummycreator;

/**
 * Stores a <em>object</em> and keeps track of whether the instance has been populated with dummy values.
 * <p>
 * Used by {@link DummyCreator} to avoid a recursive loop when populating an object that has a field of its own type (or contains a chain
 * that returns to its own type).
 * 
 * @param <T> The type of the instance stored.
 * @author Alexander Muthmann <amuthmann@dev-eth0.de> (original author)
 * @author Benny Bottema <b.bottema@projectnibble.org> (further developed project)
 */
public class ClassUsageInfo<T> {
	private T instance = null;
	private boolean populated = false;

	public T getInstance() {
		return instance;
	}

	public void setInstance(final T instance) {
		this.instance = instance;
	}

	public boolean isPopulated() {
		return populated;
	}

	public void setPopulated(final boolean populated) {
		this.populated = populated;
	}
}
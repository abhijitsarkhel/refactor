package com.tui.search.composer.executors;

public interface EventCompleteSubscriber {

	void suscribe();
	
	default void suscribe(EventCompleteObserver obsv, EventCompletePublisher on) {
		obsv.suscribeCompleteEvent(this, on);
	}
	
	// TODO - Implementation ...
	void update();
}

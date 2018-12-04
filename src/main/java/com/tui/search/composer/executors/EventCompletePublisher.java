package com.tui.search.composer.executors;

public interface EventCompletePublisher {
	
	void publishCompletion();

	default void publishCompletion(EventCompleteObserver obsv) {
		obsv.notifyCompleteEvent(this);
	}
}

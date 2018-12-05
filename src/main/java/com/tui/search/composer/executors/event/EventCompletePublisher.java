package com.tui.search.composer.executors.event;

public interface EventCompletePublisher {
	
	void publishCompletion();

	default void publishCompletion(EventCompleteObserver obsv) {
		obsv.notifyCompleteEvent(this);
	}
}

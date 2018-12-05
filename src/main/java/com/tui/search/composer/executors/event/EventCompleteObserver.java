package com.tui.search.composer.executors.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventCompleteObserver {

	private static Map<EventCompletePublisher, List<EventCompleteSubscriber>> _map = new HashMap<>();
	
	public void suscribeCompleteEvent(EventCompleteSubscriber suscriber, EventCompletePublisher on) {
		List<EventCompleteSubscriber> list = _map.get(on);
		if (list == null) {
			list = new ArrayList<>();
			_map.put(on, list);
		}
		list.add(suscriber);
	}

	public void unSuscribeFromCompleteEvent(EventCompleteSubscriber suscriber, EventCompletePublisher on) {
		List<EventCompleteSubscriber> list = _map.get(on);
		// TODO - Use utils
		if (list.isEmpty()) {
			// throw exception
		} else {
			list.remove(suscriber);
			if (list.isEmpty()) {
				_map.remove(on);
			}
		}
	}

	public void notifyCompleteEvent(EventCompletePublisher on) {
		for (EventCompleteSubscriber request : _map.get(on)) {
			request.update();
		}
	}
}

package com.tui.search.composer.constants;

public enum ClientType {
	INVENTORY("ANITE"), RULES("DYNAMO"), SEARCH("ELASTIC");

	private String key;

	private ClientType(final String key) {
		this.key = key;
	}

	public String getKey() {
		return this.key;
	}
}

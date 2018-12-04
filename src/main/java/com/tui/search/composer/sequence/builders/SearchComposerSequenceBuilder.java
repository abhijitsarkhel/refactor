package com.tui.search.composer.sequence.builders;

import java.util.List;

import com.tui.search.composer.request.SearchComposerRequest;

public interface SearchComposerSequenceBuilder {

	List<SearchComposerRequest> build();
}

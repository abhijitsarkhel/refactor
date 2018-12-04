package com.tui.search.composer.models;

public interface CodeFormatAdapter
{
   String elastic2anite(String code);

   String anite2elastic(String code);
}
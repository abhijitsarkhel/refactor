// $Rev: 494 $
package com.tui.search.composer.inventory.jaxb;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class PaddingAdapter implements CodeFormatAdapter
{
   public static final char DEFAULT_PAD_CHARACTER = '0';

   public static final int DEFAULT_PADDING_LENGTH = 6;

   protected int targetLength;

   protected char padCharacter;

   protected String findRegex;

   public PaddingAdapter()
   {
      this(DEFAULT_PADDING_LENGTH, DEFAULT_PAD_CHARACTER);
   }

   public PaddingAdapter(int targetLength, char padCharacter)
   {
      super();
      setTargetLength(targetLength);
      setPadCharacter(padCharacter);
   }

   public String elastic2anite(String code)
   {
      return code.replaceAll(findRegex, "");
   }

   @Override
   public String anite2elastic(String code)
   {
      return StringUtils.leftPad(code, targetLength, padCharacter);
   }

   public int getTargetLength()
   {
      return targetLength;
   }

   public void setTargetLength(int targetLength)
   {
      this.targetLength = targetLength;
   }

   public char getPadCharacter()
   {
      return padCharacter;
   }

   public void setPadCharacter(char padCharacter)
   {
      this.padCharacter = padCharacter;
      this.findRegex = "^" + padCharacter + "*";
   }
}
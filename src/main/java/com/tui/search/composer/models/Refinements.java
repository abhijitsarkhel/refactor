package com.tui.search.composer.models;

/**
 * The Class Refinements.
 */
public class Refinements
{

   /** The code. */
   private String code;

   /** The name. */
   private String name;

   /** The type. */
   private String type;

   /**
    * Gets the type.
    *
    * @return the type
    */
   public String getType()
   {
      return type;
   }

   /**
    * Sets the type.
    *
    * @param type the new type
    */
   public void setType(String type)
   {
      this.type = type;
   }

   /**
    * Gets the name.
    *
    * @return the name
    */
   public String getName()
   {
      return name;
   }

   /**
    * Sets the name.
    *
    * @param name the new name
    */
   public void setName(String name)
   {
      this.name = name;
   }

   /**
    * Gets the code.
    *
    * @return the code
    */
   public String getCode()
   {
      return code;
   }

   /**
    * Sets the code.
    *
    * @param code the new code
    */
   public void setCode(String code)
   {
      this.code = code;
   }

   /*
    * (non-Javadoc)
    * 
    * @see java.lang.Object#hashCode()
    */
   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((code == null) ? 0 : code.hashCode());
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + ((type == null) ? 0 : type.hashCode());
      return result;
   }

   /*
    * (non-Javadoc)
    * 
    * @see java.lang.Object#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
      {
         return true;
      }
      if (obj == null)
      {
         return false;
      }
      if (getClass() != obj.getClass())
      {
         return false;
      }
      Refinements other = (Refinements) obj;
      if (code == null)
      {
         if (other.code != null)
         {
            return false;
         }
      }
      else if (!code.equals(other.code))
      {
         return false;
      }
      if (name == null)
      {
         if (other.name != null)
         {
            return false;
         }
      }
      else if (!name.equals(other.name))
      {
         return false;
      }
      if (type == null)
      {
         if (other.type != null)
         {
            return false;
         }
      }
      else if (!type.equals(other.type))
      {
         return false;
      }
      return true;
   }

   /*
    * (non-Javadoc)
    * 
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString()
   {
      return "Refinements [type=" + type + ", name=" + name + ", code=" + code + "]";
   }

}

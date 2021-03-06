package com.dnd5e.wiki.model.creature;

public enum CreatureType {
	  ABERRATION("аберрация"),  
	  BEAST("зверь"),
	  CELESTIAL("небожитель"),
	  CONSTRUCT("конструкт"),
	  DRAGON("дракон"),
	  ELEMENTAL("элементаль"),
	  FEY("фея"),
	  FIEND("исчадие"),
	  GIANT("великан"),
	  HUMANOID("гуманоид"),
	  MONSTROSITY("монстр"),
	  OOZE("Тина"),
	  OUTSIDER("Потустаронний"),
	  PLANT("растение"),
	  DEVIL("Демон"),
	  UNDEAD("нежить"),
	  VERMIN("паразит");
	  
	  private String cyrilicName;
	  
	  private CreatureType(String cyrilicName)
	  {
	    this.cyrilicName = cyrilicName;
	  }
	  
	  public String getCyrilicName()
	  {
	    return this.cyrilicName;
	  }

	public static CreatureType parse(String type) {
		for (CreatureType creatureType : values()) {
			if (creatureType.cyrilicName.equals(type)) {
				return creatureType;
			}
		}
		return null;
	}
}

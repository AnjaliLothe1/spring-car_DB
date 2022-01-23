package com.car.component;

import java.util.List;

public interface CarPartsInventory {
	
	public void addNewPart(CarPart carPart);
	public List<CarPart> getAvailableParts();
}

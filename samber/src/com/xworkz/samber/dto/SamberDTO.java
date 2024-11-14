package com.xworkz.samber.dto;

public class SamberDTO {

	private int id;
	private String samberName;
	private double price;
	private String famousPlace;
	private String samberIngredients;
	private String SamberType;
	private String Flavor;
	private int samberQuantity;
	private String SamberColor;
	private String samberBrand;

	public SamberDTO() {
		super();
	}

	public SamberDTO(int id, String samberName, double price, String famousPlace, String samberIngredients,
			String samberType, String flavor, int samberQuantity, String samberColor, String samberBrand) {
		super();
		this.id = id;
		this.samberName = samberName;
		this.price = price;
		this.famousPlace = famousPlace;
		this.samberIngredients = samberIngredients;
		SamberType = samberType;
		Flavor = flavor;
		this.samberQuantity = samberQuantity;
		SamberColor = samberColor;
		this.samberBrand = samberBrand;
	}

	@Override
	public String toString() {
		return "SamberDTO [id=" + id + ", samberName=" + samberName + ", price=" + price + ", famousPlace="
				+ famousPlace + ", samberIngredients=" + samberIngredients + ", SamberType=" + SamberType + ", Flavor="
				+ Flavor + ", samberQuantity=" + samberQuantity + ", SamberColor=" + SamberColor + ", samberBrand="
				+ samberBrand + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Flavor == null) ? 0 : Flavor.hashCode());
		result = prime * result + ((SamberColor == null) ? 0 : SamberColor.hashCode());
		result = prime * result + ((SamberType == null) ? 0 : SamberType.hashCode());
		result = prime * result + ((famousPlace == null) ? 0 : famousPlace.hashCode());
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((samberBrand == null) ? 0 : samberBrand.hashCode());
		result = prime * result + ((samberIngredients == null) ? 0 : samberIngredients.hashCode());
		result = prime * result + ((samberName == null) ? 0 : samberName.hashCode());
		result = prime * result + samberQuantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof SamberDTO))
			return false;
		SamberDTO other = (SamberDTO) obj;
		if (Flavor == null) {
			if (other.Flavor != null)
				return false;
		} else if (!Flavor.equals(other.Flavor))
			return false;
		if (SamberColor == null) {
			if (other.SamberColor != null)
				return false;
		} else if (!SamberColor.equals(other.SamberColor))
			return false;
		if (SamberType == null) {
			if (other.SamberType != null)
				return false;
		} else if (!SamberType.equals(other.SamberType))
			return false;
		if (famousPlace == null) {
			if (other.famousPlace != null)
				return false;
		} else if (!famousPlace.equals(other.famousPlace))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (samberBrand == null) {
			if (other.samberBrand != null)
				return false;
		} else if (!samberBrand.equals(other.samberBrand))
			return false;
		if (samberIngredients == null) {
			if (other.samberIngredients != null)
				return false;
		} else if (!samberIngredients.equals(other.samberIngredients))
			return false;
		if (samberName == null) {
			if (other.samberName != null)
				return false;
		} else if (!samberName.equals(other.samberName))
			return false;
		if (samberQuantity != other.samberQuantity)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSamberName() {
		return samberName;
	}

	public void setSamberName(String samberName) {
		this.samberName = samberName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFamousPlace() {
		return famousPlace;
	}

	public void setFamousPlace(String famousPlace) {
		this.famousPlace = famousPlace;
	}

	public String getSamberIngredients() {
		return samberIngredients;
	}

	public void setSamberIngredients(String samberIngredients) {
		this.samberIngredients = samberIngredients;
	}

	public String getSamberType() {
		return SamberType;
	}

	public void setSamberType(String samberType) {
		SamberType = samberType;
	}

	public String getFlavor() {
		return Flavor;
	}

	public void setFlavor(String flavor) {
		Flavor = flavor;
	}

	public int getSamberQuantity() {
		return samberQuantity;
	}

	public void setSamberQuantity(int samberQuantity) {
		this.samberQuantity = samberQuantity;
	}

	public String getSamberColor() {
		return SamberColor;
	}

	public void setSamberColor(String samberColor) {
		SamberColor = samberColor;
	}

	public String getSamberBrand() {
		return samberBrand;
	}

	public void setSamberBrand(String samberBrand) {
		this.samberBrand = samberBrand;
	}

}

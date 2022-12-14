package ex_AudioEquipment.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Adiodto<LocalDateTime> {
	private String name=null;
	private String brand =null;
	private Double weight=null;
	private String bluetooth=null;
	private String unit=null;
	private LocalDateTime productdate=null;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getBluetooth() {
		return bluetooth;
	}
	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}
	public LocalDateTime getProductdate() {
		return productdate;
	}
	public void setProductdate(LocalDateTime productdate) {
		this.productdate = productdate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bluetooth, brand, name, productdate, unit, weight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adiodto other = (Adiodto) obj;
		return Objects.equals(bluetooth, other.bluetooth) && Objects.equals(brand, other.brand)
				&& Objects.equals(name, other.name) && Objects.equals(productdate, other.productdate)
				&& Objects.equals(unit, other.unit) && Objects.equals(weight, other.weight);
	}
	@Override
	public String toString() {
		return "Adiodto [name=" + name + ", brand=" + brand + ", weight=" + weight + ", unit=" + unit + ", bluetooth="
				+ bluetooth + ", productdate=" + productdate + "]";
	}
	public Adiodto(String name, String brand, Double weight, String unit, String bluetooth, LocalDateTime proDateTime) {
		super();
		this.name = name;
		this.brand = brand;
		this.weight = weight;
		this.unit = unit;
		this.bluetooth = bluetooth;
		this.productdate = productdate;
	}

	public Adiodto() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}

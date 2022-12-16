package treeMgt.dto;

import java.time.LocalDateTime;
import java.util.Objects;

public class Treedto {
	private String name = null;
	private Integer price = null;
	private LocalDateTime growtime = null;
	private Integer exp = null;
	private Integer nowplant = null;
	private Integer maxplant = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public LocalDateTime getGrowtime() {
		return growtime;
	}

	public void setGrowtime(LocalDateTime growtime) {
		this.growtime = growtime;
	}

	public Integer getExp() {
		return exp;
	}

	public void setExp(Integer exp) {
		this.exp = exp;
	}

	public Integer getNowplant() {
		return nowplant;
	}

	public void setNowplant(Integer nowplant) {
		this.nowplant = nowplant;
	}

	public Integer getMaxplant() {
		return maxplant;
	}

	public void setMaxplant(Integer maxplant) {
		this.maxplant = maxplant;
	}

	@Override
	public int hashCode() {
		return Objects.hash(exp, growtime, maxplant, name, nowplant, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treedto other = (Treedto) obj;
		return Objects.equals(exp, other.exp) && Objects.equals(growtime, other.growtime)
				&& Objects.equals(maxplant, other.maxplant) && Objects.equals(name, other.name)
				&& Objects.equals(nowplant, other.nowplant) && Objects.equals(price, other.price);
	}

	@Override
	public String toString() {
		return "Treedto [name=" + name + ", price=" + price + ", growtime=" + growtime + ", exp=" + exp + ", nowplant="
				+ nowplant + ", maxplant=" + maxplant + "]";
	}

	public Treedto(String name, Integer price, LocalDateTime growtime, Integer exp, Integer nowplant,
			Integer maxplant) {
		super();
		this.name = name;
		this.price = price;
		this.growtime = growtime;
		this.exp = exp;
		this.nowplant = nowplant;
		this.maxplant = maxplant;
	}

	public Treedto() {
		// TODO Auto-generated constructor stub
	}

}

package dto;

import java.time.LocalDateTime;
import java.util.Objects;

//dto에 추가해야 할것들
//1. getter,setter
//2. 생성자
//3. equals hashcode
//4. toString
public class HumanDto {
	private String name;
	private Integer age;
	private Double height;
	private LocalDateTime birthday;
		
	@Override
	public String toString() {
		return "HumanDto [name=" + name + ", age=" + age + ", height=" + height + ", birthday=" + birthday + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HumanDto other = (HumanDto) obj;
		return Objects.equals(name, other.name);
	}
	public HumanDto() {}
	public HumanDto(String name, Integer age, Double height, LocalDateTime birthday) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.birthday = birthday;
	}
	public HumanDto(HumanDto dto) {
		super();
		this.name = dto.name;
		this.age = dto.age;
		this.height = dto.height;
		this.birthday = dto.birthday;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public LocalDateTime getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}
	
}

package main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Customer {
	
	public enum County {
		台北市, 新北市, 桃園市, 新竹縣, 新竹市, 苗栗縣, 苗栗市, 台中市, 彰化縣, 彰化市, 雲林縣, 雲林市, 嘉義縣, 嘉義市, 台南市, 高雄市, 屏東縣,
		屏東市, 台東縣, 台東市, 花蓮縣, 花蓮市, 宜蘭縣, 宜蘭市, 南投縣
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "{cus.name}")
	@Size(min = 1)
	private String name;
	
	@NotBlank(message = "{cus.county}")
	@Size(min = 1)
	private County county;

	public String getCustomerName() {
		return name;
	}

	public void setCustomerName(String name) {
		this.name = name;
	}

	public County getContinent() {
		return county;
	}

	public void setContinent(County county) {
		this.county = county;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
}

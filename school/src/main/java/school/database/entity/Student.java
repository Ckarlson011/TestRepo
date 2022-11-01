package school.database.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "id")
	@EqualsAndHashCode.Include
	private Integer id;
	
	@Column(name = "firstname")
	@EqualsAndHashCode.Include
	private String firstname;
	
	@Column(name = "lastname")
	@EqualsAndHashCode.Include
	private String lastname;
	
	@Column(name = "street")
	@EqualsAndHashCode.Include
	private String street;
	
	@Column(name = "streetDetail")
	@EqualsAndHashCode.Include
	private String streetDetail;
	
	@Column(name = "city")
	@EqualsAndHashCode.Include
	private String city;
	
	@Column(name = "state")
	@EqualsAndHashCode.Include
	private String state;
	
	@Column(name = "postalCode")
	@EqualsAndHashCode.Include
	private String postalCode;
	
	@Column(name = "majorId")
	@EqualsAndHashCode.Exclude
	private Integer majorId;
	
}

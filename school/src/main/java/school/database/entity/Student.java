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
	
	private String firstname;
	
	private String lastname;
	
	private String street;
	
	private String streetDetail;
	
	
	
}

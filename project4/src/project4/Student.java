package project4;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Data
public class Student {
 
	public String studentId;
	public String studentName;
	public String studentEmail;
	public String studentmobileNo;
	
}

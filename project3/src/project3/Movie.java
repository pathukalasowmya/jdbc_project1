package project3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
/*

@Data = @getter+ @setter +@noArgsConstructor + @ToString
*/
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Movie {
	private String movieName;
	private String movieDirector;
	private String movieHero;
	private String movieHeroine;
  
   
  


}
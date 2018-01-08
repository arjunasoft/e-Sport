package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
import play.data.validation.*;

@Entity
public class login extends Model {
	@Required
	public String username;
	
	@Required
	public String password;
}

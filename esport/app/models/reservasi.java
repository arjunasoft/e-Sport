package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
import play.data.validation.*;

@Entity
public class reservasi extends Model{
	@Required
	public String lokasi;
	
}

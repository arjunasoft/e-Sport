package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
import play.data.validation.*;

@Entity
public class user extends Model{
	@Required
	public String namagor;
	@Required
	public String waktu;
	@Required
	public String biaya;
	@ManyToOne
	public reservasi lokasinya;
}

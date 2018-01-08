package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
import play.data.validation.*;

@Entity
public class jadwal extends Model{
	@Required
	public String tanggal;
	@Required
	public String waktu;
	@Required
	public String tempat;
	@Required
	public String biaya;
}

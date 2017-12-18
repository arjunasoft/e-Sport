package models;

import play.*;
import play.db.jpa.*;
import play.data.validation.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Pelanggan extends Model {
	
    @Required
    public String NamaPelanggan;
    
    @Required
    public String TanggalPemesanan;
    
    @Required
    public String JumlahKamar;

    
}



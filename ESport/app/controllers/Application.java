package controllers;

import play.mvc.*;

import play.data.validation.*;

import java.util.*;

import models.*;
	
public class Application extends Controller {
	
    public static void index() {
    	Date now = new Date();
        render(now);
    }
    public static void list() {
        List<user> User1 = user.find("order by Lokasi").fetch();
        render(User1);
    }
        public static void form(Long id) {
            if(id == null) {
                render();
    }
        User User2 = User.findById(id);
        render(User2);
   }
        public static void save(@Valid data_pengguna data_pengguna) {
            if(validation.hasErrors()) {
                if(request.isAjax()) error("Invalid value");
                render("@form", User);
            }
            User.save();
            list();
        }

    }


package com.synclones.iventory.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.displaytag.tags.TableTagParameters;
import org.displaytag.util.ParamEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.synclones.iventory.Constants;
import com.synclones.iventory.model.Location;
import com.synclones.iventory.model.User;
import com.synclones.iventory.service.LocationService;
import com.synclones.iventory.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@RequestMapping(value="/admin/users", method = RequestMethod.GET)
    public String user(Model model) {
        model.addAttribute("userForm", new User());
        return "/app/user";
    }
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@RequestMapping(value="/user/users", method = RequestMethod.GET)
    public String users(Model model) {
        model.addAttribute("userForm", new User());
        return "/app/user";
    }

	@RequestMapping(method = RequestMethod.GET, value = "/ajax/userTbl*")
	public ModelAndView listView(HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam(required = false, value = "q") String query)
			throws Exception {
		Model model = new ExtendedModelMap();
		if(query == null || query == ""){
			model.addAttribute("userList", userService.getAll());
		}
		else{
			model.addAttribute("userList", userService.findBy(query));
		}
		return new ModelAndView("tbl/tblUser", model.asMap());
	}
	
	@RequestMapping(value="/users", method = RequestMethod.GET)
    public String usersx(Model model) {
        model.addAttribute("userForm", new User());
        return "/app/user";
    }
}

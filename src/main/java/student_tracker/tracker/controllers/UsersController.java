package student_tracker.tracker.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import student_tracker.tracker.models.User;
import student_tracker.tracker.models.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletResponse;


@Controller
public class UsersController {

    @Autowired
    private UserRepository userRepo;

    @GetMapping("/users/view")
    public String getAllUsers(Model model){
        System.out.println("Getting all users");
        //get all users from the database
        List<User> users = userRepo.findAll();
        // end of database call
        model.addAttribute("us", users);
        return "users/showAll";
    }

    @PostMapping("/users/add")
    public String addUser(@RequestParam Map<String, String> user, HttpServletResponse response) {
        
        String uName = user.get("name");
        String uHaircolor = user.get("haircolor");
        String uGpa = user.get("gpa");
        int uHeight = Integer.parseInt(user.get("height"));
        int uWeight = Integer.parseInt(user.get("weight"));
        userRepo.save(new User(uName, uWeight, uHeight, uHaircolor, uGpa));
        response.setStatus(201);


        return "redirect:/main.html";
    }
    
}
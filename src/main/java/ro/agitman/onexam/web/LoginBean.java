package ro.agitman.onexam.web;


import ro.agitman.onexam.facade.UserService;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.jms.IllegalStateException;
import javax.servlet.ServletException;
import java.security.Principal;


@Named
@SessionScoped
public class LoginBean extends AbstractMB{

    @EJB
    private UserService service;

    private String email;
    private String password;

    public String login() throws IllegalStateException {
        try {
            //Login via the Servlet Context

            getRequest().login(email, password);

            if(isUserAdmin()){
                return "x/adminHome?faces-redirect=true";
            }

            if(isUserProf()){
                return "y/profHome?faces-redirect=true";
            }

            if(isUserStud()){
                return "z/studHome?faces-redirect=true";
            }

            throw new IllegalStateException("Cannot find home for user");

        } catch (ServletException e) {
            error("Email sau parola gresita");

            e.printStackTrace();
        }
        return null;
    }

    public String logOut() {
        getRequest().getSession(false).invalidate();
        return "index?faces-redirect=true";
    }

    public String getPrincipalName(){
        Principal principal = getRequest().getUserPrincipal();
        if(principal!=null){
            return principal.getName();
        }
        return null;
    }

    public boolean isUserAdmin(){
        return getRequest().isUserInRole("ADMN");
    }

    public boolean isUserProf(){
        return getRequest().isUserInRole("PROF");
    }

    public boolean isUserStud(){
        return getRequest().isUserInRole("STUD");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

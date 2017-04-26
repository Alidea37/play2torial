//https://github.com/SocialFinance/theButton
package controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import jpa.Task1;
import models.TaskForm;
import services.TaskPersistenceService;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

import views.html.index;
import views.html.page1;
import views.html.page2;
import views.html.page3;
import views.html.page4;
import views.html.page5;
import views.html.page6;
import views.html.page7;
import views.html.page9;
import views.html.page10;
import views.html.page11;
import views.html.page12;
import views.html.page15;
import views.html.page16;

@Named
public class Application extends Controller {

	 private static final Logger log = LoggerFactory.getLogger(Application.class);
	
    @Inject
    private TaskPersistenceService taskPersist;

    public Result index() {	//Main Page
        return ok(index.render("Home Page", Form.form(TaskForm.class)));
    }

  //Create list for user input, throw error exception
    public Result addTask() {	 
        Form<TaskForm> form = Form.form(TaskForm.class).bindFromRequest();
        if (form.hasErrors()) {
        	log.warn("form has errors"); // if form has errors
        	return badRequest(index.render("Home Page", form));
        }

        Task1 task = new Task1();
        task.setContents(form.get().getContents());
        taskPersist.saveTask(task);
        return redirect(routes.Application.index());
    }

    public Result getTasks() {
        List<Task1> tasks = taskPersist.fetchAllTasks();
        return ok(play.libs.Json.toJson(tasks));
    }

    public Result page1() {	//start of CYOA game
    	 log.warn("Entered page1");
    	return ok(page1.render("Choose Your Own Adventure")); //change to disable 
    }

    public Result page2() {
        return ok(page2.render("Choose Your Own Adventure"));
    }
    public Result page3() {
        return ok(page3.render("Choose Your Own Adventure"));
    }

    public Result page4() {
        return ok(page4.render("Choose Your Own Adventure"));
    }
    public Result page5() {
        return ok(page5.render("Choose Your Own Adventure"));
    }

    public Result page6() {
        return ok(page6.render("Choose Your Own Adventure"));
    }
    public Result page7() {
        return ok(page7.render("Choose Your Own Adventure"));
    }
    public Result page9() {
        return ok(page9.render("Choose Your Own Adventure"));
    }
    public Result page10() {
        return ok(page10.render("Choose Your Own Adventure"));
    }

    public Result page11() {
        return ok(page11.render("Choose Your Own Adventure"));
    }
    public Result page12() {
        return ok(page12.render("Choose Your Own Adventure"));
    }

    public Result page15() {
        return ok(page15.render("Choose Your Own Adventure"));
    }
   
    public Result page16() {
        return ok(page16.render("Bonus Content!"));
    }
}
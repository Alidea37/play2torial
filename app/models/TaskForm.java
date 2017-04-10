package models;

import play.data.validation.Constraints.Required;
import play.data.validation.Constraints.MinLength;
import play.data.validation.Constraints.MaxLength;



public class TaskForm {

	
	
    @Required
    @MinLength(3)
    @MaxLength(20)
    private String contents;

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}

//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;
//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.fail;
//
//import jpa.Task1;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import com.fasterxml.jackson.databind.JsonNode;
//import org.junit.*;
//import play.mvc.*;
//import play.test.*;
//import play.data.DynamicForm;
//import play.data.validation.ValidationError;
//import play.data.validation.Constraints.RequiredValidator;
//import play.i18n.Lang;
//import play.libs.F;
//import play.libs.F.*;
//import play.twirl.api.Content;
//
//import static play.test.Helpers.*;
//import static org.fest.assertions.Assertions.*;
//
//
///**
//*
//* Simple (JUnit) tests that can call all parts of a play app.
//* If you are interested in mocking a whole application, see the wiki for more details.
//*
//*/
//public class ApplicationTest {
//
//    @Test
//    public void simpleCheck() {
//        int a = 1 + 1;
//        assertThat(a).isEqualTo(2);
//    }
//
//    @Test
//    public void renderTemplate() {
//        Content html = views.html.index.render("HOME PAGE", play.data.Form.form(models.Task.class));
//        assertThat(contentType(html)).isEqualTo("text/html");
//        assertThat(contentAsString(html)).contains("HOME PAGE");
//    }
//
//    
//    @Test
//    public void testIndex() {
//        Result result = controllers.Application.index();
//        assertThat(status(result)).isEqualTo(OK);
//        assertThat(contentType(result)).isEqualTo("text/html");
//        assertThat(charset(result)).isEqualTo("utf-8");
//        assertThat(contentAsString(result)).contains("HOME PAGE");
//    }
//    @Test
//    public void testPage1() {
//        Result result = controllers.Application.page1();
//        assertThat(status(result)).isEqualTo(OK);
//        assertThat(contentType(result)).isEqualTo("text/html");
//        assertThat(charset(result)).isEqualTo("utf-8");
//        assertThat(contentAsString(result)).contains("Choose Your Own Adventure");
//    }
//    @Test
//    public void testPage2() {
//        Result result = controllers.Application.page2();
//        assertThat(status(result)).isEqualTo(OK);
//        assertThat(contentType(result)).isEqualTo("text/html");
//        assertThat(charset(result)).isEqualTo("utf-8");
//        assertThat(contentAsString(result)).contains("Choose Your Own Adventure");
//    }
//    @Test
//    public void testPage3() {
//        Result result = controllers.Application.page3();
//        assertThat(status(result)).isEqualTo(OK);
//        assertThat(contentType(result)).isEqualTo("text/html");
//        assertThat(charset(result)).isEqualTo("utf-8");
//        assertThat(contentAsString(result)).contains("Choose Your Own Adventure");
//    }
//    @Test
//    public void testPage4() {
//        Result result = controllers.Application.page4();
//        assertThat(status(result)).isEqualTo(OK);
//        assertThat(contentType(result)).isEqualTo("text/html");
//        assertThat(charset(result)).isEqualTo("utf-8");
//        assertThat(contentAsString(result)).contains("Choose Your Own Adventure");
//    }
//    @Test
//    public void testPage5() {
//        Result result = controllers.Application.page5();
//        assertThat(status(result)).isEqualTo(OK);
//        assertThat(contentType(result)).isEqualTo("text/html");
//        assertThat(charset(result)).isEqualTo("utf-8");
//        assertThat(contentAsString(result)).contains("Choose Your Own Adventure");
//    }
//    @Test
//    public void testPage6() {
//        Result result = controllers.Application.page6();
//        assertThat(status(result)).isEqualTo(OK);
//        assertThat(contentType(result)).isEqualTo("text/html");
//        assertThat(charset(result)).isEqualTo("utf-8");
//        assertThat(contentAsString(result)).contains("Choose Your Own Adventure");
//    }
//    @Test
//    public void testPage7() {
//        Result result = controllers.Application.page7();
//        assertThat(status(result)).isEqualTo(OK);
//        assertThat(contentType(result)).isEqualTo("text/html");
//        assertThat(charset(result)).isEqualTo("utf-8");
//        assertThat(contentAsString(result)).contains("Choose Your Own Adventure");
//    }
//    @Test
//    public void testPage9() {
//        Result result = controllers.Application.page9();
//        assertThat(status(result)).isEqualTo(OK);
//        assertThat(contentType(result)).isEqualTo("text/html");
//        assertThat(charset(result)).isEqualTo("utf-8");
//        assertThat(contentAsString(result)).contains("Choose Your Own Adventure");
//    }
//    @Test
//    public void testPage10() {
//        Result result = controllers.Application.page10();
//        assertThat(status(result)).isEqualTo(OK);
//        assertThat(contentType(result)).isEqualTo("text/html");
//        assertThat(charset(result)).isEqualTo("utf-8");
//        assertThat(contentAsString(result)).contains("Choose Your Own Adventure");
//    }
//    @Test
//    public void testPage11() {
//        Result result = controllers.Application.page11();
//        assertThat(status(result)).isEqualTo(OK);
//        assertThat(contentType(result)).isEqualTo("text/html");
//        assertThat(charset(result)).isEqualTo("utf-8");
//        assertThat(contentAsString(result)).contains("Choose Your Own Adventure");
//    }
//    @Test
//    public void testPage12() {
//        Result result = controllers.Application.page12();
//        assertThat(status(result)).isEqualTo(OK);
//        assertThat(contentType(result)).isEqualTo("text/html");
//        assertThat(charset(result)).isEqualTo("utf-8");
//        assertThat(contentAsString(result)).contains("Choose Your Own Adventure");
//    }
//    @Test
//    public void testPage15() {
//        Result result = controllers.Application.page15();
//        assertThat(status(result)).isEqualTo(OK);
//        assertThat(contentType(result)).isEqualTo("text/html");
//        assertThat(charset(result)).isEqualTo("utf-8");
//        assertThat(contentAsString(result)).contains("Choose Your Own Adventure");
//    }
//    @Test
//    public void testPage16() {
//        Result result = controllers.Application.page16();
//        assertThat(status(result)).isEqualTo(OK);
//        assertThat(contentType(result)).isEqualTo("text/html");
//        assertThat(charset(result)).isEqualTo("utf-8");
//        assertThat(contentAsString(result)).contains("Choose Your Own Adventure");
//    }
//    
//    }

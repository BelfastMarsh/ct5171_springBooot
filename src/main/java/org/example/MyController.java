package	org.example;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Interval;
import org.joda.time.JodaTimePermission;
import org.joda.time.format.DateTimeFormat;
import org.springframework.stereotype.Controller;
import	org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import	org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class MyController {

    @GetMapping("/")
    @ResponseBody
    public	String	index()	{
        DateTime time = DateTime.now();
        DateTime xmas = DateTime.parse("25/12/2023", DateTimeFormat.forPattern("dd/MM/yyyy"));
        int days = Days.daysBetween(time.toLocalDate(), xmas.toLocalDate()).getDays();
        return String.valueOf(days) + " days until Christmas!";
    }

    @RequestMapping("/home")
    public String home(){
       return " index.html";
    }

}

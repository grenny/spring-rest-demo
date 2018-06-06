package us.acton.grenville.restdemo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import us.acton.grenville.restdemo.data.entity.User;
import us.acton.grenville.restdemo.service.UserService;

import java.util.Calendar;
import java.util.Date;

public class DataLoader implements ApplicationRunner {

    final private UserService userService;

    public DataLoader(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(ApplicationArguments args) {
        final Calendar calendar = Calendar.getInstance();
        calendar.set(1975, Calendar.NOVEMBER, 29);
        final Date birthday = calendar.getTime();
        final User user = new User();
        user.setUsername("grenny");
        user.setPassword("1234");
        user.setUserType(1);
        user.setEmail("grenny@hotmail.com");
        user.setName("Grenville");
        user.setLastName("Sequeira");
        user.setTel("617-599-8186");
        user.setBornDate(birthday);
        userService.save(user);
    }
}

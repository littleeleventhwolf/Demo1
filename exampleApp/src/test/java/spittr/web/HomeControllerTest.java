package spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

/**
 * Created by xinglongwang on 9/7/16.
 */
public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception {
        HomeController controller = new HomeController();
        // build mockmvc
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/"))   // get path '/'
                .andExpect(view().name("home"));    // expect 'home'
        mockMvc.perform(get("/homepage"))   // get path '/homepage'
                .andExpect(view().name("home"));
    }
}

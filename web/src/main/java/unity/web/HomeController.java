package unity.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import unity.domain.Hotel;
import unity.persistence.HotelRepository;

import java.util.List;

@Controller
public class HomeController {

    private final HotelRepository hotelRepository;


    public HomeController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/hotels")
    public String findHotels(Model model){
        model.addAttribute("hotel",hotelRepository.findAll());
    return "home";
    }


    @GetMapping("/")
    @ResponseBody
    public List<Hotel> Welcome(){
        return hotelRepository.findAll();
    }

}

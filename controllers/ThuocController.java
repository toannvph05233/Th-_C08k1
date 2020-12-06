package controllers;

import com.vn.models.Thuoc;
import com.vn.services.ThuocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThuocController {
    @Autowired
    private ThuocService thuocService;


    @GetMapping("/listThuoc")
    public ModelAndView listCity() {
        Iterable<Thuoc> listThuoc = thuocService.findAll();
        ModelAndView modelAndView = new ModelAndView("/listThuoc");
        modelAndView.addObject("listThuoc", listThuoc);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/createThuoc");
        modelAndView.addObject("city", new Thuoc());
        return modelAndView;
    }

    @GetMapping("/editThuoc/{id}")
    public ModelAndView showEditForm(@PathVariable int id) {
        Thuoc thuoc = thuocService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/editThuoc");
        modelAndView.addObject("thuoc", thuoc);
        return modelAndView;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView showDetailForm(@PathVariable int id) {
        Thuoc thuoc = thuocService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/detailThuoc");
        modelAndView.addObject("thuoc", thuoc);
        return modelAndView;
    }


    @PostMapping("/edit/{id}")
    public ModelAndView editUser(@ModelAttribute Thuoc thuoc) {
        ModelAndView modelAndView = new ModelAndView("redirect:/listThuoc");
        thuocService.save(thuoc);
        return modelAndView;

    }

    @PostMapping("/create")
    public ModelAndView createUser(@ModelAttribute Thuoc thuoc) {
        ModelAndView modelAndView = new ModelAndView("redirect:/listThuoc");
        thuocService.save(thuoc);
        return modelAndView;
    }


    @GetMapping("/delete/{id}")
    public ModelAndView deleteUser(@PathVariable int id) {
        Thuoc thuoc = thuocService.findById(id);
        thuocService.remove(thuoc);
        ModelAndView modelAndView = new ModelAndView("redirect:/listThuoc");
        return modelAndView;
    }

}

package controllers;

import com.vn.models.Thuoc;
import com.vn.services.ThuocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class APIThuoc {
    @Autowired
    private ThuocService thuocService;


    @GetMapping("/api/listThuoc")
        public ResponseEntity<List<Thuoc>> getListUser() {
            List<Thuoc> thuocList = (List<Thuoc>) thuocService.findAll();
            return new ResponseEntity<>(thuocList, HttpStatus.OK);
        }

        @PostMapping("/api/createThuoc")
        public ResponseEntity createSP(@RequestBody Thuoc thuoc) {
            thuocService.save(thuoc);
            return new ResponseEntity<>(HttpStatus.OK);
        }

        @GetMapping("/api/editThuoc/{id}")
        public ResponseEntity<Thuoc> getEditSP(@PathVariable int id) {
            Thuoc thuoc = thuocService.findById(id);
            return new ResponseEntity(thuoc, HttpStatus.OK);
        }

        @PostMapping("/api/editThuoc")
        public ResponseEntity<Thuoc> EditSP(@RequestBody Thuoc thuoc) {
            thuocService.save(thuoc);
            return new ResponseEntity<>(HttpStatus.OK);
        }

        @PostMapping("/api/deleteSP/{id}")
        public ResponseEntity getDeleteSP(@PathVariable int id) {
            Thuoc thuoc = thuocService.findById(id);
            thuocService.remove(thuoc);
            return new ResponseEntity(HttpStatus.OK);
        }

    }

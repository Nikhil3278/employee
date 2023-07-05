package controller;

import java.util.List;

import model.Emprequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.Empservice;

    @RestController
    public class Restcontroller {

        @Autowired
        Empservice empservice;
        @GetMapping("/emp")
        private List<Emprequest> getAllEmprequest()
        {
            return empservice.getAllEmprequest();
        }
        @GetMapping("/emp/{id}")
        private Emprequest getEmprequest(@PathVariable("id") int id)
        {
            return empservice.getEmprequestById(id);
        }
        @DeleteMapping("/emp/{id}")
        private void deleteBook(@PathVariable("id") int id)
        {
            empservice.delete(id);
        }
        @PostMapping("/Emprequest")
        private int saveBook(@RequestBody Emprequest Emprequest)
        {
            empservice.saveOrUpdate(Emprequest);
            return Emprequest.getId();
        }
        @PutMapping("/Emprequest")
        private Emprequest update(@RequestBody Emprequest Emprequest)
        {
            empservice.saveOrUpdate(Emprequest);
            return Emprequest;
        }
    }


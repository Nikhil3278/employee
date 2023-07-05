package service;

import java.util.ArrayList;
import java.util.List;

import model.Emprequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.Emprepository;

@Service
public class Empservice
{
    @Autowired
    Emprepository emprepository;
    public List<Emprequest> getAllEmprequest()
    {
        List<Emprequest> Emprequest = new ArrayList<Emprequest>();
        emprepository.findAll().forEach(Emprequest1 -> Emprequest.add(Emprequest1));
        return Emprequest;
    }
    public Emprequest getEmprequestById(int id)
    {
        return emprepository.findById(id).get();
    }
    public void saveOrUpdate(Emprequest Emprequest)
    {
        emprepository.save(Emprequest);
    }
    public void delete(int id)
    {
        emprepository.deleteById(id);
    }
    public void update(Emprequest Emprequest, int bookid)
    {
        emprepository.save(Emprequest);
    }
}

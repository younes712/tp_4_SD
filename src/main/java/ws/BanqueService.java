package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "banqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroToDH")
    public double conversion(@WebParam(name="montant") double mt) {
        return mt*100;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name="code") int code) {
        return new Compte(code,Math.random()*6000, new Date());
    }

    @WebMethod
    public List<Compte> listComptes() {
        return List.of(
                new Compte(200,Math.random()*6000, new Date()),
                new Compte(200,Math.random()*6000, new Date()),
                new Compte(300,Math.random()*6000, new Date())
        );
    }
}

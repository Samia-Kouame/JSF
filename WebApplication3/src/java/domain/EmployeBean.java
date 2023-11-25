/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;


import entities.Employe;
import entities.Employe;
import entities.Service;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartModel;
import org.primefaces.model.chart.ChartSeries;
import service.EmployeService;
import service.ServiceService;


/**
 *
 * @author HP
 */
@ManagedBean
@SessionScoped
public class EmployeBean {
    private List<Employe> employes;
    private EmployeService employeService;
    private Employe selectedEmploye;
     private List<ChartSeries> employeeChartData;
     private Employe employe ;
     private Service service;
     private ServiceService serviceService;

    /**
     * Creates a new instance of EmployeBean
     */
    public EmployeBean() {
        employes = new ArrayList<>();
        employe = new Employe();
        
    }
    @PostConstruct
public void init() {
    employeService = new EmployeService();
    employes = employeService.getAll(); // Initialiser la liste des employes
    employe = new Employe();
    employe.setService(new Service()); // Initialiser le service
    employe.setEmploye(new Employe());
        
}

    public void onCreateAction (){
        if (employe.getService() == null || employe.getEmploye() == null) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erreur", "Veuillez sélectionner un service et un chef.");
        FacesContext.getCurrentInstance().addMessage(null, message);
        return; // Arrêtez le traitement si l'une des conditions n'est pas remplie
    }

    employeService.create(employe);
    employes = employeService.getAll();

    employe = new Employe();
         
    }

    public Employe getEmploye() {
        return employe;
    }
    public List<Employe> getEmployes() {
        if(employes == null)
            employes = employeService.getAll();
        return employes;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    
    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
    
      public ChartModel initBarModel() {
    CartesianChartModel model = new CartesianChartModel();
    ChartSeries employes = new ChartSeries();
    employes.setLabel("employes");
    model.setAnimate(true);

    for (Object[] e : employeService.nbemploye()) {
        Service service = (Service) e[1];
        employes.set(service.getLibelle(), Integer.parseInt(e[0].toString()));
    }


    model.addSeries(employes);

    return model;
}

   
    
}

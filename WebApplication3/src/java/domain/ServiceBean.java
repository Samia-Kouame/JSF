/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import entities.Employe;
import entities.Service;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import org.hibernate.Session;
import org.primefaces.event.RowEditEvent;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartModel;
import org.primefaces.model.chart.ChartSeries;
import service.ServiceService;
import util.HibernateUtil;

/**
 *
 * @author Lachgar
 */
@ManagedBean

public class ServiceBean {
    private Employe machine;
    private Service service;
    private List<Service> services;
    private ServiceService serviceService;
    

    /**
     * Creates a new instance of ServiceBean
     */
    public ServiceBean() {
        service = new Service();
         serviceService = new ServiceService();
    }

    public void onCreateAction (){
        serviceService.create(service);
        service = new Service();
       
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public List<Service> getServices() {
        if(services == null)
            services = serviceService.getAll();
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

     public String onDeleteAction() {

        serviceService.delete(serviceService.getById(service.getId()));
        return null;
    }

 public ChartModel initBarModel() {
        CartesianChartModel model = new CartesianChartModel();
        ChartSeries services = new ChartSeries();
        services.setLabel("Services");
        model.setAnimate(true);
        for (Service s : serviceService.getAll()) {
            services.set(s.getLibelle(), (Number) s.getEmployes());
        }
        model.addSeries(services);
        
                
        return model;
    }
}

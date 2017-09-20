/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.rentalData;

import is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.userData.*;
import java.util.Date;

/**
 *
 * @author ulfur
 */
public class Rental {

    

    private RentalOffer offer;
    private User renter;
    private Date startDate;
    private Date endDate;
    

    public Rental() {
        offer = null;
        renter = null;
        startDate = null;
        endDate = null;
    }

    public RentalOffer getOffer() {
        return offer;
    }

    public void setOffer(RentalOffer offer) {
        this.offer = offer;
    }

    public User getRenter() {
        return renter;
    }

    public void setRenter(User renter) {
        this.renter = renter;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}

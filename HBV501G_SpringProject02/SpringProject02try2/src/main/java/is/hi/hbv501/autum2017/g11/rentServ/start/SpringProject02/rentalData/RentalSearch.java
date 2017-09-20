/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.rentalData;

import is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.userData.CarType;
import java.util.Date;

/**
 *
 * @author ulfur
 */
public class RentalSearch {
    
    static RentalOffers searchCar(Date startDate, Date endDate, CarType carType, RentalOffers offers){
        RentalOffers rentals = new RentalOffers();
        for (RentalOffer offer : offers.GetAllOffers()) {
            if (offer.getStartDate().after(startDate)
                    && offer.getEndDate().before(endDate)
                    && offer.getCar().getCarType()==carType) {
                rentals.add(offer);
            }
        }

        return rentals;
}
    
}

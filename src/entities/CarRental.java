package entities;

import java.util.Date;

public class CarRental {
	
	private Date start;
	private Date finish;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	
	public CarRental() {
	}


	public CarRental(Date start, Date initial, Vehicle vehicle) {
		this.start = start;
		this.finish = initial;
		this.vehicle = vehicle;
	}


	public Date getStart() {
		return start;
	}


	public void setStart(Date start) {
		this.start = start;
	}


	public Date getFinish() {
		return finish;
	}


	public void setInitial(Date initial) {
		this.finish = initial;
	}


	public Vehicle getVehicle() {
		return vehicle;
	}


	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	public Invoice getInvoice() {
		return invoice;
	}


	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
	
}

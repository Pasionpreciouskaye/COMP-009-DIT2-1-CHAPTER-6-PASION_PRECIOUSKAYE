package Polymorphism;

abstract class Pen {
	 private String engraved;
	    private String inkColor;

	    public abstract void showProperty();

		public String getEngraved() {
			return engraved;
		}

		public void setEngraved(String engraved) {
			this.engraved = engraved;
		}

		public String getInkColor() {
			return inkColor;
		}

		public void setInkColor(String inkColor) {
			this.inkColor = inkColor;
		}
	}

	class Pencil extends Pen {
	    private String brand;
	    private int number;
	    private String status;

	    public Pencil(String brand, int number, String status) {
	        this.brand = brand;
	        this.number = number;
	        this.status = status;
	    }

	    @Override
	    public void showProperty() {
	        System.out.println("This pencil is a " + brand + " pencil, number " + number + ".");
	        System.out.println("Status: " + status);
	    }
	}

	public class Main{
	    public static void main(String[] args) {
	        Pen myPencil = new Pencil("Faber-Castell", 2, "sharpened");
	        myPencil.showProperty();
	    }

}

import java.io.*;
public class Inventory {


	//variables for the Inventory class
	private Item itemArray[] = new Item[100]; //stores a instances of a Item
	private int totalItem = 0;

	//Methods for the Inventroy class
	// return totalItem
	public int getTotalNumberOfItems(){
		return totalItem;
	}


	// retunrs an instances of a Item
	// Get the item's stores data from the Array
	public Item getItem(int index){

		//error check
		if(index < 0 || index >= totalItem)
		{
			return null;
		}
		else
		{
			return itemArray[index];
		}
	}

	// assgine item to a variable
	// add Item into the Array
	public void addItem(Item newItem){

<<<<<<< HEAD
		// check to see if item is a Instace of a Item, then check if the Item has been added
=======
		// check to see if item has been added
>>>>>>> ed97ed28414f6e1879c4f7933800171fce824a8e
		if(newItem == null)
		{
			System.out.println("Item not added");
		}
		else
		{
			itemArray[totalItem] = newItem;
			totalItem++; //update totalNumber
		}

	}


	//create and save inventory data to a file
	public void saveInventoryToFile(String fileName){
		/// write name, quality, price, upc on diffrent lines on the textfile
		try{
			// create instances of the txt file
		 FileWriter fwriter = new FileWriter(fileName+".txt", true);
		 PrintWriter item = new PrintWriter(fwriter);

		 // write the info of the item on the text file
		 for(int i=0; i < totalItem; i++){
		 item.println("");
		 item.println("Name: "+getItem(i).getName());
		 item.println("Price: "+getItem(i).getPrice());
		 item.println("Quantity: "+getItem(i).getQuantity());
		 item.println("UPC: "+getItem(i).getUPC());

		 }

		 fwriter.close();
		 item.close();


		} catch(Exception e){

			System.out.println("Something went wrong\nFile could not Write");
		}
	}

	// load inventory data from a file
	public void loadInventoryFromFile(String fileName){


		//Read created file, if file does not exites create one

		try{

			FileReader file = new FileReader(fileName); //read the file
			BufferedReader breader = new BufferedReader(file); //print the collected string in a line

			String line = "";

			while((line = breader.readLine()) != null)
			{
				System.out.println(line);
			}

			file.close();
			breader.close();


		} catch(Exception e){
			System.out.println("Something went wrong\nfile could not Read");
		}

	}

}

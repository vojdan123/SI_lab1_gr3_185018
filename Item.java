class Item {
	int id;
	String name;
	double price;
	char danok;
	//TODO add variable.
	
	//TODO constructor
	public Item(int id,String name,double price,char danok)
	{
		this.id = id;
		this.price = price;
		this.name = name;
		this.danok = danok;
	}
	
	//TODO setters and getters
	    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getDanok() {
        return danok;
    }

    public void setDanok(char danok) {
        this.danok = danok;
    }
	double taxReturn () {
		//TODO
		 if(danok == 'A')
        {
            return (price*0.18) * 0.15;
        }
        else if(danok == 'B')
        {
            return (price*0.05) * 0.15;
        }
        else
            return 0;
	}
}
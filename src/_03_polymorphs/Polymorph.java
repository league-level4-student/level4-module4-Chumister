package _03_polymorphs;


import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width = 50;
    private int height = 50;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
    
    void set_width(int value) {

    	if (value > 0) {
    		width = value;
    	}
    	else {
    		width = 50;
    	}
    }

    void set_height(int value) {

    	if (value > 0) {
    		height = value;
    	}
    	else {
    		height = 50;
    	}
    }

    int get_width() {

    	return width;
    }
    
    int get_height() {
    	return height;
    }
    
    void set_x(int value) {

    	if (value > 0) {
    		x = value;
    	}
    	else {
    		x = 50;
    	}
    }
    
    void set_y(int value) {

    	if (value > 0) {
    		y = value;
    	}
    	else {
    		y = 50;
    	}
    }
    
    int get_x() {
    	return x;
    }
    
    int get_y() {
    	return y;
    }
    
}
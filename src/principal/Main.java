package principal;


import front.Display;
import processing.core.PApplet;
import shiffman.box2d.Box2DProcessing;

public class Main extends PApplet {

	Display dp;
	Box2DProcessing box2d;

	public static void main(String[] args) {
		String[] appletArgs = new String[] { "principal.Main" };
		if (args != null) {
			PApplet.main(concat(appletArgs, args));
		} else {
			PApplet.main(appletArgs);
		}
	}

	public void settings() {
		size(CONFIG.width, CONFIG.height);
	}

	public void setup() {
		//String[] args = { "VentanaVideo" };
		//Tracker tk = new Tracker();
		//PApplet.runSketch(args, tk);
		/// ---
		box2d = new Box2DProcessing(this);
		box2d.createWorld();
		/// ---
		dp = new Display(this, box2d);
		smooth();
	}

	public void draw() {
		dp.show();
		box2d.step();
	}

	public void mouseDragged() {

	}

}
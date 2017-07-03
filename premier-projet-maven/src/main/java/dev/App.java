package dev;

import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;

public class App {
	public static void main(String[] args) {
		System.out.println(FigletFont.convertOneLine(ResourceBundle.getBundle("application").getString("titre")));
		String environnement = ResourceBundle.getBundle("application").getString("environnement");
		System.out.println("Environnement : " + environnement);
	}
}
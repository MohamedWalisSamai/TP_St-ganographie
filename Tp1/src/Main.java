import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Stegano.findImagesInImage("image2.png");
		BufferedImage image  = ImageIO.read(new File("resultat1.png"));
		Stegano.hideImageInImage(image,"image2.png");
		//Stegano.writeTextInImage("Articles à nature encyclopédique sur tous les sujets, créés et édités bénévolement par des contributeurs anonymes", 500, 500);
		Stegano.hideTextInImage("TEST5", "image2.png");

	}

}

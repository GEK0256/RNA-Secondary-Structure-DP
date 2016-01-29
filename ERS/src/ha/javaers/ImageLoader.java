package ha.javaers;


import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;


public class ImageLoader {
	public static BufferedImage loadImage(InputStream path) {
		try {
			BufferedImage image = ImageIO.read(path);
			return image;
		} catch (IOException e) {
			System.err.println("Error loading image '" + path + "':\n" + e);
			return null;
		}
	}
	
}

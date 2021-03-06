
package proxy;

import javax.swing.ImageIcon;
import interfaces.IImage;

public class ProxyImage implements IImage {

    private RealImage realImage;
    private final String path;

    public ProxyImage(String path) {
        this.path = path;
    }

    @Override
    public ImageIcon loadImage() {

        if (this.realImage == null) {
            this.realImage = new RealImage(this.path);
        }

        return this.realImage.loadImage();
    }

}

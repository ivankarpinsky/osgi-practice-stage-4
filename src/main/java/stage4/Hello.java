package stage4;

import org.osgi.framework.BundleContext;

public class Hello {
    BundleContext bundleContext;

    public Hello(BundleContext bundleContext) {
        this.bundleContext = bundleContext;
    }

    public void hi(String name) {
        System.out.println("Hello " + name);
    }

}

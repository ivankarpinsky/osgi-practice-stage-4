package stage4;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import java.util.Hashtable;

public class Activator implements BundleActivator {
    public void start(BundleContext context) throws Exception {
        Hashtable props = new Hashtable();
        props.put("osgi.command.scope", "gogo");
        props.put("osgi.command.function", new String[] {"hi"});

        context.registerService(Hello.class.getName(), new Hello(context), props);
    }

    public void stop(BundleContext context) throws Exception {
    }
}

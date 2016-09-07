package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import spittr.web.WebConfig;

/**
 * Created by xinglongwang on 9/7/16.
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class };
    }

    protected Class<?>[] getServletConfigClasses() {
        /* specify the configuration class */
        return new Class<?>[] { WebConfig.class };
    }

    protected String[] getServletMappings() {
        /* mapping DispatcherServlet to '/' */
        return new String[] { "/" };
    }
}

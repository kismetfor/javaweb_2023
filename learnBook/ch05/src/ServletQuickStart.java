import javax.servlet.*;
import java.io.IOException;

public class ServletQuickStart implements Servlet {

    private ServletConfig config;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
            throws ServletException, IOException {
        System.out.println("quick start~~~~~");
        String initKey = config.getInitParameter("key");
        System.out.println(initKey);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        // Cleanup code, if any
    }
}

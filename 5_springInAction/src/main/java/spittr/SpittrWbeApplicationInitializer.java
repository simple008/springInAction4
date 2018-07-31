package spittr;


public class SpittrWbeApplicationInitializer extends AbstractAnnotationConfig {
    @Override
    protected String[] getServletMappings(){
        return new String[]{"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses(){
        return new Class<?>[]{RootConfig.class};
    }

    @Override Class<?>[] getSerletConfigClasses(){
        return new Class<?>[]{WebConfig.class};
    }
}


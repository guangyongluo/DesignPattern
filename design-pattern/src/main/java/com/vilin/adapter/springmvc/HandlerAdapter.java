package com.vilin.adapter.springmvc;

///定义一个Adapter接口 
public interface HandlerAdapter {
    public boolean supports(Object handler);

    public void handle(Object handler);
}

// 多种适配器类

class SimpleHandlerAdapter implements HandlerAdapter {

    public void handle(Object controller) {
        ((SimpleController) controller).doSimplerHandler();
    }

    public boolean supports(Object controller) {
        return (controller instanceof SimpleController);
    }

}

class HttpHandlerAdapter implements HandlerAdapter {

    public void handle(Object controller) {
        ((HttpController) controller).doHttpHandler();
    }

    public boolean supports(Object controller) {
        return (controller instanceof HttpController);
    }

}

class AnnotationHandlerAdapter implements HandlerAdapter {

    public void handle(Object controller) {
        ((AnnotationController) controller).doAnnotationHandler();
    }

    public boolean supports(Object controller) {

        return (controller instanceof AnnotationController);
    }

}
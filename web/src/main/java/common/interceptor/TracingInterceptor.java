package common.interceptor;

import domain.RequestInfo;
import mapper.TraceMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TracingInterceptor extends HandlerInterceptorAdapter {

    private static final Logger logger = LoggerFactory
            .getLogger(TracingInterceptor.class);

    @Autowired private TraceMapper traceMapper;

    public boolean preHandle(HttpServletRequest request,
                               HttpServletResponse response, Object handler) throws Exception {
        logger.info("Start Trace");
        try {
            RequestInfo requestInfo = new RequestInfo();
            requestInfo.setUri(request.getRequestURI());
            requestInfo.setMethod(request.getMethod());
            requestInfo.setRemoteAddr(request.getRemoteAddr());
            requestInfo.setQueryString(request.getQueryString());
            traceMapper.insertTrace(requestInfo);
            logger.info("Trace success");
        } catch (Exception e) {
            logger.error("Trace fail:" + e);
        }
        return true;
    }
}
package hello.exception.servlet;

import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletExcpetion {
    @GetMapping("/error-ex")
    public void errorEx(){
        throw new RuntimeException("예외발생!!");
    }

    @GetMapping("/error-404")
    public void error404(HttpServletResponse response) throws IOException{
        response.sendError(404, "404 오류!");
    }

    @GetMapping("/error-505")
    public void error500(HttpServletResponse response) throws IOException{
        response.sendError(500);
    }

}

WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package ngordnet.browser;

import static spark.Spark.*;

/**
 * Created by hug.
 */
public class NgordnetServer {
    public void register(String URL, NgordnetQueryHandler nqh) {
        get(URL, nqh);
    }

    public void startUp() {
        //staticFileLocation("/page");
        /* Allow for all origin requests (since this is not an authenticated server, we do not
         * care about CSRF).  */
        before((request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
            response.header("Access-Control-Request-Method", "*");
            response.header("Access-Control-Allow-Headers", "*");
        });
    }
}

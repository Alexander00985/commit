package www;

import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.Response;

import java.util.concurrent.Future;

import static org.asynchttpclient.Dsl.asyncHttpClient;

/**
 * @Author 此间
 * @Email zhangyue.zhangyue@alibaba-inc.com
 * @Description
 * @Date 3/4/21 3:42 PM
 **/
public class AlterService implements AlterSerciceInterface {

    static AsyncHttpClient asyncHttpClient = asyncHttpClient();

    static public void sendMessage(String messsage) {
        sendMessage(messsage, false);
    }


    static public void sendMessage(String messsage, boolean biz) {
        Future<Response> whenResponse = asyncHttpClient
                .preparePost("https://oapi.dingtalk.com/robot/send?access_token=574d3256a03e76575c3642124f36f9c039793afa8909f68c4e18f55a56368e63")
                .setHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                .setHeader("Accept-Charset", "UTF-8,*;q=0.5")
                .setHeader("Accept-Encoding", "gzip,deflate,sdch")
                .setHeader("Accept-Language", "en-US,en;q=0.8")
                .setHeader("Content-Type", "application/json")
                .setHeader("User-Agent", "Mozilla/5.0 (Linux; Android 4.4.2; Nexus 4 Build/KOT49H) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.114 Mobile Safari/537.36")
                .setBody("{\"msgtype\": \"text\",\"text\": {\"content\": \"炒饭: " + messsage + "\"}}")
                .setFollowRedirect(true)
                .execute();

    }

    @Override
    public void sendMessage(Feedback feedback) {

    }
}

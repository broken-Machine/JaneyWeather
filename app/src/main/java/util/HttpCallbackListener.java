package util;

/**
 * Created by 楚哥 on 2016/3/22.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}

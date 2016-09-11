package cauc.kyu.civilaviationinfoserver.utils;

import com.google.gson.Gson;

import java.util.List;

/**
 * 将对象打印为json格式或xml格式
 * Created by Administrator on 2016/5/9.
 */
public class Response {
    public static String json(int code, String msg) {
        ErrorResponse errorResponse = new ErrorResponse(code, msg);
        Gson gson = new Gson();
        return gson.toJson(errorResponse);
    }

    public static String json(int code, String msg, Object[] objects) {
        ObjsResponse objsResponse = new ObjsResponse(code, msg, objects);
        Gson gson = new Gson();
        return gson.toJson(objsResponse);
    }

    public static String json(int code, String msg, Object object) {
        ObjResponse objResponse = new ObjResponse(code, msg, object);
        Gson gson = new Gson();
        return gson.toJson(objResponse);
    }

    public static String json(int code, String msg, List list) {
        ListResponse listResponse = new ListResponse(code, msg, list);
        Gson gson = new Gson();
        return gson.toJson(listResponse);
    }

    public static void xml() {

    }

    static class ErrorResponse {
        int code;
        String msg;

        public ErrorResponse(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }
    }

    static class ObjsResponse {
        int code;
        String msg;
        Object[] data;

        public ObjsResponse(int code, String msg, Object[] objects) {
            this.code = code;
            this.msg = msg;
            this.data = objects;
        }
    }

    static class ObjResponse {
        int code;
        String msg;
        Object data;

        public ObjResponse(int code, String msg, Object object) {
            this.code = code;
            this.msg = msg;
            this.data = object;
        }
    }

    static class ListResponse {
        int code;
        String msg;
        List data;

        public ListResponse(int code, String msg, List list) {
            this.code = code;
            this.msg = msg;
            this.data = list;
        }
    }

}

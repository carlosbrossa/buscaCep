package br.com.netshoes.model;

/**
 * Created by cbrossa on 12/04/15.
 */
public class ResponseHttp {

    private int httpStatusCode;
    private ContentResponse contentResponse;

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public ContentResponse getContentResponse() {
        return contentResponse;
    }

    public void setContentResponse(ContentResponse contentResponse) {
        this.contentResponse = contentResponse;
    }

    @Override
    public String toString() {
        return "ResponseHttp{" +
                ", httpStatusCode=" + httpStatusCode +
                ", contentResponse=" + contentResponse +
                '}';
    }
}

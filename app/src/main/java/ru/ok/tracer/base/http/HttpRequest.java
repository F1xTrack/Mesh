package ru.ok.tracer.base.http;

import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B!\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ok/tracer/base/http/HttpRequest;", "", "url", "", "body", "Lru/ok/tracer/base/http/HttpRequestBody;", "(Ljava/lang/String;Lru/ok/tracer/base/http/HttpRequestBody;)V", "method", "(Ljava/lang/String;Ljava/lang/String;Lru/ok/tracer/base/http/HttpRequestBody;)V", "getBody", "()Lru/ok/tracer/base/http/HttpRequestBody;", "getMethod", "()Ljava/lang/String;", "getUrl", "tracer-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class HttpRequest {
    private final HttpRequestBody body;
    private final String method;
    private final String url;

    public HttpRequest(String str, String str2, HttpRequestBody httpRequestBody) {
        O90.f(str, "method");
        O90.f(str2, "url");
        this.method = str;
        this.url = str2;
        this.body = httpRequestBody;
    }

    public final HttpRequestBody getBody() {
        return this.body;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, HttpRequestBody httpRequestBody) {
        this(httpRequestBody == null ? "GET" : "POST", str, httpRequestBody);
        O90.f(str, "url");
    }
}

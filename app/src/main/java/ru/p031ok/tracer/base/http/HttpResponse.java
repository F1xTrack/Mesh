package ru.p031ok.tracer.base.http;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m22267d2 = {"Lru/ok/tracer/base/http/HttpResponse;", "Ljava/io/Closeable;", "", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "message", "Lru/ok/tracer/base/http/HttpResponseBody;", "body", "<init>", "(ILjava/lang/String;Lru/ok/tracer/base/http/HttpResponseBody;)V", "LTf1;", "close", "()V", "I", "getStatusCode", "()I", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Lru/ok/tracer/base/http/HttpResponseBody;", "getBody", "()Lru/ok/tracer/base/http/HttpResponseBody;", "tracer-base_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class HttpResponse implements Closeable {
    private final HttpResponseBody body;
    private final String message;
    private final int statusCode;

    public HttpResponse(int i, String str, HttpResponseBody httpResponseBody) {
        O90.m5968f(str, "message");
        this.statusCode = i;
        this.message = str;
        this.body = httpResponseBody;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        HttpResponseBody httpResponseBody = this.body;
        if (httpResponseBody != null) {
            httpResponseBody.close();
        }
    }

    public final HttpResponseBody getBody() {
        return this.body;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }
}

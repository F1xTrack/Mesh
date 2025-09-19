package ru.p031ok.tracer.base.http;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.O90;

@Metadata(m22266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m22267d2 = {"Lru/ok/tracer/base/http/HttpPart;", "", "", "name", "filename", "contentType", "Lru/ok/tracer/base/http/HttpRequestBody;", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ok/tracer/base/http/HttpRequestBody;)V", "Ljava/io/OutputStream;", "stream", "LTf1;", "writeTo", "(Ljava/io/OutputStream;)V", "Lru/ok/tracer/base/http/HttpRequestBody;", "getBody", "()Lru/ok/tracer/base/http/HttpRequestBody;", "headers", "Ljava/lang/String;", "", "getLength$tracer_base_release", "()J", "length", "tracer-base_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class HttpPart {
    private final HttpRequestBody body;
    private final String headers;

    public HttpPart(String str, String str2, String str3, HttpRequestBody httpRequestBody) {
        O90.m5968f(str, "name");
        O90.m5968f(httpRequestBody, "body");
        this.body = httpRequestBody;
        StringBuilder sb = new StringBuilder();
        sb.append("Content-Disposition: form-data; name=");
        HttpMultipartBodyKt.appendQuoted(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            HttpMultipartBodyKt.appendQuoted(sb, str2);
        }
        sb.append("\r\n");
        if (str3 != null) {
            sb.append("Content-Type: ");
            sb.append(str3);
            sb.append("\r\n");
        }
        String string = sb.toString();
        O90.m5967e(string, "StringBuilder().apply(builderAction).toString()");
        this.headers = string;
    }

    public final HttpRequestBody getBody() {
        return this.body;
    }

    public final long getLength$tracer_base_release() {
        if (this.body.getContentLength() < 0) {
            return -1L;
        }
        return HttpMultipartBodyKt.CRLF.length + this.body.getContentLength() + HttpMultipartBodyKt.getUtf8Length(this.headers) + HttpMultipartBodyKt.CRLF.length;
    }

    public final void writeTo(OutputStream stream) throws IOException {
        O90.m5968f(stream, "stream");
        HttpMultipartBodyKt.writeUtf8(stream, this.headers);
        stream.write(HttpMultipartBodyKt.CRLF);
        this.body.writeTo(stream);
        stream.write(HttpMultipartBodyKt.CRLF);
    }

    public /* synthetic */ HttpPart(String str, String str2, String str3, HttpRequestBody httpRequestBody, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, httpRequestBody);
    }
}

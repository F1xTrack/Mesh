package ru.p031ok.tracer.base.http;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m22267d2 = {"Lru/ok/tracer/base/http/HttpByteArrayBody;", "Lru/ok/tracer/base/http/HttpRequestBody;", "Lru/ok/tracer/base/http/HttpResponseBody;", "", "contentType", "", "bytes", "<init>", "(Ljava/lang/String;[B)V", "Ljava/io/OutputStream;", "stream", "LTf1;", "writeTo", "(Ljava/io/OutputStream;)V", "close", "()V", "Ljava/lang/String;", "getContentType", "()Ljava/lang/String;", "[B", "getBytes", "()[B", "", "getContentLength", "()J", "contentLength", "tracer-base_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class HttpByteArrayBody implements HttpRequestBody, HttpResponseBody {
    private final byte[] bytes;
    private final String contentType;

    public HttpByteArrayBody(String str, byte[] bArr) {
        O90.m5968f(str, "contentType");
        O90.m5968f(bArr, "bytes");
        this.contentType = str;
        this.bytes = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // ru.p031ok.tracer.base.http.HttpResponseBody
    public byte[] getBytes() {
        return this.bytes;
    }

    @Override // ru.p031ok.tracer.base.http.HttpRequestBody
    public long getContentLength() {
        return getBytes().length;
    }

    @Override // ru.p031ok.tracer.base.http.HttpRequestBody, ru.p031ok.tracer.base.http.HttpResponseBody
    public String getContentType() {
        return this.contentType;
    }

    @Override // ru.p031ok.tracer.base.http.HttpRequestBody
    public void writeTo(OutputStream stream) throws IOException {
        O90.m5968f(stream, "stream");
        stream.write(getBytes());
    }
}

package ru.p031ok.tracer.base.http;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m22267d2 = {"Lru/ok/tracer/base/http/HttpMultipartBody;", "Lru/ok/tracer/base/http/HttpRequestBody;", "", "boundary", "", "Lru/ok/tracer/base/http/HttpPart;", "parts", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/io/OutputStream;", "stream", "LTf1;", "writeTo", "(Ljava/io/OutputStream;)V", "Ljava/lang/String;", "Ljava/util/List;", "contentType", "getContentType", "()Ljava/lang/String;", "", "contentLength", "J", "getContentLength", "()J", "tracer-base_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class HttpMultipartBody implements HttpRequestBody {
    private final String boundary;
    private final long contentLength;
    private final String contentType;
    private final List<HttpPart> parts;

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d A[LOOP:0: B:14:0x0067->B:16:0x006d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HttpMultipartBody(java.lang.String r5, java.util.List<ru.p031ok.tracer.base.http.HttpPart> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "boundary"
            p000.O90.m5968f(r5, r0)
            java.lang.String r0 = "parts"
            p000.O90.m5968f(r6, r0)
            r4.<init>()
            r4.boundary = r5
            r4.parts = r6
            java.lang.String r0 = "multipart/form-data; boundary="
            java.lang.String r5 = p000.AbstractC7222ym.m26245v(r0, r5)
            r4.contentType = r5
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r5 = r6 instanceof java.util.Collection
            if (r5 == 0) goto L29
            r5 = r6
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L29
            goto L4a
        L29:
            java.util.Iterator r5 = r6.iterator()
        L2d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4a
            java.lang.Object r6 = r5.next()
            ru.ok.tracer.base.http.HttpPart r6 = (ru.p031ok.tracer.base.http.HttpPart) r6
            ru.ok.tracer.base.http.HttpRequestBody r6 = r6.getBody()
            long r0 = r6.getContentLength()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L2d
            r5 = -1
            goto L90
        L4a:
            java.util.List<ru.ok.tracer.base.http.HttpPart> r5 = r4.parts
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            byte[] r6 = ru.p031ok.tracer.base.http.HttpMultipartBodyKt.access$getDASHDASH$p()
            int r6 = r6.length
            long r0 = (long) r6
            java.lang.String r6 = r4.boundary
            int r6 = ru.p031ok.tracer.base.http.HttpMultipartBodyKt.access$getUtf8Length(r6)
            long r2 = (long) r6
            long r0 = r0 + r2
            byte[] r6 = ru.p031ok.tracer.base.http.HttpMultipartBodyKt.access$getCRLF$p()
            int r6 = r6.length
            long r2 = (long) r6
            long r0 = r0 + r2
            java.util.Iterator r5 = r5.iterator()
        L67:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8f
            java.lang.Object r6 = r5.next()
            ru.ok.tracer.base.http.HttpPart r6 = (ru.p031ok.tracer.base.http.HttpPart) r6
            byte[] r2 = ru.p031ok.tracer.base.http.HttpMultipartBodyKt.access$getDASHDASH$p()
            int r2 = r2.length
            long r2 = (long) r2
            long r0 = r0 + r2
            java.lang.String r2 = r4.boundary
            int r2 = ru.p031ok.tracer.base.http.HttpMultipartBodyKt.access$getUtf8Length(r2)
            long r2 = (long) r2
            long r0 = r0 + r2
            byte[] r2 = ru.p031ok.tracer.base.http.HttpMultipartBodyKt.access$getCRLF$p()
            int r2 = r2.length
            long r2 = (long) r2
            long r0 = r0 + r2
            long r2 = r6.getLength$tracer_base_release()
            long r0 = r0 + r2
            goto L67
        L8f:
            r5 = r0
        L90:
            r4.contentLength = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.p031ok.tracer.base.http.HttpMultipartBody.<init>(java.lang.String, java.util.List):void");
    }

    @Override // ru.p031ok.tracer.base.http.HttpRequestBody
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // ru.p031ok.tracer.base.http.HttpRequestBody, ru.p031ok.tracer.base.http.HttpResponseBody
    public String getContentType() {
        return this.contentType;
    }

    @Override // ru.p031ok.tracer.base.http.HttpRequestBody
    public void writeTo(OutputStream stream) throws IOException {
        O90.m5968f(stream, "stream");
        for (HttpPart httpPart : this.parts) {
            stream.write(HttpMultipartBodyKt.DASHDASH);
            HttpMultipartBodyKt.writeUtf8(stream, this.boundary);
            stream.write(HttpMultipartBodyKt.CRLF);
            httpPart.writeTo(stream);
        }
        stream.write(HttpMultipartBodyKt.DASHDASH);
        HttpMultipartBodyKt.writeUtf8(stream, this.boundary);
        stream.write(HttpMultipartBodyKt.DASHDASH);
    }
}

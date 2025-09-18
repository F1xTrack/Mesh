package ru.p031ok.tracer.base.http;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import p000.AbstractC7038vr;
import p000.O90;

@Metadata(m22266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m22267d2 = {"Lru/ok/tracer/base/http/HttpRequestBody;", "", "Ljava/io/OutputStream;", "stream", "LTf1;", "writeTo", "(Ljava/io/OutputStream;)V", "", "getContentType", "()Ljava/lang/String;", "contentType", "", "getContentLength", "()J", "contentLength", "Companion", "Lru/ok/tracer/base/http/HttpByteArrayBody;", "Lru/ok/tracer/base/http/HttpMultipartBody;", "tracer-base_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface HttpRequestBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m22266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ \u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m22267d2 = {"Lru/ok/tracer/base/http/HttpRequestBody$Companion;", "", "()V", "fromBytes", "Lru/ok/tracer/base/http/HttpRequestBody;", "contentType", "", RemoteMessageConst.Notification.CONTENT, "", "fromString", "charset", "Ljava/nio/charset/Charset;", "tracer-base_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ HttpRequestBody fromString$default(Companion companion, String str, String str2, Charset charset, int i, Object obj) {
            if ((i & 4) != 0) {
                charset = AbstractC7038vr.f44561a;
            }
            return companion.fromString(str, str2, charset);
        }

        public final HttpRequestBody fromBytes(String contentType, byte[] bArr) {
            O90.m5968f(contentType, "contentType");
            O90.m5968f(bArr, RemoteMessageConst.Notification.CONTENT);
            return new HttpByteArrayBody(contentType, bArr);
        }

        public final HttpRequestBody fromString(String contentType, String str, Charset charset) {
            O90.m5968f(contentType, "contentType");
            O90.m5968f(str, RemoteMessageConst.Notification.CONTENT);
            O90.m5968f(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            O90.m5967e(bytes, "this as java.lang.String).getBytes(charset)");
            return new HttpByteArrayBody(contentType, bytes);
        }
    }

    long getContentLength();

    String getContentType();

    void writeTo(OutputStream stream) throws IOException;
}

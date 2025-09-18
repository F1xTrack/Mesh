package ru.p031ok.tracer.base.http;

import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\n¨\u0006\u000b"}, m22267d2 = {"Lru/ok/tracer/base/http/HttpResponseBody;", "Ljava/io/Closeable;", "bytes", "", "getBytes", "()[B", "contentType", "", "getContentType", "()Ljava/lang/String;", "Lru/ok/tracer/base/http/HttpByteArrayBody;", "tracer-base_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface HttpResponseBody extends Closeable {
    byte[] getBytes() throws IOException;

    String getContentType();
}

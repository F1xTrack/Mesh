package ru.p031ok.tracer.base.http;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m22267d2 = {"Lru/ok/tracer/base/http/HttpClient;", "", "execute", "Lru/ok/tracer/base/http/HttpResponse;", "request", "Lru/ok/tracer/base/http/HttpRequest;", "tracer-base_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface HttpClient {
    HttpResponse execute(HttpRequest request) throws IOException;
}

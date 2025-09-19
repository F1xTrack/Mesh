package ru.p031ok.tracer;

import kotlin.Metadata;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;
import ru.p031ok.tracer.base.http.HttpClient;
import ru.p031ok.tracer.base.http.TracerHttpClientKt;

@Metadata(m22266d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m22267d2 = {"<anonymous>", "Lru/ok/tracer/base/http/HttpClient;", "invoke"}, m22268k = 3, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class Tracer$httpClient$2 extends AbstractC8418Vg0 implements InterfaceC6434mZ {
    public static final Tracer$httpClient$2 INSTANCE = new Tracer$httpClient$2();

    public Tracer$httpClient$2() {
        super(0);
    }

    @Override // p000.InterfaceC6434mZ
    public final HttpClient invoke() {
        return TracerHttpClientKt.createTracerHttpClient(Tracer.INSTANCE.getContext(), CoreTracerConfiguration.INSTANCE.get().getTrafficStatsTag());
    }
}

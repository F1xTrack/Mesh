package ru.ok.tracer.lite.upload;

import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC5908mZ;
import kotlin.Metadata;
import ru.ok.tracer.base.http.HttpClient;
import ru.ok.tracer.base.http.TracerHttpClientKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ok/tracer/base/http/HttpClient;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerLiteHttpClientHolder$httpClient$2 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    final /* synthetic */ TracerLiteHttpClientHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TracerLiteHttpClientHolder$httpClient$2(TracerLiteHttpClientHolder tracerLiteHttpClientHolder) {
        super(0);
        this.this$0 = tracerLiteHttpClientHolder;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final HttpClient invoke() {
        return TracerHttpClientKt.createTracerLiteHttpClient(this.this$0.context, this.this$0.libraryPackageName, this.this$0.trafficStatsTag);
    }
}

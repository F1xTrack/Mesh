package ru.p031ok.tracer.utils;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, m22267d2 = {"<anonymous>", "Ljava/util/concurrent/atomic/AtomicReference;", "", "", "", "invoke"}, m22268k = 3, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SimpleFileKeyValueStorage$map$2 extends AbstractC8418Vg0 implements InterfaceC6434mZ {
    final /* synthetic */ SimpleFileKeyValueStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleFileKeyValueStorage$map$2(SimpleFileKeyValueStorage simpleFileKeyValueStorage) {
        super(0);
        this.this$0 = simpleFileKeyValueStorage;
    }

    @Override // p000.InterfaceC6434mZ
    public final AtomicReference<Map<String, Object>> invoke() {
        return new AtomicReference<>(this.this$0.init());
    }
}

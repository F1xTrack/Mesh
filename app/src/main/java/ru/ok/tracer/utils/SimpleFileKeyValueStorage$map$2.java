package ru.ok.tracer.utils;

import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC5908mZ;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/concurrent/atomic/AtomicReference;", "", "", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SimpleFileKeyValueStorage$map$2 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    final /* synthetic */ SimpleFileKeyValueStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleFileKeyValueStorage$map$2(SimpleFileKeyValueStorage simpleFileKeyValueStorage) {
        super(0);
        this.this$0 = simpleFileKeyValueStorage;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final AtomicReference<Map<String, Object>> invoke() {
        return new AtomicReference<>(this.this$0.init());
    }
}

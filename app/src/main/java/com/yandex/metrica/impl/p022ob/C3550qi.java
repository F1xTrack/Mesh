package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.yandex.metrica.impl.ob.qi */
/* loaded from: classes2.dex */
public class C3550qi implements InterfaceC3758yi {

    /* renamed from: b */
    private static final IIdentifierCallback f24555b = new a();

    /* renamed from: a */
    private final AtomicReference<IIdentifierCallback> f24556a;

    /* renamed from: com.yandex.metrica.impl.ob.qi$a */
    public class a implements IIdentifierCallback {
        @Override // com.yandex.metrica.IIdentifierCallback
        public void onReceive(Map<String, String> map) {
        }

        @Override // com.yandex.metrica.IIdentifierCallback
        public void onRequestError(IIdentifierCallback.Reason reason) {
        }
    }

    public C3550qi(IIdentifierCallback iIdentifierCallback) {
        this.f24556a = new AtomicReference<>(iIdentifierCallback);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3758yi
    /* renamed from: a */
    public void mo16630a(IParamsCallback.Reason reason, Map<String, C3273g1> map) {
        IIdentifierCallback andSet = this.f24556a.getAndSet(f24555b);
        int iOrdinal = reason.ordinal();
        andSet.onRequestError(iOrdinal != 1 ? iOrdinal != 2 ? IIdentifierCallback.Reason.UNKNOWN : IIdentifierCallback.Reason.INVALID_RESPONSE : IIdentifierCallback.Reason.NETWORK);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3758yi
    public void onReceive(Map<String, C3273g1> map) {
        IIdentifierCallback andSet = this.f24556a.getAndSet(f24555b);
        HashMap map2 = new HashMap();
        for (Map.Entry<String, C3273g1> entry : map.entrySet()) {
            map2.put(entry.getKey(), entry.getValue().f23462a);
        }
        andSet.onReceive(map2);
    }
}

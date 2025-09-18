package com.yandex.metrica.impl.ob;

import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.yandex.metrica.impl.ob.qi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3032qi implements InterfaceC3236yi {
    private static final IIdentifierCallback b = new a();
    private final AtomicReference<IIdentifierCallback> a;

    /* renamed from: com.yandex.metrica.impl.ob.qi$a */
    public class a implements IIdentifierCallback {
        @Override // com.yandex.metrica.IIdentifierCallback
        public void onReceive(Map<String, String> map) {
        }

        @Override // com.yandex.metrica.IIdentifierCallback
        public void onRequestError(IIdentifierCallback.Reason reason) {
        }
    }

    public C3032qi(IIdentifierCallback iIdentifierCallback) {
        this.a = new AtomicReference<>(iIdentifierCallback);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3236yi
    public void a(IParamsCallback.Reason reason, Map<String, C2766g1> map) {
        IIdentifierCallback andSet = this.a.getAndSet(b);
        int iOrdinal = reason.ordinal();
        andSet.onRequestError(iOrdinal != 1 ? iOrdinal != 2 ? IIdentifierCallback.Reason.UNKNOWN : IIdentifierCallback.Reason.INVALID_RESPONSE : IIdentifierCallback.Reason.NETWORK);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3236yi
    public void onReceive(Map<String, C2766g1> map) {
        IIdentifierCallback andSet = this.a.getAndSet(b);
        HashMap map2 = new HashMap();
        for (Map.Entry<String, C2766g1> entry : map.entrySet()) {
            map2.put(entry.getKey(), entry.getValue().a);
        }
        andSet.onReceive(map2);
    }
}

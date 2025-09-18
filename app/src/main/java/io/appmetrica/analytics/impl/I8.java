package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes2.dex */
public final class I8 {
    public final int a;
    public final N8 b;
    public K8 c;

    public I8(N8 n8, int i) {
        this.a = i;
        this.b = n8;
    }

    public final void a() {
        K8 k8;
        N8 n8 = this.b;
        n8.getClass();
        try {
            byte[] bArr = n8.c.get("event_hashes");
            if (bArr == null || bArr.length == 0) {
                L8 l8 = n8.a;
                n8.b.getClass();
                C4810q9 c4810q9 = new C4810q9();
                l8.getClass();
                k8 = new K8(c4810q9.a, c4810q9.b, c4810q9.c, CollectionUtils.hashSetFromIntArray(c4810q9.d));
            } else {
                L8 l82 = n8.a;
                C4810q9 state = n8.b.toState(bArr);
                l82.getClass();
                k8 = new K8(state.a, state.b, state.c, CollectionUtils.hashSetFromIntArray(state.d));
            }
        } catch (Throwable unused) {
            L8 l83 = n8.a;
            n8.b.getClass();
            C4810q9 c4810q92 = new C4810q9();
            l83.getClass();
            k8 = new K8(c4810q92.a, c4810q92.b, c4810q92.c, CollectionUtils.hashSetFromIntArray(c4810q92.d));
        }
        this.c = k8;
        int i = k8.c;
        int i2 = this.a;
        if (i != i2) {
            k8.c = i2;
            k8.d = 0;
            N8 n82 = this.b;
            IBinaryDataHelper iBinaryDataHelper = n82.c;
            M8 m8 = n82.b;
            n82.a.getClass();
            C4810q9 c4810q9A = L8.a(k8);
            m8.getClass();
            iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(c4810q9A));
        }
    }
}

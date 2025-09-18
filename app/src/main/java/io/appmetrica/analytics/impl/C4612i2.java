package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashSet;

/* renamed from: io.appmetrica.analytics.impl.i2 */
/* loaded from: classes2.dex */
public final class C4612i2 extends AbstractC4625ig {
    public final tn b;
    public final C4676kj c;

    public C4612i2(C4567g5 c4567g5) {
        this(c4567g5, c4567g5.u(), C4676kj.c());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4625ig
    public final boolean a(T5 t5) {
        C4567g5 c4567g5 = this.a;
        if (!this.b.c() && !this.b.d()) {
            if (((Eg) c4567g5.l.a()).f) {
                this.c.b();
            }
            I8 i8 = this.a.m;
            if (i8.c == null) {
                i8.a();
            }
            K8 k8 = i8.c;
            k8.getClass();
            k8.b = new HashSet();
            k8.d = 0;
            K8 k82 = i8.c;
            k82.a = true;
            N8 n8 = i8.b;
            IBinaryDataHelper iBinaryDataHelper = n8.c;
            M8 m8 = n8.b;
            n8.a.getClass();
            C4810q9 c4810q9A = L8.a(k82);
            m8.getClass();
            iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(c4810q9A));
        }
        return false;
    }

    public C4612i2(C4567g5 c4567g5, tn tnVar, C4676kj c4676kj) {
        super(c4567g5);
        this.b = tnVar;
        this.c = c4676kj;
    }
}

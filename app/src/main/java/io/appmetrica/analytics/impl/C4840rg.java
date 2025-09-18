package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.rg */
/* loaded from: classes2.dex */
public final class C4840rg extends AbstractC4625ig {
    public final I8 b;

    public C4840rg(C4567g5 c4567g5) {
        this(c4567g5, c4567g5.i());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4625ig
    public final boolean a(T5 t5) {
        EnumC4424aa enumC4424aa;
        if (!TextUtils.isEmpty(t5.getName())) {
            I8 i8 = this.b;
            String name = t5.getName();
            if (i8.c == null) {
                i8.a();
            }
            int iHashCode = name.hashCode();
            if (i8.c.b.contains(Integer.valueOf(iHashCode))) {
                enumC4424aa = EnumC4424aa.NON_FIRST_OCCURENCE;
            } else {
                K8 k8 = i8.c;
                EnumC4424aa enumC4424aa2 = k8.a ? EnumC4424aa.FIRST_OCCURRENCE : EnumC4424aa.UNKNOWN;
                if (k8.d < 1000) {
                    k8.b.add(Integer.valueOf(iHashCode));
                    k8.d++;
                } else {
                    k8.a = false;
                }
                N8 n8 = i8.b;
                K8 k82 = i8.c;
                IBinaryDataHelper iBinaryDataHelper = n8.c;
                M8 m8 = n8.b;
                n8.a.getClass();
                C4810q9 c4810q9A = L8.a(k82);
                m8.getClass();
                iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(c4810q9A));
                enumC4424aa = enumC4424aa2;
            }
            t5.k = enumC4424aa;
        }
        return false;
    }

    public C4840rg(C4567g5 c4567g5, I8 i8) {
        super(c4567g5);
        this.b = i8;
    }
}

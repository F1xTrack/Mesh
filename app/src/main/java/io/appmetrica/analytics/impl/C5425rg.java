package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.rg */
/* loaded from: classes2.dex */
public final class C5425rg extends AbstractC5200ig {

    /* renamed from: b */
    public final C4561I8 f32510b;

    public C5425rg(C5139g5 c5139g5) {
        this(c5139g5, c5139g5.m20418i());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5200ig
    /* renamed from: a */
    public final boolean mo19341a(C4821T5 c4821t5) {
        EnumC4994aa enumC4994aa;
        if (!TextUtils.isEmpty(c4821t5.getName())) {
            C4561I8 c4561i8 = this.f32510b;
            String name = c4821t5.getName();
            if (c4561i8.f30278c == null) {
                c4561i8.m19496a();
            }
            int iHashCode = name.hashCode();
            if (c4561i8.f30278c.f30392b.contains(Integer.valueOf(iHashCode))) {
                enumC4994aa = EnumC4994aa.NON_FIRST_OCCURENCE;
            } else {
                C4609K8 c4609k8 = c4561i8.f30278c;
                EnumC4994aa enumC4994aa2 = c4609k8.f30391a ? EnumC4994aa.FIRST_OCCURRENCE : EnumC4994aa.UNKNOWN;
                if (c4609k8.f30394d < 1000) {
                    c4609k8.f30392b.add(Integer.valueOf(iHashCode));
                    c4609k8.f30394d++;
                } else {
                    c4609k8.f30391a = false;
                }
                C4681N8 c4681n8 = c4561i8.f30277b;
                C4609K8 c4609k82 = c4561i8.f30278c;
                IBinaryDataHelper iBinaryDataHelper = c4681n8.f30506c;
                C4657M8 c4657m8 = c4681n8.f30505b;
                c4681n8.f30504a.getClass();
                C5393q9 c5393q9M19595a = C4633L8.m19595a(c4609k82);
                c4657m8.getClass();
                iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(c5393q9M19595a));
                enumC4994aa = enumC4994aa2;
            }
            c4821t5.f30771k = enumC4994aa;
        }
        return false;
    }

    public C5425rg(C5139g5 c5139g5, C4561I8 c4561i8) {
        super(c5139g5);
        this.f32510b = c4561i8;
    }
}

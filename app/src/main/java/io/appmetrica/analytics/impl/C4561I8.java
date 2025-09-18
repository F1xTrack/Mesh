package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.I8 */
/* loaded from: classes2.dex */
public final class C4561I8 {

    /* renamed from: a */
    public final int f30276a;

    /* renamed from: b */
    public final C4681N8 f30277b;

    /* renamed from: c */
    public C4609K8 f30278c;

    public C4561I8(C4681N8 c4681n8, int i) {
        this.f30276a = i;
        this.f30277b = c4681n8;
    }

    /* renamed from: a */
    public final void m19496a() {
        C4609K8 c4609k8;
        C4681N8 c4681n8 = this.f30277b;
        c4681n8.getClass();
        try {
            byte[] bArr = c4681n8.f30506c.get("event_hashes");
            if (bArr == null || bArr.length == 0) {
                C4633L8 c4633l8 = c4681n8.f30504a;
                c4681n8.f30505b.getClass();
                C5393q9 c5393q9 = new C5393q9();
                c4633l8.getClass();
                c4609k8 = new C4609K8(c5393q9.f32440a, c5393q9.f32441b, c5393q9.f32442c, CollectionUtils.hashSetFromIntArray(c5393q9.f32443d));
            } else {
                C4633L8 c4633l82 = c4681n8.f30504a;
                C5393q9 state = c4681n8.f30505b.toState(bArr);
                c4633l82.getClass();
                c4609k8 = new C4609K8(state.f32440a, state.f32441b, state.f32442c, CollectionUtils.hashSetFromIntArray(state.f32443d));
            }
        } catch (Throwable unused) {
            C4633L8 c4633l83 = c4681n8.f30504a;
            c4681n8.f30505b.getClass();
            C5393q9 c5393q92 = new C5393q9();
            c4633l83.getClass();
            c4609k8 = new C4609K8(c5393q92.f32440a, c5393q92.f32441b, c5393q92.f32442c, CollectionUtils.hashSetFromIntArray(c5393q92.f32443d));
        }
        this.f30278c = c4609k8;
        int i = c4609k8.f30393c;
        int i2 = this.f30276a;
        if (i != i2) {
            c4609k8.f30393c = i2;
            c4609k8.f30394d = 0;
            C4681N8 c4681n82 = this.f30277b;
            IBinaryDataHelper iBinaryDataHelper = c4681n82.f30506c;
            C4657M8 c4657m8 = c4681n82.f30505b;
            c4681n82.f30504a.getClass();
            C5393q9 c5393q9M19595a = C4633L8.m19595a(c4609k8);
            c4657m8.getClass();
            iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(c5393q9M19595a));
        }
    }
}

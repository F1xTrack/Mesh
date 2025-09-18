package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.L8 */
/* loaded from: classes2.dex */
public final class C4633L8 implements ProtobufConverter {
    /* renamed from: a */
    public static C5393q9 m19595a(C4609K8 c4609k8) {
        C5393q9 c5393q9 = new C5393q9();
        c5393q9.f32443d = new int[c4609k8.f30392b.size()];
        Iterator it = c4609k8.f30392b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c5393q9.f32443d[i] = ((Integer) it.next()).intValue();
            i++;
        }
        c5393q9.f32442c = c4609k8.f30394d;
        c5393q9.f32441b = c4609k8.f30393c;
        c5393q9.f32440a = c4609k8.f30391a;
        return c5393q9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return m19595a((C4609K8) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C5393q9 c5393q9 = (C5393q9) obj;
        return new C4609K8(c5393q9.f32440a, c5393q9.f32441b, c5393q9.f32442c, CollectionUtils.hashSetFromIntArray(c5393q9.f32443d));
    }
}

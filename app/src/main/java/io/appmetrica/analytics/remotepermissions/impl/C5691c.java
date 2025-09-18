package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p000.AbstractC7038vr;
import p000.AbstractC7167xu;
import p000.AbstractC7293zu;
import p000.C1156SN;

/* renamed from: io.appmetrica.analytics.remotepermissions.impl.c */
/* loaded from: classes2.dex */
public final class C5691c implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5694f fromModel(C5689a c5689a) {
        C5694f c5694f = new C5694f();
        Set set = c5689a.f33184a;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(set));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).getBytes(AbstractC7038vr.f44561a));
        }
        Object[] array = arrayList.toArray(new byte[0][]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        c5694f.f33192a = (byte[][]) array;
        return c5694f;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5689a toModel(C5694f c5694f) {
        Set setM25987g0;
        byte[][] bArr = c5694f.f33192a;
        if (bArr != null) {
            ArrayList arrayList = new ArrayList(bArr.length);
            for (byte[] bArr2 : bArr) {
                arrayList.add(new String(bArr2, AbstractC7038vr.f44561a));
            }
            setM25987g0 = AbstractC7167xu.m25987g0(arrayList);
        } else {
            setM25987g0 = C1156SN.f10705a;
        }
        return new C5689a(setM25987g0);
    }
}

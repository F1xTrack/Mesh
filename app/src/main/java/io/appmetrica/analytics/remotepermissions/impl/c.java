package io.appmetrica.analytics.remotepermissions.impl;

import defpackage.AbstractC7680vr;
import defpackage.AbstractC8069xu;
import defpackage.AbstractC8449zu;
import defpackage.SN;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class c implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f fromModel(a aVar) {
        f fVar = new f();
        Set set = aVar.a;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(set));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).getBytes(AbstractC7680vr.a));
        }
        Object[] array = arrayList.toArray(new byte[0][]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        fVar.a = (byte[][]) array;
        return fVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a toModel(f fVar) {
        Set setG0;
        byte[][] bArr = fVar.a;
        if (bArr != null) {
            ArrayList arrayList = new ArrayList(bArr.length);
            for (byte[] bArr2 : bArr) {
                arrayList.add(new String(bArr2, AbstractC7680vr.a));
            }
            setG0 = AbstractC8069xu.g0(arrayList);
        } else {
            setG0 = SN.a;
        }
        return new a(setG0);
    }
}

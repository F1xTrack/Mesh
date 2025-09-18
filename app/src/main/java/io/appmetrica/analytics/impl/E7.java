package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.AbstractC0314Du;
import defpackage.AbstractC8259yu;
import defpackage.AbstractC8449zu;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class E7 implements ServiceComponentsInitializer {
    public final List a = AbstractC8259yu.f("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(Context context) {
        Cc cc = C4667ka.C.s;
        List list = this.a;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C4949w5((String) it.next()));
        }
        Object[] array = arrayList.toArray(new C4949w5[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        C4949w5[] c4949w5Arr = (C4949w5[]) array;
        Bc[] bcArr = (Bc[]) Arrays.copyOf(c4949w5Arr, c4949w5Arr.length);
        synchronized (cc) {
            AbstractC0314Du.n(cc.a, bcArr);
        }
        C4667ka.C.s.a(new C4695le(context, "io.appmetrica.analytics.modules.ads", "lsm"));
    }
}

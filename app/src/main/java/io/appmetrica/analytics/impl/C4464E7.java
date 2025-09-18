package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC0246Du;
import p000.AbstractC7230yu;
import p000.AbstractC7293zu;

/* renamed from: io.appmetrica.analytics.impl.E7 */
/* loaded from: classes2.dex */
public final class C4464E7 implements ServiceComponentsInitializer {

    /* renamed from: a */
    public final List f30054a = AbstractC7230yu.m26275f("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(Context context) {
        C4419Cc c4419Cc = C5244ka.f32038C.f32059s;
        List list = this.f30054a;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C5539w5((String) it.next()));
        }
        Object[] array = arrayList.toArray(new C5539w5[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        C5539w5[] c5539w5Arr = (C5539w5[]) array;
        InterfaceC4394Bc[] interfaceC4394BcArr = (InterfaceC4394Bc[]) Arrays.copyOf(c5539w5Arr, c5539w5Arr.length);
        synchronized (c4419Cc) {
            AbstractC0246Du.m1921n(c4419Cc.f29955a, interfaceC4394BcArr);
        }
        C5244ka.f32038C.f32059s.m19270a(new C5273le(context, "io.appmetrica.analytics.modules.ads", "lsm"));
    }
}

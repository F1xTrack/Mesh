package io.appmetrica.analytics.impl;

import defpackage.AbstractC0314Du;
import defpackage.AbstractC8259yu;
import defpackage.AbstractC8449zu;
import io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class C7 implements ClientComponentsInitializer {
    public final List a = AbstractC8259yu.f("io.appmetrica.analytics.adrevenue.admob.v23.internal.AdMobClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.applovin.v12.internal.AppLovinClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.fyber.v3.internal.FyberClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudClientModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer
    public final void onCreate() {
        if (C4805q4.h().a.c()) {
            Cc cc = C4805q4.h().m;
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
        }
    }
}

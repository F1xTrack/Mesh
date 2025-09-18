package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC0246Du;
import p000.AbstractC7230yu;
import p000.AbstractC7293zu;

/* renamed from: io.appmetrica.analytics.impl.C7 */
/* loaded from: classes2.dex */
public final class C4414C7 implements ClientComponentsInitializer {

    /* renamed from: a */
    public final List f29954a = AbstractC7230yu.m26275f("io.appmetrica.analytics.adrevenue.admob.v23.internal.AdMobClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.applovin.v12.internal.AppLovinClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.fyber.v3.internal.FyberClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudClientModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer
    public final void onCreate() {
        if (C5388q4.m20928h().f32418a.m19887c()) {
            C4419Cc c4419Cc = C5388q4.m20928h().f32430m;
            List list = this.f29954a;
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
        }
    }
}

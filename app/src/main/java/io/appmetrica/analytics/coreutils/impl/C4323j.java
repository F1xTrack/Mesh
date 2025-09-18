package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import p000.AbstractC8418Vg0;
import p000.C8313Tf1;
import p000.InterfaceC6434mZ;

/* renamed from: io.appmetrica.analytics.coreutils.impl.j */
/* loaded from: classes2.dex */
public final class C4323j extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: a */
    public final /* synthetic */ Context f29695a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f29696b;

    /* renamed from: c */
    public final /* synthetic */ int f29697c;

    /* renamed from: d */
    public final /* synthetic */ int f29698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4323j(Context context, ComponentName componentName, int i, int i2) {
        super(0);
        this.f29695a = context;
        this.f29696b = componentName;
        this.f29697c = i;
        this.f29698d = i2;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        this.f29695a.getPackageManager().setComponentEnabledSetting(this.f29696b, this.f29697c, this.f29698d);
        return C8313Tf1.f11463a;
    }
}

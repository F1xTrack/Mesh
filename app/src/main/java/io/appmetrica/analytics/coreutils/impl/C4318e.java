package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

/* renamed from: io.appmetrica.analytics.coreutils.impl.e */
/* loaded from: classes2.dex */
public final class C4318e extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: a */
    public final /* synthetic */ Context f29682a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f29683b;

    /* renamed from: c */
    public final /* synthetic */ int f29684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4318e(Context context, ComponentName componentName, int i) {
        super(0);
        this.f29682a = context;
        this.f29683b = componentName;
        this.f29684c = i;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        return this.f29682a.getPackageManager().getServiceInfo(this.f29683b, this.f29684c);
    }
}

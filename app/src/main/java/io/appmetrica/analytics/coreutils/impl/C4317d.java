package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

/* renamed from: io.appmetrica.analytics.coreutils.impl.d */
/* loaded from: classes2.dex */
public final class C4317d extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: a */
    public final /* synthetic */ Context f29679a;

    /* renamed from: b */
    public final /* synthetic */ String f29680b;

    /* renamed from: c */
    public final /* synthetic */ int f29681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4317d(Context context, String str, int i) {
        super(0);
        this.f29679a = context;
        this.f29680b = str;
        this.f29681c = i;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        return this.f29679a.getPackageManager().getPackageInfo(this.f29680b, this.f29681c);
    }
}

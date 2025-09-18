package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

/* renamed from: io.appmetrica.analytics.coreutils.impl.a */
/* loaded from: classes2.dex */
public final class C4314a extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: a */
    public final /* synthetic */ Context f29671a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f29672b;

    /* renamed from: c */
    public final /* synthetic */ int f29673c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4314a(Context context, ComponentName componentName, int i) {
        super(0);
        this.f29671a = context;
        this.f29672b = componentName;
        this.f29673c = i;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        return this.f29671a.getPackageManager().getActivityInfo(this.f29672b, this.f29673c);
    }
}

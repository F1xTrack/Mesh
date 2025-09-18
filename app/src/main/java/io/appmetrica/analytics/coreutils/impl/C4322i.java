package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

/* renamed from: io.appmetrica.analytics.coreutils.impl.i */
/* loaded from: classes2.dex */
public final class C4322i extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: a */
    public final /* synthetic */ Context f29692a;

    /* renamed from: b */
    public final /* synthetic */ Intent f29693b;

    /* renamed from: c */
    public final /* synthetic */ int f29694c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4322i(Context context, Intent intent, int i) {
        super(0);
        this.f29692a = context;
        this.f29693b = intent;
        this.f29694c = i;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        return this.f29692a.getPackageManager().resolveService(this.f29693b, this.f29694c);
    }
}

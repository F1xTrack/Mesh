package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

/* renamed from: io.appmetrica.analytics.coreutils.impl.g */
/* loaded from: classes2.dex */
public final class C4320g extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: a */
    public final /* synthetic */ Context f29687a;

    /* renamed from: b */
    public final /* synthetic */ Intent f29688b;

    /* renamed from: c */
    public final /* synthetic */ int f29689c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4320g(Context context, Intent intent, int i) {
        super(0);
        this.f29687a = context;
        this.f29688b = intent;
        this.f29689c = i;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        return this.f29687a.getPackageManager().resolveActivity(this.f29688b, this.f29689c);
    }
}

package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC5908mZ;

/* loaded from: classes2.dex */
public final class g extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, Intent intent, int i) {
        super(0);
        this.a = context;
        this.b = intent;
        this.c = i;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        return this.a.getPackageManager().resolveActivity(this.b, this.c);
    }
}

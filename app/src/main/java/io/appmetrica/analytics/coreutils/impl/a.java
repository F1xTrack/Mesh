package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC5908mZ;

/* loaded from: classes2.dex */
public final class a extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ComponentName b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, ComponentName componentName, int i) {
        super(0);
        this.a = context;
        this.b = componentName;
        this.c = i;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        return this.a.getPackageManager().getActivityInfo(this.b, this.c);
    }
}

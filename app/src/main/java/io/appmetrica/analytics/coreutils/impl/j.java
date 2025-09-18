package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import defpackage.AbstractC1676Vg0;
import defpackage.C1518Tf1;
import defpackage.InterfaceC5908mZ;

/* loaded from: classes2.dex */
public final class j extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ComponentName b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, ComponentName componentName, int i, int i2) {
        super(0);
        this.a = context;
        this.b = componentName;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        this.a.getPackageManager().setComponentEnabledSetting(this.b, this.c, this.d);
        return C1518Tf1.a;
    }
}

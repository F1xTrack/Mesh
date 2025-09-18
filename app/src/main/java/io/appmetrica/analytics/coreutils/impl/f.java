package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC5908mZ;

/* loaded from: classes2.dex */
public final class f extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, String str) {
        super(0);
        this.a = context;
        this.b = str;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        return Boolean.valueOf(this.a.getPackageManager().hasSystemFeature(this.b));
    }
}

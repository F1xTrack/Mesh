package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC5908mZ;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtilsTiramisu;

/* loaded from: classes2.dex */
public final class h extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, String str) {
        super(0);
        this.a = context;
        this.b = str;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        PackageManager packageManager = this.a.getPackageManager();
        return AndroidUtils.isApiAchieved(33) ? PackageManagerUtilsTiramisu.INSTANCE.resolveContentProvider(packageManager, this.b) : packageManager.resolveContentProvider(this.b, 128);
    }
}

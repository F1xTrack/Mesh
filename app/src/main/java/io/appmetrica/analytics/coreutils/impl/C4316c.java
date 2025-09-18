package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManagerHelperForR;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

/* renamed from: io.appmetrica.analytics.coreutils.impl.c */
/* loaded from: classes2.dex */
public final class C4316c extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: a */
    public final /* synthetic */ Context f29677a;

    /* renamed from: b */
    public final /* synthetic */ String f29678b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4316c(Context context, String str) {
        super(0);
        this.f29677a = context;
        this.f29678b = str;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        PackageManager packageManager = this.f29677a.getPackageManager();
        return AndroidUtils.isApiAchieved(30) ? SafePackageManagerHelperForR.extractPackageInstaller(packageManager, this.f29678b) : packageManager.getInstallerPackageName(this.f29678b);
    }
}

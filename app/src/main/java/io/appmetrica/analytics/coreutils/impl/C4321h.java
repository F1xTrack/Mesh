package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtilsTiramisu;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

/* renamed from: io.appmetrica.analytics.coreutils.impl.h */
/* loaded from: classes2.dex */
public final class C4321h extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: a */
    public final /* synthetic */ Context f29690a;

    /* renamed from: b */
    public final /* synthetic */ String f29691b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4321h(Context context, String str) {
        super(0);
        this.f29690a = context;
        this.f29691b = str;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        PackageManager packageManager = this.f29690a.getPackageManager();
        return AndroidUtils.isApiAchieved(33) ? PackageManagerUtilsTiramisu.INSTANCE.resolveContentProvider(packageManager, this.f29691b) : packageManager.resolveContentProvider(this.f29691b, 128);
    }
}

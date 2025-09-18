package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

/* renamed from: io.appmetrica.analytics.coreutils.impl.f */
/* loaded from: classes2.dex */
public final class C4319f extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: a */
    public final /* synthetic */ Context f29685a;

    /* renamed from: b */
    public final /* synthetic */ String f29686b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4319f(Context context, String str) {
        super(0);
        this.f29685a = context;
        this.f29686b = str;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        return Boolean.valueOf(this.f29685a.getPackageManager().hasSystemFeature(this.f29686b));
    }
}

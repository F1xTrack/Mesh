package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

/* renamed from: io.appmetrica.analytics.coreutils.impl.b */
/* loaded from: classes2.dex */
public final class C4315b extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: a */
    public final /* synthetic */ Context f29674a;

    /* renamed from: b */
    public final /* synthetic */ String f29675b;

    /* renamed from: c */
    public final /* synthetic */ int f29676c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4315b(Context context, String str, int i) {
        super(0);
        this.f29674a = context;
        this.f29675b = str;
        this.f29676c = i;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        return this.f29674a.getPackageManager().getApplicationInfo(this.f29675b, this.f29676c);
    }
}

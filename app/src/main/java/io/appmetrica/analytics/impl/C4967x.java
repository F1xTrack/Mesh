package io.appmetrica.analytics.impl;

import defpackage.AbstractC1676Vg0;
import defpackage.C1518Tf1;
import defpackage.InterfaceC6099nZ;

/* renamed from: io.appmetrica.analytics.impl.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4967x extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ C4871t a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4967x(C4871t c4871t) {
        super(1);
        this.a = c4871t;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        this.a.f = (byte[]) obj;
        return C1518Tf1.a;
    }
}

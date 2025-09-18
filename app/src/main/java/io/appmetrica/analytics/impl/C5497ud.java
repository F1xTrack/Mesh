package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import p000.AbstractC1374Vq;

/* renamed from: io.appmetrica.analytics.impl.ud */
/* loaded from: classes2.dex */
public final class C5497ud implements InterfaceC5357on {

    /* renamed from: a */
    public final String f32688a;

    public C5497ud(String str) {
        this.f32688a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357on
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5307mn mo19211a(String str) {
        return TextUtils.isEmpty(str) ? new C5307mn(this, false, AbstractC1374Vq.m8593l(new StringBuilder(), this.f32688a, " is empty.")) : new C5307mn(this, true, "");
    }
}

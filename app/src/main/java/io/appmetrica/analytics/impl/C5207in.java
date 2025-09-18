package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.in */
/* loaded from: classes2.dex */
public final class C5207in implements InterfaceC4539Ha {
    @Override // io.appmetrica.analytics.impl.InterfaceC4539Ha
    /* renamed from: a */
    public final String mo19466a(Context context) {
        IdentifiersResult identifiersResultM20750q = new C5298me(C4966Z6.m20064a(context.getApplicationContext()).m20066a()).m20750q();
        if (TextUtils.isEmpty(identifiersResultM20750q.f32948id)) {
            return null;
        }
        return identifiersResultM20750q.f32948id;
    }
}

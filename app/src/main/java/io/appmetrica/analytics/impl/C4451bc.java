package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.bc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4451bc extends AbstractC4537f {
    public C4451bc(Context context, Sf sf) {
        super(context, sf);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4537f
    public final void b(T5 t5, D4 d4) {
        C4667ka.C.j().a(((Boolean) WrapUtils.getOrDefault(d4.b.b, Boolean.FALSE)).booleanValue());
        this.b.a(t5, d4);
    }
}

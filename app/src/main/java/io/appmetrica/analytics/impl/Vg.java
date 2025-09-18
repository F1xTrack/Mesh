package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ICrashTransformer;

/* loaded from: classes2.dex */
public final class Vg extends AbstractC4711m6 {
    public final Sm d;

    public Vg(Context context, Sm sm, InterfaceC4687l6 interfaceC4687l6, ICrashTransformer iCrashTransformer) {
        this(sm, interfaceC4687l6, iCrashTransformer, new J9(context));
    }

    public final Sm c() {
        return this.d;
    }

    public Vg(Sm sm, InterfaceC4687l6 interfaceC4687l6, ICrashTransformer iCrashTransformer, J9 j9) {
        super(interfaceC4687l6, iCrashTransformer, j9);
        this.d = sm;
    }
}

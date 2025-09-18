package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.Vg */
/* loaded from: classes2.dex */
public final class C4880Vg extends AbstractC5290m6 {

    /* renamed from: d */
    public final AbstractC4814Sm f30865d;

    public C4880Vg(Context context, AbstractC4814Sm abstractC4814Sm, InterfaceC5265l6 interfaceC5265l6, ICrashTransformer iCrashTransformer) {
        this(abstractC4814Sm, interfaceC5265l6, iCrashTransformer, new C4586J9(context));
    }

    /* renamed from: c */
    public final AbstractC4814Sm m19919c() {
        return this.f30865d;
    }

    public C4880Vg(AbstractC4814Sm abstractC4814Sm, InterfaceC5265l6 interfaceC5265l6, ICrashTransformer iCrashTransformer, C4586J9 c4586j9) {
        super(interfaceC5265l6, iCrashTransformer, c4586j9);
        this.f30865d = abstractC4814Sm;
    }
}

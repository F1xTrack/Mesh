package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;

/* loaded from: classes2.dex */
public final class I4 implements InterfaceC4876t4 {
    public final Context a;
    public final L4 b;
    public final ResultReceiver c;

    public I4(Context context, L4 l4, D4 d4) {
        this.a = context;
        this.b = l4;
        this.c = d4.c;
        l4.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4876t4
    public final void a(T5 t5, D4 d4) {
        this.b.a(d4.b);
        this.b.a(t5, this);
    }

    public final L4 b() {
        return this.b;
    }

    public final Context c() {
        return this.a;
    }

    public final ResultReceiver d() {
        return this.c;
    }

    public final void a(C4590h4 c4590h4) {
        B6.a(this.c, c4590h4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4876t4
    public final void a() {
        this.b.b(this);
    }
}

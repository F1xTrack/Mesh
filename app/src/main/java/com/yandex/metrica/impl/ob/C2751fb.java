package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.Ma;

/* renamed from: com.yandex.metrica.impl.ob.fb */
/* loaded from: classes2.dex */
public class C2751fb {
    private final Q9 a;
    private final Q9 b;
    private final Za<Be> c;
    private final Za<P3> d;

    public C2751fb(Context context) {
        this(context, Ma.b.a(P3.class).a(context), Ma.b.a(Be.class).a(context), new C2626ab());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(Qi qi) {
        this.c.a(this.b.b(), qi.m());
        this.d.a(this.a.b(), qi.m());
    }

    public C2751fb(Context context, Q9 q9, Q9 q92, C2626ab c2626ab) {
        this.a = q9;
        this.b = q92;
        this.c = c2626ab.c(context, Lm.c());
        this.d = c2626ab.b(context, Lm.c());
    }
}

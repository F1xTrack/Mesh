package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* renamed from: x10 */
/* loaded from: classes.dex */
public final class C7903x10 extends ContextWrapper {
    public static final K00 k = new K00();
    public final C8426zm0 a;
    public final DO b;
    public final OJ1 c;
    public final C3759fN d;
    public final List e;
    public final C7925x8 f;
    public final EO g;
    public final C1016Mu0 h;
    public final int i;
    public PR0 j;

    public C7903x10(Context context, C8426zm0 c8426zm0, VG vg, OJ1 oj1, C3759fN c3759fN, C7925x8 c7925x8, List list, EO eo, C1016Mu0 c1016Mu0, int i) {
        super(context.getApplicationContext());
        this.a = c8426zm0;
        this.c = oj1;
        this.d = c3759fN;
        this.e = list;
        this.f = c7925x8;
        this.g = eo;
        this.h = c1016Mu0;
        this.i = i;
        this.b = new DO(vg);
    }

    public final C3578eQ0 a() {
        return (C3578eQ0) this.b.get();
    }
}

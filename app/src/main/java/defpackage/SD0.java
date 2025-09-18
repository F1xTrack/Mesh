package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class SD0 {
    public final ContentResolver a;
    public final Resources b;
    public final AssetManager c;
    public final E00 d;
    public final ES1 e;
    public final C6446pN0 f;
    public final int g;
    public final boolean h;
    public final C7375uF i;
    public final VH j;
    public final C0593Hj k;
    public final C0593Hj l;
    public final CC0 m;
    public final CC0 n;
    public final TE o;
    public final N8 p;
    public final C1016Mu0 q;
    public final int r;
    public final Map s;

    public SD0(Context context, E00 e00, ES1 es1, C6446pN0 c6446pN0, int i, boolean z, C7375uF c7375uF, VH vh, CC0 cc0, CC0 cc02, C0593Hj c0593Hj, C0593Hj c0593Hj2, Map map, TE te, N8 n8, C1016Mu0 c1016Mu0) {
        this.a = context.getApplicationContext().getContentResolver();
        this.b = context.getApplicationContext().getResources();
        this.c = context.getApplicationContext().getAssets();
        this.d = e00;
        this.e = es1;
        this.f = c6446pN0;
        this.g = i;
        this.h = z;
        this.i = c7375uF;
        this.j = vh;
        this.n = cc0;
        this.m = cc02;
        this.k = c0593Hj;
        this.l = c0593Hj2;
        this.s = map;
        this.o = te;
        this.p = n8;
        new OL0();
        new OL0();
        this.r = 2048;
        this.q = c1016Mu0;
    }

    public final C2328bS0 a(QD0 qd0, boolean z, C5587kt0 c5587kt0) {
        return new C2328bS0((ExecutorService) this.i.c, this.j, qd0, z, c5587kt0);
    }
}

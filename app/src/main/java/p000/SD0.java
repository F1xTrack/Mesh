package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class SD0 {

    /* renamed from: a */
    public final ContentResolver f10623a;

    /* renamed from: b */
    public final Resources f10624b;

    /* renamed from: c */
    public final AssetManager f10625c;

    /* renamed from: d */
    public final E00 f10626d;

    /* renamed from: e */
    public final ES1 f10627e;

    /* renamed from: f */
    public final C10641pN0 f10628f;

    /* renamed from: g */
    public final int f10629g;

    /* renamed from: h */
    public final boolean f10630h;

    /* renamed from: i */
    public final C6937uF f10631i;

    /* renamed from: j */
    public final C1339VH f10632j;

    /* renamed from: k */
    public final C0487Hj f10633k;

    /* renamed from: l */
    public final C0487Hj f10634l;

    /* renamed from: m */
    public final CC0 f10635m;

    /* renamed from: n */
    public final CC0 f10636n;

    /* renamed from: o */
    public final C1210TE f10637o;

    /* renamed from: p */
    public final C0827N8 f10638p;

    /* renamed from: q */
    public final C7978Mu0 f10639q;

    /* renamed from: r */
    public final int f10640r;

    /* renamed from: s */
    public final Map f10641s;

    public SD0(Context context, E00 e00, ES1 es1, C10641pN0 c10641pN0, int i, boolean z, C6937uF c6937uF, C1339VH c1339vh, CC0 cc0, CC0 cc02, C0487Hj c0487Hj, C0487Hj c0487Hj2, Map map, C1210TE c1210te, C0827N8 c0827n8, C7978Mu0 c7978Mu0) {
        this.f10623a = context.getApplicationContext().getContentResolver();
        this.f10624b = context.getApplicationContext().getResources();
        this.f10625c = context.getApplicationContext().getAssets();
        this.f10626d = e00;
        this.f10627e = es1;
        this.f10628f = c10641pN0;
        this.f10629g = i;
        this.f10630h = z;
        this.f10631i = c6937uF;
        this.f10632j = c1339vh;
        this.f10636n = cc0;
        this.f10635m = cc02;
        this.f10633k = c0487Hj;
        this.f10634l = c0487Hj2;
        this.f10641s = map;
        this.f10637o = c1210te;
        this.f10638p = c0827n8;
        new OL0();
        new OL0();
        this.f10640r = 2048;
        this.f10639q = c7978Mu0;
    }

    /* renamed from: a */
    public final C8854bS0 m7197a(QD0 qd0, boolean z, C10065kt0 c10065kt0) {
        return new C8854bS0((ExecutorService) this.f10631i.f43618c, this.f10632j, qd0, z, c10065kt0);
    }
}

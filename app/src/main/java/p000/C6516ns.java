package p000;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.KotlinVersion;

/* renamed from: ns */
/* loaded from: classes.dex */
public final class C6516ns {

    /* renamed from: a */
    public final RectF f38565a = new RectF();

    /* renamed from: b */
    public final Paint f38566b;

    /* renamed from: c */
    public final Paint f38567c;

    /* renamed from: d */
    public final Paint f38568d;

    /* renamed from: e */
    public float f38569e;

    /* renamed from: f */
    public float f38570f;

    /* renamed from: g */
    public float f38571g;

    /* renamed from: h */
    public float f38572h;

    /* renamed from: i */
    public int[] f38573i;

    /* renamed from: j */
    public int f38574j;

    /* renamed from: k */
    public float f38575k;

    /* renamed from: l */
    public float f38576l;

    /* renamed from: m */
    public float f38577m;

    /* renamed from: n */
    public boolean f38578n;

    /* renamed from: o */
    public Path f38579o;

    /* renamed from: p */
    public float f38580p;

    /* renamed from: q */
    public float f38581q;

    /* renamed from: r */
    public int f38582r;

    /* renamed from: s */
    public int f38583s;

    /* renamed from: t */
    public int f38584t;

    /* renamed from: u */
    public int f38585u;

    public C6516ns() {
        Paint paint = new Paint();
        this.f38566b = paint;
        Paint paint2 = new Paint();
        this.f38567c = paint2;
        Paint paint3 = new Paint();
        this.f38568d = paint3;
        this.f38569e = 0.0f;
        this.f38570f = 0.0f;
        this.f38571g = 0.0f;
        this.f38572h = 5.0f;
        this.f38580p = 1.0f;
        this.f38584t = KotlinVersion.MAX_COMPONENT_VALUE;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    /* renamed from: a */
    public final void m23242a(int i) {
        this.f38574j = i;
        this.f38585u = this.f38573i[i];
    }
}

package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.KotlinVersion;

/* renamed from: ns, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6156ns {
    public final RectF a = new RectF();
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int[] i;
    public int j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public Path o;
    public float p;
    public float q;
    public int r;
    public int s;
    public int t;
    public int u;

    public C6156ns() {
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        Paint paint3 = new Paint();
        this.d = paint3;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 5.0f;
        this.p = 1.0f;
        this.t = KotlinVersion.MAX_COMPONENT_VALUE;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i) {
        this.j = i;
        this.u = this.i[i];
    }
}

package p000;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class JZ0 {

    /* renamed from: i */
    public static final int[] f5604i = new int[3];

    /* renamed from: j */
    public static final float[] f5605j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f5606k = new int[4];

    /* renamed from: l */
    public static final float[] f5607l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f5608a;

    /* renamed from: b */
    public final Paint f5609b;

    /* renamed from: c */
    public final Paint f5610c;

    /* renamed from: d */
    public final int f5611d;

    /* renamed from: e */
    public final int f5612e;

    /* renamed from: f */
    public final int f5613f;

    /* renamed from: g */
    public final Path f5614g = new Path();

    /* renamed from: h */
    public final Paint f5615h;

    public JZ0() {
        Paint paint = new Paint();
        this.f5615h = paint;
        Paint paint2 = new Paint();
        this.f5608a = paint2;
        this.f5611d = AbstractC0749Lu.m5133f(-16777216, 68);
        this.f5612e = AbstractC0749Lu.m5133f(-16777216, 20);
        this.f5613f = AbstractC0749Lu.m5133f(-16777216, 0);
        paint2.setColor(this.f5611d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f5609b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f5610c = new Paint(paint3);
    }
}

package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* renamed from: b61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8811b61 {

    /* renamed from: A */
    public int f16747A;

    /* renamed from: B */
    public int f16748B;

    /* renamed from: C */
    public int f16749C;

    /* renamed from: D */
    public int f16750D;

    /* renamed from: E */
    public StaticLayout f16751E;

    /* renamed from: F */
    public StaticLayout f16752F;

    /* renamed from: G */
    public int f16753G;

    /* renamed from: H */
    public int f16754H;

    /* renamed from: I */
    public int f16755I;

    /* renamed from: J */
    public Rect f16756J;

    /* renamed from: a */
    public final float f16757a;

    /* renamed from: b */
    public final float f16758b;

    /* renamed from: c */
    public final float f16759c;

    /* renamed from: d */
    public final float f16760d;

    /* renamed from: e */
    public final float f16761e;

    /* renamed from: f */
    public final TextPaint f16762f;

    /* renamed from: g */
    public final Paint f16763g;

    /* renamed from: h */
    public final Paint f16764h;

    /* renamed from: i */
    public CharSequence f16765i;

    /* renamed from: j */
    public Layout.Alignment f16766j;

    /* renamed from: k */
    public Bitmap f16767k;

    /* renamed from: l */
    public float f16768l;

    /* renamed from: m */
    public int f16769m;

    /* renamed from: n */
    public int f16770n;

    /* renamed from: o */
    public float f16771o;

    /* renamed from: p */
    public int f16772p;

    /* renamed from: q */
    public float f16773q;

    /* renamed from: r */
    public float f16774r;

    /* renamed from: s */
    public int f16775s;

    /* renamed from: t */
    public int f16776t;

    /* renamed from: u */
    public int f16777u;

    /* renamed from: v */
    public int f16778v;

    /* renamed from: w */
    public int f16779w;

    /* renamed from: x */
    public float f16780x;

    /* renamed from: y */
    public float f16781y;

    /* renamed from: z */
    public float f16782z;

    public C8811b61(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f16761e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f16760d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f16757a = fRound;
        this.f16758b = fRound;
        this.f16759c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f16762f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f16763g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f16764h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* renamed from: a */
    public final void m10421a(Canvas canvas, boolean z) {
        if (!z) {
            this.f16756J.getClass();
            this.f16767k.getClass();
            canvas.drawBitmap(this.f16767k, (Rect) null, this.f16756J, this.f16764h);
            return;
        }
        StaticLayout staticLayout = this.f16751E;
        StaticLayout staticLayout2 = this.f16752F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f16753G, this.f16754H);
        if (Color.alpha(this.f16777u) > 0) {
            Paint paint = this.f16763g;
            paint.setColor(this.f16777u);
            canvas.drawRect(-this.f16755I, 0.0f, staticLayout.getWidth() + this.f16755I, staticLayout.getHeight(), paint);
        }
        int i = this.f16779w;
        TextPaint textPaint = this.f16762f;
        if (i == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f16757a);
            textPaint.setColor(this.f16778v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else {
            float f = this.f16758b;
            if (i == 2) {
                float f2 = this.f16759c;
                textPaint.setShadowLayer(f, f2, f2, this.f16778v);
            } else if (i == 3 || i == 4) {
                boolean z2 = i == 3;
                int i2 = z2 ? -1 : this.f16778v;
                int i3 = z2 ? this.f16778v : -1;
                float f3 = f / 2.0f;
                textPaint.setColor(this.f16775s);
                textPaint.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                textPaint.setShadowLayer(f, f4, f4, i2);
                staticLayout2.draw(canvas);
                textPaint.setShadowLayer(f, f3, f3, i3);
            }
        }
        textPaint.setColor(this.f16775s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }
}

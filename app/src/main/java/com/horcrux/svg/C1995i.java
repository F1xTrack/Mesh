package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.ReactContext;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0504I;
import p000.AbstractC7292zt;
import p000.C10737q70;
import p000.C10865r70;
import p000.C11121t70;
import p000.C11931zU0;
import p000.C1336VE;
import p000.C8940c70;
import p000.E02;
import p000.EnumC10609p70;
import p000.InterfaceC0056At;
import p000.InterfaceC7103wt;
import p000.ML1;
import p000.O90;
import p000.S91;
import p000.ScheduledExecutorServiceC7689Hf1;
import p000.Z60;

/* renamed from: com.horcrux.svg.i */
/* loaded from: classes.dex */
public final class C1995i extends RenderableView {

    /* renamed from: a */
    public C11931zU0 f18608a;

    /* renamed from: b */
    public C11931zU0 f18609b;

    /* renamed from: c */
    public C11931zU0 f18610c;

    /* renamed from: d */
    public C11931zU0 f18611d;

    /* renamed from: e */
    public String f18612e;

    /* renamed from: f */
    public int f18613f;

    /* renamed from: g */
    public int f18614g;

    /* renamed from: h */
    public String f18615h;

    /* renamed from: i */
    public int f18616i;

    /* renamed from: j */
    public final AtomicBoolean f18617j;

    public C1995i(S91 s91) {
        super(s91);
        this.f18617j = new AtomicBoolean(false);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
        boolean z;
        Bitmap bitmap;
        if (this.f18617j.get()) {
            return;
        }
        C8940c70 c8940c70 = C8940c70.f17308t;
        ML1.m5337d(c8940c70, "ImagePipelineFactory was not initialized!");
        Z60 z60M10592e = c8940c70.m10592e();
        Uri uri = new C11121t70(this.mContext, this.f18612e).f42840b;
        C10737q70 c10737q70M24161a = uri == null ? null : C10865r70.m24160c(uri).m24161a();
        if (c10737q70M24161a == null) {
            z60M10592e.getClass();
            z = false;
        } else {
            AbstractC7292zt abstractC7292ztMo1043U = z60M10592e.f14729e.mo1043U(z60M10592e.f14733i.m7640H(c10737q70M24161a, null));
            try {
                boolean zM26565D = AbstractC7292zt.m26565D(abstractC7292ztMo1043U);
                AbstractC7292zt.m26569p(abstractC7292ztMo1043U);
                z = zM26565D;
            } catch (Throwable th) {
                AbstractC7292zt.m26569p(abstractC7292ztMo1043U);
                throw th;
            }
        }
        if (!z) {
            this.f18617j.set(true);
            AbstractC0504I abstractC0504IM9486a = z60M10592e.m9486a(c10737q70M24161a, this.mContext, null, null, null);
            C1994h c1994h = new C1994h(this);
            if (ScheduledExecutorServiceC7689Hf1.f4396b == null) {
                ScheduledExecutorServiceC7689Hf1.f4396b = new ScheduledExecutorServiceC7689Hf1(new Handler(Looper.getMainLooper()));
            }
            abstractC0504IM9486a.m3673l(c1994h, ScheduledExecutorServiceC7689Hf1.f4396b);
            return;
        }
        float f2 = f * this.mOpacity;
        ReactContext reactContext = this.mContext;
        O90.m5968f(c10737q70M24161a, "imageRequest");
        EnumC10609p70 enumC10609p70 = EnumC10609p70.BITMAP_MEMORY_CACHE;
        CancellationException cancellationException = Z60.f14724l;
        AbstractC0504I abstractC0504IM9486a2 = z60M10592e.m9486a(c10737q70M24161a, reactContext, enumC10609p70, null, null);
        try {
            try {
                AbstractC7292zt abstractC7292zt = (AbstractC7292zt) abstractC0504IM9486a2.getResult();
                if (abstractC7292zt != null) {
                    try {
                        try {
                            InterfaceC7103wt interfaceC7103wt = (InterfaceC7103wt) abstractC7292zt.m26572w();
                            if ((interfaceC7103wt instanceof InterfaceC0056At) && (bitmap = ((C1336VE) ((InterfaceC0056At) interfaceC7103wt)).f12446d) != null) {
                                m11369l(canvas, paint, bitmap, f2);
                            }
                        } catch (Exception e) {
                            throw new IllegalStateException(e);
                        }
                    } finally {
                        AbstractC7292zt.m26569p(abstractC7292zt);
                    }
                }
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        } finally {
            abstractC0504IM9486a2.close();
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        ((VirtualView) this).mPath = path;
        path.addRect(m11370m(), Path.Direction.CW);
        return ((VirtualView) this).mPath;
    }

    /* renamed from: l */
    public final void m11369l(Canvas canvas, Paint paint, Bitmap bitmap, float f) {
        if (this.f18613f == 0 || this.f18614g == 0) {
            this.f18613f = bitmap.getWidth();
            this.f18614g = bitmap.getHeight();
        }
        RectF rectFM11370m = m11370m();
        RectF rectF = new RectF(0.0f, 0.0f, this.f18613f, this.f18614g);
        E02.m1975b(rectF, rectFM11370m, this.f18615h, this.f18616i).mapRect(rectF);
        canvas.clipPath(getPath(canvas, paint));
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
    }

    /* renamed from: m */
    public final RectF m11370m() {
        double dRelativeOnWidth = relativeOnWidth(this.f18608a);
        double dRelativeOnHeight = relativeOnHeight(this.f18609b);
        double dRelativeOnWidth2 = relativeOnWidth(this.f18610c);
        double dRelativeOnHeight2 = relativeOnHeight(this.f18611d);
        if (dRelativeOnWidth2 == ConfigValue.DOUBLE_DEFAULT_VALUE) {
            dRelativeOnWidth2 = this.f18613f * this.mScale;
        }
        if (dRelativeOnHeight2 == ConfigValue.DOUBLE_DEFAULT_VALUE) {
            dRelativeOnHeight2 = this.f18614g * this.mScale;
        }
        return new RectF((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) (dRelativeOnWidth + dRelativeOnWidth2), (float) (dRelativeOnHeight + dRelativeOnHeight2));
    }
}

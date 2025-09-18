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
import defpackage.AbstractC8446zt;
import defpackage.C2455c70;
import defpackage.C6589q70;
import defpackage.C6779r70;
import defpackage.C7161t70;
import defpackage.C8372zU0;
import defpackage.E02;
import defpackage.EnumC6398p70;
import defpackage.InterfaceC0077At;
import defpackage.InterfaceC7876wt;
import defpackage.ML1;
import defpackage.O90;
import defpackage.S91;
import defpackage.ScheduledExecutorServiceC0583Hf1;
import defpackage.VE;
import defpackage.Z60;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.horcrux.svg.i */
/* loaded from: classes.dex */
public final class C2594i extends RenderableView {
    public C8372zU0 a;
    public C8372zU0 b;
    public C8372zU0 c;
    public C8372zU0 d;
    public String e;
    public int f;
    public int g;
    public String h;
    public int i;
    public final AtomicBoolean j;

    public C2594i(S91 s91) {
        super(s91);
        this.j = new AtomicBoolean(false);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
        boolean z;
        Bitmap bitmap;
        if (this.j.get()) {
            return;
        }
        C2455c70 c2455c70 = C2455c70.t;
        ML1.d(c2455c70, "ImagePipelineFactory was not initialized!");
        Z60 z60E = c2455c70.e();
        Uri uri = new C7161t70(this.mContext, this.e).b;
        C6589q70 c6589q70A = uri == null ? null : C6779r70.c(uri).a();
        if (c6589q70A == null) {
            z60E.getClass();
            z = false;
        } else {
            AbstractC8446zt abstractC8446ztU = z60E.e.U(z60E.i.H(c6589q70A, null));
            try {
                boolean zD = AbstractC8446zt.D(abstractC8446ztU);
                AbstractC8446zt.p(abstractC8446ztU);
                z = zD;
            } catch (Throwable th) {
                AbstractC8446zt.p(abstractC8446ztU);
                throw th;
            }
        }
        if (!z) {
            this.j.set(true);
            defpackage.I iA = z60E.a(c6589q70A, this.mContext, null, null, null);
            C2593h c2593h = new C2593h(this);
            if (ScheduledExecutorServiceC0583Hf1.b == null) {
                ScheduledExecutorServiceC0583Hf1.b = new ScheduledExecutorServiceC0583Hf1(new Handler(Looper.getMainLooper()));
            }
            iA.l(c2593h, ScheduledExecutorServiceC0583Hf1.b);
            return;
        }
        float f2 = f * this.mOpacity;
        ReactContext reactContext = this.mContext;
        O90.f(c6589q70A, "imageRequest");
        EnumC6398p70 enumC6398p70 = EnumC6398p70.BITMAP_MEMORY_CACHE;
        CancellationException cancellationException = Z60.l;
        defpackage.I iA2 = z60E.a(c6589q70A, reactContext, enumC6398p70, null, null);
        try {
            try {
                AbstractC8446zt abstractC8446zt = (AbstractC8446zt) iA2.getResult();
                if (abstractC8446zt != null) {
                    try {
                        try {
                            InterfaceC7876wt interfaceC7876wt = (InterfaceC7876wt) abstractC8446zt.w();
                            if ((interfaceC7876wt instanceof InterfaceC0077At) && (bitmap = ((VE) ((InterfaceC0077At) interfaceC7876wt)).d) != null) {
                                l(canvas, paint, bitmap, f2);
                            }
                        } catch (Exception e) {
                            throw new IllegalStateException(e);
                        }
                    } finally {
                        AbstractC8446zt.p(abstractC8446zt);
                    }
                }
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        } finally {
            iA2.close();
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        ((VirtualView) this).mPath = path;
        path.addRect(m(), Path.Direction.CW);
        return ((VirtualView) this).mPath;
    }

    public final void l(Canvas canvas, Paint paint, Bitmap bitmap, float f) {
        if (this.f == 0 || this.g == 0) {
            this.f = bitmap.getWidth();
            this.g = bitmap.getHeight();
        }
        RectF rectFM = m();
        RectF rectF = new RectF(0.0f, 0.0f, this.f, this.g);
        E02.b(rectF, rectFM, this.h, this.i).mapRect(rectF);
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

    public final RectF m() {
        double dRelativeOnWidth = relativeOnWidth(this.a);
        double dRelativeOnHeight = relativeOnHeight(this.b);
        double dRelativeOnWidth2 = relativeOnWidth(this.c);
        double dRelativeOnHeight2 = relativeOnHeight(this.d);
        if (dRelativeOnWidth2 == ConfigValue.DOUBLE_DEFAULT_VALUE) {
            dRelativeOnWidth2 = this.f * this.mScale;
        }
        if (dRelativeOnHeight2 == ConfigValue.DOUBLE_DEFAULT_VALUE) {
            dRelativeOnHeight2 = this.g * this.mScale;
        }
        return new RectF((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) (dRelativeOnWidth + dRelativeOnWidth2), (float) (dRelativeOnHeight + dRelativeOnHeight2));
    }
}

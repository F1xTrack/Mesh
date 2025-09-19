package com.horcrux.svg;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import com.yandex.varioqub.config.model.ConfigValue;
import defpackage.AbstractC8235ym;
import defpackage.B91;
import defpackage.C1016Mu0;
import defpackage.C7582vK0;
import defpackage.C8372zU0;
import defpackage.CC0;
import defpackage.D91;
import defpackage.GM1;
import defpackage.K10;
import defpackage.LR0;
import defpackage.S91;
import defpackage.WW;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class X extends Y {
    public Path q;
    public String r;
    public B91 s;
    public final ArrayList t;
    public final ArrayList u;
    public final AssetManager v;

    public X(S91 s91) {
        super(s91);
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = this.mContext.getResources().getAssets();
    }

    @Override // com.horcrux.svg.Y, com.horcrux.svg.VirtualView
    public final void clearCache() {
        this.q = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.Y, com.horcrux.svg.C2592g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
        if (this.r == null) {
            clip(canvas, paint);
            l(canvas, paint, f);
            return;
        }
        C8372zU0 c8372zU0 = this.f;
        if (c8372zU0 != null && c8372zU0.a != ConfigValue.DOUBLE_DEFAULT_VALUE) {
            if (setupFillPaint(paint, this.fillOpacity * f)) {
                x(canvas, paint);
            }
            if (setupStrokePaint(paint, f * this.strokeOpacity)) {
                x(canvas, paint);
                return;
            }
            return;
        }
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        if (size > 0) {
            w(paint, o().r);
            for (int i = 0; i < size; i++) {
                String str = (String) arrayList.get(i);
                Matrix matrix = (Matrix) this.u.get(i);
                canvas.save();
                canvas.concat(matrix);
                canvas.drawText(str, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
        m(canvas, paint, f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:410:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x02b5 A[PHI: r1
  0x02b5: PHI (r1v19 double) = (r1v18 double), (r1v63 double) binds: [B:439:0x0296, B:625:0x02b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x041b  */
    @Override // com.horcrux.svg.Y, com.horcrux.svg.C2592g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Path getPath(android.graphics.Canvas r81, android.graphics.Paint r82) {
        /*
            Method dump skipped, instructions count: 1986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.X.getPath(android.graphics.Canvas, android.graphics.Paint):android.graphics.Path");
    }

    @Override // com.horcrux.svg.C2592g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final int hitTest(float[] fArr) {
        Region region;
        if (this.r == null) {
            return super.hitTest(fArr);
        }
        if (((VirtualView) this).mPath != null && this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int iRound = Math.round(fArr2[0]);
            int iRound2 = Math.round(fArr2[1]);
            initBounds();
            Region region2 = this.mRegion;
            if ((region2 != null && region2.contains(iRound, iRound2)) || ((region = this.mStrokeRegion) != null && region.contains(iRound, iRound2))) {
                if (getClipPath() == null || this.mClipRegion.contains(iRound, iRound2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.Y, com.horcrux.svg.VirtualView, android.view.View
    public final void invalidate() {
        this.q = null;
        super.invalidate();
    }

    @Override // com.horcrux.svg.Y
    public final double t(Paint paint) {
        if (!Double.isNaN(this.p)) {
            return this.p;
        }
        String str = this.r;
        double dT = ConfigValue.DOUBLE_DEFAULT_VALUE;
        if (str == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Y) {
                    dT = ((Y) childAt).t(paint) + dT;
                }
            }
            this.p = dT;
            return dT;
        }
        if (str.length() == 0) {
            this.p = ConfigValue.DOUBLE_DEFAULT_VALUE;
            return ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        WW ww = o().r;
        w(paint, ww);
        v(paint, ww);
        double dMeasureText = paint.measureText(str);
        this.p = dMeasureText;
        return dMeasureText;
    }

    public final void v(Paint paint, WW ww) {
        int i = Build.VERSION.SDK_INT;
        double d = ww.n;
        paint.setLetterSpacing((float) (d / (ww.a * this.mScale)));
        String str = ww.g;
        if (d == ConfigValue.DOUBLE_DEFAULT_VALUE && ww.i == 1) {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + str);
        } else {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + str);
        }
        if (i >= 26) {
            paint.setFontVariationSettings("'wght' " + ww.f + ww.h);
        }
    }

    public final void w(Paint paint, WW ww) {
        int i = 0;
        boolean z = ww.e == D91.Bold || ww.f >= 550;
        boolean z2 = ww.c == 2;
        if (z && z2) {
            i = 3;
        } else if (z) {
            i = 1;
        } else if (z2) {
            i = 2;
        }
        int i2 = ww.f;
        AssetManager assetManager = this.v;
        Typeface typefaceZ0 = null;
        String str = ww.b;
        if (str != null && str.length() > 0) {
            String strK = AbstractC8235ym.k("fonts/", str, ".otf");
            String strK2 = AbstractC8235ym.k("fonts/", str, ".ttf");
            if (Build.VERSION.SDK_INT >= 26) {
                LR0.o();
                Typeface.Builder builderG = LR0.g(assetManager, strK);
                StringBuilder sb = new StringBuilder("'wght' ");
                sb.append(i2);
                String str2 = ww.h;
                sb.append(str2);
                builderG.setFontVariationSettings(sb.toString());
                builderG.setWeight(i2);
                builderG.setItalic(z2);
                typefaceZ0 = builderG.build();
                if (typefaceZ0 == null) {
                    LR0.o();
                    Typeface.Builder builderG2 = LR0.g(assetManager, strK2);
                    builderG2.setFontVariationSettings("'wght' " + i2 + str2);
                    builderG2.setWeight(i2);
                    builderG2.setItalic(z2);
                    typefaceZ0 = builderG2.build();
                }
            } else {
                try {
                    try {
                        typefaceZ0 = Typeface.create(Typeface.createFromAsset(assetManager, strK), i);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    typefaceZ0 = Typeface.create(Typeface.createFromAsset(assetManager, strK2), i);
                }
            }
        }
        if (typefaceZ0 == null) {
            try {
                CC0 cc0 = (CC0) C1016Mu0.i().b;
                cc0.getClass();
                typefaceZ0 = cc0.Z0(str, new C7582vK0(i), assetManager);
            } catch (Exception unused3) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typefaceZ0 = Typeface.create(typefaceZ0, i2, z2);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typefaceZ0);
        paint.setTextSize((float) (ww.a * this.mScale));
        paint.setLetterSpacing(0.0f);
    }

    public final void x(Canvas canvas, Paint paint) {
        K10 k10O = o();
        q();
        WW ww = k10O.r;
        TextPaint textPaint = new TextPaint(paint);
        w(textPaint, ww);
        v(textPaint, ww);
        double d = k10O.q;
        int iX = AbstractC8235ym.x(ww.j);
        Layout.Alignment alignment = iX != 1 ? iX != 2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        SpannableString spannableString = new SpannableString(this.r);
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, (int) GM1.b(this.f, canvas.getWidth(), this.mScale, d)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(true).setBreakStrategy(1).setHyphenationFrequency(1).build();
        int lineAscent = staticLayoutBuild.getLineAscent(0);
        float fC = (float) k10O.c(ConfigValue.DOUBLE_DEFAULT_VALUE);
        float fD = (float) (k10O.d() + lineAscent);
        p();
        canvas.save();
        canvas.translate(fC, fD);
        staticLayoutBuild.draw(canvas);
        canvas.restore();
    }
}

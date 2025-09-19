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
import java.util.ArrayList;
import p000.AbstractC7222ym;
import p000.B91;
import p000.C11403vK0;
import p000.C11931zU0;
import p000.C1417WW;
import p000.C7978Mu0;
import p000.CC0;
import p000.D91;
import p000.GM1;
import p000.K10;
import p000.LR0;
import p000.S91;

/* renamed from: com.horcrux.svg.X */
/* loaded from: classes.dex */
public final class C1982X extends C1983Y {

    /* renamed from: q */
    public Path f18559q;

    /* renamed from: r */
    public String f18560r;

    /* renamed from: s */
    public B91 f18561s;

    /* renamed from: t */
    public final ArrayList f18562t;

    /* renamed from: u */
    public final ArrayList f18563u;

    /* renamed from: v */
    public final AssetManager f18564v;

    public C1982X(S91 s91) {
        super(s91);
        this.f18562t = new ArrayList();
        this.f18563u = new ArrayList();
        this.f18564v = this.mContext.getResources().getAssets();
    }

    @Override // com.horcrux.svg.C1983Y, com.horcrux.svg.VirtualView
    public final void clearCache() {
        this.f18559q = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.C1983Y, com.horcrux.svg.C1993g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
        if (this.f18560r == null) {
            clip(canvas, paint);
            mo11365l(canvas, paint, f);
            return;
        }
        C11931zU0 c11931zU0 = this.f18565f;
        if (c11931zU0 != null && c11931zU0.f46847a != ConfigValue.DOUBLE_DEFAULT_VALUE) {
            if (setupFillPaint(paint, this.fillOpacity * f)) {
                m11361x(canvas, paint);
            }
            if (setupStrokePaint(paint, f * this.strokeOpacity)) {
                m11361x(canvas, paint);
                return;
            }
            return;
        }
        ArrayList arrayList = this.f18562t;
        int size = arrayList.size();
        if (size > 0) {
            m11360w(paint, m11367o().f5868r);
            for (int i = 0; i < size; i++) {
                String str = (String) arrayList.get(i);
                Matrix matrix = (Matrix) this.f18563u.get(i);
                canvas.save();
                canvas.concat(matrix);
                canvas.drawText(str, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
        m11366m(canvas, paint, f);
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
    @Override // com.horcrux.svg.C1983Y, com.horcrux.svg.C1993g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Path getPath(android.graphics.Canvas r81, android.graphics.Paint r82) {
        /*
            Method dump skipped, instructions count: 1986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C1982X.getPath(android.graphics.Canvas, android.graphics.Paint):android.graphics.Path");
    }

    @Override // com.horcrux.svg.C1993g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final int hitTest(float[] fArr) {
        Region region;
        if (this.f18560r == null) {
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

    @Override // com.horcrux.svg.C1983Y, com.horcrux.svg.VirtualView, android.view.View
    public final void invalidate() {
        this.f18559q = null;
        super.invalidate();
    }

    @Override // com.horcrux.svg.C1983Y
    /* renamed from: t */
    public final double mo11358t(Paint paint) {
        if (!Double.isNaN(this.f18575p)) {
            return this.f18575p;
        }
        String str = this.f18560r;
        double dMo11358t = ConfigValue.DOUBLE_DEFAULT_VALUE;
        if (str == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof C1983Y) {
                    dMo11358t = ((C1983Y) childAt).mo11358t(paint) + dMo11358t;
                }
            }
            this.f18575p = dMo11358t;
            return dMo11358t;
        }
        if (str.length() == 0) {
            this.f18575p = ConfigValue.DOUBLE_DEFAULT_VALUE;
            return ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        C1417WW c1417ww = m11367o().f5868r;
        m11360w(paint, c1417ww);
        m11359v(paint, c1417ww);
        double dMeasureText = paint.measureText(str);
        this.f18575p = dMeasureText;
        return dMeasureText;
    }

    /* renamed from: v */
    public final void m11359v(Paint paint, C1417WW c1417ww) {
        int i = Build.VERSION.SDK_INT;
        double d = c1417ww.f13235n;
        paint.setLetterSpacing((float) (d / (c1417ww.f13222a * this.mScale)));
        String str = c1417ww.f13228g;
        if (d == ConfigValue.DOUBLE_DEFAULT_VALUE && c1417ww.f13230i == 1) {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + str);
        } else {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + str);
        }
        if (i >= 26) {
            paint.setFontVariationSettings("'wght' " + c1417ww.f13227f + c1417ww.f13229h);
        }
    }

    /* renamed from: w */
    public final void m11360w(Paint paint, C1417WW c1417ww) {
        int i = 0;
        boolean z = c1417ww.f13226e == D91.Bold || c1417ww.f13227f >= 550;
        boolean z2 = c1417ww.f13224c == 2;
        if (z && z2) {
            i = 3;
        } else if (z) {
            i = 1;
        } else if (z2) {
            i = 2;
        }
        int i2 = c1417ww.f13227f;
        AssetManager assetManager = this.f18564v;
        Typeface typefaceM1053Z0 = null;
        String str = c1417ww.f13223b;
        if (str != null && str.length() > 0) {
            String strM26234k = AbstractC7222ym.m26234k("fonts/", str, ".otf");
            String strM26234k2 = AbstractC7222ym.m26234k("fonts/", str, ".ttf");
            if (Build.VERSION.SDK_INT >= 26) {
                LR0.m4989o();
                Typeface.Builder builderM4981g = LR0.m4981g(assetManager, strM26234k);
                StringBuilder sb = new StringBuilder("'wght' ");
                sb.append(i2);
                String str2 = c1417ww.f13229h;
                sb.append(str2);
                builderM4981g.setFontVariationSettings(sb.toString());
                builderM4981g.setWeight(i2);
                builderM4981g.setItalic(z2);
                typefaceM1053Z0 = builderM4981g.build();
                if (typefaceM1053Z0 == null) {
                    LR0.m4989o();
                    Typeface.Builder builderM4981g2 = LR0.m4981g(assetManager, strM26234k2);
                    builderM4981g2.setFontVariationSettings("'wght' " + i2 + str2);
                    builderM4981g2.setWeight(i2);
                    builderM4981g2.setItalic(z2);
                    typefaceM1053Z0 = builderM4981g2.build();
                }
            } else {
                try {
                    try {
                        typefaceM1053Z0 = Typeface.create(Typeface.createFromAsset(assetManager, strM26234k), i);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    typefaceM1053Z0 = Typeface.create(Typeface.createFromAsset(assetManager, strM26234k2), i);
                }
            }
        }
        if (typefaceM1053Z0 == null) {
            try {
                CC0 cc0 = (CC0) C7978Mu0.m5465i().f7393b;
                cc0.getClass();
                typefaceM1053Z0 = cc0.m1053Z0(str, new C11403vK0(i), assetManager);
            } catch (Exception unused3) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typefaceM1053Z0 = Typeface.create(typefaceM1053Z0, i2, z2);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typefaceM1053Z0);
        paint.setTextSize((float) (c1417ww.f13222a * this.mScale));
        paint.setLetterSpacing(0.0f);
    }

    /* renamed from: x */
    public final void m11361x(Canvas canvas, Paint paint) {
        K10 k10M11367o = m11367o();
        mo532q();
        C1417WW c1417ww = k10M11367o.f5868r;
        TextPaint textPaint = new TextPaint(paint);
        m11360w(textPaint, c1417ww);
        m11359v(textPaint, c1417ww);
        double d = k10M11367o.f5867q;
        int iM26247x = AbstractC7222ym.m26247x(c1417ww.f13231j);
        Layout.Alignment alignment = iM26247x != 1 ? iM26247x != 2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        SpannableString spannableString = new SpannableString(this.f18560r);
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, (int) GM1.m3049b(this.f18565f, canvas.getWidth(), this.mScale, d)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(true).setBreakStrategy(1).setHyphenationFrequency(1).build();
        int lineAscent = staticLayoutBuild.getLineAscent(0);
        float fM4516c = (float) k10M11367o.m4516c(ConfigValue.DOUBLE_DEFAULT_VALUE);
        float fM4517d = (float) (k10M11367o.m4517d() + lineAscent);
        mo531p();
        canvas.save();
        canvas.translate(fM4516c, fM4517d);
        staticLayoutBuild.draw(canvas);
        canvas.restore();
    }
}

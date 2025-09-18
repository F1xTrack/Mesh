package p000;

import android.graphics.Paint;

/* renamed from: ni1 */
/* loaded from: classes.dex */
public final class C10428ni1 extends AbstractC10812qi1 {

    /* renamed from: d */
    public C1356VY f38476d;

    /* renamed from: e */
    public float f38477e;

    /* renamed from: f */
    public C1356VY f38478f;

    /* renamed from: g */
    public float f38479g;

    /* renamed from: h */
    public float f38480h;

    /* renamed from: i */
    public float f38481i;

    /* renamed from: j */
    public float f38482j;

    /* renamed from: k */
    public float f38483k;

    /* renamed from: l */
    public Paint.Cap f38484l;

    /* renamed from: m */
    public Paint.Join f38485m;

    /* renamed from: n */
    public float f38486n;

    @Override // p000.AbstractC10684pi1
    /* renamed from: a */
    public final boolean mo23172a() {
        return this.f38478f.m8471I() || this.f38476d.m8471I();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x001e  */
    @Override // p000.AbstractC10684pi1
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo23173b(int[] r7) {
        /*
            r6 = this;
            VY r0 = r6.f38478f
            boolean r1 = r0.m8471I()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f12613d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f12611b
            if (r1 == r4) goto L1e
            r0.f12611b = r1
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            VY r1 = r6.f38476d
            boolean r4 = r1.m8471I()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f12613d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f12611b
            if (r7 == r4) goto L3a
            r1.f12611b = r7
            r2 = r3
        L3a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10428ni1.mo23173b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f38480h;
    }

    public int getFillColor() {
        return this.f38478f.f12611b;
    }

    public float getStrokeAlpha() {
        return this.f38479g;
    }

    public int getStrokeColor() {
        return this.f38476d.f12611b;
    }

    public float getStrokeWidth() {
        return this.f38477e;
    }

    public float getTrimPathEnd() {
        return this.f38482j;
    }

    public float getTrimPathOffset() {
        return this.f38483k;
    }

    public float getTrimPathStart() {
        return this.f38481i;
    }

    public void setFillAlpha(float f) {
        this.f38480h = f;
    }

    public void setFillColor(int i) {
        this.f38478f.f12611b = i;
    }

    public void setStrokeAlpha(float f) {
        this.f38479g = f;
    }

    public void setStrokeColor(int i) {
        this.f38476d.f12611b = i;
    }

    public void setStrokeWidth(float f) {
        this.f38477e = f;
    }

    public void setTrimPathEnd(float f) {
        this.f38482j = f;
    }

    public void setTrimPathOffset(float f) {
        this.f38483k = f;
    }

    public void setTrimPathStart(float f) {
        this.f38481i = f;
    }
}

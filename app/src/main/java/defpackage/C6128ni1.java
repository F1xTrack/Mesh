package defpackage;

import android.graphics.Paint;

/* renamed from: ni1 */
/* loaded from: classes.dex */
public final class C6128ni1 extends AbstractC6701qi1 {
    public VY d;
    public float e;
    public VY f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    @Override // defpackage.AbstractC6510pi1
    public final boolean a() {
        return this.f.I() || this.d.I();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x001e  */
    @Override // defpackage.AbstractC6510pi1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            VY r0 = r6.f
            boolean r1 = r0.I()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.b
            if (r1 == r4) goto L1e
            r0.b = r1
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            VY r1 = r6.d
            boolean r4 = r1.I()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.b
            if (r7 == r4) goto L3a
            r1.b = r7
            r2 = r3
        L3a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6128ni1.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f.b;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.d.b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f) {
        this.h = f;
    }

    public void setFillColor(int i) {
        this.f.b = i;
    }

    public void setStrokeAlpha(float f) {
        this.g = f;
    }

    public void setStrokeColor(int i) {
        this.d.b = i;
    }

    public void setStrokeWidth(float f) {
        this.e = f;
    }

    public void setTrimPathEnd(float f) {
        this.j = f;
    }

    public void setTrimPathOffset(float f) {
        this.k = f;
    }

    public void setTrimPathStart(float f) {
        this.i = f;
    }
}

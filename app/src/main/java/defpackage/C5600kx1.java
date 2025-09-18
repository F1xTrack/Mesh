package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.KotlinVersion;

/* renamed from: kx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5600kx1 extends Drawable implements Drawable.Callback {
    public long b;
    public int c;
    public int e;
    public boolean h;
    public final C5218ix1 i;
    public Drawable j;
    public Drawable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int a = 0;
    public int d = KotlinVersion.MAX_COMPONENT_VALUE;
    public int f = 0;
    public final boolean g = true;

    public C5600kx1(C5218ix1 c5218ix1) {
        C5218ix1 c5218ix12 = new C5218ix1();
        if (c5218ix1 != null) {
            c5218ix12.a = c5218ix1.a;
            c5218ix12.b = c5218ix1.b;
        }
        this.i = c5218ix12;
    }

    public final boolean a() {
        if (!this.l) {
            boolean z = false;
            if (this.j.getConstantState() != null && this.k.getConstantState() != null) {
                z = true;
            }
            this.m = z;
            this.l = true;
        }
        return this.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            int r0 = r7.a
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L3a
            if (r0 == r1) goto Lb
        L9:
            r4 = r3
            goto L43
        Lb:
            long r0 = r7.b
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L9
            long r0 = android.os.SystemClock.uptimeMillis()
            long r4 = r7.b
            long r0 = r0 - r4
            int r4 = r7.e
            float r4 = (float) r4
            float r0 = (float) r0
            float r0 = r0 / r4
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 < 0) goto L27
            r4 = r3
            goto L28
        L27:
            r4 = r2
        L28:
            if (r4 == 0) goto L2c
            r7.a = r2
        L2c:
            float r0 = java.lang.Math.min(r0, r1)
            int r1 = r7.c
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 0
            float r1 = r1 + r0
            int r0 = (int) r1
            r7.f = r0
            goto L43
        L3a:
            long r4 = android.os.SystemClock.uptimeMillis()
            r7.b = r4
            r7.a = r1
            r4 = r2
        L43:
            int r0 = r7.f
            boolean r1 = r7.g
            android.graphics.drawable.Drawable r5 = r7.j
            android.graphics.drawable.Drawable r6 = r7.k
            if (r4 == 0) goto L62
            if (r1 == 0) goto L52
            if (r0 != 0) goto L57
            goto L53
        L52:
            r2 = r0
        L53:
            r5.draw(r8)
            r0 = r2
        L57:
            int r1 = r7.d
            if (r0 != r1) goto L61
            r6.setAlpha(r1)
            r6.draw(r8)
        L61:
            return
        L62:
            if (r1 == 0) goto L6b
            int r1 = r7.d
            int r1 = r1 - r0
            r5.setAlpha(r1)
            r2 = r3
        L6b:
            r5.draw(r8)
            if (r2 == 0) goto L75
            int r1 = r7.d
            r5.setAlpha(r1)
        L75:
            if (r0 <= 0) goto L82
            r6.setAlpha(r0)
            r6.draw(r8)
            int r8 = r7.d
            r6.setAlpha(r8)
        L82:
            r7.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5600kx1.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C5218ix1 c5218ix1 = this.i;
        return changingConfigurations | c5218ix1.a | c5218ix1.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!a()) {
            return null;
        }
        int changingConfigurations = getChangingConfigurations();
        C5218ix1 c5218ix1 = this.i;
        c5218ix1.a = changingConfigurations;
        return c5218ix1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.j.getIntrinsicHeight(), this.k.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.j.getIntrinsicWidth(), this.k.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.n) {
            this.o = Drawable.resolveOpacity(this.j.getOpacity(), this.k.getOpacity());
            this.n = true;
        }
        return this.o;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.h && super.mutate() == this) {
            if (!a()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.j.mutate();
            this.k.mutate();
            this.h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.j.setBounds(rect);
        this.k.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f == this.d) {
            this.f = i;
        }
        this.d = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        this.k.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}

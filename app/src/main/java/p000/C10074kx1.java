package p000;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.KotlinVersion;

/* renamed from: kx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10074kx1 extends Drawable implements Drawable.Callback {

    /* renamed from: b */
    public long f36775b;

    /* renamed from: c */
    public int f36776c;

    /* renamed from: e */
    public int f36778e;

    /* renamed from: h */
    public boolean f36781h;

    /* renamed from: i */
    public final C9818ix1 f36782i;

    /* renamed from: j */
    public Drawable f36783j;

    /* renamed from: k */
    public Drawable f36784k;

    /* renamed from: l */
    public boolean f36785l;

    /* renamed from: m */
    public boolean f36786m;

    /* renamed from: n */
    public boolean f36787n;

    /* renamed from: o */
    public int f36788o;

    /* renamed from: a */
    public int f36774a = 0;

    /* renamed from: d */
    public int f36777d = KotlinVersion.MAX_COMPONENT_VALUE;

    /* renamed from: f */
    public int f36779f = 0;

    /* renamed from: g */
    public final boolean f36780g = true;

    public C10074kx1(C9818ix1 c9818ix1) {
        C9818ix1 c9818ix12 = new C9818ix1();
        if (c9818ix1 != null) {
            c9818ix12.f34817a = c9818ix1.f34817a;
            c9818ix12.f34818b = c9818ix1.f34818b;
        }
        this.f36782i = c9818ix12;
    }

    /* renamed from: a */
    public final boolean m22320a() {
        if (!this.f36785l) {
            boolean z = false;
            if (this.f36783j.getConstantState() != null && this.f36784k.getConstantState() != null) {
                z = true;
            }
            this.f36786m = z;
            this.f36785l = true;
        }
        return this.f36786m;
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
            int r0 = r7.f36774a
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L3a
            if (r0 == r1) goto Lb
        L9:
            r4 = r3
            goto L43
        Lb:
            long r0 = r7.f36775b
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L9
            long r0 = android.os.SystemClock.uptimeMillis()
            long r4 = r7.f36775b
            long r0 = r0 - r4
            int r4 = r7.f36778e
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
            r7.f36774a = r2
        L2c:
            float r0 = java.lang.Math.min(r0, r1)
            int r1 = r7.f36776c
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 0
            float r1 = r1 + r0
            int r0 = (int) r1
            r7.f36779f = r0
            goto L43
        L3a:
            long r4 = android.os.SystemClock.uptimeMillis()
            r7.f36775b = r4
            r7.f36774a = r1
            r4 = r2
        L43:
            int r0 = r7.f36779f
            boolean r1 = r7.f36780g
            android.graphics.drawable.Drawable r5 = r7.f36783j
            android.graphics.drawable.Drawable r6 = r7.f36784k
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
            int r1 = r7.f36777d
            if (r0 != r1) goto L61
            r6.setAlpha(r1)
            r6.draw(r8)
        L61:
            return
        L62:
            if (r1 == 0) goto L6b
            int r1 = r7.f36777d
            int r1 = r1 - r0
            r5.setAlpha(r1)
            r2 = r3
        L6b:
            r5.draw(r8)
            if (r2 == 0) goto L75
            int r1 = r7.f36777d
            r5.setAlpha(r1)
        L75:
            if (r0 <= 0) goto L82
            r6.setAlpha(r0)
            r6.draw(r8)
            int r8 = r7.f36777d
            r6.setAlpha(r8)
        L82:
            r7.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10074kx1.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C9818ix1 c9818ix1 = this.f36782i;
        return changingConfigurations | c9818ix1.f34817a | c9818ix1.f34818b;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!m22320a()) {
            return null;
        }
        int changingConfigurations = getChangingConfigurations();
        C9818ix1 c9818ix1 = this.f36782i;
        c9818ix1.f34817a = changingConfigurations;
        return c9818ix1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f36783j.getIntrinsicHeight(), this.f36784k.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f36783j.getIntrinsicWidth(), this.f36784k.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.f36787n) {
            this.f36788o = Drawable.resolveOpacity(this.f36783j.getOpacity(), this.f36784k.getOpacity());
            this.f36787n = true;
        }
        return this.f36788o;
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
        if (!this.f36781h && super.mutate() == this) {
            if (!m22320a()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.f36783j.mutate();
            this.f36784k.mutate();
            this.f36781h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f36783j.setBounds(rect);
        this.f36784k.setBounds(rect);
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
        if (this.f36779f == this.f36777d) {
            this.f36779f = i;
        }
        this.f36777d = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f36783j.setColorFilter(colorFilter);
        this.f36784k.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}

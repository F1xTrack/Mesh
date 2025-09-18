package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* renamed from: oS */
/* loaded from: classes.dex */
public final class C6553oS extends Drawable implements Drawable.Callback, InterfaceC10416nc1, InterfaceC10288mc1 {

    /* renamed from: a */
    public Drawable f39000a;

    /* renamed from: c */
    public final Drawable[] f39002c;

    /* renamed from: d */
    public final InterfaceC6231jL[] f39003d;

    /* renamed from: i */
    public final Drawable[] f39008i;

    /* renamed from: j */
    public final int f39009j;

    /* renamed from: k */
    public int f39010k;

    /* renamed from: l */
    public int f39011l;

    /* renamed from: m */
    public long f39012m;

    /* renamed from: n */
    public final int[] f39013n;

    /* renamed from: o */
    public final int[] f39014o;

    /* renamed from: p */
    public int f39015p;

    /* renamed from: q */
    public final boolean[] f39016q;

    /* renamed from: r */
    public int f39017r;

    /* renamed from: s */
    public boolean f39018s;

    /* renamed from: t */
    public final boolean f39019t;

    /* renamed from: b */
    public final C10213m20 f39001b = new C10213m20();

    /* renamed from: e */
    public final Rect f39004e = new Rect();

    /* renamed from: f */
    public boolean f39005f = false;

    /* renamed from: g */
    public boolean f39006g = false;

    /* renamed from: h */
    public boolean f39007h = false;

    public C6553oS(Drawable[] drawableArr) {
        Drawable[] drawableArr2;
        this.f39002c = drawableArr;
        int i = 0;
        while (true) {
            drawableArr2 = this.f39002c;
            if (i >= drawableArr2.length) {
                break;
            }
            AbstractC8924c02.m10558f(drawableArr2[i], this, this);
            i++;
        }
        this.f39003d = new InterfaceC6231jL[drawableArr2.length];
        this.f39019t = true;
        if (!(drawableArr.length >= 1)) {
            throw new IllegalStateException("At least one layer required!");
        }
        this.f39008i = drawableArr;
        int[] iArr = new int[drawableArr.length];
        this.f39013n = iArr;
        int[] iArr2 = new int[drawableArr.length];
        this.f39014o = iArr2;
        this.f39015p = KotlinVersion.MAX_COMPONENT_VALUE;
        boolean[] zArr = new boolean[drawableArr.length];
        this.f39016q = zArr;
        this.f39017r = 0;
        this.f39009j = 2;
        this.f39010k = 2;
        Arrays.fill(iArr, 0);
        iArr[0] = 255;
        Arrays.fill(iArr2, 0);
        iArr2[0] = 255;
        Arrays.fill(zArr, false);
        zArr[0] = true;
    }

    /* renamed from: a */
    public final void m23405a() {
        this.f39017r--;
        invalidateSelf();
    }

    /* renamed from: b */
    public final void m23406b() {
        this.f39010k = 2;
        for (int i = 0; i < this.f39008i.length; i++) {
            this.f39014o[i] = this.f39016q[i] ? KotlinVersion.MAX_COMPONENT_VALUE : 0;
        }
        invalidateSelf();
    }

    /* renamed from: c */
    public final Drawable m23407c(int i) {
        ML1.m5334a(Boolean.valueOf(i >= 0));
        Drawable[] drawableArr = this.f39002c;
        ML1.m5334a(Boolean.valueOf(i < drawableArr.length));
        return drawableArr[i];
    }

    /* renamed from: d */
    public final Drawable m23408d(Drawable drawable, int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException();
        }
        Drawable[] drawableArr = this.f39002c;
        if (!(i < drawableArr.length)) {
            throw new IllegalArgumentException();
        }
        Drawable drawable2 = drawableArr[i];
        if (drawable != drawable2) {
            if (drawable != null && this.f39007h) {
                drawable.mutate();
            }
            AbstractC8924c02.m10558f(drawableArr[i], null, null);
            AbstractC8924c02.m10558f(drawable, null, null);
            AbstractC8924c02.m10559g(drawable, this.f39001b);
            AbstractC8924c02.m10553a(drawable, this);
            AbstractC8924c02.m10558f(drawable, this, this);
            this.f39006g = false;
            drawableArr[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean zM23409f;
        int i;
        int i2 = this.f39010k;
        int[] iArr = this.f39014o;
        Drawable[] drawableArr = this.f39008i;
        if (i2 == 0) {
            System.arraycopy(iArr, 0, this.f39013n, 0, drawableArr.length);
            this.f39012m = SystemClock.uptimeMillis();
            zM23409f = m23409f(this.f39011l == 0 ? 1.0f : 0.0f);
            if (!this.f39018s && (i = this.f39009j) >= 0) {
                boolean[] zArr = this.f39016q;
                if (i < zArr.length && zArr[i]) {
                    this.f39018s = true;
                }
            }
            this.f39010k = zM23409f ? 2 : 1;
        } else if (i2 != 1) {
            zM23409f = true;
        } else {
            ML1.m5338e(this.f39011l > 0);
            zM23409f = m23409f((SystemClock.uptimeMillis() - this.f39012m) / this.f39011l);
            this.f39010k = zM23409f ? 2 : 1;
        }
        for (int i3 = 0; i3 < drawableArr.length; i3++) {
            Drawable drawable = drawableArr[i3];
            int iCeil = (int) Math.ceil((iArr[i3] * this.f39015p) / 255.0d);
            if (drawable != null && iCeil > 0) {
                this.f39017r++;
                if (this.f39019t) {
                    drawable.mutate();
                }
                drawable.setAlpha(iCeil);
                this.f39017r--;
                drawable.draw(canvas);
            }
        }
        if (!zM23409f) {
            invalidateSelf();
        } else if (this.f39018s) {
            this.f39018s = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, nc1] */
    @Override // p000.InterfaceC10416nc1
    /* renamed from: e */
    public final void mo8644e(Matrix matrix) {
        ?? r0 = this.f39000a;
        if (r0 != 0) {
            r0.mo8644e(matrix);
        } else {
            matrix.reset();
        }
    }

    /* renamed from: f */
    public final boolean m23409f(float f) {
        boolean z = true;
        for (int i = 0; i < this.f39008i.length; i++) {
            boolean z2 = this.f39016q[i];
            int i2 = (int) (((z2 ? 1 : -1) * KotlinVersion.MAX_COMPONENT_VALUE * f) + this.f39013n[i]);
            int[] iArr = this.f39014o;
            iArr[i] = i2;
            if (i2 < 0) {
                iArr[i] = 0;
            }
            if (iArr[i] > 255) {
                iArr[i] = 255;
            }
            if (z2 && iArr[i] < 255) {
                z = false;
            }
            if (!z2 && iArr[i] > 0) {
                z = false;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f39015p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f39002c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f39002c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable[] drawableArr = this.f39002c;
        if (drawableArr.length == 0) {
            return -2;
        }
        int iResolveOpacity = -1;
        for (int i = 1; i < drawableArr.length; i++) {
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
            }
        }
        return iResolveOpacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        while (true) {
            Drawable[] drawableArr = this.f39002c;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                Rect rect2 = this.f39004e;
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f39017r == 0) {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (!this.f39006g) {
            this.f39005f = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.f39002c;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.f39005f;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f39005f = z2 | z;
                i++;
            }
            this.f39006g = true;
        }
        return this.f39005f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, nc1] */
    @Override // p000.InterfaceC10416nc1
    /* renamed from: m */
    public final void mo23154m(RectF rectF) {
        ?? r0 = this.f39000a;
        if (r0 != 0) {
            r0.mo23154m(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f39002c;
            if (i >= drawableArr.length) {
                this.f39007h = true;
                return this;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.mutate();
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f39002c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f39002c;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f39002c;
            if (i >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC10288mc1
    /* renamed from: r */
    public final void mo5005r(InterfaceC10416nc1 interfaceC10416nc1) {
        this.f39000a = (Drawable) interfaceC10416nc1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f39015p != i) {
            this.f39015p = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C10213m20 c10213m20 = this.f39001b;
        c10213m20.f37424e = colorFilter;
        int i = 0;
        c10213m20.f37421b = colorFilter != null;
        while (true) {
            Drawable[] drawableArr = this.f39002c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f39001b.f37422c = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f39002c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setDither(z);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f39001b.f37423d = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f39002c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setFilterBitmap(z);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f39002c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setHotspot(f, f2);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f39002c;
            if (i >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}

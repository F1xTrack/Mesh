package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* renamed from: oS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6269oS extends Drawable implements Drawable.Callback, InterfaceC6110nc1, InterfaceC5919mc1 {
    public Drawable a;
    public final Drawable[] c;
    public final InterfaceC5293jL[] d;
    public final Drawable[] i;
    public final int j;
    public int k;
    public int l;
    public long m;
    public final int[] n;
    public final int[] o;
    public int p;
    public final boolean[] q;
    public int r;
    public boolean s;
    public final boolean t;
    public final C5808m20 b = new C5808m20();
    public final Rect e = new Rect();
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;

    public C6269oS(Drawable[] drawableArr) {
        Drawable[] drawableArr2;
        this.c = drawableArr;
        int i = 0;
        while (true) {
            drawableArr2 = this.c;
            if (i >= drawableArr2.length) {
                break;
            }
            AbstractC2432c02.f(drawableArr2[i], this, this);
            i++;
        }
        this.d = new InterfaceC5293jL[drawableArr2.length];
        this.t = true;
        if (!(drawableArr.length >= 1)) {
            throw new IllegalStateException("At least one layer required!");
        }
        this.i = drawableArr;
        int[] iArr = new int[drawableArr.length];
        this.n = iArr;
        int[] iArr2 = new int[drawableArr.length];
        this.o = iArr2;
        this.p = KotlinVersion.MAX_COMPONENT_VALUE;
        boolean[] zArr = new boolean[drawableArr.length];
        this.q = zArr;
        this.r = 0;
        this.j = 2;
        this.k = 2;
        Arrays.fill(iArr, 0);
        iArr[0] = 255;
        Arrays.fill(iArr2, 0);
        iArr2[0] = 255;
        Arrays.fill(zArr, false);
        zArr[0] = true;
    }

    public final void a() {
        this.r--;
        invalidateSelf();
    }

    public final void b() {
        this.k = 2;
        for (int i = 0; i < this.i.length; i++) {
            this.o[i] = this.q[i] ? KotlinVersion.MAX_COMPONENT_VALUE : 0;
        }
        invalidateSelf();
    }

    public final Drawable c(int i) {
        ML1.a(Boolean.valueOf(i >= 0));
        Drawable[] drawableArr = this.c;
        ML1.a(Boolean.valueOf(i < drawableArr.length));
        return drawableArr[i];
    }

    public final Drawable d(Drawable drawable, int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException();
        }
        Drawable[] drawableArr = this.c;
        if (!(i < drawableArr.length)) {
            throw new IllegalArgumentException();
        }
        Drawable drawable2 = drawableArr[i];
        if (drawable != drawable2) {
            if (drawable != null && this.h) {
                drawable.mutate();
            }
            AbstractC2432c02.f(drawableArr[i], null, null);
            AbstractC2432c02.f(drawable, null, null);
            AbstractC2432c02.g(drawable, this.b);
            AbstractC2432c02.a(drawable, this);
            AbstractC2432c02.f(drawable, this, this);
            this.g = false;
            drawableArr[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean zF;
        int i;
        int i2 = this.k;
        int[] iArr = this.o;
        Drawable[] drawableArr = this.i;
        if (i2 == 0) {
            System.arraycopy(iArr, 0, this.n, 0, drawableArr.length);
            this.m = SystemClock.uptimeMillis();
            zF = f(this.l == 0 ? 1.0f : 0.0f);
            if (!this.s && (i = this.j) >= 0) {
                boolean[] zArr = this.q;
                if (i < zArr.length && zArr[i]) {
                    this.s = true;
                }
            }
            this.k = zF ? 2 : 1;
        } else if (i2 != 1) {
            zF = true;
        } else {
            ML1.e(this.l > 0);
            zF = f((SystemClock.uptimeMillis() - this.m) / this.l);
            this.k = zF ? 2 : 1;
        }
        for (int i3 = 0; i3 < drawableArr.length; i3++) {
            Drawable drawable = drawableArr[i3];
            int iCeil = (int) Math.ceil((iArr[i3] * this.p) / 255.0d);
            if (drawable != null && iCeil > 0) {
                this.r++;
                if (this.t) {
                    drawable.mutate();
                }
                drawable.setAlpha(iCeil);
                this.r--;
                drawable.draw(canvas);
            }
        }
        if (!zF) {
            invalidateSelf();
        } else if (this.s) {
            this.s = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, nc1] */
    @Override // defpackage.InterfaceC6110nc1
    public final void e(Matrix matrix) {
        ?? r0 = this.a;
        if (r0 != 0) {
            r0.e(matrix);
        } else {
            matrix.reset();
        }
    }

    public final boolean f(float f) {
        boolean z = true;
        for (int i = 0; i < this.i.length; i++) {
            boolean z2 = this.q[i];
            int i2 = (int) (((z2 ? 1 : -1) * KotlinVersion.MAX_COMPONENT_VALUE * f) + this.n[i]);
            int[] iArr = this.o;
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
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.c;
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
            Drawable[] drawableArr = this.c;
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
        Drawable[] drawableArr = this.c;
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
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                Rect rect2 = this.e;
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
        if (this.r == 0) {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (!this.g) {
            this.f = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.c;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.f;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f = z2 | z;
                i++;
            }
            this.g = true;
        }
        return this.f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, nc1] */
    @Override // defpackage.InterfaceC6110nc1
    public final void m(RectF rectF) {
        ?? r0 = this.a;
        if (r0 != 0) {
            r0.m(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                this.h = true;
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
            Drawable[] drawableArr = this.c;
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
            Drawable[] drawableArr = this.c;
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
            Drawable[] drawableArr = this.c;
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
    @Override // defpackage.InterfaceC5919mc1
    public final void r(InterfaceC6110nc1 interfaceC6110nc1) {
        this.a = (Drawable) interfaceC6110nc1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.p != i) {
            this.p = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C5808m20 c5808m20 = this.b;
        c5808m20.e = colorFilter;
        int i = 0;
        c5808m20.b = colorFilter != null;
        while (true) {
            Drawable[] drawableArr = this.c;
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
        this.b.c = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
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
        this.b.d = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
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
            Drawable[] drawableArr = this.c;
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
            Drawable[] drawableArr = this.c;
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

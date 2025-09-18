package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* renamed from: Wm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1773Wm1 extends Drawable implements InterfaceC2201an1, Animatable {
    public final C2448c5 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public int f;
    public final int g;
    public boolean h;
    public Paint i;
    public Rect j;

    public C1773Wm1(C2448c5 c2448c5) {
        this.g = -1;
        IL1.d(c2448c5, "Argument must not be null");
        this.a = c2448c5;
        C1617Um1 c1617Um1 = ((C2582cn1) c2448c5.b).a;
        int loopCount = c1617Um1.b.getLoopCount() == 0 ? 0 : c1617Um1.b.getLoopCount();
        this.g = loopCount != 0 ? loopCount : -1;
    }

    public final void a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        C2007Zm1 c2007Zm1 = ((C2582cn1) this.a.b).i;
        if ((c2007Zm1 != null ? c2007Zm1.e : -1) == r0.a.b.getFrameCount() - 1) {
            this.f++;
        }
        int i = this.g;
        if (i == -1 || this.f < i) {
            return;
        }
        stop();
    }

    public final void b() {
        IL1.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.d);
        C2448c5 c2448c5 = this.a;
        if (((C2582cn1) c2448c5.b).a.b.getFrameCount() == 1) {
            invalidateSelf();
            return;
        }
        if (this.b) {
            return;
        }
        this.b = true;
        C2582cn1 c2582cn1 = (C2582cn1) c2448c5.b;
        if (c2582cn1.j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = c2582cn1.c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c2582cn1.f) {
            c2582cn1.f = true;
            c2582cn1.j = false;
            c2582cn1.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.d) {
            return;
        }
        if (this.h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.j == null) {
                this.j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.j);
            this.h = false;
        }
        C2582cn1 c2582cn1 = (C2582cn1) this.a.b;
        C2007Zm1 c2007Zm1 = c2582cn1.i;
        Bitmap bitmap = c2007Zm1 != null ? c2007Zm1.g : c2582cn1.l;
        if (this.j == null) {
            this.j = new Rect();
        }
        Rect rect = this.j;
        if (this.i == null) {
            this.i = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.i);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C2582cn1) this.a.b).p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((C2582cn1) this.a.b).o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        this.i.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        this.i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        IL1.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.d);
        this.e = z;
        if (!z) {
            this.b = false;
            C2582cn1 c2582cn1 = (C2582cn1) this.a.b;
            ArrayList arrayList = c2582cn1.c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c2582cn1.f = false;
            }
        } else if (this.c) {
            b();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.c = true;
        this.f = 0;
        if (this.e) {
            b();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.c = false;
        this.b = false;
        C2582cn1 c2582cn1 = (C2582cn1) this.a.b;
        ArrayList arrayList = c2582cn1.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c2582cn1.f = false;
        }
    }
}

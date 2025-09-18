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

/* renamed from: e10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3500e10 extends Drawable implements InterfaceC5231j10, Animatable {
    public final C2448c5 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int f;
    public boolean h;
    public Paint i;
    public Rect j;
    public boolean e = true;
    public final int g = -1;

    public C3500e10(C2448c5 c2448c5) {
        IL1.d(c2448c5, "Argument must not be null");
        this.a = c2448c5;
    }

    public final void a() {
        IL1.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.d);
        C5613l10 c5613l10 = (C5613l10) this.a.b;
        if (c5613l10.a.l.c == 1) {
            invalidateSelf();
            return;
        }
        if (this.b) {
            return;
        }
        this.b = true;
        if (c5613l10.j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = c5613l10.c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c5613l10.f) {
            c5613l10.f = true;
            c5613l10.j = false;
            c5613l10.a();
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
        C5613l10 c5613l10 = (C5613l10) this.a.b;
        C4264i10 c4264i10 = c5613l10.i;
        Bitmap bitmap = c4264i10 != null ? c4264i10.g : c5613l10.l;
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
        return ((C5613l10) this.a.b).p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((C5613l10) this.a.b).o;
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
            C5613l10 c5613l10 = (C5613l10) this.a.b;
            ArrayList arrayList = c5613l10.c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c5613l10.f = false;
            }
        } else if (this.c) {
            a();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.c = true;
        this.f = 0;
        if (this.e) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.c = false;
        this.b = false;
        C5613l10 c5613l10 = (C5613l10) this.a.b;
        ArrayList arrayList = c5613l10.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c5613l10.f = false;
        }
    }
}

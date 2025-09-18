package p000;

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
public final class C9186e10 extends Drawable implements InterfaceC9826j10, Animatable {

    /* renamed from: a */
    public final C1825c5 f26481a;

    /* renamed from: b */
    public boolean f26482b;

    /* renamed from: c */
    public boolean f26483c;

    /* renamed from: d */
    public boolean f26484d;

    /* renamed from: f */
    public int f26486f;

    /* renamed from: h */
    public boolean f26488h;

    /* renamed from: i */
    public Paint f26489i;

    /* renamed from: j */
    public Rect f26490j;

    /* renamed from: e */
    public boolean f26485e = true;

    /* renamed from: g */
    public final int f26487g = -1;

    public C9186e10(C1825c5 c1825c5) {
        IL1.m3830d(c1825c5, "Argument must not be null");
        this.f26481a = c1825c5;
    }

    /* renamed from: a */
    public final void m17816a() {
        IL1.m3827a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f26484d);
        C10082l10 c10082l10 = (C10082l10) this.f26481a.f17293b;
        if (c10082l10.f36805a.f38081l.f37398c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f26482b) {
            return;
        }
        this.f26482b = true;
        if (c10082l10.f36814j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = c10082l10.f36807c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c10082l10.f36810f) {
            c10082l10.f36810f = true;
            c10082l10.f36814j = false;
            c10082l10.m22332a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f26484d) {
            return;
        }
        if (this.f26488h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f26490j == null) {
                this.f26490j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f26490j);
            this.f26488h = false;
        }
        C10082l10 c10082l10 = (C10082l10) this.f26481a.f17293b;
        C9698i10 c9698i10 = c10082l10.f36813i;
        Bitmap bitmap = c9698i10 != null ? c9698i10.f28758g : c10082l10.f36816l;
        if (this.f26490j == null) {
            this.f26490j = new Rect();
        }
        Rect rect = this.f26490j;
        if (this.f26489i == null) {
            this.f26489i = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f26489i);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f26481a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C10082l10) this.f26481a.f17293b).f36820p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((C10082l10) this.f26481a.f17293b).f36819o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f26482b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f26488h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f26489i == null) {
            this.f26489i = new Paint(2);
        }
        this.f26489i.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f26489i == null) {
            this.f26489i = new Paint(2);
        }
        this.f26489i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        IL1.m3827a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f26484d);
        this.f26485e = z;
        if (!z) {
            this.f26482b = false;
            C10082l10 c10082l10 = (C10082l10) this.f26481a.f17293b;
            ArrayList arrayList = c10082l10.f36807c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c10082l10.f36810f = false;
            }
        } else if (this.f26483c) {
            m17816a();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f26483c = true;
        this.f26486f = 0;
        if (this.f26485e) {
            m17816a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f26483c = false;
        this.f26482b = false;
        C10082l10 c10082l10 = (C10082l10) this.f26481a.f17293b;
        ArrayList arrayList = c10082l10.f36807c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c10082l10.f36810f = false;
        }
    }
}

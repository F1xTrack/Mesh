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

/* renamed from: Wm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8483Wm1 extends Drawable implements InterfaceC8769an1, Animatable {

    /* renamed from: a */
    public final C1825c5 f13400a;

    /* renamed from: b */
    public boolean f13401b;

    /* renamed from: c */
    public boolean f13402c;

    /* renamed from: d */
    public boolean f13403d;

    /* renamed from: e */
    public boolean f13404e = true;

    /* renamed from: f */
    public int f13405f;

    /* renamed from: g */
    public final int f13406g;

    /* renamed from: h */
    public boolean f13407h;

    /* renamed from: i */
    public Paint f13408i;

    /* renamed from: j */
    public Rect f13409j;

    public C8483Wm1(C1825c5 c1825c5) {
        this.f13406g = -1;
        IL1.m3830d(c1825c5, "Argument must not be null");
        this.f13400a = c1825c5;
        C8379Um1 c8379Um1 = ((C9025cn1) c1825c5.f17293b).f17749a;
        int loopCount = c8379Um1.f12031b.getLoopCount() == 0 ? 0 : c8379Um1.f12031b.getLoopCount();
        this.f13406g = loopCount != 0 ? loopCount : -1;
    }

    /* renamed from: a */
    public final void m8857a() {
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
        C8639Zm1 c8639Zm1 = ((C9025cn1) this.f13400a.f17293b).f17757i;
        if ((c8639Zm1 != null ? c8639Zm1.f15124e : -1) == r0.f17749a.f12031b.getFrameCount() - 1) {
            this.f13405f++;
        }
        int i = this.f13406g;
        if (i == -1 || this.f13405f < i) {
            return;
        }
        stop();
    }

    /* renamed from: b */
    public final void m8858b() {
        IL1.m3827a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f13403d);
        C1825c5 c1825c5 = this.f13400a;
        if (((C9025cn1) c1825c5.f17293b).f17749a.f12031b.getFrameCount() == 1) {
            invalidateSelf();
            return;
        }
        if (this.f13401b) {
            return;
        }
        this.f13401b = true;
        C9025cn1 c9025cn1 = (C9025cn1) c1825c5.f17293b;
        if (c9025cn1.f17758j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = c9025cn1.f17751c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c9025cn1.f17754f) {
            c9025cn1.f17754f = true;
            c9025cn1.f17758j = false;
            c9025cn1.m10869a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f13403d) {
            return;
        }
        if (this.f13407h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f13409j == null) {
                this.f13409j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f13409j);
            this.f13407h = false;
        }
        C9025cn1 c9025cn1 = (C9025cn1) this.f13400a.f17293b;
        C8639Zm1 c8639Zm1 = c9025cn1.f17757i;
        Bitmap bitmap = c8639Zm1 != null ? c8639Zm1.f15126g : c9025cn1.f17760l;
        if (this.f13409j == null) {
            this.f13409j = new Rect();
        }
        Rect rect = this.f13409j;
        if (this.f13408i == null) {
            this.f13408i = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f13408i);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f13400a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C9025cn1) this.f13400a.f17293b).f17764p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((C9025cn1) this.f13400a.f17293b).f17763o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f13401b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13407h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f13408i == null) {
            this.f13408i = new Paint(2);
        }
        this.f13408i.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f13408i == null) {
            this.f13408i = new Paint(2);
        }
        this.f13408i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        IL1.m3827a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f13403d);
        this.f13404e = z;
        if (!z) {
            this.f13401b = false;
            C9025cn1 c9025cn1 = (C9025cn1) this.f13400a.f17293b;
            ArrayList arrayList = c9025cn1.f17751c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c9025cn1.f17754f = false;
            }
        } else if (this.f13402c) {
            m8858b();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f13402c = true;
        this.f13405f = 0;
        if (this.f13404e) {
            m8858b();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f13402c = false;
        this.f13401b = false;
        C9025cn1 c9025cn1 = (C9025cn1) this.f13400a.f17293b;
        ArrayList arrayList = c9025cn1.f17751c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c9025cn1.f17754f = false;
        }
    }
}

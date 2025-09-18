package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.KotlinVersion;

/* renamed from: mo0 */
/* loaded from: classes.dex */
public class C5954mo0 extends Drawable.ConstantState {
    public LZ0 a;
    public C6445pN b;
    public ColorStateList c;
    public ColorStateList d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public Rect g;
    public final float h;
    public float i;
    public float j;
    public int k;
    public float l;
    public float m;
    public int n;
    public int o;
    public final Paint.Style p;

    public C5954mo0(LZ0 lz0) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.k = KotlinVersion.MAX_COMPONENT_VALUE;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = Paint.Style.FILL_AND_STROKE;
        this.a = lz0;
        this.b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C6145no0 c6145no0 = new C6145no0(this);
        c6145no0.e = true;
        return c6145no0;
    }

    public C5954mo0(C5954mo0 c5954mo0) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.k = KotlinVersion.MAX_COMPONENT_VALUE;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = Paint.Style.FILL_AND_STROKE;
        this.a = c5954mo0.a;
        this.b = c5954mo0.b;
        this.j = c5954mo0.j;
        this.c = c5954mo0.c;
        this.d = c5954mo0.d;
        this.f = c5954mo0.f;
        this.e = c5954mo0.e;
        this.k = c5954mo0.k;
        this.h = c5954mo0.h;
        this.o = c5954mo0.o;
        this.i = c5954mo0.i;
        this.l = c5954mo0.l;
        this.m = c5954mo0.m;
        this.n = c5954mo0.n;
        this.p = c5954mo0.p;
        if (c5954mo0.g != null) {
            this.g = new Rect(c5954mo0.g);
        }
    }
}

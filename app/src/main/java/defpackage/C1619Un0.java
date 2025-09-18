package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: Un0 */
/* loaded from: classes.dex */
public final class C1619Un0 {
    public final MaterialButton a;
    public LZ0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public C6145no0 m;
    public boolean q;
    public RippleDrawable s;
    public int t;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    public C1619Un0(MaterialButton materialButton, LZ0 lz0) {
        this.a = materialButton;
        this.b = lz0;
    }

    public final InterfaceC5228j01 a() {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.s.getNumberOfLayers() > 2 ? (InterfaceC5228j01) this.s.getDrawable(2) : (InterfaceC5228j01) this.s.getDrawable(1);
    }

    public final C6145no0 b(boolean z) {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C6145no0) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void c(LZ0 lz0) {
        this.b = lz0;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(lz0);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(lz0);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(lz0);
        }
    }

    public final void d(int i, int i2) {
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        C6145no0 c6145no0 = new C6145no0(this.b);
        MaterialButton materialButton = this.a;
        c6145no0.h(materialButton.getContext());
        AbstractC4135hL.h(c6145no0, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            AbstractC4135hL.i(c6145no0, mode);
        }
        float f = this.h;
        ColorStateList colorStateList = this.k;
        c6145no0.a.j = f;
        c6145no0.invalidateSelf();
        C5954mo0 c5954mo0 = c6145no0.a;
        if (c5954mo0.d != colorStateList) {
            c5954mo0.d = colorStateList;
            c6145no0.onStateChange(c6145no0.getState());
        }
        C6145no0 c6145no02 = new C6145no0(this.b);
        c6145no02.setTint(0);
        float f2 = this.h;
        int iE = this.n ? AbstractC5543ke1.e(R.attr.colorSurface, materialButton) : 0;
        c6145no02.a.j = f2;
        c6145no02.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iE);
        C5954mo0 c5954mo02 = c6145no02.a;
        if (c5954mo02.d != colorStateListValueOf) {
            c5954mo02.d = colorStateListValueOf;
            c6145no02.onStateChange(c6145no02.getState());
        }
        C6145no0 c6145no03 = new C6145no0(this.b);
        this.m = c6145no03;
        AbstractC4135hL.g(c6145no03, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC8126yB1.b(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c6145no02, c6145no0}), this.c, this.e, this.d, this.f), this.m);
        this.s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C6145no0 c6145no0B = b(false);
        if (c6145no0B != null) {
            c6145no0B.i(this.t);
            c6145no0B.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        C6145no0 c6145no0B = b(false);
        C6145no0 c6145no0B2 = b(true);
        if (c6145no0B != null) {
            float f = this.h;
            ColorStateList colorStateList = this.k;
            c6145no0B.a.j = f;
            c6145no0B.invalidateSelf();
            C5954mo0 c5954mo0 = c6145no0B.a;
            if (c5954mo0.d != colorStateList) {
                c5954mo0.d = colorStateList;
                c6145no0B.onStateChange(c6145no0B.getState());
            }
            if (c6145no0B2 != null) {
                float f2 = this.h;
                int iE = this.n ? AbstractC5543ke1.e(R.attr.colorSurface, this.a) : 0;
                c6145no0B2.a.j = f2;
                c6145no0B2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iE);
                C5954mo0 c5954mo02 = c6145no0B2.a;
                if (c5954mo02.d != colorStateListValueOf) {
                    c5954mo02.d = colorStateListValueOf;
                    c6145no0B2.onStateChange(c6145no0B2.getState());
                }
            }
        }
    }
}

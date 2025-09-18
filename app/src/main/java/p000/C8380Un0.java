package p000;

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
public final class C8380Un0 {

    /* renamed from: a */
    public final MaterialButton f12047a;

    /* renamed from: b */
    public LZ0 f12048b;

    /* renamed from: c */
    public int f12049c;

    /* renamed from: d */
    public int f12050d;

    /* renamed from: e */
    public int f12051e;

    /* renamed from: f */
    public int f12052f;

    /* renamed from: g */
    public int f12053g;

    /* renamed from: h */
    public int f12054h;

    /* renamed from: i */
    public PorterDuff.Mode f12055i;

    /* renamed from: j */
    public ColorStateList f12056j;

    /* renamed from: k */
    public ColorStateList f12057k;

    /* renamed from: l */
    public ColorStateList f12058l;

    /* renamed from: m */
    public C10439no0 f12059m;

    /* renamed from: q */
    public boolean f12063q;

    /* renamed from: s */
    public RippleDrawable f12065s;

    /* renamed from: t */
    public int f12066t;

    /* renamed from: n */
    public boolean f12060n = false;

    /* renamed from: o */
    public boolean f12061o = false;

    /* renamed from: p */
    public boolean f12062p = false;

    /* renamed from: r */
    public boolean f12064r = true;

    public C8380Un0(MaterialButton materialButton, LZ0 lz0) {
        this.f12047a = materialButton;
        this.f12048b = lz0;
    }

    /* renamed from: a */
    public final InterfaceC9824j01 m8146a() {
        RippleDrawable rippleDrawable = this.f12065s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f12065s.getNumberOfLayers() > 2 ? (InterfaceC9824j01) this.f12065s.getDrawable(2) : (InterfaceC9824j01) this.f12065s.getDrawable(1);
    }

    /* renamed from: b */
    public final C10439no0 m8147b(boolean z) {
        RippleDrawable rippleDrawable = this.f12065s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C10439no0) ((LayerDrawable) ((InsetDrawable) this.f12065s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    /* renamed from: c */
    public final void m8148c(LZ0 lz0) {
        this.f12048b = lz0;
        if (m8147b(false) != null) {
            m8147b(false).setShapeAppearanceModel(lz0);
        }
        if (m8147b(true) != null) {
            m8147b(true).setShapeAppearanceModel(lz0);
        }
        if (m8146a() != null) {
            m8146a().setShapeAppearanceModel(lz0);
        }
    }

    /* renamed from: d */
    public final void m8149d(int i, int i2) {
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        MaterialButton materialButton = this.f12047a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f12051e;
        int i4 = this.f12052f;
        this.f12052f = i2;
        this.f12051e = i;
        if (!this.f12061o) {
            m8150e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    /* renamed from: e */
    public final void m8150e() {
        C10439no0 c10439no0 = new C10439no0(this.f12048b);
        MaterialButton materialButton = this.f12047a;
        c10439no0.m23236h(materialButton.getContext());
        AbstractC4173hL.m18806h(c10439no0, this.f12056j);
        PorterDuff.Mode mode = this.f12055i;
        if (mode != null) {
            AbstractC4173hL.m18807i(c10439no0, mode);
        }
        float f = this.f12054h;
        ColorStateList colorStateList = this.f12057k;
        c10439no0.f38516a.f37940j = f;
        c10439no0.invalidateSelf();
        C10311mo0 c10311mo0 = c10439no0.f38516a;
        if (c10311mo0.f37934d != colorStateList) {
            c10311mo0.f37934d = colorStateList;
            c10439no0.onStateChange(c10439no0.getState());
        }
        C10439no0 c10439no02 = new C10439no0(this.f12048b);
        c10439no02.setTint(0);
        float f2 = this.f12054h;
        int iM22230e = this.f12060n ? AbstractC10036ke1.m22230e(R.attr.colorSurface, materialButton) : 0;
        c10439no02.f38516a.f37940j = f2;
        c10439no02.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM22230e);
        C10311mo0 c10311mo02 = c10439no02.f38516a;
        if (c10311mo02.f37934d != colorStateListValueOf) {
            c10311mo02.f37934d = colorStateListValueOf;
            c10439no02.onStateChange(c10439no02.getState());
        }
        C10439no0 c10439no03 = new C10439no0(this.f12048b);
        this.f12059m = c10439no03;
        AbstractC4173hL.m18805g(c10439no03, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC11767yB1.m26092b(this.f12058l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c10439no02, c10439no0}), this.f12049c, this.f12051e, this.f12050d, this.f12052f), this.f12059m);
        this.f12065s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C10439no0 c10439no0M8147b = m8147b(false);
        if (c10439no0M8147b != null) {
            c10439no0M8147b.m23237i(this.f12066t);
            c10439no0M8147b.setState(materialButton.getDrawableState());
        }
    }

    /* renamed from: f */
    public final void m8151f() {
        C10439no0 c10439no0M8147b = m8147b(false);
        C10439no0 c10439no0M8147b2 = m8147b(true);
        if (c10439no0M8147b != null) {
            float f = this.f12054h;
            ColorStateList colorStateList = this.f12057k;
            c10439no0M8147b.f38516a.f37940j = f;
            c10439no0M8147b.invalidateSelf();
            C10311mo0 c10311mo0 = c10439no0M8147b.f38516a;
            if (c10311mo0.f37934d != colorStateList) {
                c10311mo0.f37934d = colorStateList;
                c10439no0M8147b.onStateChange(c10439no0M8147b.getState());
            }
            if (c10439no0M8147b2 != null) {
                float f2 = this.f12054h;
                int iM22230e = this.f12060n ? AbstractC10036ke1.m22230e(R.attr.colorSurface, this.f12047a) : 0;
                c10439no0M8147b2.f38516a.f37940j = f2;
                c10439no0M8147b2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM22230e);
                C10311mo0 c10311mo02 = c10439no0M8147b2.f38516a;
                if (c10311mo02.f37934d != colorStateListValueOf) {
                    c10311mo02.f37934d = colorStateListValueOf;
                    c10439no0M8147b2.onStateChange(c10439no0M8147b2.getState());
                }
            }
        }
    }
}

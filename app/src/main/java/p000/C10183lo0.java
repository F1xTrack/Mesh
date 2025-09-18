package p000;

import android.R;
import android.content.res.ColorStateList;

/* renamed from: lo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10183lo0 extends C1076R6 {

    /* renamed from: g */
    public static final int[][] f37295g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    public ColorStateList f37296e;

    /* renamed from: f */
    public boolean f37297f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f37296e == null) {
            int iM22230e = AbstractC10036ke1.m22230e(ru.mes.dnevnik.R.attr.colorControlActivated, this);
            int iM22230e2 = AbstractC10036ke1.m22230e(ru.mes.dnevnik.R.attr.colorOnSurface, this);
            int iM22230e3 = AbstractC10036ke1.m22230e(ru.mes.dnevnik.R.attr.colorSurface, this);
            this.f37296e = new ColorStateList(f37295g, new int[]{AbstractC10036ke1.m22234i(iM22230e3, 1.0f, iM22230e), AbstractC10036ke1.m22234i(iM22230e3, 0.54f, iM22230e2), AbstractC10036ke1.m22234i(iM22230e3, 0.38f, iM22230e2), AbstractC10036ke1.m22234i(iM22230e3, 0.38f, iM22230e2)});
        }
        return this.f37296e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f37297f && AbstractC6268jw.m22121a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f37297f = z;
        if (z) {
            AbstractC6268jw.m22123c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC6268jw.m22123c(this, null);
        }
    }
}

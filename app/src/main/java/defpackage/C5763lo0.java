package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* renamed from: lo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5763lo0 extends R6 {
    public static final int[][] g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int iE = AbstractC5543ke1.e(ru.mes.dnevnik.R.attr.colorControlActivated, this);
            int iE2 = AbstractC5543ke1.e(ru.mes.dnevnik.R.attr.colorOnSurface, this);
            int iE3 = AbstractC5543ke1.e(ru.mes.dnevnik.R.attr.colorSurface, this);
            this.e = new ColorStateList(g, new int[]{AbstractC5543ke1.i(iE3, 1.0f, iE), AbstractC5543ke1.i(iE3, 0.54f, iE2), AbstractC5543ke1.i(iE3, 0.38f, iE2), AbstractC5543ke1.i(iE3, 0.38f, iE2)});
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && AbstractC5404jw.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            AbstractC5404jw.c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC5404jw.c(this, null);
        }
    }
}

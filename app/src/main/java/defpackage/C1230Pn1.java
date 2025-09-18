package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: Pn1 */
/* loaded from: classes.dex */
public class C1230Pn1 extends C1152On1 {
    public C1230Pn1(C1698Vn1 c1698Vn1, WindowInsets windowInsets) {
        super(c1698Vn1, windowInsets);
    }

    @Override // defpackage.C1464Sn1
    public C1698Vn1 a() {
        return C1698Vn1.h(null, this.c.consumeDisplayCutout());
    }

    @Override // defpackage.C1464Sn1
    public IK e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new IK(displayCutout);
    }

    @Override // defpackage.AbstractC1074Nn1, defpackage.C1464Sn1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1230Pn1)) {
            return false;
        }
        C1230Pn1 c1230Pn1 = (C1230Pn1) obj;
        return Objects.equals(this.c, c1230Pn1.c) && Objects.equals(this.g, c1230Pn1.g);
    }

    @Override // defpackage.C1464Sn1
    public int hashCode() {
        return this.c.hashCode();
    }
}

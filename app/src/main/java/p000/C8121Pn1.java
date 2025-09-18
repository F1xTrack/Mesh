package p000;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: Pn1 */
/* loaded from: classes.dex */
public class C8121Pn1 extends C8069On1 {
    public C8121Pn1(C8433Vn1 c8433Vn1, WindowInsets windowInsets) {
        super(c8433Vn1, windowInsets);
    }

    @Override // p000.C8277Sn1
    /* renamed from: a */
    public C8433Vn1 mo6430a() {
        return C8433Vn1.m8551h(null, this.f8002c.consumeDisplayCutout());
    }

    @Override // p000.C8277Sn1
    /* renamed from: e */
    public C0525IK mo6431e() {
        DisplayCutout displayCutout = this.f8002c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0525IK(displayCutout);
    }

    @Override // p000.AbstractC8017Nn1, p000.C8277Sn1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8121Pn1)) {
            return false;
        }
        C8121Pn1 c8121Pn1 = (C8121Pn1) obj;
        return Objects.equals(this.f8002c, c8121Pn1.f8002c) && Objects.equals(this.f8006g, c8121Pn1.f8006g);
    }

    @Override // p000.C8277Sn1
    public int hashCode() {
        return this.f8002c.hashCode();
    }
}

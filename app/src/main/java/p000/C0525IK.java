package p000;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: IK */
/* loaded from: classes.dex */
public final class C0525IK {

    /* renamed from: a */
    public final DisplayCutout f4896a;

    public C0525IK(DisplayCutout displayCutout) {
        this.f4896a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0525IK.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f4896a, ((C0525IK) obj).f4896a);
    }

    public final int hashCode() {
        return this.f4896a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f4896a + "}";
    }
}

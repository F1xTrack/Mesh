package defpackage;

import android.view.DisplayCutout;
import java.util.Objects;

/* loaded from: classes.dex */
public final class IK {
    public final DisplayCutout a;

    public IK(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IK.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((IK) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}

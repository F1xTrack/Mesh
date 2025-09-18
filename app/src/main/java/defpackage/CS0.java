package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CS0 {
    public final Resources a;
    public final Resources.Theme b;

    public CS0(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CS0.class != obj.getClass()) {
            return false;
        }
        CS0 cs0 = (CS0) obj;
        return this.a.equals(cs0.a) && Objects.equals(this.b, cs0.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}

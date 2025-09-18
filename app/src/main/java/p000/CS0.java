package p000;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CS0 {

    /* renamed from: a */
    public final Resources f1376a;

    /* renamed from: b */
    public final Resources.Theme f1377b;

    public CS0(Resources resources, Resources.Theme theme) {
        this.f1376a = resources;
        this.f1377b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CS0.class != obj.getClass()) {
            return false;
        }
        CS0 cs0 = (CS0) obj;
        return this.f1376a.equals(cs0.f1376a) && Objects.equals(this.f1377b, cs0.f1377b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1376a, this.f1377b);
    }
}

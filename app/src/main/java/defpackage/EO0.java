package defpackage;

import android.util.SparseArray;
import java.util.Set;

/* loaded from: classes.dex */
public final class EO0 {
    public SparseArray a;
    public int b;
    public Set c;

    public final DO0 a(int i) {
        SparseArray sparseArray = this.a;
        DO0 do0 = (DO0) sparseArray.get(i);
        if (do0 != null) {
            return do0;
        }
        DO0 do02 = new DO0();
        sparseArray.put(i, do02);
        return do02;
    }
}

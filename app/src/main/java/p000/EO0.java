package p000;

import android.util.SparseArray;
import java.util.Set;

/* loaded from: classes.dex */
public final class EO0 {

    /* renamed from: a */
    public SparseArray f2687a;

    /* renamed from: b */
    public int f2688b;

    /* renamed from: c */
    public Set f2689c;

    /* renamed from: a */
    public final DO0 m2209a(int i) {
        SparseArray sparseArray = this.f2687a;
        DO0 do0 = (DO0) sparseArray.get(i);
        if (do0 != null) {
            return do0;
        }
        DO0 do02 = new DO0();
        sparseArray.put(i, do02);
        return do02;
    }
}

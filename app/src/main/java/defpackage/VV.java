package defpackage;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class VV {
    public final SparseBooleanArray a;

    public VV(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        YN1.d(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VV)) {
            return false;
        }
        VV vv = (VV) obj;
        int i = AbstractC0277Dh1.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.equals(vv.a);
        }
        if (sparseBooleanArray.size() != vv.a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            if (a(i2) != vv.a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = AbstractC0277Dh1.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + a(i2);
        }
        return size;
    }
}

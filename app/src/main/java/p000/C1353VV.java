package p000;

import android.util.SparseBooleanArray;

/* renamed from: VV */
/* loaded from: classes.dex */
public final class C1353VV {

    /* renamed from: a */
    public final SparseBooleanArray f12594a;

    public C1353VV(SparseBooleanArray sparseBooleanArray) {
        this.f12594a = sparseBooleanArray;
    }

    /* renamed from: a */
    public final int m8443a(int i) {
        SparseBooleanArray sparseBooleanArray = this.f12594a;
        YN1.m9279d(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1353VV)) {
            return false;
        }
        C1353VV c1353vv = (C1353VV) obj;
        int i = AbstractC7485Dh1.f2166a;
        SparseBooleanArray sparseBooleanArray = this.f12594a;
        if (i >= 24) {
            return sparseBooleanArray.equals(c1353vv.f12594a);
        }
        if (sparseBooleanArray.size() != c1353vv.f12594a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            if (m8443a(i2) != c1353vv.m8443a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = AbstractC7485Dh1.f2166a;
        SparseBooleanArray sparseBooleanArray = this.f12594a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + m8443a(i2);
        }
        return size;
    }
}

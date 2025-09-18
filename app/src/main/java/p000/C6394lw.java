package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: lw */
/* loaded from: classes.dex */
public final class C6394lw extends AbstractC7986My0 implements Serializable {

    /* renamed from: a */
    public final Comparator[] f37365a;

    public C6394lw(C4261ik c4261ik, C4261ik c4261ik2) {
        this.f37365a = new Comparator[]{c4261ik, c4261ik2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f37365a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6394lw) {
            return Arrays.equals(this.f37365a, ((C6394lw) obj).f37365a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f37365a);
    }

    public final String toString() {
        return AbstractC1374Vq.m8593l(new StringBuilder("Ordering.compound("), Arrays.toString(this.f37365a), ")");
    }
}

package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: lw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5786lw extends AbstractC1028My0 implements Serializable {
    public final Comparator[] a;

    public C5786lw(C4400ik c4400ik, C4400ik c4400ik2) {
        this.a = new Comparator[]{c4400ik, c4400ik2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
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
        if (obj instanceof C5786lw) {
            return Arrays.equals(this.a, ((C5786lw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return AbstractC1705Vq.l(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}

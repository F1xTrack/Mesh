package defpackage;

import java.util.ArrayList;

/* renamed from: xc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8015xc extends AbstractC1675Vg {
    public final ArrayList a;

    public C8015xc(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1675Vg)) {
            return false;
        }
        return this.a.equals(((C8015xc) ((AbstractC1675Vg) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}

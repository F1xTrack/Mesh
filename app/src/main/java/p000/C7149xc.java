package p000;

import java.util.ArrayList;

/* renamed from: xc */
/* loaded from: classes.dex */
public final class C7149xc extends AbstractC1364Vg {

    /* renamed from: a */
    public final ArrayList f45709a;

    public C7149xc(ArrayList arrayList) {
        this.f45709a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1364Vg)) {
            return false;
        }
        return this.f45709a.equals(((C7149xc) ((AbstractC1364Vg) obj)).f45709a);
    }

    public final int hashCode() {
        return this.f45709a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f45709a + "}";
    }
}

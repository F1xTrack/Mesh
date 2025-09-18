package p000;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: ik */
/* loaded from: classes.dex */
public final class C4261ik extends AbstractC7986My0 implements Serializable {

    /* renamed from: a */
    public final InterfaceC6560oZ f29433a;

    /* renamed from: b */
    public final AbstractC7986My0 f29434b;

    public C4261ik(InterfaceC6560oZ interfaceC6560oZ, AbstractC7986My0 abstractC7986My0) {
        this.f29433a = interfaceC6560oZ;
        abstractC7986My0.getClass();
        this.f29434b = abstractC7986My0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC6560oZ interfaceC6560oZ = this.f29433a;
        return this.f29434b.compare(interfaceC6560oZ.apply(obj), interfaceC6560oZ.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4261ik)) {
            return false;
        }
        C4261ik c4261ik = (C4261ik) obj;
        return this.f29433a.equals(c4261ik.f29433a) && this.f29434b.equals(c4261ik.f29434b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29433a, this.f29434b});
    }

    public final String toString() {
        return this.f29434b + ".onResultOf(" + this.f29433a + ")";
    }
}

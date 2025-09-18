package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: ik, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4400ik extends AbstractC1028My0 implements Serializable {
    public final InterfaceC6290oZ a;
    public final AbstractC1028My0 b;

    public C4400ik(InterfaceC6290oZ interfaceC6290oZ, AbstractC1028My0 abstractC1028My0) {
        this.a = interfaceC6290oZ;
        abstractC1028My0.getClass();
        this.b = abstractC1028My0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC6290oZ interfaceC6290oZ = this.a;
        return this.b.compare(interfaceC6290oZ.apply(obj), interfaceC6290oZ.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4400ik)) {
            return false;
        }
        C4400ik c4400ik = (C4400ik) obj;
        return this.a.equals(c4400ik.a) && this.b.equals(c4400ik.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}

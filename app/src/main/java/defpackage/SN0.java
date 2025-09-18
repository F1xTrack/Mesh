package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class SN0 {
    public final AbstractC1512Td1 a;
    public final boolean b;
    public final ArrayList c;

    public SN0(AbstractC1512Td1 abstractC1512Td1, InterfaceC2330bT interfaceC2330bT, boolean z, ArrayList arrayList) {
        this.a = abstractC1512Td1;
        this.b = z;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SN0)) {
            return false;
        }
        if (this.a.equals(((SN0) obj).a)) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        this.a.hashCode();
        throw null;
    }

    public final String toString() {
        return "PropertyDescriptor(typeConverter=" + this.a + ", fieldAnnotation=" + ((Object) null) + ", isRequired=" + this.b + ", validators=" + this.c + ")";
    }
}

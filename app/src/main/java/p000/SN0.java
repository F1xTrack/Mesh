package p000;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class SN0 {

    /* renamed from: a */
    public final AbstractC8309Td1 f10706a;

    /* renamed from: b */
    public final boolean f10707b;

    /* renamed from: c */
    public final ArrayList f10708c;

    public SN0(AbstractC8309Td1 abstractC8309Td1, InterfaceC1787bT interfaceC1787bT, boolean z, ArrayList arrayList) {
        this.f10706a = abstractC8309Td1;
        this.f10707b = z;
        this.f10708c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SN0)) {
            return false;
        }
        if (this.f10706a.equals(((SN0) obj).f10706a)) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        this.f10706a.hashCode();
        throw null;
    }

    public final String toString() {
        return "PropertyDescriptor(typeConverter=" + this.f10706a + ", fieldAnnotation=" + ((Object) null) + ", isRequired=" + this.f10707b + ", validators=" + this.f10708c + ")";
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Mh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0977Mh0 {
    public final AbstractC0663Ig0 a;
    public final List b;
    public final ArrayList c;
    public final List d;

    public C0977Mh0(AbstractC0663Ig0 abstractC0663Ig0, List list, ArrayList arrayList, List list2) {
        this.a = abstractC0663Ig0;
        this.b = list;
        this.c = arrayList;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0977Mh0)) {
            return false;
        }
        C0977Mh0 c0977Mh0 = (C0977Mh0) obj;
        return this.a.equals(c0977Mh0.a) && O90.a(null, null) && this.b.equals(c0977Mh0.b) && this.c.equals(c0977Mh0.c) && this.d.equals(c0977Mh0.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 961)) * 31)) * 31) + 1237) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MethodSignatureData(returnType=");
        sb.append(this.a);
        sb.append(", receiverType=null, valueParameters=");
        sb.append(this.b);
        sb.append(", typeParameters=");
        sb.append(this.c);
        sb.append(", hasStableParameterNames=false, errors=");
        return AbstractC7209tN0.A(sb, this.d, ')');
    }
}

package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Mh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7952Mh0 {

    /* renamed from: a */
    public final AbstractC7742Ig0 f7298a;

    /* renamed from: b */
    public final List f7299b;

    /* renamed from: c */
    public final ArrayList f7300c;

    /* renamed from: d */
    public final List f7301d;

    public C7952Mh0(AbstractC7742Ig0 abstractC7742Ig0, List list, ArrayList arrayList, List list2) {
        this.f7298a = abstractC7742Ig0;
        this.f7299b = list;
        this.f7300c = arrayList;
        this.f7301d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7952Mh0)) {
            return false;
        }
        C7952Mh0 c7952Mh0 = (C7952Mh0) obj;
        return this.f7298a.equals(c7952Mh0.f7298a) && O90.m5963a(null, null) && this.f7299b.equals(c7952Mh0.f7299b) && this.f7300c.equals(c7952Mh0.f7300c) && this.f7301d.equals(c7952Mh0.f7301d);
    }

    public final int hashCode() {
        return this.f7301d.hashCode() + ((((this.f7300c.hashCode() + ((this.f7299b.hashCode() + (this.f7298a.hashCode() * 961)) * 31)) * 31) + 1237) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MethodSignatureData(returnType=");
        sb.append(this.f7298a);
        sb.append(", receiverType=null, valueParameters=");
        sb.append(this.f7299b);
        sb.append(", typeParameters=");
        sb.append(this.f7300c);
        sb.append(", hasStableParameterNames=false, errors=");
        return AbstractC11153tN0.m24883A(sb, this.f7301d, ')');
    }
}

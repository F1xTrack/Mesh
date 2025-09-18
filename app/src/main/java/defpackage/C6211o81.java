package defpackage;

import java.util.List;

/* renamed from: o81, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6211o81 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public C6211o81(String str, String str2, List list, String str3, List list2) {
        O90.f(list, "columnNames");
        O90.f(list2, "referenceColumnNames");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6211o81)) {
            return false;
        }
        C6211o81 c6211o81 = (C6211o81) obj;
        if (O90.a(this.a, c6211o81.a) && O90.a(this.b, c6211o81.b) && O90.a(this.c, c6211o81.c) && O90.a(this.d, c6211o81.d)) {
            return O90.a(this.e, c6211o81.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + AbstractC1705Vq.e(AbstractC1705Vq.e(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForeignKey{referenceTable='");
        sb.append(this.a);
        sb.append("', onDelete='");
        sb.append(this.b);
        sb.append(" +', onUpdate='");
        sb.append(this.c);
        sb.append("', columnNames=");
        sb.append(this.d);
        sb.append(", referenceColumnNames=");
        return AbstractC7209tN0.A(sb, this.e, '}');
    }
}

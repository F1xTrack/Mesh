package p000;

import java.util.List;

/* renamed from: o81, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10484o81 {

    /* renamed from: a */
    public final String f38827a;

    /* renamed from: b */
    public final String f38828b;

    /* renamed from: c */
    public final String f38829c;

    /* renamed from: d */
    public final List f38830d;

    /* renamed from: e */
    public final List f38831e;

    public C10484o81(String str, String str2, List list, String str3, List list2) {
        O90.m5968f(list, "columnNames");
        O90.m5968f(list2, "referenceColumnNames");
        this.f38827a = str;
        this.f38828b = str2;
        this.f38829c = str3;
        this.f38830d = list;
        this.f38831e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10484o81)) {
            return false;
        }
        C10484o81 c10484o81 = (C10484o81) obj;
        if (O90.m5963a(this.f38827a, c10484o81.f38827a) && O90.m5963a(this.f38828b, c10484o81.f38828b) && O90.m5963a(this.f38829c, c10484o81.f38829c) && O90.m5963a(this.f38830d, c10484o81.f38830d)) {
            return O90.m5963a(this.f38831e, c10484o81.f38831e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38831e.hashCode() + ((this.f38830d.hashCode() + AbstractC1374Vq.m8586e(AbstractC1374Vq.m8586e(this.f38827a.hashCode() * 31, 31, this.f38828b), 31, this.f38829c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForeignKey{referenceTable='");
        sb.append(this.f38827a);
        sb.append("', onDelete='");
        sb.append(this.f38828b);
        sb.append(" +', onUpdate='");
        sb.append(this.f38829c);
        sb.append("', columnNames=");
        sb.append(this.f38830d);
        sb.append(", referenceColumnNames=");
        return AbstractC11153tN0.m24883A(sb, this.f38831e, '}');
    }
}

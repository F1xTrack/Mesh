package p000;

import java.util.ArrayList;

/* renamed from: Nn */
/* loaded from: classes2.dex */
public final class C0868Nn {

    /* renamed from: a */
    public final ArrayList f7994a;

    public C0868Nn(ArrayList arrayList) {
        this.f7994a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0868Nn) && this.f7994a.equals(((C0868Nn) obj).f7994a);
    }

    public final int hashCode() {
        return this.f7994a.hashCode();
    }

    public final String toString() {
        return "CodeScanner(codeTypes=" + this.f7994a + ")";
    }
}

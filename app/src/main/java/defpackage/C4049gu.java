package defpackage;

import java.util.ArrayList;

/* renamed from: gu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4049gu {
    public final ArrayList a;

    public C4049gu(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4049gu) && this.a.equals(((C4049gu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CodeScannerOptions(codeTypes=" + this.a + ")";
    }
}

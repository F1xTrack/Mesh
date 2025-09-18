package defpackage;

import java.util.ArrayList;

/* renamed from: Nn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1072Nn {
    public final ArrayList a;

    public C1072Nn(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1072Nn) && this.a.equals(((C1072Nn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CodeScanner(codeTypes=" + this.a + ")";
    }
}

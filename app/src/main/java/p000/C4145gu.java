package p000;

import java.util.ArrayList;

/* renamed from: gu */
/* loaded from: classes2.dex */
public final class C4145gu {

    /* renamed from: a */
    public final ArrayList f28077a;

    public C4145gu(ArrayList arrayList) {
        this.f28077a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4145gu) && this.f28077a.equals(((C4145gu) obj).f28077a);
    }

    public final int hashCode() {
        return this.f28077a.hashCode();
    }

    public final String toString() {
        return "CodeScannerOptions(codeTypes=" + this.f28077a + ")";
    }
}

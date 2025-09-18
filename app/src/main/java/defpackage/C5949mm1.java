package defpackage;

import java.util.ArrayList;

/* renamed from: mm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5949mm1 extends W02 {
    public final ArrayList a;

    public C5949mm1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5949mm1) && this.a.equals(((C5949mm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Sent(values=" + this.a + ')';
    }
}

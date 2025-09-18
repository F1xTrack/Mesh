package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* renamed from: cT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2520cT {
    public final String a;
    public final Map b;

    public C2520cT(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static C4332iN a(String str) {
        return new C4332iN(str);
    }

    public static C2520cT c(String str) {
        return new C2520cT(str, Collections.emptyMap());
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2520cT)) {
            return false;
        }
        C2520cT c2520cT = (C2520cT) obj;
        return this.a.equals(c2520cT.a) && this.b.equals(c2520cT.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}

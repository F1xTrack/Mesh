package p000;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* renamed from: cT */
/* loaded from: classes.dex */
public final class C1849cT {

    /* renamed from: a */
    public final String f17529a;

    /* renamed from: b */
    public final Map f17530b;

    public C1849cT(String str, Map map) {
        this.f17529a = str;
        this.f17530b = map;
    }

    /* renamed from: a */
    public static C4238iN m10700a(String str) {
        return new C4238iN(str);
    }

    /* renamed from: c */
    public static C1849cT m10701c(String str) {
        return new C1849cT(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public final Annotation m10702b(Class cls) {
        return (Annotation) this.f17530b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1849cT)) {
            return false;
        }
        C1849cT c1849cT = (C1849cT) obj;
        return this.f17529a.equals(c1849cT.f17529a) && this.f17530b.equals(c1849cT.f17530b);
    }

    public final int hashCode() {
        return this.f17530b.hashCode() + (this.f17529a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f17529a + ", properties=" + this.f17530b.values() + "}";
    }
}

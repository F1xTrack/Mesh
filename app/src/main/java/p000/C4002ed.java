package p000;

import java.util.List;

/* renamed from: ed */
/* loaded from: classes.dex */
public final class C4002ed extends AbstractC0389GA {

    /* renamed from: a */
    public final String f26780a;

    /* renamed from: b */
    public final int f26781b;

    /* renamed from: c */
    public final List f26782c;

    public C4002ed(int i, String str, List list) {
        this.f26780a = str;
        this.f26781b = i;
        this.f26782c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0389GA)) {
            return false;
        }
        AbstractC0389GA abstractC0389GA = (AbstractC0389GA) obj;
        if (this.f26780a.equals(((C4002ed) abstractC0389GA).f26780a)) {
            C4002ed c4002ed = (C4002ed) abstractC0389GA;
            if (this.f26781b == c4002ed.f26781b && this.f26782c.equals(c4002ed.f26782c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f26780a.hashCode() ^ 1000003) * 1000003) ^ this.f26781b) * 1000003) ^ this.f26782c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f26780a + ", importance=" + this.f26781b + ", frames=" + this.f26782c + "}";
    }
}

package p000;

import java.util.HashSet;

/* renamed from: cr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9037cr0 implements InterfaceC0250Dy {

    /* renamed from: a */
    public final int f25680a;

    /* renamed from: b */
    public final boolean f25681b;

    public C9037cr0(String str, int i, boolean z) {
        this.f25680a = i;
        this.f25681b = z;
    }

    @Override // p000.InterfaceC0250Dy
    /* renamed from: a */
    public final InterfaceC6793ry mo1954a(C10307mm0 c10307mm0, C8532Xl0 c8532Xl0, AbstractC6504ng abstractC6504ng) {
        if (((HashSet) c10307mm0.f37900n.f11590b).contains(EnumC10435nm0.f38501a)) {
            return new C9165dr0(this);
        }
        AbstractC11201tl0.m24980b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        int i = this.f25680a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE");
        sb.append('}');
        return sb.toString();
    }
}

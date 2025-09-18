package defpackage;

import java.util.HashSet;

/* renamed from: cr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3278cr0 implements InterfaceC0326Dy {
    public final int a;
    public final boolean b;

    public C3278cr0(String str, int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.InterfaceC0326Dy
    public final InterfaceC6937ry a(C5948mm0 c5948mm0, C1847Xl0 c1847Xl0, AbstractC6120ng abstractC6120ng) {
        if (((HashSet) c5948mm0.n.b).contains(EnumC6139nm0.a)) {
            return new C3468dr0(this);
        }
        AbstractC7281tl0.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE");
        sb.append('}');
        return sb.toString();
    }
}

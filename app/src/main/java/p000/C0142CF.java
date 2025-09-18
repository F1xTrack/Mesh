package p000;

import java.util.ArrayList;

/* renamed from: CF */
/* loaded from: classes.dex */
public final class C0142CF implements InterfaceC9704i30 {

    /* renamed from: d */
    public static final int[] f1265d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b */
    public C7408Bv0 f1266b;

    /* renamed from: c */
    public boolean f1267c;

    /* renamed from: a */
    public static void m1126a(int i, ArrayList arrayList) {
        if (AbstractC10983s22.m24583e(f1265d, i, 0, 7) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    /* renamed from: b */
    public C6686qX m1127b(C6686qX c6686qX) {
        if (!this.f1267c || !this.f1266b.mo911b(c6686qX)) {
            return c6686qX;
        }
        C6623pX c6623pXM24020a = c6686qX.m24020a();
        c6623pXM24020a.f40161l = AbstractC8544Xr0.m9171n("application/x-media3-cues");
        c6623pXM24020a.f40146F = this.f1266b.mo917h(c6686qX);
        StringBuilder sb = new StringBuilder();
        sb.append(c6686qX.f40974m);
        String str = c6686qX.f40971j;
        sb.append(str != null ? " ".concat(str) : "");
        c6623pXM24020a.f40158i = sb.toString();
        c6623pXM24020a.f40166q = Long.MAX_VALUE;
        return new C6686qX(c6623pXM24020a);
    }
}

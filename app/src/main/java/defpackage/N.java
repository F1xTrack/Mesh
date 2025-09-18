package defpackage;

/* loaded from: classes.dex */
public final class N implements InterfaceC6396p61 {
    public final /* synthetic */ C4297iB0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ O f;

    public N(O o, C4297iB0 c4297iB0, String str, Object obj, Object obj2, int i) {
        this.f = o;
        this.a = c4297iB0;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = i;
    }

    @Override // defpackage.InterfaceC6396p61
    public final Object get() {
        EnumC6398p70 enumC6398p70;
        O o = this.f;
        C4297iB0 c4297iB0 = this.a;
        String str = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        int i = this.e;
        C5264jB0 c5264jB0 = (C5264jB0) o;
        c5264jB0.getClass();
        C6589q70 c6589q70 = (C6589q70) obj;
        Z60 z60 = c5264jB0.j;
        int iX = AbstractC8235ym.x(i);
        if (iX == 0) {
            enumC6398p70 = EnumC6398p70.FULL_FETCH;
        } else if (iX == 1) {
            enumC6398p70 = EnumC6398p70.DISK_CACHE;
        } else {
            if (iX != 2) {
                StringBuilder sb = new StringBuilder("Cache level");
                sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "BITMAP_MEMORY_CACHE" : "DISK_CACHE" : "FULL_FETCH");
                sb.append("is not supported. ");
                throw new RuntimeException(sb.toString());
            }
            enumC6398p70 = EnumC6398p70.BITMAP_MEMORY_CACHE;
        }
        if (c4297iB0 instanceof C4297iB0) {
            synchronized (c4297iB0) {
            }
        }
        return z60.a(c6589q70, obj2, enumC6398p70, null, str);
    }

    public final String toString() {
        C1857Xo1 c1857Xo1D = EI1.d(this);
        c1857Xo1D.l(this.c.toString(), "request");
        return c1857Xo1D.toString();
    }
}

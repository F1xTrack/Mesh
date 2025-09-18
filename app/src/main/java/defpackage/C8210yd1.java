package defpackage;

/* renamed from: yd1 */
/* loaded from: classes.dex */
public final class C8210yd1 implements InterfaceC7449ud1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ AbstractC7067sd1 c;

    public /* synthetic */ C8210yd1(Class cls, AbstractC7067sd1 abstractC7067sd1, int i) {
        this.a = i;
        this.b = cls;
        this.c = abstractC7067sd1;
    }

    @Override // defpackage.InterfaceC7449ud1
    public final AbstractC7067sd1 a(C3504e20 c3504e20, C8213ye1 c8213ye1) {
        switch (this.a) {
            case 0:
                if (c8213ye1.a == this.b) {
                    return this.c;
                }
                return null;
            default:
                if (this.b.isAssignableFrom(c8213ye1.a)) {
                    return new C6224oD(this);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("Factory[type=");
                NX.n(this.b, sb, ",adapter=");
                sb.append(this.c);
                sb.append("]");
                return sb.toString();
            default:
                StringBuilder sb2 = new StringBuilder("Factory[typeHierarchy=");
                NX.n(this.b, sb2, ",adapter=");
                sb2.append(this.c);
                sb2.append("]");
                return sb2.toString();
        }
    }
}

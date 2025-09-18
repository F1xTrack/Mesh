package p000;

/* renamed from: yd1 */
/* loaded from: classes.dex */
public final class C11823yd1 implements InterfaceC11314ud1 {

    /* renamed from: a */
    public final /* synthetic */ int f46364a;

    /* renamed from: b */
    public final /* synthetic */ Class f46365b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC11058sd1 f46366c;

    public /* synthetic */ C11823yd1(Class cls, AbstractC11058sd1 abstractC11058sd1, int i) {
        this.f46364a = i;
        this.f46365b = cls;
        this.f46366c = abstractC11058sd1;
    }

    @Override // p000.InterfaceC11314ud1
    /* renamed from: a */
    public final AbstractC11058sd1 mo2052a(C9189e20 c9189e20, C11825ye1 c11825ye1) {
        switch (this.f46364a) {
            case 0:
                if (c11825ye1.f46373a == this.f46365b) {
                    return this.f46366c;
                }
                return null;
            default:
                if (this.f46365b.isAssignableFrom(c11825ye1.f46373a)) {
                    return new C6538oD(this);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f46364a) {
            case 0:
                StringBuilder sb = new StringBuilder("Factory[type=");
                AbstractC0852NX.m5765n(this.f46365b, sb, ",adapter=");
                sb.append(this.f46366c);
                sb.append("]");
                return sb.toString();
            default:
                StringBuilder sb2 = new StringBuilder("Factory[typeHierarchy=");
                AbstractC0852NX.m5765n(this.f46365b, sb2, ",adapter=");
                sb2.append(this.f46366c);
                sb2.append("]");
                return sb2.toString();
        }
    }
}

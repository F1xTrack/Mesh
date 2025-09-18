package p000;

/* renamed from: xd1 */
/* loaded from: classes2.dex */
public final class C11696xd1 implements InterfaceC11186td1 {

    /* renamed from: a */
    public final /* synthetic */ int f45719a;

    /* renamed from: b */
    public final /* synthetic */ Class f45720b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC10930rd1 f45721c;

    public /* synthetic */ C11696xd1(Class cls, AbstractC10930rd1 abstractC10930rd1, int i) {
        this.f45719a = i;
        this.f45720b = cls;
        this.f45721c = abstractC10930rd1;
    }

    @Override // p000.InterfaceC11186td1
    /* renamed from: a */
    public final AbstractC10930rd1 mo1562a(C1753aw c1753aw, C11698xe1 c11698xe1) {
        switch (this.f45719a) {
            case 0:
                if (c11698xe1.f45725a == this.f45720b) {
                    return this.f45721c;
                }
                return null;
            default:
                Class cls = this.f45720b;
                Class<?> cls2 = c11698xe1.f45725a;
                if (cls.isAssignableFrom(cls2)) {
                    return new C0324F8(this, cls2);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f45719a) {
            case 0:
                StringBuilder sb = new StringBuilder("Factory[type=");
                AbstractC0852NX.m5765n(this.f45720b, sb, ",adapter=");
                sb.append(this.f45721c);
                sb.append("]");
                return sb.toString();
            default:
                StringBuilder sb2 = new StringBuilder("Factory[typeHierarchy=");
                AbstractC0852NX.m5765n(this.f45720b, sb2, ",adapter=");
                sb2.append(this.f45721c);
                sb2.append("]");
                return sb2.toString();
        }
    }
}

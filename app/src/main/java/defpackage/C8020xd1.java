package defpackage;

/* renamed from: xd1 */
/* loaded from: classes2.dex */
public final class C8020xd1 implements InterfaceC7258td1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ AbstractC6876rd1 c;

    public /* synthetic */ C8020xd1(Class cls, AbstractC6876rd1 abstractC6876rd1, int i) {
        this.a = i;
        this.b = cls;
        this.c = abstractC6876rd1;
    }

    @Override // defpackage.InterfaceC7258td1
    public final AbstractC6876rd1 a(C2226aw c2226aw, C8023xe1 c8023xe1) {
        switch (this.a) {
            case 0:
                if (c8023xe1.a == this.b) {
                    return this.c;
                }
                return null;
            default:
                Class cls = this.b;
                Class<?> cls2 = c8023xe1.a;
                if (cls.isAssignableFrom(cls2)) {
                    return new F8(this, cls2);
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

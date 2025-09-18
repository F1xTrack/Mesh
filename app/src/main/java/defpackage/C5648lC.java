package defpackage;

import java.io.Serializable;

/* renamed from: lC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5648lC extends UY1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ C5648lC(Object obj, Serializable serializable, int i) {
        this.a = i;
        this.b = obj;
        this.c = serializable;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Vg0, nZ] */
    @Override // defpackage.UY1
    public void a(Object obj) {
        switch (this.a) {
            case 1:
                InterfaceC8042xl interfaceC8042xl = (InterfaceC8042xl) obj;
                O90.f(interfaceC8042xl, "current");
                TO0 to0 = (TO0) this.b;
                if (to0.a == null && ((Boolean) ((AbstractC1676Vg0) this.c).invoke(interfaceC8042xl)).booleanValue()) {
                    to0.a = interfaceC8042xl;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, nZ] */
    @Override // defpackage.UY1
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                boolean zBooleanValue = ((Boolean) this.b.invoke(obj)).booleanValue();
                boolean[] zArr = (boolean[]) this.c;
                if (zBooleanValue) {
                    zArr[0] = true;
                }
                return !zArr[0];
            case 1:
                O90.f((InterfaceC8042xl) obj, "current");
                return ((TO0) this.b).a == null;
            default:
                InterfaceC7492us interfaceC7492us = (InterfaceC7492us) obj;
                O90.f(interfaceC7492us, "javaClassDescriptor");
                String strA = AbstractC2278bB1.a(interfaceC7492us, (String) this.b);
                boolean zContains = C2551cd0.b.contains(strA);
                TO0 to0 = (TO0) this.c;
                if (zContains) {
                    to0.a = EnumC1664Vc0.a;
                } else if (C2551cd0.d.contains(strA)) {
                    to0.a = EnumC1664Vc0.b;
                } else if (C2551cd0.c.contains(strA)) {
                    to0.a = EnumC1664Vc0.c;
                } else if (C2551cd0.a.contains(strA)) {
                    to0.a = EnumC1664Vc0.e;
                }
                return to0.a == null;
        }
    }

    @Override // defpackage.UY1
    public final Object c() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((boolean[]) this.c)[0]);
            case 1:
                return (InterfaceC8042xl) ((TO0) this.b).a;
            default:
                EnumC1664Vc0 enumC1664Vc0 = (EnumC1664Vc0) ((TO0) this.c).a;
                return enumC1664Vc0 == null ? EnumC1664Vc0.d : enumC1664Vc0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5648lC(TO0 to0, InterfaceC6099nZ interfaceC6099nZ) {
        this.a = 1;
        this.b = to0;
        this.c = (AbstractC1676Vg0) interfaceC6099nZ;
    }
}

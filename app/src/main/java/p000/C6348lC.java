package p000;

import java.io.Serializable;

/* renamed from: lC */
/* loaded from: classes2.dex */
public final class C6348lC extends UY1 {

    /* renamed from: a */
    public final /* synthetic */ int f36955a;

    /* renamed from: b */
    public final /* synthetic */ Object f36956b;

    /* renamed from: c */
    public final /* synthetic */ Serializable f36957c;

    public /* synthetic */ C6348lC(Object obj, Serializable serializable, int i) {
        this.f36955a = i;
        this.f36956b = obj;
        this.f36957c = serializable;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Vg0, nZ] */
    @Override // p000.UY1
    /* renamed from: a */
    public void mo8082a(Object obj) {
        switch (this.f36955a) {
            case 1:
                InterfaceC7158xl interfaceC7158xl = (InterfaceC7158xl) obj;
                O90.m5968f(interfaceC7158xl, "current");
                TO0 to0 = (TO0) this.f36956b;
                if (to0.f11337a == null && ((Boolean) ((AbstractC8418Vg0) this.f36957c).invoke(interfaceC7158xl)).booleanValue()) {
                    to0.f11337a = interfaceC7158xl;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, nZ] */
    @Override // p000.UY1
    /* renamed from: b */
    public final boolean mo7087b(Object obj) {
        switch (this.f36955a) {
            case 0:
                boolean zBooleanValue = ((Boolean) this.f36956b.invoke(obj)).booleanValue();
                boolean[] zArr = (boolean[]) this.f36957c;
                if (zBooleanValue) {
                    zArr[0] = true;
                }
                return !zArr[0];
            case 1:
                O90.m5968f((InterfaceC7158xl) obj, "current");
                return ((TO0) this.f36956b).f11337a == null;
            default:
                InterfaceC6976us interfaceC6976us = (InterfaceC6976us) obj;
                O90.m5968f(interfaceC6976us, "javaClassDescriptor");
                String strM10433a = AbstractC8821bB1.m10433a(interfaceC6976us, (String) this.f36956b);
                boolean zContains = C9004cd0.f17660b.contains(strM10433a);
                TO0 to0 = (TO0) this.f36957c;
                if (zContains) {
                    to0.f11337a = EnumC8410Vc0.f12649a;
                } else if (C9004cd0.f17662d.contains(strM10433a)) {
                    to0.f11337a = EnumC8410Vc0.f12650b;
                } else if (C9004cd0.f17661c.contains(strM10433a)) {
                    to0.f11337a = EnumC8410Vc0.f12651c;
                } else if (C9004cd0.f17659a.contains(strM10433a)) {
                    to0.f11337a = EnumC8410Vc0.f12653e;
                }
                return to0.f11337a == null;
        }
    }

    @Override // p000.UY1
    /* renamed from: c */
    public final Object mo7088c() {
        switch (this.f36955a) {
            case 0:
                return Boolean.valueOf(((boolean[]) this.f36957c)[0]);
            case 1:
                return (InterfaceC7158xl) ((TO0) this.f36956b).f11337a;
            default:
                EnumC8410Vc0 enumC8410Vc0 = (EnumC8410Vc0) ((TO0) this.f36957c).f11337a;
                return enumC8410Vc0 == null ? EnumC8410Vc0.f12652d : enumC8410Vc0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6348lC(TO0 to0, InterfaceC6497nZ interfaceC6497nZ) {
        this.f36955a = 1;
        this.f36956b = to0;
        this.f36957c = (AbstractC8418Vg0) interfaceC6497nZ;
    }
}

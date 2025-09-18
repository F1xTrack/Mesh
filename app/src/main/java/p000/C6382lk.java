package p000;

import java.io.File;

/* renamed from: lk */
/* loaded from: classes.dex */
public final class C6382lk implements InterfaceC11215ts0 {

    /* renamed from: a */
    public final /* synthetic */ int f37276a;

    /* renamed from: b */
    public final Object f37277b;

    public /* synthetic */ C6382lk(int i, Object obj) {
        this.f37276a = i;
        this.f37277b = obj;
    }

    @Override // p000.InterfaceC11215ts0
    /* renamed from: a */
    public final boolean mo8529a(Object obj) {
        switch (this.f37276a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p000.InterfaceC11215ts0
    /* renamed from: b */
    public final C11087ss0 mo8530b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        switch (this.f37276a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new C11087ss0(new C8606Yw0(bArr), new C8436Vp0(bArr, 1, (InterfaceC6319kk) this.f37277b));
            case 1:
                return new C11087ss0(new C8606Yw0(obj), new C6286kD(0, obj.toString(), (C10212m12) this.f37277b));
            case 2:
                File file = (File) obj;
                return new C11087ss0(new C8606Yw0(file), new C6286kD(1, file, (InterfaceC7266zT) this.f37277b));
            default:
                E10 e10 = (E10) obj;
                return new C11087ss0(e10, new C11353ux0((C10585ox0) this.f37277b, e10));
        }
    }
}

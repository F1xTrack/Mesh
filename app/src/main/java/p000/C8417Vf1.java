package p000;

import java.io.File;

/* renamed from: Vf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8417Vf1 implements InterfaceC11215ts0 {

    /* renamed from: b */
    public static final C8417Vf1 f12685b = new C8417Vf1(0);

    /* renamed from: a */
    public final /* synthetic */ int f12686a;

    public /* synthetic */ C8417Vf1(int i) {
        this.f12686a = i;
    }

    @Override // p000.InterfaceC11215ts0
    /* renamed from: a */
    public final boolean mo8529a(Object obj) {
        switch (this.f12686a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // p000.InterfaceC11215ts0
    /* renamed from: b */
    public final C11087ss0 mo8530b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        switch (this.f12686a) {
            case 0:
                return new C11087ss0(new C8606Yw0(obj), new C6762rk(1, obj));
            case 1:
                File file = (File) obj;
                return new C11087ss0(new C8606Yw0(file), new C6762rk(0, file));
            default:
                return null;
        }
    }
}

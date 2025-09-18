package defpackage;

import java.io.File;

/* renamed from: Vf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1674Vf1 implements InterfaceC7302ts0 {
    public static final C1674Vf1 b = new C1674Vf1(0);
    public final /* synthetic */ int a;

    public /* synthetic */ C1674Vf1(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC7302ts0
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.InterfaceC7302ts0
    public final C7111ss0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        switch (this.a) {
            case 0:
                return new C7111ss0(new C1958Yw0(obj), new C6895rk(1, obj));
            case 1:
                File file = (File) obj;
                return new C7111ss0(new C1958Yw0(file), new C6895rk(0, file));
            default:
                return null;
        }
    }
}

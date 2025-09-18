package defpackage;

import java.io.File;

/* renamed from: lk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5750lk implements InterfaceC7302ts0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C5750lk(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC7302ts0
    public final boolean a(Object obj) {
        switch (this.a) {
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

    @Override // defpackage.InterfaceC7302ts0
    public final C7111ss0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new C7111ss0(new C1958Yw0(bArr), new C1703Vp0(bArr, 1, (InterfaceC5559kk) this.b));
            case 1:
                return new C7111ss0(new C1958Yw0(obj), new C5460kD(0, obj.toString(), (C5806m12) this.b));
            case 2:
                File file = (File) obj;
                return new C7111ss0(new C1958Yw0(file), new C5460kD(1, file, (InterfaceC8368zT) this.b));
            default:
                E10 e10 = (E10) obj;
                return new C7111ss0(e10, new C7508ux0((C6363ox0) this.b, e10));
        }
    }
}

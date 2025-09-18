package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* renamed from: Xz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1888Xz extends AbstractC7221tR0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C1888Xz(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.AbstractC7221tR0
    public final long a() {
        switch (this.a) {
            case 0:
                return ((File) ((C1888Xz) this.b).c).length();
            case 1:
                return ((File) this.c).length();
            case 2:
                return ((C0674Ik) this.c).c();
            default:
                try {
                    return ((InputStream) this.c).available();
                } catch (IOException unused) {
                    return 0L;
                }
        }
    }

    @Override // defpackage.AbstractC7221tR0
    public final C1859Xp0 b() {
        switch (this.a) {
        }
        return (C1859Xp0) this.b;
    }

    @Override // defpackage.AbstractC7221tR0
    public final void d(InterfaceC0749Jj interfaceC0749Jj) {
        C7357u9 c7357u9G = null;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                C8161yN0 c8161yN0A = JI1.a(new C1966Yz(interfaceC0749Jj, this, (NT) obj));
                ((C1888Xz) this.b).d(c8161yN0A);
                c8161yN0A.flush();
                return;
            case 1:
                Logger logger = AbstractC7889wx0.a;
                C7357u9 c7357u9 = new C7357u9(new FileInputStream((File) obj), C0334Ea1.d);
                try {
                    interfaceC0749Jj.i(c7357u9);
                    AbstractC2141aT1.a(c7357u9, null);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC2141aT1.a(c7357u9, th);
                        throw th2;
                    }
                }
            case 2:
                interfaceC0749Jj.k0((C0674Ik) obj);
                return;
            default:
                try {
                    c7357u9G = JI1.g((InputStream) obj);
                    interfaceC0749Jj.i(c7357u9G);
                    try {
                        c7357u9G.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                        return;
                    }
                } catch (Throwable th3) {
                    try {
                        c7357u9G.close();
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                    }
                    throw th3;
                }
        }
    }
}

package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* renamed from: Xz */
/* loaded from: classes2.dex */
public final class C1509Xz extends AbstractC11161tR0 {

    /* renamed from: a */
    public final /* synthetic */ int f14075a;

    /* renamed from: b */
    public final Object f14076b;

    /* renamed from: c */
    public final Object f14077c;

    public /* synthetic */ C1509Xz(Object obj, int i, Object obj2) {
        this.f14075a = i;
        this.f14076b = obj;
        this.f14077c = obj2;
    }

    @Override // p000.AbstractC11161tR0
    /* renamed from: a */
    public final long mo9186a() {
        switch (this.f14075a) {
            case 0:
                return ((File) ((C1509Xz) this.f14076b).f14077c).length();
            case 1:
                return ((File) this.f14077c).length();
            case 2:
                return ((C0551Ik) this.f14077c).mo3983c();
            default:
                try {
                    return ((InputStream) this.f14077c).available();
                } catch (IOException unused) {
                    return 0L;
                }
        }
    }

    @Override // p000.AbstractC11161tR0
    /* renamed from: b */
    public final C8540Xp0 mo9187b() {
        switch (this.f14075a) {
        }
        return (C8540Xp0) this.f14076b;
    }

    @Override // p000.AbstractC11161tR0
    /* renamed from: d */
    public final void mo9188d(InterfaceC0613Jj interfaceC0613Jj) {
        C6931u9 c6931u9M4279g = null;
        Object obj = this.f14077c;
        switch (this.f14075a) {
            case 0:
                C11790yN0 c11790yN0M4273a = JI1.m4273a(new C1572Yz(interfaceC0613Jj, this, (C0848NT) obj));
                ((C1509Xz) this.f14076b).mo9188d(c11790yN0M4273a);
                c11790yN0M4273a.flush();
                return;
            case 1:
                Logger logger = AbstractC11608wx0.f45176a;
                C6931u9 c6931u9 = new C6931u9(new FileInputStream((File) obj), C7523Ea1.f2789d);
                try {
                    interfaceC0613Jj.mo4396i(c6931u9);
                    AbstractC8729aT1.m9749a(c6931u9, null);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC8729aT1.m9749a(c6931u9, th);
                        throw th2;
                    }
                }
            case 2:
                interfaceC0613Jj.mo4398k0((C0551Ik) obj);
                return;
            default:
                try {
                    c6931u9M4279g = JI1.m4279g((InputStream) obj);
                    interfaceC0613Jj.mo4396i(c6931u9M4279g);
                    try {
                        c6931u9M4279g.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                        return;
                    }
                } catch (Throwable th3) {
                    try {
                        c6931u9M4279g.close();
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                    }
                    throw th3;
                }
        }
    }
}

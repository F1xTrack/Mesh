package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: hD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4112hD0 implements InterfaceC3296cx0 {
    public final InterfaceC6907ro a;
    public final C0390Et0 b;
    public EnumC5652lD0 c;
    public final AbstractC4056gw0 d;
    public QZ e;
    public boolean f = false;

    public C4112hD0(InterfaceC6907ro interfaceC6907ro, C0390Et0 c0390Et0, AbstractC4056gw0 abstractC4056gw0) {
        this.a = interfaceC6907ro;
        this.b = c0390Et0;
        this.d = abstractC4056gw0;
        synchronized (this) {
            this.c = (EnumC5652lD0) c0390Et0.d();
        }
    }

    @Override // defpackage.InterfaceC3296cx0
    public final void a(Object obj) {
        EnumC7289to enumC7289to = (EnumC7289to) obj;
        EnumC7289to enumC7289to2 = EnumC7289to.CLOSING;
        EnumC5652lD0 enumC5652lD0 = EnumC5652lD0.a;
        if (enumC7289to == enumC7289to2 || enumC7289to == EnumC7289to.CLOSED || enumC7289to == EnumC7289to.RELEASING || enumC7289to == EnumC7289to.RELEASED) {
            b(enumC5652lD0);
            if (this.f) {
                this.f = false;
                QZ qz = this.e;
                if (qz != null) {
                    qz.cancel(false);
                    this.e = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((enumC7289to == EnumC7289to.OPENING || enumC7289to == EnumC7289to.OPEN || enumC7289to == EnumC7289to.PENDING_OPEN) && !this.f) {
            b(enumC5652lD0);
            ArrayList arrayList = new ArrayList();
            InterfaceC6907ro interfaceC6907ro = this.a;
            QZ qzA = QZ.a(AbstractC8171yQ1.b(new C4290i9(this, interfaceC6907ro, arrayList, 12)));
            C1724Vw0 c1724Vw0 = new C1724Vw0(3, this);
            TJ tjA = QR1.a();
            qzA.getClass();
            RunnableC3467dr runnableC3467drR = AbstractC1500Sz1.r(qzA, c1724Vw0, tjA);
            C3921gD0 c3921gD0 = new C3921gD0(0, this);
            RunnableC3467dr runnableC3467drR2 = AbstractC1500Sz1.r(runnableC3467drR, new C0136Bm1(20, c3921gD0), QR1.a());
            this.e = runnableC3467drR2;
            AbstractC1500Sz1.a(runnableC3467drR2, new C5772lr0((Object) this, (Serializable) arrayList, (Object) interfaceC6907ro, 21), QR1.a());
            this.f = true;
        }
    }

    public final void b(EnumC5652lD0 enumC5652lD0) {
        synchronized (this) {
            try {
                if (this.c.equals(enumC5652lD0)) {
                    return;
                }
                this.c = enumC5652lD0;
                Objects.toString(enumC5652lD0);
                AbstractC0759Jm0.f("StreamStateObserver");
                this.b.k(enumC5652lD0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC3296cx0
    public final void onError(Throwable th) {
        QZ qz = this.e;
        if (qz != null) {
            qz.cancel(false);
            this.e = null;
        }
        b(EnumC5652lD0.a);
    }
}

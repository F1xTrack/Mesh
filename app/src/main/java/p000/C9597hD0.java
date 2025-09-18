package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: hD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9597hD0 implements InterfaceC9049cx0 {

    /* renamed from: a */
    public final InterfaceC6766ro f28317a;

    /* renamed from: b */
    public final C7560Et0 f28318b;

    /* renamed from: c */
    public EnumC10109lD0 f28319c;

    /* renamed from: d */
    public final AbstractC9559gw0 f28320d;

    /* renamed from: e */
    public C1043QZ f28321e;

    /* renamed from: f */
    public boolean f28322f = false;

    public C9597hD0(InterfaceC6766ro interfaceC6766ro, C7560Et0 c7560Et0, AbstractC9559gw0 abstractC9559gw0) {
        this.f28317a = interfaceC6766ro;
        this.f28318b = c7560Et0;
        this.f28320d = abstractC9559gw0;
        synchronized (this) {
            this.f28319c = (EnumC10109lD0) c7560Et0.mo1868d();
        }
    }

    @Override // p000.InterfaceC9049cx0
    /* renamed from: a */
    public final void mo2107a(Object obj) {
        EnumC6909to enumC6909to = (EnumC6909to) obj;
        EnumC6909to enumC6909to2 = EnumC6909to.CLOSING;
        EnumC10109lD0 enumC10109lD0 = EnumC10109lD0.f36974a;
        if (enumC6909to == enumC6909to2 || enumC6909to == EnumC6909to.CLOSED || enumC6909to == EnumC6909to.RELEASING || enumC6909to == EnumC6909to.RELEASED) {
            m18785b(enumC10109lD0);
            if (this.f28322f) {
                this.f28322f = false;
                C1043QZ c1043qz = this.f28321e;
                if (c1043qz != null) {
                    c1043qz.cancel(false);
                    this.f28321e = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((enumC6909to == EnumC6909to.OPENING || enumC6909to == EnumC6909to.OPEN || enumC6909to == EnumC6909to.PENDING_OPEN) && !this.f28322f) {
            m18785b(enumC10109lD0);
            ArrayList arrayList = new ArrayList();
            InterfaceC6766ro interfaceC6766ro = this.f28317a;
            C1043QZ c1043qzM6727a = C1043QZ.m6727a(AbstractC11797yQ1.m26149b(new C4224i9(this, interfaceC6766ro, arrayList, 12)));
            C8450Vw0 c8450Vw0 = new C8450Vw0(3, this);
            ExecutorC1215TJ executorC1215TJM6703a = QR1.m6703a();
            c1043qzM6727a.getClass();
            RunnableC3953dr runnableC3953drM7495r = AbstractC8301Sz1.m7495r(c1043qzM6727a, c8450Vw0, executorC1215TJM6703a);
            C9469gD0 c9469gD0 = new C9469gD0(0, this);
            RunnableC3953dr runnableC3953drM7495r2 = AbstractC8301Sz1.m7495r(runnableC3953drM7495r, new C7391Bm1(20, c9469gD0), QR1.m6703a());
            this.f28321e = runnableC3953drM7495r2;
            AbstractC8301Sz1.m7478a(runnableC3953drM7495r2, new C10189lr0((Object) this, (Serializable) arrayList, (Object) interfaceC6766ro, 21), QR1.m6703a());
            this.f28322f = true;
        }
    }

    /* renamed from: b */
    public final void m18785b(EnumC10109lD0 enumC10109lD0) {
        synchronized (this) {
            try {
                if (this.f28319c.equals(enumC10109lD0)) {
                    return;
                }
                this.f28319c = enumC10109lD0;
                Objects.toString(enumC10109lD0);
                AbstractC7806Jm0.m4412f("StreamStateObserver");
                this.f28318b.m2440k(enumC10109lD0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC9049cx0
    public final void onError(Throwable th) {
        C1043QZ c1043qz = this.f28321e;
        if (c1043qz != null) {
            c1043qz.cancel(false);
            this.f28321e = null;
        }
        m18785b(EnumC10109lD0.f36974a);
    }
}

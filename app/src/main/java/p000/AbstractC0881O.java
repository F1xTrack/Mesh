package p000;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: O */
/* loaded from: classes.dex */
public abstract class AbstractC0881O {

    /* renamed from: g */
    public static final C0755M f8154g = new C0755M();

    /* renamed from: h */
    public static final NullPointerException f8155h = new NullPointerException("No image request was specified!");

    /* renamed from: i */
    public static final AtomicLong f8156i = new AtomicLong();

    /* renamed from: a */
    public Object f8157a;

    /* renamed from: b */
    public C10737q70 f8158b;

    /* renamed from: c */
    public C10737q70 f8159c;

    /* renamed from: d */
    public InterfaceC3899cz f8160d;

    /* renamed from: e */
    public boolean f8161e;

    /* renamed from: f */
    public InterfaceC6817sL f8162f;

    /* renamed from: a */
    public final C9721iB0 m5919a() {
        C9721iB0 c9721iB0;
        C10737q70 c10737q70;
        if (this.f8158b == null && (c10737q70 = this.f8159c) != null) {
            this.f8158b = c10737q70;
            this.f8159c = null;
        }
        AbstractC4250iZ.m19063b();
        C9849jB0 c9849jB0 = (C9849jB0) this;
        AbstractC4250iZ.m19063b();
        try {
            InterfaceC6817sL interfaceC6817sL = c9849jB0.f8162f;
            String strValueOf = String.valueOf(f8156i.getAndIncrement());
            if (interfaceC6817sL instanceof C9721iB0) {
                c9721iB0 = (C9721iB0) interfaceC6817sL;
            } else {
                C10919rY0 c10919rY0 = c9849jB0.f34967k;
                c9721iB0 = new C9721iB0((Resources) c10919rY0.f41728b, (C6479nH) c10919rY0.f41729c, (ScheduledExecutorServiceC7689Hf1) c10919rY0.f41730d, (CC0) c10919rY0.f41731e);
            }
            InterfaceC10608p61 interfaceC10608p61M5921c = c9849jB0.m5921c(c9721iB0, strValueOf);
            C10737q70 c10737q702 = c9849jB0.f8158b;
            C1210TE c1210te = c9849jB0.f34966j.f14733i;
            C4196hi c4196hiM7642K = (c1210te == null || c10737q702 == null) ? null : c10737q702.f40623p != null ? c1210te.m7642K(c10737q702, c9849jB0.f8157a) : c1210te.m7640H(c10737q702, c9849jB0.f8157a);
            Object obj = c9849jB0.f8157a;
            c9721iB0.getClass();
            AbstractC4250iZ.m19063b();
            c9721iB0.m4808f(obj, strValueOf);
            c9721iB0.f6442o = false;
            c9721iB0.f28886w = interfaceC10608p61M5921c;
            c9721iB0.m18979q(null);
            c9721iB0.f28885v = c4196hiM7642K;
            c9721iB0.m18979q(null);
            AbstractC4250iZ.m19063b();
            synchronized (c9721iB0) {
                c9721iB0.f28887x = c9849jB0.f8158b;
            }
            AbstractC4250iZ.m19063b();
            InterfaceC3899cz interfaceC3899cz = this.f8160d;
            if (interfaceC3899cz != null) {
                c9721iB0.m4803a(interfaceC3899cz);
            }
            if (this.f8161e) {
                c9721iB0.m4803a(f8154g);
            }
            AbstractC4250iZ.m19063b();
            return c9721iB0;
        } catch (Throwable th) {
            AbstractC4250iZ.m19063b();
            throw th;
        }
    }

    /* renamed from: b */
    public final void m5920b() {
        this.f8157a = null;
        this.f8158b = null;
        this.f8159c = null;
        this.f8160d = null;
        this.f8161e = false;
        this.f8162f = null;
    }

    /* renamed from: c */
    public final InterfaceC10608p61 m5921c(C9721iB0 c9721iB0, String str) {
        C10737q70 c10737q70 = this.f8158b;
        InterfaceC10608p61 c0818n = c10737q70 != null ? new C0818N(this, c9721iB0, str, c10737q70, this.f8157a, 1) : null;
        if (c0818n != null && this.f8159c != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(c0818n);
            arrayList.add(new C0818N(this, c9721iB0, str, this.f8159c, this.f8157a, 1));
            c0818n = new C9331f80(arrayList);
        }
        return c0818n == null ? new C1833cD(0) : c0818n;
    }
}

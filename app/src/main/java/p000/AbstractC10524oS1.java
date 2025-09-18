package p000;

import java.io.IOException;
import java.util.List;

/* renamed from: oS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10524oS1 implements Cloneable {

    /* renamed from: a */
    public final AbstractC10908rS1 f39023a;

    /* renamed from: b */
    public AbstractC10908rS1 f39024b;

    public AbstractC10524oS1(AbstractC10908rS1 abstractC10908rS1) {
        this.f39023a = abstractC10908rS1;
        if (abstractC10908rS1.m24349l()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f39024b = (AbstractC10908rS1) abstractC10908rS1.mo644d(4);
    }

    /* renamed from: b */
    public static void m23410b(int i, List list) {
        String strM26230g = AbstractC7222ym.m26230g(list.size() - i, "Element at index ", " is null.");
        for (int size = list.size() - 1; size >= i; size--) {
            list.remove(size);
        }
        throw new NullPointerException(strM26230g);
    }

    /* renamed from: a */
    public final AbstractC10524oS1 m23411a(AbstractC10908rS1 abstractC10908rS1) {
        AbstractC10908rS1 abstractC10908rS12 = this.f39023a;
        if (abstractC10908rS12.equals(abstractC10908rS1)) {
            return this;
        }
        if (!this.f39024b.m24349l()) {
            AbstractC10908rS1 abstractC10908rS13 = (AbstractC10908rS1) abstractC10908rS12.mo644d(4);
            AbstractC10908rS1 abstractC10908rS14 = this.f39024b;
            TU1 tu1 = TU1.f11400c;
            tu1.getClass();
            tu1.m7696a(abstractC10908rS13.getClass()).mo17700h(abstractC10908rS13, abstractC10908rS14);
            this.f39024b = abstractC10908rS13;
        }
        AbstractC10908rS1 abstractC10908rS15 = this.f39024b;
        TU1 tu12 = TU1.f11400c;
        tu12.getClass();
        tu12.m7696a(abstractC10908rS15.getClass()).mo17700h(abstractC10908rS15, abstractC10908rS1);
        return this;
    }

    public final /* synthetic */ Object clone() {
        AbstractC10524oS1 abstractC10524oS1 = (AbstractC10524oS1) this.f39023a.mo644d(5);
        abstractC10524oS1.f39024b = m23413h();
        return abstractC10524oS1;
    }

    /* renamed from: e */
    public final AbstractC10908rS1 m23412e() {
        AbstractC10908rS1 abstractC10908rS1M23413h = m23413h();
        abstractC10908rS1M23413h.getClass();
        boolean zMo17694b = true;
        byte bByteValue = ((Byte) abstractC10908rS1M23413h.mo644d(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zMo17694b = false;
            } else {
                TU1 tu1 = TU1.f11400c;
                tu1.getClass();
                zMo17694b = tu1.m7696a(abstractC10908rS1M23413h.getClass()).mo17694b(abstractC10908rS1M23413h);
                abstractC10908rS1M23413h.mo644d(2);
            }
        }
        if (zMo17694b) {
            return abstractC10908rS1M23413h;
        }
        throw new LV1("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: h */
    public final AbstractC10908rS1 m23413h() {
        if (!this.f39024b.m24349l()) {
            return this.f39024b;
        }
        AbstractC10908rS1 abstractC10908rS1 = this.f39024b;
        abstractC10908rS1.getClass();
        TU1 tu1 = TU1.f11400c;
        tu1.getClass();
        tu1.m7696a(abstractC10908rS1.getClass()).mo17696d(abstractC10908rS1);
        abstractC10908rS1.m24348k();
        return this.f39024b;
    }

    /* renamed from: i */
    public final void m23414i() {
        if (this.f39024b.m24349l()) {
            return;
        }
        AbstractC10908rS1 abstractC10908rS1 = (AbstractC10908rS1) this.f39023a.mo644d(4);
        AbstractC10908rS1 abstractC10908rS12 = this.f39024b;
        TU1 tu1 = TU1.f11400c;
        tu1.getClass();
        tu1.m7696a(abstractC10908rS1.getClass()).mo17700h(abstractC10908rS1, abstractC10908rS12);
        this.f39024b = abstractC10908rS1;
    }

    /* renamed from: j */
    public final void m23415j(byte[] bArr, int i, BR1 br1) throws VS1 {
        if (!this.f39024b.m24349l()) {
            AbstractC10908rS1 abstractC10908rS1 = (AbstractC10908rS1) this.f39023a.mo644d(4);
            AbstractC10908rS1 abstractC10908rS12 = this.f39024b;
            TU1 tu1 = TU1.f11400c;
            tu1.getClass();
            tu1.m7696a(abstractC10908rS1.getClass()).mo17700h(abstractC10908rS1, abstractC10908rS12);
            this.f39024b = abstractC10908rS1;
        }
        try {
            TU1 tu12 = TU1.f11400c;
            AbstractC10908rS1 abstractC10908rS13 = this.f39024b;
            tu12.getClass();
            InterfaceC9122dV1 interfaceC9122dV1M7696a = tu12.m7696a(abstractC10908rS13.getClass());
            AbstractC10908rS1 abstractC10908rS14 = this.f39024b;
            VP1 vp1 = new VP1();
            br1.getClass();
            interfaceC9122dV1M7696a.mo17695c(abstractC10908rS14, bArr, 0, i, vp1);
        } catch (VS1 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw VS1.m8442d();
        }
    }
}

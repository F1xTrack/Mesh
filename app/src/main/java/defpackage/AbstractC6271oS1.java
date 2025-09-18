package defpackage;

import java.io.IOException;
import java.util.List;

/* renamed from: oS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6271oS1 implements Cloneable {
    public final AbstractC6843rS1 a;
    public AbstractC6843rS1 b;

    public AbstractC6271oS1(AbstractC6843rS1 abstractC6843rS1) {
        this.a = abstractC6843rS1;
        if (abstractC6843rS1.l()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = (AbstractC6843rS1) abstractC6843rS1.d(4);
    }

    public static void b(int i, List list) {
        String strG = AbstractC8235ym.g(list.size() - i, "Element at index ", " is null.");
        for (int size = list.size() - 1; size >= i; size--) {
            list.remove(size);
        }
        throw new NullPointerException(strG);
    }

    public final AbstractC6271oS1 a(AbstractC6843rS1 abstractC6843rS1) {
        AbstractC6843rS1 abstractC6843rS12 = this.a;
        if (abstractC6843rS12.equals(abstractC6843rS1)) {
            return this;
        }
        if (!this.b.l()) {
            AbstractC6843rS1 abstractC6843rS13 = (AbstractC6843rS1) abstractC6843rS12.d(4);
            AbstractC6843rS1 abstractC6843rS14 = this.b;
            TU1 tu1 = TU1.c;
            tu1.getClass();
            tu1.a(abstractC6843rS13.getClass()).h(abstractC6843rS13, abstractC6843rS14);
            this.b = abstractC6843rS13;
        }
        AbstractC6843rS1 abstractC6843rS15 = this.b;
        TU1 tu12 = TU1.c;
        tu12.getClass();
        tu12.a(abstractC6843rS15.getClass()).h(abstractC6843rS15, abstractC6843rS1);
        return this;
    }

    public final /* synthetic */ Object clone() {
        AbstractC6271oS1 abstractC6271oS1 = (AbstractC6271oS1) this.a.d(5);
        abstractC6271oS1.b = h();
        return abstractC6271oS1;
    }

    public final AbstractC6843rS1 e() {
        AbstractC6843rS1 abstractC6843rS1H = h();
        abstractC6843rS1H.getClass();
        boolean zB = true;
        byte bByteValue = ((Byte) abstractC6843rS1H.d(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zB = false;
            } else {
                TU1 tu1 = TU1.c;
                tu1.getClass();
                zB = tu1.a(abstractC6843rS1H.getClass()).b(abstractC6843rS1H);
                abstractC6843rS1H.d(2);
            }
        }
        if (zB) {
            return abstractC6843rS1H;
        }
        throw new LV1("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final AbstractC6843rS1 h() {
        if (!this.b.l()) {
            return this.b;
        }
        AbstractC6843rS1 abstractC6843rS1 = this.b;
        abstractC6843rS1.getClass();
        TU1 tu1 = TU1.c;
        tu1.getClass();
        tu1.a(abstractC6843rS1.getClass()).d(abstractC6843rS1);
        abstractC6843rS1.k();
        return this.b;
    }

    public final void i() {
        if (this.b.l()) {
            return;
        }
        AbstractC6843rS1 abstractC6843rS1 = (AbstractC6843rS1) this.a.d(4);
        AbstractC6843rS1 abstractC6843rS12 = this.b;
        TU1 tu1 = TU1.c;
        tu1.getClass();
        tu1.a(abstractC6843rS1.getClass()).h(abstractC6843rS1, abstractC6843rS12);
        this.b = abstractC6843rS1;
    }

    public final void j(byte[] bArr, int i, BR1 br1) throws VS1 {
        if (!this.b.l()) {
            AbstractC6843rS1 abstractC6843rS1 = (AbstractC6843rS1) this.a.d(4);
            AbstractC6843rS1 abstractC6843rS12 = this.b;
            TU1 tu1 = TU1.c;
            tu1.getClass();
            tu1.a(abstractC6843rS1.getClass()).h(abstractC6843rS1, abstractC6843rS12);
            this.b = abstractC6843rS1;
        }
        try {
            TU1 tu12 = TU1.c;
            AbstractC6843rS1 abstractC6843rS13 = this.b;
            tu12.getClass();
            InterfaceC3404dV1 interfaceC3404dV1A = tu12.a(abstractC6843rS13.getClass());
            AbstractC6843rS1 abstractC6843rS14 = this.b;
            VP1 vp1 = new VP1();
            br1.getClass();
            interfaceC3404dV1A.c(abstractC6843rS14, bArr, 0, i, vp1);
        } catch (VS1 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw VS1.d();
        }
    }
}

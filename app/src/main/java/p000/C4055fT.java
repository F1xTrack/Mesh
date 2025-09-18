package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: fT */
/* loaded from: classes.dex */
public final class C4055fT {

    /* renamed from: c */
    public static final /* synthetic */ int f27207c = 0;

    /* renamed from: a */
    public final C10214m21 f27208a = new C10214m21(16);

    /* renamed from: b */
    public boolean f27209b;

    static {
        new C4055fT(0);
    }

    public C4055fT() {
    }

    /* renamed from: b */
    public static void m18238b(C6518nu c6518nu, EnumC10440no1 enumC10440no1, int i, Object obj) {
        if (enumC10440no1 == EnumC10440no1.f38541e) {
            c6518nu.m23274H(i, 3);
            ((AbstractC0568J0) obj).mo4102d(c6518nu);
            c6518nu.m23274H(i, 4);
            return;
        }
        c6518nu.m23274H(i, enumC10440no1.f38544b);
        switch (enumC10440no1.ordinal()) {
            case 0:
                c6518nu.m23271E(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c6518nu.m23269C(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c6518nu.m23277K(((Long) obj).longValue());
                break;
            case 3:
                c6518nu.m23277K(((Long) obj).longValue());
                break;
            case 4:
                c6518nu.m23272F(((Integer) obj).intValue());
                break;
            case 5:
                c6518nu.m23271E(((Long) obj).longValue());
                break;
            case 6:
                c6518nu.m23269C(((Integer) obj).intValue());
                break;
            case 7:
                c6518nu.m23278y(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0299Ek)) {
                    c6518nu.m23273G((String) obj);
                    break;
                } else {
                    c6518nu.m23267A((C0299Ek) obj);
                    break;
                }
            case 9:
                ((AbstractC0568J0) obj).mo4102d(c6518nu);
                break;
            case 10:
                AbstractC0568J0 abstractC0568J0 = (AbstractC0568J0) obj;
                c6518nu.m23275I(((AbstractC11868z00) abstractC0568J0).mo4101c(null));
                abstractC0568J0.mo4102d(c6518nu);
                break;
            case 11:
                if (!(obj instanceof C0299Ek)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c6518nu.m23275I(length);
                    c6518nu.m23279z(bArr, 0, length);
                    break;
                } else {
                    c6518nu.m23267A((C0299Ek) obj);
                    break;
                }
            case 12:
                c6518nu.m23275I(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof EnumC3909d8)) {
                    c6518nu.m23272F(((Integer) obj).intValue());
                    break;
                } else {
                    c6518nu.m23272F(((EnumC3909d8) obj).f25838a);
                    break;
                }
            case 14:
                c6518nu.m23269C(((Integer) obj).intValue());
                break;
            case 15:
                c6518nu.m23271E(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c6518nu.m23275I((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c6518nu.m23277K((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* renamed from: a */
    public final void m18239a() {
        C10214m21 c10214m21;
        if (this.f27209b) {
            return;
        }
        int i = 0;
        while (true) {
            c10214m21 = this.f27208a;
            if (i >= c10214m21.f37427b.size()) {
                break;
            }
            Map.Entry entryM22638c = c10214m21.m22638c(i);
            if (entryM22638c.getValue() instanceof AbstractC11868z00) {
                AbstractC11868z00 abstractC11868z00 = (AbstractC11868z00) entryM22638c.getValue();
                abstractC11868z00.getClass();
                YF0 yf0 = YF0.f14212c;
                yf0.getClass();
                yf0.m9251a(abstractC11868z00.getClass()).mo1709b(abstractC11868z00);
                abstractC11868z00.m26297q();
            }
            i++;
        }
        if (!c10214m21.f37429d) {
            if (c10214m21.f37427b.size() > 0) {
                c10214m21.m22638c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = c10214m21.m22639d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c10214m21.f37429d) {
            c10214m21.f37428c = c10214m21.f37428c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c10214m21.f37428c);
            c10214m21.f37431f = c10214m21.f37431f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c10214m21.f37431f);
            c10214m21.f37429d = true;
        }
        this.f27209b = true;
    }

    public final Object clone() {
        C4055fT c4055fT = new C4055fT();
        C10214m21 c10214m21 = this.f27208a;
        if (c10214m21.f37427b.size() > 0) {
            Map.Entry entryM22638c = c10214m21.m22638c(0);
            if (entryM22638c.getKey() != null) {
                throw new ClassCastException();
            }
            entryM22638c.getValue();
            throw null;
        }
        Iterator it = c10214m21.m22639d().iterator();
        if (!it.hasNext()) {
            return c4055fT;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4055fT) {
            return this.f27208a.equals(((C4055fT) obj).f27208a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27208a.hashCode();
    }

    public C4055fT(int i) {
        m18239a();
        m18239a();
    }
}

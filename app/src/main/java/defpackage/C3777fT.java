package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: fT */
/* loaded from: classes.dex */
public final class C3777fT {
    public static final /* synthetic */ int c = 0;
    public final C5809m21 a = new C5809m21(16);
    public boolean b;

    static {
        new C3777fT(0);
    }

    public C3777fT() {
    }

    public static void b(C6162nu c6162nu, EnumC6146no1 enumC6146no1, int i, Object obj) {
        if (enumC6146no1 == EnumC6146no1.e) {
            c6162nu.H(i, 3);
            ((J0) obj).d(c6162nu);
            c6162nu.H(i, 4);
            return;
        }
        c6162nu.H(i, enumC6146no1.b);
        switch (enumC6146no1.ordinal()) {
            case 0:
                c6162nu.E(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c6162nu.C(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c6162nu.K(((Long) obj).longValue());
                break;
            case 3:
                c6162nu.K(((Long) obj).longValue());
                break;
            case 4:
                c6162nu.F(((Integer) obj).intValue());
                break;
            case 5:
                c6162nu.E(((Long) obj).longValue());
                break;
            case 6:
                c6162nu.C(((Integer) obj).intValue());
                break;
            case 7:
                c6162nu.y(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0362Ek)) {
                    c6162nu.G((String) obj);
                    break;
                } else {
                    c6162nu.A((C0362Ek) obj);
                    break;
                }
            case 9:
                ((J0) obj).d(c6162nu);
                break;
            case 10:
                J0 j0 = (J0) obj;
                c6162nu.I(((AbstractC8279z00) j0).c(null));
                j0.d(c6162nu);
                break;
            case 11:
                if (!(obj instanceof C0362Ek)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c6162nu.I(length);
                    c6162nu.z(bArr, 0, length);
                    break;
                } else {
                    c6162nu.A((C0362Ek) obj);
                    break;
                }
            case 12:
                c6162nu.I(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof EnumC3333d8)) {
                    c6162nu.F(((Integer) obj).intValue());
                    break;
                } else {
                    c6162nu.F(((EnumC3333d8) obj).a);
                    break;
                }
            case 14:
                c6162nu.C(((Integer) obj).intValue());
                break;
            case 15:
                c6162nu.E(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c6162nu.I((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c6162nu.K((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        C5809m21 c5809m21;
        if (this.b) {
            return;
        }
        int i = 0;
        while (true) {
            c5809m21 = this.a;
            if (i >= c5809m21.b.size()) {
                break;
            }
            Map.Entry entryC = c5809m21.c(i);
            if (entryC.getValue() instanceof AbstractC8279z00) {
                AbstractC8279z00 abstractC8279z00 = (AbstractC8279z00) entryC.getValue();
                abstractC8279z00.getClass();
                YF0 yf0 = YF0.c;
                yf0.getClass();
                yf0.a(abstractC8279z00.getClass()).b(abstractC8279z00);
                abstractC8279z00.q();
            }
            i++;
        }
        if (!c5809m21.d) {
            if (c5809m21.b.size() > 0) {
                c5809m21.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = c5809m21.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c5809m21.d) {
            c5809m21.c = c5809m21.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c5809m21.c);
            c5809m21.f = c5809m21.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c5809m21.f);
            c5809m21.d = true;
        }
        this.b = true;
    }

    public final Object clone() {
        C3777fT c3777fT = new C3777fT();
        C5809m21 c5809m21 = this.a;
        if (c5809m21.b.size() > 0) {
            Map.Entry entryC = c5809m21.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = c5809m21.d().iterator();
        if (!it.hasNext()) {
            return c3777fT;
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
        if (obj instanceof C3777fT) {
            return this.a.equals(((C3777fT) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public C3777fT(int i) {
        a();
        a();
    }
}

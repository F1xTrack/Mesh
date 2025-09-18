package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: hT */
/* loaded from: classes.dex */
public final class C4159hT {
    public static final /* synthetic */ int c = 0;
    public final C6191o21 a = new C6191o21(16);
    public boolean b;

    static {
        new C4159hT(0);
    }

    public C4159hT() {
    }

    public static void b(C6735qu c6735qu, EnumC6528po1 enumC6528po1, int i, Object obj) {
        if (enumC6528po1 == EnumC6528po1.d) {
            c6735qu.T(i, 3);
            ((L0) obj).c(c6735qu);
            c6735qu.T(i, 4);
            return;
        }
        c6735qu.T(i, enumC6528po1.b);
        switch (enumC6528po1.ordinal()) {
            case 0:
                c6735qu.O(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c6735qu.M(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c6735qu.X(((Long) obj).longValue());
                break;
            case 3:
                c6735qu.X(((Long) obj).longValue());
                break;
            case 4:
                c6735qu.Q(((Integer) obj).intValue());
                break;
            case 5:
                c6735qu.O(((Long) obj).longValue());
                break;
            case 6:
                c6735qu.M(((Integer) obj).intValue());
                break;
            case 7:
                c6735qu.G(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0440Fk)) {
                    c6735qu.S((String) obj);
                    break;
                } else {
                    c6735qu.K((C0440Fk) obj);
                    break;
                }
            case 9:
                ((L0) obj).c(c6735qu);
                break;
            case 10:
                L0 l0 = (L0) obj;
                c6735qu.getClass();
                c6735qu.V(l0.a());
                l0.c(c6735qu);
                break;
            case 11:
                if (!(obj instanceof C0440Fk)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c6735qu.V(length);
                    c6735qu.H(bArr, 0, length);
                    break;
                } else {
                    c6735qu.K((C0440Fk) obj);
                    break;
                }
            case 12:
                c6735qu.V(((Integer) obj).intValue());
                break;
            case 13:
                c6735qu.Q(((Integer) obj).intValue());
                break;
            case 14:
                c6735qu.M(((Integer) obj).intValue());
                break;
            case 15:
                c6735qu.O(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c6735qu.V((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c6735qu.X((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        C6191o21 c6191o21 = this.a;
        if (!c6191o21.d) {
            if (c6191o21.b.size() > 0) {
                c6191o21.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = c6191o21.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c6191o21.d) {
            c6191o21.c = c6191o21.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c6191o21.c);
            c6191o21.f = c6191o21.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c6191o21.f);
            c6191o21.d = true;
        }
        this.b = true;
    }

    public final Object clone() {
        C4159hT c4159hT = new C4159hT();
        C6191o21 c6191o21 = this.a;
        if (c6191o21.b.size() > 0) {
            Map.Entry entryC = c6191o21.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = c6191o21.d().iterator();
        if (!it.hasNext()) {
            return c4159hT;
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
        if (obj instanceof C4159hT) {
            return this.a.equals(((C4159hT) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public C4159hT(int i) {
        a();
        a();
    }
}

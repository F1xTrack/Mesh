package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: hT */
/* loaded from: classes.dex */
public final class C4181hT {

    /* renamed from: c */
    public static final /* synthetic */ int f28426c = 0;

    /* renamed from: a */
    public final C10470o21 f28427a = new C10470o21(16);

    /* renamed from: b */
    public boolean f28428b;

    static {
        new C4181hT(0);
    }

    public C4181hT() {
    }

    /* renamed from: b */
    public static void m18818b(C6709qu c6709qu, EnumC10696po1 enumC10696po1, int i, Object obj) {
        if (enumC10696po1 == EnumC10696po1.f40395d) {
            c6709qu.m24117T(i, 3);
            ((AbstractC0694L0) obj).mo431c(c6709qu);
            c6709qu.m24117T(i, 4);
            return;
        }
        c6709qu.m24117T(i, enumC10696po1.f40399b);
        switch (enumC10696po1.ordinal()) {
            case 0:
                c6709qu.m24112O(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c6709qu.m24110M(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c6709qu.m24121X(((Long) obj).longValue());
                break;
            case 3:
                c6709qu.m24121X(((Long) obj).longValue());
                break;
            case 4:
                c6709qu.m24114Q(((Integer) obj).intValue());
                break;
            case 5:
                c6709qu.m24112O(((Long) obj).longValue());
                break;
            case 6:
                c6709qu.m24110M(((Integer) obj).intValue());
                break;
            case 7:
                c6709qu.m24104G(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0362Fk)) {
                    c6709qu.m24116S((String) obj);
                    break;
                } else {
                    c6709qu.m24108K((C0362Fk) obj);
                    break;
                }
            case 9:
                ((AbstractC0694L0) obj).mo431c(c6709qu);
                break;
            case 10:
                AbstractC0694L0 abstractC0694L0 = (AbstractC0694L0) obj;
                c6709qu.getClass();
                c6709qu.m24119V(abstractC0694L0.mo430a());
                abstractC0694L0.mo431c(c6709qu);
                break;
            case 11:
                if (!(obj instanceof C0362Fk)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c6709qu.m24119V(length);
                    c6709qu.m24105H(bArr, 0, length);
                    break;
                } else {
                    c6709qu.m24108K((C0362Fk) obj);
                    break;
                }
            case 12:
                c6709qu.m24119V(((Integer) obj).intValue());
                break;
            case 13:
                c6709qu.m24114Q(((Integer) obj).intValue());
                break;
            case 14:
                c6709qu.m24110M(((Integer) obj).intValue());
                break;
            case 15:
                c6709qu.m24112O(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c6709qu.m24119V((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c6709qu.m24121X((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* renamed from: a */
    public final void m18819a() {
        if (this.f28428b) {
            return;
        }
        C10470o21 c10470o21 = this.f28427a;
        if (!c10470o21.f38729d) {
            if (c10470o21.f38727b.size() > 0) {
                c10470o21.m23316c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = c10470o21.m23317d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c10470o21.f38729d) {
            c10470o21.f38728c = c10470o21.f38728c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c10470o21.f38728c);
            c10470o21.f38731f = c10470o21.f38731f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c10470o21.f38731f);
            c10470o21.f38729d = true;
        }
        this.f28428b = true;
    }

    public final Object clone() {
        C4181hT c4181hT = new C4181hT();
        C10470o21 c10470o21 = this.f28427a;
        if (c10470o21.f38727b.size() > 0) {
            Map.Entry entryM23316c = c10470o21.m23316c(0);
            if (entryM23316c.getKey() != null) {
                throw new ClassCastException();
            }
            entryM23316c.getValue();
            throw null;
        }
        Iterator it = c10470o21.m23317d().iterator();
        if (!it.hasNext()) {
            return c4181hT;
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
        if (obj instanceof C4181hT) {
            return this.f28427a.equals(((C4181hT) obj).f28427a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28427a.hashCode();
    }

    public C4181hT(int i) {
        m18819a();
        m18819a();
    }
}

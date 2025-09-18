package defpackage;

import java.io.IOException;

/* renamed from: c40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2446c40 extends P81 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2446c40(int i, Object obj, Object obj2, String str) {
        super(str, true);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.P81
    public final long a() {
        long jA;
        C6198o40[] c6198o40Arr;
        int i = 0;
        switch (this.e) {
            case 0:
                C4085h40 c4085h40 = (C4085h40) this.f;
                c4085h40.a.a(c4085h40, (AZ0) ((TO0) this.g).a);
                return -1L;
            case 1:
                try {
                    ((C4085h40) this.f).a.b((C6198o40) this.g);
                    return -1L;
                } catch (IOException e) {
                    C6601qB0 c6601qB0 = C6601qB0.a;
                    C6601qB0 c6601qB02 = C6601qB0.a;
                    String str = "Http2Connection.Listener failure for " + ((C4085h40) this.f).c;
                    c6601qB02.getClass();
                    C6601qB0.i(4, str, e);
                    try {
                        ((C6198o40) this.g).c(2, e);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                C6185o1 c6185o1 = (C6185o1) this.f;
                AZ0 az0 = (AZ0) this.g;
                c6185o1.getClass();
                TO0 to0 = new TO0();
                C4085h40 c4085h402 = (C4085h40) c6185o1.c;
                synchronized (c4085h402.w) {
                    synchronized (c4085h402) {
                        try {
                            AZ0 az02 = c4085h402.q;
                            AZ0 az03 = new AZ0();
                            az03.b(az02);
                            az03.b(az0);
                            to0.a = az03;
                            jA = az03.a() - az02.a();
                            c6198o40Arr = (jA == 0 || c4085h402.b.isEmpty()) ? null : (C6198o40[]) c4085h402.b.values().toArray(new C6198o40[0]);
                            AZ0 az04 = (AZ0) to0.a;
                            O90.f(az04, "<set-?>");
                            c4085h402.q = az04;
                            c4085h402.j.c(new C2446c40(i, c4085h402, to0, c4085h402.c + " onSettings"), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        c4085h402.w.a((AZ0) to0.a);
                    } catch (IOException e2) {
                        c4085h402.a(2, 2, e2);
                    }
                }
                if (c6198o40Arr == null) {
                    return -1L;
                }
                int length = c6198o40Arr.length;
                while (i < length) {
                    C6198o40 c6198o40 = c6198o40Arr[i];
                    synchronized (c6198o40) {
                        c6198o40.f += jA;
                        if (jA > 0) {
                            c6198o40.notifyAll();
                        }
                    }
                    i++;
                }
                return -1L;
        }
    }
}

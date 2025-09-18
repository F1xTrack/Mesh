package p000;

import java.io.IOException;

/* renamed from: c40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8934c40 extends P81 {

    /* renamed from: e */
    public final /* synthetic */ int f17279e;

    /* renamed from: f */
    public final /* synthetic */ Object f17280f;

    /* renamed from: g */
    public final /* synthetic */ Object f17281g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8934c40(int i, Object obj, Object obj2, String str) {
        super(str, true);
        this.f17279e = i;
        this.f17280f = obj;
        this.f17281g = obj2;
    }

    @Override // p000.P81
    /* renamed from: a */
    public final long mo4621a() {
        long jM230a;
        C10475o40[] c10475o40Arr;
        int i = 0;
        switch (this.f17279e) {
            case 0:
                C9579h40 c9579h40 = (C9579h40) this.f17280f;
                c9579h40.f28214a.mo2606a(c9579h40, (AZ0) ((TO0) this.f17281g).f11337a);
                return -1L;
            case 1:
                try {
                    ((C9579h40) this.f17280f).f28214a.mo2607b((C10475o40) this.f17281g);
                    return -1L;
                } catch (IOException e) {
                    C10745qB0 c10745qB0 = C10745qB0.f40658a;
                    C10745qB0 c10745qB02 = C10745qB0.f40658a;
                    String str = "Http2Connection.Listener failure for " + ((C9579h40) this.f17280f).f28216c;
                    c10745qB02.getClass();
                    C10745qB0.m23946i(4, str, e);
                    try {
                        ((C10475o40) this.f17281g).m23331c(2, e);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                C6526o1 c6526o1 = (C6526o1) this.f17280f;
                AZ0 az0 = (AZ0) this.f17281g;
                c6526o1.getClass();
                TO0 to0 = new TO0();
                C9579h40 c9579h402 = (C9579h40) c6526o1.f38686c;
                synchronized (c9579h402.f28236w) {
                    synchronized (c9579h402) {
                        try {
                            AZ0 az02 = c9579h402.f28230q;
                            AZ0 az03 = new AZ0();
                            az03.m231b(az02);
                            az03.m231b(az0);
                            to0.f11337a = az03;
                            jM230a = az03.m230a() - az02.m230a();
                            c10475o40Arr = (jM230a == 0 || c9579h402.f28215b.isEmpty()) ? null : (C10475o40[]) c9579h402.f28215b.values().toArray(new C10475o40[0]);
                            AZ0 az04 = (AZ0) to0.f11337a;
                            O90.m5968f(az04, "<set-?>");
                            c9579h402.f28230q = az04;
                            c9579h402.f28223j.m9679c(new C8934c40(i, c9579h402, to0, c9579h402.f28216c + " onSettings"), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        c9579h402.f28236w.m23597a((AZ0) to0.f11337a);
                    } catch (IOException e2) {
                        c9579h402.m18713a(2, 2, e2);
                    }
                }
                if (c10475o40Arr == null) {
                    return -1L;
                }
                int length = c10475o40Arr.length;
                while (i < length) {
                    C10475o40 c10475o40 = c10475o40Arr[i];
                    synchronized (c10475o40) {
                        c10475o40.f38761f += jM230a;
                        if (jM230a > 0) {
                            c10475o40.notifyAll();
                        }
                    }
                    i++;
                }
                return -1L;
        }
    }
}

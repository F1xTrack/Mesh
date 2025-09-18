package defpackage;

import android.os.Bundle;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class PT implements InterfaceC0131Bl {
    public final /* synthetic */ int a;
    public long b;
    public Object c;
    public Object d;
    public final Object e;

    public PT(long j, Bundle bundle, String str, String str2) {
        this.a = 5;
        this.c = str;
        this.d = str2;
        this.e = bundle;
        this.b = j;
    }

    public static PT d(C8316zB1 c8316zB1) {
        String str = c8316zB1.a;
        return new PT(c8316zB1.d, c8316zB1.b.m0(), str, c8316zB1.c);
    }

    @Override // defpackage.InterfaceC0131Bl
    public void Z(InterfaceC7089sl interfaceC7089sl, HS0 hs0) {
        FirebasePerfOkHttpClient.a(hs0, (C2030Zu0) this.d, this.b, ((C0646Ia1) this.e).a());
        ((InterfaceC0131Bl) this.c).Z(interfaceC7089sl, hs0);
    }

    public boolean a(C6575q3 c6575q3, DN0 dn0, List list, boolean z) {
        O90.f(dn0, "call");
        Iterator it = ((ConcurrentLinkedQueue) this.e).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            FN0 fn0 = (FN0) it.next();
            O90.e(fn0, "connection");
            synchronized (fn0) {
                if (z) {
                    if (!(fn0.g != null)) {
                        continue;
                    }
                }
                if (fn0.i(c6575q3, list)) {
                    dn0.b(fn0);
                    return true;
                }
            }
        }
    }

    public int b(FN0 fn0, long j) {
        byte[] bArr = AbstractC0199Ch1.a;
        ArrayList arrayList = fn0.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + fn0.b.a.i + " was leaked. Did you forget to close a response body?";
                C6601qB0 c6601qB0 = C6601qB0.a;
                C6601qB0.a.k(((BN0) reference).a, str);
                arrayList.remove(i);
                fn0.j = true;
                if (arrayList.isEmpty()) {
                    fn0.q = j - this.b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public void c(int i) {
        if ((i & 1) != 0) {
            ((ArrayList) this.c).clear();
        }
        if ((i & 2) != 0) {
            ((ArrayList) this.d).clear();
        }
        if ((i & 4) != 0) {
            ((ArrayList) this.e).clear();
        }
    }

    public C8316zB1 e() {
        return new C8316zB1((String) this.c, new C6029nB1(new Bundle((Bundle) this.e)), (String) this.d, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.KK1 f(java.lang.String r19, defpackage.KK1 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.PT.f(java.lang.String, KK1):KK1");
    }

    public String toString() {
        switch (this.a) {
            case 5:
                String strValueOf = String.valueOf((Bundle) this.e);
                StringBuilder sb = new StringBuilder("origin=");
                sb.append((String) this.d);
                sb.append(",name=");
                return AbstractC7209tN0.z(sb, (String) this.c, ",params=", strValueOf);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC0131Bl
    public void w0(InterfaceC7089sl interfaceC7089sl, IOException iOException) {
        C6649qR0 c6649qR0 = ((DN0) interfaceC7089sl).b;
        C2030Zu0 c2030Zu0 = (C2030Zu0) this.d;
        if (c6649qR0 != null) {
            D40 d40 = c6649qR0.a;
            if (d40 != null) {
                c2030Zu0.k(d40.i().toString());
            }
            String str = c6649qR0.b;
            if (str != null) {
                c2030Zu0.d(str);
            }
        }
        c2030Zu0.g(this.b);
        AbstractC1705Vq.o((C0646Ia1) this.e, c2030Zu0, c2030Zu0);
        ((InterfaceC0131Bl) this.c).w0(interfaceC7089sl, iOException);
    }

    public PT(C2272b91 c2272b91, TimeUnit timeUnit) {
        this.a = 4;
        O90.f(c2272b91, "taskRunner");
        this.b = timeUnit.toNanos(5L);
        this.c = c2272b91.e();
        this.d = new C6436pK(this, AbstractC1705Vq.l(new StringBuilder(), AbstractC0199Ch1.g, " ConnectionPool"), 2);
        this.e = new ConcurrentLinkedQueue();
    }

    public PT(InterfaceC0131Bl interfaceC0131Bl, C1977Zc1 c1977Zc1, C0646Ia1 c0646Ia1, long j) {
        this.a = 3;
        this.c = interfaceC0131Bl;
        this.d = new C2030Zu0(c1977Zc1);
        this.b = j;
        this.e = c0646Ia1;
    }

    public PT(C6959s32 c6959s32) {
        this.a = 6;
        this.e = c6959s32;
    }

    public PT(PT pt, byte b) {
        this.a = 2;
        this.c = Collections.unmodifiableList((ArrayList) pt.c);
        this.d = Collections.unmodifiableList((ArrayList) pt.d);
        this.e = Collections.unmodifiableList((ArrayList) pt.e);
        this.b = pt.b;
    }

    public PT(C1007Mr0 c1007Mr0) {
        this.a = 1;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.d = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.e = arrayList3;
        this.b = 5000L;
        AbstractC3377dM1.d("Point cannot be null.", c1007Mr0 != null);
        arrayList.add(c1007Mr0);
        arrayList2.add(c1007Mr0);
        arrayList3.add(c1007Mr0);
    }

    public PT(PT pt) {
        this.a = 1;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.d = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.e = arrayList3;
        this.b = 5000L;
        arrayList.addAll((List) pt.c);
        arrayList2.addAll((List) pt.d);
        arrayList3.addAll((List) pt.e);
        this.b = pt.b;
    }

    public PT(String str, String str2, WT wt) {
        this.a = 0;
        this.c = str;
        this.d = str2;
        this.e = wt;
        this.b = -1L;
    }
}

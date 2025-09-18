package p000;

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

/* renamed from: PT */
/* loaded from: classes2.dex */
public final class C0974PT implements InterfaceC0111Bl {

    /* renamed from: a */
    public final /* synthetic */ int f9077a;

    /* renamed from: b */
    public long f9078b;

    /* renamed from: c */
    public Object f9079c;

    /* renamed from: d */
    public Object f9080d;

    /* renamed from: e */
    public final Object f9081e;

    public C0974PT(long j, Bundle bundle, String str, String str2) {
        this.f9077a = 5;
        this.f9079c = str;
        this.f9080d = str2;
        this.f9081e = bundle;
        this.f9078b = j;
    }

    /* renamed from: d */
    public static C0974PT m6367d(C11894zB1 c11894zB1) {
        String str = c11894zB1.f46717a;
        return new C0974PT(c11894zB1.f46720d, c11894zB1.f46718b.m23098m0(), str, c11894zB1.f46719c);
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: Z */
    public void mo851Z(InterfaceC6843sl interfaceC6843sl, HS0 hs0) {
        FirebasePerfOkHttpClient.m11337a(hs0, (C8654Zu0) this.f9080d, this.f9078b, ((C7731Ia1) this.f9081e).m3946a());
        ((InterfaceC0111Bl) this.f9079c).mo851Z(interfaceC6843sl, hs0);
    }

    /* renamed from: a */
    public boolean m6368a(C6656q3 c6656q3, DN0 dn0, List list, boolean z) {
        O90.m5968f(dn0, "call");
        Iterator it = ((ConcurrentLinkedQueue) this.f9081e).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            FN0 fn0 = (FN0) it.next();
            O90.m5967e(fn0, "connection");
            synchronized (fn0) {
                if (z) {
                    if (!(fn0.f3179g != null)) {
                        continue;
                    }
                }
                if (fn0.m2613i(c6656q3, list)) {
                    dn0.m1666b(fn0);
                    return true;
                }
            }
        }
    }

    /* renamed from: b */
    public int m6369b(FN0 fn0, long j) {
        byte[] bArr = AbstractC7433Ch1.f1577a;
        ArrayList arrayList = fn0.f3188p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + fn0.f3174b.f8454a.f40537i + " was leaked. Did you forget to close a response body?";
                C10745qB0 c10745qB0 = C10745qB0.f40658a;
                C10745qB0.f40658a.mo23951k(((BN0) reference).f774a, str);
                arrayList.remove(i);
                fn0.f3182j = true;
                if (arrayList.isEmpty()) {
                    fn0.f3189q = j - this.f9078b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* renamed from: c */
    public void m6370c(int i) {
        if ((i & 1) != 0) {
            ((ArrayList) this.f9079c).clear();
        }
        if ((i & 2) != 0) {
            ((ArrayList) this.f9080d).clear();
        }
        if ((i & 4) != 0) {
            ((ArrayList) this.f9081e).clear();
        }
    }

    /* renamed from: e */
    public C11894zB1 m6371e() {
        return new C11894zB1((String) this.f9079c, new C10362nB1(new Bundle((Bundle) this.f9081e)), (String) this.f9080d, this.f9078b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01b7  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.KK1 m6372f(java.lang.String r19, p000.KK1 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0974PT.m6372f(java.lang.String, KK1):KK1");
    }

    public String toString() {
        switch (this.f9077a) {
            case 5:
                String strValueOf = String.valueOf((Bundle) this.f9081e);
                StringBuilder sb = new StringBuilder("origin=");
                sb.append((String) this.f9080d);
                sb.append(",name=");
                return AbstractC11153tN0.m24914z(sb, (String) this.f9079c, ",params=", strValueOf);
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: w0 */
    public void mo852w0(InterfaceC6843sl interfaceC6843sl, IOException iOException) {
        C10777qR0 c10777qR0 = ((DN0) interfaceC6843sl).f1981b;
        C8654Zu0 c8654Zu0 = (C8654Zu0) this.f9080d;
        if (c10777qR0 != null) {
            D40 d40 = c10777qR0.f40870a;
            if (d40 != null) {
                c8654Zu0.m9636k(d40.m1536i().toString());
            }
            String str = c10777qR0.f40871b;
            if (str != null) {
                c8654Zu0.m9629d(str);
            }
        }
        c8654Zu0.m9632g(this.f9078b);
        AbstractC1374Vq.m8596o((C7731Ia1) this.f9081e, c8654Zu0, c8654Zu0);
        ((InterfaceC0111Bl) this.f9079c).mo852w0(interfaceC6843sl, iOException);
    }

    public C0974PT(C8817b91 c8817b91, TimeUnit timeUnit) {
        this.f9077a = 4;
        O90.m5968f(c8817b91, "taskRunner");
        this.f9078b = timeUnit.toNanos(5L);
        this.f9079c = c8817b91.m10429e();
        this.f9080d = new C6610pK(this, AbstractC1374Vq.m8593l(new StringBuilder(), AbstractC7433Ch1.f1583g, " ConnectionPool"), 2);
        this.f9081e = new ConcurrentLinkedQueue();
    }

    public C0974PT(InterfaceC0111Bl interfaceC0111Bl, C8619Zc1 c8619Zc1, C7731Ia1 c7731Ia1, long j) {
        this.f9077a = 3;
        this.f9079c = interfaceC0111Bl;
        this.f9080d = new C8654Zu0(c8619Zc1);
        this.f9078b = j;
        this.f9081e = c7731Ia1;
    }

    public C0974PT(C10986s32 c10986s32) {
        this.f9077a = 6;
        this.f9081e = c10986s32;
    }

    public C0974PT(C0974PT c0974pt, byte b) {
        this.f9077a = 2;
        this.f9079c = Collections.unmodifiableList((ArrayList) c0974pt.f9079c);
        this.f9080d = Collections.unmodifiableList((ArrayList) c0974pt.f9080d);
        this.f9081e = Collections.unmodifiableList((ArrayList) c0974pt.f9081e);
        this.f9078b = c0974pt.f9078b;
    }

    public C0974PT(C7972Mr0 c7972Mr0) {
        this.f9077a = 1;
        ArrayList arrayList = new ArrayList();
        this.f9079c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f9080d = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f9081e = arrayList3;
        this.f9078b = 5000L;
        AbstractC9104dM1.m17545d("Point cannot be null.", c7972Mr0 != null);
        arrayList.add(c7972Mr0);
        arrayList2.add(c7972Mr0);
        arrayList3.add(c7972Mr0);
    }

    public C0974PT(C0974PT c0974pt) {
        this.f9077a = 1;
        ArrayList arrayList = new ArrayList();
        this.f9079c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f9080d = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f9081e = arrayList3;
        this.f9078b = 5000L;
        arrayList.addAll((List) c0974pt.f9079c);
        arrayList2.addAll((List) c0974pt.f9080d);
        arrayList3.addAll((List) c0974pt.f9081e);
        this.f9078b = c0974pt.f9078b;
    }

    public C0974PT(String str, String str2, C1414WT c1414wt) {
        this.f9077a = 0;
        this.f9079c = str;
        this.f9080d = str2;
        this.f9081e = c1414wt;
        this.f9078b = -1L;
    }
}

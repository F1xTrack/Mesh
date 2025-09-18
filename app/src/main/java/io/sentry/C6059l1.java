package io.sentry;

import android.app.job.JobParameters;
import com.yandex.metrica.C2460e;
import com.yandex.metrica.ConfigurationJobService;
import com.yandex.metrica.impl.p022ob.InterfaceC2823O6;
import io.sentry.clientreport.C5998b;
import io.sentry.clientreport.C5999c;
import io.sentry.clientreport.C6001e;
import io.sentry.clientreport.EnumC6000d;
import io.sentry.clientreport.InterfaceC6002f;
import io.sentry.config.AbstractC6003a;
import io.sentry.internal.debugmeta.C6042c;
import io.sentry.protocol.C6078A;
import io.sentry.protocol.C6105u;
import io.sentry.util.C6170c;
import io.sentry.vendor.gson.stream.C6186c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.sentry.l1 */
/* loaded from: classes2.dex */
public final class C6059l1 implements InterfaceC2823O6, InterfaceC5749A0, InterfaceC6002f {

    /* renamed from: c */
    public static volatile C6059l1 f34225c;

    /* renamed from: a */
    public Object f34226a;

    /* renamed from: b */
    public final Object f34227b;

    public /* synthetic */ C6059l1(Object obj, Object obj2) {
        this.f34227b = obj;
        this.f34226a = obj2;
    }

    /* renamed from: p */
    public static EnumC6051j m21829p(EnumC6062m1 enumC6062m1) {
        return EnumC6062m1.Event.equals(enumC6062m1) ? EnumC6051j.Error : EnumC6062m1.Session.equals(enumC6062m1) ? EnumC6051j.Session : EnumC6062m1.Transaction.equals(enumC6062m1) ? EnumC6051j.Transaction : EnumC6062m1.UserFeedback.equals(enumC6062m1) ? EnumC6051j.UserReport : EnumC6062m1.Profile.equals(enumC6062m1) ? EnumC6051j.Profile : EnumC6062m1.Statsd.equals(enumC6062m1) ? EnumC6051j.MetricBucket : EnumC6062m1.Attachment.equals(enumC6062m1) ? EnumC6051j.Attachment : EnumC6062m1.CheckIn.equals(enumC6062m1) ? EnumC6051j.Monitor : EnumC6062m1.ReplayVideo.equals(enumC6062m1) ? EnumC6051j.Replay : EnumC6051j.Default;
    }

    /* renamed from: v */
    public static C6059l1 m21830v() {
        if (f34225c == null) {
            synchronized (C6059l1.class) {
                try {
                    if (f34225c == null) {
                        f34225c = new C6059l1();
                    }
                } finally {
                }
            }
        }
        return f34225c;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2823O6
    /* renamed from: a */
    public void mo14694a() {
        try {
            ((ConfigurationJobService) this.f34227b).jobFinished((JobParameters) this.f34226a, false);
        } catch (Throwable unused) {
        }
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: b */
    public InterfaceC5749A0 mo13809b(long j) throws IOException {
        C6186c c6186c = (C6186c) this.f34226a;
        c6186c.m21919A();
        c6186c.m21920m();
        c6186c.f34697a.write(Long.toString(j));
        return this;
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: c */
    public InterfaceC5749A0 mo13810c(double d) throws IOException {
        C6186c c6186c = (C6186c) this.f34226a;
        c6186c.m21919A();
        if (c6186c.f34702f || !(Double.isNaN(d) || Double.isInfinite(d))) {
            c6186c.m21920m();
            c6186c.f34697a.append((CharSequence) Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: d */
    public InterfaceC5749A0 mo13811d(String str) throws IOException {
        C6186c c6186c = (C6186c) this.f34226a;
        if (str == null) {
            c6186c.m21923p();
        } else {
            c6186c.m21919A();
            c6186c.m21920m();
            c6186c.m21925x(str);
        }
        return this;
    }

    @Override // io.sentry.clientreport.InterfaceC6002f
    /* renamed from: e */
    public void mo21728e(EnumC6000d enumC6000d, C6042c c6042c) {
        if (c6042c == null) {
            return;
        }
        try {
            Iterator it = ((Collection) c6042c.f34199c).iterator();
            while (it.hasNext()) {
                mo21730i(enumC6000d, (C6022g1) it.next());
            }
        } catch (Throwable th) {
            ((C5759D1) this.f34227b).getLogger().mo21405c(EnumC6069n1.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: f */
    public void mo13813f(boolean z) {
        ((C6186c) this.f34226a).f34702f = z;
    }

    @Override // io.sentry.clientreport.InterfaceC6002f
    /* renamed from: g */
    public void mo21729g(EnumC6000d enumC6000d, EnumC6051j enumC6051j, long j) {
        try {
            m21836y(enumC6000d.getReason(), enumC6051j.getCategory(), Long.valueOf(j));
        } catch (Throwable th) {
            ((C5759D1) this.f34227b).getLogger().mo21405c(EnumC6069n1.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: h */
    public InterfaceC5749A0 mo13815h(boolean z) throws IOException {
        C6186c c6186c = (C6186c) this.f34226a;
        c6186c.m21919A();
        c6186c.m21920m();
        c6186c.f34697a.write(z ? "true" : "false");
        return this;
    }

    @Override // io.sentry.clientreport.InterfaceC6002f
    /* renamed from: i */
    public void mo21730i(EnumC6000d enumC6000d, C6022g1 c6022g1) {
        C6078A c6078aM21785f;
        C5759D1 c5759d1 = (C5759D1) this.f34227b;
        if (c6022g1 == null) {
            return;
        }
        try {
            EnumC6062m1 enumC6062m1 = c6022g1.f34164a.f34175c;
            if (EnumC6062m1.ClientReport.equals(enumC6062m1)) {
                try {
                    m21837z(c6022g1.m21782c(c5759d1.getSerializer()));
                } catch (Exception unused) {
                    c5759d1.getLogger().mo21407k(EnumC6069n1.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                }
            } else {
                EnumC6051j enumC6051jM21829p = m21829p(enumC6062m1);
                if (enumC6051jM21829p.equals(EnumC6051j.Transaction) && (c6078aM21785f = c6022g1.m21785f(c5759d1.getSerializer())) != null) {
                    m21836y(enumC6000d.getReason(), EnumC6051j.Span.getCategory(), Long.valueOf(c6078aM21785f.f34280s.size() + 1));
                }
                m21836y(enumC6000d.getReason(), enumC6051jM21829p.getCategory(), 1L);
            }
        } catch (Throwable th) {
            c5759d1.getLogger().mo21405c(EnumC6069n1.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: j */
    public InterfaceC5749A0 mo13817j() throws IOException {
        ((C6186c) this.f34226a).m21921n(3, 5, '}');
        return this;
    }

    @Override // io.sentry.clientreport.InterfaceC6002f
    /* renamed from: k */
    public C6042c mo21731k(C6042c c6042c) {
        C5759D1 c5759d1 = (C5759D1) this.f34227b;
        Date dateM21752k = AbstractC6003a.m21752k();
        C2460e c2460e = (C2460e) this.f34226a;
        c2460e.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) ((C6170c) c2460e.f20786a).m21880a()).entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new C6001e(((C5999c) entry.getKey()).f34116a, ((C5999c) entry.getKey()).f34117b, lValueOf));
            }
        }
        C5998b c5998b = arrayList.isEmpty() ? null : new C5998b(dateM21752k, arrayList);
        if (c5998b == null) {
            return c6042c;
        }
        try {
            c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Collection) c6042c.f34199c).iterator();
            while (it.hasNext()) {
                arrayList2.add((C6022g1) it.next());
            }
            arrayList2.add(C6022g1.m21779a(c5759d1.getSerializer(), c5998b));
            return new C6042c((C5987c1) c6042c.f34198b, arrayList2);
        } catch (Throwable th) {
            c5759d1.getLogger().mo21405c(EnumC6069n1.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return c6042c;
        }
    }

    /* renamed from: l */
    public void m21831l(String str) {
        AbstractC6003a.m21735D(str, "integration is required.");
        ((CopyOnWriteArraySet) this.f34226a).add(str);
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: m */
    public InterfaceC5749A0 mo13820m(Number number) throws IOException {
        C6186c c6186c = (C6186c) this.f34226a;
        if (number == null) {
            c6186c.m21923p();
        } else {
            c6186c.m21919A();
            String string = number.toString();
            if (!c6186c.f34702f && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
                throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
            }
            c6186c.m21920m();
            c6186c.f34697a.append((CharSequence) string);
        }
        return this;
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: n */
    public InterfaceC5749A0 mo13821n() throws IOException {
        C6186c c6186c = (C6186c) this.f34226a;
        c6186c.m21919A();
        c6186c.m21920m();
        c6186c.f34697a.append((CharSequence) "\n");
        return this;
    }

    /* renamed from: o */
    public void m21832o(String str, String str2) {
        AbstractC6003a.m21735D(str, "name is required.");
        AbstractC6003a.m21735D(str2, "version is required.");
        ((CopyOnWriteArraySet) this.f34227b).add(new C6105u(str, str2));
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: q */
    public InterfaceC5749A0 mo13824q() throws IOException {
        C6186c c6186c = (C6186c) this.f34226a;
        c6186c.m21919A();
        c6186c.m21920m();
        int i = c6186c.f34699c;
        int[] iArr = c6186c.f34698b;
        if (i == iArr.length) {
            c6186c.f34698b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = c6186c.f34698b;
        int i2 = c6186c.f34699c;
        c6186c.f34699c = i2 + 1;
        iArr2[i2] = 3;
        c6186c.f34697a.write(123);
        return this;
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: r */
    public InterfaceC5749A0 mo13825r(ILogger iLogger, Object obj) {
        ((C2460e) this.f34227b).m13832z(this, iLogger, obj);
        return this;
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: s */
    public InterfaceC5749A0 mo13826s(Boolean bool) throws IOException {
        C6186c c6186c = (C6186c) this.f34226a;
        if (bool == null) {
            c6186c.m21923p();
        } else {
            c6186c.m21919A();
            c6186c.m21920m();
            c6186c.f34697a.write(bool.booleanValue() ? "true" : "false");
        }
        return this;
    }

    /* renamed from: t */
    public byte[] m21833t() {
        Callable callable;
        if (((byte[]) this.f34226a) == null && (callable = (Callable) this.f34227b) != null) {
            this.f34226a = (byte[]) callable.call();
        }
        byte[] bArr = (byte[]) this.f34226a;
        return bArr != null ? bArr : new byte[0];
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: u */
    public InterfaceC5749A0 mo13828u(String str) {
        C6186c c6186c = (C6186c) this.f34226a;
        if (str == null) {
            c6186c.getClass();
            throw new NullPointerException("name == null");
        }
        if (c6186c.f34703g != null) {
            throw new IllegalStateException();
        }
        if (c6186c.f34699c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        c6186c.f34703g = str;
        return this;
    }

    /* renamed from: w */
    public InterfaceC5749A0 m21834w() throws IOException {
        ((C6186c) this.f34226a).m21923p();
        return this;
    }

    /* renamed from: x */
    public C5812V1 m21835x() {
        return (C5812V1) ((LinkedBlockingDeque) this.f34226a).peek();
    }

    /* renamed from: y */
    public void m21836y(String str, String str2, Long l) {
        AtomicLong atomicLong = (AtomicLong) ((Map) ((C6170c) ((C2460e) this.f34226a).f20786a).m21880a()).get(new C5999c(str, str2));
        if (atomicLong != null) {
            atomicLong.addAndGet(l.longValue());
        }
    }

    /* renamed from: z */
    public void m21837z(C5998b c5998b) {
        if (c5998b == null) {
            return;
        }
        Iterator it = c5998b.f34114b.iterator();
        while (it.hasNext()) {
            C6001e c6001e = (C6001e) it.next();
            m21836y(c6001e.f34118a, c6001e.f34119b, c6001e.f34120c);
        }
    }

    public C6059l1(Writer writer, int i) {
        this.f34226a = new C6186c(writer);
        this.f34227b = new C2460e(i);
    }

    @Override // io.sentry.clientreport.InterfaceC6002f
    /* renamed from: a */
    public void mo21727a(EnumC6000d enumC6000d, EnumC6051j enumC6051j) {
        mo21729g(enumC6000d, enumC6051j, 1L);
    }

    public C6059l1(C5759D1 c5759d1) {
        this.f34227b = c5759d1;
        this.f34226a = new C2460e(8, false);
    }

    public C6059l1() {
        this.f34226a = new CopyOnWriteArraySet();
        this.f34227b = new CopyOnWriteArraySet();
    }

    public C6059l1(ILogger iLogger, C5812V1 c5812v1) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.f34226a = linkedBlockingDeque;
        AbstractC6003a.m21735D(iLogger, "logger is required");
        this.f34227b = iLogger;
        linkedBlockingDeque.push(c5812v1);
    }

    public C6059l1(Callable callable) {
        this.f34227b = callable;
    }
}

package io.sentry;

import android.app.job.JobParameters;
import com.yandex.metrica.ConfigurationJobService;
import com.yandex.metrica.impl.ob.O6;
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
public final class C5142l1 implements O6, A0, io.sentry.clientreport.f {
    public static volatile C5142l1 c;
    public Object a;
    public final Object b;

    public /* synthetic */ C5142l1(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public static EnumC5134j p(EnumC5145m1 enumC5145m1) {
        return EnumC5145m1.Event.equals(enumC5145m1) ? EnumC5134j.Error : EnumC5145m1.Session.equals(enumC5145m1) ? EnumC5134j.Session : EnumC5145m1.Transaction.equals(enumC5145m1) ? EnumC5134j.Transaction : EnumC5145m1.UserFeedback.equals(enumC5145m1) ? EnumC5134j.UserReport : EnumC5145m1.Profile.equals(enumC5145m1) ? EnumC5134j.Profile : EnumC5145m1.Statsd.equals(enumC5145m1) ? EnumC5134j.MetricBucket : EnumC5145m1.Attachment.equals(enumC5145m1) ? EnumC5134j.Attachment : EnumC5145m1.CheckIn.equals(enumC5145m1) ? EnumC5134j.Monitor : EnumC5145m1.ReplayVideo.equals(enumC5145m1) ? EnumC5134j.Replay : EnumC5134j.Default;
    }

    public static C5142l1 v() {
        if (c == null) {
            synchronized (C5142l1.class) {
                try {
                    if (c == null) {
                        c = new C5142l1();
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // com.yandex.metrica.impl.ob.O6
    public void a() {
        try {
            ((ConfigurationJobService) this.b).jobFinished((JobParameters) this.a, false);
        } catch (Throwable unused) {
        }
    }

    @Override // io.sentry.A0
    public A0 b(long j) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.a;
        cVar.A();
        cVar.m();
        cVar.a.write(Long.toString(j));
        return this;
    }

    @Override // io.sentry.A0
    public A0 c(double d) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.a;
        cVar.A();
        if (cVar.f || !(Double.isNaN(d) || Double.isInfinite(d))) {
            cVar.m();
            cVar.a.append((CharSequence) Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }

    @Override // io.sentry.A0
    public A0 d(String str) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.a;
        if (str == null) {
            cVar.p();
        } else {
            cVar.A();
            cVar.m();
            cVar.x(str);
        }
        return this;
    }

    @Override // io.sentry.clientreport.f
    public void e(io.sentry.clientreport.d dVar, io.sentry.internal.debugmeta.c cVar) {
        if (cVar == null) {
            return;
        }
        try {
            Iterator it = ((Collection) cVar.c).iterator();
            while (it.hasNext()) {
                i(dVar, (C5127g1) it.next());
            }
        } catch (Throwable th) {
            ((D1) this.b).getLogger().c(EnumC5148n1.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.A0
    public void f(boolean z) {
        ((io.sentry.vendor.gson.stream.c) this.a).f = z;
    }

    @Override // io.sentry.clientreport.f
    public void g(io.sentry.clientreport.d dVar, EnumC5134j enumC5134j, long j) {
        try {
            y(dVar.getReason(), enumC5134j.getCategory(), Long.valueOf(j));
        } catch (Throwable th) {
            ((D1) this.b).getLogger().c(EnumC5148n1.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.A0
    public A0 h(boolean z) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.a;
        cVar.A();
        cVar.m();
        cVar.a.write(z ? "true" : "false");
        return this;
    }

    @Override // io.sentry.clientreport.f
    public void i(io.sentry.clientreport.d dVar, C5127g1 c5127g1) {
        io.sentry.protocol.A aF;
        D1 d1 = (D1) this.b;
        if (c5127g1 == null) {
            return;
        }
        try {
            EnumC5145m1 enumC5145m1 = c5127g1.a.c;
            if (EnumC5145m1.ClientReport.equals(enumC5145m1)) {
                try {
                    z(c5127g1.c(d1.getSerializer()));
                } catch (Exception unused) {
                    d1.getLogger().k(EnumC5148n1.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                }
            } else {
                EnumC5134j enumC5134jP = p(enumC5145m1);
                if (enumC5134jP.equals(EnumC5134j.Transaction) && (aF = c5127g1.f(d1.getSerializer())) != null) {
                    y(dVar.getReason(), EnumC5134j.Span.getCategory(), Long.valueOf(aF.s.size() + 1));
                }
                y(dVar.getReason(), enumC5134jP.getCategory(), 1L);
            }
        } catch (Throwable th) {
            d1.getLogger().c(EnumC5148n1.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.A0
    public A0 j() throws IOException {
        ((io.sentry.vendor.gson.stream.c) this.a).n(3, 5, '}');
        return this;
    }

    @Override // io.sentry.clientreport.f
    public io.sentry.internal.debugmeta.c k(io.sentry.internal.debugmeta.c cVar) {
        D1 d1 = (D1) this.b;
        Date dateK = io.sentry.config.a.k();
        com.yandex.metrica.e eVar = (com.yandex.metrica.e) this.a;
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) ((io.sentry.util.c) eVar.a).a()).entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new io.sentry.clientreport.e(((io.sentry.clientreport.c) entry.getKey()).a, ((io.sentry.clientreport.c) entry.getKey()).b, lValueOf));
            }
        }
        io.sentry.clientreport.b bVar = arrayList.isEmpty() ? null : new io.sentry.clientreport.b(dateK, arrayList);
        if (bVar == null) {
            return cVar;
        }
        try {
            d1.getLogger().k(EnumC5148n1.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Collection) cVar.c).iterator();
            while (it.hasNext()) {
                arrayList2.add((C5127g1) it.next());
            }
            arrayList2.add(C5127g1.a(d1.getSerializer(), bVar));
            return new io.sentry.internal.debugmeta.c((C5115c1) cVar.b, arrayList2);
        } catch (Throwable th) {
            d1.getLogger().c(EnumC5148n1.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return cVar;
        }
    }

    public void l(String str) {
        io.sentry.config.a.D(str, "integration is required.");
        ((CopyOnWriteArraySet) this.a).add(str);
    }

    @Override // io.sentry.A0
    public A0 m(Number number) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.a;
        if (number == null) {
            cVar.p();
        } else {
            cVar.A();
            String string = number.toString();
            if (!cVar.f && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
                throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
            }
            cVar.m();
            cVar.a.append((CharSequence) string);
        }
        return this;
    }

    @Override // io.sentry.A0
    public A0 n() throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.a;
        cVar.A();
        cVar.m();
        cVar.a.append((CharSequence) "\n");
        return this;
    }

    public void o(String str, String str2) {
        io.sentry.config.a.D(str, "name is required.");
        io.sentry.config.a.D(str2, "version is required.");
        ((CopyOnWriteArraySet) this.b).add(new io.sentry.protocol.u(str, str2));
    }

    @Override // io.sentry.A0
    public A0 q() throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.a;
        cVar.A();
        cVar.m();
        int i = cVar.c;
        int[] iArr = cVar.b;
        if (i == iArr.length) {
            cVar.b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = cVar.b;
        int i2 = cVar.c;
        cVar.c = i2 + 1;
        iArr2[i2] = 3;
        cVar.a.write(123);
        return this;
    }

    @Override // io.sentry.A0
    public A0 r(ILogger iLogger, Object obj) {
        ((com.yandex.metrica.e) this.b).z(this, iLogger, obj);
        return this;
    }

    @Override // io.sentry.A0
    public A0 s(Boolean bool) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.a;
        if (bool == null) {
            cVar.p();
        } else {
            cVar.A();
            cVar.m();
            cVar.a.write(bool.booleanValue() ? "true" : "false");
        }
        return this;
    }

    public byte[] t() {
        Callable callable;
        if (((byte[]) this.a) == null && (callable = (Callable) this.b) != null) {
            this.a = (byte[]) callable.call();
        }
        byte[] bArr = (byte[]) this.a;
        return bArr != null ? bArr : new byte[0];
    }

    @Override // io.sentry.A0
    public A0 u(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.a;
        if (str == null) {
            cVar.getClass();
            throw new NullPointerException("name == null");
        }
        if (cVar.g != null) {
            throw new IllegalStateException();
        }
        if (cVar.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        cVar.g = str;
        return this;
    }

    public A0 w() throws IOException {
        ((io.sentry.vendor.gson.stream.c) this.a).p();
        return this;
    }

    public V1 x() {
        return (V1) ((LinkedBlockingDeque) this.a).peek();
    }

    public void y(String str, String str2, Long l) {
        AtomicLong atomicLong = (AtomicLong) ((Map) ((io.sentry.util.c) ((com.yandex.metrica.e) this.a).a).a()).get(new io.sentry.clientreport.c(str, str2));
        if (atomicLong != null) {
            atomicLong.addAndGet(l.longValue());
        }
    }

    public void z(io.sentry.clientreport.b bVar) {
        if (bVar == null) {
            return;
        }
        Iterator it = bVar.b.iterator();
        while (it.hasNext()) {
            io.sentry.clientreport.e eVar = (io.sentry.clientreport.e) it.next();
            y(eVar.a, eVar.b, eVar.c);
        }
    }

    public C5142l1(Writer writer, int i) {
        this.a = new io.sentry.vendor.gson.stream.c(writer);
        this.b = new com.yandex.metrica.e(i);
    }

    @Override // io.sentry.clientreport.f
    public void a(io.sentry.clientreport.d dVar, EnumC5134j enumC5134j) {
        g(dVar, enumC5134j, 1L);
    }

    public C5142l1(D1 d1) {
        this.b = d1;
        this.a = new com.yandex.metrica.e(8, false);
    }

    public C5142l1() {
        this.a = new CopyOnWriteArraySet();
        this.b = new CopyOnWriteArraySet();
    }

    public C5142l1(ILogger iLogger, V1 v1) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.a = linkedBlockingDeque;
        io.sentry.config.a.D(iLogger, "logger is required");
        this.b = iLogger;
        linkedBlockingDeque.push(v1);
    }

    public C5142l1(Callable callable) {
        this.b = callable;
    }
}

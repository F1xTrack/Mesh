package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import p000.AbstractC1374Vq;
import p000.AbstractC1392W7;
import p000.AbstractC7222ym;
import p000.C0751Lw;
import p000.C10641pN0;
import p000.C10857r31;
import p000.C1320Uz;
import p000.C1329V7;
import p000.C6989v4;
import p000.C7564Ev0;
import p000.C7731Ia1;
import p000.C8619Zc1;
import p000.GA0;
import p000.InterfaceC11047sY0;
import p000.JA0;

/* loaded from: classes.dex */
public class Trace extends AbstractC1392W7 implements Parcelable, InterfaceC11047sY0 {

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;

    /* renamed from: m */
    public static final C6989v4 f18505m = C6989v4.m25319d();

    /* renamed from: a */
    public final WeakReference f18506a;

    /* renamed from: b */
    public final Trace f18507b;

    /* renamed from: c */
    public final GaugeManager f18508c;

    /* renamed from: d */
    public final String f18509d;

    /* renamed from: e */
    public final ConcurrentHashMap f18510e;

    /* renamed from: f */
    public final ConcurrentHashMap f18511f;

    /* renamed from: g */
    public final List f18512g;

    /* renamed from: h */
    public final ArrayList f18513h;

    /* renamed from: i */
    public final C8619Zc1 f18514i;

    /* renamed from: j */
    public final C7564Ev0 f18515j;

    /* renamed from: k */
    public C7731Ia1 f18516k;

    /* renamed from: l */
    public C7731Ia1 f18517l;

    static {
        new ConcurrentHashMap();
        CREATOR = new C10857r31(10);
    }

    public Trace(String str, C8619Zc1 c8619Zc1, C7564Ev0 c7564Ev0, C1329V7 c1329v7) {
        this(str, c8619Zc1, c7564Ev0, c1329v7, GaugeManager.getInstance());
    }

    @Override // p000.InterfaceC11047sY0
    /* renamed from: a */
    public final void mo9627a(JA0 ja0) {
        if (ja0 == null) {
            f18505m.m25324f();
        } else {
            if (this.f18516k == null || m11336c()) {
                return;
            }
            this.f18512g.add(ja0);
        }
    }

    /* renamed from: b */
    public final void m11335b(String str, String str2) {
        if (m11336c()) {
            Locale locale = Locale.ENGLISH;
            throw new IllegalArgumentException(AbstractC1374Vq.m8593l(new StringBuilder("Trace '"), this.f18509d, "' has been stopped"));
        }
        ConcurrentHashMap concurrentHashMap = this.f18511f;
        if (concurrentHashMap.containsKey(str) || concurrentHashMap.size() < 5) {
            GA0.m2937b(str, str2);
        } else {
            Locale locale2 = Locale.ENGLISH;
            throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
        }
    }

    /* renamed from: c */
    public final boolean m11336c() {
        return this.f18517l != null;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public final void finalize() throws Throwable {
        try {
            if ((this.f18516k != null) && !m11336c()) {
                f18505m.m25325g("Trace '%s' is started but not stopped when it is destructed!", this.f18509d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Keep
    public String getAttribute(String str) {
        return (String) this.f18511f.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f18511f);
    }

    @Keep
    public long getLongMetric(String str) {
        C1320Uz c1320Uz = str != null ? (C1320Uz) this.f18510e.get(str.trim()) : null;
        if (c1320Uz == null) {
            return 0L;
        }
        return c1320Uz.f12270b.get();
    }

    @Keep
    public void incrementMetric(String str, long j) {
        String strM2938c = GA0.m2938c(str);
        C6989v4 c6989v4 = f18505m;
        if (strM2938c != null) {
            c6989v4.m25322c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strM2938c);
            return;
        }
        boolean z = this.f18516k != null;
        String str2 = this.f18509d;
        if (!z) {
            c6989v4.m25325g("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (m11336c()) {
            c6989v4.m25325g("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.f18510e;
        C1320Uz c1320Uz = (C1320Uz) concurrentHashMap.get(strTrim);
        if (c1320Uz == null) {
            c1320Uz = new C1320Uz(strTrim);
            concurrentHashMap.put(strTrim, c1320Uz);
        }
        AtomicLong atomicLong = c1320Uz.f12270b;
        atomicLong.addAndGet(j);
        c6989v4.m25321b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(atomicLong.get()), str2);
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z = true;
        C6989v4 c6989v4 = f18505m;
        try {
            str = str.trim();
            str2 = str2.trim();
            m11335b(str, str2);
            c6989v4.m25321b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f18509d);
        } catch (Exception e) {
            c6989v4.m25322c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z = false;
        }
        if (z) {
            this.f18511f.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j) {
        String strM2938c = GA0.m2938c(str);
        C6989v4 c6989v4 = f18505m;
        if (strM2938c != null) {
            c6989v4.m25322c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strM2938c);
            return;
        }
        boolean z = this.f18516k != null;
        String str2 = this.f18509d;
        if (!z) {
            c6989v4.m25325g("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (m11336c()) {
            c6989v4.m25325g("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.f18510e;
        C1320Uz c1320Uz = (C1320Uz) concurrentHashMap.get(strTrim);
        if (c1320Uz == null) {
            c1320Uz = new C1320Uz(strTrim);
            concurrentHashMap.put(strTrim, c1320Uz);
        }
        c1320Uz.f12270b.set(j);
        c6989v4.m25321b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), str2);
    }

    @Keep
    public void removeAttribute(String str) {
        if (!m11336c()) {
            this.f18511f.remove(str);
            return;
        }
        C6989v4 c6989v4 = f18505m;
        if (c6989v4.f44133b) {
            c6989v4.f44132a.getClass();
        }
    }

    @Keep
    public void start() {
        String str;
        String str2 = null;
        boolean zM5156u = C0751Lw.m5135e().m5156u();
        C6989v4 c6989v4 = f18505m;
        if (!zM5156u) {
            c6989v4.m25320a();
            return;
        }
        String str3 = this.f18509d;
        if (str3 == null) {
            str2 = "Trace name must not be null";
        } else if (str3.length() > 100) {
            Locale locale = Locale.US;
            str2 = "Trace name must not exceed 100 characters";
        } else if (str3.startsWith("_")) {
            int[] iArrM26223C = AbstractC7222ym.m26223C(6);
            int length = iArrM26223C.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    switch (iArrM26223C[i]) {
                        case 1:
                            str = "_as";
                            break;
                        case 2:
                            str = "_astui";
                            break;
                        case 3:
                            str = "_astfd";
                            break;
                        case 4:
                            str = "_asti";
                            break;
                        case 5:
                            str = "_fs";
                            break;
                        case 6:
                            str = "_bs";
                            break;
                        default:
                            throw null;
                    }
                    if (!str.equals(str3)) {
                        i++;
                    }
                } else if (!str3.startsWith("_st_")) {
                    str2 = "Trace name must not start with '_'";
                }
            }
        }
        if (str2 != null) {
            c6989v4.m25322c("Cannot start trace '%s'. Trace name is invalid.(%s)", str3, str2);
            return;
        }
        if (this.f18516k != null) {
            c6989v4.m25322c("Trace '%s' has already started, should not start again!", str3);
            return;
        }
        this.f18515j.getClass();
        this.f18516k = new C7731Ia1();
        registerForAppState();
        JA0 ja0PerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f18506a);
        mo9627a(ja0PerfSession);
        if (ja0PerfSession.f5370c) {
            this.f18508c.collectGaugeMetricOnce(ja0PerfSession.f5369b);
        }
    }

    @Keep
    public void stop() {
        boolean z = this.f18516k != null;
        String str = this.f18509d;
        C6989v4 c6989v4 = f18505m;
        if (!z) {
            c6989v4.m25322c("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (m11336c()) {
            c6989v4.m25322c("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f18506a);
        unregisterForAppState();
        this.f18515j.getClass();
        C7731Ia1 c7731Ia1 = new C7731Ia1();
        this.f18517l = c7731Ia1;
        if (this.f18507b == null) {
            ArrayList arrayList = this.f18513h;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) AbstractC7222ym.m26228e(1, arrayList);
                if (trace.f18517l == null) {
                    trace.f18517l = c7731Ia1;
                }
            }
            if (str.isEmpty()) {
                if (c6989v4.f44133b) {
                    c6989v4.f44132a.getClass();
                }
            } else {
                this.f18514i.m9557c(new C10641pN0(8, this).m23760m(), getAppState());
                if (SessionManager.getInstance().perfSession().f5370c) {
                    this.f18508c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f5369b);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f18507b, 0);
        parcel.writeString(this.f18509d);
        parcel.writeList(this.f18513h);
        parcel.writeMap(this.f18510e);
        parcel.writeParcelable(this.f18516k, 0);
        parcel.writeParcelable(this.f18517l, 0);
        synchronized (this.f18512g) {
            parcel.writeList(this.f18512g);
        }
    }

    public Trace(String str, C8619Zc1 c8619Zc1, C7564Ev0 c7564Ev0, C1329V7 c1329v7, GaugeManager gaugeManager) {
        super(c1329v7);
        this.f18506a = new WeakReference(this);
        this.f18507b = null;
        this.f18509d = str.trim();
        this.f18513h = new ArrayList();
        this.f18510e = new ConcurrentHashMap();
        this.f18511f = new ConcurrentHashMap();
        this.f18515j = c7564Ev0;
        this.f18514i = c8619Zc1;
        this.f18512g = Collections.synchronizedList(new ArrayList());
        this.f18508c = gaugeManager;
    }

    public Trace(Parcel parcel, boolean z) {
        super(z ? null : C1329V7.m8297a());
        this.f18506a = new WeakReference(this);
        this.f18507b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f18509d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f18513h = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f18510e = concurrentHashMap;
        this.f18511f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, C1320Uz.class.getClassLoader());
        this.f18516k = (C7731Ia1) parcel.readParcelable(C7731Ia1.class.getClassLoader());
        this.f18517l = (C7731Ia1) parcel.readParcelable(C7731Ia1.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.f18512g = listSynchronizedList;
        parcel.readList(listSynchronizedList, JA0.class.getClassLoader());
        if (z) {
            this.f18514i = null;
            this.f18515j = null;
            this.f18508c = null;
        } else {
            this.f18514i = C8619Zc1.f15028s;
            this.f18515j = new C7564Ev0(9);
            this.f18508c = GaugeManager.getInstance();
        }
    }
}

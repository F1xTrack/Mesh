package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class PD0 implements InterfaceC3989eQ {

    /* renamed from: b */
    public final Context f8898b;

    /* renamed from: c */
    public final C6790rv f8899c;

    /* renamed from: d */
    public final C8539Xo1 f8900d;

    /* renamed from: e */
    public final WorkDatabase f8901e;

    /* renamed from: i */
    public final List f8905i;

    /* renamed from: g */
    public final HashMap f8903g = new HashMap();

    /* renamed from: f */
    public final HashMap f8902f = new HashMap();

    /* renamed from: j */
    public final HashSet f8906j = new HashSet();

    /* renamed from: k */
    public final ArrayList f8907k = new ArrayList();

    /* renamed from: a */
    public PowerManager.WakeLock f8897a = null;

    /* renamed from: l */
    public final Object f8908l = new Object();

    /* renamed from: h */
    public final HashMap f8904h = new HashMap();

    static {
        C1210TE.m7637M("Processor");
    }

    public PD0(Context context, C6790rv c6790rv, C8539Xo1 c8539Xo1, WorkDatabase workDatabase, List list) {
        this.f8898b = context;
        this.f8899c = c6790rv;
        this.f8900d = c8539Xo1;
        this.f8901e = workDatabase;
        this.f8905i = list;
    }

    /* renamed from: d */
    public static boolean m6257d(RunnableC9290ep1 runnableC9290ep1) {
        if (runnableC9290ep1 == null) {
            C1210TE.m7634G().getClass();
            return false;
        }
        runnableC9290ep1.f26908r = true;
        runnableC9290ep1.m18058h();
        runnableC9290ep1.f26907q.cancel(true);
        if (runnableC9290ep1.f26896f == null || !(runnableC9290ep1.f26907q.f37381a instanceof C1132S)) {
            Objects.toString(runnableC9290ep1.f26895e);
            C1210TE.m7634G().getClass();
        } else {
            runnableC9290ep1.f26896f.stop();
        }
        C1210TE.m7634G().getClass();
        return true;
    }

    @Override // p000.InterfaceC3989eQ
    /* renamed from: a */
    public final void mo4902a(C7551Eo1 c7551Eo1, boolean z) {
        synchronized (this.f8908l) {
            try {
                RunnableC9290ep1 runnableC9290ep1 = (RunnableC9290ep1) this.f8903g.get(c7551Eo1.f2911a);
                if (runnableC9290ep1 != null && c7551Eo1.equals(AbstractC10084l12.m22338d(runnableC9290ep1.f26895e))) {
                    this.f8903g.remove(c7551Eo1.f2911a);
                }
                C1210TE.m7634G().getClass();
                Iterator it = this.f8907k.iterator();
                while (it.hasNext()) {
                    ((InterfaceC3989eQ) it.next()).mo4902a(c7551Eo1, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m6258b(InterfaceC3989eQ interfaceC3989eQ) {
        synchronized (this.f8908l) {
            this.f8907k.add(interfaceC3989eQ);
        }
    }

    /* renamed from: c */
    public final C8383Uo1 m6259c(String str) {
        synchronized (this.f8908l) {
            try {
                RunnableC9290ep1 runnableC9290ep1 = (RunnableC9290ep1) this.f8902f.get(str);
                if (runnableC9290ep1 == null) {
                    runnableC9290ep1 = (RunnableC9290ep1) this.f8903g.get(str);
                }
                if (runnableC9290ep1 == null) {
                    return null;
                }
                return runnableC9290ep1.f26895e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final boolean m6260e(String str) {
        boolean zContains;
        synchronized (this.f8908l) {
            zContains = this.f8906j.contains(str);
        }
        return zContains;
    }

    /* renamed from: f */
    public final boolean m6261f(String str) {
        boolean z;
        synchronized (this.f8908l) {
            try {
                z = this.f8903g.containsKey(str) || this.f8902f.containsKey(str);
            } finally {
            }
        }
        return z;
    }

    /* renamed from: g */
    public final void m6262g(InterfaceC3989eQ interfaceC3989eQ) {
        synchronized (this.f8908l) {
            this.f8907k.remove(interfaceC3989eQ);
        }
    }

    /* renamed from: h */
    public final void m6263h(C7551Eo1 c7551Eo1) {
        C8539Xo1 c8539Xo1 = this.f8900d;
        ((ExecutorC9387fa0) c8539Xo1.f13983d).execute(new MD0(this, 1, c7551Eo1));
    }

    /* renamed from: i */
    public final void m6264i(String str, C6495nX c6495nX) {
        synchronized (this.f8908l) {
            try {
                C1210TE.m7634G().getClass();
                RunnableC9290ep1 runnableC9290ep1 = (RunnableC9290ep1) this.f8903g.remove(str);
                if (runnableC9290ep1 != null) {
                    if (this.f8897a == null) {
                        PowerManager.WakeLock wakeLockM24777a = AbstractC11076sm1.m24777a(this.f8898b, "ProcessorForegroundLck");
                        this.f8897a = wakeLockM24777a;
                        wakeLockM24777a.acquire();
                    }
                    this.f8902f.put(str, runnableC9290ep1);
                    Intent intentM5549c = N71.m5549c(this.f8898b, AbstractC10084l12.m22338d(runnableC9290ep1.f26895e), c6495nX);
                    Context context = this.f8898b;
                    if (Build.VERSION.SDK_INT >= 26) {
                        AbstractC0816My.m5488b(context, intentM5549c);
                    } else {
                        context.startService(intentM5549c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j */
    public final boolean m6265j(C11499w41 c11499w41, C10910rT1 c10910rT1) {
        C7551Eo1 c7551Eo1 = c11499w41.f44673a;
        String str = c7551Eo1.f2911a;
        ArrayList arrayList = new ArrayList();
        C8383Uo1 c8383Uo1 = (C8383Uo1) this.f8901e.m23798m(new CallableC0298Ej(this, arrayList, str, 2));
        if (c8383Uo1 == null) {
            C1210TE c1210teM7634G = C1210TE.m7634G();
            c7551Eo1.toString();
            c1210teM7634G.getClass();
            m6263h(c7551Eo1);
            return false;
        }
        synchronized (this.f8908l) {
            try {
                if (m6261f(str)) {
                    Set set = (Set) this.f8904h.get(str);
                    if (((C11499w41) set.iterator().next()).f44673a.f2912b == c7551Eo1.f2912b) {
                        set.add(c11499w41);
                        C1210TE c1210teM7634G2 = C1210TE.m7634G();
                        c7551Eo1.toString();
                        c1210teM7634G2.getClass();
                    } else {
                        m6263h(c7551Eo1);
                    }
                    return false;
                }
                if (c8383Uo1.f12153t != c7551Eo1.f2912b) {
                    m6263h(c7551Eo1);
                    return false;
                }
                Context context = this.f8898b;
                C6790rv c6790rv = this.f8899c;
                C8539Xo1 c8539Xo1 = this.f8900d;
                WorkDatabase workDatabase = this.f8901e;
                C1361Vd c1361Vd = new C1361Vd();
                c1361Vd.f12668i = new C10910rT1(29);
                c1361Vd.f12662c = context.getApplicationContext();
                c1361Vd.f12664e = c8539Xo1;
                c1361Vd.f12663d = this;
                c1361Vd.f12661b = c6790rv;
                c1361Vd.f12665f = workDatabase;
                c1361Vd.f12666g = c8383Uo1;
                c1361Vd.f12667h = arrayList;
                c1361Vd.f12660a = this.f8905i;
                if (c10910rT1 != null) {
                    c1361Vd.f12668i = c10910rT1;
                }
                RunnableC9290ep1 runnableC9290ep1 = new RunnableC9290ep1(c1361Vd);
                C11687xZ0 c11687xZ0 = runnableC9290ep1.f26906p;
                c11687xZ0.mo2494d(new RunnableC1192Sx(this, c11499w41.f44673a, c11687xZ0, 6), (ExecutorC9387fa0) this.f8900d.f13983d);
                this.f8903g.put(str, runnableC9290ep1);
                HashSet hashSet = new HashSet();
                hashSet.add(c11499w41);
                this.f8904h.put(str, hashSet);
                ((ExecutorC6865t6) this.f8900d.f13981b).execute(runnableC9290ep1);
                C1210TE c1210teM7634G3 = C1210TE.m7634G();
                c7551Eo1.toString();
                c1210teM7634G3.getClass();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: k */
    public final void m6266k(String str) {
        synchronized (this.f8908l) {
            this.f8902f.remove(str);
            m6267l();
        }
    }

    /* renamed from: l */
    public final void m6267l() {
        synchronized (this.f8908l) {
            try {
                if (this.f8902f.isEmpty()) {
                    Context context = this.f8898b;
                    int i = N71.f7511j;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f8898b.startService(intent);
                    } catch (Throwable unused) {
                        C1210TE.m7634G().getClass();
                    }
                    PowerManager.WakeLock wakeLock = this.f8897a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f8897a = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: m */
    public final void m6268m(C11499w41 c11499w41) {
        String str = c11499w41.f44673a.f2911a;
        synchronized (this.f8908l) {
            try {
                RunnableC9290ep1 runnableC9290ep1 = (RunnableC9290ep1) this.f8903g.remove(str);
                if (runnableC9290ep1 == null) {
                    C1210TE.m7634G().getClass();
                    return;
                }
                Set set = (Set) this.f8904h.get(str);
                if (set != null && set.contains(c11499w41)) {
                    C1210TE.m7634G().getClass();
                    this.f8904h.remove(str);
                    m6257d(runnableC9290ep1);
                }
            } finally {
            }
        }
    }
}

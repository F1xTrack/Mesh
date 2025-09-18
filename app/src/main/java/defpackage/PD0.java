package defpackage;

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
public final class PD0 implements InterfaceC3577eQ {
    public final Context b;
    public final C6928rv c;
    public final C1857Xo1 d;
    public final WorkDatabase e;
    public final List i;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet j = new HashSet();
    public final ArrayList k = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object l = new Object();
    public final HashMap h = new HashMap();

    static {
        TE.M("Processor");
    }

    public PD0(Context context, C6928rv c6928rv, C1857Xo1 c1857Xo1, WorkDatabase workDatabase, List list) {
        this.b = context;
        this.c = c6928rv;
        this.d = c1857Xo1;
        this.e = workDatabase;
        this.i = list;
    }

    public static boolean d(RunnableC3654ep1 runnableC3654ep1) {
        if (runnableC3654ep1 == null) {
            TE.G().getClass();
            return false;
        }
        runnableC3654ep1.r = true;
        runnableC3654ep1.h();
        runnableC3654ep1.q.cancel(true);
        if (runnableC3654ep1.f == null || !(runnableC3654ep1.q.a instanceof S)) {
            Objects.toString(runnableC3654ep1.e);
            TE.G().getClass();
        } else {
            runnableC3654ep1.f.stop();
        }
        TE.G().getClass();
        return true;
    }

    @Override // defpackage.InterfaceC3577eQ
    public final void a(C0376Eo1 c0376Eo1, boolean z) {
        synchronized (this.l) {
            try {
                RunnableC3654ep1 runnableC3654ep1 = (RunnableC3654ep1) this.g.get(c0376Eo1.a);
                if (runnableC3654ep1 != null && c0376Eo1.equals(AbstractC5615l12.d(runnableC3654ep1.e))) {
                    this.g.remove(c0376Eo1.a);
                }
                TE.G().getClass();
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    ((InterfaceC3577eQ) it.next()).a(c0376Eo1, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(InterfaceC3577eQ interfaceC3577eQ) {
        synchronized (this.l) {
            this.k.add(interfaceC3577eQ);
        }
    }

    public final C1623Uo1 c(String str) {
        synchronized (this.l) {
            try {
                RunnableC3654ep1 runnableC3654ep1 = (RunnableC3654ep1) this.f.get(str);
                if (runnableC3654ep1 == null) {
                    runnableC3654ep1 = (RunnableC3654ep1) this.g.get(str);
                }
                if (runnableC3654ep1 == null) {
                    return null;
                }
                return runnableC3654ep1.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(String str) {
        boolean zContains;
        synchronized (this.l) {
            zContains = this.j.contains(str);
        }
        return zContains;
    }

    public final boolean f(String str) {
        boolean z;
        synchronized (this.l) {
            try {
                z = this.g.containsKey(str) || this.f.containsKey(str);
            } finally {
            }
        }
        return z;
    }

    public final void g(InterfaceC3577eQ interfaceC3577eQ) {
        synchronized (this.l) {
            this.k.remove(interfaceC3577eQ);
        }
    }

    public final void h(C0376Eo1 c0376Eo1) {
        C1857Xo1 c1857Xo1 = this.d;
        ((ExecutorC3799fa0) c1857Xo1.d).execute(new MD0(this, 1, c0376Eo1));
    }

    public final void i(String str, C6093nX c6093nX) {
        synchronized (this.l) {
            try {
                TE.G().getClass();
                RunnableC3654ep1 runnableC3654ep1 = (RunnableC3654ep1) this.g.remove(str);
                if (runnableC3654ep1 != null) {
                    if (this.a == null) {
                        PowerManager.WakeLock wakeLockA = AbstractC7094sm1.a(this.b, "ProcessorForegroundLck");
                        this.a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f.put(str, runnableC3654ep1);
                    Intent intentC = N71.c(this.b, AbstractC5615l12.d(runnableC3654ep1.e), c6093nX);
                    Context context = this.b;
                    if (Build.VERSION.SDK_INT >= 26) {
                        AbstractC1027My.b(context, intentC);
                    } else {
                        context.startService(intentC);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(C7725w41 c7725w41, C6846rT1 c6846rT1) {
        C0376Eo1 c0376Eo1 = c7725w41.a;
        String str = c0376Eo1.a;
        ArrayList arrayList = new ArrayList();
        C1623Uo1 c1623Uo1 = (C1623Uo1) this.e.m(new CallableC0359Ej(this, arrayList, str, 2));
        if (c1623Uo1 == null) {
            TE teG = TE.G();
            c0376Eo1.toString();
            teG.getClass();
            h(c0376Eo1);
            return false;
        }
        synchronized (this.l) {
            try {
                if (f(str)) {
                    Set set = (Set) this.h.get(str);
                    if (((C7725w41) set.iterator().next()).a.b == c0376Eo1.b) {
                        set.add(c7725w41);
                        TE teG2 = TE.G();
                        c0376Eo1.toString();
                        teG2.getClass();
                    } else {
                        h(c0376Eo1);
                    }
                    return false;
                }
                if (c1623Uo1.t != c0376Eo1.b) {
                    h(c0376Eo1);
                    return false;
                }
                Context context = this.b;
                C6928rv c6928rv = this.c;
                C1857Xo1 c1857Xo1 = this.d;
                WorkDatabase workDatabase = this.e;
                C1666Vd c1666Vd = new C1666Vd();
                c1666Vd.i = new C6846rT1(29);
                c1666Vd.c = context.getApplicationContext();
                c1666Vd.e = c1857Xo1;
                c1666Vd.d = this;
                c1666Vd.b = c6928rv;
                c1666Vd.f = workDatabase;
                c1666Vd.g = c1623Uo1;
                c1666Vd.h = arrayList;
                c1666Vd.a = this.i;
                if (c6846rT1 != null) {
                    c1666Vd.i = c6846rT1;
                }
                RunnableC3654ep1 runnableC3654ep1 = new RunnableC3654ep1(c1666Vd);
                C8007xZ0 c8007xZ0 = runnableC3654ep1.p;
                c8007xZ0.d(new RunnableC1492Sx(this, c7725w41.a, c8007xZ0, 6), (ExecutorC3799fa0) this.d.d);
                this.g.put(str, runnableC3654ep1);
                HashSet hashSet = new HashSet();
                hashSet.add(c7725w41);
                this.h.put(str, hashSet);
                ((ExecutorC7157t6) this.d.b).execute(runnableC3654ep1);
                TE teG3 = TE.G();
                c0376Eo1.toString();
                teG3.getClass();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(String str) {
        synchronized (this.l) {
            this.f.remove(str);
            l();
        }
    }

    public final void l() {
        synchronized (this.l) {
            try {
                if (this.f.isEmpty()) {
                    Context context = this.b;
                    int i = N71.j;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.b.startService(intent);
                    } catch (Throwable unused) {
                        TE.G().getClass();
                    }
                    PowerManager.WakeLock wakeLock = this.a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.a = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(C7725w41 c7725w41) {
        String str = c7725w41.a.a;
        synchronized (this.l) {
            try {
                RunnableC3654ep1 runnableC3654ep1 = (RunnableC3654ep1) this.g.remove(str);
                if (runnableC3654ep1 == null) {
                    TE.G().getClass();
                    return;
                }
                Set set = (Set) this.h.get(str);
                if (set != null && set.contains(c7725w41)) {
                    TE.G().getClass();
                    this.h.remove(str);
                    d(runnableC3654ep1);
                }
            } finally {
            }
        }
    }
}

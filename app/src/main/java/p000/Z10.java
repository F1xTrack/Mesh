package p000;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Z10 implements InterfaceC11933zV0, InterfaceC11591wo1, InterfaceC3989eQ {

    /* renamed from: a */
    public final Context f14641a;

    /* renamed from: b */
    public final C7863Ko1 f14642b;

    /* renamed from: c */
    public final C10189lr0 f14643c;

    /* renamed from: e */
    public final C7191yH f14645e;

    /* renamed from: f */
    public boolean f14646f;

    /* renamed from: i */
    public Boolean f14649i;

    /* renamed from: d */
    public final HashSet f14644d = new HashSet();

    /* renamed from: h */
    public final C4238iN f14648h = new C4238iN(27, (byte) 0);

    /* renamed from: g */
    public final Object f14647g = new Object();

    static {
        C1210TE.m7637M("GreedyScheduler");
    }

    public Z10(Context context, C6790rv c6790rv, T71 t71, C7863Ko1 c7863Ko1) {
        this.f14641a = context;
        this.f14642b = c7863Ko1;
        this.f14643c = new C10189lr0(t71, this);
        this.f14645e = new C7191yH(this, (C8342Tu0) c6790rv.f42157g);
    }

    @Override // p000.InterfaceC3989eQ
    /* renamed from: a */
    public final void mo4902a(C7551Eo1 c7551Eo1, boolean z) {
        this.f14648h.m19020y(c7551Eo1);
        synchronized (this.f14647g) {
            try {
                Iterator it = this.f14644d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C8383Uo1 c8383Uo1 = (C8383Uo1) it.next();
                    if (AbstractC10084l12.m22338d(c8383Uo1).equals(c7551Eo1)) {
                        C1210TE c1210teM7634G = C1210TE.m7634G();
                        Objects.toString(c7551Eo1);
                        c1210teM7634G.getClass();
                        this.f14644d.remove(c8383Uo1);
                        this.f14643c.m22567Z(this.f14644d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC11933zV0
    /* renamed from: b */
    public final boolean mo8314b() {
        return false;
    }

    @Override // p000.InterfaceC11933zV0
    /* renamed from: c */
    public final void mo8315c(String str) {
        Runnable runnable;
        Boolean bool = this.f14649i;
        C7863Ko1 c7863Ko1 = this.f14642b;
        if (bool == null) {
            this.f14649i = Boolean.valueOf(ID0.m3787a(this.f14641a, c7863Ko1.f6315b));
        }
        if (!this.f14649i.booleanValue()) {
            C1210TE.m7634G().getClass();
            return;
        }
        if (!this.f14646f) {
            c7863Ko1.f6319f.m6258b(this);
            this.f14646f = true;
        }
        C1210TE.m7634G().getClass();
        C7191yH c7191yH = this.f14645e;
        if (c7191yH != null && (runnable = (Runnable) c7191yH.f46166c.remove(str)) != null) {
            ((Handler) c7191yH.f46165b.f11590b).removeCallbacks(runnable);
        }
        Iterator it = this.f14648h.m19021z(str).iterator();
        while (it.hasNext()) {
            c7863Ko1.m4740h((C11499w41) it.next());
        }
    }

    @Override // p000.InterfaceC11591wo1
    /* renamed from: d */
    public final void mo5550d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7551Eo1 c7551Eo1M22338d = AbstractC10084l12.m22338d((C8383Uo1) it.next());
            C1210TE c1210teM7634G = C1210TE.m7634G();
            c7551Eo1M22338d.toString();
            c1210teM7634G.getClass();
            C11499w41 c11499w41M19020y = this.f14648h.m19020y(c7551Eo1M22338d);
            if (c11499w41M19020y != null) {
                this.f14642b.m4740h(c11499w41M19020y);
            }
        }
    }

    @Override // p000.InterfaceC11933zV0
    /* renamed from: e */
    public final void mo8316e(C8383Uo1... c8383Uo1Arr) {
        if (this.f14649i == null) {
            this.f14649i = Boolean.valueOf(ID0.m3787a(this.f14641a, this.f14642b.f6315b));
        }
        if (!this.f14649i.booleanValue()) {
            C1210TE.m7634G().getClass();
            return;
        }
        if (!this.f14646f) {
            this.f14642b.f6319f.m6258b(this);
            this.f14646f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C8383Uo1 c8383Uo1 : c8383Uo1Arr) {
            if (!this.f14648h.m19014p(AbstractC10084l12.m22338d(c8383Uo1))) {
                long jM8183a = c8383Uo1.m8183a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c8383Uo1.f12135b == 1) {
                    if (jCurrentTimeMillis < jM8183a) {
                        C7191yH c7191yH = this.f14645e;
                        if (c7191yH != null) {
                            HashMap map = c7191yH.f46166c;
                            Runnable runnable = (Runnable) map.remove(c8383Uo1.f12134a);
                            C8342Tu0 c8342Tu0 = c7191yH.f46165b;
                            if (runnable != null) {
                                ((Handler) c8342Tu0.f11590b).removeCallbacks(runnable);
                            }
                            RunnableC1483XZ runnableC1483XZ = new RunnableC1483XZ(c7191yH, c8383Uo1, false, 7);
                            map.put(c8383Uo1.f12134a, runnableC1483XZ);
                            ((Handler) c8342Tu0.f11590b).postDelayed(runnableC1483XZ, c8383Uo1.m8183a() - System.currentTimeMillis());
                        }
                    } else if (c8383Uo1.m8184c()) {
                        int i = Build.VERSION.SDK_INT;
                        C4149gy c4149gy = c8383Uo1.f12143j;
                        if (c4149gy.f28118c) {
                            C1210TE c1210teM7634G = C1210TE.m7634G();
                            c8383Uo1.toString();
                            c1210teM7634G.getClass();
                        } else if (i < 24 || c4149gy.f28123h.isEmpty()) {
                            hashSet.add(c8383Uo1);
                            hashSet2.add(c8383Uo1.f12134a);
                        } else {
                            C1210TE c1210teM7634G2 = C1210TE.m7634G();
                            c8383Uo1.toString();
                            c1210teM7634G2.getClass();
                        }
                    } else if (!this.f14648h.m19014p(AbstractC10084l12.m22338d(c8383Uo1))) {
                        C1210TE.m7634G().getClass();
                        C7863Ko1 c7863Ko1 = this.f14642b;
                        C4238iN c4238iN = this.f14648h;
                        c4238iN.getClass();
                        c7863Ko1.m4739g(c4238iN.m19009A(AbstractC10084l12.m22338d(c8383Uo1)), null);
                    }
                }
            }
        }
        synchronized (this.f14647g) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(StringUtils.COMMA, hashSet2);
                    C1210TE.m7634G().getClass();
                    this.f14644d.addAll(hashSet);
                    this.f14643c.m22567Z(this.f14644d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC11591wo1
    /* renamed from: f */
    public final void mo5552f(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C7551Eo1 c7551Eo1M22338d = AbstractC10084l12.m22338d((C8383Uo1) it.next());
            C4238iN c4238iN = this.f14648h;
            if (!c4238iN.m19014p(c7551Eo1M22338d)) {
                C1210TE c1210teM7634G = C1210TE.m7634G();
                c7551Eo1M22338d.toString();
                c1210teM7634G.getClass();
                this.f14642b.m4739g(c4238iN.m19009A(c7551Eo1M22338d), null);
            }
        }
    }
}

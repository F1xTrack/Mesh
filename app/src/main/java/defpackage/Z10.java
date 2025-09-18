package defpackage;

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
public final class Z10 implements InterfaceC8375zV0, InterfaceC7863wo1, InterfaceC3577eQ {
    public final Context a;
    public final C0844Ko1 b;
    public final C5772lr0 c;
    public final C8142yH e;
    public boolean f;
    public Boolean i;
    public final HashSet d = new HashSet();
    public final C4332iN h = new C4332iN(27, (byte) 0);
    public final Object g = new Object();

    static {
        TE.M("GreedyScheduler");
    }

    public Z10(Context context, C6928rv c6928rv, T71 t71, C0844Ko1 c0844Ko1) {
        this.a = context;
        this.b = c0844Ko1;
        this.c = new C5772lr0(t71, this);
        this.e = new C8142yH(this, (C1562Tu0) c6928rv.g);
    }

    @Override // defpackage.InterfaceC3577eQ
    public final void a(C0376Eo1 c0376Eo1, boolean z) {
        this.h.y(c0376Eo1);
        synchronized (this.g) {
            try {
                Iterator it = this.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1623Uo1 c1623Uo1 = (C1623Uo1) it.next();
                    if (AbstractC5615l12.d(c1623Uo1).equals(c0376Eo1)) {
                        TE teG = TE.G();
                        Objects.toString(c0376Eo1);
                        teG.getClass();
                        this.d.remove(c1623Uo1);
                        this.c.Z(this.d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC8375zV0
    public final boolean b() {
        return false;
    }

    @Override // defpackage.InterfaceC8375zV0
    public final void c(String str) {
        Runnable runnable;
        Boolean bool = this.i;
        C0844Ko1 c0844Ko1 = this.b;
        if (bool == null) {
            this.i = Boolean.valueOf(ID0.a(this.a, c0844Ko1.b));
        }
        if (!this.i.booleanValue()) {
            TE.G().getClass();
            return;
        }
        if (!this.f) {
            c0844Ko1.f.b(this);
            this.f = true;
        }
        TE.G().getClass();
        C8142yH c8142yH = this.e;
        if (c8142yH != null && (runnable = (Runnable) c8142yH.c.remove(str)) != null) {
            ((Handler) c8142yH.b.b).removeCallbacks(runnable);
        }
        Iterator it = this.h.z(str).iterator();
        while (it.hasNext()) {
            c0844Ko1.h((C7725w41) it.next());
        }
    }

    @Override // defpackage.InterfaceC7863wo1
    public final void d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0376Eo1 c0376Eo1D = AbstractC5615l12.d((C1623Uo1) it.next());
            TE teG = TE.G();
            c0376Eo1D.toString();
            teG.getClass();
            C7725w41 c7725w41Y = this.h.y(c0376Eo1D);
            if (c7725w41Y != null) {
                this.b.h(c7725w41Y);
            }
        }
    }

    @Override // defpackage.InterfaceC8375zV0
    public final void e(C1623Uo1... c1623Uo1Arr) {
        if (this.i == null) {
            this.i = Boolean.valueOf(ID0.a(this.a, this.b.b));
        }
        if (!this.i.booleanValue()) {
            TE.G().getClass();
            return;
        }
        if (!this.f) {
            this.b.f.b(this);
            this.f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C1623Uo1 c1623Uo1 : c1623Uo1Arr) {
            if (!this.h.p(AbstractC5615l12.d(c1623Uo1))) {
                long jA = c1623Uo1.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c1623Uo1.b == 1) {
                    if (jCurrentTimeMillis < jA) {
                        C8142yH c8142yH = this.e;
                        if (c8142yH != null) {
                            HashMap map = c8142yH.c;
                            Runnable runnable = (Runnable) map.remove(c1623Uo1.a);
                            C1562Tu0 c1562Tu0 = c8142yH.b;
                            if (runnable != null) {
                                ((Handler) c1562Tu0.b).removeCallbacks(runnable);
                            }
                            XZ xz = new XZ(c8142yH, c1623Uo1, false, 7);
                            map.put(c1623Uo1.a, xz);
                            ((Handler) c1562Tu0.b).postDelayed(xz, c1623Uo1.a() - System.currentTimeMillis());
                        }
                    } else if (c1623Uo1.c()) {
                        int i = Build.VERSION.SDK_INT;
                        C4061gy c4061gy = c1623Uo1.j;
                        if (c4061gy.c) {
                            TE teG = TE.G();
                            c1623Uo1.toString();
                            teG.getClass();
                        } else if (i < 24 || c4061gy.h.isEmpty()) {
                            hashSet.add(c1623Uo1);
                            hashSet2.add(c1623Uo1.a);
                        } else {
                            TE teG2 = TE.G();
                            c1623Uo1.toString();
                            teG2.getClass();
                        }
                    } else if (!this.h.p(AbstractC5615l12.d(c1623Uo1))) {
                        TE.G().getClass();
                        C0844Ko1 c0844Ko1 = this.b;
                        C4332iN c4332iN = this.h;
                        c4332iN.getClass();
                        c0844Ko1.g(c4332iN.A(AbstractC5615l12.d(c1623Uo1)), null);
                    }
                }
            }
        }
        synchronized (this.g) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(StringUtils.COMMA, hashSet2);
                    TE.G().getClass();
                    this.d.addAll(hashSet);
                    this.c.Z(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC7863wo1
    public final void f(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C0376Eo1 c0376Eo1D = AbstractC5615l12.d((C1623Uo1) it.next());
            C4332iN c4332iN = this.h;
            if (!c4332iN.p(c0376Eo1D)) {
                TE teG = TE.G();
                c0376Eo1D.toString();
                teG.getClass();
                this.b.g(c4332iN.A(c0376Eo1D), null);
            }
        }
    }
}

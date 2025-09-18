package p000;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: gw */
/* loaded from: classes.dex */
public final class C4147gw {

    /* renamed from: m */
    public static final ExecutorC4160h8 f28091m = new ExecutorC4160h8(1);

    /* renamed from: a */
    public final C4084fw f28092a;

    /* renamed from: b */
    public final C11962zj1 f28093b;

    /* renamed from: c */
    public final C7541Ej1 f28094c;

    /* renamed from: d */
    public final C3958dw f28095d;

    /* renamed from: e */
    public final M71 f28096e;

    /* renamed from: f */
    public final CopyOnWriteArraySet f28097f;

    /* renamed from: g */
    public C6686qX f28098g;

    /* renamed from: h */
    public InterfaceC11581wj1 f28099h;

    /* renamed from: i */
    public R71 f28100i;

    /* renamed from: j */
    public Pair f28101j;

    /* renamed from: k */
    public int f28102k;

    /* renamed from: l */
    public int f28103l;

    public C4147gw(C1753aw c1753aw) {
        C4084fw c4084fw = new C4084fw(this, (Context) c1753aw.f16682b);
        this.f28092a = c4084fw;
        M71 m71 = (M71) c1753aw.f16687g;
        this.f28096e = m71;
        C11962zj1 c11962zj1 = (C11962zj1) c1753aw.f16684d;
        this.f28093b = c11962zj1;
        c11962zj1.f46968k = m71;
        this.f28094c = new C7541Ej1(new C9432fw1(7, this), c11962zj1);
        C3958dw c3958dw = (C3958dw) c1753aw.f16686f;
        YN1.m9283h(c3958dw);
        this.f28095d = c3958dw;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f28097f = copyOnWriteArraySet;
        this.f28103l = 0;
        copyOnWriteArraySet.add(c4084fw);
    }

    /* renamed from: a */
    public final void m18674a(long j, long j2) {
        C7541Ej1 c7541Ej1;
        C6455mu c6455mu;
        int i;
        if (this.f28102k != 0 || (i = (c6455mu = (c7541Ej1 = this.f28094c).f2865f).f37982b) == 0) {
            return;
        }
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long j3 = ((long[]) c6455mu.f37984d)[c6455mu.f37981a];
        Long l = (Long) c7541Ej1.f2864e.m4227q(j3);
        C11962zj1 c11962zj1 = c7541Ej1.f2861b;
        if (l != null && l.longValue() != c7541Ej1.f2868i) {
            c7541Ej1.f2868i = l.longValue();
            c11962zj1.m26525c(2);
        }
        int iM26523a = c7541Ej1.f2861b.m26523a(j3, j, j2, c7541Ej1.f2868i, false, c7541Ej1.f2862c);
        C4147gw c4147gw = (C4147gw) c7541Ej1.f2860a.f27505b;
        if (iM26523a != 0 && iM26523a != 1) {
            if (iM26523a != 2 && iM26523a != 3 && iM26523a != 4) {
                if (iM26523a != 5) {
                    throw new IllegalStateException(String.valueOf(iM26523a));
                }
                return;
            }
            c7541Ej1.f2869j = j3;
            c6455mu.m22987P();
            Iterator it = c4147gw.f28097f.iterator();
            while (it.hasNext()) {
                C4084fw c4084fw = (C4084fw) it.next();
                c4084fw.f27474i.execute(new RunnableC4021ew(c4084fw, c4084fw.f27473h, 1));
            }
            YN1.m9283h(null);
            throw null;
        }
        c7541Ej1.f2869j = j3;
        long jM22987P = c6455mu.m22987P();
        C8321Tj1 c8321Tj1 = (C8321Tj1) c7541Ej1.f2863d.m4227q(jM22987P);
        if (c8321Tj1 != null && !c8321Tj1.equals(C8321Tj1.f11486e) && !c8321Tj1.equals(c7541Ej1.f2867h)) {
            c7541Ej1.f2867h = c8321Tj1;
            C6623pX c6623pX = new C6623pX();
            c6623pX.f40167r = c8321Tj1.f11487a;
            c6623pX.f40168s = c8321Tj1.f11488b;
            c6623pX.f40161l = AbstractC8544Xr0.m9171n("video/raw");
            c4147gw.f28098g = new C6686qX(c6623pX);
            Iterator it2 = c4147gw.f28097f.iterator();
            while (it2.hasNext()) {
                C4084fw c4084fw2 = (C4084fw) it2.next();
                c4084fw2.f27474i.execute(new RunnableC4021ew(c4084fw2, c4084fw2.f27473h, c8321Tj1));
            }
        }
        boolean z = c11962zj1.f46961d != 3;
        c11962zj1.f46961d = 3;
        c11962zj1.f46968k.getClass();
        c11962zj1.f46963f = AbstractC7485Dh1.m1802Q(SystemClock.elapsedRealtime());
        if (z && c4147gw.f28101j != null) {
            Iterator it3 = c4147gw.f28097f.iterator();
            while (it3.hasNext()) {
                C4084fw c4084fw3 = (C4084fw) it3.next();
                c4084fw3.f27474i.execute(new RunnableC4021ew(c4084fw3, c4084fw3.f27473h, 2));
            }
        }
        if (c4147gw.f28099h != null) {
            C6686qX c6686qX = c4147gw.f28098g;
            C6686qX c6686qX2 = c6686qX == null ? new C6686qX(new C6623pX()) : c6686qX;
            InterfaceC11581wj1 interfaceC11581wj1 = c4147gw.f28099h;
            c4147gw.f28096e.getClass();
            interfaceC11581wj1.mo8438c(jM22987P, System.nanoTime(), c6686qX2, null);
        }
        YN1.m9283h(null);
        throw null;
    }
}

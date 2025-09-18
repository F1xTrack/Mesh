package defpackage;

import android.content.Context;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: ep1 */
/* loaded from: classes.dex */
public final class RunnableC3654ep1 implements Runnable {
    public static final /* synthetic */ int s = 0;
    public final Context a;
    public final String b;
    public final List c;
    public final C6846rT1 d;
    public final C1623Uo1 e;
    public AbstractC1139Oj0 f;
    public final C1857Xo1 g;
    public final C6928rv i;
    public final PD0 j;
    public final WorkDatabase k;
    public final C1701Vo1 l;
    public final VH m;
    public final ArrayList n;
    public String o;
    public volatile boolean r;
    public AbstractC1061Nj0 h = new C0828Kj0();
    public final C8007xZ0 p = new C8007xZ0();
    public final C8007xZ0 q = new C8007xZ0();

    static {
        TE.M("WorkerWrapper");
    }

    public RunnableC3654ep1(C1666Vd c1666Vd) {
        this.a = (Context) c1666Vd.c;
        this.g = (C1857Xo1) c1666Vd.e;
        this.j = (PD0) c1666Vd.d;
        C1623Uo1 c1623Uo1 = (C1623Uo1) c1666Vd.g;
        this.e = c1623Uo1;
        this.b = c1623Uo1.a;
        this.c = (List) c1666Vd.a;
        this.d = (C6846rT1) c1666Vd.i;
        this.f = null;
        this.i = (C6928rv) c1666Vd.b;
        WorkDatabase workDatabase = (WorkDatabase) c1666Vd.f;
        this.k = workDatabase;
        this.l = workDatabase.u();
        this.m = workDatabase.p();
        this.n = (ArrayList) c1666Vd.h;
    }

    public final void a(AbstractC1061Nj0 abstractC1061Nj0) {
        boolean z = abstractC1061Nj0 instanceof C0983Mj0;
        C1623Uo1 c1623Uo1 = this.e;
        if (!z) {
            if (abstractC1061Nj0 instanceof C0906Lj0) {
                TE.G().getClass();
                c();
                return;
            }
            TE.G().getClass();
            if (c1623Uo1.d()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        TE.G().getClass();
        if (c1623Uo1.d()) {
            d();
            return;
        }
        VH vh = this.m;
        String str = this.b;
        C1701Vo1 c1701Vo1 = this.l;
        WorkDatabase workDatabase = this.k;
        workDatabase.c();
        try {
            c1701Vo1.q(3, str);
            c1701Vo1.p(str, ((C0983Mj0) this.h).a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = vh.y(str).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (c1701Vo1.j(str2) == 5) {
                    C6655qT0 c6655qT0A = C6655qT0.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str2 == null) {
                        c6655qT0A.V(1);
                    } else {
                        c6655qT0A.d(1, str2);
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) vh.b;
                    workDatabase_Impl.b();
                    Cursor cursorC = RY1.c(workDatabase_Impl, c6655qT0A, false);
                    try {
                        if (cursorC.moveToFirst() && cursorC.getInt(0) != 0) {
                            TE.G().getClass();
                            c1701Vo1.q(1, str2);
                            c1701Vo1.o(jCurrentTimeMillis, str2);
                        }
                    } finally {
                        cursorC.close();
                        c6655qT0A.release();
                    }
                }
            }
            workDatabase.n();
            workDatabase.j();
            e(false);
        } catch (Throwable th) {
            workDatabase.j();
            e(false);
            throw th;
        }
    }

    public final void b() {
        boolean zH = h();
        WorkDatabase workDatabase = this.k;
        String str = this.b;
        if (!zH) {
            workDatabase.c();
            try {
                int iJ = this.l.j(str);
                workDatabase.t().t(str);
                if (iJ == 0) {
                    e(false);
                } else if (iJ == 2) {
                    a(this.h);
                } else if (!F91.r(iJ)) {
                    c();
                }
                workDatabase.n();
                workDatabase.j();
            } catch (Throwable th) {
                workDatabase.j();
                throw th;
            }
        }
        List list = this.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC8375zV0) it.next()).c(str);
            }
            CV0.a(this.i, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.b;
        C1701Vo1 c1701Vo1 = this.l;
        WorkDatabase workDatabase = this.k;
        workDatabase.c();
        try {
            c1701Vo1.q(1, str);
            c1701Vo1.o(System.currentTimeMillis(), str);
            c1701Vo1.n(-1L, str);
            workDatabase.n();
        } finally {
            workDatabase.j();
            e(true);
        }
    }

    public final void d() {
        String str = this.b;
        C1701Vo1 c1701Vo1 = this.l;
        WorkDatabase workDatabase = this.k;
        workDatabase.c();
        try {
            c1701Vo1.o(System.currentTimeMillis(), str);
            c1701Vo1.q(1, str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c1701Vo1.a;
            workDatabase_Impl.b();
            C5581kr0 c5581kr0 = (C5581kr0) c1701Vo1.j;
            C3414dZ c3414dZA = c5581kr0.a();
            if (str == null) {
                c3414dZA.V(1);
            } else {
                c3414dZA.d(1, str);
            }
            workDatabase_Impl.c();
            try {
                c3414dZA.m();
                workDatabase_Impl.n();
                workDatabase_Impl.j();
                c5581kr0.f(c3414dZA);
                workDatabase_Impl.b();
                c5581kr0 = (C5581kr0) c1701Vo1.f;
                c3414dZA = c5581kr0.a();
                if (str == null) {
                    c3414dZA.V(1);
                } else {
                    c3414dZA.d(1, str);
                }
                workDatabase_Impl.c();
                try {
                    c3414dZA.m();
                    workDatabase_Impl.n();
                    workDatabase_Impl.j();
                    c5581kr0.f(c3414dZA);
                    c1701Vo1.n(-1L, str);
                    workDatabase.n();
                } finally {
                }
            } finally {
            }
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.k
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.k     // Catch: java.lang.Throwable -> L42
            Vo1 r0 = r0.u()     // Catch: java.lang.Throwable -> L42
            r0.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            qT0 r1 = defpackage.C6655qT0.a(r2, r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.a     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0     // Catch: java.lang.Throwable -> L42
            r0.b()     // Catch: java.lang.Throwable -> L42
            android.database.Cursor r0 = defpackage.RY1.c(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2f
            r4 = 1
            if (r3 == 0) goto L31
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L31
            r3 = r4
            goto L32
        L2f:
            r6 = move-exception
            goto L8d
        L31:
            r3 = r2
        L32:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.release()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L44
            android.content.Context r0 = r5.a     // Catch: java.lang.Throwable -> L42
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            defpackage.AbstractC0486Fz0.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r6 = move-exception
            goto L94
        L44:
            if (r6 == 0) goto L56
            Vo1 r0 = r5.l     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.b     // Catch: java.lang.Throwable -> L42
            r0.q(r4, r1)     // Catch: java.lang.Throwable -> L42
            Vo1 r0 = r5.l     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.b     // Catch: java.lang.Throwable -> L42
            r2 = -1
            r0.n(r2, r1)     // Catch: java.lang.Throwable -> L42
        L56:
            Uo1 r0 = r5.e     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L79
            Oj0 r0 = r5.f     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L79
            PD0 r0 = r5.j     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r0.l     // Catch: java.lang.Throwable -> L42
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r0 = r0.f     // Catch: java.lang.Throwable -> L76
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L76
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L79
            PD0 r0 = r5.j     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.b     // Catch: java.lang.Throwable -> L42
            r0.k(r1)     // Catch: java.lang.Throwable -> L42
            goto L79
        L76:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            throw r6     // Catch: java.lang.Throwable -> L42
        L79:
            androidx.work.impl.WorkDatabase r0 = r5.k     // Catch: java.lang.Throwable -> L42
            r0.n()     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase r0 = r5.k
            r0.j()
            xZ0 r0 = r5.p
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.j(r6)
            return
        L8d:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.release()     // Catch: java.lang.Throwable -> L42
            throw r6     // Catch: java.lang.Throwable -> L42
        L94:
            androidx.work.impl.WorkDatabase r0 = r5.k
            r0.j()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC3654ep1.e(boolean):void");
    }

    public final void f() {
        if (this.l.j(this.b) == 2) {
            TE.G().getClass();
            e(true);
        } else {
            TE.G().getClass();
            e(false);
        }
    }

    public final void g() {
        String str = this.b;
        WorkDatabase workDatabase = this.k;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean zIsEmpty = linkedList.isEmpty();
                C1701Vo1 c1701Vo1 = this.l;
                if (zIsEmpty) {
                    c1701Vo1.p(str, ((C0828Kj0) this.h).a);
                    workDatabase.n();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (c1701Vo1.j(str2) != 6) {
                        c1701Vo1.q(4, str2);
                    }
                    linkedList.addAll(this.m.y(str2));
                }
            }
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.r) {
            return false;
        }
        TE.G().getClass();
        if (this.l.j(this.b) == 0) {
            e(false);
        } else {
            e(!F91.r(r0));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x018e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC3654ep1.run():void");
    }
}

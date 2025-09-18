package p000;

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
public final class RunnableC9290ep1 implements Runnable {

    /* renamed from: s */
    public static final /* synthetic */ int f26890s = 0;

    /* renamed from: a */
    public final Context f26891a;

    /* renamed from: b */
    public final String f26892b;

    /* renamed from: c */
    public final List f26893c;

    /* renamed from: d */
    public final C10910rT1 f26894d;

    /* renamed from: e */
    public final C8383Uo1 f26895e;

    /* renamed from: f */
    public AbstractC8060Oj0 f26896f;

    /* renamed from: g */
    public final C8539Xo1 f26897g;

    /* renamed from: i */
    public final C6790rv f26899i;

    /* renamed from: j */
    public final PD0 f26900j;

    /* renamed from: k */
    public final WorkDatabase f26901k;

    /* renamed from: l */
    public final C8435Vo1 f26902l;

    /* renamed from: m */
    public final C1339VH f26903m;

    /* renamed from: n */
    public final ArrayList f26904n;

    /* renamed from: o */
    public String f26905o;

    /* renamed from: r */
    public volatile boolean f26908r;

    /* renamed from: h */
    public AbstractC8008Nj0 f26898h = new C7852Kj0();

    /* renamed from: p */
    public final C11687xZ0 f26906p = new C11687xZ0();

    /* renamed from: q */
    public final C11687xZ0 f26907q = new C11687xZ0();

    static {
        C1210TE.m7637M("WorkerWrapper");
    }

    public RunnableC9290ep1(C1361Vd c1361Vd) {
        this.f26891a = (Context) c1361Vd.f12662c;
        this.f26897g = (C8539Xo1) c1361Vd.f12664e;
        this.f26900j = (PD0) c1361Vd.f12663d;
        C8383Uo1 c8383Uo1 = (C8383Uo1) c1361Vd.f12666g;
        this.f26895e = c8383Uo1;
        this.f26892b = c8383Uo1.f12134a;
        this.f26893c = (List) c1361Vd.f12660a;
        this.f26894d = (C10910rT1) c1361Vd.f12668i;
        this.f26896f = null;
        this.f26899i = (C6790rv) c1361Vd.f12661b;
        WorkDatabase workDatabase = (WorkDatabase) c1361Vd.f12665f;
        this.f26901k = workDatabase;
        this.f26902l = workDatabase.mo10328u();
        this.f26903m = workDatabase.mo10323p();
        this.f26904n = (ArrayList) c1361Vd.f12667h;
    }

    /* renamed from: a */
    public final void m18051a(AbstractC8008Nj0 abstractC8008Nj0) {
        boolean z = abstractC8008Nj0 instanceof C7956Mj0;
        C8383Uo1 c8383Uo1 = this.f26895e;
        if (!z) {
            if (abstractC8008Nj0 instanceof C7904Lj0) {
                C1210TE.m7634G().getClass();
                m18053c();
                return;
            }
            C1210TE.m7634G().getClass();
            if (c8383Uo1.m8185d()) {
                m18054d();
                return;
            } else {
                m18057g();
                return;
            }
        }
        C1210TE.m7634G().getClass();
        if (c8383Uo1.m8185d()) {
            m18054d();
            return;
        }
        C1339VH c1339vh = this.f26903m;
        String str = this.f26892b;
        C8435Vo1 c8435Vo1 = this.f26902l;
        WorkDatabase workDatabase = this.f26901k;
        workDatabase.m23793c();
        try {
            c8435Vo1.m8574q(3, str);
            c8435Vo1.m8573p(str, ((C7956Mj0) this.f26898h).f7313a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = c1339vh.m8383y(str).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (c8435Vo1.m8567j(str2) == 5) {
                    C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str2 == null) {
                        c10781qT0M24005a.mo2032V(1);
                    } else {
                        c10781qT0M24005a.mo2033d(1, str2);
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c1339vh.f12486b;
                    workDatabase_Impl.m23792b();
                    Cursor cursorM7035c = RY1.m7035c(workDatabase_Impl, c10781qT0M24005a, false);
                    try {
                        if (cursorM7035c.moveToFirst() && cursorM7035c.getInt(0) != 0) {
                            C1210TE.m7634G().getClass();
                            c8435Vo1.m8574q(1, str2);
                            c8435Vo1.m8572o(jCurrentTimeMillis, str2);
                        }
                    } finally {
                        cursorM7035c.close();
                        c10781qT0M24005a.release();
                    }
                }
            }
            workDatabase.m23799n();
            workDatabase.m23795j();
            m18055e(false);
        } catch (Throwable th) {
            workDatabase.m23795j();
            m18055e(false);
            throw th;
        }
    }

    /* renamed from: b */
    public final void m18052b() {
        boolean zM18058h = m18058h();
        WorkDatabase workDatabase = this.f26901k;
        String str = this.f26892b;
        if (!zM18058h) {
            workDatabase.m23793c();
            try {
                int iM8567j = this.f26902l.m8567j(str);
                workDatabase.mo10327t().m6153t(str);
                if (iM8567j == 0) {
                    m18055e(false);
                } else if (iM8567j == 2) {
                    m18051a(this.f26898h);
                } else if (!F91.m2535r(iM8567j)) {
                    m18053c();
                }
                workDatabase.m23799n();
                workDatabase.m23795j();
            } catch (Throwable th) {
                workDatabase.m23795j();
                throw th;
            }
        }
        List list = this.f26893c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC11933zV0) it.next()).mo8315c(str);
            }
            CV0.m1192a(this.f26899i, workDatabase, list);
        }
    }

    /* renamed from: c */
    public final void m18053c() {
        String str = this.f26892b;
        C8435Vo1 c8435Vo1 = this.f26902l;
        WorkDatabase workDatabase = this.f26901k;
        workDatabase.m23793c();
        try {
            c8435Vo1.m8574q(1, str);
            c8435Vo1.m8572o(System.currentTimeMillis(), str);
            c8435Vo1.m8571n(-1L, str);
            workDatabase.m23799n();
        } finally {
            workDatabase.m23795j();
            m18055e(true);
        }
    }

    /* renamed from: d */
    public final void m18054d() {
        String str = this.f26892b;
        C8435Vo1 c8435Vo1 = this.f26902l;
        WorkDatabase workDatabase = this.f26901k;
        workDatabase.m23793c();
        try {
            c8435Vo1.m8572o(System.currentTimeMillis(), str);
            c8435Vo1.m8574q(1, str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c8435Vo1.f12763a;
            workDatabase_Impl.m23792b();
            C10061kr0 c10061kr0 = (C10061kr0) c8435Vo1.f12772j;
            C3936dZ c3936dZM2771a = c10061kr0.m2771a();
            if (str == null) {
                c3936dZM2771a.mo2032V(1);
            } else {
                c3936dZM2771a.mo2033d(1, str);
            }
            workDatabase_Impl.m23793c();
            try {
                c3936dZM2771a.m17710m();
                workDatabase_Impl.m23799n();
                workDatabase_Impl.m23795j();
                c10061kr0.m2776f(c3936dZM2771a);
                workDatabase_Impl.m23792b();
                c10061kr0 = (C10061kr0) c8435Vo1.f12768f;
                c3936dZM2771a = c10061kr0.m2771a();
                if (str == null) {
                    c3936dZM2771a.mo2032V(1);
                } else {
                    c3936dZM2771a.mo2033d(1, str);
                }
                workDatabase_Impl.m23793c();
                try {
                    c3936dZM2771a.m17710m();
                    workDatabase_Impl.m23799n();
                    workDatabase_Impl.m23795j();
                    c10061kr0.m2776f(c3936dZM2771a);
                    c8435Vo1.m8571n(-1L, str);
                    workDatabase.m23799n();
                } finally {
                }
            } finally {
            }
        } finally {
            workDatabase.m23795j();
            m18055e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0031  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m18055e(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.f26901k
            r0.m23793c()
            androidx.work.impl.WorkDatabase r0 = r5.f26901k     // Catch: java.lang.Throwable -> L42
            Vo1 r0 = r0.mo10328u()     // Catch: java.lang.Throwable -> L42
            r0.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            qT0 r1 = p000.C10781qT0.m24005a(r2, r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.f12763a     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0     // Catch: java.lang.Throwable -> L42
            r0.m23792b()     // Catch: java.lang.Throwable -> L42
            android.database.Cursor r0 = p000.RY1.m7035c(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
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
            android.content.Context r0 = r5.f26891a     // Catch: java.lang.Throwable -> L42
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            p000.AbstractC7624Fz0.m2870a(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r6 = move-exception
            goto L94
        L44:
            if (r6 == 0) goto L56
            Vo1 r0 = r5.f26902l     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f26892b     // Catch: java.lang.Throwable -> L42
            r0.m8574q(r4, r1)     // Catch: java.lang.Throwable -> L42
            Vo1 r0 = r5.f26902l     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f26892b     // Catch: java.lang.Throwable -> L42
            r2 = -1
            r0.m8571n(r2, r1)     // Catch: java.lang.Throwable -> L42
        L56:
            Uo1 r0 = r5.f26895e     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L79
            Oj0 r0 = r5.f26896f     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L79
            PD0 r0 = r5.f26900j     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f26892b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r0.f8908l     // Catch: java.lang.Throwable -> L42
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r0 = r0.f8902f     // Catch: java.lang.Throwable -> L76
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L76
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L79
            PD0 r0 = r5.f26900j     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f26892b     // Catch: java.lang.Throwable -> L42
            r0.m6266k(r1)     // Catch: java.lang.Throwable -> L42
            goto L79
        L76:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            throw r6     // Catch: java.lang.Throwable -> L42
        L79:
            androidx.work.impl.WorkDatabase r0 = r5.f26901k     // Catch: java.lang.Throwable -> L42
            r0.m23799n()     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase r0 = r5.f26901k
            r0.m23795j()
            xZ0 r0 = r5.f26906p
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.m25921j(r6)
            return
        L8d:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.release()     // Catch: java.lang.Throwable -> L42
            throw r6     // Catch: java.lang.Throwable -> L42
        L94:
            androidx.work.impl.WorkDatabase r0 = r5.f26901k
            r0.m23795j()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC9290ep1.m18055e(boolean):void");
    }

    /* renamed from: f */
    public final void m18056f() {
        if (this.f26902l.m8567j(this.f26892b) == 2) {
            C1210TE.m7634G().getClass();
            m18055e(true);
        } else {
            C1210TE.m7634G().getClass();
            m18055e(false);
        }
    }

    /* renamed from: g */
    public final void m18057g() {
        String str = this.f26892b;
        WorkDatabase workDatabase = this.f26901k;
        workDatabase.m23793c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean zIsEmpty = linkedList.isEmpty();
                C8435Vo1 c8435Vo1 = this.f26902l;
                if (zIsEmpty) {
                    c8435Vo1.m8573p(str, ((C7852Kj0) this.f26898h).f6265a);
                    workDatabase.m23799n();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (c8435Vo1.m8567j(str2) != 6) {
                        c8435Vo1.m8574q(4, str2);
                    }
                    linkedList.addAll(this.f26903m.m8383y(str2));
                }
            }
        } finally {
            workDatabase.m23795j();
            m18055e(false);
        }
    }

    /* renamed from: h */
    public final boolean m18058h() {
        if (!this.f26908r) {
            return false;
        }
        C1210TE.m7634G().getClass();
        if (this.f26902l.m8567j(this.f26892b) == 0) {
            m18055e(false);
        } else {
            m18055e(!F91.m2535r(r0));
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
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC9290ep1.run():void");
    }
}

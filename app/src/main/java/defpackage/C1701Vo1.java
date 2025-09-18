package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Vo1 */
/* loaded from: classes.dex */
public final class C1701Vo1 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public C1701Vo1(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.b = new UH(workDatabase_Impl, 6);
        this.c = new C5581kr0(workDatabase_Impl, 10);
        this.d = new C5581kr0(workDatabase_Impl, 11);
        this.e = new C5581kr0(workDatabase_Impl, 12);
        this.f = new C5581kr0(workDatabase_Impl, 13);
        this.g = new C5581kr0(workDatabase_Impl, 14);
        this.h = new C5581kr0(workDatabase_Impl, 15);
        this.i = new C5581kr0(workDatabase_Impl, 16);
        this.j = new C5581kr0(workDatabase_Impl, 17);
        this.k = new C5581kr0(workDatabase_Impl, 6);
        this.l = new C5581kr0(workDatabase_Impl, 7);
        new C5581kr0(workDatabase_Impl, 8);
        new C5581kr0(workDatabase_Impl, 9);
    }

    public static void d(AbstractC6659qU1 abstractC6659qU1) {
        if (abstractC6659qU1 instanceof GT0) {
            ((GT0) abstractC6659qU1).getClass();
        } else if (abstractC6659qU1 instanceof C3345dC) {
            ((C3345dC) abstractC6659qU1).getClass();
        }
    }

    public void a(C7925x8 c7925x8) {
        C7163t8 c7163t8 = (C7163t8) c7925x8.keySet();
        C7925x8 c7925x82 = c7163t8.a;
        if (c7925x82.isEmpty()) {
            return;
        }
        if (c7925x8.c > 999) {
            C7925x8 c7925x83 = new C7925x8(999);
            int i = c7925x8.c;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                c7925x83.put((String) c7925x8.i(i2), (ArrayList) c7925x8.m(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    a(c7925x83);
                    c7925x83 = new C7925x8(999);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                a(c7925x83);
                return;
            }
            return;
        }
        StringBuilder sbO = AbstractC8235ym.o("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int i4 = c7925x82.c;
        AbstractC8259yu.a(i4, sbO);
        sbO.append(")");
        C6655qT0 c6655qT0A = C6655qT0.a(i4, sbO.toString());
        Iterator it = c7163t8.iterator();
        int i5 = 1;
        while (true) {
            C6972s8 c6972s8 = (C6972s8) it;
            if (!c6972s8.hasNext()) {
                break;
            }
            String str = (String) c6972s8.next();
            if (str == null) {
                c6655qT0A.V(i5);
            } else {
                c6655qT0A.d(i5, str);
            }
            i5++;
        }
        Cursor cursorC = RY1.c((WorkDatabase_Impl) this.a, c6655qT0A, false);
        try {
            int iB = MY1.b(cursorC, "work_spec_id");
            if (iB == -1) {
                return;
            }
            while (cursorC.moveToNext()) {
                byte[] blob = null;
                ArrayList arrayList = (ArrayList) c7925x8.getOrDefault(cursorC.getString(iB), null);
                if (arrayList != null) {
                    if (!cursorC.isNull(0)) {
                        blob = cursorC.getBlob(0);
                    }
                    arrayList.add(C8317zC.a(blob));
                }
            }
        } finally {
            cursorC.close();
        }
    }

    public void b(C7925x8 c7925x8) {
        C7163t8 c7163t8 = (C7163t8) c7925x8.keySet();
        C7925x8 c7925x82 = c7163t8.a;
        if (c7925x82.isEmpty()) {
            return;
        }
        if (c7925x8.c > 999) {
            C7925x8 c7925x83 = new C7925x8(999);
            int i = c7925x8.c;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                c7925x83.put((String) c7925x8.i(i2), (ArrayList) c7925x8.m(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    b(c7925x83);
                    c7925x83 = new C7925x8(999);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                b(c7925x83);
                return;
            }
            return;
        }
        StringBuilder sbO = AbstractC8235ym.o("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int i4 = c7925x82.c;
        AbstractC8259yu.a(i4, sbO);
        sbO.append(")");
        C6655qT0 c6655qT0A = C6655qT0.a(i4, sbO.toString());
        Iterator it = c7163t8.iterator();
        int i5 = 1;
        while (true) {
            C6972s8 c6972s8 = (C6972s8) it;
            if (!c6972s8.hasNext()) {
                break;
            }
            String str = (String) c6972s8.next();
            if (str == null) {
                c6655qT0A.V(i5);
            } else {
                c6655qT0A.d(i5, str);
            }
            i5++;
        }
        Cursor cursorC = RY1.c((WorkDatabase_Impl) this.a, c6655qT0A, false);
        try {
            int iB = MY1.b(cursorC, "work_spec_id");
            if (iB == -1) {
                return;
            }
            while (cursorC.moveToNext()) {
                String string = null;
                ArrayList arrayList = (ArrayList) c7925x8.getOrDefault(cursorC.getString(iB), null);
                if (arrayList != null) {
                    if (!cursorC.isNull(0)) {
                        string = cursorC.getString(0);
                    }
                    arrayList.add(string);
                }
            }
        } finally {
            cursorC.close();
        }
    }

    public LZ0 c() {
        LZ0 lz0 = new LZ0();
        lz0.a = (AbstractC6659qU1) this.a;
        lz0.b = (AbstractC6659qU1) this.b;
        lz0.c = (AbstractC6659qU1) this.c;
        lz0.d = (AbstractC6659qU1) this.d;
        lz0.e = (InterfaceC8274yz) this.e;
        lz0.f = (InterfaceC8274yz) this.f;
        lz0.g = (InterfaceC8274yz) this.g;
        lz0.h = (InterfaceC8274yz) this.h;
        lz0.i = (C3759fN) this.i;
        lz0.j = (C3759fN) this.j;
        lz0.k = (C3759fN) this.k;
        lz0.l = (C3759fN) this.l;
        return lz0;
    }

    public void e(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        C5581kr0 c5581kr0 = (C5581kr0) this.d;
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
        } finally {
            workDatabase_Impl.j();
            c5581kr0.f(c3414dZA);
        }
    }

    public ArrayList f() throws Throwable {
        C6655qT0 c6655qT0;
        int iC;
        int iC2;
        int iC3;
        int iC4;
        int iC5;
        int iC6;
        int iC7;
        int iC8;
        int iC9;
        int iC10;
        int iC11;
        int iC12;
        int iC13;
        int iC14;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        C6655qT0 c6655qT0A = C6655qT0.a(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        c6655qT0A.E(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorC = RY1.c(workDatabase_Impl, c6655qT0A, false);
        try {
            iC = MY1.c(cursorC, NotificationConstants.ID);
            iC2 = MY1.c(cursorC, "state");
            iC3 = MY1.c(cursorC, "worker_class_name");
            iC4 = MY1.c(cursorC, "input_merger_class_name");
            iC5 = MY1.c(cursorC, "input");
            iC6 = MY1.c(cursorC, "output");
            iC7 = MY1.c(cursorC, "initial_delay");
            iC8 = MY1.c(cursorC, "interval_duration");
            iC9 = MY1.c(cursorC, "flex_duration");
            iC10 = MY1.c(cursorC, "run_attempt_count");
            iC11 = MY1.c(cursorC, "backoff_policy");
            iC12 = MY1.c(cursorC, "backoff_delay_duration");
            iC13 = MY1.c(cursorC, "last_enqueue_time");
            iC14 = MY1.c(cursorC, "minimum_retention_duration");
            c6655qT0 = c6655qT0A;
        } catch (Throwable th) {
            th = th;
            c6655qT0 = c6655qT0A;
        }
        try {
            int iC15 = MY1.c(cursorC, "schedule_requested_at");
            int iC16 = MY1.c(cursorC, "run_in_foreground");
            int iC17 = MY1.c(cursorC, "out_of_quota_policy");
            int iC18 = MY1.c(cursorC, "period_count");
            int iC19 = MY1.c(cursorC, "generation");
            int iC20 = MY1.c(cursorC, "required_network_type");
            int iC21 = MY1.c(cursorC, "requires_charging");
            int iC22 = MY1.c(cursorC, "requires_device_idle");
            int iC23 = MY1.c(cursorC, "requires_battery_not_low");
            int iC24 = MY1.c(cursorC, "requires_storage_not_low");
            int iC25 = MY1.c(cursorC, "trigger_content_update_delay");
            int iC26 = MY1.c(cursorC, "trigger_max_content_delay");
            int iC27 = MY1.c(cursorC, "content_uri_triggers");
            int i6 = iC14;
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                byte[] blob = null;
                String string = cursorC.isNull(iC) ? null : cursorC.getString(iC);
                int iG = AbstractC5997n12.g(cursorC.getInt(iC2));
                String string2 = cursorC.isNull(iC3) ? null : cursorC.getString(iC3);
                String string3 = cursorC.isNull(iC4) ? null : cursorC.getString(iC4);
                C8317zC c8317zCA = C8317zC.a(cursorC.isNull(iC5) ? null : cursorC.getBlob(iC5));
                C8317zC c8317zCA2 = C8317zC.a(cursorC.isNull(iC6) ? null : cursorC.getBlob(iC6));
                long j = cursorC.getLong(iC7);
                long j2 = cursorC.getLong(iC8);
                long j3 = cursorC.getLong(iC9);
                int i7 = cursorC.getInt(iC10);
                int iD = AbstractC5997n12.d(cursorC.getInt(iC11));
                long j4 = cursorC.getLong(iC12);
                long j5 = cursorC.getLong(iC13);
                int i8 = i6;
                long j6 = cursorC.getLong(i8);
                int i9 = iC;
                int i10 = iC15;
                long j7 = cursorC.getLong(i10);
                iC15 = i10;
                int i11 = iC16;
                if (cursorC.getInt(i11) != 0) {
                    iC16 = i11;
                    i = iC17;
                    z = true;
                } else {
                    iC16 = i11;
                    i = iC17;
                    z = false;
                }
                int iF = AbstractC5997n12.f(cursorC.getInt(i));
                iC17 = i;
                int i12 = iC18;
                int i13 = cursorC.getInt(i12);
                iC18 = i12;
                int i14 = iC19;
                int i15 = cursorC.getInt(i14);
                iC19 = i14;
                int i16 = iC20;
                int iE = AbstractC5997n12.e(cursorC.getInt(i16));
                iC20 = i16;
                int i17 = iC21;
                if (cursorC.getInt(i17) != 0) {
                    iC21 = i17;
                    i2 = iC22;
                    z2 = true;
                } else {
                    iC21 = i17;
                    i2 = iC22;
                    z2 = false;
                }
                if (cursorC.getInt(i2) != 0) {
                    iC22 = i2;
                    i3 = iC23;
                    z3 = true;
                } else {
                    iC22 = i2;
                    i3 = iC23;
                    z3 = false;
                }
                if (cursorC.getInt(i3) != 0) {
                    iC23 = i3;
                    i4 = iC24;
                    z4 = true;
                } else {
                    iC23 = i3;
                    i4 = iC24;
                    z4 = false;
                }
                if (cursorC.getInt(i4) != 0) {
                    iC24 = i4;
                    i5 = iC25;
                    z5 = true;
                } else {
                    iC24 = i4;
                    i5 = iC25;
                    z5 = false;
                }
                long j8 = cursorC.getLong(i5);
                iC25 = i5;
                int i18 = iC26;
                long j9 = cursorC.getLong(i18);
                iC26 = i18;
                int i19 = iC27;
                if (!cursorC.isNull(i19)) {
                    blob = cursorC.getBlob(i19);
                }
                iC27 = i19;
                arrayList.add(new C1623Uo1(string, iG, string2, string3, c8317zCA, c8317zCA2, j, j2, j3, new C4061gy(iE, z2, z3, z4, z5, j8, j9, AbstractC5997n12.c(blob)), i7, iD, j4, j5, j6, j7, z, iF, i13, i15));
                iC = i9;
                i6 = i8;
            }
            cursorC.close();
            c6655qT0.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorC.close();
            c6655qT0.release();
            throw th;
        }
    }

    public ArrayList g(int i) throws Throwable {
        C6655qT0 c6655qT0;
        int iC;
        int iC2;
        int iC3;
        int iC4;
        int iC5;
        int iC6;
        int iC7;
        int iC8;
        int iC9;
        int iC10;
        int iC11;
        int iC12;
        int iC13;
        int iC14;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        C6655qT0 c6655qT0A = C6655qT0.a(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        c6655qT0A.E(1, i);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorC = RY1.c(workDatabase_Impl, c6655qT0A, false);
        try {
            iC = MY1.c(cursorC, NotificationConstants.ID);
            iC2 = MY1.c(cursorC, "state");
            iC3 = MY1.c(cursorC, "worker_class_name");
            iC4 = MY1.c(cursorC, "input_merger_class_name");
            iC5 = MY1.c(cursorC, "input");
            iC6 = MY1.c(cursorC, "output");
            iC7 = MY1.c(cursorC, "initial_delay");
            iC8 = MY1.c(cursorC, "interval_duration");
            iC9 = MY1.c(cursorC, "flex_duration");
            iC10 = MY1.c(cursorC, "run_attempt_count");
            iC11 = MY1.c(cursorC, "backoff_policy");
            iC12 = MY1.c(cursorC, "backoff_delay_duration");
            iC13 = MY1.c(cursorC, "last_enqueue_time");
            iC14 = MY1.c(cursorC, "minimum_retention_duration");
            c6655qT0 = c6655qT0A;
        } catch (Throwable th) {
            th = th;
            c6655qT0 = c6655qT0A;
        }
        try {
            int iC15 = MY1.c(cursorC, "schedule_requested_at");
            int iC16 = MY1.c(cursorC, "run_in_foreground");
            int iC17 = MY1.c(cursorC, "out_of_quota_policy");
            int iC18 = MY1.c(cursorC, "period_count");
            int iC19 = MY1.c(cursorC, "generation");
            int iC20 = MY1.c(cursorC, "required_network_type");
            int iC21 = MY1.c(cursorC, "requires_charging");
            int iC22 = MY1.c(cursorC, "requires_device_idle");
            int iC23 = MY1.c(cursorC, "requires_battery_not_low");
            int iC24 = MY1.c(cursorC, "requires_storage_not_low");
            int iC25 = MY1.c(cursorC, "trigger_content_update_delay");
            int iC26 = MY1.c(cursorC, "trigger_max_content_delay");
            int iC27 = MY1.c(cursorC, "content_uri_triggers");
            int i7 = iC14;
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                byte[] blob = null;
                String string = cursorC.isNull(iC) ? null : cursorC.getString(iC);
                int iG = AbstractC5997n12.g(cursorC.getInt(iC2));
                String string2 = cursorC.isNull(iC3) ? null : cursorC.getString(iC3);
                String string3 = cursorC.isNull(iC4) ? null : cursorC.getString(iC4);
                C8317zC c8317zCA = C8317zC.a(cursorC.isNull(iC5) ? null : cursorC.getBlob(iC5));
                C8317zC c8317zCA2 = C8317zC.a(cursorC.isNull(iC6) ? null : cursorC.getBlob(iC6));
                long j = cursorC.getLong(iC7);
                long j2 = cursorC.getLong(iC8);
                long j3 = cursorC.getLong(iC9);
                int i8 = cursorC.getInt(iC10);
                int iD = AbstractC5997n12.d(cursorC.getInt(iC11));
                long j4 = cursorC.getLong(iC12);
                long j5 = cursorC.getLong(iC13);
                int i9 = i7;
                long j6 = cursorC.getLong(i9);
                int i10 = iC;
                int i11 = iC15;
                long j7 = cursorC.getLong(i11);
                iC15 = i11;
                int i12 = iC16;
                if (cursorC.getInt(i12) != 0) {
                    iC16 = i12;
                    i2 = iC17;
                    z = true;
                } else {
                    iC16 = i12;
                    i2 = iC17;
                    z = false;
                }
                int iF = AbstractC5997n12.f(cursorC.getInt(i2));
                iC17 = i2;
                int i13 = iC18;
                int i14 = cursorC.getInt(i13);
                iC18 = i13;
                int i15 = iC19;
                int i16 = cursorC.getInt(i15);
                iC19 = i15;
                int i17 = iC20;
                int iE = AbstractC5997n12.e(cursorC.getInt(i17));
                iC20 = i17;
                int i18 = iC21;
                if (cursorC.getInt(i18) != 0) {
                    iC21 = i18;
                    i3 = iC22;
                    z2 = true;
                } else {
                    iC21 = i18;
                    i3 = iC22;
                    z2 = false;
                }
                if (cursorC.getInt(i3) != 0) {
                    iC22 = i3;
                    i4 = iC23;
                    z3 = true;
                } else {
                    iC22 = i3;
                    i4 = iC23;
                    z3 = false;
                }
                if (cursorC.getInt(i4) != 0) {
                    iC23 = i4;
                    i5 = iC24;
                    z4 = true;
                } else {
                    iC23 = i4;
                    i5 = iC24;
                    z4 = false;
                }
                if (cursorC.getInt(i5) != 0) {
                    iC24 = i5;
                    i6 = iC25;
                    z5 = true;
                } else {
                    iC24 = i5;
                    i6 = iC25;
                    z5 = false;
                }
                long j8 = cursorC.getLong(i6);
                iC25 = i6;
                int i19 = iC26;
                long j9 = cursorC.getLong(i19);
                iC26 = i19;
                int i20 = iC27;
                if (!cursorC.isNull(i20)) {
                    blob = cursorC.getBlob(i20);
                }
                iC27 = i20;
                arrayList.add(new C1623Uo1(string, iG, string2, string3, c8317zCA, c8317zCA2, j, j2, j3, new C4061gy(iE, z2, z3, z4, z5, j8, j9, AbstractC5997n12.c(blob)), i8, iD, j4, j5, j6, j7, z, iF, i14, i16));
                iC = i10;
                i7 = i9;
            }
            cursorC.close();
            c6655qT0.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorC.close();
            c6655qT0.release();
            throw th;
        }
    }

    public ArrayList h() throws Throwable {
        C6655qT0 c6655qT0;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        C6655qT0 c6655qT0A = C6655qT0.a(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorC = RY1.c(workDatabase_Impl, c6655qT0A, false);
        try {
            int iC = MY1.c(cursorC, NotificationConstants.ID);
            int iC2 = MY1.c(cursorC, "state");
            int iC3 = MY1.c(cursorC, "worker_class_name");
            int iC4 = MY1.c(cursorC, "input_merger_class_name");
            int iC5 = MY1.c(cursorC, "input");
            int iC6 = MY1.c(cursorC, "output");
            int iC7 = MY1.c(cursorC, "initial_delay");
            int iC8 = MY1.c(cursorC, "interval_duration");
            int iC9 = MY1.c(cursorC, "flex_duration");
            int iC10 = MY1.c(cursorC, "run_attempt_count");
            int iC11 = MY1.c(cursorC, "backoff_policy");
            int iC12 = MY1.c(cursorC, "backoff_delay_duration");
            int iC13 = MY1.c(cursorC, "last_enqueue_time");
            int iC14 = MY1.c(cursorC, "minimum_retention_duration");
            c6655qT0 = c6655qT0A;
            try {
                int iC15 = MY1.c(cursorC, "schedule_requested_at");
                int iC16 = MY1.c(cursorC, "run_in_foreground");
                int iC17 = MY1.c(cursorC, "out_of_quota_policy");
                int iC18 = MY1.c(cursorC, "period_count");
                int iC19 = MY1.c(cursorC, "generation");
                int iC20 = MY1.c(cursorC, "required_network_type");
                int iC21 = MY1.c(cursorC, "requires_charging");
                int iC22 = MY1.c(cursorC, "requires_device_idle");
                int iC23 = MY1.c(cursorC, "requires_battery_not_low");
                int iC24 = MY1.c(cursorC, "requires_storage_not_low");
                int iC25 = MY1.c(cursorC, "trigger_content_update_delay");
                int iC26 = MY1.c(cursorC, "trigger_max_content_delay");
                int iC27 = MY1.c(cursorC, "content_uri_triggers");
                int i6 = iC14;
                ArrayList arrayList = new ArrayList(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorC.isNull(iC) ? null : cursorC.getString(iC);
                    int iG = AbstractC5997n12.g(cursorC.getInt(iC2));
                    String string2 = cursorC.isNull(iC3) ? null : cursorC.getString(iC3);
                    String string3 = cursorC.isNull(iC4) ? null : cursorC.getString(iC4);
                    C8317zC c8317zCA = C8317zC.a(cursorC.isNull(iC5) ? null : cursorC.getBlob(iC5));
                    C8317zC c8317zCA2 = C8317zC.a(cursorC.isNull(iC6) ? null : cursorC.getBlob(iC6));
                    long j = cursorC.getLong(iC7);
                    long j2 = cursorC.getLong(iC8);
                    long j3 = cursorC.getLong(iC9);
                    int i7 = cursorC.getInt(iC10);
                    int iD = AbstractC5997n12.d(cursorC.getInt(iC11));
                    long j4 = cursorC.getLong(iC12);
                    long j5 = cursorC.getLong(iC13);
                    int i8 = i6;
                    long j6 = cursorC.getLong(i8);
                    int i9 = iC;
                    int i10 = iC15;
                    long j7 = cursorC.getLong(i10);
                    iC15 = i10;
                    int i11 = iC16;
                    if (cursorC.getInt(i11) != 0) {
                        iC16 = i11;
                        i = iC17;
                        z = true;
                    } else {
                        iC16 = i11;
                        i = iC17;
                        z = false;
                    }
                    int iF = AbstractC5997n12.f(cursorC.getInt(i));
                    iC17 = i;
                    int i12 = iC18;
                    int i13 = cursorC.getInt(i12);
                    iC18 = i12;
                    int i14 = iC19;
                    int i15 = cursorC.getInt(i14);
                    iC19 = i14;
                    int i16 = iC20;
                    int iE = AbstractC5997n12.e(cursorC.getInt(i16));
                    iC20 = i16;
                    int i17 = iC21;
                    if (cursorC.getInt(i17) != 0) {
                        iC21 = i17;
                        i2 = iC22;
                        z2 = true;
                    } else {
                        iC21 = i17;
                        i2 = iC22;
                        z2 = false;
                    }
                    if (cursorC.getInt(i2) != 0) {
                        iC22 = i2;
                        i3 = iC23;
                        z3 = true;
                    } else {
                        iC22 = i2;
                        i3 = iC23;
                        z3 = false;
                    }
                    if (cursorC.getInt(i3) != 0) {
                        iC23 = i3;
                        i4 = iC24;
                        z4 = true;
                    } else {
                        iC23 = i3;
                        i4 = iC24;
                        z4 = false;
                    }
                    if (cursorC.getInt(i4) != 0) {
                        iC24 = i4;
                        i5 = iC25;
                        z5 = true;
                    } else {
                        iC24 = i4;
                        i5 = iC25;
                        z5 = false;
                    }
                    long j8 = cursorC.getLong(i5);
                    iC25 = i5;
                    int i18 = iC26;
                    long j9 = cursorC.getLong(i18);
                    iC26 = i18;
                    int i19 = iC27;
                    if (!cursorC.isNull(i19)) {
                        blob = cursorC.getBlob(i19);
                    }
                    iC27 = i19;
                    arrayList.add(new C1623Uo1(string, iG, string2, string3, c8317zCA, c8317zCA2, j, j2, j3, new C4061gy(iE, z2, z3, z4, z5, j8, j9, AbstractC5997n12.c(blob)), i7, iD, j4, j5, j6, j7, z, iF, i13, i15));
                    iC = i9;
                    i6 = i8;
                }
                cursorC.close();
                c6655qT0.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorC.close();
                c6655qT0.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c6655qT0 = c6655qT0A;
        }
    }

    public ArrayList i() {
        C6655qT0 c6655qT0;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        C6655qT0 c6655qT0A = C6655qT0.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorC = RY1.c(workDatabase_Impl, c6655qT0A, false);
        try {
            int iC = MY1.c(cursorC, NotificationConstants.ID);
            int iC2 = MY1.c(cursorC, "state");
            int iC3 = MY1.c(cursorC, "worker_class_name");
            int iC4 = MY1.c(cursorC, "input_merger_class_name");
            int iC5 = MY1.c(cursorC, "input");
            int iC6 = MY1.c(cursorC, "output");
            int iC7 = MY1.c(cursorC, "initial_delay");
            int iC8 = MY1.c(cursorC, "interval_duration");
            int iC9 = MY1.c(cursorC, "flex_duration");
            int iC10 = MY1.c(cursorC, "run_attempt_count");
            int iC11 = MY1.c(cursorC, "backoff_policy");
            int iC12 = MY1.c(cursorC, "backoff_delay_duration");
            int iC13 = MY1.c(cursorC, "last_enqueue_time");
            int iC14 = MY1.c(cursorC, "minimum_retention_duration");
            c6655qT0 = c6655qT0A;
            try {
                int iC15 = MY1.c(cursorC, "schedule_requested_at");
                int iC16 = MY1.c(cursorC, "run_in_foreground");
                int iC17 = MY1.c(cursorC, "out_of_quota_policy");
                int iC18 = MY1.c(cursorC, "period_count");
                int iC19 = MY1.c(cursorC, "generation");
                int iC20 = MY1.c(cursorC, "required_network_type");
                int iC21 = MY1.c(cursorC, "requires_charging");
                int iC22 = MY1.c(cursorC, "requires_device_idle");
                int iC23 = MY1.c(cursorC, "requires_battery_not_low");
                int iC24 = MY1.c(cursorC, "requires_storage_not_low");
                int iC25 = MY1.c(cursorC, "trigger_content_update_delay");
                int iC26 = MY1.c(cursorC, "trigger_max_content_delay");
                int iC27 = MY1.c(cursorC, "content_uri_triggers");
                int i6 = iC14;
                ArrayList arrayList = new ArrayList(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorC.isNull(iC) ? null : cursorC.getString(iC);
                    int iG = AbstractC5997n12.g(cursorC.getInt(iC2));
                    String string2 = cursorC.isNull(iC3) ? null : cursorC.getString(iC3);
                    String string3 = cursorC.isNull(iC4) ? null : cursorC.getString(iC4);
                    C8317zC c8317zCA = C8317zC.a(cursorC.isNull(iC5) ? null : cursorC.getBlob(iC5));
                    C8317zC c8317zCA2 = C8317zC.a(cursorC.isNull(iC6) ? null : cursorC.getBlob(iC6));
                    long j = cursorC.getLong(iC7);
                    long j2 = cursorC.getLong(iC8);
                    long j3 = cursorC.getLong(iC9);
                    int i7 = cursorC.getInt(iC10);
                    int iD = AbstractC5997n12.d(cursorC.getInt(iC11));
                    long j4 = cursorC.getLong(iC12);
                    long j5 = cursorC.getLong(iC13);
                    int i8 = i6;
                    long j6 = cursorC.getLong(i8);
                    int i9 = iC;
                    int i10 = iC15;
                    long j7 = cursorC.getLong(i10);
                    iC15 = i10;
                    int i11 = iC16;
                    if (cursorC.getInt(i11) != 0) {
                        iC16 = i11;
                        i = iC17;
                        z = true;
                    } else {
                        iC16 = i11;
                        i = iC17;
                        z = false;
                    }
                    int iF = AbstractC5997n12.f(cursorC.getInt(i));
                    iC17 = i;
                    int i12 = iC18;
                    int i13 = cursorC.getInt(i12);
                    iC18 = i12;
                    int i14 = iC19;
                    int i15 = cursorC.getInt(i14);
                    iC19 = i14;
                    int i16 = iC20;
                    int iE = AbstractC5997n12.e(cursorC.getInt(i16));
                    iC20 = i16;
                    int i17 = iC21;
                    if (cursorC.getInt(i17) != 0) {
                        iC21 = i17;
                        i2 = iC22;
                        z2 = true;
                    } else {
                        iC21 = i17;
                        i2 = iC22;
                        z2 = false;
                    }
                    if (cursorC.getInt(i2) != 0) {
                        iC22 = i2;
                        i3 = iC23;
                        z3 = true;
                    } else {
                        iC22 = i2;
                        i3 = iC23;
                        z3 = false;
                    }
                    if (cursorC.getInt(i3) != 0) {
                        iC23 = i3;
                        i4 = iC24;
                        z4 = true;
                    } else {
                        iC23 = i3;
                        i4 = iC24;
                        z4 = false;
                    }
                    if (cursorC.getInt(i4) != 0) {
                        iC24 = i4;
                        i5 = iC25;
                        z5 = true;
                    } else {
                        iC24 = i4;
                        i5 = iC25;
                        z5 = false;
                    }
                    long j8 = cursorC.getLong(i5);
                    iC25 = i5;
                    int i18 = iC26;
                    long j9 = cursorC.getLong(i18);
                    iC26 = i18;
                    int i19 = iC27;
                    if (!cursorC.isNull(i19)) {
                        blob = cursorC.getBlob(i19);
                    }
                    iC27 = i19;
                    arrayList.add(new C1623Uo1(string, iG, string2, string3, c8317zCA, c8317zCA2, j, j2, j3, new C4061gy(iE, z2, z3, z4, z5, j8, j9, AbstractC5997n12.c(blob)), i7, iD, j4, j5, j6, j7, z, iF, i13, i15));
                    iC = i9;
                    i6 = i8;
                }
                cursorC.close();
                c6655qT0.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorC.close();
                c6655qT0.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c6655qT0 = c6655qT0A;
        }
    }

    public int j(String str) {
        C6655qT0 c6655qT0A = C6655qT0.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            c6655qT0A.V(1);
        } else {
            c6655qT0A.d(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        int iG = 0;
        Cursor cursorC = RY1.c(workDatabase_Impl, c6655qT0A, false);
        try {
            if (cursorC.moveToFirst()) {
                Integer numValueOf = cursorC.isNull(0) ? null : Integer.valueOf(cursorC.getInt(0));
                if (numValueOf != null) {
                    iG = AbstractC5997n12.g(numValueOf.intValue());
                }
            }
            return iG;
        } finally {
            cursorC.close();
            c6655qT0A.release();
        }
    }

    public ArrayList k(String str) {
        C6655qT0 c6655qT0A = C6655qT0.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            c6655qT0A.V(1);
        } else {
            c6655qT0A.d(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorC = RY1.c(workDatabase_Impl, c6655qT0A, false);
        try {
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                arrayList.add(cursorC.isNull(0) ? null : cursorC.getString(0));
            }
            return arrayList;
        } finally {
            cursorC.close();
            c6655qT0A.release();
        }
    }

    public C1623Uo1 l(String str) {
        C6655qT0 c6655qT0;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        C6655qT0 c6655qT0A = C6655qT0.a(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            c6655qT0A.V(1);
        } else {
            c6655qT0A.d(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorC = RY1.c(workDatabase_Impl, c6655qT0A, false);
        try {
            int iC = MY1.c(cursorC, NotificationConstants.ID);
            int iC2 = MY1.c(cursorC, "state");
            int iC3 = MY1.c(cursorC, "worker_class_name");
            int iC4 = MY1.c(cursorC, "input_merger_class_name");
            int iC5 = MY1.c(cursorC, "input");
            int iC6 = MY1.c(cursorC, "output");
            int iC7 = MY1.c(cursorC, "initial_delay");
            int iC8 = MY1.c(cursorC, "interval_duration");
            int iC9 = MY1.c(cursorC, "flex_duration");
            int iC10 = MY1.c(cursorC, "run_attempt_count");
            int iC11 = MY1.c(cursorC, "backoff_policy");
            int iC12 = MY1.c(cursorC, "backoff_delay_duration");
            int iC13 = MY1.c(cursorC, "last_enqueue_time");
            int iC14 = MY1.c(cursorC, "minimum_retention_duration");
            c6655qT0 = c6655qT0A;
            try {
                int iC15 = MY1.c(cursorC, "schedule_requested_at");
                int iC16 = MY1.c(cursorC, "run_in_foreground");
                int iC17 = MY1.c(cursorC, "out_of_quota_policy");
                int iC18 = MY1.c(cursorC, "period_count");
                int iC19 = MY1.c(cursorC, "generation");
                int iC20 = MY1.c(cursorC, "required_network_type");
                int iC21 = MY1.c(cursorC, "requires_charging");
                int iC22 = MY1.c(cursorC, "requires_device_idle");
                int iC23 = MY1.c(cursorC, "requires_battery_not_low");
                int iC24 = MY1.c(cursorC, "requires_storage_not_low");
                int iC25 = MY1.c(cursorC, "trigger_content_update_delay");
                int iC26 = MY1.c(cursorC, "trigger_max_content_delay");
                int iC27 = MY1.c(cursorC, "content_uri_triggers");
                C1623Uo1 c1623Uo1 = null;
                byte[] blob = null;
                if (cursorC.moveToFirst()) {
                    String string = cursorC.isNull(iC) ? null : cursorC.getString(iC);
                    int iG = AbstractC5997n12.g(cursorC.getInt(iC2));
                    String string2 = cursorC.isNull(iC3) ? null : cursorC.getString(iC3);
                    String string3 = cursorC.isNull(iC4) ? null : cursorC.getString(iC4);
                    C8317zC c8317zCA = C8317zC.a(cursorC.isNull(iC5) ? null : cursorC.getBlob(iC5));
                    C8317zC c8317zCA2 = C8317zC.a(cursorC.isNull(iC6) ? null : cursorC.getBlob(iC6));
                    long j = cursorC.getLong(iC7);
                    long j2 = cursorC.getLong(iC8);
                    long j3 = cursorC.getLong(iC9);
                    int i6 = cursorC.getInt(iC10);
                    int iD = AbstractC5997n12.d(cursorC.getInt(iC11));
                    long j4 = cursorC.getLong(iC12);
                    long j5 = cursorC.getLong(iC13);
                    long j6 = cursorC.getLong(iC14);
                    long j7 = cursorC.getLong(iC15);
                    if (cursorC.getInt(iC16) != 0) {
                        i = iC17;
                        z = true;
                    } else {
                        i = iC17;
                        z = false;
                    }
                    int iF = AbstractC5997n12.f(cursorC.getInt(i));
                    int i7 = cursorC.getInt(iC18);
                    int i8 = cursorC.getInt(iC19);
                    int iE = AbstractC5997n12.e(cursorC.getInt(iC20));
                    if (cursorC.getInt(iC21) != 0) {
                        i2 = iC22;
                        z2 = true;
                    } else {
                        i2 = iC22;
                        z2 = false;
                    }
                    if (cursorC.getInt(i2) != 0) {
                        i3 = iC23;
                        z3 = true;
                    } else {
                        i3 = iC23;
                        z3 = false;
                    }
                    if (cursorC.getInt(i3) != 0) {
                        i4 = iC24;
                        z4 = true;
                    } else {
                        i4 = iC24;
                        z4 = false;
                    }
                    if (cursorC.getInt(i4) != 0) {
                        i5 = iC25;
                        z5 = true;
                    } else {
                        i5 = iC25;
                        z5 = false;
                    }
                    long j8 = cursorC.getLong(i5);
                    long j9 = cursorC.getLong(iC26);
                    if (!cursorC.isNull(iC27)) {
                        blob = cursorC.getBlob(iC27);
                    }
                    c1623Uo1 = new C1623Uo1(string, iG, string2, string3, c8317zCA, c8317zCA2, j, j2, j3, new C4061gy(iE, z2, z3, z4, z5, j8, j9, AbstractC5997n12.c(blob)), i6, iD, j4, j5, j6, j7, z, iF, i7, i8);
                }
                cursorC.close();
                c6655qT0.release();
                return c1623Uo1;
            } catch (Throwable th) {
                th = th;
                cursorC.close();
                c6655qT0.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c6655qT0 = c6655qT0A;
        }
    }

    public ArrayList m(String str) {
        C6655qT0 c6655qT0A = C6655qT0.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            c6655qT0A.V(1);
        } else {
            c6655qT0A.d(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorC = RY1.c(workDatabase_Impl, c6655qT0A, false);
        try {
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                String string = cursorC.isNull(0) ? null : cursorC.getString(0);
                int iG = AbstractC5997n12.g(cursorC.getInt(1));
                O90.f(string, NotificationConstants.ID);
                C1467So1 c1467So1 = new C1467So1();
                c1467So1.a = string;
                c1467So1.b = iG;
                arrayList.add(c1467So1);
            }
            return arrayList;
        } finally {
            cursorC.close();
            c6655qT0A.release();
        }
    }

    public void n(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        C5581kr0 c5581kr0 = (C5581kr0) this.k;
        C3414dZ c3414dZA = c5581kr0.a();
        c3414dZA.E(1, j);
        if (str == null) {
            c3414dZA.V(2);
        } else {
            c3414dZA.d(2, str);
        }
        workDatabase_Impl.c();
        try {
            c3414dZA.m();
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
            c5581kr0.f(c3414dZA);
        }
    }

    public void o(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        C5581kr0 c5581kr0 = (C5581kr0) this.h;
        C3414dZ c3414dZA = c5581kr0.a();
        c3414dZA.E(1, j);
        if (str == null) {
            c3414dZA.V(2);
        } else {
            c3414dZA.d(2, str);
        }
        workDatabase_Impl.c();
        try {
            c3414dZA.m();
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
            c5581kr0.f(c3414dZA);
        }
    }

    public void p(String str, C8317zC c8317zC) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        C5581kr0 c5581kr0 = (C5581kr0) this.g;
        C3414dZ c3414dZA = c5581kr0.a();
        byte[] bArrC = C8317zC.c(c8317zC);
        if (bArrC == null) {
            c3414dZA.V(1);
        } else {
            c3414dZA.I(1, bArrC);
        }
        if (str == null) {
            c3414dZA.V(2);
        } else {
            c3414dZA.d(2, str);
        }
        workDatabase_Impl.c();
        try {
            c3414dZA.m();
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
            c5581kr0.f(c3414dZA);
        }
    }

    public void q(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        C5581kr0 c5581kr0 = (C5581kr0) this.e;
        C3414dZ c3414dZA = c5581kr0.a();
        c3414dZA.E(1, AbstractC5997n12.m(i));
        if (str == null) {
            c3414dZA.V(2);
        } else {
            c3414dZA.d(2, str);
        }
        workDatabase_Impl.c();
        try {
            c3414dZA.m();
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
            c5581kr0.f(c3414dZA);
        }
    }

    public C1701Vo1() {
        this.a = new GT0();
        this.b = new GT0();
        this.c = new GT0();
        this.d = new GT0();
        this.e = new C7897x(0.0f);
        this.f = new C7897x(0.0f);
        this.g = new C7897x(0.0f);
        this.h = new C7897x(0.0f);
        this.i = new C3759fN(0);
        this.j = new C3759fN(0);
        this.k = new C3759fN(0);
        this.l = new C3759fN(0);
    }
}

package p000;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Vo1 */
/* loaded from: classes.dex */
public final class C8435Vo1 {

    /* renamed from: a */
    public Object f12763a;

    /* renamed from: b */
    public Object f12764b;

    /* renamed from: c */
    public Object f12765c;

    /* renamed from: d */
    public Object f12766d;

    /* renamed from: e */
    public Object f12767e;

    /* renamed from: f */
    public Object f12768f;

    /* renamed from: g */
    public Object f12769g;

    /* renamed from: h */
    public Object f12770h;

    /* renamed from: i */
    public Object f12771i;

    /* renamed from: j */
    public Object f12772j;

    /* renamed from: k */
    public Object f12773k;

    /* renamed from: l */
    public Object f12774l;

    public C8435Vo1(WorkDatabase_Impl workDatabase_Impl) {
        this.f12763a = workDatabase_Impl;
        this.f12764b = new C1276UH(workDatabase_Impl, 6);
        this.f12765c = new C10061kr0(workDatabase_Impl, 10);
        this.f12766d = new C10061kr0(workDatabase_Impl, 11);
        this.f12767e = new C10061kr0(workDatabase_Impl, 12);
        this.f12768f = new C10061kr0(workDatabase_Impl, 13);
        this.f12769g = new C10061kr0(workDatabase_Impl, 14);
        this.f12770h = new C10061kr0(workDatabase_Impl, 15);
        this.f12771i = new C10061kr0(workDatabase_Impl, 16);
        this.f12772j = new C10061kr0(workDatabase_Impl, 17);
        this.f12773k = new C10061kr0(workDatabase_Impl, 6);
        this.f12774l = new C10061kr0(workDatabase_Impl, 7);
        new C10061kr0(workDatabase_Impl, 8);
        new C10061kr0(workDatabase_Impl, 9);
    }

    /* renamed from: d */
    public static void m8558d(AbstractC10784qU1 abstractC10784qU1) {
        if (abstractC10784qU1 instanceof GT0) {
            ((GT0) abstractC10784qU1).getClass();
        } else if (abstractC10784qU1 instanceof C3913dC) {
            ((C3913dC) abstractC10784qU1).getClass();
        }
    }

    /* renamed from: a */
    public void m8559a(C7119x8 c7119x8) {
        C6867t8 c6867t8 = (C6867t8) c7119x8.keySet();
        C7119x8 c7119x82 = c6867t8.f42880a;
        if (c7119x82.isEmpty()) {
            return;
        }
        if (c7119x8.f6450c > 999) {
            C7119x8 c7119x83 = new C7119x8(999);
            int i = c7119x8.f6450c;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                c7119x83.put((String) c7119x8.m4827i(i2), (ArrayList) c7119x8.m4831m(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    m8559a(c7119x83);
                    c7119x83 = new C7119x8(999);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                m8559a(c7119x83);
                return;
            }
            return;
        }
        StringBuilder sbM26238o = AbstractC7222ym.m26238o("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int i4 = c7119x82.f6450c;
        AbstractC7230yu.m26270a(i4, sbM26238o);
        sbM26238o.append(")");
        C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(i4, sbM26238o.toString());
        Iterator it = c6867t8.iterator();
        int i5 = 1;
        while (true) {
            C6804s8 c6804s8 = (C6804s8) it;
            if (!c6804s8.hasNext()) {
                break;
            }
            String str = (String) c6804s8.next();
            if (str == null) {
                c10781qT0M24005a.mo2032V(i5);
            } else {
                c10781qT0M24005a.mo2033d(i5, str);
            }
            i5++;
        }
        Cursor cursorM7035c = RY1.m7035c((WorkDatabase_Impl) this.f12763a, c10781qT0M24005a, false);
        try {
            int iM5395b = MY1.m5395b(cursorM7035c, "work_spec_id");
            if (iM5395b == -1) {
                return;
            }
            while (cursorM7035c.moveToNext()) {
                byte[] blob = null;
                ArrayList arrayList = (ArrayList) c7119x8.getOrDefault(cursorM7035c.getString(iM5395b), null);
                if (arrayList != null) {
                    if (!cursorM7035c.isNull(0)) {
                        blob = cursorM7035c.getBlob(0);
                    }
                    arrayList.add(C7249zC.m26326a(blob));
                }
            }
        } finally {
            cursorM7035c.close();
        }
    }

    /* renamed from: b */
    public void m8560b(C7119x8 c7119x8) {
        C6867t8 c6867t8 = (C6867t8) c7119x8.keySet();
        C7119x8 c7119x82 = c6867t8.f42880a;
        if (c7119x82.isEmpty()) {
            return;
        }
        if (c7119x8.f6450c > 999) {
            C7119x8 c7119x83 = new C7119x8(999);
            int i = c7119x8.f6450c;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                c7119x83.put((String) c7119x8.m4827i(i2), (ArrayList) c7119x8.m4831m(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    m8560b(c7119x83);
                    c7119x83 = new C7119x8(999);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                m8560b(c7119x83);
                return;
            }
            return;
        }
        StringBuilder sbM26238o = AbstractC7222ym.m26238o("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int i4 = c7119x82.f6450c;
        AbstractC7230yu.m26270a(i4, sbM26238o);
        sbM26238o.append(")");
        C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(i4, sbM26238o.toString());
        Iterator it = c6867t8.iterator();
        int i5 = 1;
        while (true) {
            C6804s8 c6804s8 = (C6804s8) it;
            if (!c6804s8.hasNext()) {
                break;
            }
            String str = (String) c6804s8.next();
            if (str == null) {
                c10781qT0M24005a.mo2032V(i5);
            } else {
                c10781qT0M24005a.mo2033d(i5, str);
            }
            i5++;
        }
        Cursor cursorM7035c = RY1.m7035c((WorkDatabase_Impl) this.f12763a, c10781qT0M24005a, false);
        try {
            int iM5395b = MY1.m5395b(cursorM7035c, "work_spec_id");
            if (iM5395b == -1) {
                return;
            }
            while (cursorM7035c.moveToNext()) {
                String string = null;
                ArrayList arrayList = (ArrayList) c7119x8.getOrDefault(cursorM7035c.getString(iM5395b), null);
                if (arrayList != null) {
                    if (!cursorM7035c.isNull(0)) {
                        string = cursorM7035c.getString(0);
                    }
                    arrayList.add(string);
                }
            }
        } finally {
            cursorM7035c.close();
        }
    }

    /* renamed from: c */
    public LZ0 m8561c() {
        LZ0 lz0 = new LZ0();
        lz0.f6714a = (AbstractC10784qU1) this.f12763a;
        lz0.f6715b = (AbstractC10784qU1) this.f12764b;
        lz0.f6716c = (AbstractC10784qU1) this.f12765c;
        lz0.f6717d = (AbstractC10784qU1) this.f12766d;
        lz0.f6718e = (InterfaceC7235yz) this.f12767e;
        lz0.f6719f = (InterfaceC7235yz) this.f12768f;
        lz0.f6720g = (InterfaceC7235yz) this.f12769g;
        lz0.f6721h = (InterfaceC7235yz) this.f12770h;
        lz0.f6722i = (C4049fN) this.f12771i;
        lz0.f6723j = (C4049fN) this.f12772j;
        lz0.f6724k = (C4049fN) this.f12773k;
        lz0.f6725l = (C4049fN) this.f12774l;
        return lz0;
    }

    /* renamed from: e */
    public void m8562e(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f12763a;
        workDatabase_Impl.m23792b();
        C10061kr0 c10061kr0 = (C10061kr0) this.f12766d;
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
        } finally {
            workDatabase_Impl.m23795j();
            c10061kr0.m2776f(c3936dZM2771a);
        }
    }

    /* renamed from: f */
    public ArrayList m8563f() throws Throwable {
        C10781qT0 c10781qT0;
        int iM5396c;
        int iM5396c2;
        int iM5396c3;
        int iM5396c4;
        int iM5396c5;
        int iM5396c6;
        int iM5396c7;
        int iM5396c8;
        int iM5396c9;
        int iM5396c10;
        int iM5396c11;
        int iM5396c12;
        int iM5396c13;
        int iM5396c14;
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
        C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        c10781qT0M24005a.mo2030E(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f12763a;
        workDatabase_Impl.m23792b();
        Cursor cursorM7035c = RY1.m7035c(workDatabase_Impl, c10781qT0M24005a, false);
        try {
            iM5396c = MY1.m5396c(cursorM7035c, NotificationConstants.f19487ID);
            iM5396c2 = MY1.m5396c(cursorM7035c, "state");
            iM5396c3 = MY1.m5396c(cursorM7035c, "worker_class_name");
            iM5396c4 = MY1.m5396c(cursorM7035c, "input_merger_class_name");
            iM5396c5 = MY1.m5396c(cursorM7035c, "input");
            iM5396c6 = MY1.m5396c(cursorM7035c, "output");
            iM5396c7 = MY1.m5396c(cursorM7035c, "initial_delay");
            iM5396c8 = MY1.m5396c(cursorM7035c, "interval_duration");
            iM5396c9 = MY1.m5396c(cursorM7035c, "flex_duration");
            iM5396c10 = MY1.m5396c(cursorM7035c, "run_attempt_count");
            iM5396c11 = MY1.m5396c(cursorM7035c, "backoff_policy");
            iM5396c12 = MY1.m5396c(cursorM7035c, "backoff_delay_duration");
            iM5396c13 = MY1.m5396c(cursorM7035c, "last_enqueue_time");
            iM5396c14 = MY1.m5396c(cursorM7035c, "minimum_retention_duration");
            c10781qT0 = c10781qT0M24005a;
        } catch (Throwable th) {
            th = th;
            c10781qT0 = c10781qT0M24005a;
        }
        try {
            int iM5396c15 = MY1.m5396c(cursorM7035c, "schedule_requested_at");
            int iM5396c16 = MY1.m5396c(cursorM7035c, "run_in_foreground");
            int iM5396c17 = MY1.m5396c(cursorM7035c, "out_of_quota_policy");
            int iM5396c18 = MY1.m5396c(cursorM7035c, "period_count");
            int iM5396c19 = MY1.m5396c(cursorM7035c, "generation");
            int iM5396c20 = MY1.m5396c(cursorM7035c, "required_network_type");
            int iM5396c21 = MY1.m5396c(cursorM7035c, "requires_charging");
            int iM5396c22 = MY1.m5396c(cursorM7035c, "requires_device_idle");
            int iM5396c23 = MY1.m5396c(cursorM7035c, "requires_battery_not_low");
            int iM5396c24 = MY1.m5396c(cursorM7035c, "requires_storage_not_low");
            int iM5396c25 = MY1.m5396c(cursorM7035c, "trigger_content_update_delay");
            int iM5396c26 = MY1.m5396c(cursorM7035c, "trigger_max_content_delay");
            int iM5396c27 = MY1.m5396c(cursorM7035c, "content_uri_triggers");
            int i6 = iM5396c14;
            ArrayList arrayList = new ArrayList(cursorM7035c.getCount());
            while (cursorM7035c.moveToNext()) {
                byte[] blob = null;
                String string = cursorM7035c.isNull(iM5396c) ? null : cursorM7035c.getString(iM5396c);
                int iM23052g = AbstractC10340n12.m23052g(cursorM7035c.getInt(iM5396c2));
                String string2 = cursorM7035c.isNull(iM5396c3) ? null : cursorM7035c.getString(iM5396c3);
                String string3 = cursorM7035c.isNull(iM5396c4) ? null : cursorM7035c.getString(iM5396c4);
                C7249zC c7249zCM26326a = C7249zC.m26326a(cursorM7035c.isNull(iM5396c5) ? null : cursorM7035c.getBlob(iM5396c5));
                C7249zC c7249zCM26326a2 = C7249zC.m26326a(cursorM7035c.isNull(iM5396c6) ? null : cursorM7035c.getBlob(iM5396c6));
                long j = cursorM7035c.getLong(iM5396c7);
                long j2 = cursorM7035c.getLong(iM5396c8);
                long j3 = cursorM7035c.getLong(iM5396c9);
                int i7 = cursorM7035c.getInt(iM5396c10);
                int iM23049d = AbstractC10340n12.m23049d(cursorM7035c.getInt(iM5396c11));
                long j4 = cursorM7035c.getLong(iM5396c12);
                long j5 = cursorM7035c.getLong(iM5396c13);
                int i8 = i6;
                long j6 = cursorM7035c.getLong(i8);
                int i9 = iM5396c;
                int i10 = iM5396c15;
                long j7 = cursorM7035c.getLong(i10);
                iM5396c15 = i10;
                int i11 = iM5396c16;
                if (cursorM7035c.getInt(i11) != 0) {
                    iM5396c16 = i11;
                    i = iM5396c17;
                    z = true;
                } else {
                    iM5396c16 = i11;
                    i = iM5396c17;
                    z = false;
                }
                int iM23051f = AbstractC10340n12.m23051f(cursorM7035c.getInt(i));
                iM5396c17 = i;
                int i12 = iM5396c18;
                int i13 = cursorM7035c.getInt(i12);
                iM5396c18 = i12;
                int i14 = iM5396c19;
                int i15 = cursorM7035c.getInt(i14);
                iM5396c19 = i14;
                int i16 = iM5396c20;
                int iM23050e = AbstractC10340n12.m23050e(cursorM7035c.getInt(i16));
                iM5396c20 = i16;
                int i17 = iM5396c21;
                if (cursorM7035c.getInt(i17) != 0) {
                    iM5396c21 = i17;
                    i2 = iM5396c22;
                    z2 = true;
                } else {
                    iM5396c21 = i17;
                    i2 = iM5396c22;
                    z2 = false;
                }
                if (cursorM7035c.getInt(i2) != 0) {
                    iM5396c22 = i2;
                    i3 = iM5396c23;
                    z3 = true;
                } else {
                    iM5396c22 = i2;
                    i3 = iM5396c23;
                    z3 = false;
                }
                if (cursorM7035c.getInt(i3) != 0) {
                    iM5396c23 = i3;
                    i4 = iM5396c24;
                    z4 = true;
                } else {
                    iM5396c23 = i3;
                    i4 = iM5396c24;
                    z4 = false;
                }
                if (cursorM7035c.getInt(i4) != 0) {
                    iM5396c24 = i4;
                    i5 = iM5396c25;
                    z5 = true;
                } else {
                    iM5396c24 = i4;
                    i5 = iM5396c25;
                    z5 = false;
                }
                long j8 = cursorM7035c.getLong(i5);
                iM5396c25 = i5;
                int i18 = iM5396c26;
                long j9 = cursorM7035c.getLong(i18);
                iM5396c26 = i18;
                int i19 = iM5396c27;
                if (!cursorM7035c.isNull(i19)) {
                    blob = cursorM7035c.getBlob(i19);
                }
                iM5396c27 = i19;
                arrayList.add(new C8383Uo1(string, iM23052g, string2, string3, c7249zCM26326a, c7249zCM26326a2, j, j2, j3, new C4149gy(iM23050e, z2, z3, z4, z5, j8, j9, AbstractC10340n12.m23048c(blob)), i7, iM23049d, j4, j5, j6, j7, z, iM23051f, i13, i15));
                iM5396c = i9;
                i6 = i8;
            }
            cursorM7035c.close();
            c10781qT0.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorM7035c.close();
            c10781qT0.release();
            throw th;
        }
    }

    /* renamed from: g */
    public ArrayList m8564g(int i) throws Throwable {
        C10781qT0 c10781qT0;
        int iM5396c;
        int iM5396c2;
        int iM5396c3;
        int iM5396c4;
        int iM5396c5;
        int iM5396c6;
        int iM5396c7;
        int iM5396c8;
        int iM5396c9;
        int iM5396c10;
        int iM5396c11;
        int iM5396c12;
        int iM5396c13;
        int iM5396c14;
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
        C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        c10781qT0M24005a.mo2030E(1, i);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f12763a;
        workDatabase_Impl.m23792b();
        Cursor cursorM7035c = RY1.m7035c(workDatabase_Impl, c10781qT0M24005a, false);
        try {
            iM5396c = MY1.m5396c(cursorM7035c, NotificationConstants.f19487ID);
            iM5396c2 = MY1.m5396c(cursorM7035c, "state");
            iM5396c3 = MY1.m5396c(cursorM7035c, "worker_class_name");
            iM5396c4 = MY1.m5396c(cursorM7035c, "input_merger_class_name");
            iM5396c5 = MY1.m5396c(cursorM7035c, "input");
            iM5396c6 = MY1.m5396c(cursorM7035c, "output");
            iM5396c7 = MY1.m5396c(cursorM7035c, "initial_delay");
            iM5396c8 = MY1.m5396c(cursorM7035c, "interval_duration");
            iM5396c9 = MY1.m5396c(cursorM7035c, "flex_duration");
            iM5396c10 = MY1.m5396c(cursorM7035c, "run_attempt_count");
            iM5396c11 = MY1.m5396c(cursorM7035c, "backoff_policy");
            iM5396c12 = MY1.m5396c(cursorM7035c, "backoff_delay_duration");
            iM5396c13 = MY1.m5396c(cursorM7035c, "last_enqueue_time");
            iM5396c14 = MY1.m5396c(cursorM7035c, "minimum_retention_duration");
            c10781qT0 = c10781qT0M24005a;
        } catch (Throwable th) {
            th = th;
            c10781qT0 = c10781qT0M24005a;
        }
        try {
            int iM5396c15 = MY1.m5396c(cursorM7035c, "schedule_requested_at");
            int iM5396c16 = MY1.m5396c(cursorM7035c, "run_in_foreground");
            int iM5396c17 = MY1.m5396c(cursorM7035c, "out_of_quota_policy");
            int iM5396c18 = MY1.m5396c(cursorM7035c, "period_count");
            int iM5396c19 = MY1.m5396c(cursorM7035c, "generation");
            int iM5396c20 = MY1.m5396c(cursorM7035c, "required_network_type");
            int iM5396c21 = MY1.m5396c(cursorM7035c, "requires_charging");
            int iM5396c22 = MY1.m5396c(cursorM7035c, "requires_device_idle");
            int iM5396c23 = MY1.m5396c(cursorM7035c, "requires_battery_not_low");
            int iM5396c24 = MY1.m5396c(cursorM7035c, "requires_storage_not_low");
            int iM5396c25 = MY1.m5396c(cursorM7035c, "trigger_content_update_delay");
            int iM5396c26 = MY1.m5396c(cursorM7035c, "trigger_max_content_delay");
            int iM5396c27 = MY1.m5396c(cursorM7035c, "content_uri_triggers");
            int i7 = iM5396c14;
            ArrayList arrayList = new ArrayList(cursorM7035c.getCount());
            while (cursorM7035c.moveToNext()) {
                byte[] blob = null;
                String string = cursorM7035c.isNull(iM5396c) ? null : cursorM7035c.getString(iM5396c);
                int iM23052g = AbstractC10340n12.m23052g(cursorM7035c.getInt(iM5396c2));
                String string2 = cursorM7035c.isNull(iM5396c3) ? null : cursorM7035c.getString(iM5396c3);
                String string3 = cursorM7035c.isNull(iM5396c4) ? null : cursorM7035c.getString(iM5396c4);
                C7249zC c7249zCM26326a = C7249zC.m26326a(cursorM7035c.isNull(iM5396c5) ? null : cursorM7035c.getBlob(iM5396c5));
                C7249zC c7249zCM26326a2 = C7249zC.m26326a(cursorM7035c.isNull(iM5396c6) ? null : cursorM7035c.getBlob(iM5396c6));
                long j = cursorM7035c.getLong(iM5396c7);
                long j2 = cursorM7035c.getLong(iM5396c8);
                long j3 = cursorM7035c.getLong(iM5396c9);
                int i8 = cursorM7035c.getInt(iM5396c10);
                int iM23049d = AbstractC10340n12.m23049d(cursorM7035c.getInt(iM5396c11));
                long j4 = cursorM7035c.getLong(iM5396c12);
                long j5 = cursorM7035c.getLong(iM5396c13);
                int i9 = i7;
                long j6 = cursorM7035c.getLong(i9);
                int i10 = iM5396c;
                int i11 = iM5396c15;
                long j7 = cursorM7035c.getLong(i11);
                iM5396c15 = i11;
                int i12 = iM5396c16;
                if (cursorM7035c.getInt(i12) != 0) {
                    iM5396c16 = i12;
                    i2 = iM5396c17;
                    z = true;
                } else {
                    iM5396c16 = i12;
                    i2 = iM5396c17;
                    z = false;
                }
                int iM23051f = AbstractC10340n12.m23051f(cursorM7035c.getInt(i2));
                iM5396c17 = i2;
                int i13 = iM5396c18;
                int i14 = cursorM7035c.getInt(i13);
                iM5396c18 = i13;
                int i15 = iM5396c19;
                int i16 = cursorM7035c.getInt(i15);
                iM5396c19 = i15;
                int i17 = iM5396c20;
                int iM23050e = AbstractC10340n12.m23050e(cursorM7035c.getInt(i17));
                iM5396c20 = i17;
                int i18 = iM5396c21;
                if (cursorM7035c.getInt(i18) != 0) {
                    iM5396c21 = i18;
                    i3 = iM5396c22;
                    z2 = true;
                } else {
                    iM5396c21 = i18;
                    i3 = iM5396c22;
                    z2 = false;
                }
                if (cursorM7035c.getInt(i3) != 0) {
                    iM5396c22 = i3;
                    i4 = iM5396c23;
                    z3 = true;
                } else {
                    iM5396c22 = i3;
                    i4 = iM5396c23;
                    z3 = false;
                }
                if (cursorM7035c.getInt(i4) != 0) {
                    iM5396c23 = i4;
                    i5 = iM5396c24;
                    z4 = true;
                } else {
                    iM5396c23 = i4;
                    i5 = iM5396c24;
                    z4 = false;
                }
                if (cursorM7035c.getInt(i5) != 0) {
                    iM5396c24 = i5;
                    i6 = iM5396c25;
                    z5 = true;
                } else {
                    iM5396c24 = i5;
                    i6 = iM5396c25;
                    z5 = false;
                }
                long j8 = cursorM7035c.getLong(i6);
                iM5396c25 = i6;
                int i19 = iM5396c26;
                long j9 = cursorM7035c.getLong(i19);
                iM5396c26 = i19;
                int i20 = iM5396c27;
                if (!cursorM7035c.isNull(i20)) {
                    blob = cursorM7035c.getBlob(i20);
                }
                iM5396c27 = i20;
                arrayList.add(new C8383Uo1(string, iM23052g, string2, string3, c7249zCM26326a, c7249zCM26326a2, j, j2, j3, new C4149gy(iM23050e, z2, z3, z4, z5, j8, j9, AbstractC10340n12.m23048c(blob)), i8, iM23049d, j4, j5, j6, j7, z, iM23051f, i14, i16));
                iM5396c = i10;
                i7 = i9;
            }
            cursorM7035c.close();
            c10781qT0.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorM7035c.close();
            c10781qT0.release();
            throw th;
        }
    }

    /* renamed from: h */
    public ArrayList m8565h() throws Throwable {
        C10781qT0 c10781qT0;
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
        C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f12763a;
        workDatabase_Impl.m23792b();
        Cursor cursorM7035c = RY1.m7035c(workDatabase_Impl, c10781qT0M24005a, false);
        try {
            int iM5396c = MY1.m5396c(cursorM7035c, NotificationConstants.f19487ID);
            int iM5396c2 = MY1.m5396c(cursorM7035c, "state");
            int iM5396c3 = MY1.m5396c(cursorM7035c, "worker_class_name");
            int iM5396c4 = MY1.m5396c(cursorM7035c, "input_merger_class_name");
            int iM5396c5 = MY1.m5396c(cursorM7035c, "input");
            int iM5396c6 = MY1.m5396c(cursorM7035c, "output");
            int iM5396c7 = MY1.m5396c(cursorM7035c, "initial_delay");
            int iM5396c8 = MY1.m5396c(cursorM7035c, "interval_duration");
            int iM5396c9 = MY1.m5396c(cursorM7035c, "flex_duration");
            int iM5396c10 = MY1.m5396c(cursorM7035c, "run_attempt_count");
            int iM5396c11 = MY1.m5396c(cursorM7035c, "backoff_policy");
            int iM5396c12 = MY1.m5396c(cursorM7035c, "backoff_delay_duration");
            int iM5396c13 = MY1.m5396c(cursorM7035c, "last_enqueue_time");
            int iM5396c14 = MY1.m5396c(cursorM7035c, "minimum_retention_duration");
            c10781qT0 = c10781qT0M24005a;
            try {
                int iM5396c15 = MY1.m5396c(cursorM7035c, "schedule_requested_at");
                int iM5396c16 = MY1.m5396c(cursorM7035c, "run_in_foreground");
                int iM5396c17 = MY1.m5396c(cursorM7035c, "out_of_quota_policy");
                int iM5396c18 = MY1.m5396c(cursorM7035c, "period_count");
                int iM5396c19 = MY1.m5396c(cursorM7035c, "generation");
                int iM5396c20 = MY1.m5396c(cursorM7035c, "required_network_type");
                int iM5396c21 = MY1.m5396c(cursorM7035c, "requires_charging");
                int iM5396c22 = MY1.m5396c(cursorM7035c, "requires_device_idle");
                int iM5396c23 = MY1.m5396c(cursorM7035c, "requires_battery_not_low");
                int iM5396c24 = MY1.m5396c(cursorM7035c, "requires_storage_not_low");
                int iM5396c25 = MY1.m5396c(cursorM7035c, "trigger_content_update_delay");
                int iM5396c26 = MY1.m5396c(cursorM7035c, "trigger_max_content_delay");
                int iM5396c27 = MY1.m5396c(cursorM7035c, "content_uri_triggers");
                int i6 = iM5396c14;
                ArrayList arrayList = new ArrayList(cursorM7035c.getCount());
                while (cursorM7035c.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM7035c.isNull(iM5396c) ? null : cursorM7035c.getString(iM5396c);
                    int iM23052g = AbstractC10340n12.m23052g(cursorM7035c.getInt(iM5396c2));
                    String string2 = cursorM7035c.isNull(iM5396c3) ? null : cursorM7035c.getString(iM5396c3);
                    String string3 = cursorM7035c.isNull(iM5396c4) ? null : cursorM7035c.getString(iM5396c4);
                    C7249zC c7249zCM26326a = C7249zC.m26326a(cursorM7035c.isNull(iM5396c5) ? null : cursorM7035c.getBlob(iM5396c5));
                    C7249zC c7249zCM26326a2 = C7249zC.m26326a(cursorM7035c.isNull(iM5396c6) ? null : cursorM7035c.getBlob(iM5396c6));
                    long j = cursorM7035c.getLong(iM5396c7);
                    long j2 = cursorM7035c.getLong(iM5396c8);
                    long j3 = cursorM7035c.getLong(iM5396c9);
                    int i7 = cursorM7035c.getInt(iM5396c10);
                    int iM23049d = AbstractC10340n12.m23049d(cursorM7035c.getInt(iM5396c11));
                    long j4 = cursorM7035c.getLong(iM5396c12);
                    long j5 = cursorM7035c.getLong(iM5396c13);
                    int i8 = i6;
                    long j6 = cursorM7035c.getLong(i8);
                    int i9 = iM5396c;
                    int i10 = iM5396c15;
                    long j7 = cursorM7035c.getLong(i10);
                    iM5396c15 = i10;
                    int i11 = iM5396c16;
                    if (cursorM7035c.getInt(i11) != 0) {
                        iM5396c16 = i11;
                        i = iM5396c17;
                        z = true;
                    } else {
                        iM5396c16 = i11;
                        i = iM5396c17;
                        z = false;
                    }
                    int iM23051f = AbstractC10340n12.m23051f(cursorM7035c.getInt(i));
                    iM5396c17 = i;
                    int i12 = iM5396c18;
                    int i13 = cursorM7035c.getInt(i12);
                    iM5396c18 = i12;
                    int i14 = iM5396c19;
                    int i15 = cursorM7035c.getInt(i14);
                    iM5396c19 = i14;
                    int i16 = iM5396c20;
                    int iM23050e = AbstractC10340n12.m23050e(cursorM7035c.getInt(i16));
                    iM5396c20 = i16;
                    int i17 = iM5396c21;
                    if (cursorM7035c.getInt(i17) != 0) {
                        iM5396c21 = i17;
                        i2 = iM5396c22;
                        z2 = true;
                    } else {
                        iM5396c21 = i17;
                        i2 = iM5396c22;
                        z2 = false;
                    }
                    if (cursorM7035c.getInt(i2) != 0) {
                        iM5396c22 = i2;
                        i3 = iM5396c23;
                        z3 = true;
                    } else {
                        iM5396c22 = i2;
                        i3 = iM5396c23;
                        z3 = false;
                    }
                    if (cursorM7035c.getInt(i3) != 0) {
                        iM5396c23 = i3;
                        i4 = iM5396c24;
                        z4 = true;
                    } else {
                        iM5396c23 = i3;
                        i4 = iM5396c24;
                        z4 = false;
                    }
                    if (cursorM7035c.getInt(i4) != 0) {
                        iM5396c24 = i4;
                        i5 = iM5396c25;
                        z5 = true;
                    } else {
                        iM5396c24 = i4;
                        i5 = iM5396c25;
                        z5 = false;
                    }
                    long j8 = cursorM7035c.getLong(i5);
                    iM5396c25 = i5;
                    int i18 = iM5396c26;
                    long j9 = cursorM7035c.getLong(i18);
                    iM5396c26 = i18;
                    int i19 = iM5396c27;
                    if (!cursorM7035c.isNull(i19)) {
                        blob = cursorM7035c.getBlob(i19);
                    }
                    iM5396c27 = i19;
                    arrayList.add(new C8383Uo1(string, iM23052g, string2, string3, c7249zCM26326a, c7249zCM26326a2, j, j2, j3, new C4149gy(iM23050e, z2, z3, z4, z5, j8, j9, AbstractC10340n12.m23048c(blob)), i7, iM23049d, j4, j5, j6, j7, z, iM23051f, i13, i15));
                    iM5396c = i9;
                    i6 = i8;
                }
                cursorM7035c.close();
                c10781qT0.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM7035c.close();
                c10781qT0.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c10781qT0 = c10781qT0M24005a;
        }
    }

    /* renamed from: i */
    public ArrayList m8566i() {
        C10781qT0 c10781qT0;
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
        C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f12763a;
        workDatabase_Impl.m23792b();
        Cursor cursorM7035c = RY1.m7035c(workDatabase_Impl, c10781qT0M24005a, false);
        try {
            int iM5396c = MY1.m5396c(cursorM7035c, NotificationConstants.f19487ID);
            int iM5396c2 = MY1.m5396c(cursorM7035c, "state");
            int iM5396c3 = MY1.m5396c(cursorM7035c, "worker_class_name");
            int iM5396c4 = MY1.m5396c(cursorM7035c, "input_merger_class_name");
            int iM5396c5 = MY1.m5396c(cursorM7035c, "input");
            int iM5396c6 = MY1.m5396c(cursorM7035c, "output");
            int iM5396c7 = MY1.m5396c(cursorM7035c, "initial_delay");
            int iM5396c8 = MY1.m5396c(cursorM7035c, "interval_duration");
            int iM5396c9 = MY1.m5396c(cursorM7035c, "flex_duration");
            int iM5396c10 = MY1.m5396c(cursorM7035c, "run_attempt_count");
            int iM5396c11 = MY1.m5396c(cursorM7035c, "backoff_policy");
            int iM5396c12 = MY1.m5396c(cursorM7035c, "backoff_delay_duration");
            int iM5396c13 = MY1.m5396c(cursorM7035c, "last_enqueue_time");
            int iM5396c14 = MY1.m5396c(cursorM7035c, "minimum_retention_duration");
            c10781qT0 = c10781qT0M24005a;
            try {
                int iM5396c15 = MY1.m5396c(cursorM7035c, "schedule_requested_at");
                int iM5396c16 = MY1.m5396c(cursorM7035c, "run_in_foreground");
                int iM5396c17 = MY1.m5396c(cursorM7035c, "out_of_quota_policy");
                int iM5396c18 = MY1.m5396c(cursorM7035c, "period_count");
                int iM5396c19 = MY1.m5396c(cursorM7035c, "generation");
                int iM5396c20 = MY1.m5396c(cursorM7035c, "required_network_type");
                int iM5396c21 = MY1.m5396c(cursorM7035c, "requires_charging");
                int iM5396c22 = MY1.m5396c(cursorM7035c, "requires_device_idle");
                int iM5396c23 = MY1.m5396c(cursorM7035c, "requires_battery_not_low");
                int iM5396c24 = MY1.m5396c(cursorM7035c, "requires_storage_not_low");
                int iM5396c25 = MY1.m5396c(cursorM7035c, "trigger_content_update_delay");
                int iM5396c26 = MY1.m5396c(cursorM7035c, "trigger_max_content_delay");
                int iM5396c27 = MY1.m5396c(cursorM7035c, "content_uri_triggers");
                int i6 = iM5396c14;
                ArrayList arrayList = new ArrayList(cursorM7035c.getCount());
                while (cursorM7035c.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM7035c.isNull(iM5396c) ? null : cursorM7035c.getString(iM5396c);
                    int iM23052g = AbstractC10340n12.m23052g(cursorM7035c.getInt(iM5396c2));
                    String string2 = cursorM7035c.isNull(iM5396c3) ? null : cursorM7035c.getString(iM5396c3);
                    String string3 = cursorM7035c.isNull(iM5396c4) ? null : cursorM7035c.getString(iM5396c4);
                    C7249zC c7249zCM26326a = C7249zC.m26326a(cursorM7035c.isNull(iM5396c5) ? null : cursorM7035c.getBlob(iM5396c5));
                    C7249zC c7249zCM26326a2 = C7249zC.m26326a(cursorM7035c.isNull(iM5396c6) ? null : cursorM7035c.getBlob(iM5396c6));
                    long j = cursorM7035c.getLong(iM5396c7);
                    long j2 = cursorM7035c.getLong(iM5396c8);
                    long j3 = cursorM7035c.getLong(iM5396c9);
                    int i7 = cursorM7035c.getInt(iM5396c10);
                    int iM23049d = AbstractC10340n12.m23049d(cursorM7035c.getInt(iM5396c11));
                    long j4 = cursorM7035c.getLong(iM5396c12);
                    long j5 = cursorM7035c.getLong(iM5396c13);
                    int i8 = i6;
                    long j6 = cursorM7035c.getLong(i8);
                    int i9 = iM5396c;
                    int i10 = iM5396c15;
                    long j7 = cursorM7035c.getLong(i10);
                    iM5396c15 = i10;
                    int i11 = iM5396c16;
                    if (cursorM7035c.getInt(i11) != 0) {
                        iM5396c16 = i11;
                        i = iM5396c17;
                        z = true;
                    } else {
                        iM5396c16 = i11;
                        i = iM5396c17;
                        z = false;
                    }
                    int iM23051f = AbstractC10340n12.m23051f(cursorM7035c.getInt(i));
                    iM5396c17 = i;
                    int i12 = iM5396c18;
                    int i13 = cursorM7035c.getInt(i12);
                    iM5396c18 = i12;
                    int i14 = iM5396c19;
                    int i15 = cursorM7035c.getInt(i14);
                    iM5396c19 = i14;
                    int i16 = iM5396c20;
                    int iM23050e = AbstractC10340n12.m23050e(cursorM7035c.getInt(i16));
                    iM5396c20 = i16;
                    int i17 = iM5396c21;
                    if (cursorM7035c.getInt(i17) != 0) {
                        iM5396c21 = i17;
                        i2 = iM5396c22;
                        z2 = true;
                    } else {
                        iM5396c21 = i17;
                        i2 = iM5396c22;
                        z2 = false;
                    }
                    if (cursorM7035c.getInt(i2) != 0) {
                        iM5396c22 = i2;
                        i3 = iM5396c23;
                        z3 = true;
                    } else {
                        iM5396c22 = i2;
                        i3 = iM5396c23;
                        z3 = false;
                    }
                    if (cursorM7035c.getInt(i3) != 0) {
                        iM5396c23 = i3;
                        i4 = iM5396c24;
                        z4 = true;
                    } else {
                        iM5396c23 = i3;
                        i4 = iM5396c24;
                        z4 = false;
                    }
                    if (cursorM7035c.getInt(i4) != 0) {
                        iM5396c24 = i4;
                        i5 = iM5396c25;
                        z5 = true;
                    } else {
                        iM5396c24 = i4;
                        i5 = iM5396c25;
                        z5 = false;
                    }
                    long j8 = cursorM7035c.getLong(i5);
                    iM5396c25 = i5;
                    int i18 = iM5396c26;
                    long j9 = cursorM7035c.getLong(i18);
                    iM5396c26 = i18;
                    int i19 = iM5396c27;
                    if (!cursorM7035c.isNull(i19)) {
                        blob = cursorM7035c.getBlob(i19);
                    }
                    iM5396c27 = i19;
                    arrayList.add(new C8383Uo1(string, iM23052g, string2, string3, c7249zCM26326a, c7249zCM26326a2, j, j2, j3, new C4149gy(iM23050e, z2, z3, z4, z5, j8, j9, AbstractC10340n12.m23048c(blob)), i7, iM23049d, j4, j5, j6, j7, z, iM23051f, i13, i15));
                    iM5396c = i9;
                    i6 = i8;
                }
                cursorM7035c.close();
                c10781qT0.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM7035c.close();
                c10781qT0.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c10781qT0 = c10781qT0M24005a;
        }
    }

    /* renamed from: j */
    public int m8567j(String str) {
        C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            c10781qT0M24005a.mo2032V(1);
        } else {
            c10781qT0M24005a.mo2033d(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f12763a;
        workDatabase_Impl.m23792b();
        int iM23052g = 0;
        Cursor cursorM7035c = RY1.m7035c(workDatabase_Impl, c10781qT0M24005a, false);
        try {
            if (cursorM7035c.moveToFirst()) {
                Integer numValueOf = cursorM7035c.isNull(0) ? null : Integer.valueOf(cursorM7035c.getInt(0));
                if (numValueOf != null) {
                    iM23052g = AbstractC10340n12.m23052g(numValueOf.intValue());
                }
            }
            return iM23052g;
        } finally {
            cursorM7035c.close();
            c10781qT0M24005a.release();
        }
    }

    /* renamed from: k */
    public ArrayList m8568k(String str) {
        C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            c10781qT0M24005a.mo2032V(1);
        } else {
            c10781qT0M24005a.mo2033d(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f12763a;
        workDatabase_Impl.m23792b();
        Cursor cursorM7035c = RY1.m7035c(workDatabase_Impl, c10781qT0M24005a, false);
        try {
            ArrayList arrayList = new ArrayList(cursorM7035c.getCount());
            while (cursorM7035c.moveToNext()) {
                arrayList.add(cursorM7035c.isNull(0) ? null : cursorM7035c.getString(0));
            }
            return arrayList;
        } finally {
            cursorM7035c.close();
            c10781qT0M24005a.release();
        }
    }

    /* renamed from: l */
    public C8383Uo1 m8569l(String str) {
        C10781qT0 c10781qT0;
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
        C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            c10781qT0M24005a.mo2032V(1);
        } else {
            c10781qT0M24005a.mo2033d(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f12763a;
        workDatabase_Impl.m23792b();
        Cursor cursorM7035c = RY1.m7035c(workDatabase_Impl, c10781qT0M24005a, false);
        try {
            int iM5396c = MY1.m5396c(cursorM7035c, NotificationConstants.f19487ID);
            int iM5396c2 = MY1.m5396c(cursorM7035c, "state");
            int iM5396c3 = MY1.m5396c(cursorM7035c, "worker_class_name");
            int iM5396c4 = MY1.m5396c(cursorM7035c, "input_merger_class_name");
            int iM5396c5 = MY1.m5396c(cursorM7035c, "input");
            int iM5396c6 = MY1.m5396c(cursorM7035c, "output");
            int iM5396c7 = MY1.m5396c(cursorM7035c, "initial_delay");
            int iM5396c8 = MY1.m5396c(cursorM7035c, "interval_duration");
            int iM5396c9 = MY1.m5396c(cursorM7035c, "flex_duration");
            int iM5396c10 = MY1.m5396c(cursorM7035c, "run_attempt_count");
            int iM5396c11 = MY1.m5396c(cursorM7035c, "backoff_policy");
            int iM5396c12 = MY1.m5396c(cursorM7035c, "backoff_delay_duration");
            int iM5396c13 = MY1.m5396c(cursorM7035c, "last_enqueue_time");
            int iM5396c14 = MY1.m5396c(cursorM7035c, "minimum_retention_duration");
            c10781qT0 = c10781qT0M24005a;
            try {
                int iM5396c15 = MY1.m5396c(cursorM7035c, "schedule_requested_at");
                int iM5396c16 = MY1.m5396c(cursorM7035c, "run_in_foreground");
                int iM5396c17 = MY1.m5396c(cursorM7035c, "out_of_quota_policy");
                int iM5396c18 = MY1.m5396c(cursorM7035c, "period_count");
                int iM5396c19 = MY1.m5396c(cursorM7035c, "generation");
                int iM5396c20 = MY1.m5396c(cursorM7035c, "required_network_type");
                int iM5396c21 = MY1.m5396c(cursorM7035c, "requires_charging");
                int iM5396c22 = MY1.m5396c(cursorM7035c, "requires_device_idle");
                int iM5396c23 = MY1.m5396c(cursorM7035c, "requires_battery_not_low");
                int iM5396c24 = MY1.m5396c(cursorM7035c, "requires_storage_not_low");
                int iM5396c25 = MY1.m5396c(cursorM7035c, "trigger_content_update_delay");
                int iM5396c26 = MY1.m5396c(cursorM7035c, "trigger_max_content_delay");
                int iM5396c27 = MY1.m5396c(cursorM7035c, "content_uri_triggers");
                C8383Uo1 c8383Uo1 = null;
                byte[] blob = null;
                if (cursorM7035c.moveToFirst()) {
                    String string = cursorM7035c.isNull(iM5396c) ? null : cursorM7035c.getString(iM5396c);
                    int iM23052g = AbstractC10340n12.m23052g(cursorM7035c.getInt(iM5396c2));
                    String string2 = cursorM7035c.isNull(iM5396c3) ? null : cursorM7035c.getString(iM5396c3);
                    String string3 = cursorM7035c.isNull(iM5396c4) ? null : cursorM7035c.getString(iM5396c4);
                    C7249zC c7249zCM26326a = C7249zC.m26326a(cursorM7035c.isNull(iM5396c5) ? null : cursorM7035c.getBlob(iM5396c5));
                    C7249zC c7249zCM26326a2 = C7249zC.m26326a(cursorM7035c.isNull(iM5396c6) ? null : cursorM7035c.getBlob(iM5396c6));
                    long j = cursorM7035c.getLong(iM5396c7);
                    long j2 = cursorM7035c.getLong(iM5396c8);
                    long j3 = cursorM7035c.getLong(iM5396c9);
                    int i6 = cursorM7035c.getInt(iM5396c10);
                    int iM23049d = AbstractC10340n12.m23049d(cursorM7035c.getInt(iM5396c11));
                    long j4 = cursorM7035c.getLong(iM5396c12);
                    long j5 = cursorM7035c.getLong(iM5396c13);
                    long j6 = cursorM7035c.getLong(iM5396c14);
                    long j7 = cursorM7035c.getLong(iM5396c15);
                    if (cursorM7035c.getInt(iM5396c16) != 0) {
                        i = iM5396c17;
                        z = true;
                    } else {
                        i = iM5396c17;
                        z = false;
                    }
                    int iM23051f = AbstractC10340n12.m23051f(cursorM7035c.getInt(i));
                    int i7 = cursorM7035c.getInt(iM5396c18);
                    int i8 = cursorM7035c.getInt(iM5396c19);
                    int iM23050e = AbstractC10340n12.m23050e(cursorM7035c.getInt(iM5396c20));
                    if (cursorM7035c.getInt(iM5396c21) != 0) {
                        i2 = iM5396c22;
                        z2 = true;
                    } else {
                        i2 = iM5396c22;
                        z2 = false;
                    }
                    if (cursorM7035c.getInt(i2) != 0) {
                        i3 = iM5396c23;
                        z3 = true;
                    } else {
                        i3 = iM5396c23;
                        z3 = false;
                    }
                    if (cursorM7035c.getInt(i3) != 0) {
                        i4 = iM5396c24;
                        z4 = true;
                    } else {
                        i4 = iM5396c24;
                        z4 = false;
                    }
                    if (cursorM7035c.getInt(i4) != 0) {
                        i5 = iM5396c25;
                        z5 = true;
                    } else {
                        i5 = iM5396c25;
                        z5 = false;
                    }
                    long j8 = cursorM7035c.getLong(i5);
                    long j9 = cursorM7035c.getLong(iM5396c26);
                    if (!cursorM7035c.isNull(iM5396c27)) {
                        blob = cursorM7035c.getBlob(iM5396c27);
                    }
                    c8383Uo1 = new C8383Uo1(string, iM23052g, string2, string3, c7249zCM26326a, c7249zCM26326a2, j, j2, j3, new C4149gy(iM23050e, z2, z3, z4, z5, j8, j9, AbstractC10340n12.m23048c(blob)), i6, iM23049d, j4, j5, j6, j7, z, iM23051f, i7, i8);
                }
                cursorM7035c.close();
                c10781qT0.release();
                return c8383Uo1;
            } catch (Throwable th) {
                th = th;
                cursorM7035c.close();
                c10781qT0.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c10781qT0 = c10781qT0M24005a;
        }
    }

    /* renamed from: m */
    public ArrayList m8570m(String str) {
        C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            c10781qT0M24005a.mo2032V(1);
        } else {
            c10781qT0M24005a.mo2033d(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f12763a;
        workDatabase_Impl.m23792b();
        Cursor cursorM7035c = RY1.m7035c(workDatabase_Impl, c10781qT0M24005a, false);
        try {
            ArrayList arrayList = new ArrayList(cursorM7035c.getCount());
            while (cursorM7035c.moveToNext()) {
                String string = cursorM7035c.isNull(0) ? null : cursorM7035c.getString(0);
                int iM23052g = AbstractC10340n12.m23052g(cursorM7035c.getInt(1));
                O90.m5968f(string, NotificationConstants.f19487ID);
                C8279So1 c8279So1 = new C8279So1();
                c8279So1.f10987a = string;
                c8279So1.f10988b = iM23052g;
                arrayList.add(c8279So1);
            }
            return arrayList;
        } finally {
            cursorM7035c.close();
            c10781qT0M24005a.release();
        }
    }

    /* renamed from: n */
    public void m8571n(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f12763a;
        workDatabase_Impl.m23792b();
        C10061kr0 c10061kr0 = (C10061kr0) this.f12773k;
        C3936dZ c3936dZM2771a = c10061kr0.m2771a();
        c3936dZM2771a.mo2030E(1, j);
        if (str == null) {
            c3936dZM2771a.mo2032V(2);
        } else {
            c3936dZM2771a.mo2033d(2, str);
        }
        workDatabase_Impl.m23793c();
        try {
            c3936dZM2771a.m17710m();
            workDatabase_Impl.m23799n();
        } finally {
            workDatabase_Impl.m23795j();
            c10061kr0.m2776f(c3936dZM2771a);
        }
    }

    /* renamed from: o */
    public void m8572o(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f12763a;
        workDatabase_Impl.m23792b();
        C10061kr0 c10061kr0 = (C10061kr0) this.f12770h;
        C3936dZ c3936dZM2771a = c10061kr0.m2771a();
        c3936dZM2771a.mo2030E(1, j);
        if (str == null) {
            c3936dZM2771a.mo2032V(2);
        } else {
            c3936dZM2771a.mo2033d(2, str);
        }
        workDatabase_Impl.m23793c();
        try {
            c3936dZM2771a.m17710m();
            workDatabase_Impl.m23799n();
        } finally {
            workDatabase_Impl.m23795j();
            c10061kr0.m2776f(c3936dZM2771a);
        }
    }

    /* renamed from: p */
    public void m8573p(String str, C7249zC c7249zC) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f12763a;
        workDatabase_Impl.m23792b();
        C10061kr0 c10061kr0 = (C10061kr0) this.f12769g;
        C3936dZ c3936dZM2771a = c10061kr0.m2771a();
        byte[] bArrM26327c = C7249zC.m26327c(c7249zC);
        if (bArrM26327c == null) {
            c3936dZM2771a.mo2032V(1);
        } else {
            c3936dZM2771a.mo2031I(1, bArrM26327c);
        }
        if (str == null) {
            c3936dZM2771a.mo2032V(2);
        } else {
            c3936dZM2771a.mo2033d(2, str);
        }
        workDatabase_Impl.m23793c();
        try {
            c3936dZM2771a.m17710m();
            workDatabase_Impl.m23799n();
        } finally {
            workDatabase_Impl.m23795j();
            c10061kr0.m2776f(c3936dZM2771a);
        }
    }

    /* renamed from: q */
    public void m8574q(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f12763a;
        workDatabase_Impl.m23792b();
        C10061kr0 c10061kr0 = (C10061kr0) this.f12767e;
        C3936dZ c3936dZM2771a = c10061kr0.m2771a();
        c3936dZM2771a.mo2030E(1, AbstractC10340n12.m23058m(i));
        if (str == null) {
            c3936dZM2771a.mo2032V(2);
        } else {
            c3936dZM2771a.mo2033d(2, str);
        }
        workDatabase_Impl.m23793c();
        try {
            c3936dZM2771a.m17710m();
            workDatabase_Impl.m23799n();
        } finally {
            workDatabase_Impl.m23795j();
            c10061kr0.m2776f(c3936dZM2771a);
        }
    }

    public C8435Vo1() {
        this.f12763a = new GT0();
        this.f12764b = new GT0();
        this.f12765c = new GT0();
        this.f12766d = new GT0();
        this.f12767e = new C7110x(0.0f);
        this.f12768f = new C7110x(0.0f);
        this.f12769g = new C7110x(0.0f);
        this.f12770h = new C7110x(0.0f);
        this.f12771i = new C4049fN(0);
        this.f12772j = new C4049fN(0);
        this.f12773k = new C4049fN(0);
        this.f12774l = new C4049fN(0);
    }
}

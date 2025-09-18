package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qA */
/* loaded from: classes.dex */
public final class C6663qA {

    /* renamed from: a */
    public final Context f40638a;

    /* renamed from: b */
    public final C0202DC f40639b;

    /* renamed from: c */
    public final C4238iN f40640c;

    /* renamed from: d */
    public final long f40641d;

    /* renamed from: e */
    public C1339VH f40642e;

    /* renamed from: f */
    public C1339VH f40643f;

    /* renamed from: g */
    public boolean f40644g;

    /* renamed from: h */
    public C6409mA f40645h;

    /* renamed from: i */
    public final Y50 f40646i;

    /* renamed from: j */
    public final C0471HT f40647j;

    /* renamed from: k */
    public final C1262U3 f40648k;

    /* renamed from: l */
    public final C1262U3 f40649l;

    /* renamed from: m */
    public final C6220jA f40650m;

    /* renamed from: n */
    public final C6806sA f40651n;

    /* renamed from: o */
    public final C11287uQ0 f40652o;

    /* renamed from: p */
    public final C10910rT1 f40653p;

    public C6663qA(C0786MU c0786mu, Y50 y50, C6806sA c6806sA, C0202DC c0202dc, C1262U3 c1262u3, C1262U3 c1262u32, C0471HT c0471ht, C6220jA c6220jA, C11287uQ0 c11287uQ0, C10910rT1 c10910rT1) {
        this.f40639b = c0202dc;
        c0786mu.m5379a();
        this.f40638a = c0786mu.f7174a;
        this.f40646i = y50;
        this.f40651n = c6806sA;
        this.f40648k = c1262u3;
        this.f40649l = c1262u32;
        this.f40647j = c0471ht;
        this.f40650m = c6220jA;
        this.f40652o = c11287uQ0;
        this.f40653p = c10910rT1;
        this.f40641d = System.currentTimeMillis();
        this.f40640c = new C4238iN(21, (byte) 0);
    }

    /* renamed from: a */
    public final void m23937a(C1361Vd c1361Vd) throws IOException {
        File file;
        C10910rT1.m24366p();
        C10910rT1.m24366p();
        C1339VH c1339vh = this.f40642e;
        c1339vh.getClass();
        try {
            String str = (String) c1339vh.f12486b;
            C0471HT c0471ht = (C0471HT) c1339vh.f12487c;
            c0471ht.getClass();
            new File((File) c0471ht.f4311c, str).createNewFile();
        } catch (IOException unused) {
        }
        try {
            try {
                try {
                    this.f40648k.mo2907v(new C6600pA(this));
                    this.f40645h.m22697f();
                } finally {
                    C10910rT1.m24366p();
                    try {
                        C1339VH c1339vh2 = this.f40642e;
                        String str2 = (String) c1339vh2.f12486b;
                        C0471HT c0471ht2 = (C0471HT) c1339vh2.f12487c;
                        c0471ht2.getClass();
                        new File((File) c0471ht2.f4311c, str2).delete();
                    } catch (Exception unused2) {
                    }
                }
            } catch (Exception unused3) {
                return;
            }
        } catch (Exception unused4) {
            C10910rT1.m24366p();
            C1339VH c1339vh3 = this.f40642e;
            String str3 = (String) c1339vh3.f12486b;
            C0471HT c0471ht3 = (C0471HT) c1339vh3.f12487c;
            c0471ht3.getClass();
            file = new File((File) c0471ht3.f4311c, str3);
        }
        if (!c1361Vd.m8521g().f905b.f37776a) {
            throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
        }
        C6409mA c6409mA = this.f40645h;
        c6409mA.getClass();
        C10910rT1.m24366p();
        C1521YA c1521ya = (C1521YA) c6409mA.f37540n;
        if (!(c1521ya != null && c1521ya.f14185e.get())) {
            try {
                c6409mA.m22693b(true, c1361Vd, true);
            } catch (Exception unused5) {
            }
        }
        this.f40645h.m22698g(((S81) ((AtomicReference) c1361Vd.f12668i).get()).f10598a);
        C1339VH c1339vh4 = this.f40642e;
        String str4 = (String) c1339vh4.f12486b;
        C0471HT c0471ht4 = (C0471HT) c1339vh4.f12487c;
        c0471ht4.getClass();
        file = new File((File) c0471ht4.f4311c, str4);
        file.delete();
    }

    /* renamed from: b */
    public final void m23938b(Boolean bool) {
        Boolean boolM1589a;
        C0202DC c0202dc = this.f40639b;
        synchronized (c0202dc) {
            if (bool != null) {
                boolM1589a = bool;
            } else {
                C0786MU c0786mu = c0202dc.f1888b;
                c0786mu.m5379a();
                boolM1589a = c0202dc.m1589a(c0786mu.f7174a);
            }
            c0202dc.f1892f = boolM1589a;
            SharedPreferences.Editor editorEdit = c0202dc.f1887a.edit();
            if (bool != null) {
                editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
            } else {
                editorEdit.remove("firebase_crashlytics_collection_enabled");
            }
            editorEdit.apply();
            synchronized (c0202dc.f1889c) {
                try {
                    if (c0202dc.m1590b()) {
                        if (!c0202dc.f1891e) {
                            c0202dc.f1890d.m7186d(null);
                            c0202dc.f1891e = true;
                        }
                    } else if (c0202dc.f1891e) {
                        c0202dc.f1890d = new S81();
                        c0202dc.f1891e = false;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: c */
    public final void m23939c(String str, String str2) {
        ((ExecutorC1584ZA) this.f40653p.f41678b).m9502a(new RunnableC8339Ts1(this, str, str2, 14));
    }
}

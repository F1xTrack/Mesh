package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qA */
/* loaded from: classes.dex */
public final class C6597qA {
    public final Context a;
    public final DC b;
    public final C4332iN c;
    public final long d;
    public VH e;
    public VH f;
    public boolean g;
    public C5833mA h;
    public final Y50 i;
    public final HT j;
    public final U3 k;
    public final U3 l;
    public final C5260jA m;
    public final C6978sA n;
    public final C7409uQ0 o;
    public final C6846rT1 p;

    public C6597qA(MU mu, Y50 y50, C6978sA c6978sA, DC dc, U3 u3, U3 u32, HT ht, C5260jA c5260jA, C7409uQ0 c7409uQ0, C6846rT1 c6846rT1) {
        this.b = dc;
        mu.a();
        this.a = mu.a;
        this.i = y50;
        this.n = c6978sA;
        this.k = u3;
        this.l = u32;
        this.j = ht;
        this.m = c5260jA;
        this.o = c7409uQ0;
        this.p = c6846rT1;
        this.d = System.currentTimeMillis();
        this.c = new C4332iN(21, (byte) 0);
    }

    public final void a(C1666Vd c1666Vd) throws IOException {
        File file;
        C6846rT1.p();
        C6846rT1.p();
        VH vh = this.e;
        vh.getClass();
        try {
            String str = (String) vh.b;
            HT ht = (HT) vh.c;
            ht.getClass();
            new File((File) ht.c, str).createNewFile();
        } catch (IOException unused) {
        }
        try {
            try {
                try {
                    this.k.v(new C6406pA(this));
                    this.h.f();
                } finally {
                    C6846rT1.p();
                    try {
                        VH vh2 = this.e;
                        String str2 = (String) vh2.b;
                        HT ht2 = (HT) vh2.c;
                        ht2.getClass();
                        new File((File) ht2.c, str2).delete();
                    } catch (Exception unused2) {
                    }
                }
            } catch (Exception unused3) {
                return;
            }
        } catch (Exception unused4) {
            C6846rT1.p();
            VH vh3 = this.e;
            String str3 = (String) vh3.b;
            HT ht3 = (HT) vh3.c;
            ht3.getClass();
            file = new File((File) ht3.c, str3);
        }
        if (!c1666Vd.g().b.a) {
            throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
        }
        C5833mA c5833mA = this.h;
        c5833mA.getClass();
        C6846rT1.p();
        YA ya = (YA) c5833mA.n;
        if (!(ya != null && ya.e.get())) {
            try {
                c5833mA.b(true, c1666Vd, true);
            } catch (Exception unused5) {
            }
        }
        this.h.g(((S81) ((AtomicReference) c1666Vd.i).get()).a);
        VH vh4 = this.e;
        String str4 = (String) vh4.b;
        HT ht4 = (HT) vh4.c;
        ht4.getClass();
        file = new File((File) ht4.c, str4);
        file.delete();
    }

    public final void b(Boolean bool) {
        Boolean boolA;
        DC dc = this.b;
        synchronized (dc) {
            if (bool != null) {
                boolA = bool;
            } else {
                MU mu = dc.b;
                mu.a();
                boolA = dc.a(mu.a);
            }
            dc.f = boolA;
            SharedPreferences.Editor editorEdit = dc.a.edit();
            if (bool != null) {
                editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
            } else {
                editorEdit.remove("firebase_crashlytics_collection_enabled");
            }
            editorEdit.apply();
            synchronized (dc.c) {
                try {
                    if (dc.b()) {
                        if (!dc.e) {
                            dc.d.d(null);
                            dc.e = true;
                        }
                    } else if (dc.e) {
                        dc.d = new S81();
                        dc.e = false;
                    }
                } finally {
                }
            }
        }
    }

    public final void c(String str, String str2) {
        ((ZA) this.p.b).a(new RunnableC1557Ts1(this, str, str2, 14));
    }
}

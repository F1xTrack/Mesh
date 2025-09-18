package p000;

import android.content.SharedPreferences;
import android.util.Log;
import android.util.Range;
import com.google.android.gms.common.internal.Preconditions;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: sK */
/* loaded from: classes.dex */
public final class C6816sK implements InterfaceC1593ZJ {

    /* renamed from: a */
    public long f42363a;

    /* renamed from: b */
    public Object f42364b;

    /* renamed from: c */
    public Object f42365c;

    /* renamed from: d */
    public Object f42366d;

    /* renamed from: e */
    public Object f42367e;

    public C6816sK(C10152lY1 c10152lY1) {
        this.f42367e = c10152lY1;
    }

    /* renamed from: a */
    public synchronized C6736rK m24709a() {
        try {
            if (((C6736rK) this.f42367e) == null) {
                this.f42367e = C6736rK.m24279n((File) this.f42365c, this.f42363a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C6736rK) this.f42367e;
    }

    /* renamed from: b */
    public synchronized void m24710b() {
        this.f42367e = null;
    }

    /* renamed from: c */
    public void m24711c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC7222ym.m26230g(i, "The requested target bitrate ", " is not supported. Target bitrate must be greater than 0."));
        }
        C10189lr0 c10189lr0 = (C10189lr0) this.f42364b;
        C1551Ye c1551Ye = (C1551Ye) c10189lr0.f37323b;
        if (c1551Ye == null) {
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }
        C10919rY0 c10919rY0 = new C10919rY0(3, false);
        c10919rY0.f41728b = c1551Ye.f14409a;
        c10919rY0.f41729c = c1551Ye.f14410b;
        c10919rY0.f41730d = c1551Ye.f14411c;
        c10919rY0.f41731e = Integer.valueOf(c1551Ye.f14412d);
        c10919rY0.f41730d = new Range(Integer.valueOf(i), Integer.valueOf(i));
        c10189lr0.f37323b = c10919rY0.m24419q();
    }

    @Override // p000.InterfaceC1593ZJ
    public synchronized void clear() {
        try {
            try {
                C6736rK c6736rKM24709a = m24709a();
                c6736rKM24709a.close();
                AbstractC7329Ah1.m290a(c6736rKM24709a.f41514a);
            } catch (IOException unused) {
            } catch (Throwable th) {
                m24710b();
                throw th;
            }
            m24710b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p000.InterfaceC1593ZJ
    /* renamed from: d */
    public void mo5744d(InterfaceC7740If0 interfaceC7740If0, C10189lr0 c10189lr0) {
        C4109gK c4109gKM18795a;
        C6736rK c6736rKM24709a;
        boolean z;
        String strM8384z = ((C1339VH) this.f42364b).m8384z(interfaceC7740If0);
        C4238iN c4238iN = (C4238iN) this.f42366d;
        synchronized (c4238iN) {
            try {
                c4109gKM18795a = (C4109gK) ((HashMap) c4238iN.f29113b).get(strM8384z);
                if (c4109gKM18795a == null) {
                    c4109gKM18795a = ((C4172hK) c4238iN.f29114c).m18795a();
                    ((HashMap) c4238iN.f29113b).put(strM8384z, c4109gKM18795a);
                }
                c4109gKM18795a.f27676b++;
            } finally {
            }
        }
        c4109gKM18795a.f27675a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(interfaceC7740If0);
            }
            try {
                c6736rKM24709a = m24709a();
            } catch (IOException unused) {
            }
            if (c6736rKM24709a.m24282j(strM8384z) != null) {
                return;
            }
            C1338VG c1338vgM24281f = c6736rKM24709a.m24281f(strM8384z);
            if (c1338vgM24281f == null) {
                throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM8384z));
            }
            try {
                if (((InterfaceC1782bO) c10189lr0.f37323b).mo397n(c10189lr0.f37324c, c1338vgM24281f.m8345i(), (C7830Jy0) c10189lr0.f37325d)) {
                    C6736rK.m24275a((C6736rK) c1338vgM24281f.f12477e, c1338vgM24281f, true);
                    c1338vgM24281f.f12474b = true;
                }
                if (!z) {
                    c1338vgM24281f.m8340c();
                }
            } finally {
                if (!c1338vgM24281f.f12474b) {
                    try {
                        c1338vgM24281f.m8340c();
                    } catch (IOException unused2) {
                    }
                }
            }
        } finally {
            ((C4238iN) this.f42366d).m19019x(strM8384z);
        }
    }

    /* renamed from: e */
    public void m24712e(SK1 sk1) {
        Preconditions.checkNotNull(sk1);
        this.f42364b = sk1;
    }

    @Override // p000.InterfaceC1593ZJ
    /* renamed from: f */
    public File mo5746f(InterfaceC7740If0 interfaceC7740If0) {
        String strM8384z = ((C1339VH) this.f42364b).m8384z(interfaceC7740If0);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(interfaceC7740If0);
        }
        try {
            C8170Qm0 c8170Qm0M24282j = m24709a().m24282j(strM8384z);
            if (c8170Qm0M24282j != null) {
                return ((File[]) c8170Qm0M24282j.f9780b)[0];
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public boolean m24713g(long j, KK1 kk1) {
        Preconditions.checkNotNull(kk1);
        if (((ArrayList) this.f42366d) == null) {
            this.f42366d = new ArrayList();
        }
        if (((ArrayList) this.f42365c) == null) {
            this.f42365c = new ArrayList();
        }
        if (!((ArrayList) this.f42366d).isEmpty() && ((((KK1) ((ArrayList) this.f42366d).get(0)).m4616y() / 1000) / 60) / 60 != ((kk1.m4616y() / 1000) / 60) / 60) {
            return false;
        }
        long jMo3856a = this.f42363a + kk1.mo3856a(null);
        C10152lY1 c10152lY1 = (C10152lY1) this.f42367e;
        c10152lY1.m22472U();
        if (jMo3856a >= Math.max(0, ((Integer) IB1.f4804j.m3028a(null)).intValue())) {
            return false;
        }
        this.f42363a = jMo3856a;
        ((ArrayList) this.f42366d).add(kk1);
        ((ArrayList) this.f42365c).add(Long.valueOf(j));
        int size = ((ArrayList) this.f42366d).size();
        c10152lY1.m22472U();
        return size < Math.max(1, ((Integer) IB1.f4806k.m3028a(null)).intValue());
    }

    /* renamed from: h */
    public void m24714h() {
        UM1 um1 = (UM1) this.f42367e;
        um1.mo7681v1();
        long jCurrentTimeMillis = ((C9110dP1) um1.f11615b).f26044n.currentTimeMillis();
        SharedPreferences.Editor editorEdit = um1.m7993C1().edit();
        editorEdit.remove((String) this.f42365c);
        editorEdit.remove((String) this.f42366d);
        editorEdit.putLong((String) this.f42364b, jCurrentTimeMillis);
        editorEdit.apply();
    }
}

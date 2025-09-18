package defpackage;

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
public final class C7008sK implements ZJ {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public C7008sK(C5716lY1 c5716lY1) {
        this.e = c5716lY1;
    }

    public synchronized C6817rK a() {
        try {
            if (((C6817rK) this.e) == null) {
                this.e = C6817rK.n((File) this.c, this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C6817rK) this.e;
    }

    public synchronized void b() {
        this.e = null;
    }

    public void c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC8235ym.g(i, "The requested target bitrate ", " is not supported. Target bitrate must be greater than 0."));
        }
        C5772lr0 c5772lr0 = (C5772lr0) this.b;
        C1903Ye c1903Ye = (C1903Ye) c5772lr0.b;
        if (c1903Ye == null) {
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }
        C6860rY0 c6860rY0 = new C6860rY0(3, false);
        c6860rY0.b = c1903Ye.a;
        c6860rY0.c = c1903Ye.b;
        c6860rY0.d = c1903Ye.c;
        c6860rY0.e = Integer.valueOf(c1903Ye.d);
        c6860rY0.d = new Range(Integer.valueOf(i), Integer.valueOf(i));
        c5772lr0.b = c6860rY0.q();
    }

    @Override // defpackage.ZJ
    public synchronized void clear() {
        try {
            try {
                C6817rK c6817rKA = a();
                c6817rKA.close();
                AbstractC0043Ah1.a(c6817rKA.a);
            } catch (IOException unused) {
            } catch (Throwable th) {
                b();
                throw th;
            }
            b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // defpackage.ZJ
    public void d(InterfaceC0660If0 interfaceC0660If0, C5772lr0 c5772lr0) {
        C3941gK c3941gKA;
        C6817rK c6817rKA;
        boolean z;
        String strZ = ((VH) this.b).z(interfaceC0660If0);
        C4332iN c4332iN = (C4332iN) this.d;
        synchronized (c4332iN) {
            try {
                c3941gKA = (C3941gK) ((HashMap) c4332iN.b).get(strZ);
                if (c3941gKA == null) {
                    c3941gKA = ((C4132hK) c4332iN.c).a();
                    ((HashMap) c4332iN.b).put(strZ, c3941gKA);
                }
                c3941gKA.b++;
            } finally {
            }
        }
        c3941gKA.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(interfaceC0660If0);
            }
            try {
                c6817rKA = a();
            } catch (IOException unused) {
            }
            if (c6817rKA.j(strZ) != null) {
                return;
            }
            VG vgF = c6817rKA.f(strZ);
            if (vgF == null) {
                throw new IllegalStateException("Had two simultaneous puts for: ".concat(strZ));
            }
            try {
                if (((InterfaceC2315bO) c5772lr0.b).n(c5772lr0.c, vgF.i(), (C0795Jy0) c5772lr0.d)) {
                    C6817rK.a((C6817rK) vgF.e, vgF, true);
                    vgF.b = true;
                }
                if (!z) {
                    vgF.c();
                }
            } finally {
                if (!vgF.b) {
                    try {
                        vgF.c();
                    } catch (IOException unused2) {
                    }
                }
            }
        } finally {
            ((C4332iN) this.d).x(strZ);
        }
    }

    public void e(SK1 sk1) {
        Preconditions.checkNotNull(sk1);
        this.b = sk1;
    }

    @Override // defpackage.ZJ
    public File f(InterfaceC0660If0 interfaceC0660If0) {
        String strZ = ((VH) this.b).z(interfaceC0660If0);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(interfaceC0660If0);
        }
        try {
            C1304Qm0 c1304Qm0J = a().j(strZ);
            if (c1304Qm0J != null) {
                return ((File[]) c1304Qm0J.b)[0];
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public boolean g(long j, KK1 kk1) {
        Preconditions.checkNotNull(kk1);
        if (((ArrayList) this.d) == null) {
            this.d = new ArrayList();
        }
        if (((ArrayList) this.c) == null) {
            this.c = new ArrayList();
        }
        if (!((ArrayList) this.d).isEmpty() && ((((KK1) ((ArrayList) this.d).get(0)).y() / 1000) / 60) / 60 != ((kk1.y() / 1000) / 60) / 60) {
            return false;
        }
        long jA = this.a + kk1.a(null);
        C5716lY1 c5716lY1 = (C5716lY1) this.e;
        c5716lY1.U();
        if (jA >= Math.max(0, ((Integer) IB1.j.a(null)).intValue())) {
            return false;
        }
        this.a = jA;
        ((ArrayList) this.d).add(kk1);
        ((ArrayList) this.c).add(Long.valueOf(j));
        int size = ((ArrayList) this.d).size();
        c5716lY1.U();
        return size < Math.max(1, ((Integer) IB1.k.a(null)).intValue());
    }

    public void h() {
        UM1 um1 = (UM1) this.e;
        um1.v1();
        long jCurrentTimeMillis = ((C3386dP1) um1.b).n.currentTimeMillis();
        SharedPreferences.Editor editorEdit = um1.C1().edit();
        editorEdit.remove((String) this.c);
        editorEdit.remove((String) this.d);
        editorEdit.putLong((String) this.b, jCurrentTimeMillis);
        editorEdit.apply();
    }
}

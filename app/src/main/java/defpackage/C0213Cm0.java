package defpackage;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: Cm0 */
/* loaded from: classes.dex */
public final class C0213Cm0 implements InterfaceC6151nq0, InterfaceC5623l32 {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public C0213Cm0(InterfaceC1290Qh1 interfaceC1290Qh1, InterfaceC6396p61 interfaceC6396p61) {
        new WeakHashMap();
        this.d = interfaceC1290Qh1;
        this.b = new VY(new C4332iN(this, interfaceC1290Qh1, false, 19));
        this.c = new VY(new C4332iN(this, interfaceC1290Qh1, false, 19));
        this.e = interfaceC6396p61;
        C6342oq0 c6342oq0 = (C6342oq0) interfaceC6396p61.get();
        ML1.d(c6342oq0, "mMemoryCacheParamsSupplier returned null");
        this.f = c6342oq0;
        this.a = SystemClock.uptimeMillis();
    }

    @Override // defpackage.InterfaceC6151nq0
    public AbstractC8446zt U(InterfaceC4213hl interfaceC4213hl) {
        UE ueN;
        interfaceC4213hl.getClass();
        synchronized (this) {
            try {
                C1732Vz c1732Vz = (C1732Vz) ((VY) this.c).C(interfaceC4213hl);
                ueN = c1732Vz != null ? n(c1732Vz) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        m();
        l();
        return ueN;
    }

    public C8265yw a() {
        return new C8265yw((JSONObject) this.b, (Date) this.c, (JSONArray) this.d, (JSONObject) this.e, this.a, (JSONArray) this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean b(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Object r0 = r3.f     // Catch: java.lang.Throwable -> L25
            oq0 r0 = (defpackage.C6342oq0) r0     // Catch: java.lang.Throwable -> L25
            int r0 = r0.d     // Catch: java.lang.Throwable -> L25
            if (r4 > r0) goto L27
            int r0 = r3.d()     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = r3.f     // Catch: java.lang.Throwable -> L25
            oq0 r1 = (defpackage.C6342oq0) r1     // Catch: java.lang.Throwable -> L25
            int r1 = r1.b     // Catch: java.lang.Throwable -> L25
            r2 = 1
            int r1 = r1 - r2
            if (r0 > r1) goto L27
            int r0 = r3.f()     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = r3.f     // Catch: java.lang.Throwable -> L25
            oq0 r1 = (defpackage.C6342oq0) r1     // Catch: java.lang.Throwable -> L25
            int r1 = r1.a     // Catch: java.lang.Throwable -> L25
            int r1 = r1 - r4
            if (r0 > r1) goto L27
            goto L28
        L25:
            r4 = move-exception
            goto L2a
        L27:
            r2 = 0
        L28:
            monitor-exit(r3)
            return r2
        L2a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0213Cm0.b(int):boolean");
    }

    public synchronized void c(C1732Vz c1732Vz) {
        ML1.e(c1732Vz.c > 0);
        c1732Vz.c--;
    }

    public synchronized int d() {
        return ((VY) this.c).D() - ((VY) this.b).D();
    }

    @Override // defpackage.InterfaceC6151nq0
    public synchronized boolean e(EE ee) {
        return !((VY) this.c).F(ee).isEmpty();
    }

    public synchronized int f() {
        return ((VY) this.c).H() - ((VY) this.b).H();
    }

    @Override // defpackage.InterfaceC6151nq0
    public int g(OU ou) {
        ArrayList arrayListA0;
        ArrayList arrayListA02;
        synchronized (this) {
            arrayListA0 = ((VY) this.b).a0(ou);
            arrayListA02 = ((VY) this.c).a0(ou);
            j(arrayListA02);
        }
        Iterator it = arrayListA02.iterator();
        while (it.hasNext()) {
            AbstractC8446zt.p(o((C1732Vz) it.next()));
        }
        Iterator it2 = arrayListA0.iterator();
        while (it2.hasNext()) {
        }
        m();
        l();
        return arrayListA02.size();
    }

    public synchronized void h(C1732Vz c1732Vz) {
        ML1.e(!c1732Vz.d);
        c1732Vz.c++;
    }

    public synchronized void i(C1732Vz c1732Vz) {
        c1732Vz.getClass();
        ML1.e(!c1732Vz.d);
        c1732Vz.d = true;
    }

    public synchronized void j(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i((C1732Vz) it.next());
            }
        }
    }

    @Override // defpackage.InterfaceC6151nq0
    public AbstractC8446zt j0(InterfaceC4213hl interfaceC4213hl, AbstractC8446zt abstractC8446zt) {
        UE ueN;
        AbstractC8446zt abstractC8446ztO;
        interfaceC4213hl.getClass();
        abstractC8446zt.getClass();
        m();
        synchronized (this) {
            try {
                C1732Vz c1732Vz = (C1732Vz) ((VY) this.c).Z(interfaceC4213hl);
                ueN = null;
                if (c1732Vz != null) {
                    i(c1732Vz);
                    abstractC8446ztO = o(c1732Vz);
                } else {
                    abstractC8446ztO = null;
                }
                if (b(((InterfaceC1290Qh1) this.d).f(abstractC8446zt.w()))) {
                    C1732Vz c1732Vz2 = new C1732Vz(interfaceC4213hl, abstractC8446zt, -1);
                    ((VY) this.c).X(interfaceC4213hl, c1732Vz2);
                    ueN = n(c1732Vz2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC8446zt.p(abstractC8446ztO);
        l();
        return ueN;
    }

    public synchronized void k(C1732Vz c1732Vz) {
        if (c1732Vz.d || c1732Vz.c != 0) {
            return;
        }
        ((VY) this.b).X(c1732Vz.a, c1732Vz);
    }

    public void l() {
        ArrayList arrayListP;
        synchronized (this) {
            ((C6342oq0) this.f).getClass();
            int iMin = Math.min(Integer.MAX_VALUE, ((C6342oq0) this.f).b - d());
            C6342oq0 c6342oq0 = (C6342oq0) this.f;
            arrayListP = p(iMin, Math.min(c6342oq0.c, c6342oq0.a - f()));
            j(arrayListP);
        }
        if (arrayListP != null) {
            Iterator it = arrayListP.iterator();
            while (it.hasNext()) {
                AbstractC8446zt.p(o((C1732Vz) it.next()));
            }
        }
        if (arrayListP != null) {
            Iterator it2 = arrayListP.iterator();
            while (it2.hasNext()) {
            }
        }
    }

    public synchronized void m() {
        if (this.a + ((C6342oq0) this.f).e > SystemClock.uptimeMillis()) {
            return;
        }
        this.a = SystemClock.uptimeMillis();
        C6342oq0 c6342oq0 = (C6342oq0) ((InterfaceC6396p61) this.e).get();
        ML1.d(c6342oq0, "mMemoryCacheParamsSupplier returned null");
        this.f = c6342oq0;
    }

    public synchronized UE n(C1732Vz c1732Vz) {
        h(c1732Vz);
        return AbstractC8446zt.S(c1732Vz.b.w(), new N8(this, c1732Vz), AbstractC8446zt.f);
    }

    public synchronized AbstractC8446zt o(C1732Vz c1732Vz) {
        c1732Vz.getClass();
        return (c1732Vz.d && c1732Vz.c == 0) ? c1732Vz.b : null;
    }

    public synchronized ArrayList p(int i, int i2) {
        int iMax = Math.max(i, 0);
        int iMax2 = Math.max(i2, 0);
        if (((VY) this.b).D() <= iMax && ((VY) this.b).H() <= iMax2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (((VY) this.b).D() <= iMax && ((VY) this.b).H() <= iMax2) {
                return arrayList;
            }
            Object objE = ((VY) this.b).E();
            if (objE == null) {
                throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(((VY) this.b).D()), Integer.valueOf(((VY) this.b).H())));
            }
            ((VY) this.b).Z(objE);
            arrayList.add((C1732Vz) ((VY) this.c).Z(objE));
        }
    }

    @Override // defpackage.InterfaceC5623l32
    public VY zza() {
        C6465pT1 c6465pT1 = (C6465pT1) this.b;
        long j = this.a;
        EnumC6184o02 enumC6184o02 = (EnumC6184o02) this.c;
        C0951Ly1 c0951Ly1 = (C0951Ly1) this.d;
        C0951Ly1 c0951Ly12 = (C0951Ly1) this.e;
        E80 e80 = (E80) this.f;
        c6465pT1.getClass();
        C6045nH c6045nH = new C6045nH();
        C7375uF c7375uF = new C7375uF();
        c7375uF.a = Long.valueOf(j & Long.MAX_VALUE);
        c7375uF.b = enumC6184o02;
        c7375uF.c = Boolean.valueOf(C6465pT1.l);
        Boolean bool = Boolean.TRUE;
        c7375uF.d = bool;
        c7375uF.e = bool;
        c6045nH.a = new ZZ1(c7375uF);
        c6045nH.b = IA1.a(c6465pT1.e);
        c6045nH.c = c0951Ly1.d();
        c6045nH.d = c0951Ly12.d();
        int i = e80.f;
        C6465pT1.k.getClass();
        int i2 = e80.f;
        int allocationByteCount = i2 == -1 ? ((Bitmap) Preconditions.checkNotNull(e80.a)).getAllocationByteCount() : (i2 == 17 || i2 == 842094169) ? ((ByteBuffer) Preconditions.checkNotNull(null)).limit() : i2 != 35 ? 0 : (((Image.Plane[]) Preconditions.checkNotNull(e80.b()))[0].getBuffer().limit() * 3) / 2;
        TZ1 tz1 = new TZ1();
        tz1.a = i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? UZ1.UNKNOWN_FORMAT : UZ1.NV21 : UZ1.NV16 : UZ1.YV12 : UZ1.YUV_420_888 : UZ1.BITMAP;
        tz1.b = Integer.valueOf(Integer.MAX_VALUE & allocationByteCount);
        c6045nH.e = new VZ1(tz1);
        U41 u41 = new U41();
        u41.c = c6465pT1.j ? EnumC5993n02.TYPE_THICK : EnumC5993n02.TYPE_THIN;
        u41.d = new B02(c6045nH);
        return new VY(u41, 0);
    }
}

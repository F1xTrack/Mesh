package p000;

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
public final class C7442Cm0 implements InterfaceC10443nq0, InterfaceC10090l32 {

    /* renamed from: a */
    public long f1648a;

    /* renamed from: b */
    public Object f1649b;

    /* renamed from: c */
    public Object f1650c;

    /* renamed from: d */
    public Object f1651d;

    /* renamed from: e */
    public Object f1652e;

    /* renamed from: f */
    public Object f1653f;

    public C7442Cm0(InterfaceC8161Qh1 interfaceC8161Qh1, InterfaceC10608p61 interfaceC10608p61) {
        new WeakHashMap();
        this.f1651d = interfaceC8161Qh1;
        this.f1649b = new C1356VY(new C4238iN(this, interfaceC8161Qh1, false, 19));
        this.f1650c = new C1356VY(new C4238iN(this, interfaceC8161Qh1, false, 19));
        this.f1652e = interfaceC10608p61;
        C10571oq0 c10571oq0 = (C10571oq0) interfaceC10608p61.get();
        ML1.m5337d(c10571oq0, "mMemoryCacheParamsSupplier returned null");
        this.f1653f = c10571oq0;
        this.f1648a = SystemClock.uptimeMillis();
    }

    @Override // p000.InterfaceC10443nq0
    /* renamed from: U */
    public AbstractC7292zt mo1043U(InterfaceC4199hl interfaceC4199hl) {
        C1273UE c1273ueM1361n;
        interfaceC4199hl.getClass();
        synchronized (this) {
            try {
                C1383Vz c1383Vz = (C1383Vz) ((C1356VY) this.f1650c).m8465C(interfaceC4199hl);
                c1273ueM1361n = c1383Vz != null ? m1361n(c1383Vz) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        m1360m();
        m1359l();
        return c1273ueM1361n;
    }

    /* renamed from: a */
    public C7232yw m1350a() {
        return new C7232yw((JSONObject) this.f1649b, (Date) this.f1650c, (JSONArray) this.f1651d, (JSONObject) this.f1652e, this.f1648a, (JSONArray) this.f1653f);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0027  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean m1351b(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Object r0 = r3.f1653f     // Catch: java.lang.Throwable -> L25
            oq0 r0 = (p000.C10571oq0) r0     // Catch: java.lang.Throwable -> L25
            int r0 = r0.f39299d     // Catch: java.lang.Throwable -> L25
            if (r4 > r0) goto L27
            int r0 = r3.m1353d()     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = r3.f1653f     // Catch: java.lang.Throwable -> L25
            oq0 r1 = (p000.C10571oq0) r1     // Catch: java.lang.Throwable -> L25
            int r1 = r1.f39297b     // Catch: java.lang.Throwable -> L25
            r2 = 1
            int r1 = r1 - r2
            if (r0 > r1) goto L27
            int r0 = r3.m1354f()     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = r3.f1653f     // Catch: java.lang.Throwable -> L25
            oq0 r1 = (p000.C10571oq0) r1     // Catch: java.lang.Throwable -> L25
            int r1 = r1.f39296a     // Catch: java.lang.Throwable -> L25
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C7442Cm0.m1351b(int):boolean");
    }

    /* renamed from: c */
    public synchronized void m1352c(C1383Vz c1383Vz) {
        ML1.m5338e(c1383Vz.f12898c > 0);
        c1383Vz.f12898c--;
    }

    /* renamed from: d */
    public synchronized int m1353d() {
        return ((C1356VY) this.f1650c).m8466D() - ((C1356VY) this.f1649b).m8466D();
    }

    @Override // p000.InterfaceC10443nq0
    /* renamed from: e */
    public synchronized boolean mo1065e(C0267EE c0267ee) {
        return !((C1356VY) this.f1650c).m8468F(c0267ee).isEmpty();
    }

    /* renamed from: f */
    public synchronized int m1354f() {
        return ((C1356VY) this.f1650c).m8470H() - ((C1356VY) this.f1649b).m8470H();
    }

    @Override // p000.InterfaceC10443nq0
    /* renamed from: g */
    public int mo1071g(C0912OU c0912ou) {
        ArrayList arrayListM8488a0;
        ArrayList arrayListM8488a02;
        synchronized (this) {
            arrayListM8488a0 = ((C1356VY) this.f1649b).m8488a0(c0912ou);
            arrayListM8488a02 = ((C1356VY) this.f1650c).m8488a0(c0912ou);
            m1357j(arrayListM8488a02);
        }
        Iterator it = arrayListM8488a02.iterator();
        while (it.hasNext()) {
            AbstractC7292zt.m26569p(m1362o((C1383Vz) it.next()));
        }
        Iterator it2 = arrayListM8488a0.iterator();
        while (it2.hasNext()) {
        }
        m1360m();
        m1359l();
        return arrayListM8488a02.size();
    }

    /* renamed from: h */
    public synchronized void m1355h(C1383Vz c1383Vz) {
        ML1.m5338e(!c1383Vz.f12899d);
        c1383Vz.f12898c++;
    }

    /* renamed from: i */
    public synchronized void m1356i(C1383Vz c1383Vz) {
        c1383Vz.getClass();
        ML1.m5338e(!c1383Vz.f12899d);
        c1383Vz.f12899d = true;
    }

    /* renamed from: j */
    public synchronized void m1357j(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m1356i((C1383Vz) it.next());
            }
        }
    }

    @Override // p000.InterfaceC10443nq0
    /* renamed from: j0 */
    public AbstractC7292zt mo1081j0(InterfaceC4199hl interfaceC4199hl, AbstractC7292zt abstractC7292zt) {
        C1273UE c1273ueM1361n;
        AbstractC7292zt abstractC7292ztM1362o;
        interfaceC4199hl.getClass();
        abstractC7292zt.getClass();
        m1360m();
        synchronized (this) {
            try {
                C1383Vz c1383Vz = (C1383Vz) ((C1356VY) this.f1650c).m8487Z(interfaceC4199hl);
                c1273ueM1361n = null;
                if (c1383Vz != null) {
                    m1356i(c1383Vz);
                    abstractC7292ztM1362o = m1362o(c1383Vz);
                } else {
                    abstractC7292ztM1362o = null;
                }
                if (m1351b(((InterfaceC8161Qh1) this.f1651d).mo6747f(abstractC7292zt.m26572w()))) {
                    C1383Vz c1383Vz2 = new C1383Vz(interfaceC4199hl, abstractC7292zt, -1);
                    ((C1356VY) this.f1650c).m8485X(interfaceC4199hl, c1383Vz2);
                    c1273ueM1361n = m1361n(c1383Vz2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC7292zt.m26569p(abstractC7292ztM1362o);
        m1359l();
        return c1273ueM1361n;
    }

    /* renamed from: k */
    public synchronized void m1358k(C1383Vz c1383Vz) {
        if (c1383Vz.f12899d || c1383Vz.f12898c != 0) {
            return;
        }
        ((C1356VY) this.f1649b).m8485X(c1383Vz.f12896a, c1383Vz);
    }

    /* renamed from: l */
    public void m1359l() {
        ArrayList arrayListM1363p;
        synchronized (this) {
            ((C10571oq0) this.f1653f).getClass();
            int iMin = Math.min(Integer.MAX_VALUE, ((C10571oq0) this.f1653f).f39297b - m1353d());
            C10571oq0 c10571oq0 = (C10571oq0) this.f1653f;
            arrayListM1363p = m1363p(iMin, Math.min(c10571oq0.f39298c, c10571oq0.f39296a - m1354f()));
            m1357j(arrayListM1363p);
        }
        if (arrayListM1363p != null) {
            Iterator it = arrayListM1363p.iterator();
            while (it.hasNext()) {
                AbstractC7292zt.m26569p(m1362o((C1383Vz) it.next()));
            }
        }
        if (arrayListM1363p != null) {
            Iterator it2 = arrayListM1363p.iterator();
            while (it2.hasNext()) {
            }
        }
    }

    /* renamed from: m */
    public synchronized void m1360m() {
        if (this.f1648a + ((C10571oq0) this.f1653f).f39300e > SystemClock.uptimeMillis()) {
            return;
        }
        this.f1648a = SystemClock.uptimeMillis();
        C10571oq0 c10571oq0 = (C10571oq0) ((InterfaceC10608p61) this.f1652e).get();
        ML1.m5337d(c10571oq0, "mMemoryCacheParamsSupplier returned null");
        this.f1653f = c10571oq0;
    }

    /* renamed from: n */
    public synchronized C1273UE m1361n(C1383Vz c1383Vz) {
        m1355h(c1383Vz);
        return AbstractC7292zt.m26567S(c1383Vz.f12897b.m26572w(), new C0827N8(this, c1383Vz), AbstractC7292zt.f47072f);
    }

    /* renamed from: o */
    public synchronized AbstractC7292zt m1362o(C1383Vz c1383Vz) {
        c1383Vz.getClass();
        return (c1383Vz.f12899d && c1383Vz.f12898c == 0) ? c1383Vz.f12897b : null;
    }

    /* renamed from: p */
    public synchronized ArrayList m1363p(int i, int i2) {
        int iMax = Math.max(i, 0);
        int iMax2 = Math.max(i2, 0);
        if (((C1356VY) this.f1649b).m8466D() <= iMax && ((C1356VY) this.f1649b).m8470H() <= iMax2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (((C1356VY) this.f1649b).m8466D() <= iMax && ((C1356VY) this.f1649b).m8470H() <= iMax2) {
                return arrayList;
            }
            Object objM8467E = ((C1356VY) this.f1649b).m8467E();
            if (objM8467E == null) {
                throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(((C1356VY) this.f1649b).m8466D()), Integer.valueOf(((C1356VY) this.f1649b).m8470H())));
            }
            ((C1356VY) this.f1649b).m8487Z(objM8467E);
            arrayList.add((C1383Vz) ((C1356VY) this.f1650c).m8487Z(objM8467E));
        }
    }

    @Override // p000.InterfaceC10090l32
    public C1356VY zza() {
        C10654pT1 c10654pT1 = (C10654pT1) this.f1649b;
        long j = this.f1648a;
        EnumC10465o02 enumC10465o02 = (EnumC10465o02) this.f1650c;
        C7935Ly1 c7935Ly1 = (C7935Ly1) this.f1651d;
        C7935Ly1 c7935Ly12 = (C7935Ly1) this.f1652e;
        E80 e80 = (E80) this.f1653f;
        c10654pT1.getClass();
        C6479nH c6479nH = new C6479nH();
        C6937uF c6937uF = new C6937uF();
        c6937uF.f43616a = Long.valueOf(j & Long.MAX_VALUE);
        c6937uF.f43617b = enumC10465o02;
        c6937uF.f43618c = Boolean.valueOf(C10654pT1.f40104l);
        Boolean bool = Boolean.TRUE;
        c6937uF.f43619d = bool;
        c6937uF.f43620e = bool;
        c6479nH.f38227a = new ZZ1(c6937uF);
        c6479nH.f38228b = IA1.m3777a(c10654pT1.f40105e);
        c6479nH.f38229c = c7935Ly1.m5177d();
        c6479nH.f38230d = c7935Ly12.m5177d();
        int i = e80.f2508f;
        C10654pT1.f40103k.getClass();
        int i2 = e80.f2508f;
        int allocationByteCount = i2 == -1 ? ((Bitmap) Preconditions.checkNotNull(e80.f2503a)).getAllocationByteCount() : (i2 == 17 || i2 == 842094169) ? ((ByteBuffer) Preconditions.checkNotNull(null)).limit() : i2 != 35 ? 0 : (((Image.Plane[]) Preconditions.checkNotNull(e80.m2055b()))[0].getBuffer().limit() * 3) / 2;
        TZ1 tz1 = new TZ1();
        tz1.f11430a = i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? UZ1.UNKNOWN_FORMAT : UZ1.NV21 : UZ1.NV16 : UZ1.YV12 : UZ1.YUV_420_888 : UZ1.BITMAP;
        tz1.f11431b = Integer.valueOf(Integer.MAX_VALUE & allocationByteCount);
        c6479nH.f38231e = new VZ1(tz1);
        U41 u41 = new U41();
        u41.f11646c = c10654pT1.f40110j ? EnumC10337n02.TYPE_THICK : EnumC10337n02.TYPE_THIN;
        u41.f11647d = new B02(c6479nH);
        return new C1356VY(u41, 0);
    }
}

package defpackage;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.fragment.app.l;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.yoga.YogaNodeJNIBase;
import com.google.android.gms.common.util.DefaultClock;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.yandex.varioqub.config.model.ConfigValue;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import kotlin.KotlinVersion;

/* renamed from: rT1 */
/* loaded from: classes.dex */
public final class C6846rT1 implements O7, InterfaceC3762fO, InterfaceC7211tO, InterfaceC4094h70, PZ, InterfaceC0131Bl, InterfaceC3571eO, InterfaceC4347iS {
    public static C6846rT1 e = null;
    public static final C2276bB f = new C2276bB();
    public static final C1731Vy1 g = new C1731Vy1(3);
    public static int h = -1;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ C6846rT1(int i, boolean z) {
        this.a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean B(defpackage.NM0 r9) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6846rT1.B(NM0):boolean");
    }

    public static void E() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    public static final SharedPreferences K(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void L(Context context) throws SR1 {
        SharedPreferences sharedPreferencesK = K(context);
        if (sharedPreferencesK.edit().putLong("app_set_id_last_used_time", DefaultClock.getInstance().currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        if (strValueOf.length() != 0) {
            "Failed to store app set ID last used time for App ".concat(strValueOf);
        }
        throw new SR1("Failed to store the app set ID last used time.");
    }

    public static final void p() {
        if (((Boolean) new C2085aB(0, f, C2276bB.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 0).invoke()).booleanValue()) {
            return;
        }
        Thread.currentThread().getName();
    }

    public static final void r() {
        if (((Boolean) new C2085aB(0, f, C2276bB.class, "isBlockingThread", "isBlockingThread()Z", 0, 1).invoke()).booleanValue()) {
            return;
        }
        Thread.currentThread().getName();
    }

    public void A(ZC zc, Uri uri, Map map, long j, long j2, C6419pE0 c6419pE0) throws L31 {
        boolean z;
        boolean z2 = true;
        C7566vF c7566vF = new C7566vF(zc, j, j2);
        this.d = c7566vF;
        if (((WR) this.c) != null) {
            return;
        }
        WR[] wrArrA = ((ZR) this.b).a(uri, map);
        int length = wrArrA.length;
        N70 n70 = P70.b;
        AbstractC3588eT1.b(length, "expectedSize");
        M70 m70 = new M70(length);
        if (wrArrA.length == 1) {
            this.c = wrArrA[0];
        } else {
            int length2 = wrArrA.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    break;
                }
                WR wr = wrArrA[i];
                try {
                } catch (EOFException unused) {
                    z = ((WR) this.c) != null || c7566vF.d == j;
                } catch (Throwable th) {
                    if (((WR) this.c) == null && c7566vF.d != j) {
                        z2 = false;
                    }
                    YN1.f(z2);
                    c7566vF.f = 0;
                    throw th;
                }
                if (wr.f(c7566vF)) {
                    this.c = wr;
                    c7566vF.f = 0;
                    break;
                } else {
                    m70.e(wr.h());
                    z = ((WR) this.c) != null || c7566vF.d == j;
                    YN1.f(z);
                    c7566vF.f = 0;
                    i++;
                }
            }
            if (((WR) this.c) == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                C5601ky c5601ky = new C5601ky(", ", 1);
                Iterator it = AbstractC6949s10.b(P70.v(wrArrA), new C4403il(5)).iterator();
                StringBuilder sb2 = new StringBuilder();
                c5601ky.a(sb2, it);
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                String string = sb.toString();
                uri.getClass();
                C3769fQ0 c3769fQ0H = m70.h();
                L31 l31 = new L31(string, null, false, 1);
                P70.u(c3769fQ0H);
                throw l31;
            }
        }
        ((WR) this.c).l(c6419pE0);
    }

    public boolean C(C1258Px c1258Px, C3488dy c3488dy, boolean z) {
        int[] iArr = c3488dy.c0;
        int i = iArr[0];
        C1285Qg c1285Qg = (C1285Qg) this.c;
        c1285Qg.a = i;
        c1285Qg.b = iArr[1];
        c1285Qg.c = c3488dy.l();
        c1285Qg.d = c3488dy.i();
        c1285Qg.i = false;
        c1285Qg.j = z;
        boolean z2 = c1285Qg.a == 3;
        boolean z3 = c1285Qg.b == 3;
        boolean z4 = z2 && c3488dy.L > 0.0f;
        boolean z5 = z3 && c3488dy.L > 0.0f;
        int[] iArr2 = c3488dy.l;
        if (z4 && iArr2[0] == 4) {
            c1285Qg.a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c1285Qg.b = 1;
        }
        c1258Px.a(c3488dy, c1285Qg);
        c3488dy.y(c1285Qg.e);
        c3488dy.v(c1285Qg.f);
        c3488dy.w = c1285Qg.h;
        int i2 = c1285Qg.g;
        c3488dy.P = i2;
        c3488dy.w = i2 > 0;
        c1285Qg.j = false;
        return c1285Qg.i;
    }

    public String D() {
        if (!z()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.d;
        this.d = null;
        return str;
    }

    public void F(DM0 dm0, boolean z) {
        EM0 em0 = (EM0) dm0;
        if (em0.l() != EnumC5972mu0.a) {
            for (int iK = em0.k() - 1; iK >= 0; iK--) {
                F(em0.j(iK), z);
            }
        }
        EM0 em02 = em0.l;
        if (em02 != null) {
            UN1.c(em02.m);
            int iIndexOf = em02.m.indexOf(em0);
            UN1.c(em02.m);
            ((EM0) em02.m.remove(iIndexOf)).l = null;
            int i = em02.a;
            int[] iArr = {iIndexOf};
            int[] iArr2 = z ? new int[]{em0.a} : null;
            C8216yf1 c8216yf1 = (C8216yf1) this.b;
            c8216yf1.h.add(new C5355jf1(c8216yf1, i, iArr, (C1920Yj1[]) null, iArr2));
        }
    }

    public void G(int i) {
        ((C7409uQ0) this.d).a();
        if (i == -1) {
            return;
        }
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        if (!sparseBooleanArray.get(i)) {
            throw new C2262b60(AbstractC8235ym.g(i, "View with tag ", " is not registered as a root view"));
        }
        ((SparseArray) this.b).remove(i);
        sparseBooleanArray.delete(i);
    }

    public void H(C3679ey c3679ey, int i, int i2) {
        int i3 = c3679ey.Q;
        int i4 = c3679ey.R;
        c3679ey.Q = 0;
        c3679ey.R = 0;
        c3679ey.y(i);
        c3679ey.v(i2);
        if (i3 < 0) {
            c3679ey.Q = 0;
        } else {
            c3679ey.Q = i3;
        }
        if (i4 < 0) {
            c3679ey.R = 0;
        } else {
            c3679ey.R = i4;
        }
        ((C3679ey) this.d).E();
    }

    public void I(DM0 dm0, NM0 nm0) {
        EM0 em0 = (EM0) dm0;
        EM0 em02 = em0.h;
        if (em02 == null) {
            em0.A(false);
            return;
        }
        EM0 em03 = (EM0) dm0;
        ArrayList arrayList = em02.g;
        int iIndexOf = arrayList == null ? -1 : arrayList.indexOf(em03);
        em02.v(iIndexOf);
        F(dm0, false);
        em0.A(false);
        S91 s91 = em0.d;
        UN1.c(s91);
        int i = em0.a;
        String str = em0.b;
        UN1.c(str);
        ((C8216yf1) this.b).b(s91, i, str, nm0);
        em02.f(dm0, iIndexOf);
        d(em02, dm0, iIndexOf);
        for (int i2 = 0; i2 < em0.k(); i2++) {
            d(dm0, em0.j(i2), i2);
        }
        UN1.a(em0.c != 0);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
        sparseBooleanArray.size();
        AbstractC3393dS.j("NativeViewHierarchyOptimizer");
        UN1.a(sparseBooleanArray.size() == 0);
        e(dm0);
        for (int i3 = 0; i3 < em0.k(); i3++) {
            e(em0.j(i3));
        }
        sparseBooleanArray.clear();
    }

    public void J(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        double dA = AbstractC4266i12.a(viewGroup.getWidth());
        double dA2 = AbstractC4266i12.a(viewGroup.getHeight());
        NJ nj = new NJ(dA, dA2);
        if (nj.equals((NJ) this.c)) {
            return;
        }
        this.c = nj;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, dA2);
        writableMapCreateMap.putDouble(Snapshot.WIDTH, dA);
        T91.b((S91) this.b, "KeyboardController::windowDidResize", writableMapCreateMap);
    }

    @Override // defpackage.InterfaceC0131Bl
    public void Z(InterfaceC7089sl interfaceC7089sl, HS0 hs0) {
        O90.f(interfaceC7089sl, "call");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C6745qx0 c6745qx0 = (C6745qx0) this.b;
        c6745qx0.g = jElapsedRealtime;
        ES1 es1 = (ES1) this.d;
        C6935rx0 c6935rx0 = (C6935rx0) this.c;
        C1518Tf1 c1518Tf1 = null;
        IS0 is0 = hs0.g;
        try {
            if (is0 != null) {
                try {
                    if (hs0.n()) {
                        F71 f71 = C0908Lk.c;
                        String strB = hs0.f.b("Content-Range");
                        if (strB == null) {
                            strB = null;
                        }
                        C0908Lk c0908LkS = S20.s(strB);
                        if (c0908LkS != null && (c0908LkS.a != 0 || c0908LkS.b != Integer.MAX_VALUE)) {
                            c6745qx0.e = c0908LkS;
                            c6745qx0.d = 8;
                        }
                        es1.H(is0.m(), is0.o() < 0 ? 0 : (int) is0.o());
                    } else {
                        C6935rx0.g(c6935rx0, interfaceC7089sl, new IOException("Unexpected HTTP code " + hs0), es1);
                    }
                } catch (Exception e2) {
                    C6935rx0.g(c6935rx0, interfaceC7089sl, e2, es1);
                }
                AbstractC2141aT1.a(is0, null);
                c1518Tf1 = C1518Tf1.a;
            }
            if (c1518Tf1 == null) {
                C6935rx0.g(c6935rx0, interfaceC7089sl, new IOException("Response body null: " + hs0), es1);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2141aT1.a(is0, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC3762fO
    public /* bridge */ /* synthetic */ InterfaceC3762fO a(Class cls, InterfaceC1802Ww0 interfaceC1802Ww0) {
        ((HashMap) this.b).put(cls, interfaceC1802Ww0);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    public void b(DM0 dm0, DM0 dm02, int i) {
        EM0 em0 = (EM0) dm02;
        UN1.a(em0.l() != EnumC5972mu0.a);
        for (int i2 = 0; i2 < em0.k(); i2++) {
            EM0 em0J = em0.j(i2);
            UN1.a(em0J.l == null);
            EM0 em02 = (EM0) dm0;
            ArrayList arrayList = em02.m;
            int size = arrayList == null ? 0 : arrayList.size();
            if (em0J.l() == EnumC5972mu0.c) {
                b(em02, em0J, i);
            } else {
                c(em02, em0J, i);
            }
            ArrayList arrayList2 = em02.m;
            i += (arrayList2 == null ? 0 : arrayList2.size()) - size;
        }
    }

    public void c(DM0 dm0, DM0 dm02, int i) {
        EM0 em0 = (EM0) dm0;
        em0.getClass();
        EM0 em02 = (EM0) dm02;
        EnumC5972mu0 enumC5972mu0L = em0.l();
        EnumC5972mu0 enumC5972mu0 = EnumC5972mu0.a;
        UN1.a(enumC5972mu0L == enumC5972mu0);
        UN1.a(em02.l() != EnumC5972mu0.c);
        if (em0.m == null) {
            em0.m = new ArrayList(4);
        }
        em0.m.add(i, em02);
        em02.l = em0;
        int i2 = em0.a;
        EM0 em03 = (EM0) dm02;
        C1920Yj1[] c1920Yj1Arr = {new C1920Yj1(em03.a, i)};
        C8216yf1 c8216yf1 = (C8216yf1) this.b;
        c8216yf1.h.add(new C5355jf1(c8216yf1, i2, (int[]) null, c1920Yj1Arr, (int[]) null));
        if (em03.l() != enumC5972mu0) {
            b(dm0, dm02, i + 1);
        }
    }

    public void d(DM0 dm0, DM0 dm02, int i) {
        C1204Pf c1204Pf;
        EM0 em0 = (EM0) dm0;
        int iM = em0.m(em0.j(i));
        if (em0.l() != EnumC5972mu0.a) {
            while (true) {
                EM0 em02 = (EM0) dm0;
                if (em02.l() == EnumC5972mu0.a) {
                    c1204Pf = new C1204Pf(em02, iM, 14);
                    break;
                }
                EM0 em03 = em02.h;
                if (em03 == null) {
                    c1204Pf = null;
                    break;
                } else {
                    iM = iM + (em02.l() == EnumC5972mu0.b ? 1 : 0) + em03.m(em02);
                    dm0 = em03;
                }
            }
            if (c1204Pf == null) {
                return;
            }
            DM0 dm03 = (EM0) c1204Pf.c;
            iM = c1204Pf.b;
            dm0 = dm03;
        }
        EM0 em04 = (EM0) dm02;
        if (em04.l() != EnumC5972mu0.c) {
            c(dm0, em04, iM);
        } else {
            b(dm0, em04, iM);
        }
    }

    public void e(DM0 dm0) {
        EM0 em0 = (EM0) dm0;
        int i = em0.a;
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
        if (sparseBooleanArray.get(i)) {
            return;
        }
        sparseBooleanArray.put(i, true);
        int i2 = em0.n;
        int iRound = em0.o;
        for (EM0 em02 = em0.h; em02 != null && em02.l() != EnumC5972mu0.a; em02 = em02.h) {
            if (!em02.c()) {
                YogaNodeJNIBase yogaNodeJNIBase = em02.u;
                int iRound2 = Math.round(yogaNodeJNIBase.i()) + i2;
                iRound = Math.round(yogaNodeJNIBase.j()) + iRound;
                i2 = iRound2;
            }
        }
        k(dm0, i2, iRound);
    }

    @Override // defpackage.InterfaceC3571eO
    public void f(EE ee) {
        ((C3954gO0) this.d).G = ee;
    }

    public void finalize() throws Throwable {
        switch (this.a) {
            case 7:
                ((HandlerThread) this.b).quitSafely();
                break;
            default:
                super.finalize();
                break;
        }
    }

    @Override // defpackage.InterfaceC4094h70
    public int g() throws Throwable {
        a aVar = (a) this.d;
        C8426zm0 c8426zm0 = (C8426zm0) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            H60 h60 = (H60) arrayList.get(i);
            C6258oO0 c6258oO0 = null;
            try {
                C6258oO0 c6258oO02 = new C6258oO0(new FileInputStream(aVar.a().getFileDescriptor()), c8426zm0);
                try {
                    int iD = h60.d(c6258oO02, c8426zm0);
                    c6258oO02.release();
                    aVar.a();
                    if (iD != -1) {
                        return iD;
                    }
                } catch (Throwable th) {
                    th = th;
                    c6258oO0 = c6258oO02;
                    if (c6258oO0 != null) {
                        c6258oO0.release();
                    }
                    aVar.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return -1;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new C2362bd1(new C1538Tm0(23), new C0396Ev0(22), (InterfaceC8185yV0) ((C6045nH) this.b).get(), (C1911Yg1) ((C0593Hj) this.c).get(), (C0610Ho1) ((C6860rY0) this.d).get());
    }

    @Override // defpackage.InterfaceC7211tO
    public boolean h(int i) {
        switch (this.a) {
            case 4:
                if (((C6846rT1) this.b).h(i) && v(i) != null) {
                }
                break;
            case 11:
                if (((InterfaceC7211tO) this.b).h(i) && w(i) != null) {
                }
                break;
            default:
                if (((InterfaceC7211tO) this.b).h(i) && x(i) != null) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.InterfaceC7211tO
    public InterfaceC7402uO i(int i) {
        switch (this.a) {
            case 4:
                return v(i);
            case 11:
                return w(i);
            default:
                return x(i);
        }
    }

    @Override // defpackage.InterfaceC3571eO
    public void j() {
        ((C0365El) this.b).b(null);
    }

    public void k(DM0 dm0, int i, int i2) {
        EM0 em0;
        EM0 em02 = (EM0) dm0;
        if (em02.l() == EnumC5972mu0.c || (em0 = em02.l) == null) {
            for (int i3 = 0; i3 < em02.k(); i3++) {
                EM0 em0J = em02.j(i3);
                int i4 = em0J.a;
                SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
                if (!sparseBooleanArray.get(i4)) {
                    sparseBooleanArray.put(i4, true);
                    k(em0J, em0J.n + i, em0J.o + i2);
                }
            }
            return;
        }
        int i5 = em02.a;
        KJ0 kj0 = em02.i;
        if (kj0 != null) {
            em0 = kj0;
        }
        int i6 = em0.a;
        int i7 = em02.p;
        int i8 = em02.q;
        C8216yf1 c8216yf1 = (C8216yf1) this.b;
        c8216yf1.h.add(new C7646vf1(c8216yf1, i6, i5, i, i2, i7, i8));
    }

    @Override // defpackage.InterfaceC3571eO
    public void l(VN vn) throws Exception {
        boolean z;
        C3954gO0 c3954gO0 = (C3954gO0) this.d;
        MediaMuxer mediaMuxer = c3954gO0.C;
        C6687qe c6687qe = (C6687qe) this.c;
        if (mediaMuxer != null) {
            try {
                c3954gO0.L(vn, c6687qe);
                vn.close();
                return;
            } catch (Throwable th) {
                try {
                    vn.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (c3954gO0.r) {
            AbstractC0759Jm0.f("Recorder");
            vn.close();
            return;
        }
        VN vn2 = c3954gO0.U;
        if (vn2 != null) {
            vn2.close();
            c3954gO0.U = null;
            z = true;
        } else {
            z = false;
        }
        if (!vn.G()) {
            if (z) {
                AbstractC0759Jm0.f("Recorder");
            }
            AbstractC0759Jm0.f("Recorder");
            C7020sO c7020sO = c3954gO0.F;
            c7020sO.h.execute(new RunnableC4335iO(c7020sO, 3));
            vn.close();
            return;
        }
        c3954gO0.U = vn;
        if (!c3954gO0.m() || !c3954gO0.V.d()) {
            AbstractC0759Jm0.f("Recorder");
            c3954gO0.D(c6687qe);
        } else if (z) {
            AbstractC0759Jm0.f("Recorder");
        } else {
            AbstractC0759Jm0.f("Recorder");
        }
    }

    public Object m(Cipher cipher, C2163ab c2163ab) {
        RU0 ru0 = new RU0(AbstractC6383p22.b(c2163ab));
        C1304Qm0 c1304Qm0 = new C1304Qm0((l) this.b, (Executor) this.c, new C2354bb(0, ru0));
        C1155Oo1 c1155Oo1 = new C1155Oo1(cipher);
        C0821Kh c0821Kh = (C0821Kh) this.d;
        if (c0821Kh == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        int i = c0821Kh.f;
        if (i == 0) {
            i = 15;
        }
        if ((i & KotlinVersion.MAX_COMPONENT_VALUE) == 255) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && AbstractC5686lO1.e(i)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        c1304Qm0.u(c0821Kh, c1155Oo1);
        Object objB = ru0.b();
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        return objB;
    }

    @Override // defpackage.InterfaceC4094h70
    public Bitmap n(BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(((a) this.d).a().getFileDescriptor(), null, options);
    }

    public synchronized void o() {
        if (!((LinkedHashSet) this.b).isEmpty()) {
            ((C0710Iw) this.d).e(0L);
        }
    }

    @Override // defpackage.PZ
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 16:
                HT ht = (HT) this.b;
                androidx.camera.lifecycle.a aVar = new androidx.camera.lifecycle.a(ht);
                if (DV1.c()) {
                    aVar.run();
                } else {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    AbstractC3377dM1.i(new Handler(Looper.getMainLooper()).post(new O91(aVar, 1, countDownLatch)), "Unable to post to main thread");
                    try {
                        if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                            throw new IllegalStateException("Timeout to wait main thread execution");
                        }
                    } catch (InterruptedException e2) {
                        throw new C7074sg((Throwable) e2);
                    }
                }
                C8054xp c8054xp = (C8054xp) ht.e;
                if (c8054xp != null) {
                    C2359bc1 c2359bc1 = c8054xp.b().b;
                    ((ArrayList) c2359bc1.b).clear();
                    ((HashMap) c2359bc1.c).clear();
                    ((ArrayList) c2359bc1.d).clear();
                    ((HashSet) c2359bc1.e).clear();
                    c2359bc1.a = 0;
                }
                C8054xp c8054xp2 = (C8054xp) ht.e;
                InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0E = c8054xp2 != null ? c8054xp2.e() : F70.c;
                O90.e(interfaceFutureC0750Jj0E, "if (cameraX != null) cam…mediateFuture<Void>(null)");
                synchronized (ht.a) {
                    ht.b = null;
                    ht.c = interfaceFutureC0750Jj0E;
                    ((HashMap) ht.g).clear();
                }
                ht.e = null;
                ht.f = null;
                return;
            default:
                boolean z = th instanceof CancellationException;
                C0365El c0365El = (C0365El) this.c;
                if (z) {
                    AbstractC3377dM1.i(c0365El.d(new X61(AbstractC1705Vq.l(new StringBuilder(), (String) this.d, " cancelled."), th)), null);
                    return;
                } else {
                    c0365El.b(null);
                    return;
                }
        }
    }

    @Override // defpackage.PZ
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 16:
                C8054xp c8054xp = (C8054xp) this.c;
                HT ht = (HT) this.b;
                ht.e = c8054xp;
                ht.f = AbstractC3782fU1.f((ReactContext) this.d);
                break;
            default:
                AbstractC1500Sz1.m((InterfaceFutureC0750Jj0) this.b, (C0365El) this.c);
                break;
        }
    }

    @Override // defpackage.InterfaceC3571eO
    public void q(UN un) {
        ((C0365El) this.b).d(un);
    }

    public long t() {
        C7566vF c7566vF = (C7566vF) this.d;
        if (c7566vF != null) {
            return c7566vF.d;
        }
        return -1L;
    }

    public DM0 u(int i) {
        ((C7409uQ0) this.d).a();
        return (DM0) ((SparseArray) this.b).get(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.InterfaceC7402uO v(int r22) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6846rT1.v(int):uO");
    }

    public InterfaceC7402uO w(int i) {
        HashMap map = (HashMap) this.d;
        if (map.containsKey(Integer.valueOf(i))) {
            return (InterfaceC7402uO) map.get(Integer.valueOf(i));
        }
        InterfaceC7211tO interfaceC7211tO = (InterfaceC7211tO) this.b;
        C8208yd c8208ydE = null;
        if (interfaceC7211tO.h(i)) {
            InterfaceC7402uO interfaceC7402uOI = interfaceC7211tO.i(i);
            if (interfaceC7402uOI != null) {
                ArrayList arrayList = new ArrayList();
                for (C8398zd c8398zd : interfaceC7402uOI.d()) {
                    if (FM.a(c8398zd, (CM) this.c)) {
                        arrayList.add(c8398zd);
                    }
                }
                if (!arrayList.isEmpty()) {
                    c8208ydE = C8208yd.e(interfaceC7402uOI.a(), interfaceC7402uOI.b(), interfaceC7402uOI.c(), arrayList);
                }
            }
            map.put(Integer.valueOf(i), c8208ydE);
        }
        return c8208ydE;
    }

    @Override // defpackage.InterfaceC0131Bl
    public void w0(InterfaceC7089sl interfaceC7089sl, IOException iOException) {
        O90.f(interfaceC7089sl, "call");
        C6935rx0.g((C6935rx0) this.c, interfaceC7089sl, iOException, (ES1) this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.InterfaceC7402uO x(int r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.Object r2 = r0.d
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L1d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            java.lang.Object r1 = r2.get(r1)
            uO r1 = (defpackage.InterfaceC7402uO) r1
            return r1
        L1d:
            java.lang.Object r3 = r0.b
            tO r3 = (defpackage.InterfaceC7211tO) r3
            boolean r4 = r3.h(r1)
            if (r4 == 0) goto Lde
            uO r3 = r3.i(r1)
            java.util.Objects.requireNonNull(r3)
            java.lang.Object r4 = r0.c
            e41 r4 = (defpackage.C3513e41) r4
            java.lang.Class<androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk> r6 = androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk.class
            java.util.ArrayList r4 = r4.B0(r6)
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L72
            java.lang.Object r6 = r4.next()
            androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk r6 = (androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk) r6
            if (r6 == 0) goto L3c
            r4 = 4
            if (r1 == r4) goto L68
            r4 = 5
            if (r1 == r4) goto L5e
            r4 = 6
            if (r1 == r4) goto L54
            goto L72
        L54:
            android.util.Size r4 = new android.util.Size
            r6 = 1440(0x5a0, float:2.018E-42)
            r7 = 1080(0x438, float:1.513E-42)
            r4.<init>(r6, r7)
            goto L73
        L5e:
            android.util.Size r4 = new android.util.Size
            r6 = 960(0x3c0, float:1.345E-42)
            r7 = 720(0x2d0, float:1.009E-42)
            r4.<init>(r6, r7)
            goto L73
        L68:
            android.util.Size r4 = new android.util.Size
            r6 = 640(0x280, float:8.97E-43)
            r7 = 480(0x1e0, float:6.73E-43)
            r4.<init>(r6, r7)
            goto L73
        L72:
            r4 = 0
        L73:
            if (r4 != 0) goto L78
            r5 = r3
            goto Ldf
        L78:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r7 = r3.d()
            java.util.Iterator r7 = r7.iterator()
        L85:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lc6
            java.lang.Object r8 = r7.next()
            zd r8 = (defpackage.C8398zd) r8
            int r10 = r8.a
            int r14 = r4.getWidth()
            int r15 = r4.getHeight()
            zd r13 = new zd
            int r12 = r8.i
            int r11 = r8.j
            java.lang.String r9 = r8.b
            int r5 = r8.c
            int r0 = r8.d
            int r1 = r8.g
            int r8 = r8.h
            r16 = r9
            r9 = r13
            r19 = r11
            r11 = r16
            r18 = r12
            r12 = r5
            r5 = r13
            r13 = r0
            r16 = r1
            r17 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r6.add(r5)
            r0 = r20
            r1 = r21
            goto L85
        Lc6:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto Lcd
            goto Lde
        Lcd:
            int r0 = r3.a()
            int r1 = r3.b()
            java.util.List r3 = r3.c()
            yd r5 = defpackage.C8208yd.e(r0, r1, r3, r6)
            goto Ldf
        Lde:
            r5 = 0
        Ldf:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r2.put(r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6846rT1.x(int):uO");
    }

    @Override // defpackage.InterfaceC4094h70
    public ImageHeaderParser$ImageType y() throws Throwable {
        a aVar = (a) this.d;
        C8426zm0 c8426zm0 = (C8426zm0) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            H60 h60 = (H60) arrayList.get(i);
            C6258oO0 c6258oO0 = null;
            try {
                C6258oO0 c6258oO02 = new C6258oO0(new FileInputStream(aVar.a().getFileDescriptor()), c8426zm0);
                try {
                    ImageHeaderParser$ImageType imageHeaderParser$ImageTypeC = h60.c(c6258oO02);
                    c6258oO02.release();
                    aVar.a();
                    if (imageHeaderParser$ImageTypeC != ImageHeaderParser$ImageType.UNKNOWN) {
                        return imageHeaderParser$ImageTypeC;
                    }
                } catch (Throwable th) {
                    th = th;
                    c6258oO0 = c6258oO02;
                    if (c6258oO0 != null) {
                        c6258oO0.release();
                    }
                    aVar.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public boolean z() throws IOException {
        String strTrim;
        if (((String) this.d) != null) {
            return true;
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.d = str;
            return true;
        }
        do {
            String line = ((BufferedReader) this.b).readLine();
            this.d = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.d = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }

    public /* synthetic */ C6846rT1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public C6846rT1(int i) {
        this.a = i;
        switch (i) {
            case 7:
                HandlerThread handlerThread = new HandlerThread("mrousavy/VisionCamera.video");
                this.b = handlerThread;
                handlerThread.start();
                Handler handler = new Handler(handlerThread.getLooper());
                this.c = handler;
                int i2 = AbstractC8287z20.a;
                this.d = N02.d(new C8097y20(handler, "mrousavy/VisionCamera.video", false));
                break;
            case 24:
                this.b = new SparseArray();
                this.c = new SparseBooleanArray();
                this.d = new C7409uQ0();
                break;
            case 29:
                this.b = Collections.emptyList();
                this.c = Collections.emptyList();
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = g;
                break;
        }
    }

    public C6846rT1(Context context, int i) {
        this.a = i;
        switch (i) {
            case 10:
                this.d = new C3759fN(12);
                this.b = context;
                break;
            default:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                this.d = Executors.newSingleThreadExecutor();
                this.b = context;
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new RunnableC6133nk0(19, this), 0L, 86400L, TimeUnit.SECONDS);
                break;
        }
    }

    @Override // defpackage.InterfaceC4094h70
    public void s() {
    }

    public C6846rT1(String str, String str2, String str3) {
        this.a = 12;
        this.b = str;
        this.c = str3 == null ? "" : str3;
        this.d = str2;
    }

    public C6846rT1(l lVar, Context context, String str) {
        this.a = 3;
        O90.f(str, "title");
        this.b = lVar;
        Executor executorC = AbstractC3556eJ.c(context);
        O90.e(executorC, "getMainExecutor(...)");
        this.c = executorC;
        C0743Jh c0743Jh = new C0743Jh();
        c0743Jh.c = str;
        c0743Jh.f = context.getString(R.string.cancel);
        this.d = c0743Jh.b();
    }

    public C6846rT1(S91 s91) {
        this.a = 28;
        this.b = s91;
        this.c = new NJ(ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE);
    }

    public C6846rT1(List list) {
        this.a = 17;
        this.d = list;
        this.b = new ArrayList(list.size());
        this.c = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.b).add(new UZ0((List) ((C0060An0) list.get(i)).b.b));
            ((ArrayList) this.c).add(((C0060An0) list.get(i)).c.M0());
        }
    }

    public C6846rT1(ExecutorService executorService, ExecutorService executorService2) {
        this.a = 1;
        O90.f(executorService, "backgroundExecutorService");
        O90.f(executorService2, "blockingExecutorService");
        this.b = new ZA(executorService);
        this.c = new ZA(executorService);
        AbstractC3782fU1.e(null);
        this.d = new ZA(executorService2);
    }

    public C6846rT1(C0999Mo1 c0999Mo1) {
        this.a = 14;
        this.b = new OL0(15);
        this.c = (C2472cD) c0999Mo1.a;
        this.d = (C1036Nb) c0999Mo1.b;
    }

    public C6846rT1(InterfaceC7211tO interfaceC7211tO, CM cm) {
        this.a = 11;
        this.d = new HashMap();
        this.b = interfaceC7211tO;
        this.c = cm;
    }

    public C6846rT1(InterfaceC7211tO interfaceC7211tO, C3513e41 c3513e41) {
        this.a = 21;
        this.d = new HashMap();
        this.b = interfaceC7211tO;
        this.c = c3513e41;
    }

    public C6846rT1(MU mu, XU xu, C0320Dw c0320Dw, C8075xw c8075xw, Context context, String str, C1099Nw c1099Nw, ScheduledExecutorService scheduledExecutorService) {
        this.a = 8;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.b = linkedHashSet;
        this.d = new C0710Iw(mu, xu, c0320Dw, c8075xw, context, str, linkedHashSet, c1099Nw, scheduledExecutorService);
        this.c = scheduledExecutorService;
    }

    public C6846rT1(ZR zr) {
        this.a = 6;
        this.b = zr;
    }

    public C6846rT1(C3909g90 c3909g90, List[] listArr, Method method) {
        this.a = 27;
        O90.f(c3909g90, "argumentRange");
        this.b = c3909g90;
        this.c = listArr;
        this.d = method;
    }

    public C6846rT1(InterfaceC1165Os interfaceC1165Os, List list, C6846rT1 c6846rT1) {
        this.a = 20;
        O90.f(interfaceC1165Os, "classifierDescriptor");
        O90.f(list, "arguments");
        this.b = interfaceC1165Os;
        this.c = list;
        this.d = c6846rT1;
    }

    public C6846rT1(C3679ey c3679ey) {
        this.a = 5;
        this.b = new ArrayList();
        this.c = new C1285Qg();
        this.d = c3679ey;
    }

    public C6846rT1(C8216yf1 c8216yf1, C6846rT1 c6846rT1) {
        this.a = 18;
        this.d = new SparseBooleanArray();
        this.b = c8216yf1;
        this.c = c6846rT1;
    }

    public C6846rT1(C6846rT1 c6846rT1) {
        this.a = 4;
        C0680Im c0680Im = C2570cj1.d;
        this.d = new HashMap();
        this.b = c6846rT1;
        this.c = c0680Im;
    }

    public C6846rT1(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C8426zm0 c8426zm0) {
        this.a = 15;
        IL1.d(c8426zm0, "Argument must not be null");
        this.b = c8426zm0;
        IL1.d(arrayList, "Argument must not be null");
        this.c = arrayList;
        this.d = new a(parcelFileDescriptor);
    }

    public C6846rT1(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 13;
        this.c = arrayDeque;
        this.b = bufferedReader;
    }

    public C6846rT1(C3954gO0 c3954gO0, C0365El c0365El, C6687qe c6687qe) {
        this.a = 22;
        this.d = c3954gO0;
        this.b = c0365El;
        this.c = c6687qe;
    }
}

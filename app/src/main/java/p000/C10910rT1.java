package p000;

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
import androidx.camera.lifecycle.RunnableC1707a;
import androidx.fragment.app.AbstractActivityC1730l;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C1875a;
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
public final class C10910rT1 implements InterfaceC0889O7, InterfaceC4050fO, InterfaceC6883tO, InterfaceC9585h70, InterfaceC0980PZ, InterfaceC0111Bl, InterfaceC3987eO, InterfaceC4243iS {

    /* renamed from: e */
    public static C10910rT1 f41673e = null;

    /* renamed from: f */
    public static final C1769bB f41674f = new C1769bB();

    /* renamed from: g */
    public static final C8455Vy1 f41675g = new C8455Vy1(3);

    /* renamed from: h */
    public static int f41676h = -1;

    /* renamed from: a */
    public final /* synthetic */ int f41677a;

    /* renamed from: b */
    public Object f41678b;

    /* renamed from: c */
    public Object f41679c;

    /* renamed from: d */
    public Object f41680d;

    public /* synthetic */ C10910rT1(int i, boolean z) {
        this.f41677a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x008d  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m24362B(p000.NM0 r9) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10910rT1.m24362B(NM0):boolean");
    }

    /* renamed from: E */
    public static void m24363E() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    /* renamed from: K */
    public static final SharedPreferences m24364K(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    /* renamed from: L */
    public static final void m24365L(Context context) throws SR1 {
        SharedPreferences sharedPreferencesM24364K = m24364K(context);
        if (sharedPreferencesM24364K.edit().putLong("app_set_id_last_used_time", DefaultClock.getInstance().currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        if (strValueOf.length() != 0) {
            "Failed to store app set ID last used time for App ".concat(strValueOf);
        }
        throw new SR1("Failed to store the app set ID last used time.");
    }

    /* renamed from: p */
    public static final void m24366p() {
        if (((Boolean) new C1648aB(0, f41674f, C1769bB.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 0).invoke()).booleanValue()) {
            return;
        }
        Thread.currentThread().getName();
    }

    /* renamed from: r */
    public static final void m24367r() {
        if (((Boolean) new C1648aB(0, f41674f, C1769bB.class, "isBlockingThread", "isBlockingThread()Z", 0, 1).invoke()).booleanValue()) {
            return;
        }
        Thread.currentThread().getName();
    }

    /* renamed from: A */
    public void m24368A(InterfaceC1586ZC interfaceC1586ZC, Uri uri, Map map, long j, long j2, C10623pE0 c10623pE0) throws L31 {
        boolean z;
        boolean z2 = true;
        C7000vF c7000vF = new C7000vF(interfaceC1586ZC, j, j2);
        this.f41680d = c7000vF;
        if (((InterfaceC1412WR) this.f41679c) != null) {
            return;
        }
        InterfaceC1412WR[] interfaceC1412WRArrMo3133a = ((InterfaceC1601ZR) this.f41678b).mo3133a(uri, map);
        int length = interfaceC1412WRArrMo3133a.length;
        N70 n70 = P70.f8867b;
        AbstractC9246eT1.m17997b(length, "expectedSize");
        M70 m70 = new M70(length);
        if (interfaceC1412WRArrMo3133a.length == 1) {
            this.f41679c = interfaceC1412WRArrMo3133a[0];
        } else {
            int length2 = interfaceC1412WRArrMo3133a.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    break;
                }
                InterfaceC1412WR interfaceC1412WR = interfaceC1412WRArrMo3133a[i];
                try {
                } catch (EOFException unused) {
                    z = ((InterfaceC1412WR) this.f41679c) != null || c7000vF.f44295d == j;
                } catch (Throwable th) {
                    if (((InterfaceC1412WR) this.f41679c) == null && c7000vF.f44295d != j) {
                        z2 = false;
                    }
                    YN1.m9281f(z2);
                    c7000vF.f44297f = 0;
                    throw th;
                }
                if (interfaceC1412WR.mo739f(c7000vF)) {
                    this.f41679c = interfaceC1412WR;
                    c7000vF.f44297f = 0;
                    break;
                } else {
                    m70.m3759e(interfaceC1412WR.mo741h());
                    z = ((InterfaceC1412WR) this.f41679c) != null || c7000vF.f44295d == j;
                    YN1.m9281f(z);
                    c7000vF.f44297f = 0;
                    i++;
                }
            }
            if (((InterfaceC1412WR) this.f41679c) == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                C6333ky c6333ky = new C6333ky(", ", 1);
                Iterator it = AbstractC10978s10.m24577b(P70.m6235v(interfaceC1412WRArrMo3133a), new C4262il(5)).iterator();
                StringBuilder sb2 = new StringBuilder();
                c6333ky.m22321a(sb2, it);
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                String string = sb.toString();
                uri.getClass();
                C9367fQ0 c9367fQ0M5273h = m70.m5273h();
                L31 l31 = new L31(string, null, false, 1);
                P70.m6234u(c9367fQ0M5273h);
                throw l31;
            }
        }
        ((InterfaceC1412WR) this.f41679c).mo742l(c10623pE0);
    }

    /* renamed from: C */
    public boolean m24369C(C1004Px c1004Px, C3960dy c3960dy, boolean z) {
        int[] iArr = c3960dy.f26433c0;
        int i = iArr[0];
        C1050Qg c1050Qg = (C1050Qg) this.f41679c;
        c1050Qg.f9715a = i;
        c1050Qg.f9716b = iArr[1];
        c1050Qg.f9717c = c3960dy.m17789l();
        c1050Qg.f9718d = c3960dy.m17786i();
        c1050Qg.f9723i = false;
        c1050Qg.f9724j = z;
        boolean z2 = c1050Qg.f9715a == 3;
        boolean z3 = c1050Qg.f9716b == 3;
        boolean z4 = z2 && c3960dy.f26413L > 0.0f;
        boolean z5 = z3 && c3960dy.f26413L > 0.0f;
        int[] iArr2 = c3960dy.f26442l;
        if (z4 && iArr2[0] == 4) {
            c1050Qg.f9715a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c1050Qg.f9716b = 1;
        }
        c1004Px.m6490a(c3960dy, c1050Qg);
        c3960dy.m17802y(c1050Qg.f9719e);
        c3960dy.m17799v(c1050Qg.f9720f);
        c3960dy.f26453w = c1050Qg.f9722h;
        int i2 = c1050Qg.f9721g;
        c3960dy.f26417P = i2;
        c3960dy.f26453w = i2 > 0;
        c1050Qg.f9724j = false;
        return c1050Qg.f9723i;
    }

    /* renamed from: D */
    public String m24370D() {
        if (!m24388z()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f41680d;
        this.f41680d = null;
        return str;
    }

    /* renamed from: F */
    public void m24371F(DM0 dm0, boolean z) {
        EM0 em0 = (EM0) dm0;
        if (em0.m2183l() != EnumC10323mu0.f37985a) {
            for (int iM2182k = em0.m2182k() - 1; iM2182k >= 0; iM2182k--) {
                m24371F(em0.m2181j(iM2182k), z);
            }
        }
        EM0 em02 = em0.f2660l;
        if (em02 != null) {
            UN1.m7999c(em02.f2661m);
            int iIndexOf = em02.f2661m.indexOf(em0);
            UN1.m7999c(em02.f2661m);
            ((EM0) em02.f2661m.remove(iIndexOf)).f2660l = null;
            int i = em02.f2649a;
            int[] iArr = {iIndexOf};
            int[] iArr2 = z ? new int[]{em0.f2649a} : null;
            C11827yf1 c11827yf1 = (C11827yf1) this.f41678b;
            c11827yf1.f46391h.add(new C9910jf1(c11827yf1, i, iArr, (C8581Yj1[]) null, iArr2));
        }
    }

    /* renamed from: G */
    public void m24372G(int i) {
        ((C11287uQ0) this.f41680d).m25186a();
        if (i == -1) {
            return;
        }
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f41679c;
        if (!sparseBooleanArray.get(i)) {
            throw new C8810b60(AbstractC7222ym.m26230g(i, "View with tag ", " is not registered as a root view"));
        }
        ((SparseArray) this.f41678b).remove(i);
        sparseBooleanArray.delete(i);
    }

    /* renamed from: H */
    public void m24373H(C4023ey c4023ey, int i, int i2) {
        int i3 = c4023ey.f26418Q;
        int i4 = c4023ey.f26419R;
        c4023ey.f26418Q = 0;
        c4023ey.f26419R = 0;
        c4023ey.m17802y(i);
        c4023ey.m17799v(i2);
        if (i3 < 0) {
            c4023ey.f26418Q = 0;
        } else {
            c4023ey.f26418Q = i3;
        }
        if (i4 < 0) {
            c4023ey.f26419R = 0;
        } else {
            c4023ey.f26419R = i4;
        }
        ((C4023ey) this.f41680d).m18110E();
    }

    /* renamed from: I */
    public void m24374I(DM0 dm0, NM0 nm0) {
        EM0 em0 = (EM0) dm0;
        EM0 em02 = em0.f2656h;
        if (em02 == null) {
            em0.m2170A(false);
            return;
        }
        EM0 em03 = (EM0) dm0;
        ArrayList arrayList = em02.f2655g;
        int iIndexOf = arrayList == null ? -1 : arrayList.indexOf(em03);
        em02.m2193v(iIndexOf);
        m24371F(dm0, false);
        em0.m2170A(false);
        S91 s91 = em0.f2652d;
        UN1.m7999c(s91);
        int i = em0.f2649a;
        String str = em0.f2650b;
        UN1.m7999c(str);
        ((C11827yf1) this.f41678b).m26213b(s91, i, str, nm0);
        em02.mo1656f(dm0, iIndexOf);
        m24378d(em02, dm0, iIndexOf);
        for (int i2 = 0; i2 < em0.m2182k(); i2++) {
            m24378d(dm0, em0.m2181j(i2), i2);
        }
        UN1.m7997a(em0.f2651c != 0);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f41680d;
        sparseBooleanArray.size();
        AbstractC3929dS.m17677j("NativeViewHierarchyOptimizer");
        UN1.m7997a(sparseBooleanArray.size() == 0);
        m24379e(dm0);
        for (int i3 = 0; i3 < em0.m2182k(); i3++) {
            m24379e(em0.m2181j(i3));
        }
        sparseBooleanArray.clear();
    }

    /* renamed from: J */
    public void m24375J(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        double dM18931a = AbstractC9700i12.m18931a(viewGroup.getWidth());
        double dM18931a2 = AbstractC9700i12.m18931a(viewGroup.getHeight());
        C0838NJ c0838nj = new C0838NJ(dM18931a, dM18931a2);
        if (c0838nj.equals((C0838NJ) this.f41679c)) {
            return;
        }
        this.f41679c = c0838nj;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, dM18931a2);
        writableMapCreateMap.putDouble(Snapshot.WIDTH, dM18931a);
        T91.m7609b((S91) this.f41678b, "KeyboardController::windowDidResize", writableMapCreateMap);
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: Z */
    public void mo851Z(InterfaceC6843sl interfaceC6843sl, HS0 hs0) {
        O90.m5968f(interfaceC6843sl, "call");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C10841qx0 c10841qx0 = (C10841qx0) this.f41678b;
        c10841qx0.f41265g = jElapsedRealtime;
        ES1 es1 = (ES1) this.f41680d;
        C10969rx0 c10969rx0 = (C10969rx0) this.f41679c;
        C8313Tf1 c8313Tf1 = null;
        IS0 is0 = hs0.f4301g;
        try {
            if (is0 != null) {
                try {
                    if (hs0.m3428n()) {
                        F71 f71 = C0739Lk.f6823c;
                        String strM4524b = hs0.f4300f.m4524b("Content-Range");
                        if (strM4524b == null) {
                            strM4524b = null;
                        }
                        C0739Lk c0739LkM7155s = S20.m7155s(strM4524b);
                        if (c0739LkM7155s != null && (c0739LkM7155s.f6824a != 0 || c0739LkM7155s.f6825b != Integer.MAX_VALUE)) {
                            c10841qx0.f15526e = c0739LkM7155s;
                            c10841qx0.f15525d = 8;
                        }
                        es1.m2286H(is0.m3876m(), is0.mo3383o() < 0 ? 0 : (int) is0.mo3383o());
                    } else {
                        C10969rx0.m24557g(c10969rx0, interfaceC6843sl, new IOException("Unexpected HTTP code " + hs0), es1);
                    }
                } catch (Exception e) {
                    C10969rx0.m24557g(c10969rx0, interfaceC6843sl, e, es1);
                }
                AbstractC8729aT1.m9749a(is0, null);
                c8313Tf1 = C8313Tf1.f11463a;
            }
            if (c8313Tf1 == null) {
                C10969rx0.m24557g(c10969rx0, interfaceC6843sl, new IOException("Response body null: " + hs0), es1);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC8729aT1.m9749a(is0, th);
                throw th2;
            }
        }
    }

    @Override // p000.InterfaceC4050fO
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC4050fO mo884a(Class cls, InterfaceC8502Ww0 interfaceC8502Ww0) {
        ((HashMap) this.f41678b).put(cls, interfaceC8502Ww0);
        ((HashMap) this.f41679c).remove(cls);
        return this;
    }

    /* renamed from: b */
    public void m24376b(DM0 dm0, DM0 dm02, int i) {
        EM0 em0 = (EM0) dm02;
        UN1.m7997a(em0.m2183l() != EnumC10323mu0.f37985a);
        for (int i2 = 0; i2 < em0.m2182k(); i2++) {
            EM0 em0M2181j = em0.m2181j(i2);
            UN1.m7997a(em0M2181j.f2660l == null);
            EM0 em02 = (EM0) dm0;
            ArrayList arrayList = em02.f2661m;
            int size = arrayList == null ? 0 : arrayList.size();
            if (em0M2181j.m2183l() == EnumC10323mu0.f37987c) {
                m24376b(em02, em0M2181j, i);
            } else {
                m24377c(em02, em0M2181j, i);
            }
            ArrayList arrayList2 = em02.f2661m;
            i += (arrayList2 == null ? 0 : arrayList2.size()) - size;
        }
    }

    /* renamed from: c */
    public void m24377c(DM0 dm0, DM0 dm02, int i) {
        EM0 em0 = (EM0) dm0;
        em0.getClass();
        EM0 em02 = (EM0) dm02;
        EnumC10323mu0 enumC10323mu0M2183l = em0.m2183l();
        EnumC10323mu0 enumC10323mu0 = EnumC10323mu0.f37985a;
        UN1.m7997a(enumC10323mu0M2183l == enumC10323mu0);
        UN1.m7997a(em02.m2183l() != EnumC10323mu0.f37987c);
        if (em0.f2661m == null) {
            em0.f2661m = new ArrayList(4);
        }
        em0.f2661m.add(i, em02);
        em02.f2660l = em0;
        int i2 = em0.f2649a;
        EM0 em03 = (EM0) dm02;
        C8581Yj1[] c8581Yj1Arr = {new C8581Yj1(em03.f2649a, i)};
        C11827yf1 c11827yf1 = (C11827yf1) this.f41678b;
        c11827yf1.f46391h.add(new C9910jf1(c11827yf1, i2, (int[]) null, c8581Yj1Arr, (int[]) null));
        if (em03.m2183l() != enumC10323mu0) {
            m24376b(dm0, dm02, i + 1);
        }
    }

    /* renamed from: d */
    public void m24378d(DM0 dm0, DM0 dm02, int i) {
        C0986Pf c0986Pf;
        EM0 em0 = (EM0) dm0;
        int iM2184m = em0.m2184m(em0.m2181j(i));
        if (em0.m2183l() != EnumC10323mu0.f37985a) {
            while (true) {
                EM0 em02 = (EM0) dm0;
                if (em02.m2183l() == EnumC10323mu0.f37985a) {
                    c0986Pf = new C0986Pf(em02, iM2184m, 14);
                    break;
                }
                EM0 em03 = em02.f2656h;
                if (em03 == null) {
                    c0986Pf = null;
                    break;
                } else {
                    iM2184m = iM2184m + (em02.m2183l() == EnumC10323mu0.f37986b ? 1 : 0) + em03.m2184m(em02);
                    dm0 = em03;
                }
            }
            if (c0986Pf == null) {
                return;
            }
            DM0 dm03 = (EM0) c0986Pf.f9217c;
            iM2184m = c0986Pf.f9216b;
            dm0 = dm03;
        }
        EM0 em04 = (EM0) dm02;
        if (em04.m2183l() != EnumC10323mu0.f37987c) {
            m24377c(dm0, em04, iM2184m);
        } else {
            m24376b(dm0, em04, iM2184m);
        }
    }

    /* renamed from: e */
    public void m24379e(DM0 dm0) {
        EM0 em0 = (EM0) dm0;
        int i = em0.f2649a;
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f41680d;
        if (sparseBooleanArray.get(i)) {
            return;
        }
        sparseBooleanArray.put(i, true);
        int i2 = em0.f2662n;
        int iRound = em0.f2663o;
        for (EM0 em02 = em0.f2656h; em02 != null && em02.m2183l() != EnumC10323mu0.f37985a; em02 = em02.f2656h) {
            if (!em02.mo1653c()) {
                YogaNodeJNIBase yogaNodeJNIBase = em02.f2669u;
                int iRound2 = Math.round(yogaNodeJNIBase.m11096i()) + i2;
                iRound = Math.round(yogaNodeJNIBase.m11097j()) + iRound;
                i2 = iRound2;
            }
        }
        m24380k(dm0, i2, iRound);
    }

    @Override // p000.InterfaceC3987eO
    /* renamed from: f */
    public void mo389f(C0267EE c0267ee) {
        ((C9491gO0) this.f41680d).f27725G = c0267ee;
    }

    public void finalize() throws Throwable {
        switch (this.f41677a) {
            case 7:
                ((HandlerThread) this.f41678b).quitSafely();
                break;
            default:
                super.finalize();
                break;
        }
    }

    @Override // p000.InterfaceC9585h70
    /* renamed from: g */
    public int mo9141g() throws Throwable {
        C1875a c1875a = (C1875a) this.f41680d;
        C11967zm0 c11967zm0 = (C11967zm0) this.f41678b;
        ArrayList arrayList = (ArrayList) this.f41679c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            H60 h60 = (H60) arrayList.get(i);
            C10515oO0 c10515oO0 = null;
            try {
                C10515oO0 c10515oO02 = new C10515oO0(new FileInputStream(c1875a.m10891a().getFileDescriptor()), c11967zm0);
                try {
                    int iMo3300d = h60.mo3300d(c10515oO02, c11967zm0);
                    c10515oO02.release();
                    c1875a.m10891a();
                    if (iMo3300d != -1) {
                        return iMo3300d;
                    }
                } catch (Throwable th) {
                    th = th;
                    c10515oO0 = c10515oO02;
                    if (c10515oO0 != null) {
                        c10515oO0.release();
                    }
                    c1875a.m10891a();
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
        return new C8877bd1(new C8326Tm0(23), new C7564Ev0(22), (InterfaceC11806yV0) ((C6479nH) this.f41678b).get(), (C8575Yg1) ((C0487Hj) this.f41679c).get(), (C7707Ho1) ((C10919rY0) this.f41680d).get());
    }

    @Override // p000.InterfaceC6883tO
    /* renamed from: h */
    public boolean mo5443h(int i) {
        switch (this.f41677a) {
            case 4:
                if (((C10910rT1) this.f41678b).mo5443h(i) && m24385v(i) != null) {
                }
                break;
            case 11:
                if (((InterfaceC6883tO) this.f41678b).mo5443h(i) && m24386w(i) != null) {
                }
                break;
            default:
                if (((InterfaceC6883tO) this.f41678b).mo5443h(i) && m24387x(i) != null) {
                }
                break;
        }
        return false;
    }

    @Override // p000.InterfaceC6883tO
    /* renamed from: i */
    public InterfaceC6946uO mo5444i(int i) {
        switch (this.f41677a) {
            case 4:
                return m24385v(i);
            case 11:
                return m24386w(i);
            default:
                return m24387x(i);
        }
    }

    @Override // p000.InterfaceC3987eO
    /* renamed from: j */
    public void mo393j() {
        ((C0300El) this.f41678b).m2375b(null);
    }

    /* renamed from: k */
    public void m24380k(DM0 dm0, int i, int i2) {
        EM0 em0;
        EM0 em02 = (EM0) dm0;
        if (em02.m2183l() == EnumC10323mu0.f37987c || (em0 = em02.f2660l) == null) {
            for (int i3 = 0; i3 < em02.m2182k(); i3++) {
                EM0 em0M2181j = em02.m2181j(i3);
                int i4 = em0M2181j.f2649a;
                SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f41680d;
                if (!sparseBooleanArray.get(i4)) {
                    sparseBooleanArray.put(i4, true);
                    m24380k(em0M2181j, em0M2181j.f2662n + i, em0M2181j.f2663o + i2);
                }
            }
            return;
        }
        int i5 = em02.f2649a;
        KJ0 kj0 = em02.f2657i;
        if (kj0 != null) {
            em0 = kj0;
        }
        int i6 = em0.f2649a;
        int i7 = em02.f2664p;
        int i8 = em02.f2665q;
        C11827yf1 c11827yf1 = (C11827yf1) this.f41678b;
        c11827yf1.f46391h.add(new C11446vf1(c11827yf1, i6, i5, i, i2, i7, i8));
    }

    @Override // p000.InterfaceC3987eO
    /* renamed from: l */
    public void mo395l(InterfaceC1345VN interfaceC1345VN) throws Exception {
        boolean z;
        C9491gO0 c9491gO0 = (C9491gO0) this.f41680d;
        MediaMuxer mediaMuxer = c9491gO0.f27721C;
        C6693qe c6693qe = (C6693qe) this.f41679c;
        if (mediaMuxer != null) {
            try {
                c9491gO0.m18495L(interfaceC1345VN, c6693qe);
                interfaceC1345VN.close();
                return;
            } catch (Throwable th) {
                try {
                    interfaceC1345VN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (c9491gO0.f27771r) {
            AbstractC7806Jm0.m4412f("Recorder");
            interfaceC1345VN.close();
            return;
        }
        InterfaceC1345VN interfaceC1345VN2 = c9491gO0.f27739U;
        if (interfaceC1345VN2 != null) {
            interfaceC1345VN2.close();
            c9491gO0.f27739U = null;
            z = true;
        } else {
            z = false;
        }
        if (!interfaceC1345VN.mo8426G()) {
            if (z) {
                AbstractC7806Jm0.m4412f("Recorder");
            }
            AbstractC7806Jm0.m4412f("Recorder");
            C6820sO c6820sO = c9491gO0.f27724F;
            c6820sO.f42398h.execute(new RunnableC4239iO(c6820sO, 3));
            interfaceC1345VN.close();
            return;
        }
        c9491gO0.f27739U = interfaceC1345VN;
        if (!c9491gO0.m18500m() || !c9491gO0.f27740V.m956d()) {
            AbstractC7806Jm0.m4412f("Recorder");
            c9491gO0.m18487D(c6693qe);
        } else if (z) {
            AbstractC7806Jm0.m4412f("Recorder");
        } else {
            AbstractC7806Jm0.m4412f("Recorder");
        }
    }

    /* renamed from: m */
    public Object m24381m(Cipher cipher, C1674ab c1674ab) {
        RU0 ru0 = new RU0(AbstractC10599p22.m23595b(c1674ab));
        C8170Qm0 c8170Qm0 = new C8170Qm0((AbstractActivityC1730l) this.f41678b, (Executor) this.f41679c, new C1795bb(0, ru0));
        C8071Oo1 c8071Oo1 = new C8071Oo1(cipher);
        C0674Kh c0674Kh = (C0674Kh) this.f41680d;
        if (c0674Kh == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        int i = c0674Kh.f6257f;
        if (i == 0) {
            i = 15;
        }
        if ((i & KotlinVersion.MAX_COMPONENT_VALUE) == 255) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && AbstractC10132lO1.m22420e(i)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        c8170Qm0.m6778u(c0674Kh, c8071Oo1);
        Object objM7026b = ru0.m7026b();
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        return objM7026b;
    }

    @Override // p000.InterfaceC9585h70
    /* renamed from: n */
    public Bitmap mo9145n(BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(((C1875a) this.f41680d).m10891a().getFileDescriptor(), null, options);
    }

    /* renamed from: o */
    public synchronized void m24382o() {
        if (!((LinkedHashSet) this.f41678b).isEmpty()) {
            ((C0563Iw) this.f41680d).m4079e(0L);
        }
    }

    @Override // p000.InterfaceC0980PZ
    public void onFailure(Throwable th) {
        switch (this.f41677a) {
            case 16:
                C0471HT c0471ht = (C0471HT) this.f41678b;
                RunnableC1707a runnableC1707a = new RunnableC1707a(c0471ht);
                if (DV1.m1718c()) {
                    runnableC1707a.run();
                } else {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    AbstractC9104dM1.m17550i(new Handler(Looper.getMainLooper()).post(new O91(runnableC1707a, 1, countDownLatch)), "Unable to post to main thread");
                    try {
                        if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                            throw new IllegalStateException("Timeout to wait main thread execution");
                        }
                    } catch (InterruptedException e) {
                        throw new C6838sg((Throwable) e);
                    }
                }
                C7162xp c7162xp = (C7162xp) c0471ht.f4313e;
                if (c7162xp != null) {
                    C8875bc1 c8875bc1 = c7162xp.m25942b().f40378b;
                    ((ArrayList) c8875bc1.f17089b).clear();
                    ((HashMap) c8875bc1.f17090c).clear();
                    ((ArrayList) c8875bc1.f17091d).clear();
                    ((HashSet) c8875bc1.f17092e).clear();
                    c8875bc1.f17088a = 0;
                }
                C7162xp c7162xp2 = (C7162xp) c0471ht.f4313e;
                InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0M25945e = c7162xp2 != null ? c7162xp2.m25945e() : F70.f3069c;
                O90.m5967e(interfaceFutureC7800Jj0M25945e, "if (cameraX != null) cam…mediateFuture<Void>(null)");
                synchronized (c0471ht.f4309a) {
                    c0471ht.f4310b = null;
                    c0471ht.f4311c = interfaceFutureC7800Jj0M25945e;
                    ((HashMap) c0471ht.f4315g).clear();
                }
                c0471ht.f4313e = null;
                c0471ht.f4314f = null;
                return;
            default:
                boolean z = th instanceof CancellationException;
                C0300El c0300El = (C0300El) this.f41679c;
                if (z) {
                    AbstractC9104dM1.m17550i(c0300El.m2377d(new X61(AbstractC1374Vq.m8593l(new StringBuilder(), (String) this.f41680d, " cancelled."), th)), null);
                    return;
                } else {
                    c0300El.m2375b(null);
                    return;
                }
        }
    }

    @Override // p000.InterfaceC0980PZ
    public void onSuccess(Object obj) {
        switch (this.f41677a) {
            case 16:
                C7162xp c7162xp = (C7162xp) this.f41679c;
                C0471HT c0471ht = (C0471HT) this.f41678b;
                c0471ht.f4313e = c7162xp;
                c0471ht.f4314f = AbstractC9376fU1.m18245f((ReactContext) this.f41680d);
                break;
            default:
                AbstractC8301Sz1.m7490m((InterfaceFutureC7800Jj0) this.f41678b, (C0300El) this.f41679c);
                break;
        }
    }

    @Override // p000.InterfaceC3987eO
    /* renamed from: q */
    public void mo400q(C1282UN c1282un) {
        ((C0300El) this.f41678b).m2377d(c1282un);
    }

    /* renamed from: t */
    public long m24383t() {
        C7000vF c7000vF = (C7000vF) this.f41680d;
        if (c7000vF != null) {
            return c7000vF.f44295d;
        }
        return -1L;
    }

    /* renamed from: u */
    public DM0 m24384u(int i) {
        ((C11287uQ0) this.f41680d).m25186a();
        return (DM0) ((SparseArray) this.f41678b).get(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d7  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.InterfaceC6946uO m24385v(int r22) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10910rT1.m24385v(int):uO");
    }

    /* renamed from: w */
    public InterfaceC6946uO m24386w(int i) {
        HashMap map = (HashMap) this.f41680d;
        if (map.containsKey(Integer.valueOf(i))) {
            return (InterfaceC6946uO) map.get(Integer.valueOf(i));
        }
        InterfaceC6883tO interfaceC6883tO = (InterfaceC6883tO) this.f41678b;
        C7213yd c7213ydM26204e = null;
        if (interfaceC6883tO.mo5443h(i)) {
            InterfaceC6946uO interfaceC6946uOMo5444i = interfaceC6883tO.mo5444i(i);
            if (interfaceC6946uOMo5444i != null) {
                ArrayList arrayList = new ArrayList();
                for (C7276zd c7276zd : interfaceC6946uOMo5444i.mo9564d()) {
                    if (AbstractC0338FM.m2584a(c7276zd, (C0149CM) this.f41679c)) {
                        arrayList.add(c7276zd);
                    }
                }
                if (!arrayList.isEmpty()) {
                    c7213ydM26204e = C7213yd.m26204e(interfaceC6946uOMo5444i.mo9561a(), interfaceC6946uOMo5444i.mo9562b(), interfaceC6946uOMo5444i.mo9563c(), arrayList);
                }
            }
            map.put(Integer.valueOf(i), c7213ydM26204e);
        }
        return c7213ydM26204e;
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: w0 */
    public void mo852w0(InterfaceC6843sl interfaceC6843sl, IOException iOException) {
        O90.m5968f(interfaceC6843sl, "call");
        C10969rx0.m24557g((C10969rx0) this.f41679c, interfaceC6843sl, iOException, (ES1) this.f41680d);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00de  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.InterfaceC6946uO m24387x(int r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.Object r2 = r0.f41680d
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L1d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            java.lang.Object r1 = r2.get(r1)
            uO r1 = (p000.InterfaceC6946uO) r1
            return r1
        L1d:
            java.lang.Object r3 = r0.f41678b
            tO r3 = (p000.InterfaceC6883tO) r3
            boolean r4 = r3.mo5443h(r1)
            if (r4 == 0) goto Lde
            uO r3 = r3.mo5444i(r1)
            java.util.Objects.requireNonNull(r3)
            java.lang.Object r4 = r0.f41679c
            e41 r4 = (p000.C9196e41) r4
            java.lang.Class<androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk> r6 = androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk.class
            java.util.ArrayList r4 = r4.m17838B0(r6)
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
            java.util.List r7 = r3.mo9564d()
            java.util.Iterator r7 = r7.iterator()
        L85:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lc6
            java.lang.Object r8 = r7.next()
            zd r8 = (p000.C7276zd) r8
            int r10 = r8.f46899a
            int r14 = r4.getWidth()
            int r15 = r4.getHeight()
            zd r13 = new zd
            int r12 = r8.f46907i
            int r11 = r8.f46908j
            java.lang.String r9 = r8.f46900b
            int r5 = r8.f46901c
            int r0 = r8.f46902d
            int r1 = r8.f46905g
            int r8 = r8.f46906h
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
            int r0 = r3.mo9561a()
            int r1 = r3.mo9562b()
            java.util.List r3 = r3.mo9563c()
            yd r5 = p000.C7213yd.m26204e(r0, r1, r3, r6)
            goto Ldf
        Lde:
            r5 = 0
        Ldf:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r2.put(r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10910rT1.m24387x(int):uO");
    }

    @Override // p000.InterfaceC9585h70
    /* renamed from: y */
    public ImageHeaderParser$ImageType mo9155y() throws Throwable {
        C1875a c1875a = (C1875a) this.f41680d;
        C11967zm0 c11967zm0 = (C11967zm0) this.f41678b;
        ArrayList arrayList = (ArrayList) this.f41679c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            H60 h60 = (H60) arrayList.get(i);
            C10515oO0 c10515oO0 = null;
            try {
                C10515oO0 c10515oO02 = new C10515oO0(new FileInputStream(c1875a.m10891a().getFileDescriptor()), c11967zm0);
                try {
                    ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo3299c = h60.mo3299c(c10515oO02);
                    c10515oO02.release();
                    c1875a.m10891a();
                    if (imageHeaderParser$ImageTypeMo3299c != ImageHeaderParser$ImageType.UNKNOWN) {
                        return imageHeaderParser$ImageTypeMo3299c;
                    }
                } catch (Throwable th) {
                    th = th;
                    c10515oO0 = c10515oO02;
                    if (c10515oO0 != null) {
                        c10515oO0.release();
                    }
                    c1875a.m10891a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* renamed from: z */
    public boolean m24388z() throws IOException {
        String strTrim;
        if (((String) this.f41680d) != null) {
            return true;
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f41679c;
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.f41680d = str;
            return true;
        }
        do {
            String line = ((BufferedReader) this.f41678b).readLine();
            this.f41680d = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.f41680d = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }

    public /* synthetic */ C10910rT1(Object obj, Object obj2, Object obj3, int i) {
        this.f41677a = i;
        this.f41678b = obj;
        this.f41679c = obj2;
        this.f41680d = obj3;
    }

    public C10910rT1(int i) {
        this.f41677a = i;
        switch (i) {
            case 7:
                HandlerThread handlerThread = new HandlerThread("mrousavy/VisionCamera.video");
                this.f41678b = handlerThread;
                handlerThread.start();
                Handler handler = new Handler(handlerThread.getLooper());
                this.f41679c = handler;
                int i2 = AbstractC11874z20.f46602a;
                this.f41680d = N02.m5506d(new C11747y20(handler, "mrousavy/VisionCamera.video", false));
                break;
            case 24:
                this.f41678b = new SparseArray();
                this.f41679c = new SparseBooleanArray();
                this.f41680d = new C11287uQ0();
                break;
            case 29:
                this.f41678b = Collections.emptyList();
                this.f41679c = Collections.emptyList();
                break;
            default:
                this.f41678b = new HashMap();
                this.f41679c = new HashMap();
                this.f41680d = f41675g;
                break;
        }
    }

    public C10910rT1(Context context, int i) {
        this.f41677a = i;
        switch (i) {
            case 10:
                this.f41680d = new C4049fN(12);
                this.f41678b = context;
                break;
            default:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.f41679c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                this.f41680d = Executors.newSingleThreadExecutor();
                this.f41678b = context;
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new RunnableC10431nk0(19, this), 0L, 86400L, TimeUnit.SECONDS);
                break;
        }
    }

    @Override // p000.InterfaceC9585h70
    /* renamed from: s */
    public void mo9150s() {
    }

    public C10910rT1(String str, String str2, String str3) {
        this.f41677a = 12;
        this.f41678b = str;
        this.f41679c = str3 == null ? "" : str3;
        this.f41680d = str2;
    }

    public C10910rT1(AbstractActivityC1730l abstractActivityC1730l, Context context, String str) {
        this.f41677a = 3;
        O90.m5968f(str, "title");
        this.f41678b = abstractActivityC1730l;
        Executor executorM17901c = AbstractC3982eJ.m17901c(context);
        O90.m5967e(executorM17901c, "getMainExecutor(...)");
        this.f41679c = executorM17901c;
        C0611Jh c0611Jh = new C0611Jh();
        c0611Jh.f5669c = str;
        c0611Jh.f5672f = context.getString(R.string.cancel);
        this.f41680d = c0611Jh.m4386b();
    }

    public C10910rT1(S91 s91) {
        this.f41677a = 28;
        this.f41678b = s91;
        this.f41679c = new C0838NJ(ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE);
    }

    public C10910rT1(List list) {
        this.f41677a = 17;
        this.f41680d = list;
        this.f41678b = new ArrayList(list.size());
        this.f41679c = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.f41678b).add(new UZ0((List) ((C7340An0) list.get(i)).f373b.f11615b));
            ((ArrayList) this.f41679c).add(((C7340An0) list.get(i)).f374c.mo4553M0());
        }
    }

    public C10910rT1(ExecutorService executorService, ExecutorService executorService2) {
        this.f41677a = 1;
        O90.m5968f(executorService, "backgroundExecutorService");
        O90.m5968f(executorService2, "blockingExecutorService");
        this.f41678b = new ExecutorC1584ZA(executorService);
        this.f41679c = new ExecutorC1584ZA(executorService);
        AbstractC9376fU1.m18244e(null);
        this.f41680d = new ExecutorC1584ZA(executorService2);
    }

    public C10910rT1(C7967Mo1 c7967Mo1) {
        this.f41677a = 14;
        this.f41678b = new OL0(15);
        this.f41679c = (C1833cD) c7967Mo1.f7362a;
        this.f41680d = (C0856Nb) c7967Mo1.f7363b;
    }

    public C10910rT1(InterfaceC6883tO interfaceC6883tO, C0149CM c0149cm) {
        this.f41677a = 11;
        this.f41680d = new HashMap();
        this.f41678b = interfaceC6883tO;
        this.f41679c = c0149cm;
    }

    public C10910rT1(InterfaceC6883tO interfaceC6883tO, C9196e41 c9196e41) {
        this.f41677a = 21;
        this.f41680d = new HashMap();
        this.f41678b = interfaceC6883tO;
        this.f41679c = c9196e41;
    }

    public C10910rT1(C0786MU c0786mu, InterfaceC1478XU interfaceC1478XU, C0248Dw c0248Dw, C7169xw c7169xw, Context context, String str, C0877Nw c0877Nw, ScheduledExecutorService scheduledExecutorService) {
        this.f41677a = 8;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f41678b = linkedHashSet;
        this.f41680d = new C0563Iw(c0786mu, interfaceC1478XU, c0248Dw, c7169xw, context, str, linkedHashSet, c0877Nw, scheduledExecutorService);
        this.f41679c = scheduledExecutorService;
    }

    public C10910rT1(InterfaceC1601ZR interfaceC1601ZR) {
        this.f41677a = 6;
        this.f41678b = interfaceC1601ZR;
    }

    public C10910rT1(C9461g90 c9461g90, List[] listArr, Method method) {
        this.f41677a = 27;
        O90.m5968f(c9461g90, "argumentRange");
        this.f41678b = c9461g90;
        this.f41679c = listArr;
        this.f41680d = method;
    }

    public C10910rT1(InterfaceC0936Os interfaceC0936Os, List list, C10910rT1 c10910rT1) {
        this.f41677a = 20;
        O90.m5968f(interfaceC0936Os, "classifierDescriptor");
        O90.m5968f(list, "arguments");
        this.f41678b = interfaceC0936Os;
        this.f41679c = list;
        this.f41680d = c10910rT1;
    }

    public C10910rT1(C4023ey c4023ey) {
        this.f41677a = 5;
        this.f41678b = new ArrayList();
        this.f41679c = new C1050Qg();
        this.f41680d = c4023ey;
    }

    public C10910rT1(C11827yf1 c11827yf1, C10910rT1 c10910rT1) {
        this.f41677a = 18;
        this.f41680d = new SparseBooleanArray();
        this.f41678b = c11827yf1;
        this.f41679c = c10910rT1;
    }

    public C10910rT1(C10910rT1 c10910rT1) {
        this.f41677a = 4;
        C0553Im c0553Im = C9017cj1.f17713d;
        this.f41680d = new HashMap();
        this.f41678b = c10910rT1;
        this.f41679c = c0553Im;
    }

    public C10910rT1(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C11967zm0 c11967zm0) {
        this.f41677a = 15;
        IL1.m3830d(c11967zm0, "Argument must not be null");
        this.f41678b = c11967zm0;
        IL1.m3830d(arrayList, "Argument must not be null");
        this.f41679c = arrayList;
        this.f41680d = new C1875a(parcelFileDescriptor);
    }

    public C10910rT1(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f41677a = 13;
        this.f41679c = arrayDeque;
        this.f41678b = bufferedReader;
    }

    public C10910rT1(C9491gO0 c9491gO0, C0300El c0300El, C6693qe c6693qe) {
        this.f41677a = 22;
        this.f41680d = c9491gO0;
        this.f41678b = c0300El;
        this.f41679c = c6693qe;
    }
}

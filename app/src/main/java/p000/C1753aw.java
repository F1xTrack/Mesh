package p000;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.media.MediaActionSound;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.Range;
import android.view.Choreographer;
import android.view.WindowInsetsAnimationController;
import androidx.fragment.app.AbstractC1733o;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: aw */
/* loaded from: classes.dex */
public final class C1753aw {

    /* renamed from: a */
    public final /* synthetic */ int f16681a;

    /* renamed from: b */
    public Object f16682b;

    /* renamed from: c */
    public boolean f16683c;

    /* renamed from: d */
    public Object f16684d;

    /* renamed from: e */
    public Object f16685e;

    /* renamed from: f */
    public Object f16686f;

    /* renamed from: g */
    public Object f16687g;

    public C1753aw(C0827N8 c0827n8, A61 a61, A90 a90, C0273EK c0273ek, C7564Ev0 c7564Ev0) {
        this.f16681a = 10;
        this.f16682b = c0827n8;
        this.f16684d = a61;
        this.f16685e = a90;
        this.f16686f = c0273ek;
        this.f16687g = c7564Ev0;
    }

    /* renamed from: c */
    public static void m10382c(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: e */
    public static InterfaceC8281Sp1 m10383e(C0428Gn c0428Gn) {
        Range range;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) c0428Gn.m3155a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError unused) {
                AbstractC7806Jm0.m4412f("ZoomControl");
                range = null;
            }
            if (range != null) {
                return new C0068B4(c0428Gn);
            }
        }
        C8071Oo1 c8071Oo1 = new C8071Oo1();
        c8071Oo1.f8628b = null;
        c8071Oo1.f8630d = null;
        c8071Oo1.f8627a = c0428Gn;
        return c8071Oo1;
    }

    /* renamed from: a */
    public void m10384a(Float f, boolean z) {
        C11878z31 c11878z31;
        C10226m71 c10226m71 = (C10226m71) this.f16682b;
        if (c10226m71 == null) {
            throw new IllegalStateException("Controller should not be null");
        }
        C7236z c7236z = new C7236z(22, this);
        C10801qd0 c10801qd0 = new C10801qd0(6, c10226m71);
        C10339n11 c10339n11 = (C10339n11) c10226m71.f37493b;
        float f2 = z ? J80.m4202c(((WindowInsetsAnimationController) c10339n11.f38046b).getShownStateInsets()).f5355d : J80.m4202c(((WindowInsetsAnimationController) c10339n11.f38046b).getHiddenStateInsets()).f5355d;
        CC0 cc0 = new CC0(c10801qd0, 13, c7236z);
        if (Float.isNaN(f2)) {
            c11878z31 = new C11878z31(cc0);
            c11878z31.f46615j = null;
            c11878z31.f46616k = Float.MAX_VALUE;
        } else {
            C11878z31 c11878z312 = new C11878z31(cc0);
            c11878z312.f46615j = null;
            c11878z312.f46616k = Float.MAX_VALUE;
            c11878z312.f46615j = new A31(f2);
            c11878z31 = c11878z312;
        }
        if (c11878z31.f46615j == null) {
            c11878z31.f46615j = new A31();
        }
        A31 a31 = c11878z31.f46615j;
        O90.m5964b(a31, "spring");
        a31.f35b = 1.0f;
        a31.f36c = false;
        a31.f34a = Math.sqrt(1500.0f);
        a31.f36c = false;
        if (f != null) {
            c11878z31.f46606a = f.floatValue();
        }
        C8520Xf0 c8520Xf0 = new C8520Xf0(this);
        ArrayList arrayList = c11878z31.f46613h;
        if (!arrayList.contains(c8520Xf0)) {
            arrayList.add(c8520Xf0);
        }
        A31 a312 = c11878z31.f46615j;
        if (a312 == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d = (float) a312.f42i;
        if (d > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        float f3 = c11878z31.f46610e;
        if (d < f3) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(c11878z31.f46612g * 0.75f);
        a312.f37d = dAbs;
        a312.f38e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z2 = c11878z31.f46609d;
        if (!z2 && !z2) {
            c11878z31.f46609d = true;
            float fFloatValue = ((Number) ((C10801qd0) ((CC0) c11878z31.f46608c.f7393b).f1250b).invoke()).floatValue();
            c11878z31.f46607b = fFloatValue;
            if (fFloatValue > Float.MAX_VALUE || fFloatValue < f3) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            ThreadLocal threadLocal = C6215j5.f34903f;
            if (threadLocal.get() == null) {
                threadLocal.set(new C6215j5());
            }
            C6215j5 c6215j5 = (C6215j5) threadLocal.get();
            ArrayList arrayList2 = c6215j5.f34905b;
            if (arrayList2.size() == 0) {
                if (c6215j5.f34907d == null) {
                    c6215j5.f34907d = new C10189lr0(c6215j5.f34906c);
                }
                C10189lr0 c10189lr0 = c6215j5.f34907d;
                ((Choreographer) c10189lr0.f37324c).postFrameCallback((ChoreographerFrameCallbackC4220i5) c10189lr0.f37325d);
            }
            if (!arrayList2.contains(c11878z31)) {
                arrayList2.add(c11878z31);
            }
        }
        this.f16687g = c11878z31;
    }

    /* renamed from: b */
    public boolean m10385b(Method method, Class cls) {
        StringBuilder sb = (StringBuilder) this.f16686f;
        sb.setLength(0);
        sb.append(method.getName());
        sb.append('>');
        sb.append(cls.getName());
        String string = sb.toString();
        Class<?> declaringClass = method.getDeclaringClass();
        HashMap map = (HashMap) this.f16685e;
        Class cls2 = (Class) map.put(string, declaringClass);
        if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
            return true;
        }
        map.put(string, cls2);
        return false;
    }

    /* renamed from: d */
    public void m10386d() {
        C0300El c0300El = (C0300El) this.f16686f;
        if (c0300El != null) {
            c0300El.m2377d(new C1434Wn("Cancelled by another setExposureCompensationIndex()"));
            this.f16686f = null;
        }
        C6886tR c6886tR = (C6886tR) this.f16687g;
        if (c6886tR != null) {
            ((C6573om) this.f16682b).m23549j(c6886tR);
            this.f16687g = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m10387f(java.lang.String r5, java.lang.reflect.Type r6) {
        /*
            r4 = this;
            xe1 r0 = new xe1
            r0.<init>(r6)
            java.io.StringReader r6 = new java.io.StringReader
            r6.<init>(r5)
            yc0 r5 = new yc0
            r5.<init>(r6)
            java.lang.String r6 = "AssertionError (GSON 2.10.1): "
            r1 = 1
            r5.f46342b = r1
            r2 = 0
            r5.m26194p0()     // Catch: java.lang.Throwable -> L23 java.lang.AssertionError -> L25 java.io.IOException -> L27 java.lang.IllegalStateException -> L29 java.io.EOFException -> L50
            rd1 r0 = r4.m10388g(r0)     // Catch: java.lang.Throwable -> L23 java.lang.AssertionError -> L25 java.io.IOException -> L27 java.lang.IllegalStateException -> L29 java.io.EOFException -> L2b
            java.lang.Object r6 = r0.mo480a(r5)     // Catch: java.lang.Throwable -> L23 java.lang.AssertionError -> L25 java.io.IOException -> L27 java.lang.IllegalStateException -> L29 java.io.EOFException -> L2b
            r5.f46342b = r2
            goto L56
        L23:
            r6 = move-exception
            goto L80
        L25:
            r0 = move-exception
            goto L2e
        L27:
            r6 = move-exception
            goto L44
        L29:
            r6 = move-exception
            goto L4a
        L2b:
            r6 = move-exception
            r1 = r2
            goto L51
        L2e:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L23
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L23
            java.lang.String r6 = r0.getMessage()     // Catch: java.lang.Throwable -> L23
            r3.append(r6)     // Catch: java.lang.Throwable -> L23
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r6, r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L44:
            qc0 r0 = new qc0     // Catch: java.lang.Throwable -> L23
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L23
            throw r0     // Catch: java.lang.Throwable -> L23
        L4a:
            qc0 r0 = new qc0     // Catch: java.lang.Throwable -> L23
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L23
            throw r0     // Catch: java.lang.Throwable -> L23
        L50:
            r6 = move-exception
        L51:
            if (r1 == 0) goto L7a
            r5.f46342b = r2
            r6 = 0
        L56:
            if (r6 == 0) goto L79
            int r5 = r5.m26194p0()     // Catch: java.io.IOException -> L69 p000.C8014Nm0 -> L6b
            r0 = 10
            if (r5 != r0) goto L61
            goto L79
        L61:
            qc0 r5 = new qc0     // Catch: java.io.IOException -> L69 p000.C8014Nm0 -> L6b
            java.lang.String r6 = "JSON document was not fully consumed."
            r5.<init>(r6)     // Catch: java.io.IOException -> L69 p000.C8014Nm0 -> L6b
            throw r5     // Catch: java.io.IOException -> L69 p000.C8014Nm0 -> L6b
        L69:
            r5 = move-exception
            goto L6d
        L6b:
            r5 = move-exception
            goto L73
        L6d:
            qc0 r6 = new qc0
            r6.<init>(r5)
            throw r6
        L73:
            qc0 r6 = new qc0
            r6.<init>(r5)
            throw r6
        L79:
            return r6
        L7a:
            qc0 r0 = new qc0     // Catch: java.lang.Throwable -> L23
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L23
            throw r0     // Catch: java.lang.Throwable -> L23
        L80:
            r5.f46342b = r2
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1753aw.m10387f(java.lang.String, java.lang.reflect.Type):java.lang.Object");
    }

    /* renamed from: g */
    public AbstractC10930rd1 m10388g(C11698xe1 c11698xe1) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f16684d;
        AbstractC10930rd1 abstractC10930rd1 = (AbstractC10930rd1) concurrentHashMap.get(c11698xe1);
        if (abstractC10930rd1 != null) {
            return abstractC10930rd1;
        }
        ThreadLocal threadLocal = (ThreadLocal) this.f16682b;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            AbstractC10930rd1 abstractC10930rd12 = (AbstractC10930rd1) map.get(c11698xe1);
            if (abstractC10930rd12 != null) {
                return abstractC10930rd12;
            }
            z = false;
        }
        try {
            C8928c20 c8928c20 = new C8928c20();
            AbstractC10930rd1 abstractC10930rd1Mo1562a = null;
            c8928c20.f17264a = null;
            map.put(c11698xe1, c8928c20);
            Iterator it = ((List) this.f16687g).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC10930rd1Mo1562a = ((InterfaceC11186td1) it.next()).mo1562a(this, c11698xe1);
                if (abstractC10930rd1Mo1562a != null) {
                    if (c8928c20.f17264a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c8928c20.f17264a = abstractC10930rd1Mo1562a;
                    map.put(c11698xe1, abstractC10930rd1Mo1562a);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (abstractC10930rd1Mo1562a != null) {
                if (z) {
                    concurrentHashMap.putAll(map);
                }
                return abstractC10930rd1Mo1562a;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + c11698xe1);
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* renamed from: h */
    public int m10389h() {
        C10226m71 c10226m71 = (C10226m71) this.f16682b;
        if (c10226m71 != null) {
            return c10226m71.m22682i().f5355d;
        }
        throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
    }

    /* renamed from: i */
    public int m10390i(int i) {
        C10226m71 c10226m71 = (C10226m71) this.f16682b;
        if (c10226m71 == null) {
            throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
        }
        C10339n11 c10339n11 = (C10339n11) c10226m71.f37493b;
        J80 j80M4202c = J80.m4202c(((WindowInsetsAnimationController) c10339n11.f38046b).getHiddenStateInsets());
        J80 j80M4202c2 = J80.m4202c(((WindowInsetsAnimationController) c10339n11.f38046b).getShownStateInsets());
        boolean z = this.f16683c;
        int i2 = j80M4202c.f5355d;
        int i3 = j80M4202c2.f5355d;
        int i4 = z ? i3 : i2;
        int i5 = z ? i2 : i3;
        int iM22418c = AbstractC10132lO1.m22418c(i, i2, i3);
        int i6 = c10226m71.m22682i().f5355d - iM22418c;
        ((WindowInsetsAnimationController) c10339n11.f38046b).setInsetsAndAlpha(J80.m4201b(0, 0, 0, iM22418c).m4203d(), 1.0f, (iM22418c - i4) / (i5 - i4));
        return i6;
    }

    /* renamed from: j */
    public C7838Kc0 m10391j(Writer writer) {
        C7838Kc0 c7838Kc0 = new C7838Kc0(writer);
        c7838Kc0.f6232e = false;
        c7838Kc0.f6234g = this.f16683c;
        return c7838Kc0;
    }

    /* renamed from: k */
    public void m10392k() {
        this.f16682b = null;
        this.f16684d = null;
        this.f16683c = false;
        C11878z31 c11878z31 = (C11878z31) this.f16687g;
        if (c11878z31 != null) {
            c11878z31.m26307a();
        }
        this.f16687g = null;
        this.f16685e = null;
    }

    /* renamed from: l */
    public void m10393l(C7838Kc0 c7838Kc0) {
        C10927rc0 c10927rc0 = C10927rc0.f41756a;
        boolean z = c7838Kc0.f6232e;
        c7838Kc0.f6232e = true;
        boolean z2 = c7838Kc0.f6234g;
        c7838Kc0.f6234g = this.f16683c;
        try {
            try {
                try {
                    C11696xd1 c11696xd1 = AbstractC7425Cd1.f1505a;
                    C7722Hw0.m3654d(c7838Kc0, c10927rc0);
                    c7838Kc0.f6232e = z;
                    c7838Kc0.f6234g = z2;
                } catch (IOException e) {
                    throw new C10799qc0(e);
                }
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            c7838Kc0.f6232e = z;
            c7838Kc0.f6234g = z2;
            throw th;
        }
    }

    /* renamed from: m */
    public void m10394m(Map map, Class cls, C7838Kc0 c7838Kc0) {
        AbstractC10930rd1 abstractC10930rd1M10388g = m10388g(new C11698xe1(cls));
        boolean z = c7838Kc0.f6232e;
        c7838Kc0.f6232e = true;
        boolean z2 = c7838Kc0.f6234g;
        c7838Kc0.f6234g = this.f16683c;
        try {
            try {
                abstractC10930rd1M10388g.mo481b(c7838Kc0, map);
            } catch (IOException e) {
                throw new C10799qc0(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } finally {
            c7838Kc0.f6232e = z;
            c7838Kc0.f6234g = z2;
        }
    }

    /* renamed from: n */
    public void m10395n(C0984Pd c0984Pd) {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        C7560Et0 c7560Et0 = (C7560Et0) this.f16686f;
        if (looperMyLooper == mainLooper) {
            c7560Et0.mo2439j(c0984Pd);
        } else {
            c7560Et0.m2440k(c0984Pd);
        }
    }

    public String toString() {
        switch (this.f16681a) {
            case 3:
                return "{serializeNulls:" + this.f16683c + ",factories:" + ((List) this.f16687g) + ",instanceCreators:" + ((C6459my) this.f16685e) + "}";
            default:
                return super.toString();
        }
    }

    public C1753aw(int i) {
        this.f16681a = i;
        switch (i) {
            case 8:
                this.f16682b = new ArrayList();
                this.f16684d = new HashMap();
                this.f16685e = new HashMap();
                this.f16686f = new StringBuilder(128);
                break;
            default:
                this.f16686f = AbstractC0705LB.m4915b(new C10801qd0(7, this));
                break;
        }
    }

    public C1753aw(Bundle bundle, Promise promise, AbstractC1733o abstractC1733o, ReactApplicationContext reactApplicationContext, int i) {
        this.f16681a = i;
        switch (i) {
            case 7:
                O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
                O90.m5968f(abstractC1733o, "fragmentManager");
                this.f16682b = bundle;
                this.f16684d = promise;
                this.f16685e = reactApplicationContext;
                C6937uF c6937uF = new C6937uF();
                c6937uF.f43616a = new C10156la1(0);
                this.f16687g = c6937uF;
                break;
            default:
                O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
                O90.m5968f(abstractC1733o, "fragmentManager");
                this.f16682b = bundle;
                this.f16684d = promise;
                this.f16685e = reactApplicationContext;
                this.f16687g = new C1536YP(new C9315f11());
                break;
        }
    }

    public C1753aw(boolean z, MediaActionSound mediaActionSound, C4140gp c4140gp, C0619Jp c0619Jp, File file, C1339VH c1339vh) {
        this.f16681a = 4;
        this.f16683c = z;
        this.f16682b = mediaActionSound;
        this.f16684d = c4140gp;
        this.f16685e = c0619Jp;
        this.f16686f = file;
        this.f16687g = c1339vh;
    }

    public C1753aw(C6573om c6573om, C0428Gn c0428Gn, ExecutorC10151lY0 executorC10151lY0, int i) {
        this.f16681a = i;
        switch (i) {
            case 9:
                this.f16683c = false;
                C8229Rp1 c8229Rp1 = new C8229Rp1(this);
                this.f16682b = c6573om;
                this.f16684d = executorC10151lY0;
                InterfaceC8281Sp1 interfaceC8281Sp1M10383e = m10383e(c0428Gn);
                this.f16687g = interfaceC8281Sp1M10383e;
                C8385Up1 c8385Up1 = new C8385Up1(interfaceC8281Sp1M10383e.getMaxZoom(), interfaceC8281Sp1M10383e.getMinZoom());
                this.f16685e = c8385Up1;
                c8385Up1.m8186d(1.0f);
                this.f16686f = new C7560Et0(C0984Pd.m6387d(c8385Up1));
                c6573om.m23543a(c8229Rp1);
                break;
            default:
                this.f16683c = false;
                this.f16682b = c6573om;
                this.f16684d = new C1356VY(c0428Gn);
                this.f16685e = executorC10151lY0;
                break;
        }
    }

    public C1753aw(Context context, C11962zj1 c11962zj1) {
        this.f16681a = 0;
        this.f16682b = context.getApplicationContext();
        this.f16684d = c11962zj1;
        this.f16687g = M71.f6997a;
    }

    public C1753aw(C1846cQ c1846cQ, HashMap map, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f16681a = 3;
        C8303Ta1 c8303Ta1 = EnumC8407Va1.f12625b;
        this.f16682b = new ThreadLocal();
        this.f16684d = new ConcurrentHashMap();
        C6459my c6459my = new C6459my(map, arrayList4);
        this.f16685e = c6459my;
        this.f16683c = true;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(AbstractC7425Cd1.f1530z);
        arrayList5.add(new C7618Fw0(1, c8303Ta1));
        arrayList5.add(c1846cQ);
        arrayList5.addAll(arrayList3);
        arrayList5.add(AbstractC7425Cd1.f1520p);
        arrayList5.add(AbstractC7425Cd1.f1511g);
        arrayList5.add(AbstractC7425Cd1.f1508d);
        arrayList5.add(AbstractC7425Cd1.f1509e);
        arrayList5.add(AbstractC7425Cd1.f1510f);
        C7722Hw0 c7722Hw0 = AbstractC7425Cd1.f1515k;
        arrayList5.add(new C8722aQ0(Long.TYPE, Long.class, c7722Hw0));
        arrayList5.add(new C8722aQ0(Double.TYPE, Double.class, new C7722Hw0(1)));
        arrayList5.add(new C8722aQ0(Float.TYPE, Float.class, new C7722Hw0(2)));
        arrayList5.add(C7722Hw0.f4608b);
        arrayList5.add(AbstractC7425Cd1.f1512h);
        arrayList5.add(AbstractC7425Cd1.f1513i);
        arrayList5.add(new C11696xd1(AtomicLong.class, new D31(new D31(c7722Hw0, 1), 3), 0));
        arrayList5.add(new C11696xd1(AtomicLongArray.class, new D31(new D31(c7722Hw0, 2), 3), 0));
        arrayList5.add(AbstractC7425Cd1.f1514j);
        arrayList5.add(AbstractC7425Cd1.f1516l);
        arrayList5.add(AbstractC7425Cd1.f1521q);
        arrayList5.add(AbstractC7425Cd1.f1522r);
        arrayList5.add(new C11696xd1(BigDecimal.class, AbstractC7425Cd1.f1517m, 0));
        arrayList5.add(new C11696xd1(BigInteger.class, AbstractC7425Cd1.f1518n, 0));
        arrayList5.add(new C11696xd1(C10553oh0.class, AbstractC7425Cd1.f1519o, 0));
        arrayList5.add(AbstractC7425Cd1.f1523s);
        arrayList5.add(AbstractC7425Cd1.f1524t);
        arrayList5.add(AbstractC7425Cd1.f1526v);
        arrayList5.add(AbstractC7425Cd1.f1527w);
        arrayList5.add(AbstractC7425Cd1.f1529y);
        arrayList5.add(AbstractC7425Cd1.f1525u);
        arrayList5.add(AbstractC7425Cd1.f1506b);
        arrayList5.add(B31.f532e);
        arrayList5.add(AbstractC7425Cd1.f1528x);
        if (F31.f3046a) {
            arrayList5.add(F31.f3048c);
            arrayList5.add(F31.f3047b);
            arrayList5.add(F31.f3049d);
        }
        arrayList5.add(C0324F8.f3075d);
        arrayList5.add(AbstractC7425Cd1.f1505a);
        arrayList5.add(new C7041vu(c6459my, 0));
        arrayList5.add(new C7041vu(c6459my, 2));
        C7041vu c7041vu = new C7041vu(c6459my, 1);
        this.f16686f = c7041vu;
        arrayList5.add(c7041vu);
        arrayList5.add(AbstractC7425Cd1.f1504A);
        arrayList5.add(new C8722aQ0(c6459my, c1846cQ, c7041vu, arrayList4));
        this.f16687g = Collections.unmodifiableList(arrayList5);
    }

    public C1753aw(Context context) {
        this.f16681a = 1;
        this.f16682b = context;
        this.f16684d = C1520Y9.f14173c;
        this.f16686f = C7564Ev0.f2960c;
    }
}

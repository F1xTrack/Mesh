package defpackage;

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
import androidx.fragment.app.o;
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
public final class C2226aw {
    public final /* synthetic */ int a;
    public Object b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public C2226aw(N8 n8, A61 a61, A90 a90, EK ek, C0396Ev0 c0396Ev0) {
        this.a = 10;
        this.b = n8;
        this.d = a61;
        this.e = a90;
        this.f = ek;
        this.g = c0396Ev0;
    }

    public static void c(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static InterfaceC1470Sp1 e(C0527Gn c0527Gn) {
        Range range;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) c0527Gn.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError unused) {
                AbstractC0759Jm0.f("ZoomControl");
                range = null;
            }
            if (range != null) {
                return new B4(c0527Gn);
            }
        }
        C1155Oo1 c1155Oo1 = new C1155Oo1();
        c1155Oo1.b = null;
        c1155Oo1.d = null;
        c1155Oo1.a = c0527Gn;
        return c1155Oo1;
    }

    public void a(Float f, boolean z) {
        C8292z31 c8292z31;
        C5826m71 c5826m71 = (C5826m71) this.b;
        if (c5826m71 == null) {
            throw new IllegalStateException("Controller should not be null");
        }
        C8277z c8277z = new C8277z(22, this);
        C6685qd0 c6685qd0 = new C6685qd0(6, c5826m71);
        C5996n11 c5996n11 = (C5996n11) c5826m71.b;
        float f2 = z ? J80.c(((WindowInsetsAnimationController) c5996n11.b).getShownStateInsets()).d : J80.c(((WindowInsetsAnimationController) c5996n11.b).getHiddenStateInsets()).d;
        CC0 cc0 = new CC0(c6685qd0, 13, c8277z);
        if (Float.isNaN(f2)) {
            c8292z31 = new C8292z31(cc0);
            c8292z31.j = null;
            c8292z31.k = Float.MAX_VALUE;
        } else {
            C8292z31 c8292z312 = new C8292z31(cc0);
            c8292z312.j = null;
            c8292z312.k = Float.MAX_VALUE;
            c8292z312.j = new A31(f2);
            c8292z31 = c8292z312;
        }
        if (c8292z31.j == null) {
            c8292z31.j = new A31();
        }
        A31 a31 = c8292z31.j;
        O90.b(a31, "spring");
        a31.b = 1.0f;
        a31.c = false;
        a31.a = Math.sqrt(1500.0f);
        a31.c = false;
        if (f != null) {
            c8292z31.a = f.floatValue();
        }
        C1829Xf0 c1829Xf0 = new C1829Xf0(this);
        ArrayList arrayList = c8292z31.h;
        if (!arrayList.contains(c1829Xf0)) {
            arrayList.add(c1829Xf0);
        }
        A31 a312 = c8292z31.j;
        if (a312 == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d = (float) a312.i;
        if (d > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        float f3 = c8292z31.e;
        if (d < f3) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(c8292z31.g * 0.75f);
        a312.d = dAbs;
        a312.e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z2 = c8292z31.d;
        if (!z2 && !z2) {
            c8292z31.d = true;
            float fFloatValue = ((Number) ((C6685qd0) ((CC0) c8292z31.c.b).b).invoke()).floatValue();
            c8292z31.b = fFloatValue;
            if (fFloatValue > Float.MAX_VALUE || fFloatValue < f3) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            ThreadLocal threadLocal = C5245j5.f;
            if (threadLocal.get() == null) {
                threadLocal.set(new C5245j5());
            }
            C5245j5 c5245j5 = (C5245j5) threadLocal.get();
            ArrayList arrayList2 = c5245j5.b;
            if (arrayList2.size() == 0) {
                if (c5245j5.d == null) {
                    c5245j5.d = new C5772lr0(c5245j5.c);
                }
                C5772lr0 c5772lr0 = c5245j5.d;
                ((Choreographer) c5772lr0.c).postFrameCallback((ChoreographerFrameCallbackC4278i5) c5772lr0.d);
            }
            if (!arrayList2.contains(c8292z31)) {
                arrayList2.add(c8292z31);
            }
        }
        this.g = c8292z31;
    }

    public boolean b(Method method, Class cls) {
        StringBuilder sb = (StringBuilder) this.f;
        sb.setLength(0);
        sb.append(method.getName());
        sb.append('>');
        sb.append(cls.getName());
        String string = sb.toString();
        Class<?> declaringClass = method.getDeclaringClass();
        HashMap map = (HashMap) this.e;
        Class cls2 = (Class) map.put(string, declaringClass);
        if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
            return true;
        }
        map.put(string, cls2);
        return false;
    }

    public void d() {
        C0365El c0365El = (C0365El) this.f;
        if (c0365El != null) {
            c0365El.d(new C1774Wn("Cancelled by another setExposureCompensationIndex()"));
            this.f = null;
        }
        C7220tR c7220tR = (C7220tR) this.g;
        if (c7220tR != null) {
            ((C6329om) this.b).j(c7220tR);
            this.g = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(java.lang.String r5, java.lang.reflect.Type r6) {
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
            r5.b = r1
            r2 = 0
            r5.p0()     // Catch: java.lang.Throwable -> L23 java.lang.AssertionError -> L25 java.io.IOException -> L27 java.lang.IllegalStateException -> L29 java.io.EOFException -> L50
            rd1 r0 = r4.g(r0)     // Catch: java.lang.Throwable -> L23 java.lang.AssertionError -> L25 java.io.IOException -> L27 java.lang.IllegalStateException -> L29 java.io.EOFException -> L2b
            java.lang.Object r6 = r0.a(r5)     // Catch: java.lang.Throwable -> L23 java.lang.AssertionError -> L25 java.io.IOException -> L27 java.lang.IllegalStateException -> L29 java.io.EOFException -> L2b
            r5.b = r2
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
            r5.b = r2
            r6 = 0
        L56:
            if (r6 == 0) goto L79
            int r5 = r5.p0()     // Catch: java.io.IOException -> L69 defpackage.C1070Nm0 -> L6b
            r0 = 10
            if (r5 != r0) goto L61
            goto L79
        L61:
            qc0 r5 = new qc0     // Catch: java.io.IOException -> L69 defpackage.C1070Nm0 -> L6b
            java.lang.String r6 = "JSON document was not fully consumed."
            r5.<init>(r6)     // Catch: java.io.IOException -> L69 defpackage.C1070Nm0 -> L6b
            throw r5     // Catch: java.io.IOException -> L69 defpackage.C1070Nm0 -> L6b
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
            r5.b = r2
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2226aw.f(java.lang.String, java.lang.reflect.Type):java.lang.Object");
    }

    public AbstractC6876rd1 g(C8023xe1 c8023xe1) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.d;
        AbstractC6876rd1 abstractC6876rd1 = (AbstractC6876rd1) concurrentHashMap.get(c8023xe1);
        if (abstractC6876rd1 != null) {
            return abstractC6876rd1;
        }
        ThreadLocal threadLocal = (ThreadLocal) this.b;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            AbstractC6876rd1 abstractC6876rd12 = (AbstractC6876rd1) map.get(c8023xe1);
            if (abstractC6876rd12 != null) {
                return abstractC6876rd12;
            }
            z = false;
        }
        try {
            C2438c20 c2438c20 = new C2438c20();
            AbstractC6876rd1 abstractC6876rd1A = null;
            c2438c20.a = null;
            map.put(c8023xe1, c2438c20);
            Iterator it = ((List) this.g).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC6876rd1A = ((InterfaceC7258td1) it.next()).a(this, c8023xe1);
                if (abstractC6876rd1A != null) {
                    if (c2438c20.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c2438c20.a = abstractC6876rd1A;
                    map.put(c8023xe1, abstractC6876rd1A);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (abstractC6876rd1A != null) {
                if (z) {
                    concurrentHashMap.putAll(map);
                }
                return abstractC6876rd1A;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + c8023xe1);
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public int h() {
        C5826m71 c5826m71 = (C5826m71) this.b;
        if (c5826m71 != null) {
            return c5826m71.i().d;
        }
        throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
    }

    public int i(int i) {
        C5826m71 c5826m71 = (C5826m71) this.b;
        if (c5826m71 == null) {
            throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
        }
        C5996n11 c5996n11 = (C5996n11) c5826m71.b;
        J80 j80C = J80.c(((WindowInsetsAnimationController) c5996n11.b).getHiddenStateInsets());
        J80 j80C2 = J80.c(((WindowInsetsAnimationController) c5996n11.b).getShownStateInsets());
        boolean z = this.c;
        int i2 = j80C.d;
        int i3 = j80C2.d;
        int i4 = z ? i3 : i2;
        int i5 = z ? i2 : i3;
        int iC = AbstractC5686lO1.c(i, i2, i3);
        int i6 = c5826m71.i().d - iC;
        ((WindowInsetsAnimationController) c5996n11.b).setInsetsAndAlpha(J80.b(0, 0, 0, iC).d(), 1.0f, (iC - i4) / (i5 - i4));
        return i6;
    }

    public C0807Kc0 j(Writer writer) {
        C0807Kc0 c0807Kc0 = new C0807Kc0(writer);
        c0807Kc0.e = false;
        c0807Kc0.g = this.c;
        return c0807Kc0;
    }

    public void k() {
        this.b = null;
        this.d = null;
        this.c = false;
        C8292z31 c8292z31 = (C8292z31) this.g;
        if (c8292z31 != null) {
            c8292z31.a();
        }
        this.g = null;
        this.e = null;
    }

    public void l(C0807Kc0 c0807Kc0) {
        C6872rc0 c6872rc0 = C6872rc0.a;
        boolean z = c0807Kc0.e;
        c0807Kc0.e = true;
        boolean z2 = c0807Kc0.g;
        c0807Kc0.g = this.c;
        try {
            try {
                try {
                    C8020xd1 c8020xd1 = AbstractC0187Cd1.a;
                    C0633Hw0.d(c0807Kc0, c6872rc0);
                    c0807Kc0.e = z;
                    c0807Kc0.g = z2;
                } catch (IOException e) {
                    throw new C6682qc0(e);
                }
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            c0807Kc0.e = z;
            c0807Kc0.g = z2;
            throw th;
        }
    }

    public void m(Map map, Class cls, C0807Kc0 c0807Kc0) {
        AbstractC6876rd1 abstractC6876rd1G = g(new C8023xe1(cls));
        boolean z = c0807Kc0.e;
        c0807Kc0.e = true;
        boolean z2 = c0807Kc0.g;
        c0807Kc0.g = this.c;
        try {
            try {
                abstractC6876rd1G.b(c0807Kc0, map);
            } catch (IOException e) {
                throw new C6682qc0(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } finally {
            c0807Kc0.e = z;
            c0807Kc0.g = z2;
        }
    }

    public void n(C1198Pd c1198Pd) {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        C0390Et0 c0390Et0 = (C0390Et0) this.f;
        if (looperMyLooper == mainLooper) {
            c0390Et0.j(c1198Pd);
        } else {
            c0390Et0.k(c1198Pd);
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "{serializeNulls:" + this.c + ",factories:" + ((List) this.g) + ",instanceCreators:" + ((C5983my) this.e) + "}";
            default:
                return super.toString();
        }
    }

    public C2226aw(int i) {
        this.a = i;
        switch (i) {
            case 8:
                this.b = new ArrayList();
                this.d = new HashMap();
                this.e = new HashMap();
                this.f = new StringBuilder(128);
                break;
            default:
                this.f = LB.b(new C6685qd0(7, this));
                break;
        }
    }

    public C2226aw(Bundle bundle, Promise promise, o oVar, ReactApplicationContext reactApplicationContext, int i) {
        this.a = i;
        switch (i) {
            case 7:
                O90.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
                O90.f(oVar, "fragmentManager");
                this.b = bundle;
                this.d = promise;
                this.e = reactApplicationContext;
                C7375uF c7375uF = new C7375uF();
                c7375uF.a = new C5722la1(0);
                this.g = c7375uF;
                break;
            default:
                O90.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
                O90.f(oVar, "fragmentManager");
                this.b = bundle;
                this.d = promise;
                this.e = reactApplicationContext;
                this.g = new YP(new C3692f11());
                break;
        }
    }

    public C2226aw(boolean z, MediaActionSound mediaActionSound, C4034gp c4034gp, C0767Jp c0767Jp, File file, VH vh) {
        this.a = 4;
        this.c = z;
        this.b = mediaActionSound;
        this.d = c4034gp;
        this.e = c0767Jp;
        this.f = file;
        this.g = vh;
    }

    public C2226aw(C6329om c6329om, C0527Gn c0527Gn, ExecutorC5715lY0 executorC5715lY0, int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.c = false;
                C1392Rp1 c1392Rp1 = new C1392Rp1(this);
                this.b = c6329om;
                this.d = executorC5715lY0;
                InterfaceC1470Sp1 interfaceC1470Sp1E = e(c0527Gn);
                this.g = interfaceC1470Sp1E;
                C1626Up1 c1626Up1 = new C1626Up1(interfaceC1470Sp1E.getMaxZoom(), interfaceC1470Sp1E.getMinZoom());
                this.e = c1626Up1;
                c1626Up1.d(1.0f);
                this.f = new C0390Et0(C1198Pd.d(c1626Up1));
                c6329om.a(c1392Rp1);
                break;
            default:
                this.c = false;
                this.b = c6329om;
                this.d = new VY(c0527Gn);
                this.e = executorC5715lY0;
                break;
        }
    }

    public C2226aw(Context context, C8418zj1 c8418zj1) {
        this.a = 0;
        this.b = context.getApplicationContext();
        this.d = c8418zj1;
        this.g = M71.a;
    }

    public C2226aw(C2511cQ c2511cQ, HashMap map, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = 3;
        C1503Ta1 c1503Ta1 = EnumC1659Va1.b;
        this.b = new ThreadLocal();
        this.d = new ConcurrentHashMap();
        C5983my c5983my = new C5983my(map, arrayList4);
        this.e = c5983my;
        this.c = true;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(AbstractC0187Cd1.z);
        arrayList5.add(new C0477Fw0(1, c1503Ta1));
        arrayList5.add(c2511cQ);
        arrayList5.addAll(arrayList3);
        arrayList5.add(AbstractC0187Cd1.p);
        arrayList5.add(AbstractC0187Cd1.g);
        arrayList5.add(AbstractC0187Cd1.d);
        arrayList5.add(AbstractC0187Cd1.e);
        arrayList5.add(AbstractC0187Cd1.f);
        C0633Hw0 c0633Hw0 = AbstractC0187Cd1.k;
        arrayList5.add(new C2131aQ0(Long.TYPE, Long.class, c0633Hw0));
        arrayList5.add(new C2131aQ0(Double.TYPE, Double.class, new C0633Hw0(1)));
        arrayList5.add(new C2131aQ0(Float.TYPE, Float.class, new C0633Hw0(2)));
        arrayList5.add(C0633Hw0.b);
        arrayList5.add(AbstractC0187Cd1.h);
        arrayList5.add(AbstractC0187Cd1.i);
        arrayList5.add(new C8020xd1(AtomicLong.class, new D31(new D31(c0633Hw0, 1), 3), 0));
        arrayList5.add(new C8020xd1(AtomicLongArray.class, new D31(new D31(c0633Hw0, 2), 3), 0));
        arrayList5.add(AbstractC0187Cd1.j);
        arrayList5.add(AbstractC0187Cd1.l);
        arrayList5.add(AbstractC0187Cd1.q);
        arrayList5.add(AbstractC0187Cd1.r);
        arrayList5.add(new C8020xd1(BigDecimal.class, AbstractC0187Cd1.m, 0));
        arrayList5.add(new C8020xd1(BigInteger.class, AbstractC0187Cd1.n, 0));
        arrayList5.add(new C8020xd1(C6315oh0.class, AbstractC0187Cd1.o, 0));
        arrayList5.add(AbstractC0187Cd1.s);
        arrayList5.add(AbstractC0187Cd1.t);
        arrayList5.add(AbstractC0187Cd1.v);
        arrayList5.add(AbstractC0187Cd1.w);
        arrayList5.add(AbstractC0187Cd1.y);
        arrayList5.add(AbstractC0187Cd1.u);
        arrayList5.add(AbstractC0187Cd1.b);
        arrayList5.add(B31.e);
        arrayList5.add(AbstractC0187Cd1.x);
        if (F31.a) {
            arrayList5.add(F31.c);
            arrayList5.add(F31.b);
            arrayList5.add(F31.d);
        }
        arrayList5.add(F8.d);
        arrayList5.add(AbstractC0187Cd1.a);
        arrayList5.add(new C7689vu(c5983my, 0));
        arrayList5.add(new C7689vu(c5983my, 2));
        C7689vu c7689vu = new C7689vu(c5983my, 1);
        this.f = c7689vu;
        arrayList5.add(c7689vu);
        arrayList5.add(AbstractC0187Cd1.A);
        arrayList5.add(new C2131aQ0(c5983my, c2511cQ, c7689vu, arrayList4));
        this.g = Collections.unmodifiableList(arrayList5);
    }

    public C2226aw(Context context) {
        this.a = 1;
        this.b = context;
        this.d = Y9.c;
        this.f = C0396Ev0.c;
    }
}

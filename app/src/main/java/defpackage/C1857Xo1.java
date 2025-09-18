package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.lifecycle.a;
import androidx.work.impl.WorkDatabase_Impl;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.burnweb.rnsendintent.RNSendIntentModule;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import javax.inject.Provider;

/* renamed from: Xo1 */
/* loaded from: classes.dex */
public final class C1857Xo1 implements InterfaceC6515pk0, Provider, InterfaceC8176yS0, InterfaceC5458kC0, InterfaceC0443Fl, InterfaceC4094h70, InterfaceC5521kX0, InterfaceC0131Bl, InterfaceC4347iS, U51, U81 {
    public static final C4293iA e = new C4293iA(0);
    public static final C0350Eg f = new C0350Eg(3);
    public static final C3829fk0 g = new C3829fk0(0, -9223372036854775807L, false);
    public static final C3829fk0 h = new C3829fk0(2, -9223372036854775807L, false);
    public static final C3829fk0 i = new C3829fk0(3, -9223372036854775807L, false);
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ C1857Xo1(Object obj, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static C1857Xo1 J(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new C1857Xo1(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public static byte[] z(InterfaceC6770r40 interfaceC6770r40, String str, byte[] bArr, Map map) throws C4035gp0 {
        Map map2;
        List list;
        M41 m41 = new M41(interfaceC6770r40.s0());
        Collections.emptyMap();
        Uri uri = Uri.parse(str);
        YN1.i(uri, "The uri must be set.");
        C3538eD c3538eD = new C3538eD(uri, 0L, 2, bArr, map, 0L, -1L, null, 1);
        int i2 = 0;
        C3538eD c3538eDA = c3538eD;
        while (true) {
            try {
                C2282bD c2282bD = new C2282bD(m41, c3538eDA);
                try {
                    try {
                        return AbstractC0050Ak.b(c2282bD);
                    } finally {
                        AbstractC0277Dh1.h(c2282bD);
                    }
                } catch (C7343u40 e2) {
                    int i3 = e2.d;
                    String str2 = null;
                    if ((i3 == 307 || i3 == 308) && i2 < 5 && (map2 = e2.e) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                        str2 = (String) list.get(0);
                    }
                    if (str2 == null) {
                        throw e2;
                    }
                    i2++;
                    C3348dD c3348dDA = c3538eDA.a();
                    c3348dDA.a = Uri.parse(str2);
                    c3538eDA = c3348dDA.a();
                }
            } catch (Exception e3) {
                Uri uri2 = m41.c;
                uri2.getClass();
                throw new C4035gp0(c3538eD, uri2, m41.a.l(), m41.b, e3);
            }
        }
    }

    public byte[] A(GQ gq) {
        return z((InterfaceC6770r40) this.b, gq.b + "&signedRequest=" + AbstractC0277Dh1.o(gq.a), null, Collections.emptyMap());
    }

    public ColorStateList B(int i2) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListB = AbstractC3556eJ.b((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListB;
    }

    public Drawable C(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : AbstractC8352zN1.b((Context) this.b, resourceId);
    }

    public Drawable D(int i2) {
        int resourceId;
        Drawable drawableG;
        if (!((TypedArray) this.c).hasValue(i2) || (resourceId = ((TypedArray) this.c).getResourceId(i2, 0)) == 0) {
            return null;
        }
        J6 j6A = J6.a();
        Context context = (Context) this.b;
        synchronized (j6A) {
            drawableG = j6A.a.g(context, resourceId, true);
        }
        return drawableG;
    }

    public Typeface E(int i2, int i3, C4284i7 c4284i7) {
        int resourceId = ((TypedArray) this.c).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.d) == null) {
            this.d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.d;
        ThreadLocal threadLocal = ES0.a;
        Context context = (Context) this.b;
        if (context.isRestricted()) {
            return null;
        }
        return ES0.c(context, resourceId, typedValue, i3, c4284i7, true, false);
    }

    public ArrayList F(String str) {
        C6655qT0 c6655qT0A = C6655qT0.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            c6655qT0A.V(1);
        } else {
            c6655qT0A.d(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.b;
        workDatabase_Impl.b();
        Cursor cursorC = RY1.c(workDatabase_Impl, c6655qT0A, false);
        try {
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                arrayList.add(cursorC.isNull(0) ? null : cursorC.getString(0));
            }
            return arrayList;
        } finally {
            cursorC.close();
            c6655qT0A.release();
        }
    }

    public boolean G() {
        return ((IOException) this.d) != null;
    }

    public void H(String str, Set set) {
        O90.f(str, NotificationConstants.ID);
        O90.f(set, "tags");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C1779Wo1 c1779Wo1 = new C1779Wo1((String) it.next(), str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.b;
            workDatabase_Impl.b();
            workDatabase_Impl.c();
            try {
                ((UH) this.c).h(c1779Wo1);
                workDatabase_Impl.n();
            } finally {
                workDatabase_Impl.j();
            }
        }
    }

    public boolean I() {
        return ((HandlerC5560kk0) this.c) != null;
    }

    public void K(EnumC0123Bi0 enumC0123Bi0) {
        RunnableC0056Am runnableC0056Am = (RunnableC0056Am) this.d;
        if (runnableC0056Am != null) {
            runnableC0056Am.run();
        }
        RunnableC0056Am runnableC0056Am2 = new RunnableC0056Am((a) this.b, enumC0123Bi0);
        this.d = runnableC0056Am2;
        ((Handler) this.c).postAtFrontOfQueue(runnableC0056Am2);
    }

    public synchronized void L(C4397ij c4397ij) {
        try {
            C4397ij c4397ij2 = c4397ij.a;
            C4397ij c4397ij3 = c4397ij.d;
            if (c4397ij2 != null) {
                c4397ij2.d = c4397ij3;
            }
            if (c4397ij3 != null) {
                c4397ij3.a = c4397ij2;
            }
            c4397ij.a = null;
            c4397ij.d = null;
            if (c4397ij == ((C4397ij) this.c)) {
                this.c = c4397ij3;
            }
            if (c4397ij == ((C4397ij) this.d)) {
                this.d = c4397ij2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void M() {
        ((TypedArray) this.c).recycle();
    }

    public void N() {
        ((JG) this.b).e();
        DV1.d(new N61(2, this));
    }

    public synchronized void O(int i2, Object obj) {
        try {
            C4397ij c4397ij = (C4397ij) ((SparseArray) this.b).get(i2);
            if (c4397ij == null) {
                LinkedList linkedList = new LinkedList();
                c4397ij = new C4397ij();
                c4397ij.a = null;
                c4397ij.b = i2;
                c4397ij.c = linkedList;
                c4397ij.d = null;
                ((SparseArray) this.b).put(i2, c4397ij);
            }
            c4397ij.c.addLast(obj);
            if (((C4397ij) this.c) != c4397ij) {
                L(c4397ij);
                C4397ij c4397ij2 = (C4397ij) this.c;
                if (c4397ij2 == null) {
                    this.c = c4397ij;
                    this.d = c4397ij;
                } else {
                    c4397ij.d = c4397ij2;
                    c4397ij2.a = c4397ij;
                    this.c = c4397ij;
                }
            }
        } finally {
        }
    }

    public void P(InterfaceC5942mk0 interfaceC5942mk0) {
        HandlerC5560kk0 handlerC5560kk0 = (HandlerC5560kk0) this.c;
        if (handlerC5560kk0 != null) {
            handlerC5560kk0.a(true);
        }
        ExecutorService executorService = (ExecutorService) this.b;
        if (interfaceC5942mk0 != null) {
            executorService.execute(new RunnableC6133nk0(0, interfaceC5942mk0));
        }
        executorService.shutdown();
    }

    public void Q(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.b = str;
    }

    public void R(String str, String str2) {
        str.getClass();
        str2.getClass();
        synchronized (((HashMap) this.d)) {
            ((HashMap) this.d).put(str, str2);
        }
    }

    public long S(InterfaceC5751lk0 interfaceC5751lk0, InterfaceC5369jk0 interfaceC5369jk0, int i2) {
        Looper looperMyLooper = Looper.myLooper();
        YN1.h(looperMyLooper);
        this.d = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HandlerC5560kk0 handlerC5560kk0 = new HandlerC5560kk0(this, looperMyLooper, interfaceC5751lk0, interfaceC5369jk0, i2, jElapsedRealtime);
        YN1.f(((HandlerC5560kk0) this.c) == null);
        this.c = handlerC5560kk0;
        handlerC5560kk0.e = null;
        ((ExecutorService) this.b).execute(handlerC5560kk0);
        return jElapsedRealtime;
    }

    public C1723Vw T(C0967Me c0967Me) {
        R61 r61;
        DV1.a();
        this.d = new C1723Vw();
        Iterator it = c0967Me.b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            r61 = c0967Me.a;
            if (!zHasNext) {
                break;
            }
            C2553ce c2553ce = (C2553ce) it.next();
            C1723Vw c1723Vw = (C1723Vw) this.d;
            Rect rect = c2553ce.d;
            Matrix matrix = new Matrix(r61.b);
            RectF rectF = new RectF(rect);
            RectF rectF2 = AbstractC7255tc1.a;
            float f2 = 0;
            Size size = c2553ce.e;
            RectF rectF3 = new RectF(f2, f2, size.getWidth(), size.getHeight());
            int i2 = c2553ce.f;
            boolean z = c2553ce.g;
            matrix.postConcat(AbstractC7255tc1.a(rectF, rectF3, i2, z));
            AbstractC3377dM1.e(AbstractC7255tc1.d(AbstractC7255tc1.g(AbstractC7255tc1.e(rect), i2), false, size));
            Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            C7375uF c7375uFA = r61.g.a();
            c7375uFA.a = size;
            c1723Vw.put(c2553ce, new R61(c2553ce.b, c2553ce.c, c7375uFA.l(), matrix, false, rect2, r61.i - i2, -1, r61.e != z));
        }
        Z61 z61D = r61.d((InterfaceC7480uo) this.c, true);
        JG jg = (JG) this.b;
        if (jg.e.get()) {
            z61D.d();
        } else {
            jg.b(new RunnableC3529eA(jg, 12, z61D), new IG(z61D, 0));
        }
        for (Map.Entry entry : ((C1723Vw) this.d).entrySet()) {
            u(r61, entry);
            ((R61) entry.getValue()).a(new RunnableC1313Qp0(this, r61, entry, 10));
        }
        r61.o.add(new WN0(1, (C1723Vw) this.d));
        return (C1723Vw) this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.AbstractC1521Tg1 U(defpackage.C2128aP0 r8, defpackage.C8203yb0 r9, boolean r10) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "arrayType"
            defpackage.O90.f(r8, r2)
            tP0 r2 = r8.b
            boolean r3 = r2 instanceof defpackage.C6833rP0
            r4 = 0
            if (r3 == 0) goto L12
            r3 = r2
            rP0 r3 = (defpackage.C6833rP0) r3
            goto L13
        L12:
            r3 = r4
        L13:
            if (r3 == 0) goto L2d
            java.lang.Class r5 = java.lang.Void.TYPE
            java.lang.Class r3 = r3.a
            boolean r5 = defpackage.O90.a(r3, r5)
            if (r5 == 0) goto L20
            goto L2d
        L20:
            java.lang.String r3 = r3.getName()
            sd0 r3 = defpackage.EnumC7066sd0.b(r3)
            sD0 r3 = r3.d()
            goto L2e
        L2d:
            r3 = r4
        L2e:
            xh0 r5 = new xh0
            java.lang.Object r6 = r7.b
            nH r6 = (defpackage.C6045nH) r6
            r5.<init>(r6, r8, r1)
            java.lang.Object r8 = r6.b
            ib0 r8 = (defpackage.C4375ib0) r8
            boolean r9 = r9.d
            if (r3 == 0) goto L70
            java.lang.Object r8 = r8.o
            Cs0 r8 = (defpackage.C0231Cs0) r8
            zg0 r8 = r8.e
            X01 r8 = r8.q(r3)
            K5 r10 = new K5
            I5 r2 = r8.getAnnotations()
            r3 = 2
            I5[] r3 = new defpackage.I5[r3]
            r3[r0] = r2
            r3[r1] = r5
            r10.<init>(r3)
            Ig0 r8 = defpackage.CZ1.k(r8, r10)
            java.lang.String r10 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"
            defpackage.O90.d(r8, r10)
            X01 r8 = (defpackage.X01) r8
            if (r9 == 0) goto L67
            goto L6f
        L67:
            X01 r9 = r8.P(r1)
            Tg1 r8 = defpackage.NV1.t(r8, r9)
        L6f:
            return r8
        L70:
            ze1 r3 = defpackage.EnumC8403ze1.b
            r6 = 6
            yb0 r0 = defpackage.K22.a(r3, r9, r0, r4, r6)
            Ig0 r0 = r7.V(r2, r0)
            if (r9 == 0) goto L8f
            if (r10 == 0) goto L82
            gi1 r9 = defpackage.EnumC4015gi1.e
            goto L84
        L82:
            gi1 r9 = defpackage.EnumC4015gi1.c
        L84:
            java.lang.Object r8 = r8.o
            Cs0 r8 = (defpackage.C0231Cs0) r8
            zg0 r8 = r8.e
            X01 r8 = r8.h(r9, r0, r5)
            return r8
        L8f:
            java.lang.Object r9 = r8.o
            Cs0 r9 = (defpackage.C0231Cs0) r9
            zg0 r9 = r9.e
            gi1 r10 = defpackage.EnumC4015gi1.c
            X01 r9 = r9.h(r10, r0, r5)
            java.lang.Object r8 = r8.o
            Cs0 r8 = (defpackage.C0231Cs0) r8
            zg0 r8 = r8.e
            gi1 r10 = defpackage.EnumC4015gi1.e
            X01 r8 = r8.h(r10, r0, r5)
            X01 r8 = r8.P(r1)
            Tg1 r8 = defpackage.NV1.t(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1857Xo1.U(aP0, yb0, boolean):Tg1");
    }

    public AbstractC0663Ig0 V(InterfaceC7823wb0 interfaceC7823wb0, C8203yb0 c8203yb0) {
        boolean z = interfaceC7823wb0 instanceof C6833rP0;
        C6045nH c6045nH = (C6045nH) this.b;
        if (z) {
            Class cls = Void.TYPE;
            Class cls2 = ((C6833rP0) interfaceC7823wb0).a;
            EnumC6988sD0 enumC6988sD0D = O90.a(cls2, cls) ? null : EnumC7066sd0.b(cls2.getName()).d();
            return enumC6988sD0D != null ? ((C0231Cs0) ((C4375ib0) c6045nH.b).o).e.s(enumC6988sD0D) : ((C0231Cs0) ((C4375ib0) c6045nH.b).o).e.w();
        }
        boolean z2 = false;
        if (!(interfaceC7823wb0 instanceof C4339iP0)) {
            if (interfaceC7823wb0 instanceof C2128aP0) {
                return U((C2128aP0) interfaceC7823wb0, c8203yb0, false);
            }
            if (interfaceC7823wb0 instanceof C7787wP0) {
                AbstractC7215tP0 abstractC7215tP0C = ((C7787wP0) interfaceC7823wb0).c();
                return abstractC7215tP0C != null ? V(abstractC7215tP0C, c8203yb0) : ((C0231Cs0) ((C4375ib0) c6045nH.b).o).e.m();
            }
            if (interfaceC7823wb0 == null) {
                return ((C0231Cs0) ((C4375ib0) c6045nH.b).o).e.m();
            }
            throw new UnsupportedOperationException("Unsupported type: " + interfaceC7823wb0);
        }
        C4339iP0 c4339iP0 = (C4339iP0) interfaceC7823wb0;
        if (!c8203yb0.d) {
            if (c8203yb0.a != EnumC8403ze1.a) {
                z2 = true;
            }
        }
        boolean zD = c4339iP0.d();
        Type type = c4339iP0.a;
        if (!zD && !z2) {
            X01 x01R = r(c4339iP0, c8203yb0, null);
            return x01R != null ? x01R : C5496kP.c(EnumC5305jP.c, type.toString());
        }
        X01 x01R2 = r(c4339iP0, C8203yb0.a(c8203yb0, EnumC0102Bb0.c, false, null, null, 61), null);
        if (x01R2 == null) {
            return C5496kP.c(EnumC5305jP.c, type.toString());
        }
        X01 x01R3 = r(c4339iP0, C8203yb0.a(c8203yb0, EnumC0102Bb0.b, false, null, null, 61), x01R2);
        if (x01R3 == null) {
            return C5496kP.c(EnumC5305jP.c, type.toString());
        }
        return zD ? new C6434pJ0(x01R2, x01R3) : NV1.t(x01R2, x01R3);
    }

    public void W(C0515Gj c0515Gj) throws IOException {
        File file = (File) this.c;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                C1810Wz c1810Wz = new C1810Wz(fileOutputStream);
                c1810Wz.a = 0L;
                C0593Hj c0593Hj = (C0593Hj) c0515Gj.c;
                O90.f(c0593Hj, "this$0");
                EncodedImage encodedImage = (EncodedImage) c0515Gj.b;
                O90.c(encodedImage);
                InputStream inputStream = encodedImage.getInputStream();
                if (inputStream == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ((C1204Pf) c0593Hj.d).f(inputStream, c1810Wz);
                c1810Wz.flush();
                long j = c1810Wz.a;
                fileOutputStream.close();
                if (file.length() == j) {
                    return;
                }
                long length = file.length();
                StringBuilder sbP = AbstractC8235ym.p("File was not written completely. Expected: ", j, ", found: ");
                sbP.append(length);
                throw new C6353ou(sbP.toString());
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e2) {
            C0084Av0 c0084Av0 = ((C4117hF) this.d).d;
            int i2 = C4117hF.g;
            c0084Av0.getClass();
            throw e2;
        }
    }

    @Override // defpackage.InterfaceC0131Bl
    public void Z(InterfaceC7089sl interfaceC7089sl, HS0 hs0) {
        File file = (File) this.c;
        boolean zN = hs0.n();
        Promise promise = (Promise) this.b;
        if (!zN) {
            promise.resolve(Boolean.FALSE);
            return;
        }
        try {
            IS0 is0 = hs0.g;
            try {
                InterfaceC0827Kj interfaceC0827KjW = is0.w();
                Logger logger = AbstractC7889wx0.a;
                C8161yN0 c8161yN0A = JI1.a(JI1.f(file));
                c8161yN0A.i(interfaceC0827KjW);
                c8161yN0A.flush();
                c8161yN0A.close();
                interfaceC0827KjW.close();
                Uri uriFromFile = Uri.fromFile(file);
                int i2 = Build.VERSION.SDK_INT;
                RNSendIntentModule rNSendIntentModule = (RNSendIntentModule) this.d;
                if (i2 > 23) {
                    uriFromFile = FT.d(rNSendIntentModule.reactContext, rNSendIntentModule.reactContext.getPackageName() + ".fileprovider", file);
                }
                Intent dataAndType = new Intent("android.intent.action.VIEW").setDataAndType(uriFromFile, "application/vnd.android.package-archive");
                dataAndType.setFlags(268435457);
                rNSendIntentModule.reactContext.startActivity(dataAndType);
                promise.resolve(Boolean.TRUE);
                is0.close();
            } finally {
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            promise.resolve(Boolean.FALSE);
        }
    }

    @Override // defpackage.InterfaceC6515pk0
    public void a() throws IOException {
        IOException iOException;
        IOException iOException2 = (IOException) this.d;
        if (iOException2 != null) {
            throw iOException2;
        }
        HandlerC5560kk0 handlerC5560kk0 = (HandlerC5560kk0) this.c;
        if (handlerC5560kk0 != null && (iOException = handlerC5560kk0.e) != null && handlerC5560kk0.f > handlerC5560kk0.a) {
            throw iOException;
        }
    }

    @Override // defpackage.InterfaceC5521kX0
    public void b(C4103hA0 c4103hA0) {
        long jD;
        YN1.h((C0724Ja1) this.c);
        int i2 = AbstractC0277Dh1.a;
        C0724Ja1 c0724Ja1 = (C0724Ja1) this.c;
        synchronized (c0724Ja1) {
            try {
                long j = c0724Ja1.c;
                jD = j != -9223372036854775807L ? j + c0724Ja1.b : c0724Ja1.d();
            } finally {
            }
        }
        long jE = ((C0724Ja1) this.c).e();
        if (jD == -9223372036854775807L || jE == -9223372036854775807L) {
            return;
        }
        C6666qX c6666qX = (C6666qX) this.b;
        if (jE != c6666qX.r) {
            C6475pX c6475pXA = c6666qX.a();
            c6475pXA.q = jE;
            C6666qX c6666qX2 = new C6666qX(c6475pXA);
            this.b = c6666qX2;
            ((InterfaceC1584Ub1) this.d).f(c6666qX2);
        }
        int iA = c4103hA0.a();
        ((InterfaceC1584Ub1) this.d).d(iA, c4103hA0);
        ((InterfaceC1584Ub1) this.d).a(jD, 1, iA, 0, null);
    }

    @Override // defpackage.U51
    public int c(long j) {
        long[] jArr = (long[]) this.d;
        int iB = AbstractC0277Dh1.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // defpackage.InterfaceC5458kC0
    public boolean d(Object obj) {
        if (obj instanceof InterfaceC5505kS) {
            ((InterfaceC5505kS) obj).b().a = true;
        }
        ((InterfaceC5696lS) this.c).f(obj);
        return ((C5649lC0) this.d).d(obj);
    }

    @Override // defpackage.InterfaceC5521kX0
    public void e(C0724Ja1 c0724Ja1, YR yr, YM0 ym0) {
        this.c = c0724Ja1;
        ym0.a();
        ym0.b();
        InterfaceC1584Ub1 interfaceC1584Ub1W = yr.w(ym0.e, 5);
        this.d = interfaceC1584Ub1W;
        interfaceC1584Ub1W.f((C6666qX) this.b);
    }

    @Override // defpackage.U51
    public long f(int i2) {
        YN1.c(i2 >= 0);
        long[] jArr = (long[]) this.d;
        YN1.c(i2 < jArr.length);
        return jArr[i2];
    }

    @Override // defpackage.InterfaceC4094h70
    public int g() {
        C6258oO0 c6258oO0 = (C6258oO0) ((G10) this.b).b;
        c6258oO0.reset();
        return AbstractC3316d22.a((ArrayList) this.d, c6258oO0, (C8426zm0) this.c);
    }

    @Override // javax.inject.Provider
    public Object get() {
        switch (this.a) {
            case 5:
                return ((AbstractC8407zg) this.d).getModule((String) this.b, (ReactApplicationContext) this.c);
            default:
                return new C1349Rb0((Context) ((C0552Gv0) this.b).a, (PP) ((Provider) this.c).get(), (C7831we) ((C7532v32) this.d).get());
        }
    }

    @Override // defpackage.U51
    public List h(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (true) {
            List list = (List) this.b;
            if (i2 >= list.size()) {
                break;
            }
            int i3 = i2 * 2;
            long[] jArr = (long[]) this.c;
            if (jArr[i3] <= j && j < jArr[i3 + 1]) {
                C4411in1 c4411in1 = (C4411in1) list.get(i2);
                C7363uB c7363uB = c4411in1.a;
                if (c7363uB.e == -3.4028235E38f) {
                    arrayList2.add(c4411in1);
                } else {
                    arrayList.add(c7363uB);
                }
            }
            i2++;
        }
        Collections.sort(arrayList2, new C0350Eg(25));
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            C7172tB c7172tBA = ((C4411in1) arrayList2.get(i4)).a.a();
            c7172tBA.e = (-1) - i4;
            c7172tBA.f = 1;
            arrayList.add(c7172tBA.a());
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(C0365El c0365El) {
        c0365El.a(new GR0(25, this), QR1.a());
        ((B20) this.d).a.set(c0365El);
        return "HandlerScheduledFuture-" + ((Callable) this.c).toString();
    }

    @Override // defpackage.InterfaceC5458kC0
    public Object i() {
        Object objI = ((C5649lC0) this.d).i();
        if (objI == null) {
            objI = ((InterfaceC5314jS) this.b).create();
            if (Log.isLoggable("FactoryPools", 2)) {
                objI.getClass().toString();
            }
        }
        if (objI instanceof InterfaceC5505kS) {
            ((InterfaceC5505kS) objI).b().a = false;
        }
        return objI;
    }

    @Override // defpackage.U51
    public int j() {
        return ((long[]) this.d).length;
    }

    public void k(String str, boolean z) {
        l(String.valueOf(z), str);
    }

    public void l(Object obj, String str) {
        C5772lr0 c5772lr0 = new C5772lr0(19);
        ((C5772lr0) this.d).d = c5772lr0;
        this.d = c5772lr0;
        c5772lr0.c = obj;
        c5772lr0.b = str;
    }

    public C1513Te m() {
        String strConcat = ((String) this.b) == null ? " backendName" : "";
        if (((EnumC7370uD0) this.d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new C1513Te((String) this.b, (byte[]) this.c, (EnumC7370uD0) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    @Override // defpackage.InterfaceC4094h70
    public Bitmap n(BitmapFactory.Options options) {
        C6258oO0 c6258oO0 = (C6258oO0) ((G10) this.b).b;
        c6258oO0.reset();
        return BitmapFactory.decodeStream(c6258oO0, null, options);
    }

    public String o(String str, long j, int i2, long j2) {
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.c;
            int size = arrayList.size();
            ArrayList arrayList2 = (ArrayList) this.b;
            if (i3 >= size) {
                sb.append((String) arrayList2.get(arrayList.size()));
                return sb.toString();
            }
            sb.append((String) arrayList2.get(i3));
            if (((Integer) arrayList.get(i3)).intValue() == 1) {
                sb.append(str);
            } else {
                int iIntValue = ((Integer) arrayList.get(i3)).intValue();
                ArrayList arrayList3 = (ArrayList) this.d;
                if (iIntValue == 2) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i3), Long.valueOf(j)));
                } else if (((Integer) arrayList.get(i3)).intValue() == 3) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i3), Integer.valueOf(i2)));
                } else if (((Integer) arrayList.get(i3)).intValue() == 4) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i3), Long.valueOf(j2)));
                }
            }
            i3++;
        }
    }

    public void p() {
        HandlerC5560kk0 handlerC5560kk0 = (HandlerC5560kk0) this.c;
        YN1.h(handlerC5560kk0);
        handlerC5560kk0.a(false);
    }

    public C5699lT q() throws C4353iU {
        C4117hF c4117hF = (C4117hF) this.d;
        c4117hF.e.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        File fileB = c4117hF.b((String) this.b);
        try {
            AbstractC2055a12.c((File) this.c, fileB);
            if (fileB.exists()) {
                fileB.setLastModified(jCurrentTimeMillis);
            }
            return new C5699lT(fileB);
        } catch (C4353iU e2) {
            Throwable cause = e2.getCause();
            if (cause != null && !(cause instanceof C4162hU)) {
                boolean z = cause instanceof FileNotFoundException;
            }
            int i2 = C4117hF.g;
            c4117hF.d.getClass();
            throw e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:237:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x01fb  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.X01 r(defpackage.C4339iP0 r22, defpackage.C8203yb0 r23, defpackage.X01 r24) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1857Xo1.r(iP0, yb0, X01):X01");
    }

    @Override // defpackage.InterfaceC4094h70
    public void s() {
        C6258oO0 c6258oO0 = (C6258oO0) ((G10) this.b).b;
        synchronized (c6258oO0) {
            c6258oO0.c = c6258oO0.a.length;
        }
    }

    @Override // defpackage.InterfaceC8176yS0
    public InterfaceC5506kS0 t(InterfaceC5506kS0 interfaceC5506kS0, C0795Jy0 c0795Jy0) {
        Drawable drawable = (Drawable) interfaceC5506kS0.get();
        if (drawable instanceof BitmapDrawable) {
            return ((C1204Pf) this.c).t(C6126ni.b((InterfaceC5935mi) this.b, ((BitmapDrawable) drawable).getBitmap()), c0795Jy0);
        }
        if (drawable instanceof C3500e10) {
            return ((C5806m12) this.d).t(interfaceC5506kS0, c0795Jy0);
        }
        return null;
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 18:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                C3383dO1 c3383dO1 = (C3383dO1) ((C3383dO1) this.c).c;
                while (c3383dO1 != null) {
                    ES1 es1 = (ES1) c3383dO1.b;
                    sb.append(str);
                    if (es1 == null || !ES1.class.isArray()) {
                        sb.append(es1);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{es1});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    c3383dO1 = (C3383dO1) c3383dO1.c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 19:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                C5772lr0 c5772lr0 = (C5772lr0) ((C5772lr0) this.c).d;
                while (c5772lr0 != null) {
                    Object obj = c5772lr0.c;
                    sb2.append(str);
                    String str2 = (String) c5772lr0.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString2 = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString2, 1, strDeepToString2.length() - 1);
                    }
                    c5772lr0 = (C5772lr0) c5772lr0.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(R61 r61, Map.Entry entry) {
        R61 r612 = (R61) entry.getValue();
        C0812Ke c0812Ke = new C0812Ke(r61.g.a, ((C2553ce) entry.getKey()).d, r61.c ? (InterfaceC7480uo) this.c : null, ((C2553ce) entry.getKey()).f, ((C2553ce) entry.getKey()).g);
        int i2 = ((C2553ce) entry.getKey()).c;
        r612.getClass();
        DV1.a();
        r612.b();
        AbstractC3377dM1.i(!r612.j, "Consumer can only be linked once.");
        r612.j = true;
        Q61 q61 = r612.l;
        AbstractC1500Sz1.a(AbstractC1500Sz1.r(q61.c(), new P61(r612, q61, i2, c0812Ke, null), QR1.h()), new C3383dO1(this, 26, r612), QR1.h());
    }

    public void v(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.c;
        HashMap map2 = (HashMap) this.b;
        C2482cG0 c2482cG0 = new C2482cG0(byteArrayOutputStream, map2, map, (C5536kc0) this.d);
        if (obj == null) {
            return;
        }
        InterfaceC1802Ww0 interfaceC1802Ww0 = (InterfaceC1802Ww0) map2.get(obj.getClass());
        if (interfaceC1802Ww0 != null) {
            interfaceC1802Ww0.a(obj, c2482cG0);
        } else {
            throw new C8163yO("No encoder for " + obj.getClass());
        }
    }

    public byte[] w(UUID uuid, EQ eq) throws C4035gp0 {
        String str = eq.b;
        if (TextUtils.isEmpty(str)) {
            str = (String) this.c;
        }
        if (TextUtils.isEmpty(str)) {
            Map mapEmptyMap = Collections.emptyMap();
            Uri uri = Uri.EMPTY;
            YN1.i(uri, "The uri must be set.");
            throw new C4035gp0(new C3538eD(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 0), uri, C5500kQ0.g, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = AbstractC1063Nk.e;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : AbstractC1063Nk.c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.d)) {
            map.putAll((HashMap) this.d);
        }
        return z((InterfaceC6770r40) this.b, str, eq.a, map);
    }

    @Override // defpackage.InterfaceC0131Bl
    public void w0(InterfaceC7089sl interfaceC7089sl, IOException iOException) {
        iOException.printStackTrace();
        ((Promise) this.b).resolve(Boolean.FALSE);
    }

    public void x(Runnable runnable) {
        ((ExecutorC7157t6) this.b).execute(runnable);
    }

    @Override // defpackage.InterfaceC4094h70
    public ImageHeaderParser$ImageType y() {
        C6258oO0 c6258oO0 = (C6258oO0) ((G10) this.b).b;
        c6258oO0.reset();
        return AbstractC3316d22.b((ArrayList) this.d, c6258oO0, (C8426zm0) this.c);
    }

    public /* synthetic */ C1857Xo1(Object obj, Object obj2, Object obj3, int i2, boolean z) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public C1857Xo1(int i2) {
        this.a = i2;
        switch (i2) {
            case 6:
                this.b = new SparseArray();
                break;
        }
    }

    public C1857Xo1(AbstractActivityC4281i6 abstractActivityC4281i6) {
        this.a = 9;
        SharedPreferences sharedPreferences = abstractActivityC4281i6.getSharedPreferences("expo.modules.kotlin.PersistentDataManager", 0);
        O90.e(sharedPreferences, "getSharedPreferences(...)");
        this.b = sharedPreferences;
        this.c = new Bundle();
        this.d = LB.b(new C3881g1(10, this));
    }

    public C1857Xo1(AbstractServiceC1136Oi0 abstractServiceC1136Oi0) {
        this.a = 24;
        this.b = new a(abstractServiceC1136Oi0);
        this.c = new Handler();
    }

    public C1857Xo1(WorkDatabase_Impl workDatabase_Impl) {
        this.a = 0;
        this.b = workDatabase_Impl;
        this.c = new UH(workDatabase_Impl, 7);
        this.d = new C5581kr0(workDatabase_Impl, 18);
    }

    public C1857Xo1(ArrayList arrayList) {
        this.a = 28;
        this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C4411in1 c4411in1 = (C4411in1) arrayList.get(i2);
            int i3 = i2 * 2;
            long[] jArr = (long[]) this.c;
            jArr[i3] = c4411in1.b;
            jArr[i3 + 1] = c4411in1.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public C1857Xo1(ExecutorService executorService) {
        this.a = 29;
        this.c = new Handler(Looper.getMainLooper());
        this.d = new ExecutorC3799fa0(this);
        this.b = new ExecutorC7157t6(executorService);
    }

    public C1857Xo1(C6045nH c6045nH, InterfaceC6307oe1 interfaceC6307oe1) {
        this.a = 16;
        O90.f(c6045nH, "c");
        O90.f(interfaceC6307oe1, "typeParameterResolver");
        this.b = c6045nH;
        this.c = interfaceC6307oe1;
        this.d = new ES1(new NV1(19));
    }

    public C1857Xo1(HT ht) {
        this.a = 1;
        this.c = null;
        this.d = null;
        this.b = ht;
    }

    public C1857Xo1(Context context, TypedArray typedArray) {
        this.a = 26;
        this.b = context;
        this.c = typedArray;
    }

    public C1857Xo1(String str, InterfaceC6770r40 interfaceC6770r40) {
        this.a = 14;
        this.b = interfaceC6770r40;
        this.c = str;
        this.d = new HashMap();
    }

    public C1857Xo1(C0976Mh c0976Mh) {
        this.a = 3;
        this.d = c0976Mh;
    }

    public C1857Xo1(InterfaceC7480uo interfaceC7480uo, JG jg) {
        this.a = 25;
        this.c = interfaceC7480uo;
        this.b = jg;
    }

    public C1857Xo1(I0 i0, ArrayList arrayList, C8426zm0 c8426zm0) {
        this.a = 15;
        IL1.d(c8426zm0, "Argument must not be null");
        this.c = c8426zm0;
        IL1.d(arrayList, "Argument must not be null");
        this.d = arrayList;
        this.b = new G10(i0, c8426zm0);
    }

    public C1857Xo1(String str, int i2) {
        this.a = i2;
        switch (i2) {
            case 18:
                C3383dO1 c3383dO1 = new C3383dO1(18, false);
                this.c = c3383dO1;
                this.d = c3383dO1;
                this.b = str;
                break;
            case 19:
                C5772lr0 c5772lr0 = new C5772lr0(19);
                this.c = c5772lr0;
                this.d = c5772lr0;
                this.b = str;
                break;
            case 20:
                C6475pX c6475pX = new C6475pX();
                c6475pX.l = AbstractC1865Xr0.n(str);
                this.b = new C6666qX(c6475pX);
                break;
            default:
                String strConcat = "ExoPlayer:Loader:".concat(str);
                int i3 = AbstractC0277Dh1.a;
                this.b = Executors.newSingleThreadExecutor(new ThreadFactoryC8032xh1(strConcat));
                break;
        }
    }

    public C1857Xo1(C0999Mo1 c0999Mo1) {
        this.a = 7;
        this.d = c0999Mo1;
        this.c = new AtomicBoolean(false);
        this.b = ((C0212Cm) c0999Mo1.b).d.schedule(new RunnableC8045xm(this, 0), 2000L, TimeUnit.MILLISECONDS);
    }
}

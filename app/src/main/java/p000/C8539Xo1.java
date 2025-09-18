package p000;

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
import androidx.lifecycle.C1742a;
import androidx.work.impl.WorkDatabase_Impl;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.burnweb.rnsendintent.RNSendIntentModule;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
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
public final class C8539Xo1 implements InterfaceC10687pk0, Provider, InterfaceC11800yS0, InterfaceC9979kC0, InterfaceC0363Fl, InterfaceC9585h70, InterfaceC10021kX0, InterfaceC0111Bl, InterfaceC4243iS, U51, U81 {

    /* renamed from: e */
    public static final C4225iA f13975e = new C4225iA(0);

    /* renamed from: f */
    public static final C0295Eg f13976f = new C0295Eg(3);

    /* renamed from: g */
    public static final C9407fk0 f13977g = new C9407fk0(0, -9223372036854775807L, false);

    /* renamed from: h */
    public static final C9407fk0 f13978h = new C9407fk0(2, -9223372036854775807L, false);

    /* renamed from: i */
    public static final C9407fk0 f13979i = new C9407fk0(3, -9223372036854775807L, false);

    /* renamed from: a */
    public final /* synthetic */ int f13980a;

    /* renamed from: b */
    public Object f13981b;

    /* renamed from: c */
    public Object f13982c;

    /* renamed from: d */
    public Object f13983d;

    public /* synthetic */ C8539Xo1(Object obj, Object obj2, Object obj3, int i) {
        this.f13980a = i;
        this.f13983d = obj;
        this.f13981b = obj2;
        this.f13982c = obj3;
    }

    /* renamed from: J */
    public static C8539Xo1 m9117J(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C8539Xo1(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* renamed from: z */
    public static byte[] m9118z(InterfaceC10859r40 interfaceC10859r40, String str, byte[] bArr, Map map) throws C9545gp0 {
        Map map2;
        List list;
        M41 m41 = new M41(interfaceC10859r40.mo506s0());
        Collections.emptyMap();
        Uri uri = Uri.parse(str);
        YN1.m9284i(uri, "The uri must be set.");
        C3976eD c3976eD = new C3976eD(uri, 0L, 2, bArr, map, 0L, -1L, null, 1);
        int i = 0;
        C3976eD c3976eDM17503a = c3976eD;
        while (true) {
            try {
                C1771bD c1771bD = new C1771bD(m41, c3976eDM17503a);
                try {
                    try {
                        return AbstractC0047Ak.m311b(c1771bD);
                    } finally {
                        AbstractC7485Dh1.m1823h(c1771bD);
                    }
                } catch (C11243u40 e) {
                    int i2 = e.f43483d;
                    String str2 = null;
                    if ((i2 == 307 || i2 == 308) && i < 5 && (map2 = e.f43484e) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                        str2 = (String) list.get(0);
                    }
                    if (str2 == null) {
                        throw e;
                    }
                    i++;
                    C3914dD c3914dDM17879a = c3976eDM17503a.m17879a();
                    c3914dDM17879a.f25870a = Uri.parse(str2);
                    c3976eDM17503a = c3914dDM17879a.m17503a();
                }
            } catch (Exception e2) {
                Uri uri2 = m41.f6987c;
                uri2.getClass();
                throw new C9545gp0(c3976eD, uri2, m41.f6985a.mo3793l(), m41.f6986b, e2);
            }
        }
    }

    /* renamed from: A */
    public byte[] m9119A(C0405GQ c0405gq) {
        return m9118z((InterfaceC10859r40) this.f13981b, c0405gq.f3733b + "&signedRequest=" + AbstractC7485Dh1.m1830o(c0405gq.f3732a), null, Collections.emptyMap());
    }

    /* renamed from: B */
    public ColorStateList m9120B(int i) {
        int resourceId;
        ColorStateList colorStateListM17900b;
        TypedArray typedArray = (TypedArray) this.f13982c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM17900b = AbstractC3982eJ.m17900b((Context) this.f13981b, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM17900b;
    }

    /* renamed from: C */
    public Drawable m9121C(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f13982c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC11918zN1.m26394b((Context) this.f13981b, resourceId);
    }

    /* renamed from: D */
    public Drawable m9122D(int i) {
        int resourceId;
        Drawable drawableM25626g;
        if (!((TypedArray) this.f13982c).hasValue(i) || (resourceId = ((TypedArray) this.f13982c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0574J6 c0574j6M4154a = C0574J6.m4154a();
        Context context = (Context) this.f13981b;
        synchronized (c0574j6M4154a) {
            drawableM25626g = c0574j6M4154a.f5338a.m25626g(context, resourceId, true);
        }
        return drawableM25626g;
    }

    /* renamed from: E */
    public Typeface m9123E(int i, int i2, C4222i7 c4222i7) {
        int resourceId = ((TypedArray) this.f13982c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f13983d) == null) {
            this.f13983d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f13983d;
        ThreadLocal threadLocal = ES0.f2702a;
        Context context = (Context) this.f13981b;
        if (context.isRestricted()) {
            return null;
        }
        return ES0.m2277c(context, resourceId, typedValue, i2, c4222i7, true, false);
    }

    /* renamed from: F */
    public ArrayList m9124F(String str) {
        C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            c10781qT0M24005a.mo2032V(1);
        } else {
            c10781qT0M24005a.mo2033d(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13981b;
        workDatabase_Impl.m23792b();
        Cursor cursorM7035c = RY1.m7035c(workDatabase_Impl, c10781qT0M24005a, false);
        try {
            ArrayList arrayList = new ArrayList(cursorM7035c.getCount());
            while (cursorM7035c.moveToNext()) {
                arrayList.add(cursorM7035c.isNull(0) ? null : cursorM7035c.getString(0));
            }
            return arrayList;
        } finally {
            cursorM7035c.close();
            c10781qT0M24005a.release();
        }
    }

    /* renamed from: G */
    public boolean m9125G() {
        return ((IOException) this.f13983d) != null;
    }

    /* renamed from: H */
    public void m9126H(String str, Set set) {
        O90.m5968f(str, NotificationConstants.f19487ID);
        O90.m5968f(set, "tags");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C8487Wo1 c8487Wo1 = new C8487Wo1((String) it.next(), str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13981b;
            workDatabase_Impl.m23792b();
            workDatabase_Impl.m23793c();
            try {
                ((C1276UH) this.f13982c).m7954h(c8487Wo1);
                workDatabase_Impl.m23799n();
            } finally {
                workDatabase_Impl.m23795j();
            }
        }
    }

    /* renamed from: I */
    public boolean m9127I() {
        return ((HandlerC10047kk0) this.f13982c) != null;
    }

    /* renamed from: K */
    public void m9128K(EnumC7382Bi0 enumC7382Bi0) {
        RunnableC0049Am runnableC0049Am = (RunnableC0049Am) this.f13983d;
        if (runnableC0049Am != null) {
            runnableC0049Am.run();
        }
        RunnableC0049Am runnableC0049Am2 = new RunnableC0049Am((C1742a) this.f13981b, enumC7382Bi0);
        this.f13983d = runnableC0049Am2;
        ((Handler) this.f13982c).postAtFrontOfQueue(runnableC0049Am2);
    }

    /* renamed from: L */
    public synchronized void m9129L(C4260ij c4260ij) {
        try {
            C4260ij c4260ij2 = c4260ij.f29418a;
            C4260ij c4260ij3 = c4260ij.f29421d;
            if (c4260ij2 != null) {
                c4260ij2.f29421d = c4260ij3;
            }
            if (c4260ij3 != null) {
                c4260ij3.f29418a = c4260ij2;
            }
            c4260ij.f29418a = null;
            c4260ij.f29421d = null;
            if (c4260ij == ((C4260ij) this.f13982c)) {
                this.f13982c = c4260ij3;
            }
            if (c4260ij == ((C4260ij) this.f13983d)) {
                this.f13983d = c4260ij2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: M */
    public void m9130M() {
        ((TypedArray) this.f13982c).recycle();
    }

    /* renamed from: N */
    public void m9131N() {
        ((C0584JG) this.f13981b).m4270e();
        DV1.m1719d(new N61(2, this));
    }

    /* renamed from: O */
    public synchronized void m9132O(int i, Object obj) {
        try {
            C4260ij c4260ij = (C4260ij) ((SparseArray) this.f13981b).get(i);
            if (c4260ij == null) {
                LinkedList linkedList = new LinkedList();
                c4260ij = new C4260ij();
                c4260ij.f29418a = null;
                c4260ij.f29419b = i;
                c4260ij.f29420c = linkedList;
                c4260ij.f29421d = null;
                ((SparseArray) this.f13981b).put(i, c4260ij);
            }
            c4260ij.f29420c.addLast(obj);
            if (((C4260ij) this.f13982c) != c4260ij) {
                m9129L(c4260ij);
                C4260ij c4260ij2 = (C4260ij) this.f13982c;
                if (c4260ij2 == null) {
                    this.f13982c = c4260ij;
                    this.f13983d = c4260ij;
                } else {
                    c4260ij.f29421d = c4260ij2;
                    c4260ij2.f29418a = c4260ij;
                    this.f13982c = c4260ij;
                }
            }
        } finally {
        }
    }

    /* renamed from: P */
    public void m9133P(InterfaceC10303mk0 interfaceC10303mk0) {
        HandlerC10047kk0 handlerC10047kk0 = (HandlerC10047kk0) this.f13982c;
        if (handlerC10047kk0 != null) {
            handlerC10047kk0.m22250a(true);
        }
        ExecutorService executorService = (ExecutorService) this.f13981b;
        if (interfaceC10303mk0 != null) {
            executorService.execute(new RunnableC10431nk0(0, interfaceC10303mk0));
        }
        executorService.shutdown();
    }

    /* renamed from: Q */
    public void m9134Q(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f13981b = str;
    }

    /* renamed from: R */
    public void m9135R(String str, String str2) {
        str.getClass();
        str2.getClass();
        synchronized (((HashMap) this.f13983d)) {
            ((HashMap) this.f13983d).put(str, str2);
        }
    }

    /* renamed from: S */
    public long m9136S(InterfaceC10175lk0 interfaceC10175lk0, InterfaceC9919jk0 interfaceC9919jk0, int i) {
        Looper looperMyLooper = Looper.myLooper();
        YN1.m9283h(looperMyLooper);
        this.f13983d = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HandlerC10047kk0 handlerC10047kk0 = new HandlerC10047kk0(this, looperMyLooper, interfaceC10175lk0, interfaceC9919jk0, i, jElapsedRealtime);
        YN1.m9281f(((HandlerC10047kk0) this.f13982c) == null);
        this.f13982c = handlerC10047kk0;
        handlerC10047kk0.f36651e = null;
        ((ExecutorService) this.f13981b).execute(handlerC10047kk0);
        return jElapsedRealtime;
    }

    /* renamed from: T */
    public C1380Vw m9137T(C0796Me c0796Me) {
        R61 r61;
        DV1.m1716a();
        this.f13983d = new C1380Vw();
        Iterator it = c0796Me.f7279b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            r61 = c0796Me.f7278a;
            if (!zHasNext) {
                break;
            }
            C1860ce c1860ce = (C1860ce) it.next();
            C1380Vw c1380Vw = (C1380Vw) this.f13983d;
            Rect rect = c1860ce.f17669d;
            Matrix matrix = new Matrix(r61.f10003b);
            RectF rectF = new RectF(rect);
            RectF rectF2 = AbstractC11184tc1.f43173a;
            float f = 0;
            Size size = c1860ce.f17670e;
            RectF rectF3 = new RectF(f, f, size.getWidth(), size.getHeight());
            int i = c1860ce.f17671f;
            boolean z = c1860ce.f17672g;
            matrix.postConcat(AbstractC11184tc1.m24947a(rectF, rectF3, i, z));
            AbstractC9104dM1.m17546e(AbstractC11184tc1.m24950d(AbstractC11184tc1.m24953g(AbstractC11184tc1.m24951e(rect), i), false, size));
            Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            C6937uF c6937uFM3116a = r61.f10008g.m3116a();
            c6937uFM3116a.f43616a = size;
            c1380Vw.put(c1860ce, new R61(c1860ce.f17667b, c1860ce.f17668c, c6937uFM3116a.m25140l(), matrix, false, rect2, r61.f10010i - i, -1, r61.f10006e != z));
        }
        Z61 z61M6899d = r61.m6899d((InterfaceC6972uo) this.f13982c, true);
        C0584JG c0584jg = (C0584JG) this.f13981b;
        if (c0584jg.f5434e.get()) {
            z61M6899d.m9493d();
        } else {
            c0584jg.m4267b(new RunnableC3973eA(c0584jg, 12, z61M6899d), new RunnableC0521IG(z61M6899d, 0));
        }
        for (Map.Entry entry : ((C1380Vw) this.f13983d).entrySet()) {
            m9151u(r61, entry);
            ((R61) entry.getValue()).m6896a(new RunnableC8176Qp0(this, r61, entry, 10));
        }
        r61.f10016o.add(new WN0(1, (C1380Vw) this.f13983d));
        return (C1380Vw) this.f13983d;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x002d  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.AbstractC8315Tg1 m9138U(p000.C8720aP0 r8, p000.C11818yb0 r9, boolean r10) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "arrayType"
            p000.O90.m5968f(r8, r2)
            tP0 r2 = r8.f15492b
            boolean r3 = r2 instanceof p000.C10901rP0
            r4 = 0
            if (r3 == 0) goto L12
            r3 = r2
            rP0 r3 = (p000.C10901rP0) r3
            goto L13
        L12:
            r3 = r4
        L13:
            if (r3 == 0) goto L2d
            java.lang.Class r5 = java.lang.Void.TYPE
            java.lang.Class r3 = r3.f41663a
            boolean r5 = p000.O90.m5963a(r3, r5)
            if (r5 == 0) goto L20
            goto L2d
        L20:
            java.lang.String r3 = r3.getName()
            sd0 r3 = p000.EnumC11057sd0.m24757b(r3)
            sD0 r3 = r3.m24759d()
            goto L2e
        L2d:
            r3 = r4
        L2e:
            xh0 r5 = new xh0
            java.lang.Object r6 = r7.f13981b
            nH r6 = (p000.C6479nH) r6
            r5.<init>(r6, r8, r1)
            java.lang.Object r8 = r6.f38228b
            ib0 r8 = (p000.C9773ib0) r8
            boolean r9 = r9.f46329d
            if (r3 == 0) goto L70
            java.lang.Object r8 = r8.f29352o
            Cs0 r8 = (p000.C7454Cs0) r8
            zg0 r8 = r8.f1735e
            X01 r8 = r8.m26508q(r3)
            K5 r10 = new K5
            I5 r2 = r8.getAnnotations()
            r3 = 2
            I5[] r3 = new p000.InterfaceC0510I5[r3]
            r3[r0] = r2
            r3[r1] = r5
            r10.<init>(r3)
            Ig0 r8 = p000.CZ1.m1235k(r8, r10)
            java.lang.String r10 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"
            p000.O90.m5966d(r8, r10)
            X01 r8 = (p000.X01) r8
            if (r9 == 0) goto L67
            goto L6f
        L67:
            X01 r9 = r8.mo250P(r1)
            Tg1 r8 = p000.NV1.m5738t(r8, r9)
        L6f:
            return r8
        L70:
            ze1 r3 = p000.EnumC11952ze1.f46923b
            r6 = 6
            yb0 r0 = p000.K22.m4530a(r3, r9, r0, r4, r6)
            Ig0 r0 = r7.m9139V(r2, r0)
            if (r9 == 0) goto L8f
            if (r10 == 0) goto L82
            gi1 r9 = p000.EnumC9532gi1.f27949e
            goto L84
        L82:
            gi1 r9 = p000.EnumC9532gi1.f27947c
        L84:
            java.lang.Object r8 = r8.f29352o
            Cs0 r8 = (p000.C7454Cs0) r8
            zg0 r8 = r8.f1735e
            X01 r8 = r8.m26501h(r9, r0, r5)
            return r8
        L8f:
            java.lang.Object r9 = r8.f29352o
            Cs0 r9 = (p000.C7454Cs0) r9
            zg0 r9 = r9.f1735e
            gi1 r10 = p000.EnumC9532gi1.f27947c
            X01 r9 = r9.m26501h(r10, r0, r5)
            java.lang.Object r8 = r8.f29352o
            Cs0 r8 = (p000.C7454Cs0) r8
            zg0 r8 = r8.f1735e
            gi1 r10 = p000.EnumC9532gi1.f27949e
            X01 r8 = r8.m26501h(r10, r0, r5)
            X01 r8 = r8.mo250P(r1)
            Tg1 r8 = p000.NV1.m5738t(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8539Xo1.m9138U(aP0, yb0, boolean):Tg1");
    }

    /* renamed from: V */
    public AbstractC7742Ig0 m9139V(InterfaceC11564wb0 interfaceC11564wb0, C11818yb0 c11818yb0) {
        boolean z = interfaceC11564wb0 instanceof C10901rP0;
        C6479nH c6479nH = (C6479nH) this.f13981b;
        if (z) {
            Class cls = Void.TYPE;
            Class cls2 = ((C10901rP0) interfaceC11564wb0).f41663a;
            EnumC11005sD0 enumC11005sD0M24759d = O90.m5963a(cls2, cls) ? null : EnumC11057sd0.m24757b(cls2.getName()).m24759d();
            return enumC11005sD0M24759d != null ? ((C7454Cs0) ((C9773ib0) c6479nH.f38228b).f29352o).f1735e.m26509s(enumC11005sD0M24759d) : ((C7454Cs0) ((C9773ib0) c6479nH.f38228b).f29352o).f1735e.m26512w();
        }
        boolean z2 = false;
        if (!(interfaceC11564wb0 instanceof C9749iP0)) {
            if (interfaceC11564wb0 instanceof C8720aP0) {
                return m9138U((C8720aP0) interfaceC11564wb0, c11818yb0, false);
            }
            if (interfaceC11564wb0 instanceof C11540wP0) {
                AbstractC11157tP0 abstractC11157tP0M25615c = ((C11540wP0) interfaceC11564wb0).m25615c();
                return abstractC11157tP0M25615c != null ? m9139V(abstractC11157tP0M25615c, c11818yb0) : ((C7454Cs0) ((C9773ib0) c6479nH.f38228b).f29352o).f1735e.m26505m();
            }
            if (interfaceC11564wb0 == null) {
                return ((C7454Cs0) ((C9773ib0) c6479nH.f38228b).f29352o).f1735e.m26505m();
            }
            throw new UnsupportedOperationException("Unsupported type: " + interfaceC11564wb0);
        }
        C9749iP0 c9749iP0 = (C9749iP0) interfaceC11564wb0;
        if (!c11818yb0.f46329d) {
            if (c11818yb0.f46326a != EnumC11952ze1.f46922a) {
                z2 = true;
            }
        }
        boolean zM19029d = c9749iP0.m19029d();
        Type type = c9749iP0.f29121a;
        if (!zM19029d && !z2) {
            X01 x01M9149r = m9149r(c9749iP0, c11818yb0, null);
            return x01M9149r != null ? x01M9149r : C6298kP.m22197c(EnumC6235jP.f35118c, type.toString());
        }
        X01 x01M9149r2 = m9149r(c9749iP0, C11818yb0.m26174a(c11818yb0, EnumC7368Bb0.f936c, false, null, null, 61), null);
        if (x01M9149r2 == null) {
            return C6298kP.m22197c(EnumC6235jP.f35118c, type.toString());
        }
        X01 x01M9149r3 = m9149r(c9749iP0, C11818yb0.m26174a(c11818yb0, EnumC7368Bb0.f935b, false, null, null, 61), x01M9149r2);
        if (x01M9149r3 == null) {
            return C6298kP.m22197c(EnumC6235jP.f35118c, type.toString());
        }
        return zM19029d ? new C10633pJ0(x01M9149r2, x01M9149r3) : NV1.m5738t(x01M9149r2, x01M9149r3);
    }

    /* renamed from: W */
    public void m9140W(C0424Gj c0424Gj) throws IOException {
        File file = (File) this.f13982c;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                C1446Wz c1446Wz = new C1446Wz(fileOutputStream);
                c1446Wz.f13471a = 0L;
                C0487Hj c0487Hj = (C0487Hj) c0424Gj.f3861c;
                O90.m5968f(c0487Hj, "this$0");
                EncodedImage encodedImage = (EncodedImage) c0424Gj.f3860b;
                O90.m5965c(encodedImage);
                InputStream inputStream = encodedImage.getInputStream();
                if (inputStream == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ((C0986Pf) c0487Hj.f4447d).m6395f(inputStream, c1446Wz);
                c1446Wz.flush();
                long j = c1446Wz.f13471a;
                fileOutputStream.close();
                if (file.length() == j) {
                    return;
                }
                long length = file.length();
                StringBuilder sbM26239p = AbstractC7222ym.m26239p("File was not written completely. Expected: ", j, ", found: ");
                sbM26239p.append(length);
                throw new C6583ou(sbM26239p.toString());
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e) {
            C7356Av0 c7356Av0 = ((C4167hF) this.f13983d).f28335d;
            int i = C4167hF.f28331g;
            c7356Av0.getClass();
            throw e;
        }
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: Z */
    public void mo851Z(InterfaceC6843sl interfaceC6843sl, HS0 hs0) {
        File file = (File) this.f13982c;
        boolean zM3428n = hs0.m3428n();
        Promise promise = (Promise) this.f13981b;
        if (!zM3428n) {
            promise.resolve(Boolean.FALSE);
            return;
        }
        try {
            IS0 is0 = hs0.f4301g;
            try {
                InterfaceC0676Kj interfaceC0676KjMo3385w = is0.mo3385w();
                Logger logger = AbstractC11608wx0.f45176a;
                C11790yN0 c11790yN0M4273a = JI1.m4273a(JI1.m4278f(file));
                c11790yN0M4273a.mo4396i(interfaceC0676KjMo3385w);
                c11790yN0M4273a.flush();
                c11790yN0M4273a.close();
                interfaceC0676KjMo3385w.close();
                Uri uriFromFile = Uri.fromFile(file);
                int i = Build.VERSION.SDK_INT;
                RNSendIntentModule rNSendIntentModule = (RNSendIntentModule) this.f13983d;
                if (i > 23) {
                    uriFromFile = AbstractC0345FT.m2663d(rNSendIntentModule.reactContext, rNSendIntentModule.reactContext.getPackageName() + ".fileprovider", file);
                }
                Intent dataAndType = new Intent("android.intent.action.VIEW").setDataAndType(uriFromFile, "application/vnd.android.package-archive");
                dataAndType.setFlags(268435457);
                rNSendIntentModule.reactContext.startActivity(dataAndType);
                promise.resolve(Boolean.TRUE);
                is0.close();
            } finally {
            }
        } catch (Exception e) {
            e.printStackTrace();
            promise.resolve(Boolean.FALSE);
        }
    }

    @Override // p000.InterfaceC10687pk0
    /* renamed from: a */
    public void mo858a() throws IOException {
        IOException iOException;
        IOException iOException2 = (IOException) this.f13983d;
        if (iOException2 != null) {
            throw iOException2;
        }
        HandlerC10047kk0 handlerC10047kk0 = (HandlerC10047kk0) this.f13982c;
        if (handlerC10047kk0 != null && (iOException = handlerC10047kk0.f36651e) != null && handlerC10047kk0.f36652f > handlerC10047kk0.f36647a) {
            throw iOException;
        }
    }

    @Override // p000.InterfaceC10021kX0
    /* renamed from: b */
    public void mo5439b(C9591hA0 c9591hA0) {
        long jM4353d;
        YN1.m9283h((C7783Ja1) this.f13982c);
        int i = AbstractC7485Dh1.f2166a;
        C7783Ja1 c7783Ja1 = (C7783Ja1) this.f13982c;
        synchronized (c7783Ja1) {
            try {
                long j = c7783Ja1.f5618c;
                jM4353d = j != -9223372036854775807L ? j + c7783Ja1.f5617b : c7783Ja1.m4353d();
            } finally {
            }
        }
        long jM4354e = ((C7783Ja1) this.f13982c).m4354e();
        if (jM4353d == -9223372036854775807L || jM4354e == -9223372036854775807L) {
            return;
        }
        C6686qX c6686qX = (C6686qX) this.f13981b;
        if (jM4354e != c6686qX.f40979r) {
            C6623pX c6623pXM24020a = c6686qX.m24020a();
            c6623pXM24020a.f40166q = jM4354e;
            C6686qX c6686qX2 = new C6686qX(c6623pXM24020a);
            this.f13981b = c6686qX2;
            ((InterfaceC8357Ub1) this.f13983d).mo965f(c6686qX2);
        }
        int iM18743a = c9591hA0.m18743a();
        ((InterfaceC8357Ub1) this.f13983d).mo963d(iM18743a, c9591hA0);
        ((InterfaceC8357Ub1) this.f13983d).mo960a(jM4353d, 1, iM18743a, 0, null);
    }

    @Override // p000.U51
    /* renamed from: c */
    public int mo5855c(long j) {
        long[] jArr = (long[]) this.f13983d;
        int iM1814b = AbstractC7485Dh1.m1814b(jArr, j, false);
        if (iM1814b < jArr.length) {
            return iM1814b;
        }
        return -1;
    }

    @Override // p000.InterfaceC9979kC0
    /* renamed from: d */
    public boolean mo4580d(Object obj) {
        if (obj instanceof InterfaceC6301kS) {
            ((InterfaceC6301kS) obj).mo3389b().f3055a = true;
        }
        ((InterfaceC6364lS) this.f13982c).mo22428f(obj);
        return ((C10107lC0) this.f13983d).mo4580d(obj);
    }

    @Override // p000.InterfaceC10021kX0
    /* renamed from: e */
    public void mo5441e(C7783Ja1 c7783Ja1, InterfaceC1538YR interfaceC1538YR, YM0 ym0) {
        this.f13982c = c7783Ja1;
        ym0.m9266a();
        ym0.m9267b();
        InterfaceC8357Ub1 interfaceC8357Ub1Mo2005w = interfaceC1538YR.mo2005w(ym0.f14272e, 5);
        this.f13983d = interfaceC8357Ub1Mo2005w;
        interfaceC8357Ub1Mo2005w.mo965f((C6686qX) this.f13981b);
    }

    @Override // p000.U51
    /* renamed from: f */
    public long mo5856f(int i) {
        YN1.m9278c(i >= 0);
        long[] jArr = (long[]) this.f13983d;
        YN1.m9278c(i < jArr.length);
        return jArr[i];
    }

    @Override // p000.InterfaceC9585h70
    /* renamed from: g */
    public int mo9141g() {
        C10515oO0 c10515oO0 = (C10515oO0) ((G10) this.f13981b).f3531b;
        c10515oO0.reset();
        return AbstractC9063d22.m17477a((ArrayList) this.f13983d, c10515oO0, (C11967zm0) this.f13982c);
    }

    @Override // javax.inject.Provider
    public Object get() {
        switch (this.f13980a) {
            case 5:
                return ((AbstractC7279zg) this.f13983d).getModule((String) this.f13981b, (ReactApplicationContext) this.f13982c);
            default:
                return new C8200Rb0((Context) ((C7668Gv0) this.f13981b).f3961a, (InterfaceC0970PP) ((Provider) this.f13982c).get(), (C7088we) ((C11370v32) this.f13983d).get());
        }
    }

    @Override // p000.U51
    /* renamed from: h */
    public List mo5857h(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = (List) this.f13981b;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = (long[]) this.f13982c;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C9798in1 c9798in1 = (C9798in1) list.get(i);
                C6933uB c6933uB = c9798in1.f29451a;
                if (c6933uB.f43570e == -3.4028235E38f) {
                    arrayList2.add(c9798in1);
                } else {
                    arrayList.add(c6933uB);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new C0295Eg(25));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            C6870tB c6870tBM25128a = ((C9798in1) arrayList2.get(i3)).f29451a.m25128a();
            c6870tBM25128a.f42905e = (-1) - i3;
            c6870tBM25128a.f42906f = 1;
            arrayList.add(c6870tBM25128a.m24850a());
        }
        return arrayList;
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(C0300El c0300El) {
        c0300El.m2374a(new GR0(25, this), QR1.m6703a());
        ((B20) this.f13983d).f522a.set(c0300El);
        return "HandlerScheduledFuture-" + ((Callable) this.f13982c).toString();
    }

    @Override // p000.InterfaceC9979kC0
    /* renamed from: i */
    public Object mo4581i() {
        Object objMo4581i = ((C10107lC0) this.f13983d).mo4581i();
        if (objMo4581i == null) {
            objMo4581i = ((InterfaceC6238jS) this.f13981b).create();
            if (Log.isLoggable("FactoryPools", 2)) {
                objMo4581i.getClass().toString();
            }
        }
        if (objMo4581i instanceof InterfaceC6301kS) {
            ((InterfaceC6301kS) objMo4581i).mo3389b().f3055a = false;
        }
        return objMo4581i;
    }

    @Override // p000.U51
    /* renamed from: j */
    public int mo5858j() {
        return ((long[]) this.f13983d).length;
    }

    /* renamed from: k */
    public void m9142k(String str, boolean z) {
        m9143l(String.valueOf(z), str);
    }

    /* renamed from: l */
    public void m9143l(Object obj, String str) {
        C10189lr0 c10189lr0 = new C10189lr0(19);
        ((C10189lr0) this.f13983d).f37325d = c10189lr0;
        this.f13983d = c10189lr0;
        c10189lr0.f37324c = obj;
        c10189lr0.f37323b = str;
    }

    /* renamed from: m */
    public C1236Te m9144m() {
        String strConcat = ((String) this.f13981b) == null ? " backendName" : "";
        if (((EnumC11261uD0) this.f13983d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new C1236Te((String) this.f13981b, (byte[]) this.f13982c, (EnumC11261uD0) this.f13983d);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    @Override // p000.InterfaceC9585h70
    /* renamed from: n */
    public Bitmap mo9145n(BitmapFactory.Options options) {
        C10515oO0 c10515oO0 = (C10515oO0) ((G10) this.f13981b).f3531b;
        c10515oO0.reset();
        return BitmapFactory.decodeStream(c10515oO0, null, options);
    }

    /* renamed from: o */
    public String m9146o(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f13982c;
            int size = arrayList.size();
            ArrayList arrayList2 = (ArrayList) this.f13981b;
            if (i2 >= size) {
                sb.append((String) arrayList2.get(arrayList.size()));
                return sb.toString();
            }
            sb.append((String) arrayList2.get(i2));
            if (((Integer) arrayList.get(i2)).intValue() == 1) {
                sb.append(str);
            } else {
                int iIntValue = ((Integer) arrayList.get(i2)).intValue();
                ArrayList arrayList3 = (ArrayList) this.f13983d;
                if (iIntValue == 2) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i2), Long.valueOf(j)));
                } else if (((Integer) arrayList.get(i2)).intValue() == 3) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i2), Integer.valueOf(i)));
                } else if (((Integer) arrayList.get(i2)).intValue() == 4) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i2), Long.valueOf(j2)));
                }
            }
            i2++;
        }
    }

    /* renamed from: p */
    public void m9147p() {
        HandlerC10047kk0 handlerC10047kk0 = (HandlerC10047kk0) this.f13982c;
        YN1.m9283h(handlerC10047kk0);
        handlerC10047kk0.m22250a(false);
    }

    /* renamed from: q */
    public C6365lT m9148q() throws C4245iU {
        C4167hF c4167hF = (C4167hF) this.f13983d;
        c4167hF.f28336e.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        File fileM18787b = c4167hF.m18787b((String) this.f13981b);
        try {
            AbstractC8671a12.m9664c((File) this.f13982c, fileM18787b);
            if (fileM18787b.exists()) {
                fileM18787b.setLastModified(jCurrentTimeMillis);
            }
            return new C6365lT(fileM18787b);
        } catch (C4245iU e) {
            Throwable cause = e.getCause();
            if (cause != null && !(cause instanceof C4182hU)) {
                boolean z = cause instanceof FileNotFoundException;
            }
            int i = C4167hF.f28331g;
            c4167hF.f28335d.getClass();
            throw e;
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
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.X01 m9149r(p000.C9749iP0 r22, p000.C11818yb0 r23, p000.X01 r24) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8539Xo1.m9149r(iP0, yb0, X01):X01");
    }

    @Override // p000.InterfaceC9585h70
    /* renamed from: s */
    public void mo9150s() {
        C10515oO0 c10515oO0 = (C10515oO0) ((G10) this.f13981b).f3531b;
        synchronized (c10515oO0) {
            c10515oO0.f38986c = c10515oO0.f38984a.length;
        }
    }

    @Override // p000.InterfaceC11800yS0
    /* renamed from: t */
    public InterfaceC10011kS0 mo875t(InterfaceC10011kS0 interfaceC10011kS0, C7830Jy0 c7830Jy0) {
        Drawable drawable = (Drawable) interfaceC10011kS0.get();
        if (drawable instanceof BitmapDrawable) {
            return ((C0986Pf) this.f13982c).mo875t(C6506ni.m23171b((InterfaceC6443mi) this.f13981b, ((BitmapDrawable) drawable).getBitmap()), c7830Jy0);
        }
        if (drawable instanceof C9186e10) {
            return ((C10212m12) this.f13983d).mo875t(interfaceC10011kS0, c7830Jy0);
        }
        return null;
    }

    public String toString() {
        String str = "";
        switch (this.f13980a) {
            case 18:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f13981b);
                sb.append('{');
                C9108dO1 c9108dO1 = (C9108dO1) ((C9108dO1) this.f13982c).f26013c;
                while (c9108dO1 != null) {
                    ES1 es1 = (ES1) c9108dO1.f26012b;
                    sb.append(str);
                    if (es1 == null || !ES1.class.isArray()) {
                        sb.append(es1);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{es1});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    c9108dO1 = (C9108dO1) c9108dO1.f26013c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 19:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f13981b);
                sb2.append('{');
                C10189lr0 c10189lr0 = (C10189lr0) ((C10189lr0) this.f13982c).f37325d;
                while (c10189lr0 != null) {
                    Object obj = c10189lr0.f37324c;
                    sb2.append(str);
                    String str2 = (String) c10189lr0.f37323b;
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
                    c10189lr0 = (C10189lr0) c10189lr0.f37325d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public void m9151u(R61 r61, Map.Entry entry) {
        R61 r612 = (R61) entry.getValue();
        C0671Ke c0671Ke = new C0671Ke(r61.f10008g.f3839a, ((C1860ce) entry.getKey()).f17669d, r61.f10004c ? (InterfaceC6972uo) this.f13982c : null, ((C1860ce) entry.getKey()).f17671f, ((C1860ce) entry.getKey()).f17672g);
        int i = ((C1860ce) entry.getKey()).f17668c;
        r612.getClass();
        DV1.m1716a();
        r612.m6897b();
        AbstractC9104dM1.m17550i(!r612.f10011j, "Consumer can only be linked once.");
        r612.f10011j = true;
        Q61 q61 = r612.f10013l;
        AbstractC8301Sz1.m7478a(AbstractC8301Sz1.m7495r(q61.m18992c(), new P61(r612, q61, i, c0671Ke, null), QR1.m6710h()), new C9108dO1(this, 26, r612), QR1.m6710h());
    }

    /* renamed from: v */
    public void m9152v(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f13982c;
        HashMap map2 = (HashMap) this.f13981b;
        C8958cG0 c8958cG0 = new C8958cG0(byteArrayOutputStream, map2, map, (C10031kc0) this.f13983d);
        if (obj == null) {
            return;
        }
        InterfaceC8502Ww0 interfaceC8502Ww0 = (InterfaceC8502Ww0) map2.get(obj.getClass());
        if (interfaceC8502Ww0 != null) {
            interfaceC8502Ww0.mo104a(obj, c8958cG0);
        } else {
            throw new C7198yO("No encoder for " + obj.getClass());
        }
    }

    /* renamed from: w */
    public byte[] m9153w(UUID uuid, C0279EQ c0279eq) throws C9545gp0 {
        String str = c0279eq.f2696b;
        if (TextUtils.isEmpty(str)) {
            str = (String) this.f13982c;
        }
        if (TextUtils.isEmpty(str)) {
            Map mapEmptyMap = Collections.emptyMap();
            Uri uri = Uri.EMPTY;
            YN1.m9284i(uri, "The uri must be set.");
            throw new C9545gp0(new C3976eD(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 0), uri, C10007kQ0.f36495g, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = AbstractC0865Nk.f7981e;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : AbstractC0865Nk.f7979c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.f13983d)) {
            map.putAll((HashMap) this.f13983d);
        }
        return m9118z((InterfaceC10859r40) this.f13981b, str, c0279eq.f2695a, map);
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: w0 */
    public void mo852w0(InterfaceC6843sl interfaceC6843sl, IOException iOException) {
        iOException.printStackTrace();
        ((Promise) this.f13981b).resolve(Boolean.FALSE);
    }

    /* renamed from: x */
    public void m9154x(Runnable runnable) {
        ((ExecutorC6865t6) this.f13981b).execute(runnable);
    }

    @Override // p000.InterfaceC9585h70
    /* renamed from: y */
    public ImageHeaderParser$ImageType mo9155y() {
        C10515oO0 c10515oO0 = (C10515oO0) ((G10) this.f13981b).f3531b;
        c10515oO0.reset();
        return AbstractC9063d22.m17478b((ArrayList) this.f13983d, c10515oO0, (C11967zm0) this.f13982c);
    }

    public /* synthetic */ C8539Xo1(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.f13980a = i;
        this.f13981b = obj;
        this.f13982c = obj2;
        this.f13983d = obj3;
    }

    public C8539Xo1(int i) {
        this.f13980a = i;
        switch (i) {
            case 6:
                this.f13981b = new SparseArray();
                break;
        }
    }

    public C8539Xo1(AbstractActivityC4221i6 abstractActivityC4221i6) {
        this.f13980a = 9;
        SharedPreferences sharedPreferences = abstractActivityC4221i6.getSharedPreferences("expo.modules.kotlin.PersistentDataManager", 0);
        O90.m5967e(sharedPreferences, "getSharedPreferences(...)");
        this.f13981b = sharedPreferences;
        this.f13982c = new Bundle();
        this.f13983d = AbstractC0705LB.m4915b(new C4090g1(10, this));
    }

    public C8539Xo1(AbstractServiceC8058Oi0 abstractServiceC8058Oi0) {
        this.f13980a = 24;
        this.f13981b = new C1742a(abstractServiceC8058Oi0);
        this.f13982c = new Handler();
    }

    public C8539Xo1(WorkDatabase_Impl workDatabase_Impl) {
        this.f13980a = 0;
        this.f13981b = workDatabase_Impl;
        this.f13982c = new C1276UH(workDatabase_Impl, 7);
        this.f13983d = new C10061kr0(workDatabase_Impl, 18);
    }

    public C8539Xo1(ArrayList arrayList) {
        this.f13980a = 28;
        this.f13981b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f13982c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            C9798in1 c9798in1 = (C9798in1) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.f13982c;
            jArr[i2] = c9798in1.f29452b;
            jArr[i2 + 1] = c9798in1.f29453c;
        }
        long[] jArr2 = (long[]) this.f13982c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f13983d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public C8539Xo1(ExecutorService executorService) {
        this.f13980a = 29;
        this.f13982c = new Handler(Looper.getMainLooper());
        this.f13983d = new ExecutorC9387fa0(this);
        this.f13981b = new ExecutorC6865t6(executorService);
    }

    public C8539Xo1(C6479nH c6479nH, InterfaceC10548oe1 interfaceC10548oe1) {
        this.f13980a = 16;
        O90.m5968f(c6479nH, "c");
        O90.m5968f(interfaceC10548oe1, "typeParameterResolver");
        this.f13981b = c6479nH;
        this.f13982c = interfaceC10548oe1;
        this.f13983d = new ES1(new NV1(19));
    }

    public C8539Xo1(C0471HT c0471ht) {
        this.f13980a = 1;
        this.f13982c = null;
        this.f13983d = null;
        this.f13981b = c0471ht;
    }

    public C8539Xo1(Context context, TypedArray typedArray) {
        this.f13980a = 26;
        this.f13981b = context;
        this.f13982c = typedArray;
    }

    public C8539Xo1(String str, InterfaceC10859r40 interfaceC10859r40) {
        this.f13980a = 14;
        this.f13981b = interfaceC10859r40;
        this.f13982c = str;
        this.f13983d = new HashMap();
    }

    public C8539Xo1(C0799Mh c0799Mh) {
        this.f13980a = 3;
        this.f13983d = c0799Mh;
    }

    public C8539Xo1(InterfaceC6972uo interfaceC6972uo, C0584JG c0584jg) {
        this.f13980a = 25;
        this.f13982c = interfaceC6972uo;
        this.f13981b = c0584jg;
    }

    public C8539Xo1(C0505I0 c0505i0, ArrayList arrayList, C11967zm0 c11967zm0) {
        this.f13980a = 15;
        IL1.m3830d(c11967zm0, "Argument must not be null");
        this.f13982c = c11967zm0;
        IL1.m3830d(arrayList, "Argument must not be null");
        this.f13983d = arrayList;
        this.f13981b = new G10(c0505i0, c11967zm0);
    }

    public C8539Xo1(String str, int i) {
        this.f13980a = i;
        switch (i) {
            case 18:
                C9108dO1 c9108dO1 = new C9108dO1(18, false);
                this.f13982c = c9108dO1;
                this.f13983d = c9108dO1;
                this.f13981b = str;
                break;
            case 19:
                C10189lr0 c10189lr0 = new C10189lr0(19);
                this.f13982c = c10189lr0;
                this.f13983d = c10189lr0;
                this.f13981b = str;
                break;
            case 20:
                C6623pX c6623pX = new C6623pX();
                c6623pX.f40161l = AbstractC8544Xr0.m9171n(str);
                this.f13981b = new C6686qX(c6623pX);
                break;
            default:
                String strConcat = "ExoPlayer:Loader:".concat(str);
                int i2 = AbstractC7485Dh1.f2166a;
                this.f13981b = Executors.newSingleThreadExecutor(new ThreadFactoryC11704xh1(strConcat));
                break;
        }
    }

    public C8539Xo1(C7967Mo1 c7967Mo1) {
        this.f13980a = 7;
        this.f13983d = c7967Mo1;
        this.f13982c = new AtomicBoolean(false);
        this.f13981b = ((C0175Cm) c7967Mo1.f7363b).f1625d.schedule(new RunnableC7159xm(this, 0), 2000L, TimeUnit.MILLISECONDS);
    }
}

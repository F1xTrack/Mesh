package com.yandex.metrica;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import io.sentry.C5754C;
import io.sentry.C6059l1;
import io.sentry.C6166u0;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC5796Q;
import io.sentry.InterfaceC6058l0;
import io.sentry.ThreadFactoryC5748A;
import io.sentry.android.core.AbstractC5836H;
import io.sentry.android.core.C5832D;
import io.sentry.android.replay.util.InterfaceC5965d;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6094j;
import io.sentry.protocol.C6103s;
import io.sentry.protocol.C6109y;
import io.sentry.transport.C6162n;
import io.sentry.util.AbstractC6168a;
import io.sentry.util.C6170c;
import io.sentry.vendor.gson.stream.C6186c;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p000.C0986Pf;
import p000.O90;

/* renamed from: com.yandex.metrica.e */
/* loaded from: classes2.dex */
public final class C2460e implements InterfaceC2465i, InterfaceC5796Q, InterfaceC5965d, InterfaceC5749A0 {

    /* renamed from: a */
    public final Object f20786a;

    public /* synthetic */ C2460e(Object obj) {
        this.f20786a = obj;
    }

    /* renamed from: x */
    public static C6103s m13802x(Throwable th, C6094j c6094j, Long l, List list, boolean z) {
        Package r0 = th.getClass().getPackage();
        String name = th.getClass().getName();
        C6103s c6103s = new C6103s();
        String message = th.getMessage();
        if (r0 != null) {
            name = name.replace(r0.getName() + ".", "");
        }
        String name2 = r0 != null ? r0.getName() : null;
        if (list != null && !list.isEmpty()) {
            C6109y c6109y = new C6109y(list);
            if (z) {
                c6109y.f34485c = Boolean.TRUE;
            }
            c6103s.f34439e = c6109y;
        }
        c6103s.f34438d = l;
        c6103s.f34435a = name;
        c6103s.f34440f = c6094j;
        c6103s.f34437c = name2;
        c6103s.f34436b = message;
        return c6103s;
    }

    /* renamed from: A */
    public void m13803A(ILogger iLogger, Collection collection) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f20786a;
        arrayDeque.add(new ArrayList());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m13807E(iLogger, it.next());
        }
        m13831y(arrayDeque.removeLast());
    }

    /* renamed from: B */
    public void m13804B(C6059l1 c6059l1, ILogger iLogger, Collection collection) throws IOException {
        C6186c c6186c = (C6186c) c6059l1.f34226a;
        c6186c.m21919A();
        c6186c.m21920m();
        int i = c6186c.f34699c;
        int[] iArr = c6186c.f34698b;
        if (i == iArr.length) {
            c6186c.f34698b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = c6186c.f34698b;
        int i2 = c6186c.f34699c;
        c6186c.f34699c = i2 + 1;
        iArr2[i2] = 1;
        c6186c.f34697a.write(91);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m13832z(c6059l1, iLogger, it.next());
        }
        c6186c.m21921n(1, 2, ']');
    }

    /* renamed from: C */
    public void m13805C(ILogger iLogger, Map map) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f20786a;
        arrayDeque.addLast(new HashMap());
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                arrayDeque.add((String) obj);
                m13807E(iLogger, map.get(obj));
            }
        }
        m13831y(arrayDeque.removeLast());
    }

    /* renamed from: D */
    public void m13806D(C6059l1 c6059l1, ILogger iLogger, Map map) throws IOException {
        c6059l1.mo13824q();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                c6059l1.mo13828u((String) obj);
                m13832z(c6059l1, iLogger, map.get(obj));
            }
        }
        c6059l1.mo13817j();
    }

    /* renamed from: E */
    public void m13807E(ILogger iLogger, Object obj) {
        if (obj == null) {
            m13831y(null);
            return;
        }
        if (obj instanceof Character) {
            m13831y(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            m13831y((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            m13831y((Boolean) obj);
            return;
        }
        if (obj instanceof Number) {
            m13831y((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                m13831y(AbstractC6003a.m21759s((Date) obj));
                return;
            } catch (Exception e) {
                iLogger.mo21406d(EnumC6069n1.ERROR, "Error when serializing Date", e);
                m13831y(null);
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                m13831y(((TimeZone) obj).getID());
                return;
            } catch (Exception e2) {
                iLogger.mo21406d(EnumC6069n1.ERROR, "Error when serializing TimeZone", e2);
                m13831y(null);
                return;
            }
        }
        if (obj instanceof InterfaceC6058l0) {
            ((InterfaceC6058l0) obj).serialize(this, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            m13803A(iLogger, (Collection) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            m13803A(iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            m13805C(iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            m13831y(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            m13803A(iLogger, AbstractC6168a.m21877a((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            m13831y(Boolean.valueOf(((AtomicBoolean) obj).get()));
            return;
        }
        if (obj instanceof URI) {
            m13831y(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            m13831y(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            m13831y(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            m13831y(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            m13805C(iLogger, AbstractC6168a.m21879c((Calendar) obj));
        } else if (obj.getClass().isEnum()) {
            m13831y(obj.toString());
        } else {
            iLogger.mo21407k(EnumC6069n1.WARNING, "Failed serializing unknown object.", obj);
        }
    }

    @Override // io.sentry.android.replay.util.InterfaceC5965d
    /* renamed from: a */
    public int mo13808a(int i) {
        return ((Layout) this.f20786a).getLineTop(i);
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: b */
    public InterfaceC5749A0 mo13809b(long j) {
        m13831y(Long.valueOf(j));
        return this;
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: c */
    public InterfaceC5749A0 mo13810c(double d) {
        m13831y(Double.valueOf(d));
        return this;
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: d */
    public InterfaceC5749A0 mo13811d(String str) {
        m13831y(str);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[Catch: all -> 0x002a, DONT_GENERATE, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x000f, B:7:0x0016, B:9:0x0022, B:13:0x002c, B:14:0x003a), top: B:20:0x0005, inners: #0 }] */
    @Override // io.sentry.InterfaceC5796Q
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo13812e(long r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f20786a
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            monitor-enter(r0)
            java.lang.Object r1 = r3.f20786a     // Catch: java.lang.Throwable -> L2a
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r1.isShutdown()     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L3a
            java.lang.Object r1 = r3.f20786a     // Catch: java.lang.Throwable -> L2a
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1     // Catch: java.lang.Throwable -> L2a
            r1.shutdown()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r1 = r3.f20786a     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L2c
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L2c
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L2c
            boolean r4 = r1.awaitTermination(r4, r2)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L2c
            if (r4 != 0) goto L3a
            java.lang.Object r4 = r3.f20786a     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L2c
            java.util.concurrent.ScheduledExecutorService r4 = (java.util.concurrent.ScheduledExecutorService) r4     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L2c
            r4.shutdownNow()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L2c
            goto L3a
        L2a:
            r4 = move-exception
            goto L3c
        L2c:
            java.lang.Object r4 = r3.f20786a     // Catch: java.lang.Throwable -> L2a
            java.util.concurrent.ScheduledExecutorService r4 = (java.util.concurrent.ScheduledExecutorService) r4     // Catch: java.lang.Throwable -> L2a
            r4.shutdownNow()     // Catch: java.lang.Throwable -> L2a
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r4.interrupt()     // Catch: java.lang.Throwable -> L2a
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.C2460e.mo13812e(long):void");
    }

    @Override // io.sentry.android.replay.util.InterfaceC5965d
    /* renamed from: g */
    public float mo13814g(int i, int i2) {
        return ((Layout) this.f20786a).getPrimaryHorizontal(i2);
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: h */
    public InterfaceC5749A0 mo13815h(boolean z) {
        m13831y(Boolean.valueOf(z));
        return this;
    }

    @Override // io.sentry.android.replay.util.InterfaceC5965d
    /* renamed from: i */
    public int mo13816i(int i) {
        return ((Layout) this.f20786a).getLineBottom(i);
    }

    @Override // io.sentry.InterfaceC5796Q
    public boolean isClosed() {
        boolean zIsShutdown;
        synchronized (((ScheduledExecutorService) this.f20786a)) {
            zIsShutdown = ((ScheduledExecutorService) this.f20786a).isShutdown();
        }
        return zIsShutdown;
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: j */
    public InterfaceC5749A0 mo13817j() {
        m13831y(((ArrayDeque) this.f20786a).removeLast());
        return this;
    }

    @Override // io.sentry.android.replay.util.InterfaceC5965d
    /* renamed from: k */
    public int mo13818k(int i) {
        return ((Layout) this.f20786a).getLineStart(i);
    }

    @Override // io.sentry.android.replay.util.InterfaceC5965d
    /* renamed from: l */
    public int mo13819l() {
        return ((Layout) this.f20786a).getLineCount();
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: m */
    public InterfaceC5749A0 mo13820m(Number number) {
        m13831y(number);
        return this;
    }

    @Override // io.sentry.android.replay.util.InterfaceC5965d
    /* renamed from: o */
    public Integer mo13822o() {
        int i;
        Layout layout = (Layout) this.f20786a;
        if (!(layout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = layout.getText();
        O90.m5966d(text, "null cannot be cast to non-null type android.text.Spanned");
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, layout.getText().length(), ForegroundColorSpan.class);
        O90.m5967e(foregroundColorSpanArr, "spans");
        int i2 = Integer.MIN_VALUE;
        Integer numValueOf = null;
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            CharSequence text2 = layout.getText();
            O90.m5966d(text2, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
            CharSequence text3 = layout.getText();
            O90.m5966d(text3, "null cannot be cast to non-null type android.text.Spanned");
            int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
            if (spanStart != -1 && spanEnd != -1 && (i = spanEnd - spanStart) > i2) {
                numValueOf = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                i2 = i;
            }
        }
        if (numValueOf != null) {
            return Integer.valueOf(numValueOf.intValue() | (-16777216));
        }
        return null;
    }

    @Override // io.sentry.android.replay.util.InterfaceC5965d
    /* renamed from: p */
    public int mo13823p(int i) {
        return ((Layout) this.f20786a).getLineVisibleEnd(i);
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: q */
    public InterfaceC5749A0 mo13824q() {
        ((ArrayDeque) this.f20786a).addLast(new HashMap());
        return this;
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: r */
    public /* bridge */ /* synthetic */ InterfaceC5749A0 mo13825r(ILogger iLogger, Object obj) {
        m13807E(iLogger, obj);
        return this;
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: s */
    public InterfaceC5749A0 mo13826s(Boolean bool) {
        m13831y(bool);
        return this;
    }

    @Override // io.sentry.InterfaceC5796Q
    public Future submit(Runnable runnable) {
        return ((ScheduledExecutorService) this.f20786a).submit(runnable);
    }

    @Override // io.sentry.InterfaceC5796Q
    /* renamed from: t */
    public Future mo13827t(Runnable runnable, long j) {
        return ((ScheduledExecutorService) this.f20786a).schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: u */
    public InterfaceC5749A0 mo13828u(String str) {
        ((ArrayDeque) this.f20786a).add(str);
        return this;
    }

    @Override // io.sentry.android.replay.util.InterfaceC5965d
    /* renamed from: v */
    public int mo13829v(int i) {
        return ((Layout) this.f20786a).getEllipsisCount(i);
    }

    /* renamed from: w */
    public void m13830w(AbstractC5836H abstractC5836H) {
        ((C5832D) this.f20786a).getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 28) {
            return;
        }
        String callingPackage = abstractC5836H.getCallingPackage();
        String packageName = abstractC5836H.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    /* renamed from: y */
    public void m13831y(Object obj) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f20786a;
        Object objPeekLast = arrayDeque.peekLast();
        if (objPeekLast instanceof List) {
            ((List) objPeekLast).add(obj);
            return;
        }
        if (!(objPeekLast instanceof String)) {
            throw new IllegalStateException("Invalid stack state, expected array or string on top");
        }
        String str = (String) arrayDeque.removeLast();
        Object objPeekLast2 = arrayDeque.peekLast();
        if (objPeekLast2 == null) {
            throw new IllegalStateException("Stack is empty.");
        }
        if (!(objPeekLast2 instanceof Map)) {
            throw new IllegalStateException("Stack element is not a Map.");
        }
        ((Map) objPeekLast2).put(str, obj);
    }

    /* renamed from: z */
    public void m13832z(C6059l1 c6059l1, ILogger iLogger, Object obj) {
        if (obj == null) {
            c6059l1.m21834w();
            return;
        }
        if (obj instanceof Character) {
            c6059l1.mo13811d(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            c6059l1.mo13811d((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            c6059l1.mo13815h(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            c6059l1.mo13820m((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                c6059l1.mo13811d(AbstractC6003a.m21759s((Date) obj));
                return;
            } catch (Exception e) {
                iLogger.mo21406d(EnumC6069n1.ERROR, "Error when serializing Date", e);
                c6059l1.m21834w();
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                c6059l1.mo13811d(((TimeZone) obj).getID());
                return;
            } catch (Exception e2) {
                iLogger.mo21406d(EnumC6069n1.ERROR, "Error when serializing TimeZone", e2);
                c6059l1.m21834w();
                return;
            }
        }
        if (obj instanceof InterfaceC6058l0) {
            ((InterfaceC6058l0) obj).serialize(c6059l1, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            m13804B(c6059l1, iLogger, (Collection) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            m13804B(c6059l1, iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            m13806D(c6059l1, iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            c6059l1.mo13811d(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            m13804B(c6059l1, iLogger, AbstractC6168a.m21877a((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            c6059l1.mo13815h(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            c6059l1.mo13811d(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            c6059l1.mo13811d(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            c6059l1.mo13811d(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            c6059l1.mo13811d(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            m13806D(c6059l1, iLogger, AbstractC6168a.m21879c((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            c6059l1.mo13811d(obj.toString());
            return;
        }
        try {
            m13832z(c6059l1, iLogger, ((C0986Pf) this.f20786a).m6407x(iLogger, obj));
        } catch (Exception e3) {
            iLogger.mo21406d(EnumC6069n1.ERROR, "Failed serializing unknown object.", e3);
            c6059l1.mo13811d("[OBJECT]");
        }
    }

    public C2460e(int i, boolean z) {
        switch (i) {
            case 5:
                this.f20786a = new C5832D(C6166u0.f34658a);
                break;
            case 6:
            default:
                this.f20786a = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC5748A(1));
                break;
            case 7:
                Looper mainLooper = Looper.getMainLooper();
                O90.m5967e(mainLooper, "getMainLooper()");
                this.f20786a = new Handler(mainLooper);
                break;
            case 8:
                this.f20786a = new C6170c(new C5754C(6));
                break;
            case 9:
                this.f20786a = new C6162n();
                break;
        }
    }

    public C2460e(int i) {
        this.f20786a = new C0986Pf(i);
    }

    public C2460e(HashMap map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f20786a = arrayDeque;
        arrayDeque.addLast(map);
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: n */
    public InterfaceC5749A0 mo13821n() {
        return this;
    }

    @Override // io.sentry.InterfaceC5749A0
    /* renamed from: f */
    public void mo13813f(boolean z) {
    }
}

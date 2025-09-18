package com.yandex.metrica;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import defpackage.C1204Pf;
import defpackage.O90;
import io.sentry.A;
import io.sentry.A0;
import io.sentry.C;
import io.sentry.C5142l1;
import io.sentry.C5174u0;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import io.sentry.Q;
import io.sentry.android.core.D;
import io.sentry.android.core.H;
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

/* loaded from: classes2.dex */
public final class e implements i, Q, io.sentry.android.replay.util.d, A0 {
    public final Object a;

    public /* synthetic */ e(Object obj) {
        this.a = obj;
    }

    public static io.sentry.protocol.s x(Throwable th, io.sentry.protocol.j jVar, Long l, List list, boolean z) {
        Package r0 = th.getClass().getPackage();
        String name = th.getClass().getName();
        io.sentry.protocol.s sVar = new io.sentry.protocol.s();
        String message = th.getMessage();
        if (r0 != null) {
            name = name.replace(r0.getName() + ".", "");
        }
        String name2 = r0 != null ? r0.getName() : null;
        if (list != null && !list.isEmpty()) {
            io.sentry.protocol.y yVar = new io.sentry.protocol.y(list);
            if (z) {
                yVar.c = Boolean.TRUE;
            }
            sVar.e = yVar;
        }
        sVar.d = l;
        sVar.a = name;
        sVar.f = jVar;
        sVar.c = name2;
        sVar.b = message;
        return sVar;
    }

    public void A(ILogger iLogger, Collection collection) {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        arrayDeque.add(new ArrayList());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            E(iLogger, it.next());
        }
        y(arrayDeque.removeLast());
    }

    public void B(C5142l1 c5142l1, ILogger iLogger, Collection collection) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) c5142l1.a;
        cVar.A();
        cVar.m();
        int i = cVar.c;
        int[] iArr = cVar.b;
        if (i == iArr.length) {
            cVar.b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = cVar.b;
        int i2 = cVar.c;
        cVar.c = i2 + 1;
        iArr2[i2] = 1;
        cVar.a.write(91);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z(c5142l1, iLogger, it.next());
        }
        cVar.n(1, 2, ']');
    }

    public void C(ILogger iLogger, Map map) {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        arrayDeque.addLast(new HashMap());
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                arrayDeque.add((String) obj);
                E(iLogger, map.get(obj));
            }
        }
        y(arrayDeque.removeLast());
    }

    public void D(C5142l1 c5142l1, ILogger iLogger, Map map) throws IOException {
        c5142l1.q();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                c5142l1.u((String) obj);
                z(c5142l1, iLogger, map.get(obj));
            }
        }
        c5142l1.j();
    }

    public void E(ILogger iLogger, Object obj) {
        if (obj == null) {
            y(null);
            return;
        }
        if (obj instanceof Character) {
            y(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            y((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            y((Boolean) obj);
            return;
        }
        if (obj instanceof Number) {
            y((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                y(io.sentry.config.a.s((Date) obj));
                return;
            } catch (Exception e) {
                iLogger.d(EnumC5148n1.ERROR, "Error when serializing Date", e);
                y(null);
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                y(((TimeZone) obj).getID());
                return;
            } catch (Exception e2) {
                iLogger.d(EnumC5148n1.ERROR, "Error when serializing TimeZone", e2);
                y(null);
                return;
            }
        }
        if (obj instanceof InterfaceC5141l0) {
            ((InterfaceC5141l0) obj).serialize(this, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            A(iLogger, (Collection) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            A(iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            C(iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            y(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            A(iLogger, io.sentry.util.a.a((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            y(Boolean.valueOf(((AtomicBoolean) obj).get()));
            return;
        }
        if (obj instanceof URI) {
            y(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            y(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            y(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            y(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            C(iLogger, io.sentry.util.a.c((Calendar) obj));
        } else if (obj.getClass().isEnum()) {
            y(obj.toString());
        } else {
            iLogger.k(EnumC5148n1.WARNING, "Failed serializing unknown object.", obj);
        }
    }

    @Override // io.sentry.android.replay.util.d
    public int a(int i) {
        return ((Layout) this.a).getLineTop(i);
    }

    @Override // io.sentry.A0
    public A0 b(long j) {
        y(Long.valueOf(j));
        return this;
    }

    @Override // io.sentry.A0
    public A0 c(double d) {
        y(Double.valueOf(d));
        return this;
    }

    @Override // io.sentry.A0
    public A0 d(String str) {
        y(str);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[Catch: all -> 0x002a, DONT_GENERATE, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x000f, B:7:0x0016, B:9:0x0022, B:13:0x002c, B:14:0x003a), top: B:20:0x0005, inners: #0 }] */
    @Override // io.sentry.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(long r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.a
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            monitor-enter(r0)
            java.lang.Object r1 = r3.a     // Catch: java.lang.Throwable -> L2a
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r1.isShutdown()     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L3a
            java.lang.Object r1 = r3.a     // Catch: java.lang.Throwable -> L2a
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1     // Catch: java.lang.Throwable -> L2a
            r1.shutdown()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r1 = r3.a     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L2c
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L2c
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L2c
            boolean r4 = r1.awaitTermination(r4, r2)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L2c
            if (r4 != 0) goto L3a
            java.lang.Object r4 = r3.a     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L2c
            java.util.concurrent.ScheduledExecutorService r4 = (java.util.concurrent.ScheduledExecutorService) r4     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L2c
            r4.shutdownNow()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L2c
            goto L3a
        L2a:
            r4 = move-exception
            goto L3c
        L2c:
            java.lang.Object r4 = r3.a     // Catch: java.lang.Throwable -> L2a
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
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.e.e(long):void");
    }

    @Override // io.sentry.android.replay.util.d
    public float g(int i, int i2) {
        return ((Layout) this.a).getPrimaryHorizontal(i2);
    }

    @Override // io.sentry.A0
    public A0 h(boolean z) {
        y(Boolean.valueOf(z));
        return this;
    }

    @Override // io.sentry.android.replay.util.d
    public int i(int i) {
        return ((Layout) this.a).getLineBottom(i);
    }

    @Override // io.sentry.Q
    public boolean isClosed() {
        boolean zIsShutdown;
        synchronized (((ScheduledExecutorService) this.a)) {
            zIsShutdown = ((ScheduledExecutorService) this.a).isShutdown();
        }
        return zIsShutdown;
    }

    @Override // io.sentry.A0
    public A0 j() {
        y(((ArrayDeque) this.a).removeLast());
        return this;
    }

    @Override // io.sentry.android.replay.util.d
    public int k(int i) {
        return ((Layout) this.a).getLineStart(i);
    }

    @Override // io.sentry.android.replay.util.d
    public int l() {
        return ((Layout) this.a).getLineCount();
    }

    @Override // io.sentry.A0
    public A0 m(Number number) {
        y(number);
        return this;
    }

    @Override // io.sentry.android.replay.util.d
    public Integer o() {
        int i;
        Layout layout = (Layout) this.a;
        if (!(layout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = layout.getText();
        O90.d(text, "null cannot be cast to non-null type android.text.Spanned");
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, layout.getText().length(), ForegroundColorSpan.class);
        O90.e(foregroundColorSpanArr, "spans");
        int i2 = Integer.MIN_VALUE;
        Integer numValueOf = null;
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            CharSequence text2 = layout.getText();
            O90.d(text2, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
            CharSequence text3 = layout.getText();
            O90.d(text3, "null cannot be cast to non-null type android.text.Spanned");
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

    @Override // io.sentry.android.replay.util.d
    public int p(int i) {
        return ((Layout) this.a).getLineVisibleEnd(i);
    }

    @Override // io.sentry.A0
    public A0 q() {
        ((ArrayDeque) this.a).addLast(new HashMap());
        return this;
    }

    @Override // io.sentry.A0
    public /* bridge */ /* synthetic */ A0 r(ILogger iLogger, Object obj) {
        E(iLogger, obj);
        return this;
    }

    @Override // io.sentry.A0
    public A0 s(Boolean bool) {
        y(bool);
        return this;
    }

    @Override // io.sentry.Q
    public Future submit(Runnable runnable) {
        return ((ScheduledExecutorService) this.a).submit(runnable);
    }

    @Override // io.sentry.Q
    public Future t(Runnable runnable, long j) {
        return ((ScheduledExecutorService) this.a).schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.A0
    public A0 u(String str) {
        ((ArrayDeque) this.a).add(str);
        return this;
    }

    @Override // io.sentry.android.replay.util.d
    public int v(int i) {
        return ((Layout) this.a).getEllipsisCount(i);
    }

    public void w(H h) {
        ((D) this.a).getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 28) {
            return;
        }
        String callingPackage = h.getCallingPackage();
        String packageName = h.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    public void y(Object obj) {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
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

    public void z(C5142l1 c5142l1, ILogger iLogger, Object obj) {
        if (obj == null) {
            c5142l1.w();
            return;
        }
        if (obj instanceof Character) {
            c5142l1.d(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            c5142l1.d((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            c5142l1.h(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            c5142l1.m((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                c5142l1.d(io.sentry.config.a.s((Date) obj));
                return;
            } catch (Exception e) {
                iLogger.d(EnumC5148n1.ERROR, "Error when serializing Date", e);
                c5142l1.w();
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                c5142l1.d(((TimeZone) obj).getID());
                return;
            } catch (Exception e2) {
                iLogger.d(EnumC5148n1.ERROR, "Error when serializing TimeZone", e2);
                c5142l1.w();
                return;
            }
        }
        if (obj instanceof InterfaceC5141l0) {
            ((InterfaceC5141l0) obj).serialize(c5142l1, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            B(c5142l1, iLogger, (Collection) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            B(c5142l1, iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            D(c5142l1, iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            c5142l1.d(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            B(c5142l1, iLogger, io.sentry.util.a.a((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            c5142l1.h(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            c5142l1.d(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            c5142l1.d(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            c5142l1.d(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            c5142l1.d(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            D(c5142l1, iLogger, io.sentry.util.a.c((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            c5142l1.d(obj.toString());
            return;
        }
        try {
            z(c5142l1, iLogger, ((C1204Pf) this.a).x(iLogger, obj));
        } catch (Exception e3) {
            iLogger.d(EnumC5148n1.ERROR, "Failed serializing unknown object.", e3);
            c5142l1.d("[OBJECT]");
        }
    }

    public e(int i, boolean z) {
        switch (i) {
            case 5:
                this.a = new D(C5174u0.a);
                break;
            case 6:
            default:
                this.a = Executors.newSingleThreadScheduledExecutor(new A(1));
                break;
            case 7:
                Looper mainLooper = Looper.getMainLooper();
                O90.e(mainLooper, "getMainLooper()");
                this.a = new Handler(mainLooper);
                break;
            case 8:
                this.a = new io.sentry.util.c(new C(6));
                break;
            case 9:
                this.a = new io.sentry.transport.n();
                break;
        }
    }

    public e(int i) {
        this.a = new C1204Pf(i);
    }

    public e(HashMap map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.a = arrayDeque;
        arrayDeque.addLast(map);
    }

    @Override // io.sentry.A0
    public A0 n() {
        return this;
    }

    @Override // io.sentry.A0
    public void f(boolean z) {
    }
}

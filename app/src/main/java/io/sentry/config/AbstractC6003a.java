package io.sentry.config;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.AbstractC5811V0;
import io.sentry.C5759D1;
import io.sentry.C5771H1;
import io.sentry.C6012e;
import io.sentry.C6055k0;
import io.sentry.C6059l1;
import io.sentry.C6193y;
import io.sentry.EnumC5768G1;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.android.core.C5837I;
import io.sentry.android.replay.AbstractC5923A;
import io.sentry.android.replay.C5961u;
import io.sentry.android.replay.RunnableC5958r;
import io.sentry.android.replay.viewhierarchy.AbstractC5970a;
import io.sentry.android.replay.viewhierarchy.AbstractC5974e;
import io.sentry.clientreport.C5997a;
import io.sentry.hints.InterfaceC6027b;
import io.sentry.hints.InterfaceC6029d;
import io.sentry.protocol.C6081D;
import io.sentry.protocol.C6082E;
import io.sentry.protocol.C6088d;
import io.sentry.protocol.C6098n;
import io.sentry.protocol.C6102r;
import io.sentry.protocol.C6104t;
import io.sentry.vendor.AbstractC6182a;
import io.sentry.vendor.gson.internal.bind.util.AbstractC6183a;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p000.AbstractC7222ym;
import p000.AbstractC9426ft1;
import p000.D51;
import p000.O90;

/* renamed from: io.sentry.config.a */
/* loaded from: classes2.dex */
public abstract class AbstractC6003a {
    /* renamed from: A */
    public static ConcurrentHashMap m21732A(Map map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    /* renamed from: B */
    public static byte[] m21733B(long j, String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            throw new IOException(AbstractC7222ym.m26234k("File '", file.getName(), "' doesn't exists"));
        }
        if (!file.isFile()) {
            throw new IOException(AbstractC7222ym.m26234k("Reading path ", str, " failed, because it's not a file."));
        }
        if (!file.canRead()) {
            throw new IOException(AbstractC7222ym.m26234k("Reading the item ", str, " failed, because can't read the file."));
        }
        if (file.length() > j) {
            throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j)));
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = bufferedInputStream.read(bArr);
                        if (i == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            bufferedInputStream.close();
                            fileInputStream.close();
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: C */
    public static String m21734C(File file) throws IOException {
        if (file == null || !file.exists() || !file.isFile() || !file.canRead()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line);
            }
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append("\n");
                sb.append(line2);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: D */
    public static void m21735D(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: E */
    public static void m21736E(AbstractC5811V0 abstractC5811V0, InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        if (abstractC5811V0.f33416a != null) {
            interfaceC5749A0.mo13828u("event_id").mo13825r(iLogger, abstractC5811V0.f33416a);
        }
        interfaceC5749A0.mo13828u("contexts").mo13825r(iLogger, abstractC5811V0.f33417b);
        if (abstractC5811V0.f33418c != null) {
            interfaceC5749A0.mo13828u("sdk").mo13825r(iLogger, abstractC5811V0.f33418c);
        }
        if (abstractC5811V0.f33419d != null) {
            interfaceC5749A0.mo13828u("request").mo13825r(iLogger, abstractC5811V0.f33419d);
        }
        AbstractMap abstractMap = abstractC5811V0.f33420e;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            interfaceC5749A0.mo13828u("tags").mo13825r(iLogger, abstractC5811V0.f33420e);
        }
        if (abstractC5811V0.f33421f != null) {
            interfaceC5749A0.mo13828u("release").mo13811d(abstractC5811V0.f33421f);
        }
        if (abstractC5811V0.f33422g != null) {
            interfaceC5749A0.mo13828u("environment").mo13811d(abstractC5811V0.f33422g);
        }
        if (abstractC5811V0.f33423h != null) {
            interfaceC5749A0.mo13828u("platform").mo13811d(abstractC5811V0.f33423h);
        }
        if (abstractC5811V0.f33424i != null) {
            interfaceC5749A0.mo13828u("user").mo13825r(iLogger, abstractC5811V0.f33424i);
        }
        if (abstractC5811V0.f33426k != null) {
            interfaceC5749A0.mo13828u("server_name").mo13811d(abstractC5811V0.f33426k);
        }
        if (abstractC5811V0.f33427l != null) {
            interfaceC5749A0.mo13828u("dist").mo13811d(abstractC5811V0.f33427l);
        }
        List list = abstractC5811V0.f33428m;
        if (list != null && !list.isEmpty()) {
            interfaceC5749A0.mo13828u("breadcrumbs").mo13825r(iLogger, abstractC5811V0.f33428m);
        }
        if (abstractC5811V0.f33429n != null) {
            interfaceC5749A0.mo13828u("debug_meta").mo13825r(iLogger, abstractC5811V0.f33429n);
        }
        AbstractMap abstractMap2 = abstractC5811V0.f33430o;
        if (abstractMap2 == null || abstractMap2.isEmpty()) {
            return;
        }
        interfaceC5749A0.mo13828u("extra").mo13825r(iLogger, abstractC5811V0.f33430o);
    }

    /* renamed from: F */
    public static boolean m21737F(C6193y c6193y) {
        return !(InterfaceC6029d.class.isInstance(m21758r(c6193y)) || InterfaceC6027b.class.isInstance(m21758r(c6193y))) || C5837I.class.isInstance(m21758r(c6193y));
    }

    /* renamed from: G */
    public static final void m21738G(ExecutorService executorService, C5759D1 c5759d1, String str, Runnable runnable) {
        O90.m5968f(c5759d1, "options");
        O90.m5968f(str, "taskName");
        String name = Thread.currentThread().getName();
        O90.m5967e(name, "currentThread().name");
        if (D51.m1556o(name, "SentryReplayIntegration", false)) {
            runnable.run();
            return;
        }
        try {
            executorService.submit(new RunnableC5958r(runnable, c5759d1, str, 1));
        } catch (Throwable th) {
            c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, AbstractC7222ym.m26234k("Failed to submit task ", str, " to executor"), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x00a4  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m21739H(android.app.Activity r15, io.sentry.util.thread.InterfaceC6176a r16, io.sentry.ILogger r17, io.sentry.android.core.C5832D r18) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.config.AbstractC6003a.m21739H(android.app.Activity, io.sentry.util.thread.a, io.sentry.ILogger, io.sentry.android.core.D):byte[]");
    }

    /* renamed from: I */
    public static final int m21740I(int i) {
        return i | (-16777216);
    }

    /* renamed from: J */
    public static final void m21741J(View view, AbstractC5974e abstractC5974e, C5759D1 c5759d1) {
        if ((view instanceof ViewGroup) && !AbstractC5970a.m21684b(view, abstractC5974e, c5759d1)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    AbstractC5974e abstractC5974eM21750i = m21750i(childAt, abstractC5974e, viewGroup.indexOfChild(childAt), c5759d1);
                    arrayList.add(abstractC5974eM21750i);
                    m21741J(childAt, abstractC5974eM21750i, c5759d1);
                }
            }
            abstractC5974e.f34065f = arrayList;
        }
    }

    /* renamed from: a */
    public static void m21742a(String str) {
        C6059l1.m21830v().m21831l(str);
    }

    /* renamed from: b */
    public static C6193y m21743b(Object obj) {
        C6193y c6193y = new C6193y();
        c6193y.m21928c(obj, "sentry:typeCheckHint");
        return c6193y;
    }

    /* renamed from: c */
    public static boolean m21744c(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            if (!m21744c(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    /* renamed from: d */
    public static boolean m21745d(AbstractC5811V0 abstractC5811V0, String str, C6055k0 c6055k0, ILogger iLogger) {
        switch (str) {
            case "debug_meta":
                abstractC5811V0.f33429n = (C6088d) c6055k0.m21818n0(iLogger, new C5997a(8));
                return true;
            case "server_name":
                abstractC5811V0.f33426k = c6055k0.m21822p0();
                return true;
            case "contexts":
                abstractC5811V0.f33417b.putAll(C5997a.m21720c(c6055k0, iLogger));
                return true;
            case "environment":
                abstractC5811V0.f33422g = c6055k0.m21822p0();
                return true;
            case "breadcrumbs":
                abstractC5811V0.f33428m = c6055k0.m21808W(iLogger, new C6012e(0));
                return true;
            case "sdk":
                abstractC5811V0.f33418c = (C6102r) c6055k0.m21818n0(iLogger, new C5997a(20));
                return true;
            case "dist":
                abstractC5811V0.f33427l = c6055k0.m21822p0();
                return true;
            case "tags":
                abstractC5811V0.f33420e = m21732A((Map) c6055k0.m21816m0());
                return true;
            case "user":
                abstractC5811V0.f33424i = (C6082E) c6055k0.m21818n0(iLogger, new C6081D(0));
                return true;
            case "extra":
                abstractC5811V0.f33430o = m21732A((Map) c6055k0.m21816m0());
                return true;
            case "event_id":
                abstractC5811V0.f33416a = (C6104t) c6055k0.m21818n0(iLogger, new C5997a(22));
                return true;
            case "release":
                abstractC5811V0.f33421f = c6055k0.m21822p0();
                return true;
            case "request":
                abstractC5811V0.f33419d = (C6098n) c6055k0.m21818n0(iLogger, new C5997a(18));
                return true;
            case "platform":
                abstractC5811V0.f33423h = c6055k0.m21822p0();
                return true;
            default:
                return false;
        }
    }

    /* renamed from: e */
    public static byte[] m21746e(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = AbstractC6182a.f34679b;
        int i = (length / 3) * 4;
        int i2 = length % 3;
        if (i2 == 1) {
            i += 2;
        } else if (i2 == 2) {
            i += 3;
        }
        byte[] bArr3 = new byte[i];
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            int i6 = i3 + 3;
            if (i6 > length) {
                break;
            }
            int i7 = (bArr[i3 + 2] & 255) | ((bArr[i3] & 255) << 16) | ((bArr[i3 + 1] & 255) << 8);
            bArr3[i5] = bArr2[(i7 >> 18) & 63];
            bArr3[i5 + 1] = bArr2[(i7 >> 12) & 63];
            bArr3[i5 + 2] = bArr2[(i7 >> 6) & 63];
            bArr3[i5 + 3] = bArr2[i7 & 63];
            int i8 = i5 + 4;
            i4--;
            if (i4 == 0) {
                i5 += 5;
                bArr3[i8] = 10;
                i4 = 19;
            } else {
                i5 = i8;
            }
            i3 = i6;
        }
        if (i3 == length - 1) {
            int i9 = (bArr[i3] & 255) << 4;
            bArr3[i5] = bArr2[(i9 >> 6) & 63];
            bArr3[i5 + 1] = bArr2[i9 & 63];
        } else if (i3 == length - 2) {
            int i10 = ((bArr[i3 + 1] & 255) << 2) | ((bArr[i3] & 255) << 10);
            bArr3[i5] = bArr2[(i10 >> 12) & 63];
            bArr3[i5 + 1] = bArr2[(i10 >> 6) & 63];
            bArr3[i5 + 2] = bArr2[i10 & 63];
        }
        return bArr3;
    }

    /* renamed from: f */
    public static boolean m21747f(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x00da  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.sentry.internal.gestures.C6044b m21748g(io.sentry.android.core.SentryAndroidOptions r14, android.view.View r15, float r16, float r17, io.sentry.internal.gestures.EnumC6043a r18) {
        /*
            r0 = r18
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r2 = r15
            r1.add(r15)
            r2 = 0
            r3 = r2
        Ld:
            int r4 = r1.size()
            if (r4 <= 0) goto Le5
            java.lang.Object r4 = r1.poll()
            android.view.View r4 = (android.view.View) r4
            java.lang.String r5 = "view is required"
            m21735D(r4, r5)
            boolean r5 = r4 instanceof android.view.ViewGroup
            r6 = 0
            if (r5 == 0) goto L37
            r5 = r4
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r7 = r6
        L27:
            int r8 = r5.getChildCount()
            if (r7 >= r8) goto L37
            android.view.View r8 = r5.getChildAt(r7)
            r1.add(r8)
            int r7 = r7 + 1
            goto L27
        L37:
            java.util.List r5 = r14.getGestureTargetLocators()
            java.util.Iterator r5 = r5.iterator()
        L3f:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Ld
            java.lang.Object r7 = r5.next()
            io.sentry.android.core.internal.gestures.a r7 = (io.sentry.android.core.internal.gestures.C5871a) r7
            r7.getClass()
            int[] r8 = r7.f33713b
            r4.getLocationOnScreen(r8)
            r9 = r8[r6]
            r10 = 1
            r8 = r8[r10]
            int r11 = r4.getWidth()
            int r12 = r4.getHeight()
            float r13 = (float) r9
            int r13 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r13 < 0) goto Lda
            int r9 = r9 + r11
            float r9 = (float) r9
            int r9 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r9 > 0) goto Lda
            float r9 = (float) r8
            int r9 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r9 < 0) goto Lda
            int r8 = r8 + r12
            float r8 = (float) r8
            int r8 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r8 > 0) goto Lda
            io.sentry.internal.gestures.a r8 = io.sentry.internal.gestures.EnumC6043a.CLICKABLE
            if (r0 != r8) goto L94
            boolean r8 = r4.isClickable()
            if (r8 == 0) goto L94
            int r8 = r4.getVisibility()
            if (r8 != 0) goto L94
            java.lang.String r7 = m21757p(r4)     // Catch: android.content.res.Resources.NotFoundException -> Lda
            java.lang.String r8 = m21751j(r4)     // Catch: android.content.res.Resources.NotFoundException -> Lda
            io.sentry.internal.gestures.b r9 = new io.sentry.internal.gestures.b     // Catch: android.content.res.Resources.NotFoundException -> Lda
            r9.<init>(r4, r8, r7)     // Catch: android.content.res.Resources.NotFoundException -> Lda
            goto Ldb
        L94:
            io.sentry.internal.gestures.a r8 = io.sentry.internal.gestures.EnumC6043a.SCROLLABLE
            if (r0 != r8) goto Lda
            boolean r7 = r7.f33712a
            if (r7 != 0) goto L9e
            r7 = r6
            goto La8
        L9e:
            java.lang.Class r7 = r4.getClass()
            java.lang.Class<androidx.core.view.ScrollingView> r8 = androidx.core.view.ScrollingView.class
            boolean r7 = r8.isAssignableFrom(r7)
        La8:
            if (r7 != 0) goto Lc2
            java.lang.Class r7 = r4.getClass()
            java.lang.Class<android.widget.AbsListView> r8 = android.widget.AbsListView.class
            boolean r7 = r8.isAssignableFrom(r7)
            if (r7 != 0) goto Lc2
            java.lang.Class r7 = r4.getClass()
            java.lang.Class<android.widget.ScrollView> r8 = android.widget.ScrollView.class
            boolean r7 = r8.isAssignableFrom(r7)
            if (r7 == 0) goto Lc9
        Lc2:
            int r7 = r4.getVisibility()
            if (r7 != 0) goto Lc9
            goto Lca
        Lc9:
            r10 = r6
        Lca:
            if (r10 == 0) goto Lda
            java.lang.String r7 = m21757p(r4)     // Catch: android.content.res.Resources.NotFoundException -> Lda
            java.lang.String r8 = m21751j(r4)     // Catch: android.content.res.Resources.NotFoundException -> Lda
            io.sentry.internal.gestures.b r9 = new io.sentry.internal.gestures.b     // Catch: android.content.res.Resources.NotFoundException -> Lda
            r9.<init>(r4, r8, r7)     // Catch: android.content.res.Resources.NotFoundException -> Lda
            goto Ldb
        Lda:
            r9 = r2
        Ldb:
            if (r9 == 0) goto L3f
            io.sentry.internal.gestures.a r3 = io.sentry.internal.gestures.EnumC6043a.CLICKABLE
            if (r0 != r3) goto Le4
            r3 = r9
            goto L3f
        Le4:
            return r9
        Le5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.config.AbstractC6003a.m21748g(io.sentry.android.core.SentryAndroidOptions, android.view.View, float, float, io.sentry.internal.gestures.a):io.sentry.internal.gestures.b");
    }

    /* renamed from: h */
    public static C5961u m21749h(Context context, C5771H1 c5771h1) {
        Rect rect;
        O90.m5968f(context, "context");
        Object systemService = context.getSystemService("window");
        O90.m5966d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        if (Build.VERSION.SDK_INT >= 30) {
            rect = windowManager.getCurrentWindowMetrics().getBounds();
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            rect = new Rect(0, 0, point.x, point.y);
        }
        O90.m5967e(rect, "if (VERSION.SDK_INT >= V…enBounds.y)\n            }");
        float fHeight = rect.height() / context.getResources().getDisplayMetrics().density;
        EnumC5768G1 enumC5768G1 = c5771h1.f33289g;
        int iM18304b = AbstractC9426ft1.m18304b(fHeight * enumC5768G1.sizeScale);
        int i = iM18304b % 16;
        Integer numValueOf = Integer.valueOf(i <= 8 ? iM18304b - i : iM18304b + (16 - i));
        int iM18304b2 = AbstractC9426ft1.m18304b((rect.width() / context.getResources().getDisplayMetrics().density) * enumC5768G1.sizeScale);
        int i2 = iM18304b2 % 16;
        Integer numValueOf2 = Integer.valueOf(i2 <= 8 ? iM18304b2 - i2 : iM18304b2 + (16 - i2));
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        return new C5961u(iIntValue2, iIntValue, iIntValue2 / rect.width(), iIntValue / rect.height(), c5771h1.f33290h, enumC5768G1.bitRate);
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0233  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.sentry.android.replay.viewhierarchy.AbstractC5974e m21750i(android.view.View r17, io.sentry.android.replay.viewhierarchy.AbstractC5974e r18, int r19, io.sentry.C5759D1 r20) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.config.AbstractC6003a.m21750i(android.view.View, io.sentry.android.replay.viewhierarchy.e, int, io.sentry.D1):io.sentry.android.replay.viewhierarchy.e");
    }

    /* renamed from: j */
    public static String m21751j(KeyEvent.Callback callback) {
        if (callback == null) {
            return null;
        }
        String canonicalName = callback.getClass().getCanonicalName();
        return canonicalName != null ? canonicalName : callback.getClass().getSimpleName();
    }

    /* renamed from: k */
    public static Date m21752k() {
        return Calendar.getInstance(AbstractC6183a.f34680a).getTime();
    }

    /* renamed from: l */
    public static Date m21753l(long j) {
        Calendar calendar = Calendar.getInstance(AbstractC6183a.f34680a);
        calendar.setTimeInMillis(j);
        return calendar.getTime();
    }

    /* renamed from: m */
    public static Date m21754m(String str) {
        try {
            return AbstractC6183a.m21891c(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException(AbstractC7222ym.m26245v("timestamp is not ISO format ", str));
        }
    }

    /* renamed from: n */
    public static Date m21755n(String str) {
        try {
            return m21753l(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(AbstractC7222ym.m26245v("timestamp is not millis format ", str));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* renamed from: o */
    public static final Window m21756o(View view) throws IllegalAccessException, IllegalArgumentException {
        Field field;
        O90.m5968f(view, "<this>");
        Object obj = AbstractC5923A.f33876a;
        View rootView = view.getRootView();
        O90.m5967e(rootView, "rootView");
        Class cls = (Class) AbstractC5923A.f33876a.getValue();
        if (cls == null || !cls.isInstance(rootView) || (field = (Field) AbstractC5923A.f33877b.getValue()) == null) {
            return null;
        }
        Object obj2 = field.get(rootView);
        O90.m5966d(obj2, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj2;
    }

    /* renamed from: p */
    public static String m21757p(View view) {
        int id = view.getId();
        if (id == -1 || (((-16777216) & id) == 0 && (16777215 & id) != 0)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id) : "";
    }

    /* renamed from: r */
    public static Object m21758r(C6193y c6193y) {
        Object obj;
        synchronized (c6193y) {
            obj = c6193y.f34739a.get("sentry:typeCheckHint");
        }
        return obj;
    }

    /* renamed from: s */
    public static String m21759s(Date date) {
        TimeZone timeZone = AbstractC6183a.f34680a;
        Locale locale = Locale.US;
        TimeZone timeZone2 = AbstractC6183a.f34680a;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone2, locale);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(23 + (timeZone2.getRawOffset() == 0 ? 1 : 6));
        AbstractC6183a.m21890b(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        AbstractC6183a.m21890b(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        AbstractC6183a.m21890b(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        AbstractC6183a.m21890b(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        AbstractC6183a.m21890b(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        AbstractC6183a.m21890b(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        AbstractC6183a.m21890b(sb, gregorianCalendar.get(14), 3);
        int offset = timeZone2.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / LocalNotification.Repeat.Time.ONE_MINUTE;
            int iAbs = Math.abs(i / 60);
            int iAbs2 = Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            AbstractC6183a.m21890b(sb, iAbs, 2);
            sb.append(':');
            AbstractC6183a.m21890b(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    /* renamed from: t */
    public static final void m21760t(ScheduledExecutorService scheduledExecutorService, C5759D1 c5759d1) {
        O90.m5968f(c5759d1, "options");
        synchronized (scheduledExecutorService) {
            if (!scheduledExecutorService.isShutdown()) {
                scheduledExecutorService.shutdown();
            }
            try {
                if (!scheduledExecutorService.awaitTermination(c5759d1.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                    scheduledExecutorService.shutdownNow();
                }
            } catch (InterruptedException unused) {
                scheduledExecutorService.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: u */
    public static boolean m21761u(Context context, String str) {
        m21735D(context, "The application context is required.");
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    /* renamed from: v */
    public static boolean m21762v(C6193y c6193y, Class cls) {
        return cls.isInstance(m21758r(c6193y));
    }

    /* renamed from: w */
    public static boolean m21763w(C6193y c6193y) {
        return Boolean.TRUE.equals(c6193y.m21927b(Boolean.class, "sentry:isFromHybridSdk"));
    }

    /* renamed from: y */
    public static boolean m21764y(Double d, boolean z) {
        return d == null ? z : !d.isNaN() && d.doubleValue() >= ConfigValue.DOUBLE_DEFAULT_VALUE && d.doubleValue() <= 1.0d;
    }

    /* renamed from: z */
    public static void m21765z(Class cls, Object obj, ILogger iLogger) {
        iLogger.mo21407k(EnumC6069n1.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }

    /* renamed from: q */
    public abstract int mo21766q();

    /* renamed from: x */
    public abstract boolean mo21767x();
}

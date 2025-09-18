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
import defpackage.AbstractC3857ft1;
import defpackage.AbstractC8235ym;
import defpackage.D51;
import defpackage.O90;
import io.sentry.A0;
import io.sentry.C5119e;
import io.sentry.C5138k0;
import io.sentry.C5142l1;
import io.sentry.C5185y;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.G1;
import io.sentry.H1;
import io.sentry.ILogger;
import io.sentry.V0;
import io.sentry.android.core.I;
import io.sentry.android.replay.A;
import io.sentry.android.replay.r;
import io.sentry.android.replay.u;
import io.sentry.protocol.C5158d;
import io.sentry.protocol.D;
import io.sentry.protocol.E;
import io.sentry.protocol.n;
import io.sentry.protocol.t;
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

/* loaded from: classes2.dex */
public abstract class a {
    public static ConcurrentHashMap A(Map map) {
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

    public static byte[] B(long j, String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            throw new IOException(AbstractC8235ym.k("File '", file.getName(), "' doesn't exists"));
        }
        if (!file.isFile()) {
            throw new IOException(AbstractC8235ym.k("Reading path ", str, " failed, because it's not a file."));
        }
        if (!file.canRead()) {
            throw new IOException(AbstractC8235ym.k("Reading the item ", str, " failed, because can't read the file."));
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

    public static String C(File file) throws IOException {
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

    public static void D(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void E(V0 v0, A0 a0, ILogger iLogger) {
        if (v0.a != null) {
            a0.u("event_id").r(iLogger, v0.a);
        }
        a0.u("contexts").r(iLogger, v0.b);
        if (v0.c != null) {
            a0.u("sdk").r(iLogger, v0.c);
        }
        if (v0.d != null) {
            a0.u("request").r(iLogger, v0.d);
        }
        AbstractMap abstractMap = v0.e;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            a0.u("tags").r(iLogger, v0.e);
        }
        if (v0.f != null) {
            a0.u("release").d(v0.f);
        }
        if (v0.g != null) {
            a0.u("environment").d(v0.g);
        }
        if (v0.h != null) {
            a0.u("platform").d(v0.h);
        }
        if (v0.i != null) {
            a0.u("user").r(iLogger, v0.i);
        }
        if (v0.k != null) {
            a0.u("server_name").d(v0.k);
        }
        if (v0.l != null) {
            a0.u("dist").d(v0.l);
        }
        List list = v0.m;
        if (list != null && !list.isEmpty()) {
            a0.u("breadcrumbs").r(iLogger, v0.m);
        }
        if (v0.n != null) {
            a0.u("debug_meta").r(iLogger, v0.n);
        }
        AbstractMap abstractMap2 = v0.o;
        if (abstractMap2 == null || abstractMap2.isEmpty()) {
            return;
        }
        a0.u("extra").r(iLogger, v0.o);
    }

    public static boolean F(C5185y c5185y) {
        return !(io.sentry.hints.d.class.isInstance(r(c5185y)) || io.sentry.hints.b.class.isInstance(r(c5185y))) || I.class.isInstance(r(c5185y));
    }

    public static final void G(ExecutorService executorService, D1 d1, String str, Runnable runnable) {
        O90.f(d1, "options");
        O90.f(str, "taskName");
        String name = Thread.currentThread().getName();
        O90.e(name, "currentThread().name");
        if (D51.o(name, "SentryReplayIntegration", false)) {
            runnable.run();
            return;
        }
        try {
            executorService.submit(new r(runnable, d1, str, 1));
        } catch (Throwable th) {
            d1.getLogger().d(EnumC5148n1.ERROR, AbstractC8235ym.k("Failed to submit task ", str, " to executor"), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] H(android.app.Activity r15, io.sentry.util.thread.a r16, io.sentry.ILogger r17, io.sentry.android.core.D r18) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.config.a.H(android.app.Activity, io.sentry.util.thread.a, io.sentry.ILogger, io.sentry.android.core.D):byte[]");
    }

    public static final int I(int i) {
        return i | (-16777216);
    }

    public static final void J(View view, io.sentry.android.replay.viewhierarchy.e eVar, D1 d1) {
        if ((view instanceof ViewGroup) && !io.sentry.android.replay.viewhierarchy.a.b(view, eVar, d1)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    io.sentry.android.replay.viewhierarchy.e eVarI = i(childAt, eVar, viewGroup.indexOfChild(childAt), d1);
                    arrayList.add(eVarI);
                    J(childAt, eVarI, d1);
                }
            }
            eVar.f = arrayList;
        }
    }

    public static void a(String str) {
        C5142l1.v().l(str);
    }

    public static C5185y b(Object obj) {
        C5185y c5185y = new C5185y();
        c5185y.c(obj, "sentry:typeCheckHint");
        return c5185y;
    }

    public static boolean c(File file) {
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
            if (!c(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    public static boolean d(V0 v0, String str, C5138k0 c5138k0, ILogger iLogger) {
        switch (str) {
            case "debug_meta":
                v0.n = (C5158d) c5138k0.n0(iLogger, new io.sentry.clientreport.a(8));
                return true;
            case "server_name":
                v0.k = c5138k0.p0();
                return true;
            case "contexts":
                v0.b.putAll(io.sentry.clientreport.a.c(c5138k0, iLogger));
                return true;
            case "environment":
                v0.g = c5138k0.p0();
                return true;
            case "breadcrumbs":
                v0.m = c5138k0.W(iLogger, new C5119e(0));
                return true;
            case "sdk":
                v0.c = (io.sentry.protocol.r) c5138k0.n0(iLogger, new io.sentry.clientreport.a(20));
                return true;
            case "dist":
                v0.l = c5138k0.p0();
                return true;
            case "tags":
                v0.e = A((Map) c5138k0.m0());
                return true;
            case "user":
                v0.i = (E) c5138k0.n0(iLogger, new D(0));
                return true;
            case "extra":
                v0.o = A((Map) c5138k0.m0());
                return true;
            case "event_id":
                v0.a = (t) c5138k0.n0(iLogger, new io.sentry.clientreport.a(22));
                return true;
            case "release":
                v0.f = c5138k0.p0();
                return true;
            case "request":
                v0.d = (n) c5138k0.n0(iLogger, new io.sentry.clientreport.a(18));
                return true;
            case "platform":
                v0.h = c5138k0.p0();
                return true;
            default:
                return false;
        }
    }

    public static byte[] e(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = io.sentry.vendor.a.b;
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

    public static boolean f(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.sentry.internal.gestures.b g(io.sentry.android.core.SentryAndroidOptions r14, android.view.View r15, float r16, float r17, io.sentry.internal.gestures.a r18) {
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
            D(r4, r5)
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
            io.sentry.android.core.internal.gestures.a r7 = (io.sentry.android.core.internal.gestures.a) r7
            r7.getClass()
            int[] r8 = r7.b
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
            io.sentry.internal.gestures.a r8 = io.sentry.internal.gestures.a.CLICKABLE
            if (r0 != r8) goto L94
            boolean r8 = r4.isClickable()
            if (r8 == 0) goto L94
            int r8 = r4.getVisibility()
            if (r8 != 0) goto L94
            java.lang.String r7 = p(r4)     // Catch: android.content.res.Resources.NotFoundException -> Lda
            java.lang.String r8 = j(r4)     // Catch: android.content.res.Resources.NotFoundException -> Lda
            io.sentry.internal.gestures.b r9 = new io.sentry.internal.gestures.b     // Catch: android.content.res.Resources.NotFoundException -> Lda
            r9.<init>(r4, r8, r7)     // Catch: android.content.res.Resources.NotFoundException -> Lda
            goto Ldb
        L94:
            io.sentry.internal.gestures.a r8 = io.sentry.internal.gestures.a.SCROLLABLE
            if (r0 != r8) goto Lda
            boolean r7 = r7.a
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
            java.lang.String r7 = p(r4)     // Catch: android.content.res.Resources.NotFoundException -> Lda
            java.lang.String r8 = j(r4)     // Catch: android.content.res.Resources.NotFoundException -> Lda
            io.sentry.internal.gestures.b r9 = new io.sentry.internal.gestures.b     // Catch: android.content.res.Resources.NotFoundException -> Lda
            r9.<init>(r4, r8, r7)     // Catch: android.content.res.Resources.NotFoundException -> Lda
            goto Ldb
        Lda:
            r9 = r2
        Ldb:
            if (r9 == 0) goto L3f
            io.sentry.internal.gestures.a r3 = io.sentry.internal.gestures.a.CLICKABLE
            if (r0 != r3) goto Le4
            r3 = r9
            goto L3f
        Le4:
            return r9
        Le5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.config.a.g(io.sentry.android.core.SentryAndroidOptions, android.view.View, float, float, io.sentry.internal.gestures.a):io.sentry.internal.gestures.b");
    }

    public static u h(Context context, H1 h1) {
        Rect rect;
        O90.f(context, "context");
        Object systemService = context.getSystemService("window");
        O90.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        if (Build.VERSION.SDK_INT >= 30) {
            rect = windowManager.getCurrentWindowMetrics().getBounds();
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            rect = new Rect(0, 0, point.x, point.y);
        }
        O90.e(rect, "if (VERSION.SDK_INT >= V…enBounds.y)\n            }");
        float fHeight = rect.height() / context.getResources().getDisplayMetrics().density;
        G1 g1 = h1.g;
        int iB = AbstractC3857ft1.b(fHeight * g1.sizeScale);
        int i = iB % 16;
        Integer numValueOf = Integer.valueOf(i <= 8 ? iB - i : iB + (16 - i));
        int iB2 = AbstractC3857ft1.b((rect.width() / context.getResources().getDisplayMetrics().density) * g1.sizeScale);
        int i2 = iB2 % 16;
        Integer numValueOf2 = Integer.valueOf(i2 <= 8 ? iB2 - i2 : iB2 + (16 - i2));
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        return new u(iIntValue2, iIntValue, iIntValue2 / rect.width(), iIntValue / rect.height(), h1.h, g1.bitRate);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.sentry.android.replay.viewhierarchy.e i(android.view.View r17, io.sentry.android.replay.viewhierarchy.e r18, int r19, io.sentry.D1 r20) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.config.a.i(android.view.View, io.sentry.android.replay.viewhierarchy.e, int, io.sentry.D1):io.sentry.android.replay.viewhierarchy.e");
    }

    public static String j(KeyEvent.Callback callback) {
        if (callback == null) {
            return null;
        }
        String canonicalName = callback.getClass().getCanonicalName();
        return canonicalName != null ? canonicalName : callback.getClass().getSimpleName();
    }

    public static Date k() {
        return Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.a).getTime();
    }

    public static Date l(long j) {
        Calendar calendar = Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.a);
        calendar.setTimeInMillis(j);
        return calendar.getTime();
    }

    public static Date m(String str) {
        try {
            return io.sentry.vendor.gson.internal.bind.util.a.c(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException(AbstractC8235ym.v("timestamp is not ISO format ", str));
        }
    }

    public static Date n(String str) {
        try {
            return l(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(AbstractC8235ym.v("timestamp is not millis format ", str));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    public static final Window o(View view) throws IllegalAccessException, IllegalArgumentException {
        Field field;
        O90.f(view, "<this>");
        Object obj = A.a;
        View rootView = view.getRootView();
        O90.e(rootView, "rootView");
        Class cls = (Class) A.a.getValue();
        if (cls == null || !cls.isInstance(rootView) || (field = (Field) A.b.getValue()) == null) {
            return null;
        }
        Object obj2 = field.get(rootView);
        O90.d(obj2, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj2;
    }

    public static String p(View view) {
        int id = view.getId();
        if (id == -1 || (((-16777216) & id) == 0 && (16777215 & id) != 0)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id) : "";
    }

    public static Object r(C5185y c5185y) {
        Object obj;
        synchronized (c5185y) {
            obj = c5185y.a.get("sentry:typeCheckHint");
        }
        return obj;
    }

    public static String s(Date date) {
        TimeZone timeZone = io.sentry.vendor.gson.internal.bind.util.a.a;
        Locale locale = Locale.US;
        TimeZone timeZone2 = io.sentry.vendor.gson.internal.bind.util.a.a;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone2, locale);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(23 + (timeZone2.getRawOffset() == 0 ? 1 : 6));
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(14), 3);
        int offset = timeZone2.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / LocalNotification.Repeat.Time.ONE_MINUTE;
            int iAbs = Math.abs(i / 60);
            int iAbs2 = Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            io.sentry.vendor.gson.internal.bind.util.a.b(sb, iAbs, 2);
            sb.append(':');
            io.sentry.vendor.gson.internal.bind.util.a.b(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    public static final void t(ScheduledExecutorService scheduledExecutorService, D1 d1) {
        O90.f(d1, "options");
        synchronized (scheduledExecutorService) {
            if (!scheduledExecutorService.isShutdown()) {
                scheduledExecutorService.shutdown();
            }
            try {
                if (!scheduledExecutorService.awaitTermination(d1.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                    scheduledExecutorService.shutdownNow();
                }
            } catch (InterruptedException unused) {
                scheduledExecutorService.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
    }

    public static boolean u(Context context, String str) {
        D(context, "The application context is required.");
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    public static boolean v(C5185y c5185y, Class cls) {
        return cls.isInstance(r(c5185y));
    }

    public static boolean w(C5185y c5185y) {
        return Boolean.TRUE.equals(c5185y.b(Boolean.class, "sentry:isFromHybridSdk"));
    }

    public static boolean y(Double d, boolean z) {
        return d == null ? z : !d.isNaN() && d.doubleValue() >= ConfigValue.DOUBLE_DEFAULT_VALUE && d.doubleValue() <= 1.0d;
    }

    public static void z(Class cls, Object obj, ILogger iLogger) {
        iLogger.k(EnumC5148n1.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }

    public abstract int q();

    public abstract boolean x();
}

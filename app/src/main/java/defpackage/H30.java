package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.JavascriptException;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import com.huawei.hms.rn.push.local.HmsLocalNotificationController;
import com.huawei.hms.rn.push.local.HmsLocalNotificationPicturesLoader;
import com.remoteconfig.RemoteConfigModule;
import com.rustorepush.RustorePushModule;
import com.rustorereview.RustoreReviewModule;
import com.swmansion.reanimated.ReanimatedModule;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.sentry.C5133i1;
import io.sentry.C5135j0;
import io.sentry.C5138k0;
import io.sentry.C5142l1;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.H1;
import io.sentry.InterfaceC5117d0;
import io.sentry.InterfaceC5178v1;
import io.sentry.L0;
import io.sentry.M0;
import io.sentry.R0;
import io.sentry.U;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.Y;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.D;
import io.sentry.android.core.NdkIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.T;
import io.sentry.android.core.internal.gestures.e;
import io.sentry.protocol.E;
import io.sentry.protocol.r;
import io.sentry.protocol.u;
import io.sentry.react.d;
import io.sentry.react.j;
import io.sentry.react.replay.a;
import io.sentry.react.replay.b;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import ru.rustore.sdk.remoteconfig.RemoteConfig;
import ru.rustore.sdk.review.model.ReviewInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class H30 implements HmsLocalNotificationPicturesLoader.Callback, InterfaceC0940Lv, InterfaceC4285i70, InterfaceC5281jH, InterfaceC1905Ye1, InterfaceC3489dy0, InterfaceC1651Uy, InterfaceC6741qw, InterfaceC7612vU0, InterfaceC1103Nx0, InterfaceC0443Fl, InterfaceC6021n9, InterfaceC8304z71, InterfaceC1415Rx0, InterfaceC5117d0, M0, InterfaceC5178v1, R0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ H30(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // io.sentry.R0
    public void a(D1 d1) {
        ReadableMap map;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) d1;
        d dVar = (d) this.b;
        dVar.getClass();
        T t = d.l;
        r sdkVersion = sentryAndroidOptions.getSdkVersion();
        if (sdkVersion == null) {
            sdkVersion = new r("sentry.java.android.react-native", "7.20.1");
        } else {
            sdkVersion.a = "sentry.java.android.react-native";
        }
        C5142l1.v().o("npm:@sentry/react-native", "6.7.0");
        sentryAndroidOptions.setSentryClientName(sdkVersion.a + "/" + sdkVersion.b);
        sentryAndroidOptions.setNativeSdkName("sentry.native.android.react-native");
        sentryAndroidOptions.setSdkVersion(sdkVersion);
        ReadableMap readableMap = (ReadableMap) this.c;
        if (readableMap.hasKey("debug") && readableMap.getBoolean("debug")) {
            sentryAndroidOptions.setDebug(true);
        }
        if (!readableMap.hasKey("dsn") || readableMap.getString("dsn") == null) {
            sentryAndroidOptions.setDsn("");
        } else {
            String string = readableMap.getString("dsn");
            t.k(EnumC5148n1.INFO, AbstractC8235ym.k("Starting with DSN: '", string, "'"), new Object[0]);
            sentryAndroidOptions.setDsn(string);
        }
        if (readableMap.hasKey("sampleRate")) {
            sentryAndroidOptions.setSampleRate(Double.valueOf(readableMap.getDouble("sampleRate")));
        }
        if (readableMap.hasKey("sendClientReports")) {
            sentryAndroidOptions.setSendClientReports(readableMap.getBoolean("sendClientReports"));
        }
        if (readableMap.hasKey("maxBreadcrumbs")) {
            sentryAndroidOptions.setMaxBreadcrumbs(readableMap.getInt("maxBreadcrumbs"));
        }
        if (readableMap.hasKey("maxCacheItems")) {
            sentryAndroidOptions.setMaxCacheItems(readableMap.getInt("maxCacheItems"));
        }
        if (readableMap.hasKey("environment") && readableMap.getString("environment") != null) {
            sentryAndroidOptions.setEnvironment(readableMap.getString("environment"));
        }
        if (readableMap.hasKey("release") && readableMap.getString("release") != null) {
            sentryAndroidOptions.setRelease(readableMap.getString("release"));
        }
        if (readableMap.hasKey("dist") && readableMap.getString("dist") != null) {
            sentryAndroidOptions.setDist(readableMap.getString("dist"));
        }
        if (readableMap.hasKey("enableAutoSessionTracking")) {
            sentryAndroidOptions.setEnableAutoSessionTracking(readableMap.getBoolean("enableAutoSessionTracking"));
        }
        if (readableMap.hasKey("sessionTrackingIntervalMillis")) {
            sentryAndroidOptions.setSessionTrackingIntervalMillis(readableMap.getInt("sessionTrackingIntervalMillis"));
        }
        if (readableMap.hasKey("shutdownTimeout")) {
            sentryAndroidOptions.setShutdownTimeoutMillis(readableMap.getInt("shutdownTimeout"));
        }
        if (readableMap.hasKey("enableNdkScopeSync")) {
            sentryAndroidOptions.setEnableScopeSync(readableMap.getBoolean("enableNdkScopeSync"));
        }
        if (readableMap.hasKey("attachStacktrace")) {
            sentryAndroidOptions.setAttachStacktrace(readableMap.getBoolean("attachStacktrace"));
        }
        if (readableMap.hasKey("attachThreads")) {
            sentryAndroidOptions.setAttachThreads(readableMap.getBoolean("attachThreads"));
        }
        if (readableMap.hasKey("attachScreenshot")) {
            sentryAndroidOptions.setAttachScreenshot(readableMap.getBoolean("attachScreenshot"));
        }
        if (readableMap.hasKey("attachViewHierarchy")) {
            sentryAndroidOptions.setAttachViewHierarchy(readableMap.getBoolean("attachViewHierarchy"));
        }
        if (readableMap.hasKey("sendDefaultPii")) {
            sentryAndroidOptions.setSendDefaultPii(readableMap.getBoolean("sendDefaultPii"));
        }
        if (readableMap.hasKey("maxQueueSize")) {
            sentryAndroidOptions.setMaxQueueSize(readableMap.getInt("maxQueueSize"));
        }
        if (readableMap.hasKey("enableNdk")) {
            sentryAndroidOptions.setEnableNdk(readableMap.getBoolean("enableNdk"));
        }
        if (readableMap.hasKey("spotlight")) {
            if (readableMap.getType("spotlight") == ReadableType.Boolean) {
                sentryAndroidOptions.setEnableSpotlight(readableMap.getBoolean("spotlight"));
                sentryAndroidOptions.setSpotlightConnectionUrl(readableMap.getString("defaultSidecarUrl"));
            } else if (readableMap.getType("spotlight") == ReadableType.String) {
                sentryAndroidOptions.setEnableSpotlight(true);
                sentryAndroidOptions.setSpotlightConnectionUrl(readableMap.getString("spotlight"));
            }
        }
        H1 h1 = new H1(false, new r("sentry.javascript.react-native", "6.7.0"));
        CopyOnWriteArraySet copyOnWriteArraySet = h1.c;
        String str = null;
        if (readableMap.hasKey("replaysSessionSampleRate") || readableMap.hasKey("replaysOnErrorSampleRate")) {
            h1.f(readableMap.hasKey("replaysSessionSampleRate") ? Double.valueOf(readableMap.getDouble("replaysSessionSampleRate")) : null);
            h1.e(readableMap.hasKey("replaysOnErrorSampleRate") ? Double.valueOf(readableMap.getDouble("replaysOnErrorSampleRate")) : null);
            if (readableMap.hasKey("mobileReplayOptions") && (map = readableMap.getMap("mobileReplayOptions")) != null) {
                h1.d(!map.hasKey("maskAllText") || map.getBoolean("maskAllText"));
                h1.c(!map.hasKey("maskAllImages") || map.getBoolean("maskAllImages"));
                if (!map.hasKey("maskAllVectors") || map.getBoolean("maskAllVectors")) {
                    copyOnWriteArraySet.add("com.horcrux.svg.SvgView");
                }
                String name = a.class.getName();
                copyOnWriteArraySet.add(name);
                h1.e = name;
                h1.f = b.class.getName();
            }
        }
        sentryAndroidOptions.setSessionReplay(h1);
        if (h1.a != null || h1.b != null) {
            sentryAndroidOptions.getReplayController().o(new j());
        }
        String string2 = readableMap.getString("dsn");
        if (string2 != null) {
            try {
                URI uri = new URI(string2);
                str = uri.getScheme() + "://" + uri.getHost();
            } catch (URISyntaxException unused) {
            }
        }
        sentryAndroidOptions.setBeforeBreadcrumb(new io.sentry.react.b(str, readableMap.getString("devServerUrl"), 2));
        sentryAndroidOptions.addIgnoredExceptionForType(JavascriptException.class);
        sentryAndroidOptions.setBeforeSend(new H30(dVar, 28, sentryAndroidOptions));
        if (readableMap.hasKey("enableNativeCrashHandling") && !readableMap.getBoolean("enableNativeCrashHandling")) {
            List<Y> integrations = sentryAndroidOptions.getIntegrations();
            for (Y y : integrations) {
                if ((y instanceof UncaughtExceptionHandlerIntegration) || (y instanceof AnrIntegration) || (y instanceof NdkIntegration)) {
                    integrations.remove(y);
                }
            }
        }
        t.k(EnumC5148n1.INFO, String.format("Native Integrations '%s'", sentryAndroidOptions.getIntegrations()), new Object[0]);
        D d = D.b;
        Activity currentActivity = dVar.a.getCurrentActivity();
        if (currentActivity != null) {
            WeakReference weakReference = (WeakReference) d.a;
            if (weakReference == null || weakReference.get() != currentActivity) {
                d.a = new WeakReference(currentActivity);
            }
        }
    }

    @Override // defpackage.InterfaceC7612vU0
    /* renamed from: apply */
    public Object mo3apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C7992xU0 c7992xU0 = (C7992xU0) this.b;
        C0263Dd c0263Dd = c7992xU0.d;
        int i = c0263Dd.b;
        C1513Te c1513Te = (C1513Te) this.c;
        ArrayList arrayListP = c7992xU0.p(sQLiteDatabase, c1513Te, i);
        for (EnumC7370uD0 enumC7370uD0 : EnumC7370uD0.values()) {
            if (enumC7370uD0 != c1513Te.c) {
                int size = c0263Dd.b - arrayListP.size();
                if (size <= 0) {
                    break;
                }
                arrayListP.addAll(c7992xU0.p(sQLiteDatabase, c1513Te.b(enumC7370uD0), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < arrayListP.size(); i2++) {
            sb.append(((C4383ie) arrayListP.get(i2)).a);
            if (i2 < arrayListP.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new C7802wU0(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListP.listIterator();
        while (listIterator.hasNext()) {
            C4383ie c4383ie = (C4383ie) listIterator.next();
            if (map.containsKey(Long.valueOf(c4383ie.a))) {
                C0107Bd c0107BdC = c4383ie.c.c();
                long j2 = c4383ie.a;
                for (C7802wU0 c7802wU0 : (Set) map.get(Long.valueOf(j2))) {
                    c0107BdC.a(c7802wU0.a, c7802wU0.b);
                }
                listIterator.set(new C4383ie(j2, c4383ie.b, c0107BdC.b()));
            }
        }
        return arrayListP;
    }

    @Override // io.sentry.M0
    public void b(L0 l0) {
        switch (this.a) {
            case 23:
                ((AtomicReference) this.b).set(l0.b);
                ((AtomicReference) this.c).set(l0.r);
                return;
            case 26:
                e eVar = (e) this.b;
                U u = (U) this.c;
                eVar.getClass();
                synchronized (l0.m) {
                    if (l0.a == null) {
                        l0.f(u);
                    } else {
                        eVar.c.getLogger().k(EnumC5148n1.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", u.getName());
                    }
                }
                return;
            default:
                ReadableMap readableMap = (ReadableMap) this.b;
                ReadableMap readableMap2 = (ReadableMap) this.c;
                if (readableMap == null && readableMap2 == null) {
                    l0.g(null);
                    return;
                }
                E e = new E();
                if (readableMap != null) {
                    if (readableMap.hasKey(Scopes.EMAIL)) {
                        e.a = readableMap.getString(Scopes.EMAIL);
                    }
                    if (readableMap.hasKey(NotificationConstants.ID)) {
                        e.b = readableMap.getString(NotificationConstants.ID);
                    }
                    if (readableMap.hasKey("username")) {
                        e.c = readableMap.getString("username");
                    }
                    if (readableMap.hasKey("ip_address")) {
                        e.e = readableMap.getString("ip_address");
                    }
                    if (readableMap.hasKey("segment")) {
                        e.d = readableMap.getString("segment");
                    }
                }
                if (readableMap2 != null) {
                    HashMap map = new HashMap();
                    ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap2.keySetIterator();
                    while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                        String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                        String string = readableMap2.getString(strNextKey);
                        if (string != null) {
                            map.put(strNextKey, string);
                        }
                    }
                    e.h = io.sentry.config.a.A(map);
                }
                l0.g(e);
                return;
        }
    }

    @Override // defpackage.InterfaceC6741qw
    public void c(C0572Hc c0572Hc) {
        C0468Ft0 c0468Ft0 = (C0468Ft0) ((G10) this.b).b;
        C1562Tu0 c1562Tu0 = (C1562Tu0) this.c;
        c0468Ft0.d(c0572Hc, AbstractC7209tN0.c(c1562Tu0, c0572Hc), AbstractC7209tN0.i(c1562Tu0, c0572Hc));
    }

    @Override // com.huawei.hms.rn.push.local.HmsLocalNotificationPicturesLoader.Callback
    public void call(Bitmap bitmap, Bitmap bitmap2, Promise promise) throws JSONException, NumberFormatException {
        ((HmsLocalNotificationController) this.b).lambda$localNotificationNow$0((Bundle) this.c, bitmap, bitmap2, promise);
    }

    @Override // io.sentry.InterfaceC5117d0
    public Object d() {
        C5138k0 c5138k0 = (C5138k0) this.c;
        ((C5135j0) this.b).getClass();
        try {
            try {
                return Integer.valueOf(((io.sentry.vendor.gson.stream.a) c5138k0.b).X());
            } catch (Exception unused) {
                return Long.valueOf(((io.sentry.vendor.gson.stream.a) c5138k0.b).b0());
            }
        } catch (Exception unused2) {
            return Double.valueOf(((io.sentry.vendor.gson.stream.a) c5138k0.b).W());
        }
    }

    public C5133i1 e(C5133i1 c5133i1) {
        ((d) this.b).getClass();
        r rVar = c5133i1.c;
        if (rVar != null) {
            String str = rVar.a;
            str.getClass();
            if (str.equals("sentry.java.android.react-native")) {
                c5133i1.a("event.origin", ConstantDeviceInfo.APP_PLATFORM);
                c5133i1.a("event.environment", "java");
            } else if (str.equals("sentry.native.android.react-native")) {
                c5133i1.a("event.origin", ConstantDeviceInfo.APP_PLATFORM);
                c5133i1.a("event.environment", "native");
            }
        }
        r sdkVersion = ((SentryAndroidOptions) this.c).getSdkVersion();
        r rVar2 = c5133i1.c;
        if (rVar2 != null && "sentry.javascript.react-native".equals(rVar2.a) && sdkVersion != null) {
            CopyOnWriteArraySet copyOnWriteArraySet = sdkVersion.c;
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = (CopyOnWriteArraySet) C5142l1.v().b;
            }
            Iterator it = new CopyOnWriteArrayList(copyOnWriteArraySet).iterator();
            while (it.hasNext()) {
                u uVar = (u) it.next();
                C5142l1.v().o(uVar.a, uVar.b);
            }
            CopyOnWriteArraySet copyOnWriteArraySet2 = sdkVersion.d;
            if (copyOnWriteArraySet2 == null) {
                copyOnWriteArraySet2 = (CopyOnWriteArraySet) C5142l1.v().a;
            }
            Iterator it2 = new CopyOnWriteArrayList(copyOnWriteArraySet2).iterator();
            while (it2.hasNext()) {
                C5142l1.v().l((String) it2.next());
            }
            c5133i1.c = rVar2;
        }
        return c5133i1;
    }

    @Override // defpackage.InterfaceC8304z71
    public Object execute() {
        switch (this.a) {
            case 16:
                C7992xU0 c7992xU0 = (C7992xU0) ((C1911Yg1) this.b).c;
                c7992xU0.getClass();
                Iterable iterable = (Iterable) this.c;
                if (iterable.iterator().hasNext()) {
                    c7992xU0.m().compileStatement("DELETE FROM events WHERE _id in " + C7992xU0.A(iterable)).execute();
                    break;
                }
                break;
            default:
                C1911Yg1 c1911Yg1 = (C1911Yg1) this.b;
                c1911Yg1.getClass();
                Iterator it = ((HashMap) this.c).entrySet().iterator();
                while (it.hasNext()) {
                    ((C7992xU0) c1911Yg1.i).w(((Integer) r2.getValue()).intValue(), EnumC5372jl0.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        return new C1510Td((String) this.b, ((InterfaceC8224yi0) this.c).a((Context) c1241Pr0.a(Context.class)));
    }

    @Override // defpackage.InterfaceC5281jH
    public void h(InterfaceC3739fG0 interfaceC3739fG0) {
        ((InterfaceC5281jH) this.b).h(interfaceC3739fG0);
        ((InterfaceC5281jH) this.c).h(interfaceC3739fG0);
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(C0365El c0365El) {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 13:
                Z61 z61 = (Z61) obj2;
                z61.getClass();
                ((AtomicReference) obj).set(c0365El);
                return "SurfaceRequest-surface-recreation(" + z61.hashCode() + ")";
            case 15:
                Q91 q91 = (Q91) obj2;
                q91.getClass();
                AbstractC0759Jm0.f("TextureViewImpl");
                Surface surface = (Surface) obj;
                q91.h.b(surface, QR1.a(), new WN0(3, c0365El));
                return "provideSurface[request=" + q91.h + " surface=" + surface + "]";
            case 18:
                ((C1371Ri1) obj2).getClass();
                C7433uY0 c7433uY0 = (C7433uY0) obj;
                ((C0858Kt0) c7433uY0.b.g).a.put("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(c0365El.hashCode()));
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                C1059Ni1 c1059Ni1 = new C1059Ni1(atomicBoolean, c0365El, c7433uY0);
                c0365El.a(new RunnableC1313Qp0(atomicBoolean, c7433uY0, c1059Ni1, 17), QR1.a());
                c7433uY0.b.b(c1059Ni1);
                return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(c0365El.hashCode()));
            default:
                C2226aw c2226aw = (C2226aw) obj2;
                c2226aw.getClass();
                ((ExecutorC5715lY0) c2226aw.d).execute(new RunnableC1313Qp0(c2226aw, c0365El, (C1198Pd) obj, 19));
                return "setZoomRatio";
        }
    }

    @Override // defpackage.InterfaceC1905Ye1
    public void i(C8260yu0 c8260yu0) {
        ((ReanimatedModule) this.b).lambda$willDispatchViewUpdates$5((ArrayList) this.c, c8260yu0);
    }

    @Override // defpackage.InterfaceC4285i70
    public void k(InterfaceC5252j70 interfaceC5252j70) {
        switch (this.a) {
            case 2:
                C3383dO1 c3383dO1 = (C3383dO1) this.b;
                c3383dO1.getClass();
                ((InterfaceC4285i70) this.c).k(c3383dO1);
                break;
            default:
                MU0 mu0 = (MU0) this.b;
                mu0.getClass();
                ((InterfaceC4285i70) this.c).k(mu0);
                break;
        }
    }

    @Override // defpackage.InterfaceC1103Nx0
    public void onComplete(Task task) {
        if (!task.k()) {
            task.h();
            return;
        }
        AbstractC4351iT0 abstractC4351iT0 = (AbstractC4351iT0) task.i();
        Activity currentActivity = ((ReactApplicationContext) this.b).getCurrentActivity();
        if (currentActivity != null) {
            C1296Qj1 c1296Qj1 = (C1296Qj1) this.c;
            C1026Mx1 c1026Mx1 = (C1026Mx1) abstractC4351iT0;
            if (c1026Mx1.b) {
                AbstractC3782fU1.e(null);
                return;
            }
            Intent intent = new Intent(currentActivity, (Class<?>) PlayCoreDialogWrapperActivity.class);
            intent.putExtra("confirmation_intent", c1026Mx1.a);
            intent.putExtra("window_flags", currentActivity.getWindow().getDecorView().getWindowSystemUiVisibility());
            intent.putExtra("result_receiver", new ResultReceiverC0287Dl((Handler) c1296Qj1.a, new S81()));
            currentActivity.startActivity(intent);
        }
    }

    @Override // defpackage.InterfaceC1415Rx0
    public void onFailure(Exception exc) {
        ((com.my.tracker.obfuscated.d) this.b).a((List) this.c, exc);
    }

    @Override // defpackage.InterfaceC3489dy0
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 5:
                RemoteConfigModule.getRemoteConfig$lambda$5((C3504e20) this.b, (Promise) this.c, (RemoteConfig) obj);
                break;
            case 8:
                RustorePushModule.checkPushAvailability$lambda$0((Promise) this.b, (RustorePushModule) this.c, (QS) obj);
                break;
            default:
                RustoreReviewModule.requestReviewFlow$lambda$0((RustoreReviewModule) this.b, (Promise) this.c, (ReviewInfo) obj);
                break;
        }
    }

    @Override // defpackage.InterfaceC1651Uy
    public Object then(Task task) {
        ES1 es1 = (ES1) this.b;
        String str = (String) this.c;
        synchronized (es1) {
            ((C7925x8) es1.c).remove(str);
        }
        return task;
    }

    @Override // defpackage.InterfaceC7612vU0
    /* renamed from: apply */
    public InterfaceFutureC0750Jj0 mo3apply(Object obj) {
        switch (this.a) {
            case 14:
                List list = (List) obj;
                ((E71) this.b).getClass();
                Objects.toString(list);
                AbstractC0759Jm0.f("SyncCaptureSessionBase");
                if (list.isEmpty()) {
                    return new F70(1, new IllegalArgumentException("Unable to open capture session without surfaces"));
                }
                if (list.contains(null)) {
                    return new F70(1, new C4123hH((AbstractC4314iH) ((ArrayList) this.c).get(list.indexOf(null)), "Surface closed"));
                }
                return AbstractC1500Sz1.g(list);
            default:
                C0990Ml1 c0990Ml1 = (C0990Ml1) this.b;
                c0990Ml1.getClass();
                ArrayList arrayList = (ArrayList) this.c;
                Object objW = 100;
                try {
                    objW = ((C1702Vp) arrayList.get(0)).b.w(C1702Vp.j);
                } catch (IllegalArgumentException unused) {
                }
                Integer num = (Integer) objW;
                Objects.requireNonNull(num);
                int iIntValue = num.intValue();
                Object objW2 = 0;
                try {
                    objW2 = ((C1702Vp) arrayList.get(0)).b.w(C1702Vp.i);
                } catch (IllegalArgumentException unused2) {
                }
                Integer num2 = (Integer) objW2;
                Objects.requireNonNull(num2);
                int iIntValue2 = num2.intValue();
                C1857Xo1 c1857Xo1 = ((C5438k51) c0990Ml1.c.b).s;
                if (c1857Xo1 != null) {
                    return AbstractC1500Sz1.l(AbstractC8171yQ1.b(new C7563vE((JG) c1857Xo1.b, iIntValue, iIntValue2)));
                }
                return new F70(1, new Exception("Failed to take picture: pipeline is not ready."));
        }
    }
}

package p000;

import android.os.Parcelable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.p019vk.push.common.AppInfo;
import com.p019vk.push.core.analytics.ExtensionsKt;
import com.p019vk.push.core.auth.Auth;
import com.p019vk.push.core.auth.AuthTokenResult;
import com.p019vk.push.core.auth.AuthorizedResult;
import com.p019vk.push.core.base.AidlResult;
import com.p019vk.push.core.base.AsyncCallback;
import com.p019vk.push.core.hostinfo.MasterElections;
import com.p019vk.push.core.masterhost.MasterHost;
import com.p019vk.push.core.push.RegisterForPushesResult;
import com.p019vk.push.core.test.SendTestPushResult;
import com.p019vk.push.core.test.TestPushProvider;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* renamed from: y */
/* loaded from: classes2.dex */
public final class C7173y extends AbstractC8418Vg0 implements Function2 {

    /* renamed from: e */
    public final /* synthetic */ int f45997e;

    /* renamed from: f */
    public static final C7173y f45976f = new C7173y(2, 0);

    /* renamed from: g */
    public static final C7173y f45977g = new C7173y(2, 1);

    /* renamed from: h */
    public static final C7173y f45978h = new C7173y(2, 2);

    /* renamed from: i */
    public static final C7173y f45979i = new C7173y(2, 3);

    /* renamed from: j */
    public static final C7173y f45980j = new C7173y(2, 4);

    /* renamed from: k */
    public static final C7173y f45981k = new C7173y(2, 5);

    /* renamed from: l */
    public static final C7173y f45982l = new C7173y(2, 6);

    /* renamed from: m */
    public static final C7173y f45983m = new C7173y(2, 7);

    /* renamed from: n */
    public static final C7173y f45984n = new C7173y(2, 8);

    /* renamed from: o */
    public static final C7173y f45985o = new C7173y(2, 9);

    /* renamed from: p */
    public static final C7173y f45986p = new C7173y(2, 10);

    /* renamed from: q */
    public static final C7173y f45987q = new C7173y(2, 11);

    /* renamed from: r */
    public static final C7173y f45988r = new C7173y(2, 12);

    /* renamed from: s */
    public static final C7173y f45989s = new C7173y(2, 13);

    /* renamed from: t */
    public static final C7173y f45990t = new C7173y(2, 14);

    /* renamed from: u */
    public static final C7173y f45991u = new C7173y(2, 15);

    /* renamed from: v */
    public static final C7173y f45992v = new C7173y(2, 16);

    /* renamed from: w */
    public static final C7173y f45993w = new C7173y(2, 17);

    /* renamed from: x */
    public static final C7173y f45994x = new C7173y(2, 18);

    /* renamed from: y */
    public static final C7173y f45995y = new C7173y(2, 19);

    /* renamed from: z */
    public static final C7173y f45996z = new C7173y(2, 20);

    /* renamed from: A */
    public static final C7173y f45968A = new C7173y(2, 21);

    /* renamed from: B */
    public static final C7173y f45969B = new C7173y(2, 22);

    /* renamed from: C */
    public static final C7173y f45970C = new C7173y(2, 23);

    /* renamed from: D */
    public static final C7173y f45971D = new C7173y(2, 24);

    /* renamed from: E */
    public static final C7173y f45972E = new C7173y(2, 25);

    /* renamed from: F */
    public static final C7173y f45973F = new C7173y(2, 26);

    /* renamed from: G */
    public static final C7173y f45974G = new C7173y(2, 27);

    /* renamed from: H */
    public static final C7173y f45975H = new C7173y(2, 28);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7173y(int i, int i2) {
        super(i);
        this.f45997e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C0812Mu c0812Mu;
        String str;
        String str2;
        switch (this.f45997e) {
            case 0:
                C0573J5 c0573j5 = (C0573J5) obj;
                C10315mq0 c10315mq0 = (C10315mq0) obj2;
                O90.m5968f(c0573j5, "$this$loadConstantFromProperty");
                O90.m5968f(c10315mq0, "it");
                return c0573j5.f5333c.get(c10315mq0);
            case 1:
                C0573J5 c0573j52 = (C0573J5) obj;
                C10315mq0 c10315mq02 = (C10315mq0) obj2;
                O90.m5968f(c0573j52, "$this$loadConstantFromProperty");
                O90.m5968f(c10315mq02, "it");
                return c0573j52.f5332b.get(c10315mq02);
            case 2:
                String str3 = (String) obj;
                InterfaceC7298zz interfaceC7298zz = (InterfaceC7298zz) obj2;
                O90.m5968f(str3, "acc");
                O90.m5968f(interfaceC7298zz, "element");
                if (str3.length() == 0) {
                    return interfaceC7298zz.toString();
                }
                return str3 + ", " + interfaceC7298zz;
            case 3:
                InterfaceC0125Bz interfaceC0125Bz = (InterfaceC0125Bz) obj;
                InterfaceC7298zz interfaceC7298zz2 = (InterfaceC7298zz) obj2;
                O90.m5968f(interfaceC0125Bz, "acc");
                O90.m5968f(interfaceC7298zz2, "element");
                InterfaceC0125Bz interfaceC0125BzMo935c = interfaceC0125Bz.mo935c(interfaceC7298zz2.getKey());
                C0591JN c0591jn = C0591JN.f5499a;
                if (interfaceC0125BzMo935c == c0591jn) {
                    return interfaceC7298zz2;
                }
                C7460Cv0 c7460Cv0 = C7460Cv0.f1753c;
                InterfaceC1634Zy interfaceC1634Zy = (InterfaceC1634Zy) interfaceC0125BzMo935c.mo937g(c7460Cv0);
                if (interfaceC1634Zy == null) {
                    c0812Mu = new C0812Mu(interfaceC7298zz2, interfaceC0125BzMo935c);
                } else {
                    InterfaceC0125Bz interfaceC0125BzMo935c2 = interfaceC0125BzMo935c.mo935c(c7460Cv0);
                    if (interfaceC0125BzMo935c2 == c0591jn) {
                        return new C0812Mu(interfaceC1634Zy, interfaceC7298zz2);
                    }
                    c0812Mu = new C0812Mu(interfaceC1634Zy, new C0812Mu(interfaceC7298zz2, interfaceC0125BzMo935c2));
                }
                return c0812Mu;
            case 4:
                return Boolean.FALSE;
            case 5:
                return Boolean.FALSE;
            case 6:
                O90.m5968f((Map) obj, "$this$null");
                return C8313Tf1.f11463a;
            case 7:
                O90.m5968f((Map) obj, "$this$null");
                O90.m5968f((Throwable) obj2, "it");
                return C8313Tf1.f11463a;
            case 8:
                Integer numM25588b = AbstractC7066wI.m25588b((C7003vI) obj, (C7003vI) obj2);
                return Integer.valueOf(numM25588b == null ? 0 : numM25588b.intValue());
            case 9:
                ReadableArray readableArray = (ReadableArray) obj;
                int iIntValue = ((Number) obj2).intValue();
                O90.m5968f(readableArray, "array");
                ReadableMap map = readableArray.getMap(iIntValue);
                if (map == null) {
                    throw new IllegalArgumentException("could not parse notation");
                }
                String string = map.getString("character");
                if (string == null) {
                    throw new IllegalArgumentException("character is required for notation");
                }
                char cM25358w = AbstractC11374v51.m25358w(string);
                String string2 = map.getString("characterSet");
                if (string2 == null) {
                    throw new IllegalArgumentException("characterSet is required for notation");
                }
                Boolean boolM9276a = YN1.m9276a(map, "isOptional");
                if (boolM9276a != null) {
                    return new C8396Uv0(cM25358w, string2, boolM9276a.booleanValue());
                }
                throw new IllegalArgumentException("isOptional is required for notation");
            case 10:
                ReadableArray readableArray2 = (ReadableArray) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                O90.m5968f(readableArray2, "array");
                ReadableMap map2 = readableArray2.getMap(iIntValue2);
                if (map2 == null) {
                    throw new IllegalArgumentException("could not parse notation");
                }
                String string3 = map2.getString("character");
                if (string3 == null) {
                    throw new IllegalArgumentException("character is required for notation");
                }
                char cM25358w2 = AbstractC11374v51.m25358w(string3);
                String string4 = map2.getString("characterSet");
                if (string4 == null) {
                    throw new IllegalArgumentException("characterSet is required for notation");
                }
                Boolean boolM9276a2 = YN1.m9276a(map2, "isOptional");
                if (boolM9276a2 != null) {
                    return new C8396Uv0(cM25358w2, string4, boolM9276a2.booleanValue());
                }
                throw new IllegalArgumentException("isOptional is required for notation");
            case 11:
                ReadableArray readableArray3 = (ReadableArray) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                O90.m5968f(readableArray3, "array");
                ReadableMap map3 = readableArray3.getMap(iIntValue3);
                if (map3 == null) {
                    throw new IllegalArgumentException("could not parse notation");
                }
                String string5 = map3.getString("character");
                if (string5 == null) {
                    throw new IllegalArgumentException("character is required for notation");
                }
                char cM25358w3 = AbstractC11374v51.m25358w(string5);
                String string6 = map3.getString("characterSet");
                if (string6 == null) {
                    throw new IllegalArgumentException("characterSet is required for notation");
                }
                Boolean boolM9276a3 = YN1.m9276a(map3, "isOptional");
                if (boolM9276a3 != null) {
                    return new C8396Uv0(cM25358w3, string6, boolM9276a3.booleanValue());
                }
                throw new IllegalArgumentException("isOptional is required for notation");
            case 12:
                ReadableArray readableArray4 = (ReadableArray) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                O90.m5968f(readableArray4, "array");
                String string7 = readableArray4.getString(iIntValue4);
                string7.getClass();
                return string7;
            case 13:
                AbstractC10979s11 abstractC10979s11 = (AbstractC10979s11) obj;
                Throwable cancellationException = (Throwable) obj2;
                O90.m5968f(abstractC10979s11, "msg");
                if (abstractC10979s11 instanceof C10851r11) {
                    C10851r11 c10851r11 = (C10851r11) abstractC10979s11;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    c10851r11.f41287b.m10800G(new C6519nv(cancellationException, false));
                }
                return C8313Tf1.f11463a;
            case 14:
                Map map4 = (Map) obj;
                String str4 = ((C8491Wq1) obj2).f13419a;
                O90.m5968f(map4, "$this$setResult");
                O90.m5968f(str4, "it");
                ExtensionsKt.setPushToken(map4, str4);
                return C8313Tf1.f11463a;
            case 15:
                MasterElections masterElections = (MasterElections) obj;
                AsyncCallback asyncCallback = (AsyncCallback) obj2;
                O90.m5968f(masterElections, "service");
                O90.m5968f(asyncCallback, "callback");
                masterElections.getMaster(asyncCallback);
                return C8313Tf1.f11463a;
            case 16:
                AidlResult aidlResult = (AidlResult) obj;
                O90.m5968f(aidlResult, "result");
                O90.m5968f((AppInfo) obj2, "<anonymous parameter 1>");
                Parcelable data = aidlResult.getData();
                O90.m5966d(data, "null cannot be cast to non-null type com.vk.push.core.masterhost.MasterHost");
                return new PS0(((MasterHost) data).getMaster());
            case 17:
                Map map5 = (Map) obj;
                C7503Dq1 c7503Dq1 = (C7503Dq1) obj2;
                O90.m5968f(map5, "$this$setResult");
                O90.m5968f(c7503Dq1, "it");
                map5.put("master_package_name", c7503Dq1.f2271a);
                ExtensionsKt.set((Map<String, String>) map5, "is_from_arbiter", c7503Dq1.f2272b);
                return C8313Tf1.f11463a;
            case 18:
                Map map6 = (Map) obj;
                Throwable th = (Throwable) obj2;
                O90.m5968f(map6, "$this$setResult");
                O90.m5968f(th, "failureReason");
                if (th instanceof AbstractC10702pr1) {
                    AbstractC10702pr1 abstractC10702pr1 = (AbstractC10702pr1) th;
                    if (abstractC10702pr1 instanceof C9806ir1) {
                        str = "master_not_saved";
                    } else if (abstractC10702pr1 instanceof C9934jr1) {
                        map6.put("installed_hosts", AbstractC7167xu.m25962H(((C9934jr1) th).f35429a, StringUtils.COMMA, null, null, null, 62));
                        str = "no_hosts_from_api_received";
                    } else if (abstractC10702pr1 instanceof C10062kr1) {
                        C10062kr1 c10062kr1 = (C10062kr1) th;
                        map6.put("master", c10062kr1.f36728a);
                        map6.put("installed_hosts", AbstractC7167xu.m25962H(c10062kr1.f36729b, StringUtils.COMMA, null, null, null, 62));
                        str = "no_master_in_hosts_list";
                    } else if (abstractC10702pr1 instanceof C10190lr1) {
                        str = "no_master_installed";
                    } else {
                        if (!(abstractC10702pr1 instanceof C10318mr1)) {
                            throw new C6838sg();
                        }
                        C10318mr1 c10318mr1 = (C10318mr1) th;
                        map6.put("arbiter", c10318mr1.f37968a);
                        Throwable th2 = c10318mr1.f37969b;
                        if (th2 != null) {
                            ExtensionsKt.setErrorMessage(map6, "arbiter_response", th2);
                        }
                        str = "no_response_from_arbiter";
                    }
                    map6.put("reason", str);
                }
                return C8313Tf1.f11463a;
            case 19:
                Auth auth = (Auth) obj;
                AsyncCallback asyncCallback2 = (AsyncCallback) obj2;
                O90.m5968f(auth, "service");
                O90.m5968f(asyncCallback2, "callback");
                auth.getIntermediateToken(asyncCallback2);
                return C8313Tf1.f11463a;
            case 20:
                AidlResult aidlResult2 = (AidlResult) obj;
                O90.m5968f(aidlResult2, "result");
                O90.m5968f((AppInfo) obj2, "<anonymous parameter 1>");
                Parcelable data2 = aidlResult2.getData();
                O90.m5966d(data2, "null cannot be cast to non-null type com.vk.push.core.auth.AuthTokenResult");
                return new PS0(((AuthTokenResult) data2).getToken());
            case 21:
                AidlResult aidlResult3 = (AidlResult) obj;
                AppInfo appInfo = (AppInfo) obj2;
                O90.m5968f(aidlResult3, "result");
                O90.m5968f(appInfo, "host");
                Parcelable data3 = aidlResult3.getData();
                O90.m5966d(data3, "null cannot be cast to non-null type com.vk.push.core.push.RegisterForPushesResult");
                return new PS0(new C11849yq1((RegisterForPushesResult) data3, appInfo));
            case 22:
                Auth auth2 = (Auth) obj;
                AsyncCallback asyncCallback3 = (AsyncCallback) obj2;
                O90.m5968f(auth2, "service");
                O90.m5968f(asyncCallback3, "callback");
                auth2.isUserAuthorized(asyncCallback3);
                return C8313Tf1.f11463a;
            case 23:
                AidlResult aidlResult4 = (AidlResult) obj;
                O90.m5968f(aidlResult4, "result");
                O90.m5968f((AppInfo) obj2, "<anonymous parameter 1>");
                Parcelable data4 = aidlResult4.getData();
                O90.m5966d(data4, "null cannot be cast to non-null type com.vk.push.core.auth.AuthorizedResult");
                return new PS0(Boolean.valueOf(((AuthorizedResult) data4).isAuthorized()));
            case 24:
                Map map7 = (Map) obj;
                C11849yq1 c11849yq1 = (C11849yq1) obj2;
                O90.m5968f(map7, "$this$setResult");
                O90.m5968f(c11849yq1, "it");
                map7.put("master_package_name", c11849yq1.f46508b.getPackageName());
                int i = AbstractC8443Vs1.f12843a[c11849yq1.f46507a.ordinal()];
                if (i == 1) {
                    str2 = "registered";
                } else {
                    if (i != 2) {
                        throw new C6838sg();
                    }
                    str2 = "already_registered";
                }
                map7.put("reason", str2);
                return C8313Tf1.f11463a;
            case 25:
                TestPushProvider testPushProvider = (TestPushProvider) obj;
                AsyncCallback asyncCallback4 = (AsyncCallback) obj2;
                O90.m5968f(testPushProvider, "service");
                O90.m5968f(asyncCallback4, "callback");
                testPushProvider.getIntermediateToken(asyncCallback4);
                return C8313Tf1.f11463a;
            case 26:
                AidlResult aidlResult5 = (AidlResult) obj;
                O90.m5968f(aidlResult5, "result");
                O90.m5968f((AppInfo) obj2, "<anonymous parameter 1>");
                Parcelable data5 = aidlResult5.getData();
                O90.m5966d(data5, "null cannot be cast to non-null type com.vk.push.core.auth.AuthTokenResult");
                return new PS0(((AuthTokenResult) data5).getToken());
            case 27:
                AidlResult aidlResult6 = (AidlResult) obj;
                AppInfo appInfo2 = (AppInfo) obj2;
                O90.m5968f(aidlResult6, "result");
                O90.m5968f(appInfo2, "host");
                Parcelable data6 = aidlResult6.getData();
                O90.m5966d(data6, "null cannot be cast to non-null type com.vk.push.core.push.RegisterForPushesResult");
                return new PS0(new C11849yq1((RegisterForPushesResult) data6, appInfo2));
            default:
                AidlResult aidlResult7 = (AidlResult) obj;
                O90.m5968f(aidlResult7, "result");
                O90.m5968f((AppInfo) obj2, "<anonymous parameter 1>");
                Parcelable data7 = aidlResult7.getData();
                O90.m5966d(data7, "null cannot be cast to non-null type com.vk.push.core.test.SendTestPushResult");
                return new PS0((SendTestPushResult) data7);
        }
    }
}

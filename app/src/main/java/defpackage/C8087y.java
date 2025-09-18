package defpackage;

import android.os.Parcelable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.vk.push.common.AppInfo;
import com.vk.push.core.analytics.ExtensionsKt;
import com.vk.push.core.auth.Auth;
import com.vk.push.core.auth.AuthTokenResult;
import com.vk.push.core.auth.AuthorizedResult;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.hostinfo.MasterElections;
import com.vk.push.core.masterhost.MasterHost;
import com.vk.push.core.push.RegisterForPushesResult;
import com.vk.push.core.test.SendTestPushResult;
import com.vk.push.core.test.TestPushProvider;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* renamed from: y */
/* loaded from: classes2.dex */
public final class C8087y extends AbstractC1676Vg0 implements Function2 {
    public final /* synthetic */ int e;
    public static final C8087y f = new C8087y(2, 0);
    public static final C8087y g = new C8087y(2, 1);
    public static final C8087y h = new C8087y(2, 2);
    public static final C8087y i = new C8087y(2, 3);
    public static final C8087y j = new C8087y(2, 4);
    public static final C8087y k = new C8087y(2, 5);
    public static final C8087y l = new C8087y(2, 6);
    public static final C8087y m = new C8087y(2, 7);
    public static final C8087y n = new C8087y(2, 8);
    public static final C8087y o = new C8087y(2, 9);
    public static final C8087y p = new C8087y(2, 10);
    public static final C8087y q = new C8087y(2, 11);
    public static final C8087y r = new C8087y(2, 12);
    public static final C8087y s = new C8087y(2, 13);
    public static final C8087y t = new C8087y(2, 14);
    public static final C8087y u = new C8087y(2, 15);
    public static final C8087y v = new C8087y(2, 16);
    public static final C8087y w = new C8087y(2, 17);
    public static final C8087y x = new C8087y(2, 18);
    public static final C8087y y = new C8087y(2, 19);
    public static final C8087y z = new C8087y(2, 20);
    public static final C8087y A = new C8087y(2, 21);
    public static final C8087y B = new C8087y(2, 22);
    public static final C8087y C = new C8087y(2, 23);
    public static final C8087y D = new C8087y(2, 24);
    public static final C8087y E = new C8087y(2, 25);
    public static final C8087y F = new C8087y(2, 26);
    public static final C8087y G = new C8087y(2, 27);
    public static final C8087y H = new C8087y(2, 28);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8087y(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1015Mu c1015Mu;
        String str;
        String str2;
        switch (this.e) {
            case 0:
                J5 j5 = (J5) obj;
                C5960mq0 c5960mq0 = (C5960mq0) obj2;
                O90.f(j5, "$this$loadConstantFromProperty");
                O90.f(c5960mq0, "it");
                return j5.c.get(c5960mq0);
            case 1:
                J5 j52 = (J5) obj;
                C5960mq0 c5960mq02 = (C5960mq0) obj2;
                O90.f(j52, "$this$loadConstantFromProperty");
                O90.f(c5960mq02, "it");
                return j52.b.get(c5960mq02);
            case 2:
                String str3 = (String) obj;
                InterfaceC8464zz interfaceC8464zz = (InterfaceC8464zz) obj2;
                O90.f(str3, "acc");
                O90.f(interfaceC8464zz, "element");
                if (str3.length() == 0) {
                    return interfaceC8464zz.toString();
                }
                return str3 + ", " + interfaceC8464zz;
            case 3:
                InterfaceC0173Bz interfaceC0173Bz = (InterfaceC0173Bz) obj;
                InterfaceC8464zz interfaceC8464zz2 = (InterfaceC8464zz) obj2;
                O90.f(interfaceC0173Bz, "acc");
                O90.f(interfaceC8464zz2, "element");
                InterfaceC0173Bz interfaceC0173BzC = interfaceC0173Bz.c(interfaceC8464zz2.getKey());
                JN jn = JN.a;
                if (interfaceC0173BzC == jn) {
                    return interfaceC8464zz2;
                }
                C0240Cv0 c0240Cv0 = C0240Cv0.c;
                InterfaceC2041Zy interfaceC2041Zy = (InterfaceC2041Zy) interfaceC0173BzC.g(c0240Cv0);
                if (interfaceC2041Zy == null) {
                    c1015Mu = new C1015Mu(interfaceC8464zz2, interfaceC0173BzC);
                } else {
                    InterfaceC0173Bz interfaceC0173BzC2 = interfaceC0173BzC.c(c0240Cv0);
                    if (interfaceC0173BzC2 == jn) {
                        return new C1015Mu(interfaceC2041Zy, interfaceC8464zz2);
                    }
                    c1015Mu = new C1015Mu(interfaceC2041Zy, new C1015Mu(interfaceC8464zz2, interfaceC0173BzC2));
                }
                return c1015Mu;
            case 4:
                return Boolean.FALSE;
            case 5:
                return Boolean.FALSE;
            case 6:
                O90.f((Map) obj, "$this$null");
                return C1518Tf1.a;
            case 7:
                O90.f((Map) obj, "$this$null");
                O90.f((Throwable) obj2, "it");
                return C1518Tf1.a;
            case 8:
                Integer numB = AbstractC7765wI.b((C7575vI) obj, (C7575vI) obj2);
                return Integer.valueOf(numB == null ? 0 : numB.intValue());
            case 9:
                ReadableArray readableArray = (ReadableArray) obj;
                int iIntValue = ((Number) obj2).intValue();
                O90.f(readableArray, "array");
                ReadableMap map = readableArray.getMap(iIntValue);
                if (map == null) {
                    throw new IllegalArgumentException("could not parse notation");
                }
                String string = map.getString("character");
                if (string == null) {
                    throw new IllegalArgumentException("character is required for notation");
                }
                char cW = AbstractC7538v51.w(string);
                String string2 = map.getString("characterSet");
                if (string2 == null) {
                    throw new IllegalArgumentException("characterSet is required for notation");
                }
                Boolean boolA = YN1.a(map, "isOptional");
                if (boolA != null) {
                    return new C1643Uv0(cW, string2, boolA.booleanValue());
                }
                throw new IllegalArgumentException("isOptional is required for notation");
            case 10:
                ReadableArray readableArray2 = (ReadableArray) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                O90.f(readableArray2, "array");
                ReadableMap map2 = readableArray2.getMap(iIntValue2);
                if (map2 == null) {
                    throw new IllegalArgumentException("could not parse notation");
                }
                String string3 = map2.getString("character");
                if (string3 == null) {
                    throw new IllegalArgumentException("character is required for notation");
                }
                char cW2 = AbstractC7538v51.w(string3);
                String string4 = map2.getString("characterSet");
                if (string4 == null) {
                    throw new IllegalArgumentException("characterSet is required for notation");
                }
                Boolean boolA2 = YN1.a(map2, "isOptional");
                if (boolA2 != null) {
                    return new C1643Uv0(cW2, string4, boolA2.booleanValue());
                }
                throw new IllegalArgumentException("isOptional is required for notation");
            case 11:
                ReadableArray readableArray3 = (ReadableArray) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                O90.f(readableArray3, "array");
                ReadableMap map3 = readableArray3.getMap(iIntValue3);
                if (map3 == null) {
                    throw new IllegalArgumentException("could not parse notation");
                }
                String string5 = map3.getString("character");
                if (string5 == null) {
                    throw new IllegalArgumentException("character is required for notation");
                }
                char cW3 = AbstractC7538v51.w(string5);
                String string6 = map3.getString("characterSet");
                if (string6 == null) {
                    throw new IllegalArgumentException("characterSet is required for notation");
                }
                Boolean boolA3 = YN1.a(map3, "isOptional");
                if (boolA3 != null) {
                    return new C1643Uv0(cW3, string6, boolA3.booleanValue());
                }
                throw new IllegalArgumentException("isOptional is required for notation");
            case 12:
                ReadableArray readableArray4 = (ReadableArray) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                O90.f(readableArray4, "array");
                String string7 = readableArray4.getString(iIntValue4);
                string7.getClass();
                return string7;
            case 13:
                AbstractC6950s11 abstractC6950s11 = (AbstractC6950s11) obj;
                Throwable cancellationException = (Throwable) obj2;
                O90.f(abstractC6950s11, "msg");
                if (abstractC6950s11 instanceof C6759r11) {
                    C6759r11 c6759r11 = (C6759r11) abstractC6950s11;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    c6759r11.b.G(new C6165nv(cancellationException, false));
                }
                return C1518Tf1.a;
            case 14:
                Map map4 = (Map) obj;
                String str4 = ((C1785Wq1) obj2).a;
                O90.f(map4, "$this$setResult");
                O90.f(str4, "it");
                ExtensionsKt.setPushToken(map4, str4);
                return C1518Tf1.a;
            case 15:
                MasterElections masterElections = (MasterElections) obj;
                AsyncCallback asyncCallback = (AsyncCallback) obj2;
                O90.f(masterElections, "service");
                O90.f(asyncCallback, "callback");
                masterElections.getMaster(asyncCallback);
                return C1518Tf1.a;
            case 16:
                AidlResult aidlResult = (AidlResult) obj;
                O90.f(aidlResult, "result");
                O90.f((AppInfo) obj2, "<anonymous parameter 1>");
                Parcelable data = aidlResult.getData();
                O90.d(data, "null cannot be cast to non-null type com.vk.push.core.masterhost.MasterHost");
                return new PS0(((MasterHost) data).getMaster());
            case 17:
                Map map5 = (Map) obj;
                C0304Dq1 c0304Dq1 = (C0304Dq1) obj2;
                O90.f(map5, "$this$setResult");
                O90.f(c0304Dq1, "it");
                map5.put("master_package_name", c0304Dq1.a);
                ExtensionsKt.set((Map<String, String>) map5, "is_from_arbiter", c0304Dq1.b);
                return C1518Tf1.a;
            case 18:
                Map map6 = (Map) obj;
                Throwable th = (Throwable) obj2;
                O90.f(map6, "$this$setResult");
                O90.f(th, "failureReason");
                if (th instanceof AbstractC6537pr1) {
                    AbstractC6537pr1 abstractC6537pr1 = (AbstractC6537pr1) th;
                    if (abstractC6537pr1 instanceof C5201ir1) {
                        str = "master_not_saved";
                    } else if (abstractC6537pr1 instanceof C5391jr1) {
                        map6.put("installed_hosts", AbstractC8069xu.H(((C5391jr1) th).a, StringUtils.COMMA, null, null, null, 62));
                        str = "no_hosts_from_api_received";
                    } else if (abstractC6537pr1 instanceof C5582kr1) {
                        C5582kr1 c5582kr1 = (C5582kr1) th;
                        map6.put("master", c5582kr1.a);
                        map6.put("installed_hosts", AbstractC8069xu.H(c5582kr1.b, StringUtils.COMMA, null, null, null, 62));
                        str = "no_master_in_hosts_list";
                    } else if (abstractC6537pr1 instanceof C5773lr1) {
                        str = "no_master_installed";
                    } else {
                        if (!(abstractC6537pr1 instanceof C5964mr1)) {
                            throw new C7074sg();
                        }
                        C5964mr1 c5964mr1 = (C5964mr1) th;
                        map6.put("arbiter", c5964mr1.a);
                        Throwable th2 = c5964mr1.b;
                        if (th2 != null) {
                            ExtensionsKt.setErrorMessage(map6, "arbiter_response", th2);
                        }
                        str = "no_response_from_arbiter";
                    }
                    map6.put("reason", str);
                }
                return C1518Tf1.a;
            case 19:
                Auth auth = (Auth) obj;
                AsyncCallback asyncCallback2 = (AsyncCallback) obj2;
                O90.f(auth, "service");
                O90.f(asyncCallback2, "callback");
                auth.getIntermediateToken(asyncCallback2);
                return C1518Tf1.a;
            case 20:
                AidlResult aidlResult2 = (AidlResult) obj;
                O90.f(aidlResult2, "result");
                O90.f((AppInfo) obj2, "<anonymous parameter 1>");
                Parcelable data2 = aidlResult2.getData();
                O90.d(data2, "null cannot be cast to non-null type com.vk.push.core.auth.AuthTokenResult");
                return new PS0(((AuthTokenResult) data2).getToken());
            case 21:
                AidlResult aidlResult3 = (AidlResult) obj;
                AppInfo appInfo = (AppInfo) obj2;
                O90.f(aidlResult3, "result");
                O90.f(appInfo, "host");
                Parcelable data3 = aidlResult3.getData();
                O90.d(data3, "null cannot be cast to non-null type com.vk.push.core.push.RegisterForPushesResult");
                return new PS0(new C8249yq1((RegisterForPushesResult) data3, appInfo));
            case 22:
                Auth auth2 = (Auth) obj;
                AsyncCallback asyncCallback3 = (AsyncCallback) obj2;
                O90.f(auth2, "service");
                O90.f(asyncCallback3, "callback");
                auth2.isUserAuthorized(asyncCallback3);
                return C1518Tf1.a;
            case 23:
                AidlResult aidlResult4 = (AidlResult) obj;
                O90.f(aidlResult4, "result");
                O90.f((AppInfo) obj2, "<anonymous parameter 1>");
                Parcelable data4 = aidlResult4.getData();
                O90.d(data4, "null cannot be cast to non-null type com.vk.push.core.auth.AuthorizedResult");
                return new PS0(Boolean.valueOf(((AuthorizedResult) data4).isAuthorized()));
            case 24:
                Map map7 = (Map) obj;
                C8249yq1 c8249yq1 = (C8249yq1) obj2;
                O90.f(map7, "$this$setResult");
                O90.f(c8249yq1, "it");
                map7.put("master_package_name", c8249yq1.b.getPackageName());
                int i2 = AbstractC1713Vs1.a[c8249yq1.a.ordinal()];
                if (i2 == 1) {
                    str2 = "registered";
                } else {
                    if (i2 != 2) {
                        throw new C7074sg();
                    }
                    str2 = "already_registered";
                }
                map7.put("reason", str2);
                return C1518Tf1.a;
            case 25:
                TestPushProvider testPushProvider = (TestPushProvider) obj;
                AsyncCallback asyncCallback4 = (AsyncCallback) obj2;
                O90.f(testPushProvider, "service");
                O90.f(asyncCallback4, "callback");
                testPushProvider.getIntermediateToken(asyncCallback4);
                return C1518Tf1.a;
            case 26:
                AidlResult aidlResult5 = (AidlResult) obj;
                O90.f(aidlResult5, "result");
                O90.f((AppInfo) obj2, "<anonymous parameter 1>");
                Parcelable data5 = aidlResult5.getData();
                O90.d(data5, "null cannot be cast to non-null type com.vk.push.core.auth.AuthTokenResult");
                return new PS0(((AuthTokenResult) data5).getToken());
            case 27:
                AidlResult aidlResult6 = (AidlResult) obj;
                AppInfo appInfo2 = (AppInfo) obj2;
                O90.f(aidlResult6, "result");
                O90.f(appInfo2, "host");
                Parcelable data6 = aidlResult6.getData();
                O90.d(data6, "null cannot be cast to non-null type com.vk.push.core.push.RegisterForPushesResult");
                return new PS0(new C8249yq1((RegisterForPushesResult) data6, appInfo2));
            default:
                AidlResult aidlResult7 = (AidlResult) obj;
                O90.f(aidlResult7, "result");
                O90.f((AppInfo) obj2, "<anonymous parameter 1>");
                Parcelable data7 = aidlResult7.getData();
                O90.d(data7, "null cannot be cast to non-null type com.vk.push.core.test.SendTestPushResult");
                return new PS0((SendTestPushResult) data7);
        }
    }
}

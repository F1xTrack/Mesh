package defpackage;

import android.app.Application;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.common.ads.PushAdsProvider;
import com.vk.push.common.clientid.ClientIdCallback;
import com.vk.push.core.ipc.RuStore;
import com.vk.push.core.remote.config.omicron.OmicronEnvironment;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fN */
/* loaded from: classes.dex */
public class C3759fN implements InterfaceC1162Or, InterfaceC0284Dk, InterfaceC1646Uw0, InterfaceC8368zT, OmicronEnvironment, InterfaceC3415dZ0, GZ0, InterfaceC1181Ox0, InterfaceC6053nJ1 {
    public static volatile boolean f;
    public final /* synthetic */ int a;
    public static final C3759fN b = new C3759fN(1);
    public static final C3759fN c = new C3759fN(2);
    public static final C3759fN d = new C3759fN(3);
    public static final C3759fN e = new C3759fN(4);
    public static final C3759fN g = new C3759fN(6);
    public static final C3759fN h = new C3759fN(7);

    public /* synthetic */ C3759fN(int i) {
        this.a = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static EnumC1608Uj1 m(String str) throws C6526po {
        if (str != null) {
            switch (str.hashCode()) {
                case -1348796151:
                    if (str.equals("cinematic-extended")) {
                        return EnumC1608Uj1.f;
                    }
                    break;
                case 109935:
                    if (str.equals("off")) {
                        return EnumC1608Uj1.c;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        return EnumC1608Uj1.c;
                    }
                    break;
                case 1312628413:
                    if (str.equals("standard")) {
                        return EnumC1608Uj1.d;
                    }
                    break;
                case 1598495741:
                    if (str.equals("cinematic")) {
                        return EnumC1608Uj1.e;
                    }
                    break;
            }
        }
        throw new C6526po("videoStabilizationMode", str);
    }

    public static void n(Application application, String str, C3738fG c3738fG, Map map, List list, boolean z, ClientIdCallback clientIdCallback, PushAdsProvider pushAdsProvider) {
        O90.f(c3738fG, "logger");
        if (f && !z) {
            Logger.DefaultImpls.warn$default(c3738fG, "RuStorePushClient already initialized", null, 2, null);
            return;
        }
        if (AbstractC7538v51.C(str)) {
            throw new IllegalStateException("projectId can't be empty");
        }
        C1020Mv1 c1020Mv1 = new C1020Mv1(application, str, clientIdCallback, c3738fG, null, null, RuStore.INSTANCE.getAppInfo(), list == null ? MN.a : list, z, AbstractC7209tN0.r(AbstractC2135aR1.a(map).b), pushAdsProvider);
        Object obj = map != null ? map.get("defaultProvider") : null;
        AppInfo appInfo = obj instanceof AppInfo ? (AppInfo) obj : null;
        Object obj2 = map != null ? map.get("stand") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (appInfo != null) {
            Logger.DefaultImpls.info$default(c3738fG, "Init RuStorePushClient with defaultProvider = " + appInfo, null, 2, null);
            c1020Mv1 = C1020Mv1.a(C1020Mv1.a(c1020Mv1, null, null, appInfo, null, 7935), null, null, null, AbstractC8259yu.e(appInfo), 7679);
        }
        C1020Mv1 c1020Mv1A = c1020Mv1;
        if (!O90.a(str2, "prod") && str2 != null) {
            Logger.DefaultImpls.info$default(c1020Mv1A.d, "Init RuStorePushClient with stand = ".concat(str2), null, 2, null);
            c1020Mv1A = C1020Mv1.a(C1020Mv1.a(c1020Mv1A, new C8455zw(str2), null, null, null, 8127), null, new VH(str2, 7), null, null, 8063);
        }
        synchronized (C0781Jt1.u) {
            try {
                if (!C0079At1.c() || c1020Mv1A.i) {
                    if (C0079At1.c()) {
                        C0781Jt1 c0781Jt1B = C0079At1.b();
                        AbstractC7625vY1.b(c0781Jt1B.s, null);
                        M22.a(c0781Jt1B.s.a);
                    }
                    C0781Jt1.v = new C0781Jt1(c1020Mv1A);
                    C0781Jt1 c0781Jt1B2 = C0079At1.b();
                    Logger logger = c0781Jt1B2.b;
                    C5792ly c5792ly = ((C5594kv1) c0781Jt1B2.i.getValue()).a;
                    Logger.DefaultImpls.info$default(logger, "Client SDK is initialized. Version: 6.9.1", null, 2, null);
                    C6167nv1 c6167nv1 = (C6167nv1) c0781Jt1B2.f.getValue();
                    ((Application) c6167nv1.a.a.a).registerActivityLifecycleCallbacks(new IS(1, new C7881wu1(2, c6167nv1, C6167nv1.class, "onActivityCreated", "onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V", 0)));
                    c0781Jt1B2.t = AbstractC3767fP1.b(c0781Jt1B2.s, null, new LH(c0781Jt1B2, null, 2), 3);
                } else {
                    Logger.DefaultImpls.warn$default(c1020Mv1A.d, "Client SDK has been already initialized", null, 2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f = true;
    }

    public static boolean p() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // defpackage.InterfaceC8368zT
    public Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.InterfaceC0284Dk
    public byte[] b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.InterfaceC1646Uw0
    public Object c() {
        return new C5939mj0(true, 1);
    }

    @Override // defpackage.InterfaceC8368zT
    public Object e(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    public void h(InterfaceC3762fO interfaceC3762fO) {
        interfaceC3762fO.a(C3961gQ1.class, C6810rH1.a);
        interfaceC3762fO.a(C7800wT1.class, C5489kM1.a);
        interfaceC3762fO.a(AbstractC4343iQ1.class, C7764wH1.a);
        interfaceC3762fO.a(AbstractC8171yQ1.class, EH1.a);
        interfaceC3762fO.a(AbstractC7028sQ1.class, AH1.a);
        interfaceC3762fO.a(AbstractC7601vQ1.class, HH1.a);
        interfaceC3762fO.a(EO1.class, C8328zF1.a);
        interfaceC3762fO.a(CO1.class, C7568vF1.a);
        interfaceC3762fO.a(CP1.class, RG1.a);
        interfaceC3762fO.a(AbstractC3970gT1.class, GL1.a);
        interfaceC3762fO.a(AbstractC8355zO1.class, C6995sF1.a);
        interfaceC3762fO.a(AbstractC7404uO1.class, C6232oF1.a);
        interfaceC3762fO.a(AbstractC2135aR1.class, C6241oI1.a);
        interfaceC3762fO.a(AbstractC8183yU1.class, C6807rG1.a);
        interfaceC3762fO.a(AbstractC7407uP1.class, EG1.a);
        interfaceC3762fO.a(AbstractC5689lP1.class, C6044nG1.a);
        interfaceC3762fO.a(AbstractC3392dR1.class, C7004sI1.a);
        interfaceC3762fO.a(AbstractC2141aT1.class, C7776wL1.a);
        interfaceC3762fO.a(AbstractC2522cT1.class, C8346zL1.a);
        interfaceC3762fO.a(WS1.class, C7013sL1.a);
        interfaceC3762fO.a(KQ1.class, WH1.a);
        interfaceC3762fO.a(AbstractC7803wU1.class, C4116hE1.a);
        interfaceC3762fO.a(NQ1.class, YH1.a);
        interfaceC3762fO.a(ER1.class, HI1.a);
        interfaceC3762fO.a(LR1.class, UI1.a);
        interfaceC3762fO.a(AbstractC4366iY0.class, OI1.a);
        interfaceC3762fO.a(HR1.class, LI1.a);
        interfaceC3762fO.a(AbstractC6653qS1.class, JJ1.a);
        interfaceC3762fO.a(AbstractC7225tS1.class, LJ1.a);
        interfaceC3762fO.a(AbstractC8367zS1.class, ZJ1.a);
        interfaceC3762fO.a(AbstractC7987xS1.class, VJ1.a);
        interfaceC3762fO.a(IQ1.class, TH1.a);
        interfaceC3762fO.a(DS1.class, C6819rK1.a);
        interfaceC3762fO.a(HS1.class, C7773wK1.a);
        interfaceC3762fO.a(KS1.class, C8343zK1.a);
        interfaceC3762fO.a(NS1.class, C3374dL1.a);
        interfaceC3762fO.a(US1.class, C4137hL1.a);
        interfaceC3762fO.a(QS1.class, C5868mL1.a);
        interfaceC3762fO.a(AbstractC5889mS1.class, C4131hJ1.a);
        interfaceC3762fO.a(TP1.class, C5474kH1.a);
        interfaceC3762fO.a(AbstractC3967gS1.class, AJ1.a);
        interfaceC3762fO.a(AbstractC3585eS1.class, C5671lJ1.a);
        interfaceC3762fO.a(AbstractC5507kS1.class, FJ1.a);
        interfaceC3762fO.a(AbstractC3588eT1.class, CL1.a);
        interfaceC3762fO.a(MT1.class, SM1.a);
        interfaceC3762fO.a(EN1.class, DE1.a);
        interfaceC3762fO.a(AbstractC7592vN1.class, AE1.a);
        interfaceC3762fO.a(AbstractC7210tN1.class, C8135yE1.a);
        interfaceC3762fO.a(AbstractC8352zN1.class, CE1.a);
        interfaceC3762fO.a(MN1.class, KE1.a);
        interfaceC3762fO.a(HN1.class, HE1.a);
        interfaceC3762fO.a(PN1.class, ME1.a);
        interfaceC3762fO.a(UN1.class, NE1.a);
        interfaceC3762fO.a(YN1.class, RE1.a);
        interfaceC3762fO.a(AbstractC2317bO1.class, TE1.a);
        interfaceC3762fO.a(AbstractC3573eO1.class, XE1.a);
        interfaceC3762fO.a(TB1.class, SD1.a);
        interfaceC3762fO.a(AbstractC2090aC1.class, ZD1.a);
        interfaceC3762fO.a(WB1.class, VD1.a);
        interfaceC3762fO.a(NP1.class, C3362dH1.a);
        interfaceC3762fO.a(HO1.class, EF1.a);
        interfaceC3762fO.a(AbstractC1500Sz1.class, C3919gC1.a);
        interfaceC3762fO.a(AbstractC1110Nz1.class, C5650lC1.a);
        interfaceC3762fO.a(AbstractC3958gP1.class, WF1.a);
        interfaceC3762fO.a(AbstractC3341dA1.class, C6414pC1.a);
        interfaceC3762fO.a(AbstractC1968Yz1.class, C6986sC1.a);
        interfaceC3762fO.a(AbstractC8123yA1.class, XC1.a);
        interfaceC3762fO.a(AbstractC7743wA1.class, C2284bD1.a);
        interfaceC3762fO.a(AbstractC6026nA1.class, C7368uC1.a);
        interfaceC3762fO.a(AbstractC4295iA1.class, C7939xC1.a);
        interfaceC3762fO.a(AbstractC4107hB1.class, C5653lD1.a);
        interfaceC3762fO.a(AbstractC3534eB1.class, C6035nD1.a);
        interfaceC3762fO.a(AbstractC7174tB1.class, C7180tD1.a);
        interfaceC3762fO.a(AbstractC6792rB1.class, C7562vD1.a);
        interfaceC3762fO.a(QB1.class, MD1.a);
        interfaceC3762fO.a(LB1.class, QD1.a);
        interfaceC3762fO.a(AbstractC8126yB1.class, C8322zD1.a);
        interfaceC3762fO.a(AbstractC7556vB1.class, AD1.a);
        interfaceC3762fO.a(GB1.class, ED1.a);
        interfaceC3762fO.a(CB1.class, HD1.a);
        interfaceC3762fO.a(AbstractC3782fU1.class, PL1.a);
        interfaceC3762fO.a(OT1.class, IF1.a);
        interfaceC3762fO.a(XT1.class, RH1.a);
        interfaceC3762fO.a(WT1.class, OH1.a);
        interfaceC3762fO.a(RT1.class, C7571vG1.a);
        interfaceC3762fO.a(AbstractC3401dU1.class, NL1.a);
        interfaceC3762fO.a(AbstractC2144aU1.class, JL1.a);
        interfaceC3762fO.a(AbstractC4355iU1.class, SL1.a);
        interfaceC3762fO.a(TT1.class, VG1.a);
        interfaceC3762fO.a(AbstractC7231tU1.class, ZM1.a);
        interfaceC3762fO.a(AbstractC6659qU1.class, C2504cN1.a);
        interfaceC3762fO.a(AbstractC5895mU1.class, VM1.a);
        interfaceC3762fO.a(AbstractC8259yu.class, ZL1.a);
        interfaceC3762fO.a(KP1.class, C2105aH1.a);
        interfaceC3762fO.a(YP1.class, C6238oH1.a);
        interfaceC3762fO.a(AbstractC6447pN1.class, C5656lE1.a);
        interfaceC3762fO.a(AbstractC7978xP1.class, IG1.a);
        interfaceC3762fO.a(QP1.class, C3934gH1.a);
        interfaceC3762fO.a(AbstractC5307jP1.class, C2102aG1.a);
        interfaceC3762fO.a(YO1.class, MF1.a);
        interfaceC3762fO.a(AbstractC2510cP1.class, PF1.a);
        interfaceC3762fO.a(UO1.class, KF1.a);
        interfaceC3762fO.a(AbstractC3767fP1.class, TF1.a);
        interfaceC3762fO.a(EQ1.class, MH1.a);
        interfaceC3762fO.a(BQ1.class, KH1.a);
        interfaceC3762fO.a(AbstractC0565Gz1.class, C3537eC1.a);
        interfaceC3762fO.a(GT1.class, BM1.a);
        interfaceC3762fO.a(KT1.class, IM1.a);
        interfaceC3762fO.a(HT1.class, CM1.a);
        interfaceC3762fO.a(AbstractC5683lN1.class, C2477cE1.a);
        interfaceC3762fO.a(AbstractC6831rO1.class, C5468kF1.a);
        interfaceC3762fO.a(AbstractC6259oO1.class, C3928gF1.a);
        interfaceC3762fO.a(AbstractC4146hO1.class, C2480cF1.a);
        interfaceC3762fO.a(RQ1.class, C5286jI1.a);
        interfaceC3762fO.a(YQ1.class, C6050nI1.a);
        interfaceC3762fO.a(WQ1.class, C5668lI1.a);
        interfaceC3762fO.a(AbstractC7362uA1.class, RC1.a);
        interfaceC3762fO.a(AbstractC6789rA1.class, TC1.a);
        interfaceC3762fO.a(AbstractC4346iR1.class, C7195tI1.a);
        interfaceC3762fO.a(AbstractC6459pR1.class, C8337zI1.a);
        interfaceC3762fO.a(AbstractC5504kR1.class, C7767wI1.a);
        interfaceC3762fO.a(AbstractC6268oR1.class, C7957xI1.a);
        interfaceC3762fO.a(TA1.class, C3350dD1.a);
        interfaceC3762fO.a(SA1.class, C3731fD1.a);
        interfaceC3762fO.a(AbstractC7728w51.class, C4140hM1.a);
        interfaceC3762fO.a(AbstractC5319jT1.class, C3567eM1.a);
        interfaceC3762fO.a(AT1.class, C6444pM1.a);
        interfaceC3762fO.a(DT1.class, C7589vM1.a);
        interfaceC3762fO.a(NR1.class, XI1.a);
        interfaceC3762fO.a(C5554ki0.class, C3558eJ1.a);
        interfaceC3762fO.a(QR1.class, YI1.a);
        interfaceC3762fO.a(AbstractC7627vZ0.class, C2111aJ1.a);
        interfaceC3762fO.a(AbstractC6220oB1.class, C6608qD1.a);
        interfaceC3762fO.a(AbstractC5647lB1.class, C6798rD1.a);
        interfaceC3762fO.a(AP1.class, MG1.a);
        interfaceC3762fO.a(AbstractC6262oP1.class, AG1.a);
        interfaceC3762fO.a(AbstractC6840rR1.class, AI1.a);
        interfaceC3762fO.a(AbstractC8364zR1.class, FI1.a);
        interfaceC3762fO.a(AbstractC7604vR1.class, CI1.a);
        interfaceC3762fO.a(AbstractC2278bB1.class, C4113hD1.a);
        interfaceC3762fO.a(XA1.class, C4304iD1.a);
    }

    @Override // defpackage.InterfaceC8368zT
    public void j(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    @Override // defpackage.GZ0
    public BZ0 k(OJ1 oj1, JSONObject jSONObject) throws JSONException {
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        C3547eG c3547eG = jSONObject.has("session") ? new C3547eG(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 6) : new C3547eG(new JSONObject().optInt("max_custom_exception_events", 8), 6);
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new BZ0(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (iOptInt * 1000) + System.currentTimeMillis(), c3547eG, new C5911ma(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), dOptDouble, dOptDouble2, iOptInt2);
    }

    public WritableArray l() {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        O90.e(writableArrayCreateArray, "createArray(...)");
        return writableArrayCreateArray;
    }

    @Override // com.vk.push.core.remote.config.omicron.OmicronEnvironment
    public String name() {
        return "DEV";
    }

    public boolean o(int i) {
        return 5 <= i;
    }

    @Override // defpackage.InterfaceC3415dZ0
    public /* synthetic */ void onCaptureProcessProgressed(int i) {
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 27:
                QY1.b.get();
                Boolean bool = (Boolean) VY1.a.a();
                bool.getClass();
                return bool;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.b.get();
                Long l = (Long) UW1.J.a();
                l.getClass();
                return l;
            default:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.k0.a()).longValue());
        }
    }

    public C3759fN(C1339Qy c1339Qy) {
        this.a = 25;
    }

    @Override // defpackage.InterfaceC3415dZ0
    public void d() {
    }

    @Override // defpackage.InterfaceC3415dZ0
    public void g() {
    }

    @Override // defpackage.InterfaceC3415dZ0
    public void i() {
    }

    @Override // defpackage.InterfaceC3415dZ0
    public void f(InterfaceC7668vn interfaceC7668vn) {
    }

    @Override // defpackage.InterfaceC1181Ox0
    public void onComplete(Throwable th) {
    }
}

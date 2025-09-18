package p000;

import android.content.Context;
import com.alexzunik.reactnativemoneyinput.ReactNativeMoneyInputModule;
import com.brentvatne.react.VideoDecoderInfoModule;
import com.brentvatne.react.VideoManagerModule;
import com.dieam.reactnativepushnotification.modules.RNPushNotification;
import com.facebook.react.bridge.ReactApplicationContext;
import com.github.douglasjunior.reactNativeGetLocation.modules.ReactNativeGetLocationModule;
import com.ninty.system.setting.SystemSetting;
import com.remoteconfig.RemoteConfigModule;
import com.rustorepush.RustorePushModule;
import com.rustorereview.RustoreReviewModule;
import com.statstracker.bridge.StatsTrackerModule;
import com.varioqub.reactnative.VarioqubModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.devio.p030rn.splashscreen.SplashScreenModule;

/* loaded from: classes.dex */
public final class ML0 implements ZL0 {

    /* renamed from: a */
    public final /* synthetic */ int f7099a;

    @Override // p000.ZL0
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        switch (this.f7099a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                arrayList.add(new ReactNativeGetLocationModule(reactApplicationContext));
                return arrayList;
            case 1:
                O90.m5968f(reactApplicationContext, "reactContext");
                return AbstractC7230yu.m26274e(new ReactNativeMoneyInputModule(reactApplicationContext));
            case 2:
                return Collections.singletonList(new RNPushNotification(reactApplicationContext));
            case 3:
                return Collections.emptyList();
            case 4:
                O90.m5968f(reactApplicationContext, "reactContext");
                return AbstractC7230yu.m26275f(new VideoDecoderInfoModule(reactApplicationContext), new VideoManagerModule(reactApplicationContext));
            case 5:
                O90.m5968f(reactApplicationContext, "reactContext");
                return AbstractC7230yu.m26274e(new RemoteConfigModule(reactApplicationContext));
            case 6:
                O90.m5968f(reactApplicationContext, "reactContext");
                return AbstractC7230yu.m26274e(new RustorePushModule(reactApplicationContext));
            case 7:
                O90.m5968f(reactApplicationContext, "reactContext");
                return AbstractC7230yu.m26274e(new RustoreReviewModule(reactApplicationContext));
            case 8:
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new SplashScreenModule(reactApplicationContext));
                return arrayList2;
            case 9:
                O90.m5968f(reactApplicationContext, "reactContext");
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new StatsTrackerModule(reactApplicationContext));
                return arrayList3;
            case 10:
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(new SystemSetting(reactApplicationContext));
                return arrayList4;
            default:
                ArrayList arrayList5 = new ArrayList();
                arrayList5.add(new VarioqubModule(reactApplicationContext));
                return arrayList5;
        }
    }

    @Override // p000.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        boolean z = false;
        C0779MN c0779mn = C0779MN.f7117a;
        switch (this.f7099a) {
            case 1:
                O90.m5968f(reactApplicationContext, "reactContext");
                break;
            case 4:
                O90.m5968f(reactApplicationContext, "reactContext");
                C0926Oi c0926Oi = new C0926Oi(3, z);
                C1396WB c1396wb = new C1396WB(reactApplicationContext);
                c0926Oi.f8576c = new C0959PE((Context) c1396wb.f13035c, (HashMap) c1396wb.f13036d, c1396wb.f13034b, (M71) c1396wb.f13037e, c1396wb.f13033a);
                break;
            case 5:
                O90.m5968f(reactApplicationContext, "reactContext");
                break;
            case 6:
                O90.m5968f(reactApplicationContext, "reactContext");
                break;
            case 7:
                O90.m5968f(reactApplicationContext, "reactContext");
                break;
            case 9:
                O90.m5968f(reactApplicationContext, "reactContext");
                List listEmptyList = Collections.emptyList();
                O90.m5967e(listEmptyList, "emptyList(...)");
                break;
        }
        return Collections.emptyList();
    }
}

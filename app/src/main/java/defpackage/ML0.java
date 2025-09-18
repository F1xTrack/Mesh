package defpackage;

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
import org.devio.rn.splashscreen.SplashScreenModule;

/* loaded from: classes.dex */
public final class ML0 implements ZL0 {
    public final /* synthetic */ int a;

    @Override // defpackage.ZL0
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                arrayList.add(new ReactNativeGetLocationModule(reactApplicationContext));
                return arrayList;
            case 1:
                O90.f(reactApplicationContext, "reactContext");
                return AbstractC8259yu.e(new ReactNativeMoneyInputModule(reactApplicationContext));
            case 2:
                return Collections.singletonList(new RNPushNotification(reactApplicationContext));
            case 3:
                return Collections.emptyList();
            case 4:
                O90.f(reactApplicationContext, "reactContext");
                return AbstractC8259yu.f(new VideoDecoderInfoModule(reactApplicationContext), new VideoManagerModule(reactApplicationContext));
            case 5:
                O90.f(reactApplicationContext, "reactContext");
                return AbstractC8259yu.e(new RemoteConfigModule(reactApplicationContext));
            case 6:
                O90.f(reactApplicationContext, "reactContext");
                return AbstractC8259yu.e(new RustorePushModule(reactApplicationContext));
            case 7:
                O90.f(reactApplicationContext, "reactContext");
                return AbstractC8259yu.e(new RustoreReviewModule(reactApplicationContext));
            case 8:
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new SplashScreenModule(reactApplicationContext));
                return arrayList2;
            case 9:
                O90.f(reactApplicationContext, "reactContext");
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

    @Override // defpackage.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        boolean z = false;
        MN mn = MN.a;
        switch (this.a) {
            case 1:
                O90.f(reactApplicationContext, "reactContext");
                break;
            case 4:
                O90.f(reactApplicationContext, "reactContext");
                C1135Oi c1135Oi = new C1135Oi(3, z);
                WB wb = new WB(reactApplicationContext);
                c1135Oi.c = new PE((Context) wb.c, (HashMap) wb.d, wb.b, (M71) wb.e, wb.a);
                break;
            case 5:
                O90.f(reactApplicationContext, "reactContext");
                break;
            case 6:
                O90.f(reactApplicationContext, "reactContext");
                break;
            case 7:
                O90.f(reactApplicationContext, "reactContext");
                break;
            case 9:
                O90.f(reactApplicationContext, "reactContext");
                List listEmptyList = Collections.emptyList();
                O90.e(listEmptyList, "emptyList(...)");
                break;
        }
        return Collections.emptyList();
    }
}

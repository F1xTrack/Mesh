package p000;

import com.RNTextInputMask.RNTextInputMaskModule;
import com.airbnb.android.react.lottie.LottieAnimationViewManager;
import com.burnweb.rnsendintent.RNSendIntentModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.gzip.GzipModule;
import com.killserver.screenshotprev.RNScreenshotPreventModule;
import com.learnium.RNDeviceInfo.RNDeviceModule;
import com.mrousavy.camera.react.CameraDevicesManager;
import com.mrousavy.camera.react.CameraViewManager;
import com.mrousavy.camera.react.CameraViewModule;
import com.mytracker.MytrackerModule;
import com.p003BV.LinearGradient.LinearGradientManager;
import com.proyecto26.inappbrowser.RNInAppBrowserModule;
import com.reactnativebiometrytools.BiometryToolsModule;
import com.reactnativecommunity.cookies.CookieManagerModule;
import com.reactnativecommunity.netinfo.NetInfoModule;
import com.reactnativelastactivestate.LastActiveStateModule;
import com.reactnativemmkv.MmkvModule;
import com.reactnativepagerview.PagerViewViewManager;
import com.shopify.reactnative.flash_list.AutoLayoutViewManager;
import com.shopify.reactnative.flash_list.CellContainerManager;
import com.vinzscam.reactnativefileviewer.RNFileViewerModule;
import io.invertase.firebase.analytics.ReactNativeFirebaseAnalyticsModule;
import io.invertase.firebase.app.ReactNativeFirebaseAppModule;
import io.invertase.firebase.config.ReactNativeFirebaseConfigModule;
import io.invertase.firebase.crashlytics.ReactNativeFirebaseCrashlyticsModule;
import io.invertase.firebase.messaging.ReactNativeFirebaseMessagingModule;
import io.invertase.firebase.perf.ReactNativeFirebasePerfModule;
import io.invertase.firebase.utils.ReactNativeFirebaseUtilsModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.linusu.RNGetRandomValuesModule;
import org.wonday.orientation.OrientationModule;
import org.wonday.pdf.PdfManager;
import ru.mes.dnevnik.NativeEnvironmentsModule;
import ru.mes.dnevnik.htmlTextView.HtmlTextViewManager;
import ru.vvdev.yamap.ClusteredYamapViewManager;
import ru.vvdev.yamap.RNYamapModule;
import ru.vvdev.yamap.YamapCircleManager;
import ru.vvdev.yamap.YamapMarkerManager;
import ru.vvdev.yamap.YamapPolygonManager;
import ru.vvdev.yamap.YamapPolylineManager;
import ru.vvdev.yamap.YamapViewManager;

/* renamed from: Sh */
/* loaded from: classes2.dex */
public final class C1176Sh implements ZL0 {

    /* renamed from: a */
    public final /* synthetic */ int f10908a;

    @Override // p000.ZL0
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        C0779MN c0779mn = C0779MN.f7117a;
        switch (this.f10908a) {
            case 0:
                O90.m5968f(reactApplicationContext, "reactContext");
                ArrayList arrayList = new ArrayList();
                arrayList.add(new BiometryToolsModule(reactApplicationContext));
                return arrayList;
            case 1:
                O90.m5968f(reactApplicationContext, "reactContext");
                return AbstractC7230yu.m26275f(new CameraViewModule(reactApplicationContext), new CameraDevicesManager(reactApplicationContext));
            case 2:
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new CookieManagerModule(reactApplicationContext));
                return arrayList2;
            case 3:
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new GzipModule(reactApplicationContext));
                return arrayList3;
            case 4:
                O90.m5968f(reactApplicationContext, "reactContext");
                return c0779mn;
            case 5:
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(new LastActiveStateModule(reactApplicationContext));
                return arrayList4;
            case 6:
                return Collections.emptyList();
            case 7:
                O90.m5968f(reactApplicationContext, "reactContext");
                return c0779mn;
            case 8:
                return Collections.singletonList(new MmkvModule(reactApplicationContext));
            case 9:
                O90.m5968f(reactApplicationContext, "reactContext");
                ArrayList arrayList5 = new ArrayList();
                arrayList5.add(new MytrackerModule(reactApplicationContext));
                return arrayList5;
            case 10:
                O90.m5968f(reactApplicationContext, "reactContext");
                return AbstractC7167xu.m25984d0(AbstractC7230yu.m26274e(new NativeEnvironmentsModule(reactApplicationContext)));
            case 11:
                return Arrays.asList(new NetInfoModule(reactApplicationContext));
            case 12:
                return Arrays.asList(new OrientationModule(reactApplicationContext));
            case 13:
                O90.m5968f(reactApplicationContext, "reactContext");
                return c0779mn;
            case 14:
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(new RNDeviceModule(reactApplicationContext));
                return arrayList6;
            case 15:
                return Arrays.asList(new RNFileViewerModule(reactApplicationContext));
            case 16:
                return Arrays.asList(new RNGetRandomValuesModule(reactApplicationContext));
            case 17:
                return Arrays.asList(new RNInAppBrowserModule(reactApplicationContext));
            case 18:
                return Collections.emptyList();
            case 19:
                return Arrays.asList(new RNScreenshotPreventModule(reactApplicationContext));
            case 20:
                ArrayList arrayList7 = new ArrayList();
                arrayList7.add(new RNSendIntentModule(reactApplicationContext));
                return arrayList7;
            case 21:
                O90.m5968f(reactApplicationContext, "reactContext");
                return AbstractC7230yu.m26274e(new RNTextInputMaskModule(reactApplicationContext));
            case 22:
                O90.m5968f(reactApplicationContext, "reactContext");
                List listAsList = Arrays.asList(new RNYamapModule(reactApplicationContext));
                O90.m5967e(listAsList, "asList(...)");
                return listAsList;
            case 23:
                ArrayList arrayList8 = new ArrayList();
                arrayList8.add(new ReactNativeFirebaseAnalyticsModule(reactApplicationContext));
                return arrayList8;
            case 24:
                if (CO1.f1354a == null) {
                    CO1.f1354a = reactApplicationContext.getApplicationContext();
                }
                ArrayList arrayList9 = new ArrayList();
                arrayList9.add(new ReactNativeFirebaseAppModule(reactApplicationContext));
                arrayList9.add(new ReactNativeFirebaseUtilsModule(reactApplicationContext));
                return arrayList9;
            case 25:
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(new ReactNativeFirebaseConfigModule(reactApplicationContext));
                return arrayList10;
            case 26:
                ArrayList arrayList11 = new ArrayList();
                arrayList11.add(new ReactNativeFirebaseCrashlyticsModule(reactApplicationContext));
                return arrayList11;
            case 27:
                ArrayList arrayList12 = new ArrayList();
                arrayList12.add(new ReactNativeFirebaseMessagingModule(reactApplicationContext));
                return arrayList12;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ArrayList arrayList13 = new ArrayList();
                arrayList13.add(new ReactNativeFirebasePerfModule(reactApplicationContext));
                return arrayList13;
            default:
                O90.m5968f(reactApplicationContext, "reactContext");
                return c0779mn;
        }
    }

    @Override // p000.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        C0779MN c0779mn = C0779MN.f7117a;
        switch (this.f10908a) {
            case 0:
                O90.m5968f(reactApplicationContext, "reactContext");
                return c0779mn;
            case 1:
                O90.m5968f(reactApplicationContext, "reactContext");
                return AbstractC7230yu.m26274e(new CameraViewManager());
            case 2:
                return Arrays.asList(new ViewManager[0]);
            case 3:
                return Collections.emptyList();
            case 4:
                O90.m5968f(reactApplicationContext, "reactContext");
                return AbstractC7230yu.m26274e(new HtmlTextViewManager());
            case 5:
                return Collections.emptyList();
            case 6:
                return Collections.singletonList(new LinearGradientManager());
            case 7:
                O90.m5968f(reactApplicationContext, "reactContext");
                return AbstractC7230yu.m26274e(new LottieAnimationViewManager());
            case 8:
                return Collections.emptyList();
            case 9:
                O90.m5968f(reactApplicationContext, "reactContext");
                return c0779mn;
            case 10:
                O90.m5968f(reactApplicationContext, "reactContext");
                return new ArrayList();
            case 11:
                return Collections.emptyList();
            case 12:
                return Arrays.asList(new ViewManager[0]);
            case 13:
                O90.m5968f(reactApplicationContext, "reactContext");
                return AbstractC7230yu.m26274e(new PagerViewViewManager());
            case 14:
                return Collections.emptyList();
            case 15:
                return Collections.emptyList();
            case 16:
                return Collections.emptyList();
            case 17:
                return Collections.emptyList();
            case 18:
                ArrayList arrayList = new ArrayList();
                arrayList.add(new PdfManager(reactApplicationContext));
                return arrayList;
            case 19:
                return Collections.emptyList();
            case 20:
                return Collections.emptyList();
            case 21:
                O90.m5968f(reactApplicationContext, "reactContext");
                return c0779mn;
            case 22:
                O90.m5968f(reactApplicationContext, "reactContext");
                List listAsList = Arrays.asList(new YamapViewManager(), new ClusteredYamapViewManager(), new YamapPolygonManager(), new YamapPolylineManager(), new YamapMarkerManager(), new YamapCircleManager());
                O90.m5967e(listAsList, "asList(...)");
                return listAsList;
            case 23:
                return Collections.emptyList();
            case 24:
                return Collections.emptyList();
            case 25:
                return Collections.emptyList();
            case 26:
                return Collections.emptyList();
            case 27:
                return Collections.emptyList();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Collections.emptyList();
            default:
                O90.m5968f(reactApplicationContext, "reactContext");
                return AbstractC7230yu.m26275f(new AutoLayoutViewManager(), new CellContainerManager());
        }
    }
}

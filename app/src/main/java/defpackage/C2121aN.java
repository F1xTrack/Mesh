package defpackage;

import com.dylanvann.fastimage.FastImageViewPackage;
import com.facebook.react.module.model.ReactModuleInfo;
import com.leerman.rnsecuritypack.SecurityPackModule;
import com.reactcommunity.rndatetimepicker.DatePickerModule;
import com.reactcommunity.rndatetimepicker.MaterialDatePickerModule;
import com.reactcommunity.rndatetimepicker.MaterialTimePickerModule;
import com.reactcommunity.rndatetimepicker.TimePickerModule;
import com.reactnativedocumentpicker.RNDocumentPickerModule;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* renamed from: aN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2121aN implements InterfaceC3563eL0 {
    public final /* synthetic */ int a;

    public /* synthetic */ C2121aN(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC3563eL0
    public final Map a() {
        switch (this.a) {
            case 0:
                return AbstractC7287tn0.c(new Pair("RNEdgeToEdge", new ReactModuleInfo("RNEdgeToEdge", "RNEdgeToEdge", false, true, false, false)));
            case 1:
                return FastImageViewPackage.lambda$getReactModuleInfoProvider$0();
            case 2:
                HashMap map = new HashMap();
                map.put("KeyboardController", new ReactModuleInfo("KeyboardController", "KeyboardController", false, false, false, false));
                map.put("StatusBarManager", new ReactModuleInfo("StatusBarManager", "StatusBarManager", true, false, false, false));
                return map;
            case 3:
                HashMap map2 = new HashMap();
                map2.put("RNCWebViewModule", new ReactModuleInfo("RNCWebViewModule", "RNCWebViewModule", false, false, false, false));
                return map2;
            case 4:
                HashMap map3 = new HashMap();
                map3.put(DatePickerModule.NAME, new ReactModuleInfo(DatePickerModule.NAME, DatePickerModule.NAME, false, false, false, false));
                map3.put(TimePickerModule.NAME, new ReactModuleInfo(TimePickerModule.NAME, TimePickerModule.NAME, false, false, false, false));
                map3.put(MaterialDatePickerModule.NAME, new ReactModuleInfo(MaterialDatePickerModule.NAME, MaterialDatePickerModule.NAME, false, false, false, false));
                map3.put(MaterialTimePickerModule.NAME, new ReactModuleInfo(MaterialTimePickerModule.NAME, MaterialTimePickerModule.NAME, false, false, false, false));
                return map3;
            case 5:
                HashMap map4 = new HashMap();
                map4.put(RNDocumentPickerModule.NAME, new ReactModuleInfo(RNDocumentPickerModule.NAME, RNDocumentPickerModule.NAME, false, false, false, false));
                return map4;
            case 6:
                Annotation annotation = RNGestureHandlerModule.class.getAnnotation(InterfaceC3373dL0.class);
                O90.c(annotation);
                InterfaceC3373dL0 interfaceC3373dL0 = (InterfaceC3373dL0) annotation;
                return AbstractC7096sn0.i(new Pair("RNGestureHandlerModule", new ReactModuleInfo(interfaceC3373dL0.name(), RNGestureHandlerModule.class.getName(), interfaceC3373dL0.canOverrideExistingModule(), interfaceC3373dL0.needsEagerInit(), interfaceC3373dL0.isCxxModule(), true)));
            case 7:
                HashMap map5 = new HashMap();
                map5.put("RNPermissions", new ReactModuleInfo("RNPermissions", "RNPermissions", false, false, false, false));
                return map5;
            case 8:
                HashMap map6 = new HashMap();
                map6.put("RNHapticFeedback", new ReactModuleInfo("RNHapticFeedback", "RNHapticFeedback", false, false, false, false));
                return map6;
            case 9:
                HashMap map7 = new HashMap();
                map7.put("RNSModule", new ReactModuleInfo("RNSModule", "RNSModule", false, false, false, false));
                return map7;
            case 10:
                HashMap map8 = new HashMap();
                map8.put("RNShare", new ReactModuleInfo("RNShare", "RNShare", false, false, false, true));
                return map8;
            case 11:
                HashMap map9 = new HashMap();
                map9.put("ReactNativeBlobUtil", new ReactModuleInfo("ReactNativeBlobUtil", "ReactNativeBlobUtil", false, false, false, false));
                return map9;
            case 12:
                HashMap map10 = new HashMap();
                map10.put(SecurityPackModule.NAME, new ReactModuleInfo(SecurityPackModule.NAME, SecurityPackModule.NAME, false, false, false, false));
                return map10;
            default:
                HashMap map11 = new HashMap();
                map11.put("RNStoreReview", new ReactModuleInfo("RNStoreReview", "RNStoreReview", false, false, false, false));
                return map11;
        }
    }
}

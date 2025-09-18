package defpackage;

import com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.facebook.react.modules.devtoolssettings.DevToolsSettingsManagerModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.share.ShareModule;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.debuggingoverlay.DebuggingOverlayManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.switchview.ReactSwitchManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.unimplementedview.ReactUnimplementedViewManager;
import com.facebook.react.views.view.ReactViewManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: wD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7750wD extends AbstractC6495pd1 implements InterfaceC0442Fk1 {
    public final /* synthetic */ int a;
    public HashMap b;

    public /* synthetic */ C7750wD(int i) {
        this.a = i;
    }

    public static void a(HashMap map, String str, Provider provider) {
        map.put(str, ModuleSpec.viewManagerSpec(provider));
    }

    public Map b() {
        if (this.b == null) {
            HashMap map = new HashMap();
            map.put(DebuggingOverlayManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C4403il(24)));
            this.b = map;
        }
        return this.b;
    }

    public Map c() {
        if (this.b == null) {
            HashMap map = new HashMap();
            a(map, ReactDrawerLayoutManager.REACT_CLASS, new OU(19));
            a(map, ReactHorizontalScrollViewManager.REACT_CLASS, new C0681Im0(2));
            a(map, ReactHorizontalScrollContainerViewManager.REACT_CLASS, new C0681Im0(3));
            a(map, ReactProgressBarViewManager.REACT_CLASS, new C0681Im0(4));
            a(map, ReactScrollViewManager.REACT_CLASS, new OU(20));
            a(map, ReactSwitchManager.REACT_CLASS, new OU(21));
            a(map, SwipeRefreshLayoutManager.REACT_CLASS, new OU(22));
            a(map, FrescoBasedReactTextInlineImageViewManager.REACT_CLASS, new OU(23));
            a(map, ReactImageManager.REACT_CLASS, new OU(24));
            a(map, ReactModalHostManager.REACT_CLASS, new OU(25));
            a(map, ReactRawTextManager.REACT_CLASS, new OU(26));
            a(map, ReactTextInputManager.REACT_CLASS, new OU(27));
            a(map, ReactTextViewManager.REACT_CLASS, new OU(28));
            a(map, ReactViewManager.REACT_CLASS, new OU(29));
            a(map, ReactVirtualTextViewManager.REACT_CLASS, new C0681Im0(0));
            a(map, ReactUnimplementedViewManager.REACT_CLASS, new C0681Im0(1));
            this.b = map;
        }
        return this.b;
    }

    @Override // defpackage.InterfaceC0442Fk1
    public final ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        switch (this.a) {
            case 0:
                ModuleSpec moduleSpec = (ModuleSpec) ((HashMap) b()).get(str);
                if (moduleSpec != null) {
                    return (ViewManager) moduleSpec.getProvider().get();
                }
                return null;
            default:
                ModuleSpec moduleSpec2 = (ModuleSpec) ((HashMap) c()).get(str);
                if (moduleSpec2 != null) {
                    return (ViewManager) moduleSpec2.getProvider().get();
                }
                return null;
        }
    }

    @Override // defpackage.AbstractC8407zg, defpackage.ZL0
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        switch (this.a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                arrayList.add(new ReactDrawerLayoutManager());
                arrayList.add(new ReactHorizontalScrollViewManager());
                arrayList.add(new ReactHorizontalScrollContainerViewManager());
                arrayList.add(new ReactProgressBarViewManager());
                arrayList.add(new ReactScrollViewManager());
                arrayList.add(new ReactSwitchManager());
                arrayList.add(new SwipeRefreshLayoutManager());
                arrayList.add(new FrescoBasedReactTextInlineImageViewManager());
                arrayList.add(new ReactImageManager());
                arrayList.add(new ReactModalHostManager());
                arrayList.add(new ReactRawTextManager());
                arrayList.add(new ReactTextInputManager());
                arrayList.add(new ReactTextViewManager());
                arrayList.add(new ReactViewManager());
                arrayList.add(new ReactVirtualTextViewManager());
                arrayList.add(new ReactUnimplementedViewManager());
                return arrayList;
            default:
                return super.createViewManagers(reactApplicationContext);
        }
    }

    @Override // defpackage.AbstractC8407zg
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        switch (this.a) {
            case 0:
                str.getClass();
                if (str.equals(NativeJSCHeapCaptureSpec.NAME)) {
                    return new JSCHeapCapture(reactApplicationContext);
                }
                return null;
            default:
                str.getClass();
                switch (str) {
                    case "ToastAndroid":
                        return new ToastModule(reactApplicationContext);
                    case "ImageStoreManager":
                        return new ImageStoreManager(reactApplicationContext);
                    case "SoundManager":
                        return new SoundManagerModule(reactApplicationContext);
                    case "DialogManagerAndroid":
                        return new DialogModule(reactApplicationContext);
                    case "FileReaderModule":
                        return new FileReaderModule(reactApplicationContext);
                    case "PermissionsAndroid":
                        return new PermissionsModule(reactApplicationContext);
                    case "ImageLoader":
                        return new ImageLoaderModule(reactApplicationContext);
                    case "I18nManager":
                        return new I18nManagerModule(reactApplicationContext);
                    case "Appearance":
                        return new AppearanceModule(reactApplicationContext);
                    case "AccessibilityInfo":
                        return new AccessibilityInfoModule(reactApplicationContext);
                    case "StatusBarManager":
                        return new StatusBarModule(reactApplicationContext);
                    case "WebSocketModule":
                        return new WebSocketModule(reactApplicationContext);
                    case "DevLoadingView":
                        return new DevLoadingModule(reactApplicationContext);
                    case "FrescoModule":
                        return new FrescoModule(reactApplicationContext, true, (C2265b70) null);
                    case "Clipboard":
                        return new ClipboardModule(reactApplicationContext);
                    case "DevToolsSettingsManager":
                        return new DevToolsSettingsManagerModule(reactApplicationContext);
                    case "IntentAndroid":
                        return new IntentModule(reactApplicationContext);
                    case "AppState":
                        return new AppStateModule(reactApplicationContext);
                    case "Networking":
                        return new NetworkingModule(reactApplicationContext);
                    case "BlobModule":
                        return new BlobModule(reactApplicationContext);
                    case "ShareModule":
                        return new ShareModule(reactApplicationContext);
                    case "NativeAnimatedModule":
                        return new NativeAnimatedModule(reactApplicationContext);
                    case "Vibration":
                        return new VibrationModule(reactApplicationContext);
                    default:
                        return null;
                }
        }
    }

    @Override // defpackage.AbstractC8407zg
    public final InterfaceC3563eL0 getReactModuleInfoProvider() {
        switch (this.a) {
            case 0:
                HashMap map = new HashMap();
                Class cls = new Class[]{JSCHeapCapture.class}[0];
                InterfaceC3373dL0 interfaceC3373dL0 = (InterfaceC3373dL0) cls.getAnnotation(InterfaceC3373dL0.class);
                map.put(interfaceC3373dL0.name(), new ReactModuleInfo(interfaceC3373dL0.name(), cls.getName(), interfaceC3373dL0.canOverrideExistingModule(), interfaceC3373dL0.needsEagerInit(), interfaceC3373dL0.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
                return new C7894wz(map, 0);
            default:
                Class[] clsArr = {AccessibilityInfoModule.class, AppearanceModule.class, AppStateModule.class, BlobModule.class, DevLoadingModule.class, FileReaderModule.class, ClipboardModule.class, DialogModule.class, FrescoModule.class, I18nManagerModule.class, ImageLoaderModule.class, ImageStoreManager.class, IntentModule.class, NativeAnimatedModule.class, NetworkingModule.class, PermissionsModule.class, DevToolsSettingsManagerModule.class, ShareModule.class, StatusBarModule.class, SoundManagerModule.class, ToastModule.class, VibrationModule.class, WebSocketModule.class};
                HashMap map2 = new HashMap();
                for (int i = 0; i < 23; i++) {
                    Class cls2 = clsArr[i];
                    InterfaceC3373dL0 interfaceC3373dL02 = (InterfaceC3373dL0) cls2.getAnnotation(InterfaceC3373dL0.class);
                    if (interfaceC3373dL02 != null) {
                        map2.put(interfaceC3373dL02.name(), new ReactModuleInfo(interfaceC3373dL02.name(), cls2.getName(), interfaceC3373dL02.canOverrideExistingModule(), interfaceC3373dL02.needsEagerInit(), interfaceC3373dL02.isCxxModule(), TurboModule.class.isAssignableFrom(cls2)));
                    }
                }
                return new C7894wz(map2, 0);
        }
    }

    @Override // defpackage.InterfaceC0442Fk1
    public final Collection getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        switch (this.a) {
            case 0:
                return ((HashMap) b()).keySet();
            default:
                return ((HashMap) c()).keySet();
        }
    }

    @Override // defpackage.AbstractC8407zg
    public final List getViewManagers(ReactApplicationContext reactApplicationContext) {
        switch (this.a) {
            case 0:
                return new ArrayList(((HashMap) b()).values());
            default:
                return new ArrayList(((HashMap) c()).values());
        }
    }
}

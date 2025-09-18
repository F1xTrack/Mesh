package p000;

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

/* renamed from: wD */
/* loaded from: classes.dex */
public final class C7061wD extends AbstractC10674pd1 implements InterfaceC7595Fk1 {

    /* renamed from: a */
    public final /* synthetic */ int f44711a;

    /* renamed from: b */
    public HashMap f44712b;

    public /* synthetic */ C7061wD(int i) {
        this.f44711a = i;
    }

    /* renamed from: a */
    public static void m25573a(HashMap map, String str, Provider provider) {
        map.put(str, ModuleSpec.viewManagerSpec(provider));
    }

    /* renamed from: b */
    public Map m25574b() {
        if (this.f44712b == null) {
            HashMap map = new HashMap();
            map.put(DebuggingOverlayManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C4262il(24)));
            this.f44712b = map;
        }
        return this.f44712b;
    }

    /* renamed from: c */
    public Map m25575c() {
        if (this.f44712b == null) {
            HashMap map = new HashMap();
            m25573a(map, ReactDrawerLayoutManager.REACT_CLASS, new C0912OU(19));
            m25573a(map, ReactHorizontalScrollViewManager.REACT_CLASS, new C7754Im0(2));
            m25573a(map, ReactHorizontalScrollContainerViewManager.REACT_CLASS, new C7754Im0(3));
            m25573a(map, ReactProgressBarViewManager.REACT_CLASS, new C7754Im0(4));
            m25573a(map, ReactScrollViewManager.REACT_CLASS, new C0912OU(20));
            m25573a(map, ReactSwitchManager.REACT_CLASS, new C0912OU(21));
            m25573a(map, SwipeRefreshLayoutManager.REACT_CLASS, new C0912OU(22));
            m25573a(map, FrescoBasedReactTextInlineImageViewManager.REACT_CLASS, new C0912OU(23));
            m25573a(map, ReactImageManager.REACT_CLASS, new C0912OU(24));
            m25573a(map, ReactModalHostManager.REACT_CLASS, new C0912OU(25));
            m25573a(map, ReactRawTextManager.REACT_CLASS, new C0912OU(26));
            m25573a(map, ReactTextInputManager.REACT_CLASS, new C0912OU(27));
            m25573a(map, ReactTextViewManager.REACT_CLASS, new C0912OU(28));
            m25573a(map, ReactViewManager.REACT_CLASS, new C0912OU(29));
            m25573a(map, ReactVirtualTextViewManager.REACT_CLASS, new C7754Im0(0));
            m25573a(map, ReactUnimplementedViewManager.REACT_CLASS, new C7754Im0(1));
            this.f44712b = map;
        }
        return this.f44712b;
    }

    @Override // p000.InterfaceC7595Fk1
    public final ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        switch (this.f44711a) {
            case 0:
                ModuleSpec moduleSpec = (ModuleSpec) ((HashMap) m25574b()).get(str);
                if (moduleSpec != null) {
                    return (ViewManager) moduleSpec.getProvider().get();
                }
                return null;
            default:
                ModuleSpec moduleSpec2 = (ModuleSpec) ((HashMap) m25575c()).get(str);
                if (moduleSpec2 != null) {
                    return (ViewManager) moduleSpec2.getProvider().get();
                }
                return null;
        }
    }

    @Override // p000.AbstractC7279zg, p000.ZL0
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        switch (this.f44711a) {
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

    @Override // p000.AbstractC7279zg
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        switch (this.f44711a) {
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
                        return new FrescoModule(reactApplicationContext, true, (C8812b70) null);
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

    @Override // p000.AbstractC7279zg
    public final InterfaceC9229eL0 getReactModuleInfoProvider() {
        switch (this.f44711a) {
            case 0:
                HashMap map = new HashMap();
                Class cls = new Class[]{JSCHeapCapture.class}[0];
                InterfaceC9101dL0 interfaceC9101dL0 = (InterfaceC9101dL0) cls.getAnnotation(InterfaceC9101dL0.class);
                map.put(interfaceC9101dL0.name(), new ReactModuleInfo(interfaceC9101dL0.name(), cls.getName(), interfaceC9101dL0.canOverrideExistingModule(), interfaceC9101dL0.needsEagerInit(), interfaceC9101dL0.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
                return new C7109wz(map, 0);
            default:
                Class[] clsArr = {AccessibilityInfoModule.class, AppearanceModule.class, AppStateModule.class, BlobModule.class, DevLoadingModule.class, FileReaderModule.class, ClipboardModule.class, DialogModule.class, FrescoModule.class, I18nManagerModule.class, ImageLoaderModule.class, ImageStoreManager.class, IntentModule.class, NativeAnimatedModule.class, NetworkingModule.class, PermissionsModule.class, DevToolsSettingsManagerModule.class, ShareModule.class, StatusBarModule.class, SoundManagerModule.class, ToastModule.class, VibrationModule.class, WebSocketModule.class};
                HashMap map2 = new HashMap();
                for (int i = 0; i < 23; i++) {
                    Class cls2 = clsArr[i];
                    InterfaceC9101dL0 interfaceC9101dL02 = (InterfaceC9101dL0) cls2.getAnnotation(InterfaceC9101dL0.class);
                    if (interfaceC9101dL02 != null) {
                        map2.put(interfaceC9101dL02.name(), new ReactModuleInfo(interfaceC9101dL02.name(), cls2.getName(), interfaceC9101dL02.canOverrideExistingModule(), interfaceC9101dL02.needsEagerInit(), interfaceC9101dL02.isCxxModule(), TurboModule.class.isAssignableFrom(cls2)));
                    }
                }
                return new C7109wz(map2, 0);
        }
    }

    @Override // p000.InterfaceC7595Fk1
    public final Collection getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        switch (this.f44711a) {
            case 0:
                return ((HashMap) m25574b()).keySet();
            default:
                return ((HashMap) m25575c()).keySet();
        }
    }

    @Override // p000.AbstractC7279zg
    public final List getViewManagers(ReactApplicationContext reactApplicationContext) {
        switch (this.f44711a) {
            case 0:
                return new ArrayList(((HashMap) m25574b()).values());
            default:
                return new ArrayList(((HashMap) m25575c()).values());
        }
    }
}

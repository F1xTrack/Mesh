package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.UIManagerModule;

/* loaded from: classes.dex */
public abstract class OZ1 {
    public static final /* synthetic */ int a = 0;

    public static InterfaceC7405uP a(ReactContext reactContext, int i) {
        if (reactContext.isBridgeless()) {
            if (reactContext instanceof S91) {
                reactContext = ((S91) reactContext).a;
            }
            reactContext.getClass();
            throw new ClassCastException();
        }
        UIManager uIManagerF = f(reactContext, i, false);
        if (uIManagerF == null) {
            ReactSoftExceptionLogger.logSoftException("OZ1", new ReactNoCrashSoftException(AbstractC7209tN0.u(i, "Unable to find UIManager for UIManagerType ")));
            return null;
        }
        InterfaceC7405uP interfaceC7405uP = (InterfaceC7405uP) uIManagerF.getEventDispatcher();
        if (interfaceC7405uP == null) {
            ReactSoftExceptionLogger.logSoftException("OZ1", new IllegalStateException(AbstractC7209tN0.u(i, "Cannot get EventDispatcher for UIManagerType ")));
        }
        return interfaceC7405uP;
    }

    public static InterfaceC7405uP b(ReactContext reactContext, int i) {
        InterfaceC7405uP interfaceC7405uPA = a(reactContext, R02.b(i));
        if (interfaceC7405uPA == null) {
            ReactSoftExceptionLogger.logSoftException("OZ1", new IllegalStateException(AbstractC7209tN0.u(i, "Cannot get EventDispatcher for reactTag ")));
        }
        return interfaceC7405uPA;
    }

    public static ReactContext c(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    public static int d(Context context) {
        if (context instanceof S91) {
            return ((S91) context).b;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int e(View view) {
        if (view instanceof InterfaceC5870mM0) {
            InterfaceC5870mM0 interfaceC5870mM0 = (InterfaceC5870mM0) view;
            if (interfaceC5870mM0.getUIManagerType() == 2) {
                return interfaceC5870mM0.getRootViewTag();
            }
            return -1;
        }
        int id = view.getId();
        if (R02.b(id) == 1) {
            return -1;
        }
        Context context = view.getContext();
        if (!(context instanceof S91) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        int iD = d(context);
        if (iD == -1) {
            ReactSoftExceptionLogger.logSoftException("OZ1", new IllegalStateException(AbstractC8235ym.g(id, "Fabric View [", "] does not have SurfaceId associated with it")));
        }
        return iD;
    }

    public static UIManager f(ReactContext reactContext, int i, boolean z) {
        if (reactContext.isBridgeless()) {
            UIManager fabricUIManager = reactContext.getFabricUIManager();
            if (fabricUIManager != null) {
                return fabricUIManager;
            }
            ReactSoftExceptionLogger.logSoftException("OZ1", new ReactNoCrashSoftException("Cannot get UIManager because the instance hasn't been initialized yet."));
            return null;
        }
        if (!reactContext.hasCatalystInstance()) {
            ReactSoftExceptionLogger.logSoftException("OZ1", new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain a CatalystInstance."));
            return null;
        }
        if (!reactContext.hasActiveReactInstance()) {
            ReactSoftExceptionLogger.logSoftException("OZ1", new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain an active CatalystInstance."));
            if (z) {
                return null;
            }
        }
        CatalystInstance catalystInstance = reactContext.getCatalystInstance();
        try {
            return i == 2 ? reactContext.getFabricUIManager() : (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
        } catch (IllegalArgumentException unused) {
            ReactSoftExceptionLogger.logSoftException("OZ1", new ReactNoCrashSoftException(AbstractC7209tN0.u(i, "Cannot get UIManager for UIManagerType: ")));
            return (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
        }
    }
}

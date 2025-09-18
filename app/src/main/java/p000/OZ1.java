package p000;

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

    /* renamed from: a */
    public static final /* synthetic */ int f8492a = 0;

    /* renamed from: a */
    public static InterfaceC6947uP m6090a(ReactContext reactContext, int i) {
        if (reactContext.isBridgeless()) {
            if (reactContext instanceof S91) {
                reactContext = ((S91) reactContext).f10602a;
            }
            reactContext.getClass();
            throw new ClassCastException();
        }
        UIManager uIManagerM6095f = m6095f(reactContext, i, false);
        if (uIManagerM6095f == null) {
            ReactSoftExceptionLogger.logSoftException("OZ1", new ReactNoCrashSoftException(AbstractC11153tN0.m24909u(i, "Unable to find UIManager for UIManagerType ")));
            return null;
        }
        InterfaceC6947uP interfaceC6947uP = (InterfaceC6947uP) uIManagerM6095f.getEventDispatcher();
        if (interfaceC6947uP == null) {
            ReactSoftExceptionLogger.logSoftException("OZ1", new IllegalStateException(AbstractC11153tN0.m24909u(i, "Cannot get EventDispatcher for UIManagerType ")));
        }
        return interfaceC6947uP;
    }

    /* renamed from: b */
    public static InterfaceC6947uP m6091b(ReactContext reactContext, int i) {
        InterfaceC6947uP interfaceC6947uPM6090a = m6090a(reactContext, R02.m6874b(i));
        if (interfaceC6947uPM6090a == null) {
            ReactSoftExceptionLogger.logSoftException("OZ1", new IllegalStateException(AbstractC11153tN0.m24909u(i, "Cannot get EventDispatcher for reactTag ")));
        }
        return interfaceC6947uPM6090a;
    }

    /* renamed from: c */
    public static ReactContext m6092c(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    /* renamed from: d */
    public static int m6093d(Context context) {
        if (context instanceof S91) {
            return ((S91) context).f10603b;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static int m6094e(View view) {
        if (view instanceof InterfaceC10255mM0) {
            InterfaceC10255mM0 interfaceC10255mM0 = (InterfaceC10255mM0) view;
            if (interfaceC10255mM0.getUIManagerType() == 2) {
                return interfaceC10255mM0.getRootViewTag();
            }
            return -1;
        }
        int id = view.getId();
        if (R02.m6874b(id) == 1) {
            return -1;
        }
        Context context = view.getContext();
        if (!(context instanceof S91) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        int iM6093d = m6093d(context);
        if (iM6093d == -1) {
            ReactSoftExceptionLogger.logSoftException("OZ1", new IllegalStateException(AbstractC7222ym.m26230g(id, "Fabric View [", "] does not have SurfaceId associated with it")));
        }
        return iM6093d;
    }

    /* renamed from: f */
    public static UIManager m6095f(ReactContext reactContext, int i, boolean z) {
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
            ReactSoftExceptionLogger.logSoftException("OZ1", new ReactNoCrashSoftException(AbstractC11153tN0.m24909u(i, "Cannot get UIManager for UIManagerType: ")));
            return (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
        }
    }
}

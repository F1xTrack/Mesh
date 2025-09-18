package p000;

import android.os.Trace;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JSIContext;
import java.lang.ref.WeakReference;

/* renamed from: Bg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7378Bg0 {

    /* renamed from: a */
    public final C0134C7 f971a;

    public C7378Bg0(InterfaceC7974Ms0 interfaceC7974Ms0, C7818Js0 c7818Js0, WeakReference weakReference) {
        O90.m5968f(interfaceC7974Ms0, "modulesProvider");
        O90.m5968f(c7818Js0, "legacyModuleRegistry");
        this.f971a = new C0134C7(interfaceC7974Ms0, c7818Js0, weakReference);
    }

    /* renamed from: a */
    public final void m798a() {
        JavaScriptContextHolder javaScriptContextHolder;
        RuntimeExecutor runtimeExecutor;
        C0134C7 c0134c7 = this.f971a;
        synchronized (c0134c7) {
            if (c0134c7.f1201f != null) {
                C7978Mu0 c7978Mu0 = AbstractC6857sz.f42743a;
                c7978Mu0.getClass();
                c7978Mu0.m5475l(EnumC10561ol0.f39225d, "⚠️ JSI interop was already installed", null);
                return;
            }
            Trace.beginSection(OY1.m6088f("[ExpoModulesCore] AppContext.installJSIInterop"));
            try {
                c0134c7.f1201f = new JSIContext();
                ReactApplicationContext reactApplicationContext = (ReactApplicationContext) c0134c7.f1197b.get();
                if (reactApplicationContext != null && (javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder()) != null) {
                    long j = javaScriptContextHolder.get();
                    Long lValueOf = Long.valueOf(j);
                    if (j == 0) {
                        lValueOf = null;
                    }
                    if (lValueOf == null) {
                        AbstractC6857sz.f42743a.m5471a("❌ Cannot install JSI interop - JS runtime pointer is null", null);
                    } else {
                        long jLongValue = lValueOf.longValue();
                        if (reactApplicationContext.isBridgeless()) {
                            try {
                                Object objInvoke = reactApplicationContext.getClass().getMethod("getCatalystInstance", null).invoke(reactApplicationContext, null);
                                Object objInvoke2 = objInvoke.getClass().getMethod("getRuntimeExecutor", null).invoke(objInvoke, null);
                                O90.m5966d(objInvoke2, "null cannot be cast to non-null type com.facebook.react.bridge.RuntimeExecutor");
                                runtimeExecutor = (RuntimeExecutor) objInvoke2;
                            } catch (NoSuchFieldException unused) {
                                Object objInvoke3 = reactApplicationContext.getClass().getMethod("getRuntimeExecutor", null).invoke(reactApplicationContext, null);
                                O90.m5966d(objInvoke3, "null cannot be cast to non-null type com.facebook.react.bridge.RuntimeExecutor");
                                runtimeExecutor = (RuntimeExecutor) objInvoke3;
                            }
                            c0134c7.m986b().m18094d(c0134c7, jLongValue, c0134c7.f1208m, runtimeExecutor);
                        } else {
                            JSIContext jSIContextM986b = c0134c7.m986b();
                            JNIDeallocator jNIDeallocator = c0134c7.f1208m;
                            CallInvokerHolder jSCallInvokerHolder = reactApplicationContext.getCatalystInstance().getJSCallInvokerHolder();
                            O90.m5966d(jSCallInvokerHolder, "null cannot be cast to non-null type com.facebook.react.turbomodule.core.CallInvokerHolderImpl");
                            jSIContextM986b.m18093c(c0134c7, jLongValue, jNIDeallocator, (CallInvokerHolderImpl) jSCallInvokerHolder);
                        }
                        C7978Mu0 c7978Mu02 = AbstractC6857sz.f42743a;
                        c7978Mu02.getClass();
                        c7978Mu02.m5475l(EnumC10561ol0.f39224c, "✅ JSI interop was installed", null);
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}

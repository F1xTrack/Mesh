package defpackage;

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
public final class C0117Bg0 {
    public final C7 a;

    public C0117Bg0(InterfaceC1010Ms0 interfaceC1010Ms0, C0777Js0 c0777Js0, WeakReference weakReference) {
        O90.f(interfaceC1010Ms0, "modulesProvider");
        O90.f(c0777Js0, "legacyModuleRegistry");
        this.a = new C7(interfaceC1010Ms0, c0777Js0, weakReference);
    }

    public final void a() {
        JavaScriptContextHolder javaScriptContextHolder;
        RuntimeExecutor runtimeExecutor;
        C7 c7 = this.a;
        synchronized (c7) {
            if (c7.f != null) {
                C1016Mu0 c1016Mu0 = AbstractC7131sz.a;
                c1016Mu0.getClass();
                c1016Mu0.l(EnumC6327ol0.d, "⚠️ JSI interop was already installed", null);
                return;
            }
            Trace.beginSection(OY1.f("[ExpoModulesCore] AppContext.installJSIInterop"));
            try {
                c7.f = new JSIContext();
                ReactApplicationContext reactApplicationContext = (ReactApplicationContext) c7.b.get();
                if (reactApplicationContext != null && (javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder()) != null) {
                    long j = javaScriptContextHolder.get();
                    Long lValueOf = Long.valueOf(j);
                    if (j == 0) {
                        lValueOf = null;
                    }
                    if (lValueOf == null) {
                        AbstractC7131sz.a.a("❌ Cannot install JSI interop - JS runtime pointer is null", null);
                    } else {
                        long jLongValue = lValueOf.longValue();
                        if (reactApplicationContext.isBridgeless()) {
                            try {
                                Object objInvoke = reactApplicationContext.getClass().getMethod("getCatalystInstance", null).invoke(reactApplicationContext, null);
                                Object objInvoke2 = objInvoke.getClass().getMethod("getRuntimeExecutor", null).invoke(objInvoke, null);
                                O90.d(objInvoke2, "null cannot be cast to non-null type com.facebook.react.bridge.RuntimeExecutor");
                                runtimeExecutor = (RuntimeExecutor) objInvoke2;
                            } catch (NoSuchFieldException unused) {
                                Object objInvoke3 = reactApplicationContext.getClass().getMethod("getRuntimeExecutor", null).invoke(reactApplicationContext, null);
                                O90.d(objInvoke3, "null cannot be cast to non-null type com.facebook.react.bridge.RuntimeExecutor");
                                runtimeExecutor = (RuntimeExecutor) objInvoke3;
                            }
                            c7.b().d(c7, jLongValue, c7.m, runtimeExecutor);
                        } else {
                            JSIContext jSIContextB = c7.b();
                            JNIDeallocator jNIDeallocator = c7.m;
                            CallInvokerHolder jSCallInvokerHolder = reactApplicationContext.getCatalystInstance().getJSCallInvokerHolder();
                            O90.d(jSCallInvokerHolder, "null cannot be cast to non-null type com.facebook.react.turbomodule.core.CallInvokerHolderImpl");
                            jSIContextB.c(c7, jLongValue, jNIDeallocator, (CallInvokerHolderImpl) jSCallInvokerHolder);
                        }
                        C1016Mu0 c1016Mu02 = AbstractC7131sz.a;
                        c1016Mu02.getClass();
                        c1016Mu02.l(EnumC6327ol0.c, "✅ JSI interop was installed", null);
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

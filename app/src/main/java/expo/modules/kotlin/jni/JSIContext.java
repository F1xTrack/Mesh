package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.soloader.SoLoader;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import expo.modules.kotlin.exception.JavaScriptEvaluateException;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import p000.C0134C7;
import p000.C0433Gs;
import p000.C10720q01;
import p000.C1356VY;
import p000.C6861t2;
import p000.C7053w5;
import p000.C7558Es0;
import p000.C7766Is0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082 ¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0086 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0086 ¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001bH\u0086 ¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u001f\u0010\u0003J \u0010#\u001a\u00020\r2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001bH\u0086 ¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010%\u001a\u00020\u0016H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010%\u001a\u00020\u0016H\u0007¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160,H\u0007¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\r2\u0006\u00100\u001a\u00020/2\u0006\u0010\"\u001a\u00020\u001bH\u0007¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b3\u00104J#\u00106\u001a\u00020\r2\n\u00100\u001a\u0006\u0012\u0002\b\u0003052\u0006\u0010\"\u001a\u00020\u001bH\u0007¢\u0006\u0004\b6\u00107J\u001d\u00108\u001a\u0004\u0018\u00010\u001b2\n\u00100\u001a\u0006\u0012\u0002\b\u000305H\u0007¢\u0006\u0004\b8\u00109J\u0011\u0010:\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, m22267d2 = {"Lexpo/modules/kotlin/jni/JSIContext;", "Lexpo/modules/kotlin/jni/Destructible;", "<init>", "()V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "", "jsRuntimePointer", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "jniDeallocator", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "jsInvokerHolder", "LTf1;", "installJSI", "(JLexpo/modules/kotlin/jni/JNIDeallocator;Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;)V", "Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "installJSIForBridgeless", "(JLexpo/modules/kotlin/jni/JNIDeallocator;Lcom/facebook/react/bridge/RuntimeExecutor;)V", "installJSIForTests", "(Lexpo/modules/kotlin/jni/JNIDeallocator;)V", "", "script", "Lexpo/modules/kotlin/jni/JavaScriptValue;", "evaluateScript", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "global", "()Lexpo/modules/kotlin/jni/JavaScriptObject;", "createObject", "drainJSEventLoop", "", NotificationConstants.f19487ID, "js", "setNativeStateForSharedObject", "(ILexpo/modules/kotlin/jni/JavaScriptObject;)V", "name", "Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "getJavaScriptModuleObject", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "", "hasModule", "(Ljava/lang/String;)Z", "", "getJavaScriptModulesName", "()[Ljava/lang/String;", "", "native", "registerSharedObject", "(Ljava/lang/Object;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "deleteSharedObject", "(I)V", "Ljava/lang/Class;", "registerClass", "(Ljava/lang/Class;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "getJavascriptClass", "(Ljava/lang/Class;)Lexpo/modules/kotlin/jni/JavaScriptObject;", "getCoreModuleObject", "()Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "mHybridData", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class JSIContext implements Destructible {

    /* renamed from: a */
    public WeakReference f26958a;
    private final HybridData mHybridData = initHybrid();

    static {
        SoLoader.m11076j("expo-modules-core");
    }

    private final native HybridData initHybrid();

    private final native void installJSI(long jsRuntimePointer, JNIDeallocator jniDeallocator, CallInvokerHolderImpl jsInvokerHolder);

    private final native void installJSIForBridgeless(long jsRuntimePointer, JNIDeallocator jniDeallocator, RuntimeExecutor runtimeExecutor);

    private final native void installJSIForTests(JNIDeallocator jniDeallocator);

    @Override // expo.modules.kotlin.jni.Destructible
    /* renamed from: a */
    public final void mo18089a() {
        this.mHybridData.resetNative();
    }

    /* renamed from: b */
    public final WeakReference m18092b() {
        WeakReference weakReference = this.f26958a;
        if (weakReference != null) {
            return weakReference;
        }
        O90.m5977o("appContextHolder");
        throw null;
    }

    /* renamed from: c */
    public final void m18093c(C0134C7 c0134c7, long j, JNIDeallocator jNIDeallocator, CallInvokerHolderImpl callInvokerHolderImpl) {
        O90.m5968f(c0134c7, "appContext");
        O90.m5968f(jNIDeallocator, "jniDeallocator");
        this.f26958a = new WeakReference(c0134c7);
        installJSI(j, jNIDeallocator, callInvokerHolderImpl);
    }

    public final native JavaScriptObject createObject();

    /* renamed from: d */
    public final void m18094d(C0134C7 c0134c7, long j, JNIDeallocator jNIDeallocator, RuntimeExecutor runtimeExecutor) {
        O90.m5968f(c0134c7, "appContext");
        O90.m5968f(jNIDeallocator, "jniDeallocator");
        this.f26958a = new WeakReference(c0134c7);
        installJSIForBridgeless(j, jNIDeallocator, runtimeExecutor);
    }

    public final void deleteSharedObject(int i) {
        C1356VY c1356vy;
        Pair pair;
        C0134C7 c0134c7 = (C0134C7) m18092b().get();
        if (c0134c7 == null || (c1356vy = c0134c7.f1203h) == null) {
            return;
        }
        synchronized (c1356vy) {
            pair = (Pair) ((LinkedHashMap) c1356vy.f12613d).remove(new C10720q01(i));
        }
        if (pair != null) {
            ((SharedObject) pair.f36702a).getClass();
        }
    }

    public final native void drainJSEventLoop();

    public final native JavaScriptValue evaluateScript(String script) throws JavaScriptEvaluateException;

    public final void finalize() {
        mo18089a();
    }

    public final JavaScriptModuleObject getCoreModuleObject() {
        C7558Es0 c7558Es0;
        C0134C7 c0134c7 = (C0134C7) m18092b().get();
        if (c0134c7 == null || (c7558Es0 = c0134c7.f1202g) == null) {
            return null;
        }
        return (JavaScriptModuleObject) c7558Es0.f2935c.getValue();
    }

    public final JavaScriptModuleObject getJavaScriptModuleObject(String name) {
        C7766Is0 c7766Is0;
        C7558Es0 c7558Es0M4060i;
        O90.m5968f(name, "name");
        C0134C7 c0134c7 = (C0134C7) m18092b().get();
        if (c0134c7 == null || (c7766Is0 = c0134c7.f1198c) == null || (c7558Es0M4060i = c7766Is0.m4060i(name)) == null) {
            return null;
        }
        return (JavaScriptModuleObject) c7558Es0M4060i.f2935c.getValue();
    }

    public final String[] getJavaScriptModulesName() {
        C7766Is0 c7766Is0;
        LinkedHashMap linkedHashMap;
        Set setKeySet;
        String[] strArr;
        C0134C7 c0134c7 = (C0134C7) m18092b().get();
        return (c0134c7 == null || (c7766Is0 = c0134c7.f1198c) == null || (linkedHashMap = c7766Is0.f5190b) == null || (setKeySet = linkedHashMap.keySet()) == null || (strArr = (String[]) setKeySet.toArray(new String[0])) == null) ? new String[0] : strArr;
    }

    public final JavaScriptObject getJavascriptClass(Class<?> cls) {
        C0433Gs c0433Gs;
        O90.m5968f(cls, "native");
        C0134C7 c0134c7 = (C0134C7) m18092b().get();
        if (c0134c7 == null || (c0433Gs = c0134c7.f1204i) == null) {
            return null;
        }
        return (JavaScriptObject) c0433Gs.f3933a.get(cls);
    }

    public final native JavaScriptObject global();

    public final boolean hasModule(String name) {
        C7766Is0 c7766Is0;
        O90.m5968f(name, "name");
        C0134C7 c0134c7 = (C0134C7) m18092b().get();
        if (c0134c7 == null || (c7766Is0 = c0134c7.f1198c) == null) {
            return false;
        }
        return c7766Is0.f5190b.containsKey(name);
    }

    public final void registerClass(Class<?> cls, JavaScriptObject js) {
        C0433Gs c0433Gs;
        O90.m5968f(cls, "native");
        O90.m5968f(js, "js");
        C0134C7 c0134c7 = (C0134C7) m18092b().get();
        if (c0134c7 == null || (c0433Gs = c0134c7.f1204i) == null) {
            return;
        }
        js.m18104b(new C7053w5(c0433Gs, cls, false, 2));
        c0433Gs.f3933a.put(cls, js);
    }

    public final void registerSharedObject(Object obj, JavaScriptObject js) throws C6861t2 {
        C1356VY c1356vy;
        O90.m5968f(obj, "native");
        O90.m5968f(js, "js");
        C0134C7 c0134c7 = (C0134C7) m18092b().get();
        if (c0134c7 == null || (c1356vy = c0134c7.f1203h) == null) {
            return;
        }
        SharedObject sharedObject = (SharedObject) obj;
        int iM8484W = c1356vy.m8484W();
        JavaScriptObject.m18103c(iM8484W, js);
        C0134C7 c0134c72 = (C0134C7) ((WeakReference) c1356vy.f12612c).get();
        if (c0134c72 == null) {
            throw new C6861t2(6);
        }
        c0134c72.m986b().setNativeStateForSharedObject(iM8484W, js);
        JavaScriptWeakObject javaScriptWeakObjectCreateWeak = js.createWeak();
        synchronized (c1356vy) {
            ((LinkedHashMap) c1356vy.f12613d).put(new C10720q01(iM8484W), new Pair(sharedObject, javaScriptWeakObjectCreateWeak));
        }
        if (sharedObject.f26964a.get() == null) {
            sharedObject.f26964a = new WeakReference(c0134c72);
        }
    }

    public final native void setNativeStateForSharedObject(int i, JavaScriptObject js);
}

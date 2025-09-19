package expo.modules.kotlin.jni;

import android.os.Trace;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC0824N5;
import p000.AbstractC8418Vg0;
import p000.C0134C7;
import p000.C6479nH;
import p000.O90;
import p000.OY1;

@Metadata(m22266d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0086 ¢\u0006\u0004\b\b\u0010\tJ6\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086 ¢\u0006\u0004\b\u0013\u0010\u0014J6\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0015H\u0086 ¢\u0006\u0004\b\u0016\u0010\u0017JX\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0086 ¢\u0006\u0004\b\u001e\u0010\u001fJL\u0010#\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\f\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010!2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086 ¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0000H\u0086 ¢\u0006\u0004\b&\u0010'J*\u0010-\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010+H\u0086 ¢\u0006\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, m22267d2 = {"Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/react/bridge/NativeMap;", "constants", "LTf1;", "exportConstants", "(Lcom/facebook/react/bridge/NativeMap;)V", "", "name", "", "takesOwner", "", "Lexpo/modules/kotlin/jni/ExpectedType;", "desiredTypes", "Lexpo/modules/kotlin/jni/JNIFunctionBody;", "body", "registerSyncFunction", "(Ljava/lang/String;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "Lexpo/modules/kotlin/jni/JNIAsyncFunctionBody;", "registerAsyncFunction", "(Ljava/lang/String;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIAsyncFunctionBody;)V", "getterTakesOwner", "getterExpectedType", "getter", "setterTakesOwner", "setterExpectedType", "setter", "registerProperty", "(Ljava/lang/String;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "classModule", "Ljava/lang/Class;", "ownerClass", "registerClass", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptModuleObject;ZLjava/lang/Class;[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "viewPrototype", "registerViewPrototype", "(Lexpo/modules/kotlin/jni/JavaScriptModuleObject;)V", "Lexpo/modules/kotlin/jni/JSIContext;", "jsiContext", "eventName", "Lcom/facebook/react/bridge/ReadableNativeMap;", "eventBody", "emitEvent", "(Lexpo/modules/kotlin/jni/JSIContext;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableNativeMap;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class JavaScriptModuleObject implements Destructible {

    /* renamed from: a */
    public final String f26959a;
    private final HybridData mHybridData;

    public JavaScriptModuleObject(JNIDeallocator jNIDeallocator, String str) {
        O90.m5968f(jNIDeallocator, "jniDeallocator");
        this.f26959a = str;
        this.mHybridData = initHybrid();
        jNIDeallocator.addReference(this);
    }

    private final native HybridData initHybrid();

    @Override // expo.modules.kotlin.jni.Destructible
    /* renamed from: a */
    public final void mo18089a() {
        this.mHybridData.resetNative();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Vg0, mZ] */
    /* renamed from: b */
    public final void m18102b(C0134C7 c0134c7, C6479nH c6479nH) {
        WritableNativeMap writableNativeMapMakeNativeMap = Arguments.makeNativeMap((Map<String, Object>) ((AbstractC8418Vg0) c6479nH.f38227a).invoke());
        Trace.beginSection(OY1.m6088f("[ExpoModulesCore] Exporting constants"));
        try {
            O90.m5965c(writableNativeMapMakeNativeMap);
            exportConstants(writableNativeMapMakeNativeMap);
            Trace.endSection();
            Trace.beginSection(OY1.m6088f("[ExpoModulesCore] Attaching functions"));
            try {
                Iterator it = ((LinkedHashMap) c6479nH.f38228b).values().iterator();
                Iterator it2 = ((LinkedHashMap) c6479nH.f38229c).values().iterator();
                O90.m5968f(it, "first");
                O90.m5968f(it2, "second");
                while (true) {
                    if (!(it.hasNext() || it2.hasNext())) {
                        break;
                    } else {
                        ((AbstractC0824N5) (it.hasNext() ? it.next() : it2.next())).mo5538a(c0134c7, this);
                    }
                }
                Trace.endSection();
                Trace.beginSection(OY1.m6088f("[ExpoModulesCore] Attaching properties"));
                try {
                    Iterator it3 = ((LinkedHashMap) c6479nH.f38231e).entrySet().iterator();
                    if (it3.hasNext()) {
                        if (((Map.Entry) it3.next()).getValue() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } finally {
            }
        } finally {
        }
    }

    public final native void emitEvent(JSIContext jsiContext, String eventName, ReadableNativeMap eventBody);

    public final native void exportConstants(NativeMap constants);

    public final void finalize() {
        mo18089a();
    }

    public final native void registerAsyncFunction(String name, boolean takesOwner, ExpectedType[] desiredTypes, JNIAsyncFunctionBody body);

    public final native void registerClass(String name, JavaScriptModuleObject classModule, boolean takesOwner, Class<?> ownerClass, ExpectedType[] desiredTypes, JNIFunctionBody body);

    public final native void registerProperty(String name, boolean getterTakesOwner, ExpectedType[] getterExpectedType, JNIFunctionBody getter, boolean setterTakesOwner, ExpectedType[] setterExpectedType, JNIFunctionBody setter);

    public final native void registerSyncFunction(String name, boolean takesOwner, ExpectedType[] desiredTypes, JNIFunctionBody body);

    public final native void registerViewPrototype(JavaScriptModuleObject viewPrototype);

    public final String toString() {
        return "JavaScriptModuleObject_" + this.f26959a;
    }
}

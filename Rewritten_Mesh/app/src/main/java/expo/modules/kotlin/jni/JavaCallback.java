package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.sharedobjects.SharedRef;
import kotlin.Metadata;
import p000.AbstractC6857sz;
import p000.O90;

@Metadata(m22266d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\u0007\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u0007\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b\u0007\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H\u0082 ¢\u0006\u0004\b\u0007\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\b\u0007\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b\u0007\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0016H\u0082 ¢\u0006\u0004\b\u0007\u0010\u0017J\u001c\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0082 ¢\u0006\u0004\b\u0007\u0010\u0019J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\b\u0007\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001d¨\u0006\u001e"}, m22267d2 = {"Lexpo/modules/kotlin/jni/JavaCallback;", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "LTf1;", "invokeNative", "()V", "", "result", "(I)V", "", "(Z)V", "", "(D)V", "", "(F)V", "", "(Ljava/lang/String;)V", "Lcom/facebook/react/bridge/WritableNativeArray;", "(Lcom/facebook/react/bridge/WritableNativeArray;)V", "Lcom/facebook/react/bridge/WritableNativeMap;", "(Lcom/facebook/react/bridge/WritableNativeMap;)V", "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "(Lexpo/modules/kotlin/sharedobjects/SharedRef;)V", "code", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class JavaCallback implements Destructible {
    private final HybridData mHybridData;

    public JavaCallback(HybridData hybridData) {
        O90.m5968f(hybridData, "mHybridData");
        this.mHybridData = hybridData;
    }

    private final native void invokeNative();

    private final native void invokeNative(double result);

    private final native void invokeNative(float result);

    private final native void invokeNative(int result);

    private final native void invokeNative(WritableNativeArray result);

    private final native void invokeNative(WritableNativeMap result);

    private final native void invokeNative(SharedRef<?> result);

    private final native void invokeNative(String result);

    private final native void invokeNative(String code, String errorMessage);

    private final native void invokeNative(boolean result);

    @Override // expo.modules.kotlin.jni.Destructible
    /* renamed from: a */
    public final void mo18089a() {
        this.mHybridData.resetNative();
    }

    /* renamed from: b */
    public final void m18095b(double d) {
        try {
            invokeNative(d);
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            AbstractC6857sz.f42743a.m5471a("Invalidated JavaCallback was invoked", th);
        }
    }

    /* renamed from: c */
    public final void m18096c(float f) {
        try {
            invokeNative(f);
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            AbstractC6857sz.f42743a.m5471a("Invalidated JavaCallback was invoked", th);
        }
    }

    /* renamed from: d */
    public final void m18097d(int i) {
        try {
            invokeNative(i);
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            AbstractC6857sz.f42743a.m5471a("Invalidated JavaCallback was invoked", th);
        }
    }

    /* renamed from: e */
    public final void m18098e(Object obj) {
        try {
            if (obj == null) {
                invokeNative();
                return;
            }
            if (obj instanceof Integer) {
                invokeNative(((Number) obj).intValue());
                return;
            }
            if (obj instanceof Boolean) {
                invokeNative(((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof Double) {
                invokeNative(((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Float) {
                invokeNative(((Number) obj).floatValue());
                return;
            }
            if (obj instanceof String) {
                invokeNative((String) obj);
                return;
            }
            if (obj instanceof WritableNativeArray) {
                invokeNative((WritableNativeArray) obj);
                return;
            }
            if (obj instanceof WritableNativeMap) {
                invokeNative((WritableNativeMap) obj);
            } else {
                if (obj instanceof SharedRef) {
                    invokeNative((SharedRef<?>) obj);
                    return;
                }
                throw new UnexpectedException("Unknown type: " + obj.getClass());
            }
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            AbstractC6857sz.f42743a.m5471a("Invalidated JavaCallback was invoked", th);
        }
    }

    /* renamed from: f */
    public final void m18099f(String str) {
        O90.m5968f(str, "result");
        try {
            invokeNative(str);
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            AbstractC6857sz.f42743a.m5471a("Invalidated JavaCallback was invoked", th);
        }
    }

    public final void finalize() {
        mo18089a();
    }

    /* renamed from: g */
    public final void m18100g(String str, String str2) {
        O90.m5968f(str, "code");
        try {
            invokeNative(str, str2);
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            AbstractC6857sz.f42743a.m5471a("Invalidated JavaCallback was invoked", th);
        }
    }

    /* renamed from: h */
    public final void m18101h(boolean z) {
        try {
            invokeNative(z);
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            AbstractC6857sz.f42743a.m5471a("Invalidated JavaCallback was invoked", th);
        }
    }
}

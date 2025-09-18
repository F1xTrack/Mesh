package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J4\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0011"}, m22267d2 = {"Lexpo/modules/kotlin/jni/JavaScriptFunction;", "ReturnType", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "thisValue", "", "", "args", "Lexpo/modules/kotlin/jni/ExpectedType;", "expectedReturnType", "invoke", "(Lexpo/modules/kotlin/jni/JavaScriptObject;[Ljava/lang/Object;Lexpo/modules/kotlin/jni/ExpectedType;)Ljava/lang/Object;", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class JavaScriptFunction<ReturnType> implements Destructible {
    private final HybridData mHybridData;

    private JavaScriptFunction(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private final native Object invoke(JavaScriptObject thisValue, Object[] args, ExpectedType expectedReturnType);

    @Override // expo.modules.kotlin.jni.Destructible
    /* renamed from: a */
    public final void mo18089a() {
        this.mHybridData.resetNative();
    }

    public final void finalize() {
        mo18089a();
    }
}

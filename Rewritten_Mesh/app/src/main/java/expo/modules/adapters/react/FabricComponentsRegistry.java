package expo.modules.adapters.react;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082 ¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m22267d2 = {"Lexpo/modules/adapters/react/FabricComponentsRegistry;", "", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "", "", "componentNames", "LTf1;", "registerComponentsRegistry", "([Ljava/lang/String;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class FabricComponentsRegistry {
    private final HybridData mHybridData;

    static {
        SoLoader.m11076j("expo-modules-core");
    }

    private final native HybridData initHybrid();

    private final native void registerComponentsRegistry(String[] componentNames);

    public final void finalize() {
        this.mHybridData.resetNative();
    }
}

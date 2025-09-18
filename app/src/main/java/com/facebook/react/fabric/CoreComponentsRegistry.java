package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\t\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m22267d2 = {"Lcom/facebook/react/fabric/CoreComponentsRegistry;", "", "componentFactory", "Lcom/facebook/react/fabric/ComponentFactory;", "(Lcom/facebook/react/fabric/ComponentFactory;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "()V", "initHybrid", "Companion", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class CoreComponentsRegistry {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final HybridData mHybridData;

    @Metadata(m22266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m22267d2 = {"Lcom/facebook/react/fabric/CoreComponentsRegistry$Companion;", "", "()V", "register", "Lcom/facebook/react/fabric/CoreComponentsRegistry;", "componentFactory", "Lcom/facebook/react/fabric/ComponentFactory;", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CoreComponentsRegistry register(ComponentFactory componentFactory) {
            O90.m5968f(componentFactory, "componentFactory");
            return new CoreComponentsRegistry(componentFactory, null);
        }

        private Companion() {
        }
    }

    static {
        FabricSoLoader.staticInit();
    }

    public /* synthetic */ CoreComponentsRegistry(ComponentFactory componentFactory, DefaultConstructorMarker defaultConstructorMarker) {
        this(componentFactory);
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(ComponentFactory componentFactory);

    public static final CoreComponentsRegistry register(ComponentFactory componentFactory) {
        return INSTANCE.register(componentFactory);
    }

    private CoreComponentsRegistry(ComponentFactory componentFactory) {
        this.mHybridData = initHybrid(componentFactory);
    }
}

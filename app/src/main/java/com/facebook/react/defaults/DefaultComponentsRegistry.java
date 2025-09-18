package com.facebook.react.defaults;

import com.facebook.jni.HybridData;
import com.facebook.react.fabric.ComponentFactory;
import kotlin.Metadata;
import p000.AbstractC10889rJ0;
import p000.C1399WE;
import p000.InterfaceC0965PK;

@Metadata(m22266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0011\b\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0083 ¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m22267d2 = {"Lcom/facebook/react/defaults/DefaultComponentsRegistry;", "", "Lcom/facebook/react/fabric/ComponentFactory;", "componentFactory", "<init>", "(Lcom/facebook/react/fabric/ComponentFactory;)V", "Lcom/facebook/jni/HybridData;", "initHybrid", "(Lcom/facebook/react/fabric/ComponentFactory;)Lcom/facebook/jni/HybridData;", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "()V", "WE", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
@InterfaceC0965PK
/* loaded from: classes.dex */
public final class DefaultComponentsRegistry {

    /* renamed from: a */
    public static final C1399WE f17903a = new C1399WE();

    @InterfaceC0965PK
    private final HybridData mHybridData;

    static {
        AbstractC10889rJ0.f41513a.m383G();
    }

    public /* synthetic */ DefaultComponentsRegistry(ComponentFactory componentFactory, int i) {
        this(componentFactory);
    }

    @InterfaceC0965PK
    private final native HybridData initHybrid(ComponentFactory componentFactory);

    @InterfaceC0965PK
    public static final DefaultComponentsRegistry register(ComponentFactory componentFactory) {
        return f17903a.register(componentFactory);
    }

    @InterfaceC0965PK
    private DefaultComponentsRegistry(ComponentFactory componentFactory) {
        this.mHybridData = initHybrid(componentFactory);
    }
}

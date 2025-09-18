package com.facebook.react.defaults;

import com.facebook.jni.HybridData;
import java.util.List;
import kotlin.Metadata;
import p000.AbstractC10889rJ0;
import p000.AbstractC9487gM0;
import p000.C1837cH;
import p000.InterfaceC0965PK;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m22267d2 = {"Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;", "LgM0;", "bH", "cH", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class DefaultTurboModuleManagerDelegate extends AbstractC9487gM0 {

    /* renamed from: f */
    public static final C1837cH f17904f = new C1837cH();

    static {
        AbstractC10889rJ0.f41513a.m383G();
    }

    @InterfaceC0965PK
    public static final native HybridData initHybrid(List<Object> list);

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public final HybridData initHybrid() {
        throw new UnsupportedOperationException("DefaultTurboModuleManagerDelegate.initHybrid() must never be called!");
    }
}

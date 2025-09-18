package com.facebook.react.bridge;

import javax.inject.Provider;
import p000.AbstractC3929dS;
import p000.InterfaceC9101dL0;

/* loaded from: classes.dex */
public class ModuleSpec {
    private static final String TAG = "ModuleSpec";
    private final String mName;
    private final Provider mProvider;

    private ModuleSpec(Provider provider) {
        this.mProvider = provider;
        this.mName = null;
    }

    public static ModuleSpec nativeModuleSpec(Class<? extends NativeModule> cls, Provider provider) {
        InterfaceC9101dL0 interfaceC9101dL0 = (InterfaceC9101dL0) cls.getAnnotation(InterfaceC9101dL0.class);
        if (interfaceC9101dL0 != null) {
            return new ModuleSpec(provider, interfaceC9101dL0.name());
        }
        AbstractC3929dS.m17683p(TAG);
        return new ModuleSpec(provider, ((NativeModule) provider.get()).getName());
    }

    public static ModuleSpec viewManagerSpec(Provider provider) {
        return new ModuleSpec(provider);
    }

    public String getName() {
        return this.mName;
    }

    public Provider getProvider() {
        return this.mProvider;
    }

    private ModuleSpec(Provider provider, String str) {
        this.mProvider = provider;
        this.mName = str;
    }

    public static ModuleSpec nativeModuleSpec(String str, Provider provider) {
        return new ModuleSpec(provider, str);
    }
}

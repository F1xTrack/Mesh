package ru.p031ok.tracer;

import javax.inject.Provider;
import kotlin.Metadata;
import p000.InterfaceC10293mf0;
import p000.InterfaceC11025sN0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, m22267d2 = {"Lru/ok/tracer/ConfigurationProperty;", "T", "LsN0;", "Lru/ok/tracer/TracerConfiguration;", "Ljavax/inject/Provider;", "provider", "defaultValue", "<init>", "(Ljavax/inject/Provider;Ljava/lang/Object;)V", "thisRef", "Lmf0;", "property", "getValue", "(Lru/ok/tracer/TracerConfiguration;Lmf0;)Ljava/lang/Object;", "Ljavax/inject/Provider;", "Ljava/lang/Object;", "tracer-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ConfigurationProperty<T> implements InterfaceC11025sN0 {
    private final T defaultValue;
    private final Provider provider;

    public ConfigurationProperty(Provider provider, T t) {
        this.provider = provider;
        this.defaultValue = t;
    }

    @Override // p000.InterfaceC11025sN0
    public T getValue(TracerConfiguration thisRef, InterfaceC10293mf0 property) {
        O90.m5968f(thisRef, "thisRef");
        O90.m5968f(property, "property");
        Provider provider = this.provider;
        if (provider == null) {
            return this.defaultValue;
        }
        try {
            return (T) provider.get();
        } catch (Exception unused) {
            return this.defaultValue;
        }
    }
}

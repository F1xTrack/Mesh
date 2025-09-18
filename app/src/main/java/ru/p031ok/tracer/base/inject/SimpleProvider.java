package ru.p031ok.tracer.base.inject;

import javax.inject.Provider;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\r\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0006J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, m22267d2 = {"Lru/ok/tracer/base/inject/SimpleProvider;", "T", "Ljavax/inject/Provider;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lru/ok/tracer/base/inject/SimpleProvider;", "equals", "", "other", "", "get", "hashCode", "", "toString", "", "tracer-base_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
final /* data */ class SimpleProvider<T> implements Provider {
    private final T value;

    public SimpleProvider(T t) {
        this.value = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimpleProvider copy$default(SimpleProvider simpleProvider, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = simpleProvider.value;
        }
        return simpleProvider.copy(obj);
    }

    public final T component1() {
        return this.value;
    }

    public final SimpleProvider<T> copy(T value) {
        return new SimpleProvider<>(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SimpleProvider) && O90.m5963a(this.value, ((SimpleProvider) other).value);
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.value;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t = this.value;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public String toString() {
        return "SimpleProvider(value=" + this.value + ')';
    }
}

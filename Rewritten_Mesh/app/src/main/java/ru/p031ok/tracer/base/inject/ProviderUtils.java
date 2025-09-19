package ru.p031ok.tracer.base.inject;

import javax.inject.Provider;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m22267d2 = {"providerOf", "Ljavax/inject/Provider;", "T", "value", "(Ljava/lang/Object;)Ljavax/inject/Provider;", "tracer-base_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ProviderUtils {
    public static final <T> Provider providerOf(T t) {
        return new SimpleProvider(t);
    }
}

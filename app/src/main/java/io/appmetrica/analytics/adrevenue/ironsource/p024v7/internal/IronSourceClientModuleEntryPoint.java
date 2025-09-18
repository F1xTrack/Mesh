package io.appmetrica.analytics.adrevenue.ironsource.p024v7.internal;

import com.ironsource.mediationsdk.IronSource;
import io.appmetrica.analytics.adrevenue.ironsource.p024v7.impl.C4287b;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;

/* loaded from: classes2.dex */
public class IronSourceClientModuleEntryPoint extends ModuleClientEntryPoint<Object> {

    /* renamed from: a */
    private ClientContext f29558a = null;

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public String getIdentifier() {
        return "ad-revenue-ironsource-v7";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(ClientContext clientContext) {
        this.f29558a = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        ClientContext clientContext;
        if (!ReflectionUtils.detectClassExists("com.ironsource.mediationsdk.IronSource") || (clientContext = this.f29558a) == null) {
            return;
        }
        IronSource.addImpressionDataListener(new C4287b(clientContext));
    }
}

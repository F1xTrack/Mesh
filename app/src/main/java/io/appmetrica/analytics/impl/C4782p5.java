package io.appmetrica.analytics.impl;

import defpackage.AbstractC8069xu;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.p5 */
/* loaded from: classes2.dex */
public final class C4782p5 implements ModuleAdRevenueProcessor, ModuleAdRevenueProcessorsHolder {
    public final ArrayList a = new ArrayList();

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return AbstractC8069xu.H(this.a, null, "Composite processor with " + this.a.size() + " children: [", "]", C4758o5.a, 25);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        Object next;
        boolean zProcess;
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Processing Ad Revenue for " + Arrays.toString(objArr), new Object[0]);
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ModuleAdRevenueProcessor moduleAdRevenueProcessor = (ModuleAdRevenueProcessor) next;
            try {
                zProcess = moduleAdRevenueProcessor.process(Arrays.copyOf(objArr, objArr.length));
                if (!zProcess) {
                    LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue was not processed by " + moduleAdRevenueProcessor.getDescription(), new Object[0]);
                }
            } catch (Throwable th) {
                LoggerStorage.getMainPublicOrAnonymousLogger().error(th, "Got exception from processor " + moduleAdRevenueProcessor.getDescription(), new Object[0]);
            }
            if (zProcess) {
                break;
            }
        }
        boolean z = ((ModuleAdRevenueProcessor) next) != null;
        if (!z) {
            LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue was not processed by " + getDescription() + " since processor for " + Arrays.toString(objArr) + " was not found", new Object[0]);
        }
        return z;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder
    public final void register(ModuleAdRevenueProcessor moduleAdRevenueProcessor) {
        this.a.add(moduleAdRevenueProcessor);
    }
}

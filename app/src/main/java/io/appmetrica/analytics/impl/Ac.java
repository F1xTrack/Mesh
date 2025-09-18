package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface Ac extends Sc {
    List<ModuleServicesDatabase> a();

    /* synthetic */ Map b();

    /* synthetic */ Map c();

    List<Consumer<Location>> d();

    ModuleLocationSourcesServiceController e();

    Toggle f();

    /* synthetic */ List g();
}

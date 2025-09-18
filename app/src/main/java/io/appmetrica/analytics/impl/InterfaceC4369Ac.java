package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Ac */
/* loaded from: classes2.dex */
public interface InterfaceC4369Ac extends InterfaceC4804Sc {
    /* renamed from: a */
    List<ModuleServicesDatabase> mo19190a();

    /* renamed from: b */
    /* synthetic */ Map mo19191b();

    /* renamed from: c */
    /* synthetic */ Map mo19192c();

    /* renamed from: d */
    List<Consumer<Location>> mo19193d();

    /* renamed from: e */
    ModuleLocationSourcesServiceController mo19194e();

    /* renamed from: f */
    Toggle mo19195f();

    /* renamed from: g */
    /* synthetic */ List mo19196g();
}

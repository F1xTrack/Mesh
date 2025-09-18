package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public interface ModuleInstallClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    Task areModulesAvailable(OptionalModuleApi... optionalModuleApiArr);

    Task deferredInstall(OptionalModuleApi... optionalModuleApiArr);

    Task getInstallModulesIntent(OptionalModuleApi... optionalModuleApiArr);

    @ResultIgnorabilityUnspecified
    Task installModules(ModuleInstallRequest moduleInstallRequest);

    Task releaseModules(OptionalModuleApi... optionalModuleApiArr);

    @ResultIgnorabilityUnspecified
    Task unregisterListener(InstallStatusListener installStatusListener);
}

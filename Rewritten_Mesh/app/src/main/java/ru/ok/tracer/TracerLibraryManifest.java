package ru.ok.tracer;

import kotlin.Metadata;
import ru.ok.tracer.manifest.TracerLiteManifest;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lru/ok/tracer/TracerLibraryManifest;", "Lru/ok/tracer/manifest/TracerLiteManifest;", "()V", "appToken", "", "buildUuid", "namespace", "versionName", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerLibraryManifest implements TracerLiteManifest {
    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    public String appToken() {
        return BuildConfig.LIBRARY_TOKEN;
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    public String buildUuid() {
        return null;
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    public String namespace() {
        return BuildConfig.LIBRARY_PACKAGE_NAME;
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    public String versionName() {
        return "1.0.2";
    }
}

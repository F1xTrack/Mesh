package ru.ok.tracer.base.manifest;

import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC6099nZ;
import defpackage.O90;
import kotlin.Metadata;
import ru.ok.tracer.manifest.TracerManifest;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ok/tracer/manifest/TracerManifest;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerManifestUtils$findTracerManifest$1$1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public static final TracerManifestUtils$findTracerManifest$1$1 INSTANCE = new TracerManifestUtils$findTracerManifest$1$1();

    public TracerManifestUtils$findTracerManifest$1$1() {
        super(1);
    }

    @Override // defpackage.InterfaceC6099nZ
    public final CharSequence invoke(TracerManifest tracerManifest) {
        O90.f(tracerManifest, "it");
        return tracerManifest.getClass().getName();
    }
}

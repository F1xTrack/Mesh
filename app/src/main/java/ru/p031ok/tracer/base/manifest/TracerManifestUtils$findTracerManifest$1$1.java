package ru.p031ok.tracer.base.manifest;

import kotlin.Metadata;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6497nZ;
import p000.O90;
import ru.p031ok.tracer.manifest.TracerManifest;

@Metadata(m22266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m22267d2 = {"<anonymous>", "", "it", "Lru/ok/tracer/manifest/TracerManifest;", "invoke"}, m22268k = 3, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TracerManifestUtils$findTracerManifest$1$1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {
    public static final TracerManifestUtils$findTracerManifest$1$1 INSTANCE = new TracerManifestUtils$findTracerManifest$1$1();

    public TracerManifestUtils$findTracerManifest$1$1() {
        super(1);
    }

    @Override // p000.InterfaceC6497nZ
    public final CharSequence invoke(TracerManifest tracerManifest) {
        O90.m5968f(tracerManifest, "it");
        return tracerManifest.getClass().getName();
    }
}

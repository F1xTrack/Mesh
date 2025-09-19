package ru.p031ok.tracer.lite;

import kotlin.Metadata;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;
import ru.p031ok.tracer.base.manifest.TracerLiteManifestUtils;
import ru.p031ok.tracer.manifest.TracerLiteManifest;

@Metadata(m22266d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m22267d2 = {"<anonymous>", "Lru/ok/tracer/manifest/TracerLiteManifest;", "invoke"}, m22268k = 3, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TracerLite$manifest$2 extends AbstractC8418Vg0 implements InterfaceC6434mZ {
    final /* synthetic */ TracerLite this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TracerLite$manifest$2(TracerLite tracerLite) {
        super(0);
        this.this$0 = tracerLite;
    }

    @Override // p000.InterfaceC6434mZ
    public final TracerLiteManifest invoke() {
        try {
            return TracerLiteManifestUtils.requireTracerLiteManifest(this.this$0.getLibraryPackageName());
        } catch (Exception unused) {
            this.this$0.getLibraryPackageName();
            return null;
        }
    }
}

package ru.ok.tracer.lite;

import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC5908mZ;
import kotlin.Metadata;
import ru.ok.tracer.base.manifest.TracerLiteManifestUtils;
import ru.ok.tracer.manifest.TracerLiteManifest;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ok/tracer/manifest/TracerLiteManifest;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerLite$manifest$2 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    final /* synthetic */ TracerLite this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TracerLite$manifest$2(TracerLite tracerLite) {
        super(0);
        this.this$0 = tracerLite;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final TracerLiteManifest invoke() {
        try {
            return TracerLiteManifestUtils.requireTracerLiteManifest(this.this$0.getLibraryPackageName());
        } catch (Exception unused) {
            this.this$0.getLibraryPackageName();
            return null;
        }
    }
}

package ru.ok.tracer.lite;

import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC5908mZ;
import kotlin.Metadata;
import ru.ok.tracer.manifest.TracerLiteManifest;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ok/tracer/lite/TracerLibraryInfo;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerLite$libraryInfo$2 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    final /* synthetic */ TracerLite this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TracerLite$libraryInfo$2(TracerLite tracerLite) {
        super(0);
        this.this$0 = tracerLite;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final TracerLibraryInfo invoke() {
        String strVersionName;
        String libraryPackageName = this.this$0.getLibraryPackageName();
        TracerLiteManifest manifest = this.this$0.getManifest();
        if (manifest == null || (strVersionName = manifest.versionName()) == null) {
            strVersionName = "NA";
        }
        TracerLiteManifest manifest2 = this.this$0.getManifest();
        return new TracerLibraryInfo(libraryPackageName, strVersionName, manifest2 != null ? manifest2.buildUuid() : null);
    }
}

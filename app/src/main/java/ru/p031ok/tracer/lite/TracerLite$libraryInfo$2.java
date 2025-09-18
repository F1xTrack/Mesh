package ru.p031ok.tracer.lite;

import kotlin.Metadata;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;
import ru.p031ok.tracer.manifest.TracerLiteManifest;

@Metadata(m22266d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m22267d2 = {"<anonymous>", "Lru/ok/tracer/lite/TracerLibraryInfo;", "invoke"}, m22268k = 3, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TracerLite$libraryInfo$2 extends AbstractC8418Vg0 implements InterfaceC6434mZ {
    final /* synthetic */ TracerLite this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TracerLite$libraryInfo$2(TracerLite tracerLite) {
        super(0);
        this.this$0 = tracerLite;
    }

    @Override // p000.InterfaceC6434mZ
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

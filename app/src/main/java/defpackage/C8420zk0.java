package defpackage;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.Map;

/* renamed from: zk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8420zk0 extends H41 {
    public final /* synthetic */ C6589q70 f;
    public final /* synthetic */ C0051Ak0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8420zk0(C0051Ak0 c0051Ak0, AbstractC1516Tf abstractC1516Tf, E90 e90, RD0 rd0, C6589q70 c6589q70) {
        super(abstractC1516Tf, e90, rd0, "LocalExifThumbnailProducer");
        this.g = c0051Ak0;
        this.f = c6589q70;
    }

    @Override // defpackage.H41
    public final void b(Object obj) {
        EncodedImage.closeSafely((EncodedImage) obj);
    }

    @Override // defpackage.H41
    public final Map c(Object obj) {
        return C1723Vw.a("createdThumbnail", Boolean.toString(((EncodedImage) obj) != null));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
    @Override // defpackage.H41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8420zk0.d():java.lang.Object");
    }
}

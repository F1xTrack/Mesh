package p000;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.Map;

/* renamed from: zk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11963zk0 extends H41 {

    /* renamed from: f */
    public final /* synthetic */ C10737q70 f46971f;

    /* renamed from: g */
    public final /* synthetic */ C7334Ak0 f46972g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11963zk0(C7334Ak0 c7334Ak0, AbstractC1237Tf abstractC1237Tf, E90 e90, RD0 rd0, C10737q70 c10737q70) {
        super(abstractC1237Tf, e90, rd0, "LocalExifThumbnailProducer");
        this.f46972g = c7334Ak0;
        this.f46971f = c10737q70;
    }

    @Override // p000.H41
    /* renamed from: b */
    public final void mo845b(Object obj) {
        EncodedImage.closeSafely((EncodedImage) obj);
    }

    @Override // p000.H41
    /* renamed from: c */
    public final Map mo846c(Object obj) {
        return C1380Vw.m8640a("createdThumbnail", Boolean.toString(((EncodedImage) obj) != null));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
    @Override // p000.H41
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo847d() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11963zk0.mo847d():java.lang.Object");
    }
}

package p000;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.HashMap;

/* renamed from: aS0 */
/* loaded from: classes.dex */
public final class C8726aS0 extends AbstractC7254zH {

    /* renamed from: c */
    public final boolean f15515c;

    /* renamed from: d */
    public final C10065kt0 f15516d;

    /* renamed from: e */
    public final RD0 f15517e;

    /* renamed from: f */
    public boolean f15518f;

    /* renamed from: g */
    public final C8512Xb0 f15519g;

    /* renamed from: h */
    public final /* synthetic */ C8854bS0 f15520h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8726aS0(C8854bS0 c8854bS0, AbstractC1237Tf abstractC1237Tf, RD0 rd0, boolean z, C10065kt0 c10065kt0) {
        super(abstractC1237Tf);
        this.f15520h = c8854bS0;
        this.f15518f = false;
        this.f15517e = rd0;
        C7027vg c7027vg = (C7027vg) rd0;
        c7027vg.f44473a.getClass();
        this.f15515c = z;
        this.f15516d = c10065kt0;
        this.f15519g = new C8512Xb0(c8854bS0.f17029a, new C8342Tu0(27, this));
        c7027vg.m25462a(new E40(this, abstractC1237Tf, false, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x007e  */
    @Override // p000.AbstractC1237Tf
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo6846h(int r14, java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8726aS0.mo6846h(int, java.lang.Object):void");
    }

    /* renamed from: m */
    public final C1380Vw m9747m(EncodedImage encodedImage, C9115dS0 c9115dS0, C3979eG c3979eG, String str) {
        String str2;
        long j;
        RD0 rd0 = this.f15517e;
        if (!((C7027vg) rd0).f44475c.mo751i(rd0, "ResizeAndRotateProducer")) {
            return null;
        }
        String str3 = encodedImage.getWidth() + "x" + encodedImage.getHeight();
        if (c9115dS0 != null) {
            str2 = c9115dS0.f26115a + "x" + c9115dS0.f26116b;
        } else {
            str2 = "Unspecified";
        }
        HashMap map = new HashMap();
        map.put("Image format", String.valueOf(encodedImage.getImageFormat()));
        map.put("Original size", str3);
        map.put("Requested size", str2);
        C8512Xb0 c8512Xb0 = this.f15519g;
        synchronized (c8512Xb0) {
            j = c8512Xb0.f13866i - c8512Xb0.f13865h;
        }
        map.put("queueTime", String.valueOf(j));
        map.put("Transcoder id", str);
        map.put("Transcoding result", String.valueOf(c3979eG));
        return new C1380Vw(map);
    }
}

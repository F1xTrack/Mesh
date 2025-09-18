package defpackage;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.HashMap;

/* renamed from: aS0 */
/* loaded from: classes.dex */
public final class C2137aS0 extends AbstractC8332zH {
    public final boolean c;
    public final C5587kt0 d;
    public final RD0 e;
    public boolean f;
    public final C1817Xb0 g;
    public final /* synthetic */ C2328bS0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2137aS0(C2328bS0 c2328bS0, AbstractC1516Tf abstractC1516Tf, RD0 rd0, boolean z, C5587kt0 c5587kt0) {
        super(abstractC1516Tf);
        this.h = c2328bS0;
        this.f = false;
        this.e = rd0;
        C7647vg c7647vg = (C7647vg) rd0;
        c7647vg.a.getClass();
        this.c = z;
        this.d = c5587kt0;
        this.g = new C1817Xb0(c2328bS0.a, new C1562Tu0(27, this));
        c7647vg.a(new E40(this, abstractC1516Tf, false, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x007e  */
    @Override // defpackage.AbstractC1516Tf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r14, java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2137aS0.h(int, java.lang.Object):void");
    }

    public final C1723Vw m(EncodedImage encodedImage, C3394dS0 c3394dS0, C3547eG c3547eG, String str) {
        String str2;
        long j;
        RD0 rd0 = this.e;
        if (!((C7647vg) rd0).c.i(rd0, "ResizeAndRotateProducer")) {
            return null;
        }
        String str3 = encodedImage.getWidth() + "x" + encodedImage.getHeight();
        if (c3394dS0 != null) {
            str2 = c3394dS0.a + "x" + c3394dS0.b;
        } else {
            str2 = "Unspecified";
        }
        HashMap map = new HashMap();
        map.put("Image format", String.valueOf(encodedImage.getImageFormat()));
        map.put("Original size", str3);
        map.put("Requested size", str2);
        C1817Xb0 c1817Xb0 = this.g;
        synchronized (c1817Xb0) {
            j = c1817Xb0.i - c1817Xb0.h;
        }
        map.put("queueTime", String.valueOf(j));
        map.put("Transcoder id", str);
        map.put("Transcoding result", String.valueOf(c3547eG));
        return new C1723Vw(map);
    }
}

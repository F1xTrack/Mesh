package defpackage;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: Yi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1917Yi1 implements InterfaceC6079nS0 {
    public static final C8272yy0 d = new C8272yy0("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C1683Vi1());
    public static final C8272yy0 e = new C8272yy0("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new LF());
    public static final C5806m12 f = new C5806m12(22);
    public static final List g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    public final InterfaceC1839Xi1 a;
    public final InterfaceC5935mi b;
    public final C5806m12 c = f;

    public C1917Yi1(InterfaceC5935mi interfaceC5935mi, InterfaceC1839Xi1 interfaceC1839Xi1) {
        this.b = interfaceC5935mi;
        this.a = interfaceC1839Xi1;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r11, long r12, int r14, int r15, int r16, defpackage.AbstractC2496cL r17) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1917Yi1.c(android.media.MediaMetadataRetriever, long, int, int, int, cL):android.graphics.Bitmap");
    }

    @Override // defpackage.InterfaceC6079nS0
    public final boolean a(Object obj, C0795Jy0 c0795Jy0) {
        return true;
    }

    @Override // defpackage.InterfaceC6079nS0
    public final InterfaceC5506kS0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) throws IOException {
        long jLongValue = ((Long) c0795Jy0.c(d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(NX.g(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) c0795Jy0.c(e);
        if (num == null) {
            num = 2;
        }
        AbstractC2496cL abstractC2496cL = (AbstractC2496cL) c0795Jy0.c(AbstractC2496cL.f);
        if (abstractC2496cL == null) {
            abstractC2496cL = AbstractC2496cL.e;
        }
        AbstractC2496cL abstractC2496cL2 = abstractC2496cL;
        this.c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.a.o(mediaMetadataRetriever, obj);
            return C6126ni.b(this.b, c(mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, abstractC2496cL2));
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.release();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }
}

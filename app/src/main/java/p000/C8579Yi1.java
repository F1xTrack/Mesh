package p000;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: Yi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8579Yi1 implements InterfaceC10395nS0 {

    /* renamed from: d */
    public static final C11864yy0 f14471d = new C11864yy0("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C8423Vi1());

    /* renamed from: e */
    public static final C11864yy0 f14472e = new C11864yy0("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C0709LF());

    /* renamed from: f */
    public static final C10212m12 f14473f = new C10212m12(22);

    /* renamed from: g */
    public static final List f14474g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a */
    public final InterfaceC8527Xi1 f14475a;

    /* renamed from: b */
    public final InterfaceC6443mi f14476b;

    /* renamed from: c */
    public final C10212m12 f14477c = f14473f;

    public C8579Yi1(InterfaceC6443mi interfaceC6443mi, InterfaceC8527Xi1 interfaceC8527Xi1) {
        this.f14476b = interfaceC6443mi;
        this.f14475a = interfaceC8527Xi1;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap m9343c(android.media.MediaMetadataRetriever r11, long r12, int r14, int r15, int r16, p000.AbstractC1841cL r17) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8579Yi1.m9343c(android.media.MediaMetadataRetriever, long, int, int, int, cL):android.graphics.Bitmap");
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: a */
    public final boolean mo9107a(Object obj, C7830Jy0 c7830Jy0) {
        return true;
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: b */
    public final InterfaceC10011kS0 mo9108b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) throws IOException {
        long jLongValue = ((Long) c7830Jy0.m4482c(f14471d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(AbstractC0852NX.m5758g(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) c7830Jy0.m4482c(f14472e);
        if (num == null) {
            num = 2;
        }
        AbstractC1841cL abstractC1841cL = (AbstractC1841cL) c7830Jy0.m4482c(AbstractC1841cL.f17437f);
        if (abstractC1841cL == null) {
            abstractC1841cL = AbstractC1841cL.f17436e;
        }
        AbstractC1841cL abstractC1841cL2 = abstractC1841cL;
        this.f14477c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f14475a.mo5749o(mediaMetadataRetriever, obj);
            return C6506ni.m23171b(this.f14476b, m9343c(mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, abstractC1841cL2));
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.release();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }
}

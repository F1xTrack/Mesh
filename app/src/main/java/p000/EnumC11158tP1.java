package p000;

/* renamed from: tP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC11158tP1 implements InterfaceC7467Cy1 {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    /* JADX INFO: Fake field, exist only in values array */
    JPEG(8),
    BITMAP(4),
    /* JADX INFO: Fake field, exist only in values array */
    CM_SAMPLE_BUFFER_REF(5),
    /* JADX INFO: Fake field, exist only in values array */
    UI_IMAGE(6),
    /* JADX INFO: Fake field, exist only in values array */
    CV_PIXEL_BUFFER_REF(9);


    /* renamed from: a */
    public final int f43058a;

    EnumC11158tP1(int i) {
        this.f43058a = i;
    }

    @Override // p000.InterfaceC7467Cy1
    public final int zza() {
        return this.f43058a;
    }
}

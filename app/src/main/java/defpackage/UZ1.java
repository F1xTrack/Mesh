package defpackage;

/* loaded from: classes.dex */
public enum UZ1 implements InterfaceC5859mI1 {
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

    public final int a;

    UZ1(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC5859mI1
    public final int zza() {
        return this.a;
    }
}

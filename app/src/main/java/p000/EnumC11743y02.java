package p000;

/* renamed from: y02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC11743y02 implements InterfaceC10248mI1 {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(128),
    FORMAT_QR_CODE(256),
    FORMAT_UPC_A(512),
    FORMAT_UPC_E(1024),
    FORMAT_PDF417(2048),
    FORMAT_AZTEC(4096);


    /* renamed from: a */
    public final int f46023a;

    EnumC11743y02(int i) {
        this.f46023a = i;
    }

    @Override // p000.InterfaceC10248mI1
    public final int zza() {
        return this.f46023a;
    }
}

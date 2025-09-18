package defpackage;

/* renamed from: y02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC8091y02 implements InterfaceC5859mI1 {
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

    public final int a;

    EnumC8091y02(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC5859mI1
    public final int zza() {
        return this.a;
    }
}

package p000;

/* loaded from: classes.dex */
public enum X22 implements InterfaceC10248mI1 {
    /* JADX INFO: Fake field, exist only in values array */
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    /* JADX INFO: Fake field, exist only in values array */
    DATABAR(14),
    /* JADX INFO: Fake field, exist only in values array */
    TEZ_CODE(16);


    /* renamed from: a */
    public final int f13547a;

    X22(int i) {
        this.f13547a = i;
    }

    @Override // p000.InterfaceC10248mI1
    public final int zza() {
        return this.f13547a;
    }
}

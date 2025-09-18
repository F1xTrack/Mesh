package defpackage;

/* renamed from: jl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC5372jl0 implements TF0 {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    public final int a;

    EnumC5372jl0(int i2) {
        this.a = i2;
    }

    @Override // defpackage.TF0
    public final int a() {
        return this.a;
    }
}

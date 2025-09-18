package io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo;

/* loaded from: classes2.dex */
public enum ChargeType {
    UNKNOWN(-1),
    NONE(0),
    USB(1),
    WIRELESS(2),
    AC(3);


    /* renamed from: a */
    private final int f29670a;

    ChargeType(int i) {
        this.f29670a = i;
    }

    public static ChargeType fromId(Integer num) {
        if (num != null) {
            for (ChargeType chargeType : values()) {
                if (chargeType.getId() == num.intValue()) {
                    return chargeType;
                }
            }
        }
        return UNKNOWN;
    }

    public int getId() {
        return this.f29670a;
    }
}

package defpackage;

import java.util.Arrays;

/* renamed from: Jx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0793Jx1 {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);

    public static final C5262jA1 c;
    public final int a;

    static {
        VY vy = new VY(22, 0 == true ? 1 : 0);
        vy.c = new Object[8];
        vy.b = 0;
        for (EnumC0793Jx1 enumC0793Jx1 : values()) {
            Integer numValueOf = Integer.valueOf(enumC0793Jx1.a);
            int i = vy.b + 1;
            Object[] objArr = (Object[]) vy.c;
            int length = objArr.length;
            int i2 = i + i;
            if (i2 > length) {
                int i3 = length + (length >> 1) + 1;
                if (i3 < i2) {
                    int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                    i3 = iHighestOneBit + iHighestOneBit;
                }
                vy.c = Arrays.copyOf(objArr, i3 < 0 ? Integer.MAX_VALUE : i3);
            }
            Object[] objArr2 = (Object[]) vy.c;
            int i4 = vy.b;
            int i5 = i4 + i4;
            objArr2[i5] = numValueOf;
            objArr2[i5 + 1] = enumC0793Jx1;
            vy.b = i4 + 1;
        }
        C1809Wy1 c1809Wy1 = (C1809Wy1) vy.d;
        if (c1809Wy1 != null) {
            throw c1809Wy1.a();
        }
        C5262jA1 c5262jA1A = C5262jA1.a(vy.b, (Object[]) vy.c, vy);
        C1809Wy1 c1809Wy12 = (C1809Wy1) vy.d;
        if (c1809Wy12 != null) {
            throw c1809Wy12.a();
        }
        c = c5262jA1A;
    }

    EnumC0793Jx1(int i) {
        this.a = i;
    }
}

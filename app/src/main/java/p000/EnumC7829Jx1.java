package p000;

import java.util.Arrays;

/* renamed from: Jx1 */
/* loaded from: classes.dex */
public enum EnumC7829Jx1 {
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


    /* renamed from: c */
    public static final C9848jA1 f5816c;

    /* renamed from: a */
    public final int f5818a;

    /* renamed from: EF18 */
    EnumC7829Jx1 SERVICE_TIMEOUT;

    /* renamed from: EF27 */
    EnumC7829Jx1 FEATURE_NOT_SUPPORTED;

    /* renamed from: EF36 */
    EnumC7829Jx1 SERVICE_DISCONNECTED;

    /* renamed from: EF44 */
    EnumC7829Jx1 OK;

    /* renamed from: EF52 */
    EnumC7829Jx1 USER_CANCELED;

    /* renamed from: EF60 */
    EnumC7829Jx1 SERVICE_UNAVAILABLE;

    /* renamed from: EF68 */
    EnumC7829Jx1 BILLING_UNAVAILABLE;

    /* renamed from: EF77 */
    EnumC7829Jx1 ITEM_UNAVAILABLE;

    /* renamed from: EF86 */
    EnumC7829Jx1 DEVELOPER_ERROR;

    /* renamed from: EF95 */
    EnumC7829Jx1 ERROR;

    /* renamed from: EF104 */
    EnumC7829Jx1 ITEM_ALREADY_OWNED;

    /* renamed from: EF113 */
    EnumC7829Jx1 ITEM_NOT_OWNED;

    /* renamed from: EF126 */
    EnumC7829Jx1 EXPIRED_OFFER_TOKEN;

    /* renamed from: EF139 */
    EnumC7829Jx1 NETWORK_ERROR;

    static {
        C1356VY c1356vy = new C1356VY(22, (byte) 0);
        c1356vy.f12612c = new Object[8];
        c1356vy.f12611b = 0;
        for (EnumC7829Jx1 enumC7829Jx1 : values()) {
            Integer numValueOf = Integer.valueOf(enumC7829Jx1.f5818a);
            int i = c1356vy.f12611b + 1;
            Object[] objArr = (Object[]) c1356vy.f12612c;
            int length = objArr.length;
            int i2 = i + i;
            if (i2 > length) {
                int i3 = length + (length >> 1) + 1;
                if (i3 < i2) {
                    int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                    i3 = iHighestOneBit + iHighestOneBit;
                }
                c1356vy.f12612c = Arrays.copyOf(objArr, i3 < 0 ? Integer.MAX_VALUE : i3);
            }
            Object[] objArr2 = (Object[]) c1356vy.f12612c;
            int i4 = c1356vy.f12611b;
            int i5 = i4 + i4;
            objArr2[i5] = numValueOf;
            objArr2[i5 + 1] = enumC7829Jx1;
            c1356vy.f12611b = i4 + 1;
        }
        C8507Wy1 c8507Wy1 = (C8507Wy1) c1356vy.f12613d;
        if (c8507Wy1 != null) {
            throw c8507Wy1.m8904a();
        }
        C9848jA1 c9848jA1M21983a = C9848jA1.m21983a(c1356vy.f12611b, (Object[]) c1356vy.f12612c, c1356vy);
        C8507Wy1 c8507Wy12 = (C8507Wy1) c1356vy.f12613d;
        if (c8507Wy12 != null) {
            throw c8507Wy12.m8904a();
        }
        f5816c = c9848jA1M21983a;
    }

    EnumC7829Jx1(int i) {
        this.f5818a = i;
    }
}

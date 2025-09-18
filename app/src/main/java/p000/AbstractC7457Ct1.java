package p000;

import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthNr;

/* renamed from: Ct1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC7457Ct1 {
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ CellIdentityNr m1444d(Object obj) {
        return (CellIdentityNr) obj;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ CellInfoNr m1445e(CellInfo cellInfo) {
        return (CellInfoNr) cellInfo;
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ CellInfoTdscdma m1446f(CellInfo cellInfo) {
        return (CellInfoTdscdma) cellInfo;
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ CellSignalStrengthNr m1448h(CellSignalStrength cellSignalStrength) {
        return (CellSignalStrengthNr) cellSignalStrength;
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ boolean m1451k(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoTdscdma;
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ boolean m1454n(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoNr;
    }
}

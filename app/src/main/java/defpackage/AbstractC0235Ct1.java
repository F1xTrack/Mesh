package defpackage;

import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthNr;

/* renamed from: Ct1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0235Ct1 {
    public static /* bridge */ /* synthetic */ CellIdentityNr d(Object obj) {
        return (CellIdentityNr) obj;
    }

    public static /* bridge */ /* synthetic */ CellInfoNr e(CellInfo cellInfo) {
        return (CellInfoNr) cellInfo;
    }

    public static /* bridge */ /* synthetic */ CellInfoTdscdma f(CellInfo cellInfo) {
        return (CellInfoTdscdma) cellInfo;
    }

    public static /* bridge */ /* synthetic */ CellSignalStrengthNr h(CellSignalStrength cellSignalStrength) {
        return (CellSignalStrengthNr) cellSignalStrength;
    }

    public static /* bridge */ /* synthetic */ boolean k(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoTdscdma;
    }

    public static /* bridge */ /* synthetic */ boolean n(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoNr;
    }
}

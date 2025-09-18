package com.yandex.runtime.sensors.internal.telephony;

import android.os.Build;
import android.os.SystemClock;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class TelephonyUtils {
    private static GsmCellInfo convert(CellInfoGsm cellInfoGsm) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        if (cellIdentity.getCid() == Integer.MAX_VALUE || cellIdentity.getLac() == Integer.MAX_VALUE || cellIdentity.getMcc() == Integer.MAX_VALUE || cellIdentity.getMnc() == Integer.MAX_VALUE) {
            return null;
        }
        int timingAdvance = Build.VERSION.SDK_INT >= 26 ? cellInfoGsm.getCellSignalStrength().getTimingAdvance() : Integer.MAX_VALUE;
        return new GsmCellInfo(cellIdentity.getCid(), cellIdentity.getLac(), cellInfoGsm.getCellSignalStrength().getDbm(), cellIdentity.getMcc(), cellIdentity.getMnc(), timingAdvance != Integer.MAX_VALUE ? new Integer(timingAdvance) : null, CellType.Gsm, eventNanosToTimestampMilliseconds(cellInfoGsm.getTimeStamp()), null, null);
    }

    public static List<GsmCellInfo> convertCellInfo(List<CellInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (CellInfo cellInfo : list) {
            GsmCellInfo gsmCellInfoConvert = cellInfo instanceof CellInfoGsm ? convert((CellInfoGsm) cellInfo) : cellInfo instanceof CellInfoLte ? convert((CellInfoLte) cellInfo) : cellInfo instanceof CellInfoWcdma ? convert((CellInfoWcdma) cellInfo) : null;
            if (gsmCellInfoConvert != null) {
                arrayList.add(gsmCellInfoConvert);
            }
        }
        return arrayList;
    }

    private static long eventNanosToTimestampMilliseconds(long j) {
        return (j / 1000000) + (System.currentTimeMillis() - SystemClock.elapsedRealtime());
    }

    private static int replaceUnavailableToZero(int i) {
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    private static GsmCellInfo convert(CellInfoLte cellInfoLte) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        int pci = cellIdentity.getPci();
        int earfcn = Build.VERSION.SDK_INT >= 24 ? cellIdentity.getEarfcn() : Integer.MAX_VALUE;
        if (pci == Integer.MAX_VALUE && (cellIdentity.getCi() == Integer.MAX_VALUE || cellIdentity.getTac() == Integer.MAX_VALUE || cellIdentity.getMcc() == Integer.MAX_VALUE || cellIdentity.getMnc() == Integer.MAX_VALUE)) {
            return null;
        }
        int timingAdvance = cellInfoLte.getCellSignalStrength().getTimingAdvance();
        return new GsmCellInfo(replaceUnavailableToZero(cellIdentity.getCi()), replaceUnavailableToZero(cellIdentity.getTac()), cellInfoLte.getCellSignalStrength().getDbm(), replaceUnavailableToZero(cellIdentity.getMcc()), replaceUnavailableToZero(cellIdentity.getMnc()), timingAdvance == Integer.MAX_VALUE ? null : new Integer(timingAdvance), CellType.Lte, eventNanosToTimestampMilliseconds(cellInfoLte.getTimeStamp()), pci == Integer.MAX_VALUE ? null : new Integer(pci), earfcn != Integer.MAX_VALUE ? new Integer(earfcn) : null);
    }

    private static GsmCellInfo convert(CellInfoWcdma cellInfoWcdma) {
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        if (cellIdentity.getCid() == Integer.MAX_VALUE || cellIdentity.getLac() == Integer.MAX_VALUE || cellIdentity.getMcc() == Integer.MAX_VALUE || cellIdentity.getMnc() == Integer.MAX_VALUE) {
            return null;
        }
        return new GsmCellInfo(cellIdentity.getCid(), cellIdentity.getLac(), cellInfoWcdma.getCellSignalStrength().getDbm(), cellIdentity.getMcc(), cellIdentity.getMnc(), null, CellType.Wcdma, eventNanosToTimestampMilliseconds(cellInfoWcdma.getTimeStamp()), null, null);
    }
}

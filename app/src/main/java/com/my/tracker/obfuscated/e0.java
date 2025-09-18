package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.my.tracker.obfuscated.d0;
import defpackage.AbstractC0235Ct1;
import defpackage.C0350Eg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class e0 {
    private static final d0.k a = new d0.k(null, Collections.emptyList());
    public static int b = 5;

    private List a(Context context) {
        d0.h hVarA;
        d0.b bVarA;
        if (Build.VERSION.SDK_INT >= 29 ? n1.a("android.permission.ACCESS_FINE_LOCATION", context) : n1.a("android.permission.ACCESS_COARSE_LOCATION", context)) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    return Collections.emptyList();
                }
                List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                if (allCellInfo != null && !allCellInfo.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (CellInfo cellInfo : allCellInfo) {
                        if (cellInfo.isRegistered()) {
                            if (cellInfo instanceof CellInfoCdma) {
                                bVarA = a((CellInfoCdma) cellInfo);
                            } else if (cellInfo instanceof CellInfoGsm) {
                                bVarA = a((CellInfoGsm) cellInfo);
                            } else if (cellInfo instanceof CellInfoLte) {
                                bVarA = a((CellInfoLte) cellInfo);
                            } else if (cellInfo instanceof CellInfoWcdma) {
                                bVarA = a((CellInfoWcdma) cellInfo);
                            } else {
                                int i = Build.VERSION.SDK_INT;
                                if (i >= 29 && AbstractC0235Ct1.k(cellInfo)) {
                                    bVarA = a(AbstractC0235Ct1.f(cellInfo));
                                } else if (i >= 29 && AbstractC0235Ct1.n(cellInfo)) {
                                    bVarA = a(AbstractC0235Ct1.e(cellInfo));
                                }
                            }
                            arrayList.add(bVarA);
                        }
                    }
                    if (arrayList.isEmpty() && (hVarA = a(telephonyManager)) != null) {
                        arrayList.add(hVarA);
                    }
                    return arrayList;
                }
                return Collections.emptyList();
            } catch (Throwable th) {
                y2.a("EnvironmentParamsDataProvider: exception during collecting c-info", th);
            }
        } else {
            y2.a("EnvironmentParamsDataProvider: can't access information");
        }
        return Collections.emptyList();
    }

    private d0.k c(Context context) {
        d0.j jVar;
        if (!n1.a("android.permission.ACCESS_WIFI_STATE", context)) {
            return a;
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager != null && wifiManager.isWifiEnabled()) {
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                if (connectionInfo != null) {
                    String ssid = connectionInfo.getSSID();
                    String bssid = connectionInfo.getBSSID();
                    jVar = new d0.j(ssid == null ? "<null>" : ssid, bssid == null ? "<null>" : bssid, connectionInfo.getRssi(), connectionInfo.getNetworkId(), connectionInfo.getLinkSpeed());
                } else {
                    jVar = null;
                }
                if (Build.VERSION.SDK_INT >= 24 && !n1.a("android.permission.ACCESS_FINE_LOCATION", context) && !n1.a("android.permission.ACCESS_COARSE_LOCATION", context)) {
                    return new d0.k(jVar, Collections.emptyList());
                }
                List<ScanResult> scanResults = wifiManager.getScanResults();
                if (scanResults != null && !scanResults.isEmpty()) {
                    Collections.sort(scanResults, new C0350Eg(26));
                    int iMin = Math.min(scanResults.size(), b);
                    ArrayList arrayList = new ArrayList(iMin);
                    for (int i = 0; i < iMin; i++) {
                        ScanResult scanResult = scanResults.get(i);
                        String str = scanResult.SSID;
                        String str2 = scanResult.BSSID;
                        if (str == null) {
                            str = "<null>";
                        }
                        if (str2 == null) {
                            str2 = "<null>";
                        }
                        arrayList.add(new d0.a(str, str2, scanResult.level));
                    }
                    return new d0.k(jVar, arrayList);
                }
                return new d0.k(jVar, Collections.emptyList());
            }
            return a;
        } catch (Throwable th) {
            y2.a("EnvironmentParamsDataProvider: exception during collecting w-info", th);
            return a;
        }
    }

    private d0.c a(CellInfoCdma cellInfoCdma) {
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        int networkId = cellIdentity.getNetworkId();
        int systemId = cellIdentity.getSystemId();
        int basestationId = cellIdentity.getBasestationId();
        int latitude = cellIdentity.getLatitude();
        int longitude = cellIdentity.getLongitude();
        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
        return new d0.c(networkId, systemId, basestationId, latitude, longitude, cellSignalStrength.getCdmaLevel(), cellSignalStrength.getCdmaDbm(), cellSignalStrength.getCdmaEcio(), cellSignalStrength.getEvdoLevel(), cellSignalStrength.getEvdoDbm(), cellSignalStrength.getEvdoEcio(), cellSignalStrength.getEvdoSnr());
    }

    public d0 b(Context context) {
        return new d0(a(context), c(context));
    }

    private d0.d a(CellInfoGsm cellInfoGsm) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        return new d0.d(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), i >= 24 ? cellIdentity.getArfcn() : -1, i >= 24 ? cellIdentity.getBsic() : -1, cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), i >= 26 ? cellSignalStrength.getTimingAdvance() : -1);
    }

    private d0.e a(CellInfoLte cellInfoLte) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        return new d0.e(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCi(), cellIdentity.getTac(), i >= 24 ? cellIdentity.getEarfcn() : -1, i >= 24 ? cellIdentity.getPci() : -1, cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), i >= 26 ? cellSignalStrength.getTimingAdvance() : -1);
    }

    private d0.f a(CellInfoNr cellInfoNr) {
        CellIdentityNr cellIdentityNrD = AbstractC0235Ct1.d(cellInfoNr.getCellIdentity());
        CellSignalStrengthNr cellSignalStrengthNrH = AbstractC0235Ct1.h(cellInfoNr.getCellSignalStrength());
        return new d0.f(cellIdentityNrD.getMccString(), cellIdentityNrD.getMncString(), cellIdentityNrD.getNci(), cellIdentityNrD.getTac(), cellIdentityNrD.getNrarfcn(), cellIdentityNrD.getPci(), cellSignalStrengthNrH.getLevel(), cellSignalStrengthNrH.getDbm(), cellSignalStrengthNrH.getAsuLevel());
    }

    private d0.g a(CellInfoTdscdma cellInfoTdscdma) {
        CellIdentityTdscdma cellIdentity = cellInfoTdscdma.getCellIdentity();
        CellSignalStrengthTdscdma cellSignalStrength = cellInfoTdscdma.getCellSignalStrength();
        return new d0.g(cellIdentity.getMccString(), cellIdentity.getMncString(), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getUarfcn(), cellIdentity.getCpid(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    private d0.h a(TelephonyManager telephonyManager) {
        String str;
        String strSubstring;
        CellLocation cellLocation = telephonyManager.getCellLocation();
        String strSubstring2 = null;
        if (!(cellLocation instanceof GsmCellLocation)) {
            return null;
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        if (TextUtils.isEmpty(networkOperator)) {
            str = null;
        } else {
            try {
                strSubstring = networkOperator.substring(0, 3);
                try {
                    strSubstring2 = networkOperator.substring(3);
                } catch (Throwable unused) {
                    y2.a("EnvironmentParamsDataProvider: unable to substring network operator " + networkOperator);
                    str = strSubstring2;
                    strSubstring2 = strSubstring;
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                    return new d0.h(strSubstring2, str, gsmCellLocation.getCid(), gsmCellLocation.getLac());
                }
            } catch (Throwable unused2) {
                strSubstring = null;
            }
            str = strSubstring2;
            strSubstring2 = strSubstring;
        }
        GsmCellLocation gsmCellLocation2 = (GsmCellLocation) cellLocation;
        return new d0.h(strSubstring2, str, gsmCellLocation2.getCid(), gsmCellLocation2.getLac());
    }

    private d0.i a(CellInfoWcdma cellInfoWcdma) {
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        CellSignalStrengthWcdma cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        return new d0.i(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), i >= 24 ? cellIdentity.getUarfcn() : -1, i >= 24 ? cellIdentity.getPsc() : -1, cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    public static /* synthetic */ int a(ScanResult scanResult, ScanResult scanResult2) {
        return Integer.compare(scanResult2.level, scanResult.level);
    }
}

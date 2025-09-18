package com.p018my.tracker.obfuscated;

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
import com.p018my.tracker.obfuscated.C2305d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.AbstractC7457Ct1;
import p000.C0295Eg;

/* renamed from: com.my.tracker.obfuscated.e0 */
/* loaded from: classes2.dex */
public final class C2309e0 {

    /* renamed from: a */
    private static final C2305d0.k f19888a = new C2305d0.k(null, Collections.emptyList());

    /* renamed from: b */
    public static int f19889b = 5;

    /* renamed from: a */
    private List m12888a(Context context) {
        C2305d0.h hVarM12886a;
        C2305d0.b bVarM12881a;
        if (Build.VERSION.SDK_INT >= 29 ? AbstractC2346n1.m13340a("android.permission.ACCESS_FINE_LOCATION", context) : AbstractC2346n1.m13340a("android.permission.ACCESS_COARSE_LOCATION", context)) {
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
                                bVarM12881a = m12881a((CellInfoCdma) cellInfo);
                            } else if (cellInfo instanceof CellInfoGsm) {
                                bVarM12881a = m12882a((CellInfoGsm) cellInfo);
                            } else if (cellInfo instanceof CellInfoLte) {
                                bVarM12881a = m12883a((CellInfoLte) cellInfo);
                            } else if (cellInfo instanceof CellInfoWcdma) {
                                bVarM12881a = m12887a((CellInfoWcdma) cellInfo);
                            } else {
                                int i = Build.VERSION.SDK_INT;
                                if (i >= 29 && AbstractC7457Ct1.m1451k(cellInfo)) {
                                    bVarM12881a = m12885a(AbstractC7457Ct1.m1446f(cellInfo));
                                } else if (i >= 29 && AbstractC7457Ct1.m1454n(cellInfo)) {
                                    bVarM12881a = m12884a(AbstractC7457Ct1.m1445e(cellInfo));
                                }
                            }
                            arrayList.add(bVarM12881a);
                        }
                    }
                    if (arrayList.isEmpty() && (hVarM12886a = m12886a(telephonyManager)) != null) {
                        arrayList.add(hVarM12886a);
                    }
                    return arrayList;
                }
                return Collections.emptyList();
            } catch (Throwable th) {
                AbstractC2391y2.m13569a("EnvironmentParamsDataProvider: exception during collecting c-info", th);
            }
        } else {
            AbstractC2391y2.m13568a("EnvironmentParamsDataProvider: can't access information");
        }
        return Collections.emptyList();
    }

    /* renamed from: c */
    private C2305d0.k m12890c(Context context) {
        C2305d0.j jVar;
        if (!AbstractC2346n1.m13340a("android.permission.ACCESS_WIFI_STATE", context)) {
            return f19888a;
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager != null && wifiManager.isWifiEnabled()) {
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                if (connectionInfo != null) {
                    String ssid = connectionInfo.getSSID();
                    String bssid = connectionInfo.getBSSID();
                    jVar = new C2305d0.j(ssid == null ? "<null>" : ssid, bssid == null ? "<null>" : bssid, connectionInfo.getRssi(), connectionInfo.getNetworkId(), connectionInfo.getLinkSpeed());
                } else {
                    jVar = null;
                }
                if (Build.VERSION.SDK_INT >= 24 && !AbstractC2346n1.m13340a("android.permission.ACCESS_FINE_LOCATION", context) && !AbstractC2346n1.m13340a("android.permission.ACCESS_COARSE_LOCATION", context)) {
                    return new C2305d0.k(jVar, Collections.emptyList());
                }
                List<ScanResult> scanResults = wifiManager.getScanResults();
                if (scanResults != null && !scanResults.isEmpty()) {
                    Collections.sort(scanResults, new C0295Eg(26));
                    int iMin = Math.min(scanResults.size(), f19889b);
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
                        arrayList.add(new C2305d0.a(str, str2, scanResult.level));
                    }
                    return new C2305d0.k(jVar, arrayList);
                }
                return new C2305d0.k(jVar, Collections.emptyList());
            }
            return f19888a;
        } catch (Throwable th) {
            AbstractC2391y2.m13569a("EnvironmentParamsDataProvider: exception during collecting w-info", th);
            return f19888a;
        }
    }

    /* renamed from: a */
    private C2305d0.c m12881a(CellInfoCdma cellInfoCdma) {
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        int networkId = cellIdentity.getNetworkId();
        int systemId = cellIdentity.getSystemId();
        int basestationId = cellIdentity.getBasestationId();
        int latitude = cellIdentity.getLatitude();
        int longitude = cellIdentity.getLongitude();
        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
        return new C2305d0.c(networkId, systemId, basestationId, latitude, longitude, cellSignalStrength.getCdmaLevel(), cellSignalStrength.getCdmaDbm(), cellSignalStrength.getCdmaEcio(), cellSignalStrength.getEvdoLevel(), cellSignalStrength.getEvdoDbm(), cellSignalStrength.getEvdoEcio(), cellSignalStrength.getEvdoSnr());
    }

    /* renamed from: b */
    public C2305d0 m12891b(Context context) {
        return new C2305d0(m12888a(context), m12890c(context));
    }

    /* renamed from: a */
    private C2305d0.d m12882a(CellInfoGsm cellInfoGsm) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        return new C2305d0.d(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), i >= 24 ? cellIdentity.getArfcn() : -1, i >= 24 ? cellIdentity.getBsic() : -1, cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), i >= 26 ? cellSignalStrength.getTimingAdvance() : -1);
    }

    /* renamed from: a */
    private C2305d0.e m12883a(CellInfoLte cellInfoLte) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        return new C2305d0.e(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCi(), cellIdentity.getTac(), i >= 24 ? cellIdentity.getEarfcn() : -1, i >= 24 ? cellIdentity.getPci() : -1, cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), i >= 26 ? cellSignalStrength.getTimingAdvance() : -1);
    }

    /* renamed from: a */
    private C2305d0.f m12884a(CellInfoNr cellInfoNr) {
        CellIdentityNr cellIdentityNrM1444d = AbstractC7457Ct1.m1444d(cellInfoNr.getCellIdentity());
        CellSignalStrengthNr cellSignalStrengthNrM1448h = AbstractC7457Ct1.m1448h(cellInfoNr.getCellSignalStrength());
        return new C2305d0.f(cellIdentityNrM1444d.getMccString(), cellIdentityNrM1444d.getMncString(), cellIdentityNrM1444d.getNci(), cellIdentityNrM1444d.getTac(), cellIdentityNrM1444d.getNrarfcn(), cellIdentityNrM1444d.getPci(), cellSignalStrengthNrM1448h.getLevel(), cellSignalStrengthNrM1448h.getDbm(), cellSignalStrengthNrM1448h.getAsuLevel());
    }

    /* renamed from: a */
    private C2305d0.g m12885a(CellInfoTdscdma cellInfoTdscdma) {
        CellIdentityTdscdma cellIdentity = cellInfoTdscdma.getCellIdentity();
        CellSignalStrengthTdscdma cellSignalStrength = cellInfoTdscdma.getCellSignalStrength();
        return new C2305d0.g(cellIdentity.getMccString(), cellIdentity.getMncString(), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getUarfcn(), cellIdentity.getCpid(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    /* renamed from: a */
    private C2305d0.h m12886a(TelephonyManager telephonyManager) {
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
                    AbstractC2391y2.m13568a("EnvironmentParamsDataProvider: unable to substring network operator " + networkOperator);
                    str = strSubstring2;
                    strSubstring2 = strSubstring;
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                    return new C2305d0.h(strSubstring2, str, gsmCellLocation.getCid(), gsmCellLocation.getLac());
                }
            } catch (Throwable unused2) {
                strSubstring = null;
            }
            str = strSubstring2;
            strSubstring2 = strSubstring;
        }
        GsmCellLocation gsmCellLocation2 = (GsmCellLocation) cellLocation;
        return new C2305d0.h(strSubstring2, str, gsmCellLocation2.getCid(), gsmCellLocation2.getLac());
    }

    /* renamed from: a */
    private C2305d0.i m12887a(CellInfoWcdma cellInfoWcdma) {
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        CellSignalStrengthWcdma cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        return new C2305d0.i(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), i >= 24 ? cellIdentity.getUarfcn() : -1, i >= 24 ? cellIdentity.getPsc() : -1, cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    /* renamed from: a */
    public static /* synthetic */ int m12880a(ScanResult scanResult, ScanResult scanResult2) {
        return Integer.compare(scanResult2.level, scanResult.level);
    }
}

package com.yandex.runtime.sensors.internal.telephony;

import android.telephony.TelephonyManager;
import com.yandex.runtime.Runtime;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class OperatorInfo implements Serializable {
    public static final int MCC_LENGTH = 3;
    private String mcc;
    private String mnc;

    public OperatorInfo(String str, String str2) {
        this.mcc = str;
        this.mnc = str2;
    }

    public static OperatorInfo getOperatorInfo() {
        String simOperator;
        TelephonyManager telephonyManager = (TelephonyManager) Runtime.getApplicationContext().getSystemService("phone");
        if (telephonyManager.getSimState() != 5 || (simOperator = telephonyManager.getSimOperator()) == null || simOperator.length() < 3) {
            return null;
        }
        return new OperatorInfo(simOperator.substring(0, 3), simOperator.substring(3));
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.mcc = archive.add(this.mcc, false);
        this.mnc = archive.add(this.mnc, false);
    }
}

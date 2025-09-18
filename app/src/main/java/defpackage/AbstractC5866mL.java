package defpackage;

import android.media.MediaCodecInfo;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;

/* renamed from: mL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5866mL {
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint f() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint g(int i, int i2, int i3) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, i3);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint h(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* bridge */ /* synthetic */ CellSignalStrengthNr j(Object obj) {
        return (CellSignalStrengthNr) obj;
    }

    public static /* bridge */ /* synthetic */ CellSignalStrengthTdscdma k(Object obj) {
        return (CellSignalStrengthTdscdma) obj;
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return CellSignalStrengthNr.class;
    }

    public static /* synthetic */ void p() {
    }

    public static /* bridge */ /* synthetic */ Class w() {
        return CellSignalStrengthTdscdma.class;
    }
}
